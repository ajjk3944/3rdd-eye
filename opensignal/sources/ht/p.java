package ht;

/* loaded from: classes.dex */
public abstract class p extends o {

    /* renamed from: d, reason: collision with root package name */
    public final b0 f10935d;

    public p(b0 b0Var) {
        this.f10935d = b0Var;
    }

    @Override // ht.o
    public final b0 C0() {
        return this.f10935d;
    }

    @Override // ht.b0
    /* renamed from: u0 */
    public final b0 p0(boolean z10) {
        return z10 == c0() ? this : this.f10935d.p0(z10).r0(X());
    }

    @Override // ht.b0
    /* renamed from: v0 */
    public final b0 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        return i0Var != X() ? new d0(this, i0Var) : this;
    }
}
