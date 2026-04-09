package ht;

/* loaded from: classes.dex */
public final class n extends o implements l, lt.e {

    /* renamed from: d, reason: collision with root package name */
    public final b0 f10930d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10931g;

    public n(b0 b0Var, boolean z10) {
        this.f10930d = b0Var;
        this.f10931g = z10;
    }

    @Override // ht.o
    public final b0 C0() {
        return this.f10930d;
    }

    @Override // ht.l
    public final c1 H(x xVar) {
        br.l.e(xVar, "replacement");
        return c.l(xVar.k0(), this.f10931g);
    }

    @Override // ht.l
    public final boolean J() {
        b0 b0Var = this.f10930d;
        b0Var.Z();
        return b0Var.Z().p() instanceof rr.r0;
    }

    @Override // ht.o
    public final o M0(b0 b0Var) {
        return new n(b0Var, this.f10931g);
    }

    @Override // ht.o, ht.x
    public final boolean c0() {
        return false;
    }

    @Override // ht.b0
    public final String toString() {
        return this.f10930d + " & Any";
    }

    @Override // ht.b0
    /* renamed from: u0 */
    public final b0 p0(boolean z10) {
        return z10 ? this.f10930d.p0(z10) : this;
    }

    @Override // ht.b0
    /* renamed from: v0 */
    public final b0 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        return new n(this.f10930d.r0(i0Var), this.f10931g);
    }
}
