package lab1.Absyn; // Java Package generated by the BNF Converter.

public class DFun extends Def {
  public final Type type_;
  public final String id_;
  public final ListArg listarg_;
  public final Rest rest_;
  public DFun(Type p1, String p2, ListArg p3, Rest p4) { type_ = p1; id_ = p2; listarg_ = p3; rest_ = p4; }

  public <R,A> R accept(lab1.Absyn.Def.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof lab1.Absyn.DFun) {
      lab1.Absyn.DFun x = (lab1.Absyn.DFun)o;
      return this.type_.equals(x.type_) && this.id_.equals(x.id_) && this.listarg_.equals(x.listarg_) && this.rest_.equals(x.rest_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(this.type_.hashCode())+this.id_.hashCode())+this.listarg_.hashCode())+this.rest_.hashCode();
  }


}