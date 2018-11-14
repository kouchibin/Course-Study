package lab1.Absyn; // Java Package generated by the BNF Converter.

public class TDRef extends Type {
  public final Type type_;
  public TDRef(Type p1) { type_ = p1; }

  public <R,A> R accept(lab1.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof lab1.Absyn.TDRef) {
      lab1.Absyn.TDRef x = (lab1.Absyn.TDRef)o;
      return this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return this.type_.hashCode();
  }


}