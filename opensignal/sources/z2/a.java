package z2;

/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: s0, reason: collision with root package name */
    public int f26507s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f26508t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f26509u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f26510v0;

    @Override // z2.g
    public final boolean A() {
        return this.f26510v0;
    }

    @Override // z2.g
    public final boolean B() {
        return this.f26510v0;
    }

    public final boolean T() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f26620r0;
            if (i13 >= i10) {
                break;
            }
            g gVar = this.f26619q0[i13];
            if ((this.f26508t0 || gVar.c()) && ((((i11 = this.f26507s0) == 0 || i11 == 1) && !gVar.A()) || (((i12 = this.f26507s0) == 2 || i12 == 3) && !gVar.B()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f26620r0; i14++) {
            g gVar2 = this.f26619q0[i14];
            if (this.f26508t0 || gVar2.c()) {
                if (!z11) {
                    int i15 = this.f26507s0;
                    if (i15 == 0) {
                        iMax = gVar2.i(c.LEFT).d();
                    } else if (i15 == 1) {
                        iMax = gVar2.i(c.RIGHT).d();
                    } else if (i15 == 2) {
                        iMax = gVar2.i(c.TOP).d();
                    } else if (i15 == 3) {
                        iMax = gVar2.i(c.BOTTOM).d();
                    }
                    z11 = true;
                }
                int i16 = this.f26507s0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, gVar2.i(c.LEFT).d());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, gVar2.i(c.RIGHT).d());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, gVar2.i(c.TOP).d());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, gVar2.i(c.BOTTOM).d());
                }
            }
        }
        int i17 = iMax + this.f26509u0;
        int i18 = this.f26507s0;
        if (i18 == 0 || i18 == 1) {
            J(i17, i17);
        } else {
            K(i17, i17);
        }
        this.f26510v0 = true;
        return true;
    }

    public final int U() {
        int i10 = this.f26507s0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // z2.g
    public final void b(x2.c cVar, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        d[] dVarArr = this.Q;
        d dVar = this.I;
        dVarArr[0] = dVar;
        int i12 = 2;
        d dVar2 = this.J;
        dVarArr[2] = dVar2;
        d dVar3 = this.K;
        dVarArr[1] = dVar3;
        d dVar4 = this.L;
        dVarArr[3] = dVar4;
        for (d dVar5 : dVarArr) {
            dVar5.f26534i = cVar.k(dVar5);
        }
        int i13 = this.f26507s0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        d dVar6 = dVarArr[i13];
        if (!this.f26510v0) {
            T();
        }
        if (this.f26510v0) {
            this.f26510v0 = false;
            int i14 = this.f26507s0;
            if (i14 == 0 || i14 == 1) {
                cVar.d(dVar.f26534i, this.Z);
                cVar.d(dVar3.f26534i, this.Z);
                return;
            } else {
                if (i14 == 2 || i14 == 3) {
                    cVar.d(dVar2.f26534i, this.f26537a0);
                    cVar.d(dVar4.f26534i, this.f26537a0);
                    return;
                }
                return;
            }
        }
        for (int i15 = 0; i15 < this.f26620r0; i15++) {
            g gVar = this.f26619q0[i15];
            if ((this.f26508t0 || gVar.c()) && ((((i11 = this.f26507s0) == 0 || i11 == 1) && gVar.T[0] == f.MATCH_CONSTRAINT && gVar.I.f26531f != null && gVar.K.f26531f != null) || ((i11 == 2 || i11 == 3) && gVar.T[1] == f.MATCH_CONSTRAINT && gVar.J.f26531f != null && gVar.L.f26531f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = dVar.g() || dVar3.g();
        boolean z13 = dVar2.g() || dVar4.g();
        int i16 = !(!z11 && (((i10 = this.f26507s0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        int i17 = 0;
        while (i17 < this.f26620r0) {
            g gVar2 = this.f26619q0[i17];
            if (this.f26508t0 || gVar2.c()) {
                x2.f fVarK = cVar.k(gVar2.Q[this.f26507s0]);
                d[] dVarArr2 = gVar2.Q;
                int i18 = this.f26507s0;
                d dVar7 = dVarArr2[i18];
                dVar7.f26534i = fVarK;
                d dVar8 = dVar7.f26531f;
                int i19 = (dVar8 == null || dVar8.f26529d != this) ? 0 : dVar7.f26532g;
                if (i18 == 0 || i18 == i12) {
                    x2.f fVar = dVar6.f26534i;
                    int i20 = this.f26509u0 - i19;
                    x2.b bVarL = cVar.l();
                    x2.f fVarM = cVar.m();
                    fVarM.f25014r = 0;
                    bVarL.c(fVar, fVarK, fVarM, i20);
                    cVar.c(bVarL);
                } else {
                    x2.f fVar2 = dVar6.f26534i;
                    int i21 = this.f26509u0 + i19;
                    x2.b bVarL2 = cVar.l();
                    x2.f fVarM2 = cVar.m();
                    fVarM2.f25014r = 0;
                    bVarL2.b(fVar2, fVarK, fVarM2, i21);
                    cVar.c(bVarL2);
                }
                cVar.e(dVar6.f26534i, fVarK, this.f26509u0 + i19, i16);
            }
            i17++;
            i12 = 2;
        }
        int i22 = this.f26507s0;
        if (i22 == 0) {
            cVar.e(dVar3.f26534i, dVar.f26534i, 0, 8);
            cVar.e(dVar.f26534i, this.U.K.f26534i, 0, 4);
            cVar.e(dVar.f26534i, this.U.I.f26534i, 0, 0);
            return;
        }
        if (i22 == 1) {
            cVar.e(dVar.f26534i, dVar3.f26534i, 0, 8);
            cVar.e(dVar.f26534i, this.U.I.f26534i, 0, 4);
            cVar.e(dVar.f26534i, this.U.K.f26534i, 0, 0);
        } else if (i22 == 2) {
            cVar.e(dVar4.f26534i, dVar2.f26534i, 0, 8);
            cVar.e(dVar2.f26534i, this.U.L.f26534i, 0, 4);
            cVar.e(dVar2.f26534i, this.U.J.f26534i, 0, 0);
        } else if (i22 == 3) {
            cVar.e(dVar2.f26534i, dVar4.f26534i, 0, 8);
            cVar.e(dVar2.f26534i, this.U.J.f26534i, 0, 4);
            cVar.e(dVar2.f26534i, this.U.L.f26534i, 0, 0);
        }
    }

    @Override // z2.g
    public final boolean c() {
        return true;
    }

    @Override // z2.g
    public final String toString() {
        String strJ = w.g.j(new StringBuilder("[Barrier] "), this.f26553i0, " {");
        for (int i10 = 0; i10 < this.f26620r0; i10++) {
            g gVar = this.f26619q0[i10];
            if (i10 > 0) {
                strJ = w.g.f(strJ, ", ");
            }
            StringBuilder sbT = c7.a.t(strJ);
            sbT.append(gVar.f26553i0);
            strJ = sbT.toString();
        }
        return w.g.f(strJ, "}");
    }
}
