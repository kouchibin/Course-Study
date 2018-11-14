package lab1.Absyn; // Java Package generated by the BNF Converter.

public class EString extends Exp {
  public final String string_;
  public EString(String p1) { string_ = p1; }

  public <R,A> R accept(lab1.Absyn.Exp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof lab1.Absyn.EString) {
      lab1.Absyn.EString x = (lab1.Absyn.EString)o;
      return this.string_.equals(x.string_);
    }
    return false;
  }

  public int hashCode() {
    return this.string_.hashCode();
  }


}
