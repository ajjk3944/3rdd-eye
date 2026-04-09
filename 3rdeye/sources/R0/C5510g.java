package r0;

import java.util.ArrayList;
import r0.C5508e;

/* compiled from: Flow.java */
/* renamed from: r0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5510g extends C5514k {

    /* renamed from: b1, reason: collision with root package name */
    public C5508e[] f45627b1;

    /* renamed from: E0, reason: collision with root package name */
    public int f45605E0 = -1;
    public int F0 = -1;

    /* renamed from: G0, reason: collision with root package name */
    public int f45606G0 = -1;

    /* renamed from: H0, reason: collision with root package name */
    public int f45607H0 = -1;

    /* renamed from: I0, reason: collision with root package name */
    public int f45608I0 = -1;

    /* renamed from: J0, reason: collision with root package name */
    public int f45609J0 = -1;

    /* renamed from: K0, reason: collision with root package name */
    public float f45610K0 = 0.5f;

    /* renamed from: L0, reason: collision with root package name */
    public float f45611L0 = 0.5f;

    /* renamed from: M0, reason: collision with root package name */
    public float f45612M0 = 0.5f;

    /* renamed from: N0, reason: collision with root package name */
    public float f45613N0 = 0.5f;

    /* renamed from: O0, reason: collision with root package name */
    public float f45614O0 = 0.5f;

    /* renamed from: P0, reason: collision with root package name */
    public float f45615P0 = 0.5f;

    /* renamed from: Q0, reason: collision with root package name */
    public int f45616Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    public int f45617R0 = 0;

    /* renamed from: S0, reason: collision with root package name */
    public int f45618S0 = 2;

    /* renamed from: T0, reason: collision with root package name */
    public int f45619T0 = 2;

    /* renamed from: U0, reason: collision with root package name */
    public int f45620U0 = 0;

    /* renamed from: V0, reason: collision with root package name */
    public int f45621V0 = -1;

    /* renamed from: W0, reason: collision with root package name */
    public int f45622W0 = 0;

    /* renamed from: X0, reason: collision with root package name */
    public final ArrayList<a> f45623X0 = new ArrayList<>();

    /* renamed from: Y0, reason: collision with root package name */
    public C5508e[] f45624Y0 = null;

    /* renamed from: Z0, reason: collision with root package name */
    public C5508e[] f45625Z0 = null;

    /* renamed from: a1, reason: collision with root package name */
    public int[] f45626a1 = null;

    /* renamed from: c1, reason: collision with root package name */
    public int f45628c1 = 0;

    /* compiled from: Flow.java */
    /* renamed from: r0.g$a */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f45629a;

        /* renamed from: d, reason: collision with root package name */
        public C5507d f45632d;

        /* renamed from: e, reason: collision with root package name */
        public C5507d f45633e;

        /* renamed from: f, reason: collision with root package name */
        public C5507d f45634f;

        /* renamed from: g, reason: collision with root package name */
        public C5507d f45635g;

        /* renamed from: h, reason: collision with root package name */
        public int f45636h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public int f45637j;

        /* renamed from: k, reason: collision with root package name */
        public int f45638k;

        /* renamed from: q, reason: collision with root package name */
        public int f45644q;

        /* renamed from: b, reason: collision with root package name */
        public C5508e f45630b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f45631c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f45639l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f45640m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f45641n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f45642o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f45643p = 0;

        public a(int i, C5507d c5507d, C5507d c5507d2, C5507d c5507d3, C5507d c5507d4, int i10) {
            this.f45629a = i;
            this.f45632d = c5507d;
            this.f45633e = c5507d2;
            this.f45634f = c5507d3;
            this.f45635g = c5507d4;
            this.f45636h = C5510g.this.f45664x0;
            this.i = C5510g.this.f45660t0;
            this.f45637j = C5510g.this.f45665y0;
            this.f45638k = C5510g.this.f45661u0;
            this.f45644q = i10;
        }

        public final void a(C5508e c5508e) {
            int i = this.f45629a;
            C5510g c5510g = C5510g.this;
            if (i == 0) {
                int iW = c5510g.W(c5508e, this.f45644q);
                if (c5508e.f45535U[0] == C5508e.b.MATCH_CONSTRAINT) {
                    this.f45643p++;
                    iW = 0;
                }
                this.f45639l = iW + (c5508e.f45557i0 != 8 ? c5510g.f45616Q0 : 0) + this.f45639l;
                int iV = c5510g.V(c5508e, this.f45644q);
                if (this.f45630b == null || this.f45631c < iV) {
                    this.f45630b = c5508e;
                    this.f45631c = iV;
                    this.f45640m = iV;
                }
            } else {
                int iW2 = c5510g.W(c5508e, this.f45644q);
                int iV2 = c5510g.V(c5508e, this.f45644q);
                if (c5508e.f45535U[1] == C5508e.b.MATCH_CONSTRAINT) {
                    this.f45643p++;
                    iV2 = 0;
                }
                this.f45640m = iV2 + (c5508e.f45557i0 != 8 ? c5510g.f45617R0 : 0) + this.f45640m;
                if (this.f45630b == null || this.f45631c < iW2) {
                    this.f45630b = c5508e;
                    this.f45631c = iW2;
                    this.f45639l = iW2;
                }
            }
            this.f45642o++;
        }

        public final void b(boolean z10, int i, boolean z11) {
            C5510g c5510g;
            int i10;
            C5508e c5508e;
            boolean z12;
            char c10;
            float f10;
            float f11;
            int i11;
            float f12;
            float f13;
            int i12;
            int i13 = this.f45642o;
            int i14 = 0;
            while (true) {
                c5510g = C5510g.this;
                if (i14 >= i13 || (i12 = this.f45641n + i14) >= c5510g.f45628c1) {
                    break;
                }
                C5508e c5508e2 = c5510g.f45627b1[i12];
                if (c5508e2 != null) {
                    c5508e2.D();
                }
                i14++;
            }
            if (i13 == 0 || this.f45630b == null) {
                return;
            }
            boolean z13 = z11 && i == 0;
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = this.f45641n + (z10 ? (i13 - 1) - i17 : i17);
                if (i18 >= c5510g.f45628c1) {
                    break;
                }
                C5508e c5508e3 = c5510g.f45627b1[i18];
                if (c5508e3 != null && c5508e3.f45557i0 == 0) {
                    if (i15 == -1) {
                        i15 = i17;
                    }
                    i16 = i17;
                }
            }
            if (this.f45629a != 0) {
                boolean z14 = z13;
                C5508e c5508e4 = this.f45630b;
                c5508e4.f45561k0 = c5510g.f45605E0;
                int i19 = this.f45636h;
                if (i > 0) {
                    i19 += c5510g.f45616Q0;
                }
                C5507d c5507d = c5508e4.f45524J;
                C5507d c5507d2 = c5508e4.f45526L;
                if (z10) {
                    c5507d2.a(this.f45634f, i19);
                    if (z11) {
                        c5507d.a(this.f45632d, this.f45637j);
                    }
                    if (i > 0) {
                        this.f45634f.f45509d.f45524J.a(c5507d2, 0);
                    }
                } else {
                    c5507d.a(this.f45632d, i19);
                    if (z11) {
                        c5507d2.a(this.f45634f, this.f45637j);
                    }
                    if (i > 0) {
                        this.f45632d.f45509d.f45526L.a(c5507d, 0);
                    }
                }
                C5508e c5508e5 = null;
                for (int i20 = 0; i20 < i13; i20++) {
                    int i21 = this.f45641n + i20;
                    if (i21 >= c5510g.f45628c1) {
                        return;
                    }
                    C5508e c5508e6 = c5510g.f45627b1[i21];
                    if (c5508e6 != null) {
                        C5507d c5507d3 = c5508e6.f45525K;
                        if (i20 == 0) {
                            c5508e6.f(c5507d3, this.f45633e, this.i);
                            int i22 = c5510g.F0;
                            float f14 = c5510g.f45611L0;
                            if (this.f45641n == 0) {
                                int i23 = c5510g.f45607H0;
                                i10 = -1;
                                if (i23 != -1) {
                                    f14 = c5510g.f45613N0;
                                }
                                i22 = i23;
                                c5508e6.f45563l0 = i22;
                                c5508e6.f45554g0 = f14;
                            } else {
                                i10 = -1;
                            }
                            if (z11 && (i23 = c5510g.f45609J0) != i10) {
                                f14 = c5510g.f45615P0;
                                i22 = i23;
                            }
                            c5508e6.f45563l0 = i22;
                            c5508e6.f45554g0 = f14;
                        }
                        if (i20 == i13 - 1) {
                            c5508e6.f(c5508e6.f45527M, this.f45635g, this.f45638k);
                        }
                        if (c5508e5 != null) {
                            int i24 = c5510g.f45617R0;
                            C5507d c5507d4 = c5508e5.f45527M;
                            c5507d3.a(c5507d4, i24);
                            if (i20 == i15) {
                                int i25 = this.i;
                                if (c5507d3.h()) {
                                    c5507d3.f45513h = i25;
                                }
                            }
                            c5507d4.a(c5507d3, 0);
                            if (i20 == i16 + 1) {
                                int i26 = this.f45638k;
                                if (c5507d4.h()) {
                                    c5507d4.f45513h = i26;
                                }
                            }
                        }
                        if (c5508e6 != c5508e4) {
                            C5507d c5507d5 = c5508e6.f45526L;
                            C5507d c5507d6 = c5508e6.f45524J;
                            if (z10) {
                                int i27 = c5510g.f45618S0;
                                if (i27 == 0) {
                                    c5507d5.a(c5507d2, 0);
                                } else if (i27 == 1) {
                                    c5507d6.a(c5507d, 0);
                                } else if (i27 == 2) {
                                    c5507d6.a(c5507d, 0);
                                    c5507d5.a(c5507d2, 0);
                                }
                                c5508e5 = c5508e6;
                            } else {
                                int i28 = c5510g.f45618S0;
                                if (i28 == 0) {
                                    c5507d6.a(c5507d, 0);
                                } else if (i28 == 1) {
                                    c5507d5.a(c5507d2, 0);
                                } else if (i28 == 2) {
                                    if (z14) {
                                        c5507d6.a(this.f45632d, this.f45636h);
                                        c5507d5.a(this.f45634f, this.f45637j);
                                    } else {
                                        c5507d6.a(c5507d, 0);
                                        c5507d5.a(c5507d2, 0);
                                    }
                                }
                                c5508e5 = c5508e6;
                            }
                        } else {
                            c5508e5 = c5508e6;
                        }
                    }
                }
                return;
            }
            C5508e c5508e7 = this.f45630b;
            c5508e7.f45563l0 = c5510g.F0;
            int i29 = this.i;
            if (i > 0) {
                i29 += c5510g.f45617R0;
            }
            C5507d c5507d7 = this.f45633e;
            C5507d c5507d8 = c5508e7.f45525K;
            c5507d8.a(c5507d7, i29);
            C5507d c5507d9 = c5508e7.f45527M;
            if (z11) {
                c5507d9.a(this.f45635g, this.f45638k);
            }
            if (i > 0) {
                this.f45633e.f45509d.f45527M.a(c5507d8, 0);
            }
            if (c5510g.f45619T0 != 3 || c5508e7.f45519E) {
                c5508e = c5508e7;
            } else {
                for (int i30 = 0; i30 < i13; i30++) {
                    int i31 = this.f45641n + (z10 ? (i13 - 1) - i30 : i30);
                    if (i31 >= c5510g.f45628c1) {
                        break;
                    }
                    c5508e = c5510g.f45627b1[i31];
                    if (c5508e.f45519E) {
                        break;
                    }
                }
                c5508e = c5508e7;
            }
            int i32 = 0;
            C5508e c5508e8 = null;
            while (i32 < i13) {
                int i33 = z10 ? (i13 - 1) - i32 : i32;
                int i34 = this.f45641n + i33;
                if (i34 >= c5510g.f45628c1) {
                    return;
                }
                C5508e c5508e9 = c5510g.f45627b1[i34];
                if (c5508e9 == null) {
                    z12 = z13;
                    c10 = 3;
                } else {
                    C5507d c5507d10 = c5508e9.f45524J;
                    if (i32 == 0) {
                        c5508e9.f(c5507d10, this.f45632d, this.f45636h);
                    }
                    if (i33 == 0) {
                        int i35 = c5510g.f45605E0;
                        if (z10) {
                            f10 = 1.0f;
                            f11 = 1.0f - c5510g.f45610K0;
                        } else {
                            f10 = 1.0f;
                            f11 = c5510g.f45610K0;
                        }
                        if (this.f45641n == 0) {
                            i11 = c5510g.f45606G0;
                            z12 = z13;
                            if (i11 != -1) {
                                if (z10) {
                                    f13 = c5510g.f45612M0;
                                    f11 = f10 - f13;
                                } else {
                                    f12 = c5510g.f45612M0;
                                    f11 = f12;
                                }
                            }
                            c5508e9.f45561k0 = i11;
                            c5508e9.f45552f0 = f11;
                        } else {
                            z12 = z13;
                        }
                        if (!z11 || (i11 = c5510g.f45608I0) == -1) {
                            i11 = i35;
                            c5508e9.f45561k0 = i11;
                            c5508e9.f45552f0 = f11;
                        } else if (z10) {
                            f13 = c5510g.f45614O0;
                            f11 = f10 - f13;
                            c5508e9.f45561k0 = i11;
                            c5508e9.f45552f0 = f11;
                        } else {
                            f12 = c5510g.f45614O0;
                            f11 = f12;
                            c5508e9.f45561k0 = i11;
                            c5508e9.f45552f0 = f11;
                        }
                    } else {
                        z12 = z13;
                    }
                    if (i32 == i13 - 1) {
                        c5508e9.f(c5508e9.f45526L, this.f45634f, this.f45637j);
                    }
                    if (c5508e8 != null) {
                        int i36 = c5510g.f45616Q0;
                        C5507d c5507d11 = c5508e8.f45526L;
                        c5507d10.a(c5507d11, i36);
                        if (i32 == i15) {
                            int i37 = this.f45636h;
                            if (c5507d10.h()) {
                                c5507d10.f45513h = i37;
                            }
                        }
                        c5507d11.a(c5507d10, 0);
                        if (i32 == i16 + 1) {
                            int i38 = this.f45637j;
                            if (c5507d11.h()) {
                                c5507d11.f45513h = i38;
                            }
                        }
                    }
                    if (c5508e9 != c5508e7) {
                        int i39 = c5510g.f45619T0;
                        c10 = 3;
                        if (i39 == 3 && c5508e.f45519E && c5508e9 != c5508e && c5508e9.f45519E) {
                            c5508e9.f45528N.a(c5508e.f45528N, 0);
                        } else {
                            C5507d c5507d12 = c5508e9.f45525K;
                            if (i39 != 0) {
                                C5507d c5507d13 = c5508e9.f45527M;
                                if (i39 == 1) {
                                    c5507d13.a(c5507d9, 0);
                                } else if (z12) {
                                    c5507d12.a(this.f45633e, this.i);
                                    c5507d13.a(this.f45635g, this.f45638k);
                                } else {
                                    c5507d12.a(c5507d8, 0);
                                    c5507d13.a(c5507d9, 0);
                                }
                            } else {
                                c5507d12.a(c5507d8, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                    c5508e8 = c5508e9;
                }
                i32++;
                z13 = z12;
            }
        }

        public final int c() {
            return this.f45629a == 1 ? this.f45640m - C5510g.this.f45617R0 : this.f45640m;
        }

        public final int d() {
            return this.f45629a == 0 ? this.f45639l - C5510g.this.f45616Q0 : this.f45639l;
        }

        public final void e(int i) {
            int i10 = this.f45643p;
            if (i10 == 0) {
                return;
            }
            int i11 = this.f45642o;
            int i12 = i / i10;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = this.f45641n;
                int i15 = i14 + i13;
                C5510g c5510g = C5510g.this;
                if (i15 >= c5510g.f45628c1) {
                    break;
                }
                C5508e c5508e = c5510g.f45627b1[i14 + i13];
                if (this.f45629a == 0) {
                    if (c5508e != null) {
                        C5508e.b[] bVarArr = c5508e.f45535U;
                        if (bVarArr[0] == C5508e.b.MATCH_CONSTRAINT && c5508e.f45574r == 0) {
                            c5510g.U(c5508e, C5508e.b.FIXED, i12, bVarArr[1], c5508e.k());
                        }
                    }
                } else if (c5508e != null) {
                    C5508e.b[] bVarArr2 = c5508e.f45535U;
                    if (bVarArr2[1] == C5508e.b.MATCH_CONSTRAINT && c5508e.f45575s == 0) {
                        int i16 = i12;
                        c5510g.U(c5508e, bVarArr2[0], c5508e.q(), C5508e.b.FIXED, i16);
                        i12 = i16;
                    }
                }
            }
            this.f45639l = 0;
            this.f45640m = 0;
            this.f45630b = null;
            this.f45631c = 0;
            int i17 = this.f45642o;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = this.f45641n + i18;
                C5510g c5510g2 = C5510g.this;
                if (i19 >= c5510g2.f45628c1) {
                    return;
                }
                C5508e c5508e2 = c5510g2.f45627b1[i19];
                if (this.f45629a == 0) {
                    int iQ = c5508e2.q();
                    int i20 = c5510g2.f45616Q0;
                    if (c5508e2.f45557i0 == 8) {
                        i20 = 0;
                    }
                    this.f45639l = iQ + i20 + this.f45639l;
                    int iV = c5510g2.V(c5508e2, this.f45644q);
                    if (this.f45630b == null || this.f45631c < iV) {
                        this.f45630b = c5508e2;
                        this.f45631c = iV;
                        this.f45640m = iV;
                    }
                } else {
                    int iW = c5510g2.W(c5508e2, this.f45644q);
                    int iV2 = c5510g2.V(c5508e2, this.f45644q);
                    int i21 = c5510g2.f45617R0;
                    if (c5508e2.f45557i0 == 8) {
                        i21 = 0;
                    }
                    this.f45640m = iV2 + i21 + this.f45640m;
                    if (this.f45630b == null || this.f45631c < iW) {
                        this.f45630b = c5508e2;
                        this.f45631c = iW;
                        this.f45639l = iW;
                    }
                }
            }
        }

        public final void f(int i, C5507d c5507d, C5507d c5507d2, C5507d c5507d3, C5507d c5507d4, int i10, int i11, int i12, int i13, int i14) {
            this.f45629a = i;
            this.f45632d = c5507d;
            this.f45633e = c5507d2;
            this.f45634f = c5507d3;
            this.f45635g = c5507d4;
            this.f45636h = i10;
            this.i = i11;
            this.f45637j = i12;
            this.f45638k = i13;
            this.f45644q = i14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    @Override // r0.C5514k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(int r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C5510g.T(int, int, int, int):void");
    }

    public final int V(C5508e c5508e, int i) {
        C5508e c5508e2;
        if (c5508e == null) {
            return 0;
        }
        C5508e.b[] bVarArr = c5508e.f45535U;
        if (bVarArr[1] == C5508e.b.MATCH_CONSTRAINT) {
            int i10 = c5508e.f45575s;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (c5508e.f45582z * i);
                if (i11 != c5508e.k()) {
                    c5508e.f45553g = true;
                    U(c5508e, bVarArr[0], c5508e.q(), C5508e.b.FIXED, i11);
                }
                return i11;
            }
            c5508e2 = c5508e;
            if (i10 == 1) {
                return c5508e2.k();
            }
            if (i10 == 3) {
                return (int) ((c5508e2.q() * c5508e2.f45539Y) + 0.5f);
            }
        } else {
            c5508e2 = c5508e;
        }
        return c5508e2.k();
    }

    public final int W(C5508e c5508e, int i) {
        C5508e c5508e2;
        if (c5508e == null) {
            return 0;
        }
        C5508e.b[] bVarArr = c5508e.f45535U;
        if (bVarArr[0] == C5508e.b.MATCH_CONSTRAINT) {
            int i10 = c5508e.f45574r;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (c5508e.f45579w * i);
                if (i11 != c5508e.q()) {
                    c5508e.f45553g = true;
                    U(c5508e, C5508e.b.FIXED, i11, bVarArr[1], c5508e.k());
                }
                return i11;
            }
            c5508e2 = c5508e;
            if (i10 == 1) {
                return c5508e2.q();
            }
            if (i10 == 3) {
                return (int) ((c5508e2.k() * c5508e2.f45539Y) + 0.5f);
            }
        } else {
            c5508e2 = c5508e;
        }
        return c5508e2.q();
    }

    @Override // r0.C5508e
    public final void b(p0.c cVar, boolean z10) {
        C5508e c5508e;
        float f10;
        int i;
        super.b(cVar, z10);
        C5508e c5508e2 = this.f45536V;
        boolean z11 = c5508e2 != null && ((C5509f) c5508e2).f45601w0;
        int i10 = this.f45620U0;
        ArrayList<a> arrayList = this.f45623X0;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    arrayList.get(i11).b(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        arrayList.get(i12).b(z11, i12, i12 == size2 + (-1));
                        i12++;
                    }
                }
            } else if (this.f45626a1 != null && this.f45625Z0 != null && this.f45624Y0 != null) {
                for (int i13 = 0; i13 < this.f45628c1; i13++) {
                    this.f45627b1[i13].D();
                }
                int[] iArr = this.f45626a1;
                int i14 = iArr[0];
                int i15 = iArr[1];
                float f11 = this.f45610K0;
                C5508e c5508e3 = null;
                int i16 = 0;
                while (i16 < i14) {
                    if (z11) {
                        i = (i14 - i16) - 1;
                        f10 = 1.0f - this.f45610K0;
                    } else {
                        f10 = f11;
                        i = i16;
                    }
                    C5508e c5508e4 = this.f45625Z0[i];
                    if (c5508e4 != null && c5508e4.f45557i0 != 8) {
                        C5507d c5507d = c5508e4.f45524J;
                        if (i16 == 0) {
                            c5508e4.f(c5507d, this.f45524J, this.f45664x0);
                            c5508e4.f45561k0 = this.f45605E0;
                            c5508e4.f45552f0 = f10;
                        }
                        if (i16 == i14 - 1) {
                            c5508e4.f(c5508e4.f45526L, this.f45526L, this.f45665y0);
                        }
                        if (i16 > 0 && c5508e3 != null) {
                            int i17 = this.f45616Q0;
                            C5507d c5507d2 = c5508e3.f45526L;
                            c5508e4.f(c5507d, c5507d2, i17);
                            c5508e3.f(c5507d2, c5507d, 0);
                        }
                        c5508e3 = c5508e4;
                    }
                    i16++;
                    f11 = f10;
                }
                for (int i18 = 0; i18 < i15; i18++) {
                    C5508e c5508e5 = this.f45624Y0[i18];
                    if (c5508e5 != null && c5508e5.f45557i0 != 8) {
                        C5507d c5507d3 = c5508e5.f45525K;
                        if (i18 == 0) {
                            c5508e5.f(c5507d3, this.f45525K, this.f45660t0);
                            c5508e5.f45563l0 = this.F0;
                            c5508e5.f45554g0 = this.f45611L0;
                        }
                        if (i18 == i15 - 1) {
                            c5508e5.f(c5508e5.f45527M, this.f45527M, this.f45661u0);
                        }
                        if (i18 > 0 && c5508e3 != null) {
                            int i19 = this.f45617R0;
                            C5507d c5507d4 = c5508e3.f45527M;
                            c5508e5.f(c5507d3, c5507d4, i19);
                            c5508e3.f(c5507d4, c5507d3, 0);
                        }
                        c5508e3 = c5508e5;
                    }
                }
                for (int i20 = 0; i20 < i14; i20++) {
                    for (int i21 = 0; i21 < i15; i21++) {
                        int i22 = (i21 * i14) + i20;
                        if (this.f45622W0 == 1) {
                            i22 = (i20 * i15) + i21;
                        }
                        C5508e[] c5508eArr = this.f45627b1;
                        if (i22 < c5508eArr.length && (c5508e = c5508eArr[i22]) != null && c5508e.f45557i0 != 8) {
                            C5508e c5508e6 = this.f45625Z0[i20];
                            C5508e c5508e7 = this.f45624Y0[i21];
                            if (c5508e != c5508e6) {
                                c5508e.f(c5508e.f45524J, c5508e6.f45524J, 0);
                                c5508e.f(c5508e.f45526L, c5508e6.f45526L, 0);
                            }
                            if (c5508e != c5508e7) {
                                c5508e.f(c5508e.f45525K, c5508e7.f45525K, 0);
                                c5508e.f(c5508e.f45527M, c5508e7.f45527M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(z11, 0, true);
        }
        this.f45666z0 = false;
    }
}
