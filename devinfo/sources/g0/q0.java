package g0;

import g2.r0;
import g2.s0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q0 extends i1.m implements i2.u {

    /* renamed from: o, reason: collision with root package name */
    public q f24176o;

    /* renamed from: p, reason: collision with root package name */
    public mk.e f24177p;

    @Override // i2.u
    public final /* synthetic */ int L(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.d(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final /* synthetic */ int S(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        return d.h.h(this, m0Var, i0Var, i4);
    }

    @Override // i2.u
    public final g2.k0 a0(final g2.l0 l0Var, g2.i0 i0Var, long j) {
        final s0 s0VarV = i0Var.v(d3.b.a(this.f24176o != q.f24172a ? 0 : d3.a.j(j), d3.a.h(j), this.f24176o == q.f24173b ? d3.a.i(j) : 0, d3.a.g(j)));
        final int iE = ci.b.e(s0VarV.f24408a, d3.a.j(j), d3.a.h(j));
        final int iE2 = ci.b.e(s0VarV.f24409b, d3.a.i(j), d3.a.g(j));
        return l0Var.O(iE, iE2, zj.t.f38318a, new mk.c() { // from class: g0.p0
            @Override // mk.c
            public final Object invoke(Object obj) {
                mk.e eVar = this.f24167a.f24177p;
                r0.h((r0) obj, s0VarV, ((d3.i) eVar.invoke(new d3.k(((iE - r1.f24408a) << 32) | ((iE2 - r1.f24409b) & 4294967295L)), l0Var.getLayoutDirection())).f21959a);
                return yj.u.f37649a;
            }
        });
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
