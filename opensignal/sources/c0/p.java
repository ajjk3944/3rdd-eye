package c0;

import x1.l0;
import x1.m0;

/* loaded from: classes.dex */
public final class p extends z0.l implements x1.v {

    /* renamed from: p, reason: collision with root package name */
    public n f3097p;

    /* renamed from: q, reason: collision with root package name */
    public float f3098q;

    @Override // x1.v
    public final l0 K(m0 m0Var, v1.q qVar, long j) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!t2.a.d(j) || this.f3097p == n.Vertical) {
            iJ = t2.a.j(j);
            iH = t2.a.h(j);
        } else {
            int iRound = Math.round(t2.a.h(j) * this.f3098q);
            int iJ2 = t2.a.j(j);
            iJ = t2.a.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!t2.a.c(j) || this.f3097p == n.Horizontal) {
            int i10 = t2.a.i(j);
            iG = t2.a.g(j);
            iG2 = i10;
        } else {
            int iRound2 = Math.round(t2.a.g(j) * this.f3098q);
            int i11 = t2.a.i(j);
            iG2 = t2.a.g(j);
            if (iRound2 < i11) {
                iRound2 = i11;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        v1.v vVarS = qVar.s(t2.b.a(iJ, iH, iG2, iG));
        return m0Var.g0(vVarS.f23809b, vVarS.f23810c, mq.x.f16946a, new o(vVarS, 0));
    }
}
