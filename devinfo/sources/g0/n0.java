package g0;

import g2.s0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n0 extends i1.m implements i2.u {

    /* renamed from: o, reason: collision with root package name */
    public float f24161o;

    /* renamed from: p, reason: collision with root package name */
    public float f24162p;

    @Override // i2.u
    public final int L(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        int iT = i0Var.t(i4);
        int i10 = !Float.isNaN(this.f24161o) ? d.h.i(m0Var, this.f24161o) : 0;
        return iT < i10 ? i10 : iT;
    }

    @Override // i2.u
    public final int S(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        int iN = i0Var.n(i4);
        int i10 = !Float.isNaN(this.f24161o) ? d.h.i(m0Var, this.f24161o) : 0;
        return iN < i10 ? i10 : iN;
    }

    @Override // i2.u
    public final g2.k0 a0(g2.l0 l0Var, g2.i0 i0Var, long j) {
        int iJ;
        int i4;
        if (Float.isNaN(this.f24161o) || d3.a.j(j) != 0) {
            iJ = d3.a.j(j);
        } else {
            int iQ = l0Var.Q(this.f24161o);
            iJ = d3.a.h(j);
            if (iQ < 0) {
                iQ = 0;
            }
            if (iQ <= iJ) {
                iJ = iQ;
            }
        }
        int iH = d3.a.h(j);
        if (Float.isNaN(this.f24162p) || d3.a.i(j) != 0) {
            i4 = d3.a.i(j);
        } else {
            int iQ2 = l0Var.Q(this.f24162p);
            i4 = d3.a.g(j);
            int i10 = iQ2 >= 0 ? iQ2 : 0;
            if (i10 <= i4) {
                i4 = i10;
            }
        }
        s0 s0VarV = i0Var.v(d3.b.a(iJ, iH, i4, d3.a.g(j)));
        return l0Var.O(s0VarV.f24408a, s0VarV.f24409b, zj.t.f38318a, new s(s0VarV, 2));
    }

    @Override // i2.u
    public final int h(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        int iJ = i0Var.J(i4);
        int i10 = !Float.isNaN(this.f24162p) ? d.h.i(m0Var, this.f24162p) : 0;
        return iJ < i10 ? i10 : iJ;
    }

    @Override // i2.u
    public final int t(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        int iD = i0Var.d(i4);
        int i10 = !Float.isNaN(this.f24162p) ? d.h.i(m0Var, this.f24162p) : 0;
        return iD < i10 ? i10 : iD;
    }
}
