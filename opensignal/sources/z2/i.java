package z2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f26586a;

    /* renamed from: d, reason: collision with root package name */
    public d f26589d;

    /* renamed from: e, reason: collision with root package name */
    public d f26590e;

    /* renamed from: f, reason: collision with root package name */
    public d f26591f;

    /* renamed from: g, reason: collision with root package name */
    public d f26592g;

    /* renamed from: h, reason: collision with root package name */
    public int f26593h;

    /* renamed from: i, reason: collision with root package name */
    public int f26594i;
    public int j;
    public int k;

    /* renamed from: q, reason: collision with root package name */
    public int f26600q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f26601r;

    /* renamed from: b, reason: collision with root package name */
    public g f26587b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f26588c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f26595l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f26596m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f26597n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f26598o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f26599p = 0;

    public i(j jVar, int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
        this.f26601r = jVar;
        this.f26586a = i10;
        this.f26589d = dVar;
        this.f26590e = dVar2;
        this.f26591f = dVar3;
        this.f26592g = dVar4;
        this.f26593h = jVar.f26608w0;
        this.f26594i = jVar.f26604s0;
        this.j = jVar.f26609x0;
        this.k = jVar.f26605t0;
        this.f26600q = i11;
    }

    public final void a(g gVar) {
        int i10 = this.f26586a;
        j jVar = this.f26601r;
        if (i10 == 0) {
            int iU = jVar.U(gVar, this.f26600q);
            if (gVar.T[0] == f.MATCH_CONSTRAINT) {
                this.f26599p++;
                iU = 0;
            }
            this.f26595l = iU + (gVar.f26551h0 != 8 ? jVar.P0 : 0) + this.f26595l;
            int iT = jVar.T(gVar, this.f26600q);
            if (this.f26587b == null || this.f26588c < iT) {
                this.f26587b = gVar;
                this.f26588c = iT;
                this.f26596m = iT;
            }
        } else {
            int iU2 = jVar.U(gVar, this.f26600q);
            int iT2 = jVar.T(gVar, this.f26600q);
            if (gVar.T[1] == f.MATCH_CONSTRAINT) {
                this.f26599p++;
                iT2 = 0;
            }
            this.f26596m = iT2 + (gVar.f26551h0 != 8 ? jVar.Q0 : 0) + this.f26596m;
            if (this.f26587b == null || this.f26588c < iU2) {
                this.f26587b = gVar;
                this.f26588c = iU2;
                this.f26595l = iU2;
            }
        }
        this.f26598o++;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        j jVar;
        int i11;
        int i12;
        g gVar;
        boolean z12;
        int i13;
        int i14;
        char c4;
        float f10;
        float f11;
        float f12;
        int i15;
        float f13;
        float f14;
        int i16;
        int i17 = this.f26598o;
        int i18 = 0;
        while (true) {
            jVar = this.f26601r;
            if (i18 >= i17 || (i16 = this.f26597n + i18) >= jVar.f26603b1) {
                break;
            }
            g gVar2 = jVar.f26602a1[i16];
            if (gVar2 != null) {
                gVar2.D();
            }
            i18++;
        }
        if (i17 == 0 || this.f26587b == null) {
            return;
        }
        boolean z13 = z11 && i10 == 0;
        int i19 = -1;
        int i20 = -1;
        for (int i21 = 0; i21 < i17; i21++) {
            int i22 = this.f26597n + (z10 ? (i17 - 1) - i21 : i21);
            if (i22 >= jVar.f26603b1) {
                break;
            }
            g gVar3 = jVar.f26602a1[i22];
            if (gVar3 != null && gVar3.f26551h0 == 0) {
                if (i19 == -1) {
                    i19 = i21;
                }
                i20 = i21;
            }
        }
        if (this.f26586a == 0) {
            g gVar4 = this.f26587b;
            gVar4.f26555k0 = jVar.E0;
            d dVar = gVar4.L;
            d dVar2 = gVar4.J;
            int i23 = this.f26594i;
            if (i10 > 0) {
                i23 += jVar.Q0;
            }
            dVar2.a(this.f26590e, i23);
            if (z11) {
                dVar.a(this.f26592g, this.k);
            }
            if (i10 > 0) {
                this.f26590e.f26529d.L.a(dVar2, 0);
            }
            if (jVar.S0 != 3 || gVar4.E) {
                gVar = gVar4;
            } else {
                for (int i24 = 0; i24 < i17; i24++) {
                    int i25 = this.f26597n + (z10 ? (i17 - 1) - i24 : i24);
                    if (i25 >= jVar.f26603b1) {
                        break;
                    }
                    gVar = jVar.f26602a1[i25];
                    if (gVar.E) {
                        break;
                    }
                }
                gVar = gVar4;
            }
            int i26 = 0;
            g gVar5 = null;
            while (i26 < i17) {
                int i27 = z10 ? (i17 - 1) - i26 : i26;
                int i28 = this.f26597n + i27;
                if (i28 >= jVar.f26603b1) {
                    return;
                }
                g gVar6 = jVar.f26602a1[i28];
                if (gVar6 == null) {
                    i14 = i17;
                    z12 = z13;
                    i13 = i20;
                    c4 = 3;
                } else {
                    d dVar3 = gVar6.L;
                    d dVar4 = gVar6.J;
                    d dVar5 = gVar6.I;
                    z12 = z13;
                    if (i26 == 0) {
                        i13 = i20;
                        gVar6.f(dVar5, this.f26589d, this.f26593h);
                    } else {
                        i13 = i20;
                    }
                    if (i27 == 0) {
                        int i29 = jVar.D0;
                        if (z10) {
                            f10 = 1.0f;
                            f11 = 1.0f - jVar.J0;
                        } else {
                            f10 = 1.0f;
                            f11 = jVar.J0;
                        }
                        if (this.f26597n == 0) {
                            i15 = jVar.F0;
                            f12 = f11;
                            if (i15 != -1) {
                                if (z10) {
                                    f14 = jVar.L0;
                                    f13 = f10 - f14;
                                    gVar6.f26554j0 = i15;
                                    gVar6.f26545e0 = f13;
                                } else {
                                    f13 = jVar.L0;
                                    gVar6.f26554j0 = i15;
                                    gVar6.f26545e0 = f13;
                                }
                            }
                        } else {
                            f12 = f11;
                        }
                        if (!z11 || (i15 = jVar.H0) == -1) {
                            i15 = i29;
                            f13 = f12;
                        } else if (z10) {
                            f14 = jVar.N0;
                            f13 = f10 - f14;
                        } else {
                            f13 = jVar.N0;
                        }
                        gVar6.f26554j0 = i15;
                        gVar6.f26545e0 = f13;
                    }
                    if (i26 == i17 - 1) {
                        i14 = i17;
                        gVar6.f(gVar6.K, this.f26591f, this.j);
                    } else {
                        i14 = i17;
                    }
                    if (gVar5 != null) {
                        d dVar6 = gVar5.K;
                        dVar5.a(dVar6, jVar.P0);
                        if (i26 == i19) {
                            int i30 = this.f26593h;
                            if (dVar5.h()) {
                                dVar5.f26533h = i30;
                            }
                        }
                        dVar6.a(dVar5, 0);
                        if (i26 == i13 + 1) {
                            int i31 = this.j;
                            if (dVar6.h()) {
                                dVar6.f26533h = i31;
                            }
                        }
                    }
                    if (gVar6 != gVar4) {
                        int i32 = jVar.S0;
                        c4 = 3;
                        if (i32 == 3 && gVar.E && gVar6 != gVar && gVar6.E) {
                            gVar6.M.a(gVar.M, 0);
                        } else if (i32 == 0) {
                            dVar4.a(dVar2, 0);
                        } else if (i32 == 1) {
                            dVar3.a(dVar, 0);
                        } else if (z12) {
                            dVar4.a(this.f26590e, this.f26594i);
                            dVar3.a(this.f26592g, this.k);
                        } else {
                            dVar4.a(dVar2, 0);
                            dVar3.a(dVar, 0);
                        }
                    } else {
                        c4 = 3;
                    }
                    gVar5 = gVar6;
                }
                i26++;
                z13 = z12;
                i20 = i13;
                i17 = i14;
            }
            return;
        }
        int i33 = i17;
        boolean z14 = z13;
        int i34 = i20;
        g gVar7 = this.f26587b;
        gVar7.f26554j0 = jVar.D0;
        d dVar7 = gVar7.I;
        d dVar8 = gVar7.K;
        int i35 = this.f26593h;
        if (i10 > 0) {
            i35 += jVar.P0;
        }
        if (z10) {
            dVar8.a(this.f26591f, i35);
            if (z11) {
                dVar7.a(this.f26589d, this.j);
            }
            if (i10 > 0) {
                this.f26591f.f26529d.I.a(dVar8, 0);
            }
        } else {
            dVar7.a(this.f26589d, i35);
            if (z11) {
                dVar8.a(this.f26591f, this.j);
            }
            if (i10 > 0) {
                this.f26589d.f26529d.K.a(dVar7, 0);
            }
        }
        int i36 = 0;
        g gVar8 = null;
        while (true) {
            int i37 = i33;
            if (i36 >= i37 || (i11 = this.f26597n + i36) >= jVar.f26603b1) {
                return;
            }
            g gVar9 = jVar.f26602a1[i11];
            if (gVar9 == null) {
                i33 = i37;
            } else {
                d dVar9 = gVar9.J;
                d dVar10 = gVar9.K;
                d dVar11 = gVar9.I;
                if (i36 == 0) {
                    gVar9.f(dVar9, this.f26590e, this.f26594i);
                    int i38 = jVar.E0;
                    float f15 = jVar.K0;
                    if (this.f26597n == 0) {
                        int i39 = jVar.G0;
                        i33 = i37;
                        i12 = -1;
                        if (i39 != -1) {
                            f15 = jVar.M0;
                        }
                        i38 = i39;
                        gVar9.f26555k0 = i38;
                        gVar9.f26547f0 = f15;
                    } else {
                        i33 = i37;
                        i12 = -1;
                    }
                    if (z11 && (i39 = jVar.I0) != i12) {
                        f15 = jVar.O0;
                        i38 = i39;
                    }
                    gVar9.f26555k0 = i38;
                    gVar9.f26547f0 = f15;
                } else {
                    i33 = i37;
                }
                if (i36 == i33 - 1) {
                    gVar9.f(gVar9.L, this.f26592g, this.k);
                }
                if (gVar8 != null) {
                    d dVar12 = gVar8.L;
                    dVar9.a(dVar12, jVar.Q0);
                    if (i36 == i19) {
                        int i40 = this.f26594i;
                        if (dVar9.h()) {
                            dVar9.f26533h = i40;
                        }
                    }
                    dVar12.a(dVar9, 0);
                    if (i36 == i34 + 1) {
                        int i41 = this.k;
                        if (dVar12.h()) {
                            dVar12.f26533h = i41;
                        }
                    }
                }
                if (gVar9 == gVar7) {
                    gVar8 = gVar9;
                } else if (z10) {
                    int i42 = jVar.R0;
                    if (i42 == 0) {
                        dVar10.a(dVar8, 0);
                    } else if (i42 == 1) {
                        dVar11.a(dVar7, 0);
                    } else if (i42 == 2) {
                        dVar11.a(dVar7, 0);
                        dVar10.a(dVar8, 0);
                    }
                    gVar8 = gVar9;
                } else {
                    int i43 = jVar.R0;
                    if (i43 == 0) {
                        dVar11.a(dVar7, 0);
                    } else if (i43 == 1) {
                        dVar10.a(dVar8, 0);
                    } else if (i43 == 2) {
                        if (z14) {
                            dVar11.a(this.f26589d, this.f26593h);
                            dVar10.a(this.f26591f, this.j);
                        } else {
                            dVar11.a(dVar7, 0);
                            dVar10.a(dVar8, 0);
                        }
                    }
                    gVar8 = gVar9;
                }
            }
            i36++;
        }
    }

    public final int c() {
        return this.f26586a == 1 ? this.f26596m - this.f26601r.Q0 : this.f26596m;
    }

    public final int d() {
        return this.f26586a == 0 ? this.f26595l - this.f26601r.P0 : this.f26595l;
    }

    public final void e(int i10) {
        int i11 = this.f26599p;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f26598o;
        int i13 = i10 / i11;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = this.f26597n;
            int i16 = i15 + i14;
            j jVar = this.f26601r;
            if (i16 >= jVar.f26603b1) {
                break;
            }
            g gVar = jVar.f26602a1[i15 + i14];
            if (this.f26586a == 0) {
                if (gVar != null) {
                    f[] fVarArr = gVar.T;
                    if (fVarArr[0] == f.MATCH_CONSTRAINT && gVar.f26567r == 0) {
                        jVar.V(gVar, f.FIXED, i13, fVarArr[1], gVar.k());
                    }
                }
            } else if (gVar != null) {
                f[] fVarArr2 = gVar.T;
                if (fVarArr2[1] == f.MATCH_CONSTRAINT && gVar.f26568s == 0) {
                    int i17 = i13;
                    jVar.V(gVar, fVarArr2[0], gVar.q(), f.FIXED, i17);
                    i13 = i17;
                }
            }
        }
        this.f26595l = 0;
        this.f26596m = 0;
        this.f26587b = null;
        this.f26588c = 0;
        int i18 = this.f26598o;
        for (int i19 = 0; i19 < i18; i19++) {
            int i20 = this.f26597n + i19;
            j jVar2 = this.f26601r;
            if (i20 >= jVar2.f26603b1) {
                return;
            }
            g gVar2 = jVar2.f26602a1[i20];
            if (this.f26586a == 0) {
                int iQ = gVar2.q();
                int i21 = jVar2.P0;
                if (gVar2.f26551h0 == 8) {
                    i21 = 0;
                }
                this.f26595l = iQ + i21 + this.f26595l;
                int iT = jVar2.T(gVar2, this.f26600q);
                if (this.f26587b == null || this.f26588c < iT) {
                    this.f26587b = gVar2;
                    this.f26588c = iT;
                    this.f26596m = iT;
                }
            } else {
                int iU = jVar2.U(gVar2, this.f26600q);
                int iT2 = jVar2.T(gVar2, this.f26600q);
                int i22 = jVar2.Q0;
                if (gVar2.f26551h0 == 8) {
                    i22 = 0;
                }
                this.f26596m = iT2 + i22 + this.f26596m;
                if (this.f26587b == null || this.f26588c < iU) {
                    this.f26587b = gVar2;
                    this.f26588c = iU;
                    this.f26595l = iU;
                }
            }
        }
    }

    public final void f(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
        this.f26586a = i10;
        this.f26589d = dVar;
        this.f26590e = dVar2;
        this.f26591f = dVar3;
        this.f26592g = dVar4;
        this.f26593h = i11;
        this.f26594i = i12;
        this.j = i13;
        this.k = i14;
        this.f26600q = i15;
    }
}
