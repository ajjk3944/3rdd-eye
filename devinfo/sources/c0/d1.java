package c0;

import d0.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class d1 extends i2.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final t1 f2389a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.a1 f2390b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2391c;

    /* renamed from: d, reason: collision with root package name */
    public final d0.k f2392d;

    /* renamed from: e, reason: collision with root package name */
    public final e0.i f2393e;

    /* renamed from: f, reason: collision with root package name */
    public final j f2394f;

    public d1(j jVar, d0.k kVar, d0.a1 a1Var, t1 t1Var, e0.i iVar, boolean z3) {
        this.f2389a = t1Var;
        this.f2390b = a1Var;
        this.f2391c = z3;
        this.f2392d = kVar;
        this.f2393e = iVar;
        this.f2394f = jVar;
    }

    @Override // i2.v0
    public final i1.m d() {
        e1 e1Var = new e1();
        e1Var.f2401q = this.f2389a;
        e1Var.f2402r = this.f2390b;
        e1Var.f2403s = this.f2391c;
        e1Var.f2404t = this.f2392d;
        e1Var.f2405u = this.f2393e;
        e1Var.f2406v = this.f2394f;
        return e1Var;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        ((e1) mVar).u0(this.f2394f, this.f2392d, this.f2390b, this.f2389a, this.f2393e, this.f2391c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return nk.k.a(this.f2389a, d1Var.f2389a) && this.f2390b == d1Var.f2390b && this.f2391c == d1Var.f2391c && nk.k.a(this.f2392d, d1Var.f2392d) && nk.k.a(this.f2393e, d1Var.f2393e) && nk.k.a(this.f2394f, d1Var.f2394f);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f2390b.hashCode() + (this.f2389a.hashCode() * 31)) * 31) + (this.f2391c ? 1231 : 1237)) * 31) + 1237) * 31;
        d0.k kVar = this.f2392d;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        e0.i iVar = this.f2393e;
        int iHashCode3 = (((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 961) + 1237) * 31;
        j jVar = this.f2394f;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }
}
