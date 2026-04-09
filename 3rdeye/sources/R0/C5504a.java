package r0;

import N7.G8;
import r0.C5507d;
import r0.C5508e;

/* compiled from: Barrier.java */
/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5504a extends C5512i {

    /* renamed from: t0, reason: collision with root package name */
    public int f45486t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f45487u0 = true;

    /* renamed from: v0, reason: collision with root package name */
    public int f45488v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f45489w0 = false;

    @Override // r0.C5508e
    public final boolean A() {
        return this.f45489w0;
    }

    @Override // r0.C5508e
    public final boolean B() {
        return this.f45489w0;
    }

    public final boolean T() {
        int i;
        int i10;
        int i11;
        boolean z10 = true;
        int i12 = 0;
        while (true) {
            i = this.f45654s0;
            if (i12 >= i) {
                break;
            }
            C5508e c5508e = this.f45653r0[i12];
            if ((this.f45487u0 || c5508e.c()) && ((((i10 = this.f45486t0) == 0 || i10 == 1) && !c5508e.A()) || (((i11 = this.f45486t0) == 2 || i11 == 3) && !c5508e.B()))) {
                z10 = false;
            }
            i12++;
        }
        if (!z10 || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i13 = 0; i13 < this.f45654s0; i13++) {
            C5508e c5508e2 = this.f45653r0[i13];
            if (this.f45487u0 || c5508e2.c()) {
                if (!z11) {
                    int i14 = this.f45486t0;
                    if (i14 == 0) {
                        iMax = c5508e2.i(C5507d.b.LEFT).d();
                    } else if (i14 == 1) {
                        iMax = c5508e2.i(C5507d.b.RIGHT).d();
                    } else if (i14 == 2) {
                        iMax = c5508e2.i(C5507d.b.TOP).d();
                    } else if (i14 == 3) {
                        iMax = c5508e2.i(C5507d.b.BOTTOM).d();
                    }
                    z11 = true;
                }
                int i15 = this.f45486t0;
                if (i15 == 0) {
                    iMax = Math.min(iMax, c5508e2.i(C5507d.b.LEFT).d());
                } else if (i15 == 1) {
                    iMax = Math.max(iMax, c5508e2.i(C5507d.b.RIGHT).d());
                } else if (i15 == 2) {
                    iMax = Math.min(iMax, c5508e2.i(C5507d.b.TOP).d());
                } else if (i15 == 3) {
                    iMax = Math.max(iMax, c5508e2.i(C5507d.b.BOTTOM).d());
                }
            }
        }
        int i16 = iMax + this.f45488v0;
        int i17 = this.f45486t0;
        if (i17 == 0 || i17 == 1) {
            J(i16, i16);
        } else {
            K(i16, i16);
        }
        this.f45489w0 = true;
        return true;
    }

    public final int U() {
        int i = this.f45486t0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // r0.C5508e
    public final void b(p0.c cVar, boolean z10) {
        boolean z11;
        int i;
        int i10;
        C5507d[] c5507dArr = this.f45532R;
        C5507d c5507d = this.f45524J;
        c5507dArr[0] = c5507d;
        C5507d c5507d2 = this.f45525K;
        int i11 = 2;
        c5507dArr[2] = c5507d2;
        C5507d c5507d3 = this.f45526L;
        c5507dArr[1] = c5507d3;
        C5507d c5507d4 = this.f45527M;
        c5507dArr[3] = c5507d4;
        for (C5507d c5507d5 : c5507dArr) {
            c5507d5.i = cVar.k(c5507d5);
        }
        int i12 = this.f45486t0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        C5507d c5507d6 = c5507dArr[i12];
        if (!this.f45489w0) {
            T();
        }
        if (this.f45489w0) {
            this.f45489w0 = false;
            int i13 = this.f45486t0;
            if (i13 == 0 || i13 == 1) {
                cVar.d(c5507d.i, this.f45542a0);
                cVar.d(c5507d3.i, this.f45542a0);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    cVar.d(c5507d2.i, this.f45544b0);
                    cVar.d(c5507d4.i, this.f45544b0);
                    return;
                }
                return;
            }
        }
        for (int i14 = 0; i14 < this.f45654s0; i14++) {
            C5508e c5508e = this.f45653r0[i14];
            if ((this.f45487u0 || c5508e.c()) && ((((i10 = this.f45486t0) == 0 || i10 == 1) && c5508e.f45535U[0] == C5508e.b.MATCH_CONSTRAINT && c5508e.f45524J.f45511f != null && c5508e.f45526L.f45511f != null) || ((i10 == 2 || i10 == 3) && c5508e.f45535U[1] == C5508e.b.MATCH_CONSTRAINT && c5508e.f45525K.f45511f != null && c5508e.f45527M.f45511f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = c5507d.g() || c5507d3.g();
        boolean z13 = c5507d2.g() || c5507d4.g();
        int i15 = (z11 || !(((i = this.f45486t0) == 0 && z12) || ((i == 2 && z13) || ((i == 1 && z12) || (i == 3 && z13))))) ? 4 : 5;
        int i16 = 0;
        while (i16 < this.f45654s0) {
            C5508e c5508e2 = this.f45653r0[i16];
            if (this.f45487u0 || c5508e2.c()) {
                p0.e eVarK = cVar.k(c5508e2.f45532R[this.f45486t0]);
                int i17 = this.f45486t0;
                C5507d c5507d7 = c5508e2.f45532R[i17];
                c5507d7.i = eVarK;
                C5507d c5507d8 = c5507d7.f45511f;
                int i18 = (c5507d8 == null || c5507d8.f45509d != this) ? 0 : c5507d7.f45512g;
                if (i17 == 0 || i17 == i11) {
                    p0.e eVar = c5507d6.i;
                    int i19 = this.f45488v0 - i18;
                    p0.b bVarL = cVar.l();
                    p0.e eVarM = cVar.m();
                    eVarM.f45004e = 0;
                    bVarL.d(eVar, eVarK, eVarM, i19);
                    cVar.c(bVarL);
                } else {
                    p0.e eVar2 = c5507d6.i;
                    int i20 = this.f45488v0 + i18;
                    p0.b bVarL2 = cVar.l();
                    p0.e eVarM2 = cVar.m();
                    eVarM2.f45004e = 0;
                    bVarL2.c(eVar2, eVarK, eVarM2, i20);
                    cVar.c(bVarL2);
                }
                cVar.e(c5507d6.i, eVarK, this.f45488v0 + i18, i15);
            }
            i16++;
            i11 = 2;
        }
        int i21 = this.f45486t0;
        if (i21 == 0) {
            cVar.e(c5507d3.i, c5507d.i, 0, 8);
            cVar.e(c5507d.i, this.f45536V.f45526L.i, 0, 4);
            cVar.e(c5507d.i, this.f45536V.f45524J.i, 0, 0);
            return;
        }
        if (i21 == 1) {
            cVar.e(c5507d.i, c5507d3.i, 0, 8);
            cVar.e(c5507d.i, this.f45536V.f45524J.i, 0, 4);
            cVar.e(c5507d.i, this.f45536V.f45526L.i, 0, 0);
        } else if (i21 == 2) {
            cVar.e(c5507d4.i, c5507d2.i, 0, 8);
            cVar.e(c5507d2.i, this.f45536V.f45527M.i, 0, 4);
            cVar.e(c5507d2.i, this.f45536V.f45525K.i, 0, 0);
        } else if (i21 == 3) {
            cVar.e(c5507d2.i, c5507d4.i, 0, 8);
            cVar.e(c5507d2.i, this.f45536V.f45525K.i, 0, 4);
            cVar.e(c5507d2.i, this.f45536V.f45527M.i, 0, 0);
        }
    }

    @Override // r0.C5508e
    public final boolean c() {
        return true;
    }

    @Override // r0.C5508e
    public final String toString() {
        String strC = B4.f.c(new StringBuilder("[Barrier] "), this.f45559j0, " {");
        for (int i = 0; i < this.f45654s0; i++) {
            C5508e c5508e = this.f45653r0[i];
            if (i > 0) {
                strC = G8.s(strC, ", ");
            }
            StringBuilder sbU = G8.u(strC);
            sbU.append(c5508e.f45559j0);
            strC = sbU.toString();
        }
        return G8.s(strC, "}");
    }
}
