package g0;

import g2.s0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k0 extends i1.m implements i2.u {

    /* renamed from: o, reason: collision with root package name */
    public float f24145o;

    /* renamed from: p, reason: collision with root package name */
    public float f24146p;

    /* renamed from: q, reason: collision with root package name */
    public float f24147q;

    /* renamed from: r, reason: collision with root package name */
    public float f24148r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24149s;

    @Override // i2.u
    public final int L(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        long jP0 = p0(m0Var);
        if (d3.a.f(jP0)) {
            return d3.a.h(jP0);
        }
        if (!this.f24149s) {
            i4 = d3.b.e(i4, jP0);
        }
        return d3.b.f(i0Var.t(i4), jP0);
    }

    @Override // i2.u
    public final int S(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        long jP0 = p0(m0Var);
        if (d3.a.f(jP0)) {
            return d3.a.h(jP0);
        }
        if (!this.f24149s) {
            i4 = d3.b.e(i4, jP0);
        }
        return d3.b.f(i0Var.n(i4), jP0);
    }

    @Override // i2.u
    public final g2.k0 a0(g2.l0 l0Var, g2.i0 i0Var, long j) {
        int iJ;
        int iH;
        int i4;
        int iG;
        long jA;
        long jP0 = p0(l0Var);
        if (this.f24149s) {
            int iJ2 = d3.a.j(j);
            int iH2 = d3.a.h(j);
            int i10 = d3.a.i(j);
            int iG2 = d3.a.g(j);
            int iJ3 = d3.a.j(jP0);
            if (iJ3 < iJ2) {
                iJ3 = iJ2;
            }
            if (iJ3 > iH2) {
                iJ3 = iH2;
            }
            int iH3 = d3.a.h(jP0);
            if (iH3 >= iJ2) {
                iJ2 = iH3;
            }
            if (iJ2 <= iH2) {
                iH2 = iJ2;
            }
            int i11 = d3.a.i(jP0);
            if (i11 < i10) {
                i11 = i10;
            }
            if (i11 > iG2) {
                i11 = iG2;
            }
            int iG3 = d3.a.g(jP0);
            if (iG3 >= i10) {
                i10 = iG3;
            }
            if (i10 <= iG2) {
                iG2 = i10;
            }
            jA = d3.b.a(iJ3, iH2, i11, iG2);
        } else {
            if (Float.isNaN(this.f24145o)) {
                iJ = d3.a.j(j);
                int iH4 = d3.a.h(jP0);
                if (iJ > iH4) {
                    iJ = iH4;
                }
            } else {
                iJ = d3.a.j(jP0);
            }
            if (Float.isNaN(this.f24147q)) {
                iH = d3.a.h(j);
                int iJ4 = d3.a.j(jP0);
                if (iH < iJ4) {
                    iH = iJ4;
                }
            } else {
                iH = d3.a.h(jP0);
            }
            if (Float.isNaN(this.f24146p)) {
                i4 = d3.a.i(j);
                int iG4 = d3.a.g(jP0);
                if (i4 > iG4) {
                    i4 = iG4;
                }
            } else {
                i4 = d3.a.i(jP0);
            }
            if (Float.isNaN(this.f24148r)) {
                iG = d3.a.g(j);
                int i12 = d3.a.i(jP0);
                if (iG < i12) {
                    iG = i12;
                }
            } else {
                iG = d3.a.g(jP0);
            }
            jA = d3.b.a(iJ, iH, i4, iG);
        }
        s0 s0VarV = i0Var.v(jA);
        return l0Var.O(s0VarV.f24408a, s0VarV.f24409b, zj.t.f38318a, new s(s0VarV, 1));
    }

    @Override // i2.u
    public final int h(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        long jP0 = p0(m0Var);
        if (d3.a.e(jP0)) {
            return d3.a.g(jP0);
        }
        if (!this.f24149s) {
            i4 = d3.b.f(i4, jP0);
        }
        return d3.b.e(i0Var.J(i4), jP0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long p0(g2.l0 r7) {
        /*
            r6 = this;
            float r0 = r6.f24147q
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f24147q
            int r0 = r7.Q(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f24148r
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f24148r
            int r3 = r7.Q(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f24145o
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f24145o
            int r4 = r7.Q(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f24146p
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f24146p
            int r7 = r7.Q(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = d3.b.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k0.p0(g2.l0):long");
    }

    @Override // i2.u
    public final int t(i2.m0 m0Var, g2.i0 i0Var, int i4) {
        long jP0 = p0(m0Var);
        if (d3.a.e(jP0)) {
            return d3.a.g(jP0);
        }
        if (!this.f24149s) {
            i4 = d3.b.f(i4, jP0);
        }
        return d3.b.e(i0Var.d(i4), jP0);
    }
}
