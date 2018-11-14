package lab1.Absyn; // Java Package generated by the BNF Converter.

public class ECond extends Exp {
  public final Exp exp_1, exp_2, exp_3;
  public ECond(Exp p1, Exp p2, Exp p3) { exp_1 = p1; exp_2 = p2; exp_3 = p3; }

  public <R,A> R accept(lab1.Absyn.Exp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof lab1.Absyn.ECond) {
      lab1.Absyn.ECond x = (lab1.Absyn.ECond)o;
      return this.exp_1.equals(x.exp_1) && this.exp_2.equals(x.exp_2) && this.exp_3.equals(x.exp_3);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.exp_1.hashCode())+this.exp_2.hashCode())+this.exp_3.hashCode();
  }


}