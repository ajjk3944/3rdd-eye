package g0;

import g2.s0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y extends i1.m implements i2.u {

    /* renamed from: o, reason: collision with root package name */
    public float f24191o;

    /* renamed from: p, reason: collision with root package name */
    public float f24192p;

    /* renamed from: q, reason: collision with root package name */
    public float f24193q;

    /* renamed from: r, reason: collision with root package name */
    public float f24194r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24195s;

    @Override // i2.u
    public final /* synthetic */ int L(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.d(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int S(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.h(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final g2.k0 a0(g2.l0 l0Var, g2.i0 i0Var, long j) {
        int iQ = l0Var.Q(this.f24193q) + l0Var.Q(this.f24191o);
        int iQ2 = l0Var.Q(this.f24194r) + l0Var.Q(this.f24192p);
        s0 s0VarV = i0Var.v(d3.b.h(-iQ, -iQ2, j));
        return l0Var.O(d3.b.f(s0VarV.f24408a + iQ, j), d3.b.e(s0VarV.f24409b + iQ2, j), zj.t.f38318a, new b7.b(15, this, s0VarV));
    }

    @Override // i2.u
    public final /* synthetic */ int h(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.f(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int t(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.b(this, m0Var, i0Var, i4);
    }
}
