package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xu {
    public int a;
    public wh d;
    public wh e;
    public wh f;
    public wh g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ zu r;
    public pi b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public xu(zu zuVar, int i, wh whVar, wh whVar2, wh whVar3, wh whVar4, int i2) {
        this.r = zuVar;
        this.a = i;
        this.d = whVar;
        this.e = whVar2;
        this.f = whVar3;
        this.g = whVar4;
        this.h = zuVar.w0;
        this.i = zuVar.s0;
        this.j = zuVar.x0;
        this.k = zuVar.t0;
        this.q = i2;
    }

    public final void a(pi piVar) {
        int i = this.a;
        zu zuVar = this.r;
        if (i == 0) {
            int iU = zuVar.U(piVar, this.q);
            if (piVar.p0[0] == 3) {
                this.p++;
                iU = 0;
            }
            this.l = iU + (piVar.g0 != 8 ? zuVar.P0 : 0) + this.l;
            int iT = zuVar.T(piVar, this.q);
            if (this.b == null || this.c < iT) {
                this.b = piVar;
                this.c = iT;
                this.m = iT;
            }
        } else {
            int iU2 = zuVar.U(piVar, this.q);
            int iT2 = zuVar.T(piVar, this.q);
            if (piVar.p0[1] == 3) {
                this.p++;
                iT2 = 0;
            }
            this.m = iT2 + (piVar.g0 != 8 ? zuVar.Q0 : 0) + this.m;
            if (this.b == null || this.c < iU2) {
                this.b = piVar;
                this.c = iU2;
                this.l = iU2;
            }
        }
        this.o++;
    }

    public final void b(int i, boolean z, boolean z2) {
        zu zuVar;
        int i2;
        int i3;
        pi piVar;
        boolean z3;
        int i4;
        int i5;
        char c;
        float f;
        float f2;
        float f3;
        int i6;
        float f4;
        float f5;
        int i7;
        int i8 = this.o;
        int i9 = 0;
        while (true) {
            zuVar = this.r;
            if (i9 >= i8 || (i7 = this.n + i9) >= zuVar.b1) {
                break;
            }
            pi piVar2 = zuVar.a1[i7];
            if (piVar2 != null) {
                piVar2.D();
            }
            i9++;
        }
        if (i8 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = this.n + (z ? (i8 - 1) - i12 : i12);
            if (i13 >= zuVar.b1) {
                break;
            }
            pi piVar3 = zuVar.a1[i13];
            if (piVar3 != null && piVar3.g0 == 0) {
                if (i10 == -1) {
                    i10 = i12;
                }
                i11 = i12;
            }
        }
        if (this.a == 0) {
            pi piVar4 = this.b;
            piVar4.j0 = zuVar.E0;
            wh whVar = piVar4.L;
            wh whVar2 = piVar4.J;
            int i14 = this.i;
            if (i > 0) {
                i14 += zuVar.Q0;
            }
            whVar2.a(this.e, i14);
            if (z2) {
                whVar.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.L.a(whVar2, 0);
            }
            if (zuVar.S0 != 3 || piVar4.E) {
                piVar = piVar4;
            } else {
                for (int i15 = 0; i15 < i8; i15++) {
                    int i16 = this.n + (z ? (i8 - 1) - i15 : i15);
                    if (i16 >= zuVar.b1) {
                        break;
                    }
                    piVar = zuVar.a1[i16];
                    if (piVar.E) {
                        break;
                    }
                }
                piVar = piVar4;
            }
            int i17 = 0;
            pi piVar5 = null;
            while (i17 < i8) {
                int i18 = z ? (i8 - 1) - i17 : i17;
                int i19 = this.n + i18;
                if (i19 >= zuVar.b1) {
                    return;
                }
                pi piVar6 = zuVar.a1[i19];
                if (piVar6 == null) {
                    i5 = i8;
                    z3 = z4;
                    i4 = i11;
                    c = 3;
                } else {
                    wh whVar3 = piVar6.L;
                    wh whVar4 = piVar6.J;
                    wh whVar5 = piVar6.I;
                    z3 = z4;
                    if (i17 == 0) {
                        i4 = i11;
                        piVar6.f(whVar5, this.d, this.h);
                    } else {
                        i4 = i11;
                    }
                    if (i18 == 0) {
                        int i20 = zuVar.D0;
                        if (z) {
                            f = 1.0f;
                            f2 = 1.0f - zuVar.J0;
                        } else {
                            f = 1.0f;
                            f2 = zuVar.J0;
                        }
                        if (this.n == 0) {
                            i6 = zuVar.F0;
                            f3 = f2;
                            if (i6 != -1) {
                                if (z) {
                                    f5 = zuVar.L0;
                                    f4 = f - f5;
                                    piVar6.i0 = i6;
                                    piVar6.d0 = f4;
                                } else {
                                    f4 = zuVar.L0;
                                    piVar6.i0 = i6;
                                    piVar6.d0 = f4;
                                }
                            }
                        } else {
                            f3 = f2;
                        }
                        if (!z2 || (i6 = zuVar.H0) == -1) {
                            i6 = i20;
                            f4 = f3;
                        } else if (z) {
                            f5 = zuVar.N0;
                            f4 = f - f5;
                        } else {
                            f4 = zuVar.N0;
                        }
                        piVar6.i0 = i6;
                        piVar6.d0 = f4;
                    }
                    if (i17 == i8 - 1) {
                        i5 = i8;
                        piVar6.f(piVar6.K, this.f, this.j);
                    } else {
                        i5 = i8;
                    }
                    if (piVar5 != null) {
                        wh whVar6 = piVar5.K;
                        whVar5.a(whVar6, zuVar.P0);
                        if (i17 == i10) {
                            int i21 = this.h;
                            if (whVar5.h()) {
                                whVar5.h = i21;
                            }
                        }
                        whVar6.a(whVar5, 0);
                        if (i17 == i4 + 1) {
                            int i22 = this.j;
                            if (whVar6.h()) {
                                whVar6.h = i22;
                            }
                        }
                    }
                    if (piVar6 != piVar4) {
                        int i23 = zuVar.S0;
                        c = 3;
                        if (i23 == 3 && piVar.E && piVar6 != piVar && piVar6.E) {
                            piVar6.M.a(piVar.M, 0);
                        } else if (i23 == 0) {
                            whVar4.a(whVar2, 0);
                        } else if (i23 == 1) {
                            whVar3.a(whVar, 0);
                        } else if (z3) {
                            whVar4.a(this.e, this.i);
                            whVar3.a(this.g, this.k);
                        } else {
                            whVar4.a(whVar2, 0);
                            whVar3.a(whVar, 0);
                        }
                    } else {
                        c = 3;
                    }
                    piVar5 = piVar6;
                }
                i17++;
                z4 = z3;
                i11 = i4;
                i8 = i5;
            }
            return;
        }
        int i24 = i8;
        boolean z5 = z4;
        int i25 = i11;
        pi piVar7 = this.b;
        piVar7.i0 = zuVar.D0;
        wh whVar7 = piVar7.I;
        wh whVar8 = piVar7.K;
        int i26 = this.h;
        if (i > 0) {
            i26 += zuVar.P0;
        }
        if (z) {
            whVar8.a(this.f, i26);
            if (z2) {
                whVar7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.I.a(whVar8, 0);
            }
        } else {
            whVar7.a(this.d, i26);
            if (z2) {
                whVar8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.K.a(whVar7, 0);
            }
        }
        int i27 = 0;
        pi piVar8 = null;
        while (true) {
            int i28 = i24;
            if (i27 >= i28 || (i2 = this.n + i27) >= zuVar.b1) {
                return;
            }
            pi piVar9 = zuVar.a1[i2];
            if (piVar9 == null) {
                i24 = i28;
            } else {
                wh whVar9 = piVar9.J;
                wh whVar10 = piVar9.K;
                wh whVar11 = piVar9.I;
                if (i27 == 0) {
                    piVar9.f(whVar9, this.e, this.i);
                    int i29 = zuVar.E0;
                    float f6 = zuVar.K0;
                    if (this.n == 0) {
                        int i30 = zuVar.G0;
                        i24 = i28;
                        i3 = -1;
                        if (i30 != -1) {
                            f6 = zuVar.M0;
                        }
                        i29 = i30;
                        piVar9.j0 = i29;
                        piVar9.e0 = f6;
                    } else {
                        i24 = i28;
                        i3 = -1;
                    }
                    if (z2 && (i30 = zuVar.I0) != i3) {
                        f6 = zuVar.O0;
                        i29 = i30;
                    }
                    piVar9.j0 = i29;
                    piVar9.e0 = f6;
                } else {
                    i24 = i28;
                }
                if (i27 == i24 - 1) {
                    piVar9.f(piVar9.L, this.g, this.k);
                }
                if (piVar8 != null) {
                    wh whVar12 = piVar8.L;
                    whVar9.a(whVar12, zuVar.Q0);
                    if (i27 == i10) {
                        int i31 = this.i;
                        if (whVar9.h()) {
                            whVar9.h = i31;
                        }
                    }
                    whVar12.a(whVar9, 0);
                    if (i27 == i25 + 1) {
                        int i32 = this.k;
                        if (whVar12.h()) {
                            whVar12.h = i32;
                        }
                    }
                }
                if (piVar9 == piVar7) {
                    piVar8 = piVar9;
                } else if (z) {
                    int i33 = zuVar.R0;
                    if (i33 == 0) {
                        whVar10.a(whVar8, 0);
                    } else if (i33 == 1) {
                        whVar11.a(whVar7, 0);
                    } else if (i33 == 2) {
                        whVar11.a(whVar7, 0);
                        whVar10.a(whVar8, 0);
                    }
                    piVar8 = piVar9;
                } else {
                    int i34 = zuVar.R0;
                    if (i34 == 0) {
                        whVar11.a(whVar7, 0);
                    } else if (i34 == 1) {
                        whVar10.a(whVar8, 0);
                    } else if (i34 == 2) {
                        if (z5) {
                            whVar11.a(this.d, this.h);
                            whVar10.a(this.f, this.j);
                        } else {
                            whVar11.a(whVar7, 0);
                            whVar10.a(whVar8, 0);
                        }
                    }
                    piVar8 = piVar9;
                }
            }
            i27++;
        }
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.Q0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.P0 : this.l;
    }

    public final void e(int i) {
        zu zuVar;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            zuVar = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= zuVar.b1) {
                break;
            }
            pi piVar = zuVar.a1[i2];
            if (this.a == 0) {
                if (piVar != null) {
                    int[] iArr = piVar.p0;
                    if (iArr[0] == 3 && piVar.r == 0) {
                        zuVar.V(1, i5, iArr[1], piVar.k(), piVar);
                    }
                }
            } else if (piVar != null) {
                int[] iArr2 = piVar.p0;
                if (iArr2[1] == 3 && piVar.s == 0) {
                    int i7 = i5;
                    zuVar.V(iArr2[0], piVar.q(), 1, i7, piVar);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= zuVar.b1) {
                return;
            }
            pi piVar2 = zuVar.a1[i10];
            if (this.a == 0) {
                int iQ = piVar2.q();
                int i11 = zuVar.P0;
                if (piVar2.g0 == 8) {
                    i11 = 0;
                }
                this.l = iQ + i11 + this.l;
                int iT = zuVar.T(piVar2, this.q);
                if (this.b == null || this.c < iT) {
                    this.b = piVar2;
                    this.c = iT;
                    this.m = iT;
                }
            } else {
                int iU = zuVar.U(piVar2, this.q);
                int iT2 = zuVar.T(piVar2, this.q);
                int i12 = zuVar.Q0;
                if (piVar2.g0 == 8) {
                    i12 = 0;
                }
                this.m = iT2 + i12 + this.m;
                if (this.b == null || this.c < iU) {
                    this.b = piVar2;
                    this.c = iU;
                    this.l = iU;
                }
            }
        }
    }

    public final void f(int i, wh whVar, wh whVar2, wh whVar3, wh whVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = whVar;
        this.e = whVar2;
        this.f = whVar3;
        this.g = whVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
