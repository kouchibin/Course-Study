package lab1;
import lab1.Absyn.*;
/** BNFC-Generated Abstract Visitor */
public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
/* Program */
    public R visit(lab1.Absyn.PDefs p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(lab1.Absyn.Program p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Def */
    public R visit(lab1.Absyn.DFun p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.DQua p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.DStm p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(lab1.Absyn.Def p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Rest */
    public R visit(lab1.Absyn.RStm p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.REnd p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(lab1.Absyn.Rest p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Arg */
    public R visit(lab1.Absyn.ADecl p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(lab1.Absyn.Arg p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ARest */
    public R visit(lab1.Absyn.AId p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.AEmp p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(lab1.Absyn.ARest p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ARRest */
    public R visit(lab1.Absyn.ARInit p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.AREmp p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(lab1.Absyn.ARRest p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Stm */
    public R visit(lab1.Absyn.SExp p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.STypedef p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.SDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.SDecls p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.SInit p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.SReturn p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.SWhile p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.SBlock p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.SIf p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(lab1.Absyn.Stm p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* IRest */
    public R visit(lab1.Absyn.SElse p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.SEmp p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(lab1.Absyn.IRest p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Exp */
    public R visit(lab1.Absyn.EInt p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EDouble p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EString p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EChar p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EQua p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.ECall p, A arg) { return visitDefault(p, arg); }

    public R visit(lab1.Absyn.EIndex p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EDotProj p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EArwProj p, A arg) { return visitDefault(p, arg); }

    public R visit(lab1.Absyn.ERIncr p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.ERDecr p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EDeref p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.ENeg p, A arg) { return visitDefault(p, arg); }

    public R visit(lab1.Absyn.EMul p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EDiv p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EMod p, A arg) { return visitDefault(p, arg); }

    public R visit(lab1.Absyn.EAdd p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.ESub p, A arg) { return visitDefault(p, arg); }

    public R visit(lab1.Absyn.ELShift p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.ERShift p, A arg) { return visitDefault(p, arg); }

    public R visit(lab1.Absyn.ELess p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.ELeq p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EGrea p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EGeq p, A arg) { return visitDefault(p, arg); }

    public R visit(lab1.Absyn.EEqual p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.ENEqual p, A arg) { return visitDefault(p, arg); }

    public R visit(lab1.Absyn.EConj p, A arg) { return visitDefault(p, arg); }

    public R visit(lab1.Absyn.EDisj p, A arg) { return visitDefault(p, arg); }

    public R visit(lab1.Absyn.EAss p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.EAddAss p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.ESubAss p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.ECond p, A arg) { return visitDefault(p, arg); }

    public R visit(lab1.Absyn.EThrow p, A arg) { return visitDefault(p, arg); }





    public R visitDefault(lab1.Absyn.Exp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Type */
    public R visit(lab1.Absyn.Tbool p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.Tdouble p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.Tint p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.Tchar p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.Tvoid p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.TConst p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.TRef p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.TDRef p, A arg) { return visitDefault(p, arg); }
    public R visit(lab1.Absyn.TQual p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(lab1.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
