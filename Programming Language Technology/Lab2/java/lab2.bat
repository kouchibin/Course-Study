@echo off
set dir=%~dp0
java -cp "%dir%;%CLASSPATH%" lab2 %*
REM C:\java-lib\java-cup-11b.jar":"C:\java-lib\java-cup-11b-runtime.jar":"C:\java-lib\javatools.jar" lab2 %*
