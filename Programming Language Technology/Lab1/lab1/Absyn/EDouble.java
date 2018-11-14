package lab1.Absyn; // Java Package generated by the BNF Converter.

public class EDouble extends Exp {
  public final Double double_;
  public EDouble(Double p1) { double_ = p1; }

  public <R,A> R accept(lab1.Absyn.Exp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof lab1.Absyn.EDouble) {
      lab1.Absyn.EDouble x = (lab1.Absyn.EDouble)o;
      return this.double_.equals(x.double_);
    }
    return false;
  }

  public int hashCode() {
    return this.double_.hashCode();
  }


}
