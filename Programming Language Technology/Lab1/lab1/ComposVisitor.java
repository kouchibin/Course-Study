package lab1;
import lab1.Absyn.*;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
  lab1.Absyn.Program.Visitor<lab1.Absyn.Program,A>,
  lab1.Absyn.Def.Visitor<lab1.Absyn.Def,A>,
  lab1.Absyn.Rest.Visitor<lab1.Absyn.Rest,A>,
  lab1.Absyn.Arg.Visitor<lab1.Absyn.Arg,A>,
  lab1.Absyn.ARest.Visitor<lab1.Absyn.ARest,A>,
  lab1.Absyn.ARRest.Visitor<lab1.Absyn.ARRest,A>,
  lab1.Absyn.Stm.Visitor<lab1.Absyn.Stm,A>,
  lab1.Absyn.IRest.Visitor<lab1.Absyn.IRest,A>,
  lab1.Absyn.Exp.Visitor<lab1.Absyn.Exp,A>,
  lab1.Absyn.Type.Visitor<lab1.Absyn.Type,A>
{
/* Program */
    public Program visit(lab1.Absyn.PDefs p, A arg)
    {
      ListDef listdef_ = new ListDef();
      for (Def x : p.listdef_)
      {
        listdef_.add(x.accept(this,arg));
      }
      return new lab1.Absyn.PDefs(listdef_);
    }
/* Def */
    public Def visit(lab1.Absyn.DFun p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      ListArg listarg_ = new ListArg();
      for (Arg x : p.listarg_)
      {
        listarg_.add(x.accept(this,arg));
      }
      Rest rest_ = p.rest_.accept(this, arg);
      return new lab1.Absyn.DFun(type_, id_, listarg_, rest_);
    }    public Def visit(lab1.Absyn.DQua p, A arg)
    {
      ListId listid_ = p.listid_;
      return new lab1.Absyn.DQua(listid_);
    }    public Def visit(lab1.Absyn.DStm p, A arg)
    {
      Stm stm_ = p.stm_.accept(this, arg);
      return new lab1.Absyn.DStm(stm_);
    }
/* Rest */
    public Rest visit(lab1.Absyn.RStm p, A arg)
    {
      ListStm liststm_ = new ListStm();
      for (Stm x : p.liststm_)
      {
        liststm_.add(x.accept(this,arg));
      }
      return new lab1.Absyn.RStm(liststm_);
    }    public Rest visit(lab1.Absyn.REnd p, A arg)
    {
      return new lab1.Absyn.REnd();
    }
/* Arg */
    public Arg visit(lab1.Absyn.ADecl p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      ARest arest_ = p.arest_.accept(this, arg);
      return new lab1.Absyn.ADecl(type_, arest_);
    }
/* ARest */
    public ARest visit(lab1.Absyn.AId p, A arg)
    {
      String id_ = p.id_;
      ARRest arrest_ = p.arrest_.accept(this, arg);
      return new lab1.Absyn.AId(id_, arrest_);
    }    public ARest visit(lab1.Absyn.AEmp p, A arg)
    {
      return new lab1.Absyn.AEmp();
    }
/* ARRest */
    public ARRest visit(lab1.Absyn.ARInit p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new lab1.Absyn.ARInit(exp_);
    }    public ARRest visit(lab1.Absyn.AREmp p, A arg)
    {
      return new lab1.Absyn.AREmp();
    }
/* Stm */
    public Stm visit(lab1.Absyn.SExp p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new lab1.Absyn.SExp(exp_);
    }    public Stm visit(lab1.Absyn.STypedef p, A arg)
    {
      ListId listid_ = p.listid_;
      String id_ = p.id_;
      return new lab1.Absyn.STypedef(listid_, id_);
    }    public Stm visit(lab1.Absyn.SDecl p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      return new lab1.Absyn.SDecl(type_, id_);
    }    public Stm visit(lab1.Absyn.SDecls p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      ListId listid_ = p.listid_;
      return new lab1.Absyn.SDecls(type_, id_, listid_);
    }    public Stm visit(lab1.Absyn.SInit p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      Exp exp_ = p.exp_.accept(this, arg);
      return new lab1.Absyn.SInit(type_, id_, exp_);
    }    public Stm visit(lab1.Absyn.SReturn p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new lab1.Absyn.SReturn(exp_);
    }    public Stm visit(lab1.Absyn.SWhile p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      Stm stm_ = p.stm_.accept(this, arg);
      return new lab1.Absyn.SWhile(exp_, stm_);
    }    public Stm visit(lab1.Absyn.SBlock p, A arg)
    {
      ListStm liststm_ = new ListStm();
      for (Stm x : p.liststm_)
      {
        liststm_.add(x.accept(this,arg));
      }
      return new lab1.Absyn.SBlock(liststm_);
    }    public Stm visit(lab1.Absyn.SIf p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      Stm stm_ = p.stm_.accept(this, arg);
      IRest irest_ = p.irest_.accept(this, arg);
      return new lab1.Absyn.SIf(exp_, stm_, irest_);
    }
/* IRest */
    public IRest visit(lab1.Absyn.SElse p, A arg)
    {
      Stm stm_ = p.stm_.accept(this, arg);
      return new lab1.Absyn.SElse(stm_);
    }    public IRest visit(lab1.Absyn.SEmp p, A arg)
    {
      return new lab1.Absyn.SEmp();
    }
/* Exp */
    public Exp visit(lab1.Absyn.EInt p, A arg)
    {
      Integer integer_ = p.integer_;
      return new lab1.Absyn.EInt(integer_);
    }    public Exp visit(lab1.Absyn.EDouble p, A arg)
    {
      Double double_ = p.double_;
      return new lab1.Absyn.EDouble(double_);
    }    public Exp visit(lab1.Absyn.EString p, A arg)
    {
      ListString liststring_ = p.liststring_;
      return new lab1.Absyn.EString(liststring_);
    }    public Exp visit(lab1.Absyn.EChar p, A arg)
    {
      Character char_ = p.char_;
      return new lab1.Absyn.EChar(char_);
    }    public Exp visit(lab1.Absyn.EQua p, A arg)
    {
      ListId listid_ = p.listid_;
      return new lab1.Absyn.EQua(listid_);
    }    public Exp visit(lab1.Absyn.ECall p, A arg)
    {
      String id_ = p.id_;
      ListExp listexp_ = new ListExp();
      for (Exp x : p.listexp_)
      {
        listexp_.add(x.accept(this,arg));
      }
      return new lab1.Absyn.ECall(id_, listexp_);
    }    public Exp visit(lab1.Absyn.EIndex p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EIndex(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EDotProj p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EDotProj(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EArwProj p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EArwProj(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.ERIncr p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new lab1.Absyn.ERIncr(exp_);
    }    public Exp visit(lab1.Absyn.ERDecr p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new lab1.Absyn.ERDecr(exp_);
    }    public Exp visit(lab1.Absyn.EDeref p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new lab1.Absyn.EDeref(exp_);
    }    public Exp visit(lab1.Absyn.ENeg p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new lab1.Absyn.ENeg(exp_);
    }    public Exp visit(lab1.Absyn.EMul p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EMul(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EDiv p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EDiv(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EMod p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EMod(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EAdd p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EAdd(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.ESub p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.ESub(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.ELShift p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.ELShift(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.ERShift p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.ERShift(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.ELess p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.ELess(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.ELeq p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.ELeq(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EGrea p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EGrea(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EGeq p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EGeq(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EEqual p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EEqual(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.ENEqual p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.ENEqual(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EConj p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EConj(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EDisj p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EDisj(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EAss p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EAss(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.EAddAss p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.EAddAss(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.ESubAss p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new lab1.Absyn.ESubAss(exp_1, exp_2);
    }    public Exp visit(lab1.Absyn.ECond p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      Exp exp_3 = p.exp_3.accept(this, arg);
      return new lab1.Absyn.ECond(exp_1, exp_2, exp_3);
    }    public Exp visit(lab1.Absyn.EThrow p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new lab1.Absyn.EThrow(exp_);
    }
/* Type */
    public Type visit(lab1.Absyn.Tbool p, A arg)
    {
      return new lab1.Absyn.Tbool();
    }    public Type visit(lab1.Absyn.Tdouble p, A arg)
    {
      return new lab1.Absyn.Tdouble();
    }    public Type visit(lab1.Absyn.Tint p, A arg)
    {
      return new lab1.Absyn.Tint();
    }    public Type visit(lab1.Absyn.Tchar p, A arg)
    {
      return new lab1.Absyn.Tchar();
    }    public Type visit(lab1.Absyn.Tvoid p, A arg)
    {
      return new lab1.Absyn.Tvoid();
    }    public Type visit(lab1.Absyn.TConst p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      return new lab1.Absyn.TConst(type_);
    }    public Type visit(lab1.Absyn.TRef p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      return new lab1.Absyn.TRef(type_);
    }    public Type visit(lab1.Absyn.TDRef p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      return new lab1.Absyn.TDRef(type_);
    }    public Type visit(lab1.Absyn.TQual p, A arg)
    {
      ListId listid_ = p.listid_;
      return new lab1.Absyn.TQual(listid_);
    }
}