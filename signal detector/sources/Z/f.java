package z;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f24378a;

    /* renamed from: d, reason: collision with root package name */
    public c f24381d;

    /* renamed from: e, reason: collision with root package name */
    public c f24382e;

    /* renamed from: f, reason: collision with root package name */
    public c f24383f;

    /* renamed from: g, reason: collision with root package name */
    public c f24384g;

    /* renamed from: h, reason: collision with root package name */
    public int f24385h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f24386j;

    /* renamed from: k, reason: collision with root package name */
    public int f24387k;

    /* renamed from: q, reason: collision with root package name */
    public int f24393q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f24394r;

    /* renamed from: b, reason: collision with root package name */
    public d f24379b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f24380c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f24388l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f24389m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f24390n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f24391o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f24392p = 0;

    public f(g gVar, int i, c cVar, c cVar2, c cVar3, c cVar4, int i3) {
        this.f24394r = gVar;
        this.f24378a = i;
        this.f24381d = cVar;
        this.f24382e = cVar2;
        this.f24383f = cVar3;
        this.f24384g = cVar4;
        this.f24385h = gVar.f24426w0;
        this.i = gVar.f24423s0;
        this.f24386j = gVar.f24427x0;
        this.f24387k = gVar.f24424t0;
        this.f24393q = i3;
    }

    public final void a(d dVar) {
        int i = this.f24378a;
        g gVar = this.f24394r;
        if (i == 0) {
            int iU = gVar.U(dVar, this.f24393q);
            if (dVar.f24346p0[0] == 3) {
                this.f24392p++;
                iU = 0;
            }
            this.f24388l = iU + (dVar.f24329g0 != 8 ? gVar.f24410P0 : 0) + this.f24388l;
            int iT = gVar.T(dVar, this.f24393q);
            if (this.f24379b == null || this.f24380c < iT) {
                this.f24379b = dVar;
                this.f24380c = iT;
                this.f24389m = iT;
            }
        } else {
            int iU2 = gVar.U(dVar, this.f24393q);
            int iT2 = gVar.T(dVar, this.f24393q);
            if (dVar.f24346p0[1] == 3) {
                this.f24392p++;
                iT2 = 0;
            }
            this.f24389m = iT2 + (dVar.f24329g0 != 8 ? gVar.f24411Q0 : 0) + this.f24389m;
            if (this.f24379b == null || this.f24380c < iU2) {
                this.f24379b = dVar;
                this.f24380c = iU2;
                this.f24388l = iU2;
            }
        }
        this.f24391o++;
    }

    public final void b(int i, boolean z6, boolean z7) {
        g gVar;
        int i3;
        int i6;
        d dVar;
        boolean z8;
        int i7;
        int i8;
        char c6;
        float f2;
        float f5;
        float f6;
        int i9;
        float f7;
        float f8;
        int i10;
        int i11 = this.f24391o;
        int i12 = 0;
        while (true) {
            gVar = this.f24394r;
            if (i12 >= i11 || (i10 = this.f24390n + i12) >= gVar.f24422b1) {
                break;
            }
            d dVar2 = gVar.f24421a1[i10];
            if (dVar2 != null) {
                dVar2.D();
            }
            i12++;
        }
        if (i11 == 0 || this.f24379b == null) {
            return;
        }
        boolean z9 = z7 && i == 0;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = this.f24390n + (z6 ? (i11 - 1) - i15 : i15);
            if (i16 >= gVar.f24422b1) {
                break;
            }
            d dVar3 = gVar.f24421a1[i16];
            if (dVar3 != null && dVar3.f24329g0 == 0) {
                if (i13 == -1) {
                    i13 = i15;
                }
                i14 = i15;
            }
        }
        if (this.f24378a == 0) {
            d dVar4 = this.f24379b;
            dVar4.f24334j0 = gVar.f24399E0;
            c cVar = dVar4.f24303L;
            c cVar2 = dVar4.f24301J;
            int i17 = this.i;
            if (i > 0) {
                i17 += gVar.f24411Q0;
            }
            cVar2.a(this.f24382e, i17);
            if (z7) {
                cVar.a(this.f24384g, this.f24387k);
            }
            if (i > 0) {
                this.f24382e.f24287d.f24303L.a(cVar2, 0);
            }
            if (gVar.f24413S0 != 3 || dVar4.f24296E) {
                dVar = dVar4;
            } else {
                for (int i18 = 0; i18 < i11; i18++) {
                    int i19 = this.f24390n + (z6 ? (i11 - 1) - i18 : i18);
                    if (i19 >= gVar.f24422b1) {
                        break;
                    }
                    dVar = gVar.f24421a1[i19];
                    if (dVar.f24296E) {
                        break;
                    }
                }
                dVar = dVar4;
            }
            int i20 = 0;
            d dVar5 = null;
            while (i20 < i11) {
                int i21 = z6 ? (i11 - 1) - i20 : i20;
                int i22 = this.f24390n + i21;
                if (i22 >= gVar.f24422b1) {
                    return;
                }
                d dVar6 = gVar.f24421a1[i22];
                if (dVar6 == null) {
                    i8 = i11;
                    z8 = z9;
                    i7 = i14;
                    c6 = 3;
                } else {
                    c cVar3 = dVar6.f24303L;
                    c cVar4 = dVar6.f24301J;
                    c cVar5 = dVar6.f24300I;
                    z8 = z9;
                    if (i20 == 0) {
                        i7 = i14;
                        dVar6.f(cVar5, this.f24381d, this.f24385h);
                    } else {
                        i7 = i14;
                    }
                    if (i21 == 0) {
                        int i23 = gVar.f24398D0;
                        if (z6) {
                            f2 = 1.0f;
                            f5 = 1.0f - gVar.f24404J0;
                        } else {
                            f2 = 1.0f;
                            f5 = gVar.f24404J0;
                        }
                        if (this.f24390n == 0) {
                            i9 = gVar.f24400F0;
                            f6 = f5;
                            if (i9 != -1) {
                                if (z6) {
                                    f8 = gVar.f24406L0;
                                    f7 = f2 - f8;
                                    dVar6.f24332i0 = i9;
                                    dVar6.f24323d0 = f7;
                                } else {
                                    f7 = gVar.f24406L0;
                                    dVar6.f24332i0 = i9;
                                    dVar6.f24323d0 = f7;
                                }
                            }
                        } else {
                            f6 = f5;
                        }
                        if (!z7 || (i9 = gVar.f24402H0) == -1) {
                            i9 = i23;
                            f7 = f6;
                        } else if (z6) {
                            f8 = gVar.f24408N0;
                            f7 = f2 - f8;
                        } else {
                            f7 = gVar.f24408N0;
                        }
                        dVar6.f24332i0 = i9;
                        dVar6.f24323d0 = f7;
                    }
                    if (i20 == i11 - 1) {
                        i8 = i11;
                        dVar6.f(dVar6.f24302K, this.f24383f, this.f24386j);
                    } else {
                        i8 = i11;
                    }
                    if (dVar5 != null) {
                        c cVar6 = dVar5.f24302K;
                        cVar5.a(cVar6, gVar.f24410P0);
                        if (i20 == i13) {
                            int i24 = this.f24385h;
                            if (cVar5.h()) {
                                cVar5.f24291h = i24;
                            }
                        }
                        cVar6.a(cVar5, 0);
                        if (i20 == i7 + 1) {
                            int i25 = this.f24386j;
                            if (cVar6.h()) {
                                cVar6.f24291h = i25;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        int i26 = gVar.f24413S0;
                        c6 = 3;
                        if (i26 == 3 && dVar.f24296E && dVar6 != dVar && dVar6.f24296E) {
                            dVar6.M.a(dVar.M, 0);
                        } else if (i26 == 0) {
                            cVar4.a(cVar2, 0);
                        } else if (i26 == 1) {
                            cVar3.a(cVar, 0);
                        } else if (z8) {
                            cVar4.a(this.f24382e, this.i);
                            cVar3.a(this.f24384g, this.f24387k);
                        } else {
                            cVar4.a(cVar2, 0);
                            cVar3.a(cVar, 0);
                        }
                    } else {
                        c6 = 3;
                    }
                    dVar5 = dVar6;
                }
                i20++;
                z9 = z8;
                i14 = i7;
                i11 = i8;
            }
            return;
        }
        int i27 = i11;
        boolean z10 = z9;
        int i28 = i14;
        d dVar7 = this.f24379b;
        dVar7.f24332i0 = gVar.f24398D0;
        c cVar7 = dVar7.f24300I;
        c cVar8 = dVar7.f24302K;
        int i29 = this.f24385h;
        if (i > 0) {
            i29 += gVar.f24410P0;
        }
        if (z6) {
            cVar8.a(this.f24383f, i29);
            if (z7) {
                cVar7.a(this.f24381d, this.f24386j);
            }
            if (i > 0) {
                this.f24383f.f24287d.f24300I.a(cVar8, 0);
            }
        } else {
            cVar7.a(this.f24381d, i29);
            if (z7) {
                cVar8.a(this.f24383f, this.f24386j);
            }
            if (i > 0) {
                this.f24381d.f24287d.f24302K.a(cVar7, 0);
            }
        }
        int i30 = 0;
        d dVar8 = null;
        while (true) {
            int i31 = i27;
            if (i30 >= i31 || (i3 = this.f24390n + i30) >= gVar.f24422b1) {
                return;
            }
            d dVar9 = gVar.f24421a1[i3];
            if (dVar9 == null) {
                i27 = i31;
            } else {
                c cVar9 = dVar9.f24301J;
                c cVar10 = dVar9.f24302K;
                c cVar11 = dVar9.f24300I;
                if (i30 == 0) {
                    dVar9.f(cVar9, this.f24382e, this.i);
                    int i32 = gVar.f24399E0;
                    float f9 = gVar.f24405K0;
                    if (this.f24390n == 0) {
                        int i33 = gVar.f24401G0;
                        i27 = i31;
                        i6 = -1;
                        if (i33 != -1) {
                            f9 = gVar.f24407M0;
                        }
                        i32 = i33;
                        dVar9.f24334j0 = i32;
                        dVar9.f24325e0 = f9;
                    } else {
                        i27 = i31;
                        i6 = -1;
                    }
                    if (z7 && (i33 = gVar.f24403I0) != i6) {
                        f9 = gVar.f24409O0;
                        i32 = i33;
                    }
                    dVar9.f24334j0 = i32;
                    dVar9.f24325e0 = f9;
                } else {
                    i27 = i31;
                }
                if (i30 == i27 - 1) {
                    dVar9.f(dVar9.f24303L, this.f24384g, this.f24387k);
                }
                if (dVar8 != null) {
                    c cVar12 = dVar8.f24303L;
                    cVar9.a(cVar12, gVar.f24411Q0);
                    if (i30 == i13) {
                        int i34 = this.i;
                        if (cVar9.h()) {
                            cVar9.f24291h = i34;
                        }
                    }
                    cVar12.a(cVar9, 0);
                    if (i30 == i28 + 1) {
                        int i35 = this.f24387k;
                        if (cVar12.h()) {
                            cVar12.f24291h = i35;
                        }
                    }
                }
                if (dVar9 == dVar7) {
                    dVar8 = dVar9;
                } else if (z6) {
                    int i36 = gVar.f24412R0;
                    if (i36 == 0) {
                        cVar10.a(cVar8, 0);
                    } else if (i36 == 1) {
                        cVar11.a(cVar7, 0);
                    } else if (i36 == 2) {
                        cVar11.a(cVar7, 0);
                        cVar10.a(cVar8, 0);
                    }
                    dVar8 = dVar9;
                } else {
                    int i37 = gVar.f24412R0;
                    if (i37 == 0) {
                        cVar11.a(cVar7, 0);
                    } else if (i37 == 1) {
                        cVar10.a(cVar8, 0);
                    } else if (i37 == 2) {
                        if (z10) {
                            cVar11.a(this.f24381d, this.f24385h);
                            cVar10.a(this.f24383f, this.f24386j);
                        } else {
                            cVar11.a(cVar7, 0);
                            cVar10.a(cVar8, 0);
                        }
                    }
                    dVar8 = dVar9;
                }
            }
            i30++;
        }
    }

    public final int c() {
        return this.f24378a == 1 ? this.f24389m - this.f24394r.f24411Q0 : this.f24389m;
    }

    public final int d() {
        return this.f24378a == 0 ? this.f24388l - this.f24394r.f24410P0 : this.f24388l;
    }

    public final void e(int i) {
        g gVar;
        int i3;
        int i6 = this.f24392p;
        if (i6 == 0) {
            return;
        }
        int i7 = this.f24391o;
        int i8 = i / i6;
        int i9 = 0;
        while (true) {
            gVar = this.f24394r;
            if (i9 >= i7 || (i3 = this.f24390n + i9) >= gVar.f24422b1) {
                break;
            }
            d dVar = gVar.f24421a1[i3];
            if (this.f24378a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f24346p0;
                    if (iArr[0] == 3 && dVar.f24348r == 0) {
                        gVar.V(1, i8, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f24346p0;
                if (iArr2[1] == 3 && dVar.f24349s == 0) {
                    int i10 = i8;
                    gVar.V(iArr2[0], dVar.q(), 1, i10, dVar);
                    i8 = i10;
                }
            }
            i9++;
        }
        this.f24388l = 0;
        this.f24389m = 0;
        this.f24379b = null;
        this.f24380c = 0;
        int i11 = this.f24391o;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f24390n + i12;
            if (i13 >= gVar.f24422b1) {
                return;
            }
            d dVar2 = gVar.f24421a1[i13];
            if (this.f24378a == 0) {
                int iQ = dVar2.q();
                int i14 = gVar.f24410P0;
                if (dVar2.f24329g0 == 8) {
                    i14 = 0;
                }
                this.f24388l = iQ + i14 + this.f24388l;
                int iT = gVar.T(dVar2, this.f24393q);
                if (this.f24379b == null || this.f24380c < iT) {
                    this.f24379b = dVar2;
                    this.f24380c = iT;
                    this.f24389m = iT;
                }
            } else {
                int iU = gVar.U(dVar2, this.f24393q);
                int iT2 = gVar.T(dVar2, this.f24393q);
                int i15 = gVar.f24411Q0;
                if (dVar2.f24329g0 == 8) {
                    i15 = 0;
                }
                this.f24389m = iT2 + i15 + this.f24389m;
                if (this.f24379b == null || this.f24380c < iU) {
                    this.f24379b = dVar2;
                    this.f24380c = iU;
                    this.f24388l = iU;
                }
            }
        }
    }

    public final void f(int i, c cVar, c cVar2, c cVar3, c cVar4, int i3, int i6, int i7, int i8, int i9) {
        this.f24378a = i;
        this.f24381d = cVar;
        this.f24382e = cVar2;
        this.f24383f = cVar3;
        this.f24384g = cVar4;
        this.f24385h = i3;
        this.i = i6;
        this.f24386j = i7;
        this.f24387k = i8;
        this.f24393q = i9;
    }
}
