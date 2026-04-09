package g0;

import g2.s0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t extends i1.m implements i2.u {

    /* renamed from: o, reason: collision with root package name */
    public q f24181o;

    /* renamed from: p, reason: collision with root package name */
    public float f24182p;

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
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!d3.a.d(j) || this.f24181o == q.f24172a) {
            iJ = d3.a.j(j);
            iH = d3.a.h(j);
        } else {
            int iRound = Math.round(d3.a.h(j) * this.f24182p);
            int iJ2 = d3.a.j(j);
            iJ = d3.a.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!d3.a.c(j) || this.f24181o == q.f24173b) {
            int i4 = d3.a.i(j);
            iG = d3.a.g(j);
            iG2 = i4;
        } else {
            int iRound2 = Math.round(d3.a.g(j) * this.f24182p);
            int i10 = d3.a.i(j);
            iG2 = d3.a.g(j);
            if (iRound2 < i10) {
                iRound2 = i10;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        s0 s0VarV = i0Var.v(d3.b.a(iJ, iH, iG2, iG));
        return l0Var.O(s0VarV.f24408a, s0VarV.f24409b, zj.t.f38318a, new s(s0VarV, 0));
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
