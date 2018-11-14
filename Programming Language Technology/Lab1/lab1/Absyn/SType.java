package lab1.Absyn; // Java Package generated by the BNF Converter.

public class SType extends Stm {
  public final ListId listid_;
  public final String id_;
  public SType(ListId p1, String p2) { listid_ = p1; id_ = p2; }

  public <R,A> R accept(lab1.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof lab1.Absyn.SType) {
      lab1.Absyn.SType x = (lab1.Absyn.SType)o;
      return this.listid_.equals(x.listid_) && this.id_.equals(x.id_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listid_.hashCode())+this.id_.hashCode();
  }


}