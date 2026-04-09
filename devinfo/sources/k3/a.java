package k3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f27812s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f27813t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f27814u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f27815v0;

    @Override // k3.d
    public final boolean A() {
        return this.f27815v0;
    }

    @Override // k3.d
    public final boolean B() {
        return this.f27815v0;
    }

    public final boolean T() {
        int i4;
        int i10;
        int i11;
        boolean z3 = true;
        int i12 = 0;
        while (true) {
            i4 = this.f27922r0;
            if (i12 >= i4) {
                break;
            }
            d dVar = this.f27921q0[i12];
            if ((this.f27813t0 || dVar.c()) && ((((i10 = this.f27812s0) == 0 || i10 == 1) && !dVar.A()) || (((i11 = this.f27812s0) == 2 || i11 == 3) && !dVar.B()))) {
                z3 = false;
            }
            i12++;
        }
        if (!z3 || i4 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z10 = false;
        for (int i13 = 0; i13 < this.f27922r0; i13++) {
            d dVar2 = this.f27921q0[i13];
            if (this.f27813t0 || dVar2.c()) {
                if (!z10) {
                    int i14 = this.f27812s0;
                    if (i14 == 0) {
                        iMax = dVar2.i(2).d();
                    } else if (i14 == 1) {
                        iMax = dVar2.i(4).d();
                    } else if (i14 == 2) {
                        iMax = dVar2.i(3).d();
                    } else if (i14 == 3) {
                        iMax = dVar2.i(5).d();
                    }
                    z10 = true;
                }
                int i15 = this.f27812s0;
                if (i15 == 0) {
                    iMax = Math.min(iMax, dVar2.i(2).d());
                } else if (i15 == 1) {
                    iMax = Math.max(iMax, dVar2.i(4).d());
                } else if (i15 == 2) {
                    iMax = Math.min(iMax, dVar2.i(3).d());
                } else if (i15 == 3) {
                    iMax = Math.max(iMax, dVar2.i(5).d());
                }
            }
        }
        int i16 = iMax + this.f27814u0;
        int i17 = this.f27812s0;
        if (i17 == 0 || i17 == 1) {
            J(i16, i16);
        } else {
            K(i16, i16);
        }
        this.f27815v0 = true;
        return true;
    }

    public final int U() {
        int i4 = this.f27812s0;
        if (i4 == 0 || i4 == 1) {
            return 0;
        }
        return (i4 == 2 || i4 == 3) ? 1 : -1;
    }

    @Override // k3.d
    public final void b(i3.c cVar, boolean z3) {
        boolean z10;
        int i4;
        int i10;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        int i11 = 2;
        c cVar3 = this.J;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f27838i = cVar.k(cVar6);
        }
        int i12 = this.f27812s0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i12];
        if (!this.f27815v0) {
            T();
        }
        if (this.f27815v0) {
            this.f27815v0 = false;
            int i13 = this.f27812s0;
            if (i13 == 0 || i13 == 1) {
                cVar.d(cVar2.f27838i, this.Y);
                cVar.d(cVar4.f27838i, this.Y);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    cVar.d(cVar3.f27838i, this.Z);
                    cVar.d(cVar5.f27838i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i14 = 0; i14 < this.f27922r0; i14++) {
            d dVar = this.f27921q0[i14];
            if ((this.f27813t0 || dVar.c()) && ((((i10 = this.f27812s0) == 0 || i10 == 1) && dVar.f27868p0[0] == 3 && dVar.I.f27836f != null && dVar.K.f27836f != null) || ((i10 == 2 || i10 == 3) && dVar.f27868p0[1] == 3 && dVar.J.f27836f != null && dVar.L.f27836f != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = cVar2.g() || cVar4.g();
        boolean z12 = cVar3.g() || cVar5.g();
        int i15 = !(!z10 && (((i4 = this.f27812s0) == 0 && z11) || ((i4 == 2 && z12) || ((i4 == 1 && z11) || (i4 == 3 && z12))))) ? 4 : 5;
        int i16 = 0;
        while (i16 < this.f27922r0) {
            d dVar2 = this.f27921q0[i16];
            if (this.f27813t0 || dVar2.c()) {
                i3.f fVarK = cVar.k(dVar2.Q[this.f27812s0]);
                c[] cVarArr2 = dVar2.Q;
                int i17 = this.f27812s0;
                c cVar8 = cVarArr2[i17];
                cVar8.f27838i = fVarK;
                c cVar9 = cVar8.f27836f;
                int i18 = (cVar9 == null || cVar9.f27834d != this) ? 0 : cVar8.g;
                if (i17 == 0 || i17 == i11) {
                    i3.f fVar = cVar7.f27838i;
                    int i19 = this.f27814u0 - i18;
                    i3.b bVarL = cVar.l();
                    i3.f fVarM = cVar.m();
                    fVarM.f25856d = 0;
                    bVarL.c(fVar, fVarK, fVarM, i19);
                    cVar.c(bVarL);
                } else {
                    i3.f fVar2 = cVar7.f27838i;
                    int i20 = this.f27814u0 + i18;
                    i3.b bVarL2 = cVar.l();
                    i3.f fVarM2 = cVar.m();
                    fVarM2.f25856d = 0;
                    bVarL2.b(fVar2, fVarK, fVarM2, i20);
                    cVar.c(bVarL2);
                }
                cVar.e(cVar7.f27838i, fVarK, this.f27814u0 + i18, i15);
            }
            i16++;
            i11 = 2;
        }
        int i21 = this.f27812s0;
        if (i21 == 0) {
            cVar.e(cVar4.f27838i, cVar2.f27838i, 0, 8);
            cVar.e(cVar2.f27838i, this.T.K.f27838i, 0, 4);
            cVar.e(cVar2.f27838i, this.T.I.f27838i, 0, 0);
            return;
        }
        if (i21 == 1) {
            cVar.e(cVar2.f27838i, cVar4.f27838i, 0, 8);
            cVar.e(cVar2.f27838i, this.T.I.f27838i, 0, 4);
            cVar.e(cVar2.f27838i, this.T.K.f27838i, 0, 0);
        } else if (i21 == 2) {
            cVar.e(cVar5.f27838i, cVar3.f27838i, 0, 8);
            cVar.e(cVar3.f27838i, this.T.L.f27838i, 0, 4);
            cVar.e(cVar3.f27838i, this.T.J.f27838i, 0, 0);
        } else if (i21 == 3) {
            cVar.e(cVar3.f27838i, cVar5.f27838i, 0, 8);
            cVar.e(cVar3.f27838i, this.T.J.f27838i, 0, 4);
            cVar.e(cVar3.f27838i, this.T.L.f27838i, 0, 0);
        }
    }

    @Override // k3.d
    public final boolean c() {
        return true;
    }

    @Override // k3.d
    public final String toString() {
        String strW = d.h.w(new StringBuilder("[Barrier] "), this.f27853h0, " {");
        for (int i4 = 0; i4 < this.f27922r0; i4++) {
            d dVar = this.f27921q0[i4];
            if (i4 > 0) {
                strW = d.h.s(strW, ", ");
            }
            StringBuilder sbZ = d.h.z(strW);
            sbZ.append(dVar.f27853h0);
            strW = sbZ.toString();
        }
        return d.h.s(strW, "}");
    }
}
