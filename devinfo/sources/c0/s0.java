package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class s0 extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0.i f2497a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f2498b;

    public s0(e0.i iVar, u0 u0Var) {
        this.f2497a = iVar;
        this.f2498b = u0Var;
    }

    @Override // i2.v0
    public final i1.m d() {
        i2.i iVarA = this.f2498b.a(this.f2497a);
        t0 t0Var = new t0();
        t0Var.f2506q = iVarA;
        t0Var.p0(iVarA);
        return t0Var;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        t0 t0Var = (t0) mVar;
        i2.i iVarA = this.f2498b.a(this.f2497a);
        t0Var.q0(t0Var.f2506q);
        t0Var.f2506q = iVarA;
        t0Var.p0(iVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return nk.k.a(this.f2497a, s0Var.f2497a) && nk.k.a(this.f2498b, s0Var.f2498b);
    }

    public final int hashCode() {
        return this.f2498b.hashCode() + (this.f2497a.hashCode() * 31);
    }
}
