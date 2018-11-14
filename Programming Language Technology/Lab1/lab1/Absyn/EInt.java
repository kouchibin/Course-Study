package lab1.Absyn; // Java Package generated by the BNF Converter.

public class EInt extends Exp {
  public final Integer integer_;
  public EInt(Integer p1) { integer_ = p1; }

  public <R,A> R accept(lab1.Absyn.Exp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof lab1.Absyn.EInt) {
      lab1.Absyn.EInt x = (lab1.Absyn.EInt)o;
      return this.integer_.equals(x.integer_);
    }
    return false;
  }

  public int hashCode() {
    return this.integer_.hashCode();
  }


}