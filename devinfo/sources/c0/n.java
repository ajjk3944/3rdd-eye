package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class n extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2465a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2466b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public final p1.j0 f2467c;

    public n(long j, p1.j0 j0Var) {
        this.f2465a = j;
        this.f2467c = j0Var;
    }

    @Override // i2.v0
    public final i1.m d() {
        q qVar = new q();
        qVar.f2481o = this.f2465a;
        qVar.f2482p = this.f2467c;
        qVar.f2483q = 9205357640488583168L;
        return qVar;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        q qVar = (q) mVar;
        qVar.f2481o = this.f2465a;
        p1.j0 j0Var = qVar.f2482p;
        p1.j0 j0Var2 = this.f2467c;
        if (!nk.k.a(j0Var, j0Var2)) {
            qVar.f2482p = j0Var2;
            i2.k.l(qVar);
        }
        i2.k.j(qVar);
    }

    public final boolean equals(Object obj) {
        n nVar = obj instanceof n ? (n) obj : null;
        return nVar != null && p1.s.c(this.f2465a, nVar.f2465a) && this.f2466b == nVar.f2466b && nk.k.a(this.f2467c, nVar.f2467c);
    }

    public final int hashCode() {
        int i4 = p1.s.f31019i;
        return this.f2467c.hashCode() + r5.c.d(this.f2466b, yj.q.a(this.f2465a) * 961, 31);
    }
}
