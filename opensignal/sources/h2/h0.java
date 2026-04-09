package h2;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f9830a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f9831b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f9832c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f9833d;

    public h0(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        this.f9830a = c0Var;
        this.f9831b = c0Var2;
        this.f9832c = c0Var3;
        this.f9833d = c0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return br.l.a(this.f9830a, h0Var.f9830a) && br.l.a(this.f9831b, h0Var.f9831b) && br.l.a(this.f9832c, h0Var.f9832c) && br.l.a(this.f9833d, h0Var.f9833d);
    }

    public final int hashCode() {
        c0 c0Var = this.f9830a;
        int iHashCode = (c0Var != null ? c0Var.hashCode() : 0) * 31;
        c0 c0Var2 = this.f9831b;
        int iHashCode2 = (iHashCode + (c0Var2 != null ? c0Var2.hashCode() : 0)) * 31;
        c0 c0Var3 = this.f9832c;
        int iHashCode3 = (iHashCode2 + (c0Var3 != null ? c0Var3.hashCode() : 0)) * 31;
        c0 c0Var4 = this.f9833d;
        return iHashCode3 + (c0Var4 != null ? c0Var4.hashCode() : 0);
    }
}
