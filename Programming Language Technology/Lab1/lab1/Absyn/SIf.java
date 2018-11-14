package lab1.Absyn; // Java Package generated by the BNF Converter.

public class SIf extends Stm {
  public final Exp exp_;
  public final Stm stm_;
  public final IRest irest_;
  public SIf(Exp p1, Stm p2, IRest p3) { exp_ = p1; stm_ = p2; irest_ = p3; }

  public <R,A> R accept(lab1.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof lab1.Absyn.SIf) {
      lab1.Absyn.SIf x = (lab1.Absyn.SIf)o;
      return this.exp_.equals(x.exp_) && this.stm_.equals(x.stm_) && this.irest_.equals(x.irest_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.exp_.hashCode())+this.stm_.hashCode())+this.irest_.hashCode();
  }


}
