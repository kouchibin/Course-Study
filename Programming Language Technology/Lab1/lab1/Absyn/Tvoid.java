package lab1.Absyn; // Java Package generated by the BNF Converter.

public class Tvoid extends Type {
  public Tvoid() { }

  public <R,A> R accept(lab1.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof lab1.Absyn.Tvoid) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
