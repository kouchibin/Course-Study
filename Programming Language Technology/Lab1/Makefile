JAVAC=javac
JAVAC_FLAGS=-sourcepath .
JAVA=java
JAVA_FLAGS=
CUP=java_cup.Main
CUPFLAGS=-nopositions -expect 100
JLEX=JLex.Main
all: test

test: absyn lab1\Yylex.class lab1\PrettyPrinter.class lab1\Test.class lab1\ComposVisitor.class lab1\AbstractVisitor.class lab1\FoldVisitor.class lab1\AllVisitor.class lab1\parser.class lab1\sym.class lab1\Test.class

.PHONY: absyn

%.class: %.java
	${JAVAC} ${JAVAC_FLAGS} $^

absyn: lab1\Absyn\Program.java lab1\Absyn\PDefs.java lab1\Absyn\ListDef.java lab1\Absyn\Def.java lab1\Absyn\DFun.java lab1\Absyn\DQua.java lab1\Absyn\DStm.java lab1\Absyn\Rest.java lab1\Absyn\RStm.java lab1\Absyn\REnd.java lab1\Absyn\ListId.java lab1\Absyn\ListArg.java lab1\Absyn\ListStm.java lab1\Absyn\Arg.java lab1\Absyn\ADecl.java lab1\Absyn\ARest.java lab1\Absyn\AId.java lab1\Absyn\AEmp.java lab1\Absyn\ARRest.java lab1\Absyn\ARInit.java lab1\Absyn\AREmp.java lab1\Absyn\Stm.java lab1\Absyn\SExp.java lab1\Absyn\STypedef.java lab1\Absyn\SDecl.java lab1\Absyn\SDecls.java lab1\Absyn\SInit.java lab1\Absyn\SReturn.java lab1\Absyn\SWhile.java lab1\Absyn\SBlock.java lab1\Absyn\SIf.java lab1\Absyn\IRest.java lab1\Absyn\SElse.java lab1\Absyn\SEmp.java lab1\Absyn\Exp.java lab1\Absyn\EInt.java lab1\Absyn\EDouble.java lab1\Absyn\EString.java lab1\Absyn\EChar.java lab1\Absyn\EQua.java lab1\Absyn\ECall.java lab1\Absyn\EIndex.java lab1\Absyn\EDotProj.java lab1\Absyn\EArwProj.java lab1\Absyn\ERIncr.java lab1\Absyn\ERDecr.java lab1\Absyn\EDeref.java lab1\Absyn\ENeg.java lab1\Absyn\EMul.java lab1\Absyn\EDiv.java lab1\Absyn\EMod.java lab1\Absyn\EAdd.java lab1\Absyn\ESub.java lab1\Absyn\ELShift.java lab1\Absyn\ERShift.java lab1\Absyn\ELess.java lab1\Absyn\ELeq.java lab1\Absyn\EGrea.java lab1\Absyn\EGeq.java lab1\Absyn\EEqual.java lab1\Absyn\ENEqual.java lab1\Absyn\EConj.java lab1\Absyn\EDisj.java lab1\Absyn\EAss.java lab1\Absyn\EAddAss.java lab1\Absyn\ESubAss.java lab1\Absyn\ECond.java lab1\Absyn\EThrow.java lab1\Absyn\ListString.java lab1\Absyn\ListExp.java lab1\Absyn\Type.java lab1\Absyn\Tbool.java lab1\Absyn\Tdouble.java lab1\Absyn\Tint.java lab1\Absyn\Tchar.java lab1\Absyn\Tvoid.java lab1\Absyn\TConst.java lab1\Absyn\TRef.java lab1\Absyn\TDRef.java lab1\Absyn\TQual.java
	${JAVAC} ${JAVAC_FLAGS} $^

lab1\Yylex.java: lab1\Yylex
	${JAVA} ${JAVA_FLAGS} ${JLEX} lab1\Yylex

lab1\sym.java lab1\parser.java: lab1\lab1.cup
	${JAVA} ${JAVA_FLAGS} ${CUP} ${CUPFLAGS} lab1\lab1.cup
	mv sym.java parser.java lab1\

lab1\Yylex.class: lab1\Yylex.java lab1\sym.java

lab1\sym.class: lab1\sym.java

lab1\parser.class: lab1\parser.java lab1\sym.java

lab1\PrettyPrinter.class: lab1\PrettyPrinter.java

clean:
	rm -f lab1\Absyn\*.class lab1\*.class

distclean: vclean

vclean:
	 rm -f lab1\Absyn\Program.java lab1\Absyn\PDefs.java lab1\Absyn\ListDef.java lab1\Absyn\Def.java lab1\Absyn\DFun.java lab1\Absyn\DQua.java lab1\Absyn\DStm.java lab1\Absyn\Rest.java lab1\Absyn\RStm.java lab1\Absyn\REnd.java lab1\Absyn\ListId.java lab1\Absyn\ListArg.java lab1\Absyn\ListStm.java lab1\Absyn\Arg.java lab1\Absyn\ADecl.java lab1\Absyn\ARest.java lab1\Absyn\AId.java lab1\Absyn\AEmp.java lab1\Absyn\ARRest.java lab1\Absyn\ARInit.java lab1\Absyn\AREmp.java lab1\Absyn\Stm.java lab1\Absyn\SExp.java lab1\Absyn\STypedef.java lab1\Absyn\SDecl.java lab1\Absyn\SDecls.java lab1\Absyn\SInit.java lab1\Absyn\SReturn.java lab1\Absyn\SWhile.java lab1\Absyn\SBlock.java lab1\Absyn\SIf.java lab1\Absyn\IRest.java lab1\Absyn\SElse.java lab1\Absyn\SEmp.java lab1\Absyn\Exp.java lab1\Absyn\EInt.java lab1\Absyn\EDouble.java lab1\Absyn\EString.java lab1\Absyn\EChar.java lab1\Absyn\EQua.java lab1\Absyn\ECall.java lab1\Absyn\EIndex.java lab1\Absyn\EDotProj.java lab1\Absyn\EArwProj.java lab1\Absyn\ERIncr.java lab1\Absyn\ERDecr.java lab1\Absyn\EDeref.java lab1\Absyn\ENeg.java lab1\Absyn\EMul.java lab1\Absyn\EDiv.java lab1\Absyn\EMod.java lab1\Absyn\EAdd.java lab1\Absyn\ESub.java lab1\Absyn\ELShift.java lab1\Absyn\ERShift.java lab1\Absyn\ELess.java lab1\Absyn\ELeq.java lab1\Absyn\EGrea.java lab1\Absyn\EGeq.java lab1\Absyn\EEqual.java lab1\Absyn\ENEqual.java lab1\Absyn\EConj.java lab1\Absyn\EDisj.java lab1\Absyn\EAss.java lab1\Absyn\EAddAss.java lab1\Absyn\ESubAss.java lab1\Absyn\ECond.java lab1\Absyn\EThrow.java lab1\Absyn\ListString.java lab1\Absyn\ListExp.java lab1\Absyn\Type.java lab1\Absyn\Tbool.java lab1\Absyn\Tdouble.java lab1\Absyn\Tint.java lab1\Absyn\Tchar.java lab1\Absyn\Tvoid.java lab1\Absyn\TConst.java lab1\Absyn\TRef.java lab1\Absyn\TDRef.java lab1\Absyn\TQual.java lab1\Absyn\Program.class lab1\Absyn\PDefs.class lab1\Absyn\ListDef.class lab1\Absyn\Def.class lab1\Absyn\DFun.class lab1\Absyn\DQua.class lab1\Absyn\DStm.class lab1\Absyn\Rest.class lab1\Absyn\RStm.class lab1\Absyn\REnd.class lab1\Absyn\ListId.class lab1\Absyn\ListArg.class lab1\Absyn\ListStm.class lab1\Absyn\Arg.class lab1\Absyn\ADecl.class lab1\Absyn\ARest.class lab1\Absyn\AId.class lab1\Absyn\AEmp.class lab1\Absyn\ARRest.class lab1\Absyn\ARInit.class lab1\Absyn\AREmp.class lab1\Absyn\Stm.class lab1\Absyn\SExp.class lab1\Absyn\STypedef.class lab1\Absyn\SDecl.class lab1\Absyn\SDecls.class lab1\Absyn\SInit.class lab1\Absyn\SReturn.class lab1\Absyn\SWhile.class lab1\Absyn\SBlock.class lab1\Absyn\SIf.class lab1\Absyn\IRest.class lab1\Absyn\SElse.class lab1\Absyn\SEmp.class lab1\Absyn\Exp.class lab1\Absyn\EInt.class lab1\Absyn\EDouble.class lab1\Absyn\EString.class lab1\Absyn\EChar.class lab1\Absyn\EQua.class lab1\Absyn\ECall.class lab1\Absyn\EIndex.class lab1\Absyn\EDotProj.class lab1\Absyn\EArwProj.class lab1\Absyn\ERIncr.class lab1\Absyn\ERDecr.class lab1\Absyn\EDeref.class lab1\Absyn\ENeg.class lab1\Absyn\EMul.class lab1\Absyn\EDiv.class lab1\Absyn\EMod.class lab1\Absyn\EAdd.class lab1\Absyn\ESub.class lab1\Absyn\ELShift.class lab1\Absyn\ERShift.class lab1\Absyn\ELess.class lab1\Absyn\ELeq.class lab1\Absyn\EGrea.class lab1\Absyn\EGeq.class lab1\Absyn\EEqual.class lab1\Absyn\ENEqual.class lab1\Absyn\EConj.class lab1\Absyn\EDisj.class lab1\Absyn\EAss.class lab1\Absyn\EAddAss.class lab1\Absyn\ESubAss.class lab1\Absyn\ECond.class lab1\Absyn\EThrow.class lab1\Absyn\ListString.class lab1\Absyn\ListExp.class lab1\Absyn\Type.class lab1\Absyn\Tbool.class lab1\Absyn\Tdouble.class lab1\Absyn\Tint.class lab1\Absyn\Tchar.class lab1\Absyn\Tvoid.class lab1\Absyn\TConst.class lab1\Absyn\TRef.class lab1\Absyn\TDRef.class lab1\Absyn\TQual.class
	 rm -f lab1\Absyn\*.class
	 rmdir lab1\Absyn\
	 rm -f lab1\Yylex lab1\lab1.cup lab1\Yylex.java lab1\VisitSkel.java lab1\ComposVisitor.java lab1\AbstractVisitor.java lab1\FoldVisitor.java lab1\AllVisitor.java lab1\PrettyPrinter.java lab1\Skeleton.java lab1\Test.java lab1\sym.java lab1\parser.java lab1\*.class
	rm -f Makefile
	rmdir -p lab1\

