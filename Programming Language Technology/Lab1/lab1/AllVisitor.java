package lab1;

import lab1.Absyn.*;

/** BNFC-Generated All Visitor */
public interface AllVisitor<R,A> extends
  lab1.Absyn.Program.Visitor<R,A>,
  lab1.Absyn.Def.Visitor<R,A>,
  lab1.Absyn.Rest.Visitor<R,A>,
  lab1.Absyn.Arg.Visitor<R,A>,
  lab1.Absyn.ARest.Visitor<R,A>,
  lab1.Absyn.ARRest.Visitor<R,A>,
  lab1.Absyn.Stm.Visitor<R,A>,
  lab1.Absyn.IRest.Visitor<R,A>,
  lab1.Absyn.Exp.Visitor<R,A>,
  lab1.Absyn.Type.Visitor<R,A>
{}
