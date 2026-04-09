package k3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f27889a;

    /* renamed from: d, reason: collision with root package name */
    public c f27892d;

    /* renamed from: e, reason: collision with root package name */
    public c f27893e;

    /* renamed from: f, reason: collision with root package name */
    public c f27894f;
    public c g;

    /* renamed from: h, reason: collision with root package name */
    public int f27895h;

    /* renamed from: i, reason: collision with root package name */
    public int f27896i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f27897k;

    /* renamed from: q, reason: collision with root package name */
    public int f27903q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f27904r;

    /* renamed from: b, reason: collision with root package name */
    public d f27890b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f27891c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f27898l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f27899m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f27900n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f27901o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f27902p = 0;

    public f(g gVar, int i4, c cVar, c cVar2, c cVar3, c cVar4, int i10) {
        this.f27904r = gVar;
        this.f27889a = i4;
        this.f27892d = cVar;
        this.f27893e = cVar2;
        this.f27894f = cVar3;
        this.g = cVar4;
        this.f27895h = gVar.f27911w0;
        this.f27896i = gVar.f27907s0;
        this.j = gVar.f27912x0;
        this.f27897k = gVar.f27908t0;
        this.f27903q = i10;
    }

    public final void a(d dVar) {
        int i4 = this.f27889a;
        g gVar = this.f27904r;
        if (i4 == 0) {
            int iU = gVar.U(dVar, this.f27903q);
            if (dVar.f27868p0[0] == 3) {
                this.f27902p++;
                iU = 0;
            }
            this.f27898l = iU + (dVar.f27851g0 != 8 ? gVar.P0 : 0) + this.f27898l;
            int iT = gVar.T(dVar, this.f27903q);
            if (this.f27890b == null || this.f27891c < iT) {
                this.f27890b = dVar;
                this.f27891c = iT;
                this.f27899m = iT;
            }
        } else {
            int iU2 = gVar.U(dVar, this.f27903q);
            int iT2 = gVar.T(dVar, this.f27903q);
            if (dVar.f27868p0[1] == 3) {
                this.f27902p++;
                iT2 = 0;
            }
            this.f27899m = iT2 + (dVar.f27851g0 != 8 ? gVar.Q0 : 0) + this.f27899m;
            if (this.f27890b == null || this.f27891c < iU2) {
                this.f27890b = dVar;
                this.f27891c = iU2;
                this.f27898l = iU2;
            }
        }
        this.f27901o++;
    }

    public final void b(int i4, boolean z3, boolean z10) {
        g gVar;
        int i10;
        int i11;
        d dVar;
        boolean z11;
        int i12;
        int i13;
        char c9;
        float f10;
        float f11;
        float f12;
        int i14;
        float f13;
        float f14;
        int i15;
        int i16 = this.f27901o;
        int i17 = 0;
        while (true) {
            gVar = this.f27904r;
            if (i17 >= i16 || (i15 = this.f27900n + i17) >= gVar.f27906b1) {
                break;
            }
            d dVar2 = gVar.f27905a1[i15];
            if (dVar2 != null) {
                dVar2.D();
            }
            i17++;
        }
        if (i16 == 0 || this.f27890b == null) {
            return;
        }
        boolean z12 = z10 && i4 == 0;
        int i18 = -1;
        int i19 = -1;
        for (int i20 = 0; i20 < i16; i20++) {
            int i21 = this.f27900n + (z3 ? (i16 - 1) - i20 : i20);
            if (i21 >= gVar.f27906b1) {
                break;
            }
            d dVar3 = gVar.f27905a1[i21];
            if (dVar3 != null && dVar3.f27851g0 == 0) {
                if (i18 == -1) {
                    i18 = i20;
                }
                i19 = i20;
            }
        }
        if (this.f27889a == 0) {
            d dVar4 = this.f27890b;
            dVar4.f27856j0 = gVar.E0;
            c cVar = dVar4.L;
            c cVar2 = dVar4.J;
            int i22 = this.f27896i;
            if (i4 > 0) {
                i22 += gVar.Q0;
            }
            cVar2.a(this.f27893e, i22);
            if (z10) {
                cVar.a(this.g, this.f27897k);
            }
            if (i4 > 0) {
                this.f27893e.f27834d.L.a(cVar2, 0);
            }
            if (gVar.S0 != 3 || dVar4.E) {
                dVar = dVar4;
            } else {
                for (int i23 = 0; i23 < i16; i23++) {
                    int i24 = this.f27900n + (z3 ? (i16 - 1) - i23 : i23);
                    if (i24 >= gVar.f27906b1) {
                        break;
                    }
                    dVar = gVar.f27905a1[i24];
                    if (dVar.E) {
                        break;
                    }
                }
                dVar = dVar4;
            }
            int i25 = 0;
            d dVar5 = null;
            while (i25 < i16) {
                int i26 = z3 ? (i16 - 1) - i25 : i25;
                int i27 = this.f27900n + i26;
                if (i27 >= gVar.f27906b1) {
                    return;
                }
                d dVar6 = gVar.f27905a1[i27];
                if (dVar6 == null) {
                    i13 = i16;
                    z11 = z12;
                    i12 = i19;
                    c9 = 3;
                } else {
                    c cVar3 = dVar6.L;
                    c cVar4 = dVar6.J;
                    c cVar5 = dVar6.I;
                    z11 = z12;
                    if (i25 == 0) {
                        i12 = i19;
                        dVar6.f(cVar5, this.f27892d, this.f27895h);
                    } else {
                        i12 = i19;
                    }
                    if (i26 == 0) {
                        int i28 = gVar.D0;
                        if (z3) {
                            f10 = 1.0f;
                            f11 = 1.0f - gVar.J0;
                        } else {
                            f10 = 1.0f;
                            f11 = gVar.J0;
                        }
                        if (this.f27900n == 0) {
                            i14 = gVar.F0;
                            f12 = f11;
                            if (i14 != -1) {
                                if (z3) {
                                    f14 = gVar.L0;
                                    f13 = f10 - f14;
                                    dVar6.f27855i0 = i14;
                                    dVar6.f27846d0 = f13;
                                } else {
                                    f13 = gVar.L0;
                                    dVar6.f27855i0 = i14;
                                    dVar6.f27846d0 = f13;
                                }
                            }
                        } else {
                            f12 = f11;
                        }
                        if (!z10 || (i14 = gVar.H0) == -1) {
                            i14 = i28;
                            f13 = f12;
                        } else if (z3) {
                            f14 = gVar.N0;
                            f13 = f10 - f14;
                        } else {
                            f13 = gVar.N0;
                        }
                        dVar6.f27855i0 = i14;
                        dVar6.f27846d0 = f13;
                    }
                    if (i25 == i16 - 1) {
                        i13 = i16;
                        dVar6.f(dVar6.K, this.f27894f, this.j);
                    } else {
                        i13 = i16;
                    }
                    if (dVar5 != null) {
                        c cVar6 = dVar5.K;
                        cVar5.a(cVar6, gVar.P0);
                        if (i25 == i18) {
                            int i29 = this.f27895h;
                            if (cVar5.h()) {
                                cVar5.f27837h = i29;
                            }
                        }
                        cVar6.a(cVar5, 0);
                        if (i25 == i12 + 1) {
                            int i30 = this.j;
                            if (cVar6.h()) {
                                cVar6.f27837h = i30;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        int i31 = gVar.S0;
                        c9 = 3;
                        if (i31 == 3 && dVar.E && dVar6 != dVar && dVar6.E) {
                            dVar6.M.a(dVar.M, 0);
                        } else if (i31 == 0) {
                            cVar4.a(cVar2, 0);
                        } else if (i31 == 1) {
                            cVar3.a(cVar, 0);
                        } else if (z11) {
                            cVar4.a(this.f27893e, this.f27896i);
                            cVar3.a(this.g, this.f27897k);
                        } else {
                            cVar4.a(cVar2, 0);
                            cVar3.a(cVar, 0);
                        }
                    } else {
                        c9 = 3;
                    }
                    dVar5 = dVar6;
                }
                i25++;
                z12 = z11;
                i19 = i12;
                i16 = i13;
            }
            return;
        }
        int i32 = i16;
        boolean z13 = z12;
        int i33 = i19;
        d dVar7 = this.f27890b;
        dVar7.f27855i0 = gVar.D0;
        c cVar7 = dVar7.I;
        c cVar8 = dVar7.K;
        int i34 = this.f27895h;
        if (i4 > 0) {
            i34 += gVar.P0;
        }
        if (z3) {
            cVar8.a(this.f27894f, i34);
            if (z10) {
                cVar7.a(this.f27892d, this.j);
            }
            if (i4 > 0) {
                this.f27894f.f27834d.I.a(cVar8, 0);
            }
        } else {
            cVar7.a(this.f27892d, i34);
            if (z10) {
                cVar8.a(this.f27894f, this.j);
            }
            if (i4 > 0) {
                this.f27892d.f27834d.K.a(cVar7, 0);
            }
        }
        int i35 = 0;
        d dVar8 = null;
        while (true) {
            int i36 = i32;
            if (i35 >= i36 || (i10 = this.f27900n + i35) >= gVar.f27906b1) {
                return;
            }
            d dVar9 = gVar.f27905a1[i10];
            if (dVar9 == null) {
                i32 = i36;
            } else {
                c cVar9 = dVar9.J;
                c cVar10 = dVar9.K;
                c cVar11 = dVar9.I;
                if (i35 == 0) {
                    dVar9.f(cVar9, this.f27893e, this.f27896i);
                    int i37 = gVar.E0;
                    float f15 = gVar.K0;
                    if (this.f27900n == 0) {
                        int i38 = gVar.G0;
                        i32 = i36;
                        i11 = -1;
                        if (i38 != -1) {
                            f15 = gVar.M0;
                        }
                        i37 = i38;
                        dVar9.f27856j0 = i37;
                        dVar9.f27848e0 = f15;
                    } else {
                        i32 = i36;
                        i11 = -1;
                    }
                    if (z10 && (i38 = gVar.I0) != i11) {
                        f15 = gVar.O0;
                        i37 = i38;
                    }
                    dVar9.f27856j0 = i37;
                    dVar9.f27848e0 = f15;
                } else {
                    i32 = i36;
                }
                if (i35 == i32 - 1) {
                    dVar9.f(dVar9.L, this.g, this.f27897k);
                }
                if (dVar8 != null) {
                    c cVar12 = dVar8.L;
                    cVar9.a(cVar12, gVar.Q0);
                    if (i35 == i18) {
                        int i39 = this.f27896i;
                        if (cVar9.h()) {
                            cVar9.f27837h = i39;
                        }
                    }
                    cVar12.a(cVar9, 0);
                    if (i35 == i33 + 1) {
                        int i40 = this.f27897k;
                        if (cVar12.h()) {
                            cVar12.f27837h = i40;
                        }
                    }
                }
                if (dVar9 == dVar7) {
                    dVar8 = dVar9;
                } else if (z3) {
                    int i41 = gVar.R0;
                    if (i41 == 0) {
                        cVar10.a(cVar8, 0);
                    } else if (i41 == 1) {
                        cVar11.a(cVar7, 0);
                    } else if (i41 == 2) {
                        cVar11.a(cVar7, 0);
                        cVar10.a(cVar8, 0);
                    }
                    dVar8 = dVar9;
                } else {
                    int i42 = gVar.R0;
                    if (i42 == 0) {
                        cVar11.a(cVar7, 0);
                    } else if (i42 == 1) {
                        cVar10.a(cVar8, 0);
                    } else if (i42 == 2) {
                        if (z13) {
                            cVar11.a(this.f27892d, this.f27895h);
                            cVar10.a(this.f27894f, this.j);
                        } else {
                            cVar11.a(cVar7, 0);
                            cVar10.a(cVar8, 0);
                        }
                    }
                    dVar8 = dVar9;
                }
            }
            i35++;
        }
    }

    public final int c() {
        return this.f27889a == 1 ? this.f27899m - this.f27904r.Q0 : this.f27899m;
    }

    public final int d() {
        return this.f27889a == 0 ? this.f27898l - this.f27904r.P0 : this.f27898l;
    }

    public final void e(int i4) {
        g gVar;
        int i10;
        int i11 = this.f27902p;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f27901o;
        int i13 = i4 / i11;
        int i14 = 0;
        while (true) {
            gVar = this.f27904r;
            if (i14 >= i12 || (i10 = this.f27900n + i14) >= gVar.f27906b1) {
                break;
            }
            d dVar = gVar.f27905a1[i10];
            if (this.f27889a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f27868p0;
                    if (iArr[0] == 3 && dVar.f27870r == 0) {
                        gVar.V(1, i13, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f27868p0;
                if (iArr2[1] == 3 && dVar.f27871s == 0) {
                    int i15 = i13;
                    gVar.V(iArr2[0], dVar.q(), 1, i15, dVar);
                    i13 = i15;
                }
            }
            i14++;
        }
        this.f27898l = 0;
        this.f27899m = 0;
        this.f27890b = null;
        this.f27891c = 0;
        int i16 = this.f27901o;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f27900n + i17;
            if (i18 >= gVar.f27906b1) {
                return;
            }
            d dVar2 = gVar.f27905a1[i18];
            if (this.f27889a == 0) {
                int iQ = dVar2.q();
                int i19 = gVar.P0;
                if (dVar2.f27851g0 == 8) {
                    i19 = 0;
                }
                this.f27898l = iQ + i19 + this.f27898l;
                int iT = gVar.T(dVar2, this.f27903q);
                if (this.f27890b == null || this.f27891c < iT) {
                    this.f27890b = dVar2;
                    this.f27891c = iT;
                    this.f27899m = iT;
                }
            } else {
                int iU = gVar.U(dVar2, this.f27903q);
                int iT2 = gVar.T(dVar2, this.f27903q);
                int i20 = gVar.Q0;
                if (dVar2.f27851g0 == 8) {
                    i20 = 0;
                }
                this.f27899m = iT2 + i20 + this.f27899m;
                if (this.f27890b == null || this.f27891c < iU) {
                    this.f27890b = dVar2;
                    this.f27891c = iU;
                    this.f27898l = iU;
                }
            }
        }
    }

    public final void f(int i4, c cVar, c cVar2, c cVar3, c cVar4, int i10, int i11, int i12, int i13, int i14) {
        this.f27889a = i4;
        this.f27892d = cVar;
        this.f27893e = cVar2;
        this.f27894f = cVar3;
        this.g = cVar4;
        this.f27895h = i10;
        this.f27896i = i11;
        this.j = i12;
        this.f27897k = i13;
        this.f27903q = i14;
    }
}
