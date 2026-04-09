package c0;

import x1.l0;
import x1.m0;

/* loaded from: classes.dex */
public final class t extends z0.l implements x1.v {

    /* renamed from: p, reason: collision with root package name */
    public float f3104p;

    /* renamed from: q, reason: collision with root package name */
    public float f3105q;

    /* renamed from: r, reason: collision with root package name */
    public float f3106r;

    /* renamed from: s, reason: collision with root package name */
    public float f3107s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3108t;

    @Override // x1.v
    public final l0 K(m0 m0Var, v1.q qVar, long j) {
        int iG = m0Var.G(this.f3106r) + m0Var.G(this.f3104p);
        int iG2 = m0Var.G(this.f3107s) + m0Var.G(this.f3105q);
        int i10 = -iG;
        int i11 = -iG2;
        int iJ = t2.a.j(j) + i10;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = t2.a.h(j);
        if (iH != Integer.MAX_VALUE && (iH = iH + i10) < 0) {
            iH = 0;
        }
        int i12 = t2.a.i(j) + i11;
        if (i12 < 0) {
            i12 = 0;
        }
        int iG3 = t2.a.g(j);
        v1.v vVarS = qVar.s(t2.b.a(iJ, iH, i12, (iG3 == Integer.MAX_VALUE || (iG3 = iG3 + i11) >= 0) ? iG3 : 0));
        return m0Var.g0(t2.b.f(vVarS.f23809b + iG, j), t2.b.e(vVarS.f23810c + iG2, j), mq.x.f16946a, new s(this, 0, vVarS));
    }
}
