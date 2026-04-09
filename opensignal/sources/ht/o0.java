package ht;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final rr.r0 f10933a;

    /* renamed from: b, reason: collision with root package name */
    public final fs.a f10934b;

    public o0(rr.r0 r0Var, fs.a aVar) {
        br.l.e(r0Var, "typeParameter");
        br.l.e(aVar, "typeAttr");
        this.f10933a = r0Var;
        this.f10934b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return br.l.a(o0Var.f10933a, this.f10933a) && br.l.a(o0Var.f10934b, this.f10934b);
    }

    public final int hashCode() {
        int iHashCode = this.f10933a.hashCode();
        return this.f10934b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f10933a + ", typeAttr=" + this.f10934b + ')';
    }
}
