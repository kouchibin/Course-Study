package lab1.Absyn; // Java Package generated by the BNF Converter.

public class SDecls extends Stm {
  public final Type type_;
  public final String id_;
  public final ListId listid_;
  public SDecls(Type p1, String p2, ListId p3) { type_ = p1; id_ = p2; listid_ = p3; }

  public <R,A> R accept(lab1.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof lab1.Absyn.SDecls) {
      lab1.Absyn.SDecls x = (lab1.Absyn.SDecls)o;
      return this.type_.equals(x.type_) && this.id_.equals(x.id_) && this.listid_.equals(x.listid_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.type_.hashCode())+this.id_.hashCode())+this.listid_.hashCode();
  }


}
