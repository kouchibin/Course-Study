package lab1.Absyn; // Java Package generated by the BNF Converter.

public abstract class IRest implements java.io.Serializable {
  public abstract <R,A> R accept(IRest.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(lab1.Absyn.SElse p, A arg);
    public R visit(lab1.Absyn.SEmp p, A arg);

  }

}
