package g0;

import g2.s0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 extends i1.m implements i2.u {

    /* renamed from: o, reason: collision with root package name */
    public a0 f24107o;

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
        a0 a0Var = this.f24107o;
        d3.l layoutDirection = l0Var.getLayoutDirection();
        d3.l lVar = d3.l.f21966a;
        float f10 = layoutDirection == lVar ? a0Var.f24096a : a0Var.f24098c;
        a0 a0Var2 = this.f24107o;
        float f11 = a0Var2.f24097b;
        float f12 = l0Var.getLayoutDirection() == lVar ? a0Var2.f24098c : a0Var2.f24096a;
        float f13 = this.f24107o.f24099d;
        float f14 = 0;
        if (!((d3.f.a(f13, f14) >= 0) & (d3.f.a(f10, f14) >= 0) & (d3.f.a(f11, f14) >= 0) & (d3.f.a(f12, f14) >= 0))) {
            h0.a.a("Padding must be non-negative");
        }
        int iQ = l0Var.Q(f10);
        int iQ2 = l0Var.Q(f12) + iQ;
        int iQ3 = l0Var.Q(f11);
        int iQ4 = l0Var.Q(f13) + iQ3;
        s0 s0VarV = i0Var.v(d3.b.h(-iQ2, -iQ4, j));
        return l0Var.O(d3.b.f(s0VarV.f24408a + iQ2, j), d3.b.e(s0VarV.f24409b + iQ4, j), zj.t.f38318a, new b0(s0VarV, iQ, iQ3));
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
