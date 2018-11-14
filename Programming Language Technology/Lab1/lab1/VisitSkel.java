package lab1;
import lab1.Absyn.*;
/*** BNFC-Generated Visitor Design Pattern Skeleton. ***/
/* This implements the common visitor design pattern.
   Tests show it to be slightly less efficient than the
   instanceof method, but easier to use. 
   Replace the R and A parameters with the desired return
   and context types.*/

public class VisitSkel
{
  public class ProgramVisitor<R,A> implements Program.Visitor<R,A>
  {
    public R visit(lab1.Absyn.PDefs p, A arg)
    { /* Code For PDefs Goes Here */
      for (Def x: p.listdef_)
      { /* ... */ }
      return null;
    }
  }
  public class DefVisitor<R,A> implements Def.Visitor<R,A>
  {
    public R visit(lab1.Absyn.DFun p, A arg)
    { /* Code For DFun Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.id_;
      for (Arg x: p.listarg_)
      { /* ... */ }
      p.rest_.accept(new RestVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.DQua p, A arg)
    { /* Code For DQua Goes Here */
      for (String x: p.listid_)
      { /* ... */ }
      return null;
    }    public R visit(lab1.Absyn.DStm p, A arg)
    { /* Code For DStm Goes Here */
      p.stm_.accept(new StmVisitor<R,A>(), arg);
      return null;
    }
  }
  public class RestVisitor<R,A> implements Rest.Visitor<R,A>
  {
    public R visit(lab1.Absyn.RStm p, A arg)
    { /* Code For RStm Goes Here */
      for (Stm x: p.liststm_)
      { /* ... */ }
      return null;
    }    public R visit(lab1.Absyn.REnd p, A arg)
    { /* Code For REnd Goes Here */
      return null;
    }
  }
  public class ArgVisitor<R,A> implements Arg.Visitor<R,A>
  {
    public R visit(lab1.Absyn.ADecl p, A arg)
    { /* Code For ADecl Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      p.arest_.accept(new ARestVisitor<R,A>(), arg);
      return null;
    }
  }
  public class ARestVisitor<R,A> implements ARest.Visitor<R,A>
  {
    public R visit(lab1.Absyn.AId p, A arg)
    { /* Code For AId Goes Here */
      //p.id_;
      p.arrest_.accept(new ARRestVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.AEmp p, A arg)
    { /* Code For AEmp Goes Here */
      return null;
    }
  }
  public class ARRestVisitor<R,A> implements ARRest.Visitor<R,A>
  {
    public R visit(lab1.Absyn.ARInit p, A arg)
    { /* Code For ARInit Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.AREmp p, A arg)
    { /* Code For AREmp Goes Here */
      return null;
    }
  }
  public class StmVisitor<R,A> implements Stm.Visitor<R,A>
  {
    public R visit(lab1.Absyn.SExp p, A arg)
    { /* Code For SExp Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.STypedef p, A arg)
    { /* Code For STypedef Goes Here */
      for (String x: p.listid_)
      { /* ... */ }
      //p.id_;
      return null;
    }    public R visit(lab1.Absyn.SDecl p, A arg)
    { /* Code For SDecl Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.id_;
      return null;
    }    public R visit(lab1.Absyn.SDecls p, A arg)
    { /* Code For SDecls Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.id_;
      for (String x: p.listid_)
      { /* ... */ }
      return null;
    }    public R visit(lab1.Absyn.SInit p, A arg)
    { /* Code For SInit Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.id_;
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.SReturn p, A arg)
    { /* Code For SReturn Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.SWhile p, A arg)
    { /* Code For SWhile Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      p.stm_.accept(new StmVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.SBlock p, A arg)
    { /* Code For SBlock Goes Here */
      for (Stm x: p.liststm_)
      { /* ... */ }
      return null;
    }    public R visit(lab1.Absyn.SIf p, A arg)
    { /* Code For SIf Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      p.stm_.accept(new StmVisitor<R,A>(), arg);
      p.irest_.accept(new IRestVisitor<R,A>(), arg);
      return null;
    }
  }
  public class IRestVisitor<R,A> implements IRest.Visitor<R,A>
  {
    public R visit(lab1.Absyn.SElse p, A arg)
    { /* Code For SElse Goes Here */
      p.stm_.accept(new StmVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.SEmp p, A arg)
    { /* Code For SEmp Goes Here */
      return null;
    }
  }
  public class ExpVisitor<R,A> implements Exp.Visitor<R,A>
  {
    public R visit(lab1.Absyn.EInt p, A arg)
    { /* Code For EInt Goes Here */
      //p.integer_;
      return null;
    }    public R visit(lab1.Absyn.EDouble p, A arg)
    { /* Code For EDouble Goes Here */
      //p.double_;
      return null;
    }    public R visit(lab1.Absyn.EString p, A arg)
    { /* Code For EString Goes Here */
      for (String x: p.liststring_)
      { /* ... */ }
      return null;
    }    public R visit(lab1.Absyn.EChar p, A arg)
    { /* Code For EChar Goes Here */
      //p.char_;
      return null;
    }    public R visit(lab1.Absyn.EQua p, A arg)
    { /* Code For EQua Goes Here */
      for (String x: p.listid_)
      { /* ... */ }
      return null;
    }    public R visit(lab1.Absyn.ECall p, A arg)
    { /* Code For ECall Goes Here */
      //p.id_;
      for (Exp x: p.listexp_)
      { /* ... */ }
      return null;
    }        public R visit(lab1.Absyn.EIndex p, A arg)
    { /* Code For EIndex Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.EDotProj p, A arg)
    { /* Code For EDotProj Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.EArwProj p, A arg)
    { /* Code For EArwProj Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(lab1.Absyn.ERIncr p, A arg)
    { /* Code For ERIncr Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.ERDecr p, A arg)
    { /* Code For ERDecr Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.EDeref p, A arg)
    { /* Code For EDeref Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.ENeg p, A arg)
    { /* Code For ENeg Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(lab1.Absyn.EMul p, A arg)
    { /* Code For EMul Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.EDiv p, A arg)
    { /* Code For EDiv Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.EMod p, A arg)
    { /* Code For EMod Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(lab1.Absyn.EAdd p, A arg)
    { /* Code For EAdd Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.ESub p, A arg)
    { /* Code For ESub Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(lab1.Absyn.ELShift p, A arg)
    { /* Code For ELShift Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.ERShift p, A arg)
    { /* Code For ERShift Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(lab1.Absyn.ELess p, A arg)
    { /* Code For ELess Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.ELeq p, A arg)
    { /* Code For ELeq Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.EGrea p, A arg)
    { /* Code For EGrea Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.EGeq p, A arg)
    { /* Code For EGeq Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(lab1.Absyn.EEqual p, A arg)
    { /* Code For EEqual Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.ENEqual p, A arg)
    { /* Code For ENEqual Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(lab1.Absyn.EConj p, A arg)
    { /* Code For EConj Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(lab1.Absyn.EDisj p, A arg)
    { /* Code For EDisj Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(lab1.Absyn.EAss p, A arg)
    { /* Code For EAss Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.EAddAss p, A arg)
    { /* Code For EAddAss Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.ESubAss p, A arg)
    { /* Code For ESubAss Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.ECond p, A arg)
    { /* Code For ECond Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      p.exp_3.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(lab1.Absyn.EThrow p, A arg)
    { /* Code For EThrow Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }                    
  }
  public class TypeVisitor<R,A> implements Type.Visitor<R,A>
  {
    public R visit(lab1.Absyn.Tbool p, A arg)
    { /* Code For Tbool Goes Here */
      return null;
    }    public R visit(lab1.Absyn.Tdouble p, A arg)
    { /* Code For Tdouble Goes Here */
      return null;
    }    public R visit(lab1.Absyn.Tint p, A arg)
    { /* Code For Tint Goes Here */
      return null;
    }    public R visit(lab1.Absyn.Tchar p, A arg)
    { /* Code For Tchar Goes Here */
      return null;
    }    public R visit(lab1.Absyn.Tvoid p, A arg)
    { /* Code For Tvoid Goes Here */
      return null;
    }    public R visit(lab1.Absyn.TConst p, A arg)
    { /* Code For TConst Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.TRef p, A arg)
    { /* Code For TRef Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.TDRef p, A arg)
    { /* Code For TDRef Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      return null;
    }    public R visit(lab1.Absyn.TQual p, A arg)
    { /* Code For TQual Goes Here */
      for (String x: p.listid_)
      { /* ... */ }
      return null;
    }
  }
}