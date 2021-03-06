package lab1;
import lab1.Absyn.*;

public class PrettyPrinter
{
  //For certain applications increasing the initial size of the buffer may improve performance.
  private static final int INITIAL_BUFFER_SIZE = 128;
  private static final int INDENT_WIDTH = 2;
  //You may wish to change the parentheses used in precedence.
  private static final String _L_PAREN = new String("(");
  private static final String _R_PAREN = new String(")");
  //You may wish to change render
  private static void render(String s)
  {
    if (s.equals("{"))
    {
       buf_.append("\n");
       indent();
       buf_.append(s);
       _n_ = _n_ + INDENT_WIDTH;
       buf_.append("\n");
       indent();
    }
    else if (s.equals("(") || s.equals("["))
       buf_.append(s);
    else if (s.equals(")") || s.equals("]"))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals("}"))
    {
       int t;
       _n_ = _n_ - INDENT_WIDTH;
       for(t=0; t<INDENT_WIDTH; t++) {
         backup();
       }
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals(","))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals(";"))
    {
       backup();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals("")) return;
    else
    {
       buf_.append(s);
       buf_.append(" ");
    }
  }


  //  print and show methods are defined for each category.
  public static String print(lab1.Absyn.Program foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.Program foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.ListDef foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.ListDef foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.Def foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.Def foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.Rest foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.Rest foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.ListId foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.ListId foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.ListArg foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.ListArg foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.ListStm foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.ListStm foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.Arg foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.Arg foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.ARest foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.ARest foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.ARRest foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.ARRest foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.Stm foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.Stm foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.IRest foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.IRest foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.Exp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.Exp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.ListString foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.ListString foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.ListExp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.ListExp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(lab1.Absyn.Type foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(lab1.Absyn.Type foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  /***   You shouldn't need to change anything beyond this point.   ***/

  private static void pp(lab1.Absyn.Program foo, int _i_)
  {
    if (foo instanceof lab1.Absyn.PDefs)
    {
       lab1.Absyn.PDefs _pdefs = (lab1.Absyn.PDefs) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_pdefs.listdef_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(lab1.Absyn.ListDef foo, int _i_)
  {
     for (java.util.Iterator<Def> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }  }

  private static void pp(lab1.Absyn.Def foo, int _i_)
  {
    if (foo instanceof lab1.Absyn.DFun)
    {
       lab1.Absyn.DFun _dfun = (lab1.Absyn.DFun) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_dfun.type_, 0);
       pp(_dfun.id_, 0);
       render("(");
       pp(_dfun.listarg_, 0);
       render(")");
       pp(_dfun.rest_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.DQua)
    {
       lab1.Absyn.DQua _dqua = (lab1.Absyn.DQua) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("using");
       pp(_dqua.listid_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.DStm)
    {
       lab1.Absyn.DStm _dstm = (lab1.Absyn.DStm) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_dstm.stm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(lab1.Absyn.Rest foo, int _i_)
  {
    if (foo instanceof lab1.Absyn.RStm)
    {
       lab1.Absyn.RStm _rstm = (lab1.Absyn.RStm) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{");
       pp(_rstm.liststm_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.REnd)
    {
       lab1.Absyn.REnd _rend = (lab1.Absyn.REnd) foo;
       if (_i_ > 0) render(_L_PAREN);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(lab1.Absyn.ListId foo, int _i_)
  {
     for (java.util.Iterator<String> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render("::");
       } else {
         render("");
       }
     }  }

  private static void pp(lab1.Absyn.ListArg foo, int _i_)
  {
     for (java.util.Iterator<Arg> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }  }

  private static void pp(lab1.Absyn.ListStm foo, int _i_)
  {
     for (java.util.Iterator<Stm> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }  }

  private static void pp(lab1.Absyn.Arg foo, int _i_)
  {
    if (foo instanceof lab1.Absyn.ADecl)
    {
       lab1.Absyn.ADecl _adecl = (lab1.Absyn.ADecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_adecl.type_, 0);
       pp(_adecl.arest_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(lab1.Absyn.ARest foo, int _i_)
  {
    if (foo instanceof lab1.Absyn.AId)
    {
       lab1.Absyn.AId _aid = (lab1.Absyn.AId) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_aid.id_, 0);
       pp(_aid.arrest_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.AEmp)
    {
       lab1.Absyn.AEmp _aemp = (lab1.Absyn.AEmp) foo;
       if (_i_ > 0) render(_L_PAREN);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(lab1.Absyn.ARRest foo, int _i_)
  {
    if (foo instanceof lab1.Absyn.ARInit)
    {
       lab1.Absyn.ARInit _arinit = (lab1.Absyn.ARInit) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("=");
       pp(_arinit.exp_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.AREmp)
    {
       lab1.Absyn.AREmp _aremp = (lab1.Absyn.AREmp) foo;
       if (_i_ > 0) render(_L_PAREN);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(lab1.Absyn.Stm foo, int _i_)
  {
    if (foo instanceof lab1.Absyn.SExp)
    {
       lab1.Absyn.SExp _sexp = (lab1.Absyn.SExp) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sexp.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.STypedef)
    {
       lab1.Absyn.STypedef _stypedef = (lab1.Absyn.STypedef) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("typedef");
       pp(_stypedef.listid_, 0);
       pp(_stypedef.id_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.SDecl)
    {
       lab1.Absyn.SDecl _sdecl = (lab1.Absyn.SDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sdecl.type_, 0);
       pp(_sdecl.id_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.SDecls)
    {
       lab1.Absyn.SDecls _sdecls = (lab1.Absyn.SDecls) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sdecls.type_, 0);
       pp(_sdecls.id_, 0);
       render(",");
       pp(_sdecls.listid_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.SInit)
    {
       lab1.Absyn.SInit _sinit = (lab1.Absyn.SInit) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sinit.type_, 0);
       pp(_sinit.id_, 0);
       render("=");
       pp(_sinit.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.SReturn)
    {
       lab1.Absyn.SReturn _sreturn = (lab1.Absyn.SReturn) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("return");
       pp(_sreturn.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.SWhile)
    {
       lab1.Absyn.SWhile _swhile = (lab1.Absyn.SWhile) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("while");
       render("(");
       pp(_swhile.exp_, 0);
       render(")");
       pp(_swhile.stm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.SBlock)
    {
       lab1.Absyn.SBlock _sblock = (lab1.Absyn.SBlock) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{");
       pp(_sblock.liststm_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.SIf)
    {
       lab1.Absyn.SIf _sif = (lab1.Absyn.SIf) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("if");
       render("(");
       pp(_sif.exp_, 0);
       render(")");
       pp(_sif.stm_, 0);
       pp(_sif.irest_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(lab1.Absyn.IRest foo, int _i_)
  {
    if (foo instanceof lab1.Absyn.SElse)
    {
       lab1.Absyn.SElse _selse = (lab1.Absyn.SElse) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("else");
       pp(_selse.stm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.SEmp)
    {
       lab1.Absyn.SEmp _semp = (lab1.Absyn.SEmp) foo;
       if (_i_ > 0) render(_L_PAREN);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(lab1.Absyn.Exp foo, int _i_)
  {
    if (foo instanceof lab1.Absyn.EInt)
    {
       lab1.Absyn.EInt _eint = (lab1.Absyn.EInt) foo;
       if (_i_ > 15) render(_L_PAREN);
       pp(_eint.integer_, 0);
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EDouble)
    {
       lab1.Absyn.EDouble _edouble = (lab1.Absyn.EDouble) foo;
       if (_i_ > 15) render(_L_PAREN);
       pp(_edouble.double_, 0);
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EString)
    {
       lab1.Absyn.EString _estring = (lab1.Absyn.EString) foo;
       if (_i_ > 15) render(_L_PAREN);
       pp(_estring.liststring_, 0);
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EChar)
    {
       lab1.Absyn.EChar _echar = (lab1.Absyn.EChar) foo;
       if (_i_ > 15) render(_L_PAREN);
       pp(_echar.char_, 0);
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EQua)
    {
       lab1.Absyn.EQua _equa = (lab1.Absyn.EQua) foo;
       if (_i_ > 15) render(_L_PAREN);
       pp(_equa.listid_, 0);
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ECall)
    {
       lab1.Absyn.ECall _ecall = (lab1.Absyn.ECall) foo;
       if (_i_ > 15) render(_L_PAREN);
       pp(_ecall.id_, 0);
       render("(");
       pp(_ecall.listexp_, 0);
       render(")");
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EIndex)
    {
       lab1.Absyn.EIndex _eindex = (lab1.Absyn.EIndex) foo;
       if (_i_ > 14) render(_L_PAREN);
       pp(_eindex.exp_1, 14);
       render("[");
       pp(_eindex.exp_2, 0);
       render("]");
       if (_i_ > 14) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EDotProj)
    {
       lab1.Absyn.EDotProj _edotproj = (lab1.Absyn.EDotProj) foo;
       if (_i_ > 14) render(_L_PAREN);
       pp(_edotproj.exp_1, 14);
       render(".");
       pp(_edotproj.exp_2, 15);
       if (_i_ > 14) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EArwProj)
    {
       lab1.Absyn.EArwProj _earwproj = (lab1.Absyn.EArwProj) foo;
       if (_i_ > 14) render(_L_PAREN);
       pp(_earwproj.exp_1, 14);
       render("->");
       pp(_earwproj.exp_2, 15);
       if (_i_ > 14) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ERIncr)
    {
       lab1.Absyn.ERIncr _erincr = (lab1.Absyn.ERIncr) foo;
       if (_i_ > 13) render(_L_PAREN);
       render("++");
       pp(_erincr.exp_, 14);
       if (_i_ > 13) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ERDecr)
    {
       lab1.Absyn.ERDecr _erdecr = (lab1.Absyn.ERDecr) foo;
       if (_i_ > 13) render(_L_PAREN);
       render("--");
       pp(_erdecr.exp_, 14);
       if (_i_ > 13) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EDeref)
    {
       lab1.Absyn.EDeref _ederef = (lab1.Absyn.EDeref) foo;
       if (_i_ > 13) render(_L_PAREN);
       render("*");
       pp(_ederef.exp_, 14);
       if (_i_ > 13) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ENeg)
    {
       lab1.Absyn.ENeg _eneg = (lab1.Absyn.ENeg) foo;
       if (_i_ > 13) render(_L_PAREN);
       render("!");
       pp(_eneg.exp_, 14);
       if (_i_ > 13) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EMul)
    {
       lab1.Absyn.EMul _emul = (lab1.Absyn.EMul) foo;
       if (_i_ > 12) render(_L_PAREN);
       pp(_emul.exp_1, 12);
       render("*");
       pp(_emul.exp_2, 13);
       if (_i_ > 12) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EDiv)
    {
       lab1.Absyn.EDiv _ediv = (lab1.Absyn.EDiv) foo;
       if (_i_ > 12) render(_L_PAREN);
       pp(_ediv.exp_1, 12);
       render("/");
       pp(_ediv.exp_2, 13);
       if (_i_ > 12) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EMod)
    {
       lab1.Absyn.EMod _emod = (lab1.Absyn.EMod) foo;
       if (_i_ > 12) render(_L_PAREN);
       pp(_emod.exp_1, 12);
       render("%");
       pp(_emod.exp_2, 13);
       if (_i_ > 12) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EAdd)
    {
       lab1.Absyn.EAdd _eadd = (lab1.Absyn.EAdd) foo;
       if (_i_ > 11) render(_L_PAREN);
       pp(_eadd.exp_1, 11);
       render("+");
       pp(_eadd.exp_2, 12);
       if (_i_ > 11) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ESub)
    {
       lab1.Absyn.ESub _esub = (lab1.Absyn.ESub) foo;
       if (_i_ > 11) render(_L_PAREN);
       pp(_esub.exp_1, 11);
       render("-");
       pp(_esub.exp_2, 12);
       if (_i_ > 11) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ELShift)
    {
       lab1.Absyn.ELShift _elshift = (lab1.Absyn.ELShift) foo;
       if (_i_ > 10) render(_L_PAREN);
       pp(_elshift.exp_1, 10);
       render("<<");
       pp(_elshift.exp_2, 11);
       if (_i_ > 10) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ERShift)
    {
       lab1.Absyn.ERShift _ershift = (lab1.Absyn.ERShift) foo;
       if (_i_ > 10) render(_L_PAREN);
       pp(_ershift.exp_1, 10);
       render(">>");
       pp(_ershift.exp_2, 11);
       if (_i_ > 10) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ELess)
    {
       lab1.Absyn.ELess _eless = (lab1.Absyn.ELess) foo;
       if (_i_ > 9) render(_L_PAREN);
       pp(_eless.exp_1, 9);
       render("<");
       pp(_eless.exp_2, 10);
       if (_i_ > 9) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ELeq)
    {
       lab1.Absyn.ELeq _eleq = (lab1.Absyn.ELeq) foo;
       if (_i_ > 9) render(_L_PAREN);
       pp(_eleq.exp_1, 9);
       render("<=");
       pp(_eleq.exp_2, 10);
       if (_i_ > 9) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EGrea)
    {
       lab1.Absyn.EGrea _egrea = (lab1.Absyn.EGrea) foo;
       if (_i_ > 9) render(_L_PAREN);
       pp(_egrea.exp_1, 9);
       render(">");
       pp(_egrea.exp_2, 10);
       if (_i_ > 9) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EGeq)
    {
       lab1.Absyn.EGeq _egeq = (lab1.Absyn.EGeq) foo;
       if (_i_ > 9) render(_L_PAREN);
       pp(_egeq.exp_1, 9);
       render(">=");
       pp(_egeq.exp_2, 10);
       if (_i_ > 9) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EEqual)
    {
       lab1.Absyn.EEqual _eequal = (lab1.Absyn.EEqual) foo;
       if (_i_ > 8) render(_L_PAREN);
       pp(_eequal.exp_1, 8);
       render("==");
       pp(_eequal.exp_2, 9);
       if (_i_ > 8) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ENEqual)
    {
       lab1.Absyn.ENEqual _enequal = (lab1.Absyn.ENEqual) foo;
       if (_i_ > 8) render(_L_PAREN);
       pp(_enequal.exp_1, 8);
       render("!=");
       pp(_enequal.exp_2, 9);
       if (_i_ > 8) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EConj)
    {
       lab1.Absyn.EConj _econj = (lab1.Absyn.EConj) foo;
       if (_i_ > 4) render(_L_PAREN);
       pp(_econj.exp_1, 4);
       render("&&");
       pp(_econj.exp_2, 5);
       if (_i_ > 4) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EDisj)
    {
       lab1.Absyn.EDisj _edisj = (lab1.Absyn.EDisj) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_edisj.exp_1, 3);
       render("||");
       pp(_edisj.exp_2, 4);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EAss)
    {
       lab1.Absyn.EAss _eass = (lab1.Absyn.EAss) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_eass.exp_1, 3);
       render("=");
       pp(_eass.exp_2, 2);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EAddAss)
    {
       lab1.Absyn.EAddAss _eaddass = (lab1.Absyn.EAddAss) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_eaddass.exp_1, 3);
       render("+=");
       pp(_eaddass.exp_2, 2);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ESubAss)
    {
       lab1.Absyn.ESubAss _esubass = (lab1.Absyn.ESubAss) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_esubass.exp_1, 3);
       render("-=");
       pp(_esubass.exp_2, 2);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.ECond)
    {
       lab1.Absyn.ECond _econd = (lab1.Absyn.ECond) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_econd.exp_1, 3);
       render("?");
       pp(_econd.exp_2, 2);
       render(":");
       pp(_econd.exp_3, 2);
       if (_i_ > 2) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.EThrow)
    {
       lab1.Absyn.EThrow _ethrow = (lab1.Absyn.EThrow) foo;
       if (_i_ > 1) render(_L_PAREN);
       render("throw");
       pp(_ethrow.exp_, 1);
       if (_i_ > 1) render(_R_PAREN);
    }
  }

  private static void pp(lab1.Absyn.ListString foo, int _i_)
  {
     for (java.util.Iterator<String> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }  }

  private static void pp(lab1.Absyn.ListExp foo, int _i_)
  {
     for (java.util.Iterator<Exp> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }  }

  private static void pp(lab1.Absyn.Type foo, int _i_)
  {
    if (foo instanceof lab1.Absyn.Tbool)
    {
       lab1.Absyn.Tbool _tbool = (lab1.Absyn.Tbool) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("bool");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.Tdouble)
    {
       lab1.Absyn.Tdouble _tdouble = (lab1.Absyn.Tdouble) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("double");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.Tint)
    {
       lab1.Absyn.Tint _tint = (lab1.Absyn.Tint) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("int");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.Tchar)
    {
       lab1.Absyn.Tchar _tchar = (lab1.Absyn.Tchar) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("char");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.Tvoid)
    {
       lab1.Absyn.Tvoid _tvoid = (lab1.Absyn.Tvoid) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("void");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.TConst)
    {
       lab1.Absyn.TConst _tconst = (lab1.Absyn.TConst) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("const");
       pp(_tconst.type_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.TRef)
    {
       lab1.Absyn.TRef _tref = (lab1.Absyn.TRef) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_tref.type_, 0);
       render("&");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.TDRef)
    {
       lab1.Absyn.TDRef _tdref = (lab1.Absyn.TDRef) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_tdref.type_, 0);
       render(" &");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof lab1.Absyn.TQual)
    {
       lab1.Absyn.TQual _tqual = (lab1.Absyn.TQual) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_tqual.listid_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }


  private static void sh(lab1.Absyn.Program foo)
  {
    if (foo instanceof lab1.Absyn.PDefs)
    {
       lab1.Absyn.PDefs _pdefs = (lab1.Absyn.PDefs) foo;
       render("(");
       render("PDefs");
       render("[");
       sh(_pdefs.listdef_);
       render("]");
       render(")");
    }
  }

  private static void sh(lab1.Absyn.ListDef foo)
  {
     for (java.util.Iterator<Def> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(lab1.Absyn.Def foo)
  {
    if (foo instanceof lab1.Absyn.DFun)
    {
       lab1.Absyn.DFun _dfun = (lab1.Absyn.DFun) foo;
       render("(");
       render("DFun");
       sh(_dfun.type_);
       sh(_dfun.id_);
       render("[");
       sh(_dfun.listarg_);
       render("]");
       sh(_dfun.rest_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.DQua)
    {
       lab1.Absyn.DQua _dqua = (lab1.Absyn.DQua) foo;
       render("(");
       render("DQua");
       render("[");
       sh(_dqua.listid_);
       render("]");
       render(")");
    }
    if (foo instanceof lab1.Absyn.DStm)
    {
       lab1.Absyn.DStm _dstm = (lab1.Absyn.DStm) foo;
       render("(");
       render("DStm");
       sh(_dstm.stm_);
       render(")");
    }
  }

  private static void sh(lab1.Absyn.Rest foo)
  {
    if (foo instanceof lab1.Absyn.RStm)
    {
       lab1.Absyn.RStm _rstm = (lab1.Absyn.RStm) foo;
       render("(");
       render("RStm");
       render("[");
       sh(_rstm.liststm_);
       render("]");
       render(")");
    }
    if (foo instanceof lab1.Absyn.REnd)
    {
       lab1.Absyn.REnd _rend = (lab1.Absyn.REnd) foo;
       render("REnd");
    }
  }

  private static void sh(lab1.Absyn.ListId foo)
  {
     for (java.util.Iterator<String> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(lab1.Absyn.ListArg foo)
  {
     for (java.util.Iterator<Arg> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(lab1.Absyn.ListStm foo)
  {
     for (java.util.Iterator<Stm> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(lab1.Absyn.Arg foo)
  {
    if (foo instanceof lab1.Absyn.ADecl)
    {
       lab1.Absyn.ADecl _adecl = (lab1.Absyn.ADecl) foo;
       render("(");
       render("ADecl");
       sh(_adecl.type_);
       sh(_adecl.arest_);
       render(")");
    }
  }

  private static void sh(lab1.Absyn.ARest foo)
  {
    if (foo instanceof lab1.Absyn.AId)
    {
       lab1.Absyn.AId _aid = (lab1.Absyn.AId) foo;
       render("(");
       render("AId");
       sh(_aid.id_);
       sh(_aid.arrest_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.AEmp)
    {
       lab1.Absyn.AEmp _aemp = (lab1.Absyn.AEmp) foo;
       render("AEmp");
    }
  }

  private static void sh(lab1.Absyn.ARRest foo)
  {
    if (foo instanceof lab1.Absyn.ARInit)
    {
       lab1.Absyn.ARInit _arinit = (lab1.Absyn.ARInit) foo;
       render("(");
       render("ARInit");
       sh(_arinit.exp_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.AREmp)
    {
       lab1.Absyn.AREmp _aremp = (lab1.Absyn.AREmp) foo;
       render("AREmp");
    }
  }

  private static void sh(lab1.Absyn.Stm foo)
  {
    if (foo instanceof lab1.Absyn.SExp)
    {
       lab1.Absyn.SExp _sexp = (lab1.Absyn.SExp) foo;
       render("(");
       render("SExp");
       sh(_sexp.exp_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.STypedef)
    {
       lab1.Absyn.STypedef _stypedef = (lab1.Absyn.STypedef) foo;
       render("(");
       render("STypedef");
       render("[");
       sh(_stypedef.listid_);
       render("]");
       sh(_stypedef.id_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.SDecl)
    {
       lab1.Absyn.SDecl _sdecl = (lab1.Absyn.SDecl) foo;
       render("(");
       render("SDecl");
       sh(_sdecl.type_);
       sh(_sdecl.id_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.SDecls)
    {
       lab1.Absyn.SDecls _sdecls = (lab1.Absyn.SDecls) foo;
       render("(");
       render("SDecls");
       sh(_sdecls.type_);
       sh(_sdecls.id_);
       render("[");
       sh(_sdecls.listid_);
       render("]");
       render(")");
    }
    if (foo instanceof lab1.Absyn.SInit)
    {
       lab1.Absyn.SInit _sinit = (lab1.Absyn.SInit) foo;
       render("(");
       render("SInit");
       sh(_sinit.type_);
       sh(_sinit.id_);
       sh(_sinit.exp_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.SReturn)
    {
       lab1.Absyn.SReturn _sreturn = (lab1.Absyn.SReturn) foo;
       render("(");
       render("SReturn");
       sh(_sreturn.exp_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.SWhile)
    {
       lab1.Absyn.SWhile _swhile = (lab1.Absyn.SWhile) foo;
       render("(");
       render("SWhile");
       sh(_swhile.exp_);
       sh(_swhile.stm_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.SBlock)
    {
       lab1.Absyn.SBlock _sblock = (lab1.Absyn.SBlock) foo;
       render("(");
       render("SBlock");
       render("[");
       sh(_sblock.liststm_);
       render("]");
       render(")");
    }
    if (foo instanceof lab1.Absyn.SIf)
    {
       lab1.Absyn.SIf _sif = (lab1.Absyn.SIf) foo;
       render("(");
       render("SIf");
       sh(_sif.exp_);
       sh(_sif.stm_);
       sh(_sif.irest_);
       render(")");
    }
  }

  private static void sh(lab1.Absyn.IRest foo)
  {
    if (foo instanceof lab1.Absyn.SElse)
    {
       lab1.Absyn.SElse _selse = (lab1.Absyn.SElse) foo;
       render("(");
       render("SElse");
       sh(_selse.stm_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.SEmp)
    {
       lab1.Absyn.SEmp _semp = (lab1.Absyn.SEmp) foo;
       render("SEmp");
    }
  }

  private static void sh(lab1.Absyn.Exp foo)
  {
    if (foo instanceof lab1.Absyn.EInt)
    {
       lab1.Absyn.EInt _eint = (lab1.Absyn.EInt) foo;
       render("(");
       render("EInt");
       sh(_eint.integer_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EDouble)
    {
       lab1.Absyn.EDouble _edouble = (lab1.Absyn.EDouble) foo;
       render("(");
       render("EDouble");
       sh(_edouble.double_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EString)
    {
       lab1.Absyn.EString _estring = (lab1.Absyn.EString) foo;
       render("(");
       render("EString");
       render("[");
       sh(_estring.liststring_);
       render("]");
       render(")");
    }
    if (foo instanceof lab1.Absyn.EChar)
    {
       lab1.Absyn.EChar _echar = (lab1.Absyn.EChar) foo;
       render("(");
       render("EChar");
       sh(_echar.char_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EQua)
    {
       lab1.Absyn.EQua _equa = (lab1.Absyn.EQua) foo;
       render("(");
       render("EQua");
       render("[");
       sh(_equa.listid_);
       render("]");
       render(")");
    }
    if (foo instanceof lab1.Absyn.ECall)
    {
       lab1.Absyn.ECall _ecall = (lab1.Absyn.ECall) foo;
       render("(");
       render("ECall");
       sh(_ecall.id_);
       render("[");
       sh(_ecall.listexp_);
       render("]");
       render(")");
    }
    if (foo instanceof lab1.Absyn.EIndex)
    {
       lab1.Absyn.EIndex _eindex = (lab1.Absyn.EIndex) foo;
       render("(");
       render("EIndex");
       sh(_eindex.exp_1);
       sh(_eindex.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EDotProj)
    {
       lab1.Absyn.EDotProj _edotproj = (lab1.Absyn.EDotProj) foo;
       render("(");
       render("EDotProj");
       sh(_edotproj.exp_1);
       sh(_edotproj.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EArwProj)
    {
       lab1.Absyn.EArwProj _earwproj = (lab1.Absyn.EArwProj) foo;
       render("(");
       render("EArwProj");
       sh(_earwproj.exp_1);
       sh(_earwproj.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.ERIncr)
    {
       lab1.Absyn.ERIncr _erincr = (lab1.Absyn.ERIncr) foo;
       render("(");
       render("ERIncr");
       sh(_erincr.exp_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.ERDecr)
    {
       lab1.Absyn.ERDecr _erdecr = (lab1.Absyn.ERDecr) foo;
       render("(");
       render("ERDecr");
       sh(_erdecr.exp_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EDeref)
    {
       lab1.Absyn.EDeref _ederef = (lab1.Absyn.EDeref) foo;
       render("(");
       render("EDeref");
       sh(_ederef.exp_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.ENeg)
    {
       lab1.Absyn.ENeg _eneg = (lab1.Absyn.ENeg) foo;
       render("(");
       render("ENeg");
       sh(_eneg.exp_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EMul)
    {
       lab1.Absyn.EMul _emul = (lab1.Absyn.EMul) foo;
       render("(");
       render("EMul");
       sh(_emul.exp_1);
       sh(_emul.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EDiv)
    {
       lab1.Absyn.EDiv _ediv = (lab1.Absyn.EDiv) foo;
       render("(");
       render("EDiv");
       sh(_ediv.exp_1);
       sh(_ediv.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EMod)
    {
       lab1.Absyn.EMod _emod = (lab1.Absyn.EMod) foo;
       render("(");
       render("EMod");
       sh(_emod.exp_1);
       sh(_emod.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EAdd)
    {
       lab1.Absyn.EAdd _eadd = (lab1.Absyn.EAdd) foo;
       render("(");
       render("EAdd");
       sh(_eadd.exp_1);
       sh(_eadd.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.ESub)
    {
       lab1.Absyn.ESub _esub = (lab1.Absyn.ESub) foo;
       render("(");
       render("ESub");
       sh(_esub.exp_1);
       sh(_esub.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.ELShift)
    {
       lab1.Absyn.ELShift _elshift = (lab1.Absyn.ELShift) foo;
       render("(");
       render("ELShift");
       sh(_elshift.exp_1);
       sh(_elshift.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.ERShift)
    {
       lab1.Absyn.ERShift _ershift = (lab1.Absyn.ERShift) foo;
       render("(");
       render("ERShift");
       sh(_ershift.exp_1);
       sh(_ershift.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.ELess)
    {
       lab1.Absyn.ELess _eless = (lab1.Absyn.ELess) foo;
       render("(");
       render("ELess");
       sh(_eless.exp_1);
       sh(_eless.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.ELeq)
    {
       lab1.Absyn.ELeq _eleq = (lab1.Absyn.ELeq) foo;
       render("(");
       render("ELeq");
       sh(_eleq.exp_1);
       sh(_eleq.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EGrea)
    {
       lab1.Absyn.EGrea _egrea = (lab1.Absyn.EGrea) foo;
       render("(");
       render("EGrea");
       sh(_egrea.exp_1);
       sh(_egrea.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EGeq)
    {
       lab1.Absyn.EGeq _egeq = (lab1.Absyn.EGeq) foo;
       render("(");
       render("EGeq");
       sh(_egeq.exp_1);
       sh(_egeq.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EEqual)
    {
       lab1.Absyn.EEqual _eequal = (lab1.Absyn.EEqual) foo;
       render("(");
       render("EEqual");
       sh(_eequal.exp_1);
       sh(_eequal.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.ENEqual)
    {
       lab1.Absyn.ENEqual _enequal = (lab1.Absyn.ENEqual) foo;
       render("(");
       render("ENEqual");
       sh(_enequal.exp_1);
       sh(_enequal.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EConj)
    {
       lab1.Absyn.EConj _econj = (lab1.Absyn.EConj) foo;
       render("(");
       render("EConj");
       sh(_econj.exp_1);
       sh(_econj.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EDisj)
    {
       lab1.Absyn.EDisj _edisj = (lab1.Absyn.EDisj) foo;
       render("(");
       render("EDisj");
       sh(_edisj.exp_1);
       sh(_edisj.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EAss)
    {
       lab1.Absyn.EAss _eass = (lab1.Absyn.EAss) foo;
       render("(");
       render("EAss");
       sh(_eass.exp_1);
       sh(_eass.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EAddAss)
    {
       lab1.Absyn.EAddAss _eaddass = (lab1.Absyn.EAddAss) foo;
       render("(");
       render("EAddAss");
       sh(_eaddass.exp_1);
       sh(_eaddass.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.ESubAss)
    {
       lab1.Absyn.ESubAss _esubass = (lab1.Absyn.ESubAss) foo;
       render("(");
       render("ESubAss");
       sh(_esubass.exp_1);
       sh(_esubass.exp_2);
       render(")");
    }
    if (foo instanceof lab1.Absyn.ECond)
    {
       lab1.Absyn.ECond _econd = (lab1.Absyn.ECond) foo;
       render("(");
       render("ECond");
       sh(_econd.exp_1);
       sh(_econd.exp_2);
       sh(_econd.exp_3);
       render(")");
    }
    if (foo instanceof lab1.Absyn.EThrow)
    {
       lab1.Absyn.EThrow _ethrow = (lab1.Absyn.EThrow) foo;
       render("(");
       render("EThrow");
       sh(_ethrow.exp_);
       render(")");
    }
  }

  private static void sh(lab1.Absyn.ListString foo)
  {
     for (java.util.Iterator<String> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(lab1.Absyn.ListExp foo)
  {
     for (java.util.Iterator<Exp> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(lab1.Absyn.Type foo)
  {
    if (foo instanceof lab1.Absyn.Tbool)
    {
       lab1.Absyn.Tbool _tbool = (lab1.Absyn.Tbool) foo;
       render("Tbool");
    }
    if (foo instanceof lab1.Absyn.Tdouble)
    {
       lab1.Absyn.Tdouble _tdouble = (lab1.Absyn.Tdouble) foo;
       render("Tdouble");
    }
    if (foo instanceof lab1.Absyn.Tint)
    {
       lab1.Absyn.Tint _tint = (lab1.Absyn.Tint) foo;
       render("Tint");
    }
    if (foo instanceof lab1.Absyn.Tchar)
    {
       lab1.Absyn.Tchar _tchar = (lab1.Absyn.Tchar) foo;
       render("Tchar");
    }
    if (foo instanceof lab1.Absyn.Tvoid)
    {
       lab1.Absyn.Tvoid _tvoid = (lab1.Absyn.Tvoid) foo;
       render("Tvoid");
    }
    if (foo instanceof lab1.Absyn.TConst)
    {
       lab1.Absyn.TConst _tconst = (lab1.Absyn.TConst) foo;
       render("(");
       render("TConst");
       sh(_tconst.type_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.TRef)
    {
       lab1.Absyn.TRef _tref = (lab1.Absyn.TRef) foo;
       render("(");
       render("TRef");
       sh(_tref.type_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.TDRef)
    {
       lab1.Absyn.TDRef _tdref = (lab1.Absyn.TDRef) foo;
       render("(");
       render("TDRef");
       sh(_tdref.type_);
       render(")");
    }
    if (foo instanceof lab1.Absyn.TQual)
    {
       lab1.Absyn.TQual _tqual = (lab1.Absyn.TQual) foo;
       render("(");
       render("TQual");
       render("[");
       sh(_tqual.listid_);
       render("]");
       render(")");
    }
  }


  private static void pp(Integer n, int _i_) { buf_.append(n); buf_.append(" "); }
  private static void pp(Double d, int _i_) { buf_.append(d); buf_.append(" "); }
  private static void pp(String s, int _i_) { buf_.append(s); buf_.append(" "); }
  private static void pp(Character c, int _i_) { buf_.append("'" + c.toString() + "'"); buf_.append(" "); }
  private static void sh(Integer n) { render(n.toString()); }
  private static void sh(Double d) { render(d.toString()); }
  private static void sh(Character c) { render(c.toString()); }
  private static void sh(String s) { printQuoted(s); }
  private static void printQuoted(String s) { render("\"" + s + "\""); }
  private static void indent()
  {
    int n = _n_;
    while (n > 0)
    {
      buf_.append(" ");
      n--;
    }
  }
  private static void backup()
  {
     if (buf_.charAt(buf_.length() - 1) == ' ') {
      buf_.setLength(buf_.length() - 1);
    }
  }
  private static void trim()
  {
     while (buf_.length() > 0 && buf_.charAt(0) == ' ')
        buf_.deleteCharAt(0); 
    while (buf_.length() > 0 && buf_.charAt(buf_.length()-1) == ' ')
        buf_.deleteCharAt(buf_.length()-1);
  }
  private static int _n_ = 0;
  private static StringBuilder buf_ = new StringBuilder(INITIAL_BUFFER_SIZE);
}

