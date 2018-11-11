/* Tests cetegorical mutual exclusion with different numbers of threads.
 * Automatic checks only catch severe problems like crashes.
 */
#include <stdio.h>
#include "tests/threads/tests.h"
#include "threads/malloc.h"
#include "threads/synch.h"
#include "devices/timer.h"
#include "lib/random.h" //generate random numbers
#include "timer.h"

#define NAME_LENGTH 16
#define BUS_CAPACITY 3
#define SENDER 0
#define RECEIVER 1
#define NORMAL 0
#define HIGH 1

int id = 0;                     /* Unique ID for every thread. */
int occupied_slot = 0;          /* Number of slots that are occupied. */
int cur_direction = SENDER;     /* Current transmitting direction of the bus. */
int sn, rn,                     /* Number of Normal priority sender and receiver waiting. */
    vsn, vrn;                   /* Number of High priority (VIP) sender and receiver waiting. */
struct lock lock;               /* Monitor Lock. */
struct condition R;             /* Condition variable for Normal Reader. */
struct condition VR;            /* Condition variable for VIP Reader. */
struct condition S;             /* Condition variable for Normal Sender. */
struct condition VS;            /* Condition variable for VIP Sender. */

/*
 *	initialize task with direction and priority
 *	call o
 * */
typedef struct
{
    int direction;
    int priority;
} task_t;

void batchScheduler(unsigned int num_tasks_send, unsigned int num_task_receive,
                    unsigned int num_priority_send, unsigned int num_priority_receive);

void senderTask(void *);
void receiverTask(void *);
void senderPriorityTask(void *);
void receiverPriorityTask(void *);

void oneTask(task_t task);      /*Task requires to use the bus and executes methods below*/
void getSlot(task_t task);      /* task tries to use slot on the bus */
void transferData(task_t task); /* task processes data on the bus either sending or receiving based on the direction*/
void leaveSlot(task_t task);    /* task release the slot */
void init_bus(void);

/* initializes semaphores */
void init_bus(void)
{

    random_init((unsigned int)123456789);

    lock_init(&lock);
    cond_init(&R);
    cond_init(&S);
    cond_init(&VR);
    cond_init(&VS);
}

/*
 *  Creates a memory bus sub-system  with num_tasks_send + num_priority_send
 *  sending data to the accelerator and num_task_receive + num_priority_receive tasks
 *  reading data/results from the accelerator.
 *
 *  Every task is represented by its own thread. 
 *  Task requires and gets slot on bus system (1)
 *  process data and the bus (2)
 *  Leave the bus (3).
 */

void batchScheduler(unsigned int num_tasks_send, unsigned int num_task_receive,
                    unsigned int num_priority_send, unsigned int num_priority_receive)
{
    unsigned i;
    char name[NAME_LENGTH];
    for (i = 0; i < num_tasks_send; i++)
    {
        snprintf(name, NAME_LENGTH, "Sender %d", id++);
        thread_create(name, PRI_DEFAULT, senderTask, NULL);
    }

    for (i = 0; i < num_task_receive; i++)
    {
        snprintf(name, NAME_LENGTH, "Receiver %d", id++);
        thread_create(name, PRI_DEFAULT, receiverTask, NULL);
    }
    for (i = 0; i < num_priority_send; i++)
    {
        snprintf(name, NAME_LENGTH, "VIP Sender %d", id++);
        thread_create(name, PRI_DEFAULT, senderPriorityTask, NULL);
    }
    for (i = 0; i < num_priority_receive; i++)
    {
        snprintf(name, NAME_LENGTH, "VIP Receiver %d", id++);
        thread_create(name, PRI_DEFAULT, receiverPriorityTask, NULL);
    }
}

/* Normal task,  sending data to the accelerator */
void senderTask(void *aux UNUSED)
{
    task_t task = {SENDER, NORMAL};
    oneTask(task);
}

/* High priority task, sending data to the accelerator */
void senderPriorityTask(void *aux UNUSED)
{
    task_t task = {SENDER, HIGH};
    oneTask(task);
}

/* Normal task, reading data from the accelerator */
void receiverTask(void *aux UNUSED)
{
    task_t task = {RECEIVER, NORMAL};
    oneTask(task);
}

/* High priority task, reading data from the accelerator */
void receiverPriorityTask(void *aux UNUSED)
{
    task_t task = {RECEIVER, HIGH};
    oneTask(task);
}

/* abstract task execution*/
void oneTask(task_t task)
{
    getSlot(task);
    transferData(task);
    leaveSlot(task);
}

/* task tries to get slot on the bus subsystem */
void getSlot(task_t task)
{
    lock_acquire(&lock);

    /* Bus is full or someone with different direction on the bus.
     * Need to wait on the right condition variable.
     */
    while (occupied_slot == BUS_CAPACITY ||
           (occupied_slot != 0 && task.direction != cur_direction))
    {
        /* Always wake up the same direction task first, 
         * so as to reduce the overhead of changing directions. 
         */
        if (task.priority == HIGH)
        {
            if (task.direction == SENDER)
            {
                vsn++;
                cond_wait(&VS, &lock);
                vsn--;
            }
            else
            {
                vrn++;
                cond_wait(&VR, &lock);
                vrn--;
            }
        } else {
            if (task.direction == SENDER)
            {
                sn++;
                cond_wait(&S, &lock);
                sn--;
            }
            else
            {
                rn++;
                cond_wait(&R, &lock);
                rn--;
            }
        }
    }
    


    /* Already got a slot. 
     * If the task is the first one on the bus, and current direction is the opposite,
     * then correct cur_direction and wake up threads waiting in that direction.
     * If there are VIP waiting, wake up VIP first. Only wake up normal task when
     * there are no VIP (any direction) waiting.
     * This is how priority is implemented.
     */
    if (cur_direction != task.direction && occupied_slot == 0)
    {
        cur_direction = task.direction;
        if (cur_direction == SENDER)
        {
            if (vsn)
                cond_broadcast(&VS, &lock);
            else if (!vrn)
                cond_broadcast(&S, &lock);
        } else {
            if (vrn)
                cond_broadcast(&VR, &lock);
            else if (!vsn)
                cond_broadcast(&R, &lock);
        }
    }

    occupied_slot++;
    
    lock_release(&lock);
}


/* task processes data on the bus send/receive */
void transferData(task_t task)
{
    ASSERT(occupied_slot <= 3);

    char *action;
    action = (task.direction == SENDER) ? "sending" : "receiving";

    /* Doing something important. */
    timer_msleep((random_ulong() % 5));

}


/* task releases the slot */
void leaveSlot(task_t task UNUSED)
{
    lock_acquire(&lock);

    occupied_slot--;

    if (occupied_slot == 0)
    {
        /* If I am the last one on the bus, and there are VIP waiting,
         * wake them up. Only wake up normal priority task when there 
         * are no VIP waiting.
         */
        if (vrn || vsn)
        {
            /* Always wake up the same direction task first, 
             * so as to reduce the overhead of changing directions. 
             */
            if (cur_direction == SENDER) {
                if (vsn)
                    cond_broadcast(&VS, &lock);
                else 
                    cond_broadcast(&VR, &lock);
            } else {
                if (vrn)
                    cond_broadcast(&VR, &lock);
                else 
                    cond_broadcast(&VS, &lock);
            }
            
        } else {
            if (cur_direction == SENDER) {
                if (sn)
                    cond_broadcast(&S, &lock);
                else 
                    cond_broadcast(&R, &lock);
            } else {
                if (rn)
                    cond_broadcast(&R, &lock);
                else 
                    cond_broadcast(&S, &lock);
            }
        }
    }
    else
    {
        /* If I am not the last one on the bus, wake up a same direction task. */
        if (cur_direction == SENDER)
        {
            if (vsn)
            {
                 cond_signal(&VS, &lock);
            }
            else if (!vrn)
            {
                cond_signal(&S, &lock);            
            }
        } else {
            if (vrn)
            {
                cond_signal(&VR, &lock);
            }
            else if (!vsn)
            {
                cond_signal(&R, &lock);
            }
        }
    }

    lock_release(&lock);
}
