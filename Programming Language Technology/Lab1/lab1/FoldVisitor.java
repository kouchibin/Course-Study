package lab1;

import lab1.Absyn.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/** BNFC-Generated Fold Visitor */
public abstract class FoldVisitor<R,A> implements AllVisitor<R,A> {
    public abstract R leaf(A arg);
    public abstract R combine(R x, R y, A arg);

/* Program */
    public R visit(lab1.Absyn.PDefs p, A arg) {
      R r = leaf(arg);
      for (Def x : p.listdef_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }

/* Def */
    public R visit(lab1.Absyn.DFun p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      for (Arg x : p.listarg_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      r = combine(p.rest_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.DQua p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.DStm p, A arg) {
      R r = leaf(arg);
      r = combine(p.stm_.accept(this, arg), r, arg);
      return r;
    }

/* Rest */
    public R visit(lab1.Absyn.RStm p, A arg) {
      R r = leaf(arg);
      for (Stm x : p.liststm_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(lab1.Absyn.REnd p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Arg */
    public R visit(lab1.Absyn.ADecl p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      r = combine(p.arest_.accept(this, arg), r, arg);
      return r;
    }

/* ARest */
    public R visit(lab1.Absyn.AId p, A arg) {
      R r = leaf(arg);
      r = combine(p.arrest_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.AEmp p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* ARRest */
    public R visit(lab1.Absyn.ARInit p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.AREmp p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Stm */
    public R visit(lab1.Absyn.SExp p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.STypedef p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.SDecl p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.SDecls p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.SInit p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.SReturn p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.SWhile p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      r = combine(p.stm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.SBlock p, A arg) {
      R r = leaf(arg);
      for (Stm x : p.liststm_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(lab1.Absyn.SIf p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      r = combine(p.stm_.accept(this, arg), r, arg);
      r = combine(p.irest_.accept(this, arg), r, arg);
      return r;
    }

/* IRest */
    public R visit(lab1.Absyn.SElse p, A arg) {
      R r = leaf(arg);
      r = combine(p.stm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.SEmp p, A arg) {
      R r = leaf(arg);
      return r;
    }

/* Exp */
    public R visit(lab1.Absyn.EInt p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.EDouble p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.EString p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.EChar p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.EQua p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.ECall p, A arg) {
      R r = leaf(arg);
      for (Exp x : p.listexp_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(lab1.Absyn.EIndex p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EDotProj p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EArwProj p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.ERIncr p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.ERDecr p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EDeref p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.ENeg p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EMul p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EDiv p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EMod p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EAdd p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.ESub p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.ELShift p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.ERShift p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.ELess p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.ELeq p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EGrea p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EGeq p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EEqual p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.ENEqual p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EConj p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EDisj p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EAss p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EAddAss p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.ESubAss p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.ECond p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      r = combine(p.exp_3.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.EThrow p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }

/* Type */
    public R visit(lab1.Absyn.Tbool p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.Tdouble p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.Tint p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.Tchar p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.Tvoid p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(lab1.Absyn.TConst p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.TRef p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.TDRef p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(lab1.Absyn.TQual p, A arg) {
      R r = leaf(arg);
      return r;
    }


}
