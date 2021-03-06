package lab1.Absyn; // Java Package generated by the BNF Converter.

public abstract class Type implements java.io.Serializable {
  public abstract <R,A> R accept(Type.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(lab1.Absyn.Tbool p, A arg);
    public R visit(lab1.Absyn.Tdouble p, A arg);
    public R visit(lab1.Absyn.Tint p, A arg);
    public R visit(lab1.Absyn.Tstring p, A arg);
    public R visit(lab1.Absyn.Tvoid p, A arg);

  }

}
