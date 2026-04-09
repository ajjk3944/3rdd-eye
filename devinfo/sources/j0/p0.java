package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class p0 extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final mk.a f26942a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.d f26943b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.a1 f26944c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26945d;

    public p0(mk.a aVar, i0.d dVar, d0.a1 a1Var, boolean z3) {
        this.f26942a = aVar;
        this.f26943b = dVar;
        this.f26944c = a1Var;
        this.f26945d = z3;
    }

    @Override // i2.v0
    public final i1.m d() {
        return new t0(this.f26942a, this.f26943b, this.f26944c, this.f26945d);
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        t0 t0Var = (t0) mVar;
        t0Var.f26978o = this.f26942a;
        t0Var.f26979p = this.f26943b;
        d0.a1 a1Var = t0Var.f26980q;
        d0.a1 a1Var2 = this.f26944c;
        if (a1Var != a1Var2) {
            t0Var.f26980q = a1Var2;
            i2.k.l(t0Var);
        }
        boolean z3 = t0Var.f26981r;
        boolean z10 = this.f26945d;
        if (z3 == z10) {
            return;
        }
        t0Var.f26981r = z10;
        t0Var.p0();
        i2.k.l(t0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f26942a == p0Var.f26942a && nk.k.a(this.f26943b, p0Var.f26943b) && this.f26944c == p0Var.f26944c && this.f26945d == p0Var.f26945d;
    }

    public final int hashCode() {
        return ((((this.f26944c.hashCode() + ((this.f26943b.hashCode() + (this.f26942a.hashCode() * 31)) * 31)) * 31) + (this.f26945d ? 1231 : 1237)) * 31) + 1237;
    }
}
