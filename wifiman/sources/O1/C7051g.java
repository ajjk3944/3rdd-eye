package o1;

import java.util.ArrayList;
import o1.C7049e;

/* renamed from: o1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7051g extends AbstractC7056l {

    /* renamed from: i1, reason: collision with root package name */
    private C7049e[] f55202i1;

    /* renamed from: L0, reason: collision with root package name */
    private int f55179L0 = -1;

    /* renamed from: M0, reason: collision with root package name */
    private int f55180M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    private int f55181N0 = -1;

    /* renamed from: O0, reason: collision with root package name */
    private int f55182O0 = -1;

    /* renamed from: P0, reason: collision with root package name */
    private int f55183P0 = -1;

    /* renamed from: Q0, reason: collision with root package name */
    private int f55184Q0 = -1;

    /* renamed from: R0, reason: collision with root package name */
    private float f55185R0 = 0.5f;

    /* renamed from: S0, reason: collision with root package name */
    private float f55186S0 = 0.5f;

    /* renamed from: T0, reason: collision with root package name */
    private float f55187T0 = 0.5f;

    /* renamed from: U0, reason: collision with root package name */
    private float f55188U0 = 0.5f;

    /* renamed from: V0, reason: collision with root package name */
    private float f55189V0 = 0.5f;

    /* renamed from: W0, reason: collision with root package name */
    private float f55190W0 = 0.5f;

    /* renamed from: X0, reason: collision with root package name */
    private int f55191X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    private int f55192Y0 = 0;

    /* renamed from: Z0, reason: collision with root package name */
    private int f55193Z0 = 2;

    /* renamed from: a1, reason: collision with root package name */
    private int f55194a1 = 2;

    /* renamed from: b1, reason: collision with root package name */
    private int f55195b1 = 0;

    /* renamed from: c1, reason: collision with root package name */
    private int f55196c1 = -1;

    /* renamed from: d1, reason: collision with root package name */
    private int f55197d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    private ArrayList f55198e1 = new ArrayList();

    /* renamed from: f1, reason: collision with root package name */
    private C7049e[] f55199f1 = null;

    /* renamed from: g1, reason: collision with root package name */
    private C7049e[] f55200g1 = null;

    /* renamed from: h1, reason: collision with root package name */
    private int[] f55201h1 = null;

    /* renamed from: j1, reason: collision with root package name */
    private int f55203j1 = 0;

    /* renamed from: o1.g$a */
    private class a {

        /* renamed from: a, reason: collision with root package name */
        private int f55204a;

        /* renamed from: d, reason: collision with root package name */
        private C7048d f55207d;

        /* renamed from: e, reason: collision with root package name */
        private C7048d f55208e;

        /* renamed from: f, reason: collision with root package name */
        private C7048d f55209f;

        /* renamed from: g, reason: collision with root package name */
        private C7048d f55210g;

        /* renamed from: h, reason: collision with root package name */
        private int f55211h;

        /* renamed from: i, reason: collision with root package name */
        private int f55212i;

        /* renamed from: j, reason: collision with root package name */
        private int f55213j;

        /* renamed from: k, reason: collision with root package name */
        private int f55214k;

        /* renamed from: q, reason: collision with root package name */
        private int f55220q;

        /* renamed from: b, reason: collision with root package name */
        private C7049e f55205b = null;

        /* renamed from: c, reason: collision with root package name */
        int f55206c = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f55215l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f55216m = 0;

        /* renamed from: n, reason: collision with root package name */
        private int f55217n = 0;

        /* renamed from: o, reason: collision with root package name */
        private int f55218o = 0;

        /* renamed from: p, reason: collision with root package name */
        private int f55219p = 0;

        public a(int i10, C7048d c7048d, C7048d c7048d2, C7048d c7048d3, C7048d c7048d4, int i11) {
            this.f55211h = 0;
            this.f55212i = 0;
            this.f55213j = 0;
            this.f55214k = 0;
            this.f55220q = 0;
            this.f55204a = i10;
            this.f55207d = c7048d;
            this.f55208e = c7048d2;
            this.f55209f = c7048d3;
            this.f55210g = c7048d4;
            this.f55211h = C7051g.this.P0();
            this.f55212i = C7051g.this.R0();
            this.f55213j = C7051g.this.Q0();
            this.f55214k = C7051g.this.O0();
            this.f55220q = i11;
        }

        private void h() {
            this.f55215l = 0;
            this.f55216m = 0;
            this.f55205b = null;
            this.f55206c = 0;
            int i10 = this.f55218o;
            for (int i11 = 0; i11 < i10 && this.f55217n + i11 < C7051g.this.f55203j1; i11++) {
                C7049e c7049e = C7051g.this.f55202i1[this.f55217n + i11];
                if (this.f55204a == 0) {
                    int iP = c7049e.P();
                    int i12 = C7051g.this.f55191X0;
                    if (c7049e.O() == 8) {
                        i12 = 0;
                    }
                    this.f55215l += iP + i12;
                    int iA1 = C7051g.this.A1(c7049e, this.f55220q);
                    if (this.f55205b == null || this.f55206c < iA1) {
                        this.f55205b = c7049e;
                        this.f55206c = iA1;
                        this.f55216m = iA1;
                    }
                } else {
                    int iB1 = C7051g.this.B1(c7049e, this.f55220q);
                    int iA12 = C7051g.this.A1(c7049e, this.f55220q);
                    int i13 = C7051g.this.f55192Y0;
                    if (c7049e.O() == 8) {
                        i13 = 0;
                    }
                    this.f55216m += iA12 + i13;
                    if (this.f55205b == null || this.f55206c < iB1) {
                        this.f55205b = c7049e;
                        this.f55206c = iB1;
                        this.f55215l = iB1;
                    }
                }
            }
        }

        public void b(C7049e c7049e) {
            if (this.f55204a == 0) {
                int iB1 = C7051g.this.B1(c7049e, this.f55220q);
                if (c7049e.y() == C7049e.b.MATCH_CONSTRAINT) {
                    this.f55219p++;
                    iB1 = 0;
                }
                this.f55215l += iB1 + (c7049e.O() != 8 ? C7051g.this.f55191X0 : 0);
                int iA1 = C7051g.this.A1(c7049e, this.f55220q);
                if (this.f55205b == null || this.f55206c < iA1) {
                    this.f55205b = c7049e;
                    this.f55206c = iA1;
                    this.f55216m = iA1;
                }
            } else {
                int iB12 = C7051g.this.B1(c7049e, this.f55220q);
                int iA12 = C7051g.this.A1(c7049e, this.f55220q);
                if (c7049e.M() == C7049e.b.MATCH_CONSTRAINT) {
                    this.f55219p++;
                    iA12 = 0;
                }
                this.f55216m += iA12 + (c7049e.O() != 8 ? C7051g.this.f55192Y0 : 0);
                if (this.f55205b == null || this.f55206c < iB12) {
                    this.f55205b = c7049e;
                    this.f55206c = iB12;
                    this.f55215l = iB12;
                }
            }
            this.f55218o++;
        }

        public void c() {
            this.f55206c = 0;
            this.f55205b = null;
            this.f55215l = 0;
            this.f55216m = 0;
            this.f55217n = 0;
            this.f55218o = 0;
            this.f55219p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            C7049e c7049e;
            char c10;
            int i11 = this.f55218o;
            for (int i12 = 0; i12 < i11 && this.f55217n + i12 < C7051g.this.f55203j1; i12++) {
                C7049e c7049e2 = C7051g.this.f55202i1[this.f55217n + i12];
                if (c7049e2 != null) {
                    c7049e2.Z();
                }
            }
            if (i11 == 0 || this.f55205b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i13 = -1;
            int i14 = -1;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = z10 ? (i11 - 1) - i15 : i15;
                if (this.f55217n + i16 >= C7051g.this.f55203j1) {
                    break;
                }
                if (C7051g.this.f55202i1[this.f55217n + i16].O() == 0) {
                    if (i13 == -1) {
                        i13 = i15;
                    }
                    i14 = i15;
                }
            }
            C7049e c7049e3 = null;
            if (this.f55204a != 0) {
                C7049e c7049e4 = this.f55205b;
                c7049e4.j0(C7051g.this.f55179L0);
                int i17 = this.f55211h;
                if (i10 > 0) {
                    i17 += C7051g.this.f55191X0;
                }
                if (z10) {
                    c7049e4.f55084D.a(this.f55209f, i17);
                    if (z11) {
                        c7049e4.f55082B.a(this.f55207d, this.f55213j);
                    }
                    if (i10 > 0) {
                        this.f55209f.f55073b.f55082B.a(c7049e4.f55084D, 0);
                    }
                } else {
                    c7049e4.f55082B.a(this.f55207d, i17);
                    if (z11) {
                        c7049e4.f55084D.a(this.f55209f, this.f55213j);
                    }
                    if (i10 > 0) {
                        this.f55207d.f55073b.f55084D.a(c7049e4.f55082B, 0);
                    }
                }
                int i18 = 0;
                while (i18 < i11 && this.f55217n + i18 < C7051g.this.f55203j1) {
                    C7049e c7049e5 = C7051g.this.f55202i1[this.f55217n + i18];
                    if (i18 == 0) {
                        c7049e5.j(c7049e5.f55083C, this.f55208e, this.f55212i);
                        int i19 = C7051g.this.f55180M0;
                        float f10 = C7051g.this.f55186S0;
                        if (this.f55217n == 0 && C7051g.this.f55182O0 != -1) {
                            i19 = C7051g.this.f55182O0;
                            f10 = C7051g.this.f55188U0;
                        } else if (z11 && C7051g.this.f55184Q0 != -1) {
                            i19 = C7051g.this.f55184Q0;
                            f10 = C7051g.this.f55190W0;
                        }
                        c7049e5.y0(i19);
                        c7049e5.x0(f10);
                    }
                    if (i18 == i11 - 1) {
                        c7049e5.j(c7049e5.f55085E, this.f55210g, this.f55214k);
                    }
                    if (c7049e3 != null) {
                        c7049e5.f55083C.a(c7049e3.f55085E, C7051g.this.f55192Y0);
                        if (i18 == i13) {
                            c7049e5.f55083C.n(this.f55212i);
                        }
                        c7049e3.f55085E.a(c7049e5.f55083C, 0);
                        if (i18 == i14 + 1) {
                            c7049e3.f55085E.n(this.f55214k);
                        }
                    }
                    if (c7049e5 != c7049e4) {
                        if (z10) {
                            int i20 = C7051g.this.f55193Z0;
                            if (i20 == 0) {
                                c7049e5.f55084D.a(c7049e4.f55084D, 0);
                            } else if (i20 == 1) {
                                c7049e5.f55082B.a(c7049e4.f55082B, 0);
                            } else if (i20 == 2) {
                                c7049e5.f55082B.a(c7049e4.f55082B, 0);
                                c7049e5.f55084D.a(c7049e4.f55084D, 0);
                            }
                        } else {
                            int i21 = C7051g.this.f55193Z0;
                            if (i21 == 0) {
                                c7049e5.f55082B.a(c7049e4.f55082B, 0);
                            } else if (i21 == 1) {
                                c7049e5.f55084D.a(c7049e4.f55084D, 0);
                            } else if (i21 == 2) {
                                if (z12) {
                                    c7049e5.f55082B.a(this.f55207d, this.f55211h);
                                    c7049e5.f55084D.a(this.f55209f, this.f55213j);
                                } else {
                                    c7049e5.f55082B.a(c7049e4.f55082B, 0);
                                    c7049e5.f55084D.a(c7049e4.f55084D, 0);
                                }
                            }
                        }
                    }
                    i18++;
                    c7049e3 = c7049e5;
                }
                return;
            }
            C7049e c7049e6 = this.f55205b;
            c7049e6.y0(C7051g.this.f55180M0);
            int i22 = this.f55212i;
            if (i10 > 0) {
                i22 += C7051g.this.f55192Y0;
            }
            c7049e6.f55083C.a(this.f55208e, i22);
            if (z11) {
                c7049e6.f55085E.a(this.f55210g, this.f55214k);
            }
            if (i10 > 0) {
                this.f55208e.f55073b.f55085E.a(c7049e6.f55083C, 0);
            }
            if (C7051g.this.f55194a1 != 3 || c7049e6.S()) {
                c7049e = c7049e6;
            } else {
                for (int i23 = 0; i23 < i11; i23++) {
                    int i24 = z10 ? (i11 - 1) - i23 : i23;
                    if (this.f55217n + i24 >= C7051g.this.f55203j1) {
                        break;
                    }
                    c7049e = C7051g.this.f55202i1[this.f55217n + i24];
                    if (c7049e.S()) {
                        break;
                    }
                }
                c7049e = c7049e6;
            }
            int i25 = 0;
            while (i25 < i11) {
                int i26 = z10 ? (i11 - 1) - i25 : i25;
                if (this.f55217n + i26 >= C7051g.this.f55203j1) {
                    return;
                }
                C7049e c7049e7 = C7051g.this.f55202i1[this.f55217n + i26];
                if (i25 == 0) {
                    c7049e7.j(c7049e7.f55082B, this.f55207d, this.f55211h);
                }
                if (i26 == 0) {
                    int i27 = C7051g.this.f55179L0;
                    float f11 = C7051g.this.f55185R0;
                    if (this.f55217n == 0 && C7051g.this.f55181N0 != -1) {
                        i27 = C7051g.this.f55181N0;
                        f11 = C7051g.this.f55187T0;
                    } else if (z11 && C7051g.this.f55183P0 != -1) {
                        i27 = C7051g.this.f55183P0;
                        f11 = C7051g.this.f55189V0;
                    }
                    c7049e7.j0(i27);
                    c7049e7.i0(f11);
                }
                if (i25 == i11 - 1) {
                    c7049e7.j(c7049e7.f55084D, this.f55209f, this.f55213j);
                }
                if (c7049e3 != null) {
                    c7049e7.f55082B.a(c7049e3.f55084D, C7051g.this.f55191X0);
                    if (i25 == i13) {
                        c7049e7.f55082B.n(this.f55211h);
                    }
                    c7049e3.f55084D.a(c7049e7.f55082B, 0);
                    if (i25 == i14 + 1) {
                        c7049e3.f55084D.n(this.f55213j);
                    }
                }
                if (c7049e7 != c7049e6) {
                    c10 = 3;
                    if (C7051g.this.f55194a1 == 3 && c7049e.S() && c7049e7 != c7049e && c7049e7.S()) {
                        c7049e7.f55086F.a(c7049e.f55086F, 0);
                    } else {
                        int i28 = C7051g.this.f55194a1;
                        if (i28 == 0) {
                            c7049e7.f55083C.a(c7049e6.f55083C, 0);
                        } else if (i28 == 1) {
                            c7049e7.f55085E.a(c7049e6.f55085E, 0);
                        } else if (z12) {
                            c7049e7.f55083C.a(this.f55208e, this.f55212i);
                            c7049e7.f55085E.a(this.f55210g, this.f55214k);
                        } else {
                            c7049e7.f55083C.a(c7049e6.f55083C, 0);
                            c7049e7.f55085E.a(c7049e6.f55085E, 0);
                        }
                    }
                } else {
                    c10 = 3;
                }
                i25++;
                c7049e3 = c7049e7;
            }
        }

        public int e() {
            return this.f55204a == 1 ? this.f55216m - C7051g.this.f55192Y0 : this.f55216m;
        }

        public int f() {
            return this.f55204a == 0 ? this.f55215l - C7051g.this.f55191X0 : this.f55215l;
        }

        public void g(int i10) {
            int i11 = this.f55219p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f55218o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f55217n + i14 < C7051g.this.f55203j1; i14++) {
                C7049e c7049e = C7051g.this.f55202i1[this.f55217n + i14];
                if (this.f55204a == 0) {
                    if (c7049e != null && c7049e.y() == C7049e.b.MATCH_CONSTRAINT && c7049e.f55129l == 0) {
                        C7051g.this.T0(c7049e, C7049e.b.FIXED, i13, c7049e.M(), c7049e.v());
                    }
                } else if (c7049e != null && c7049e.M() == C7049e.b.MATCH_CONSTRAINT && c7049e.f55131m == 0) {
                    C7051g.this.T0(c7049e, c7049e.y(), c7049e.P(), C7049e.b.FIXED, i13);
                }
            }
            h();
        }

        public void i(int i10) {
            this.f55217n = i10;
        }

        public void j(int i10, C7048d c7048d, C7048d c7048d2, C7048d c7048d3, C7048d c7048d4, int i11, int i12, int i13, int i14, int i15) {
            this.f55204a = i10;
            this.f55207d = c7048d;
            this.f55208e = c7048d2;
            this.f55209f = c7048d3;
            this.f55210g = c7048d4;
            this.f55211h = i11;
            this.f55212i = i12;
            this.f55213j = i13;
            this.f55214k = i14;
            this.f55220q = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A1(C7049e c7049e, int i10) {
        if (c7049e == null) {
            return 0;
        }
        if (c7049e.M() == C7049e.b.MATCH_CONSTRAINT) {
            int i11 = c7049e.f55131m;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c7049e.f55145t * i10);
                if (i12 != c7049e.v()) {
                    T0(c7049e, c7049e.y(), c7049e.P(), C7049e.b.FIXED, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return c7049e.v();
            }
            if (i11 == 3) {
                return (int) ((c7049e.P() * c7049e.f55097Q) + 0.5f);
            }
        }
        return c7049e.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B1(C7049e c7049e, int i10) {
        if (c7049e == null) {
            return 0;
        }
        if (c7049e.y() == C7049e.b.MATCH_CONSTRAINT) {
            int i11 = c7049e.f55129l;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c7049e.f55139q * i10);
                if (i12 != c7049e.P()) {
                    T0(c7049e, C7049e.b.FIXED, i12, c7049e.M(), c7049e.v());
                }
                return i12;
            }
            if (i11 == 1) {
                return c7049e.P();
            }
            if (i11 == 3) {
                return (int) ((c7049e.v() * c7049e.f55097Q) + 0.5f);
            }
        }
        return c7049e.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void C1(o1.C7049e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C7051g.C1(o1.e[], int, int, int, int[]):void");
    }

    private void D1(C7049e[] c7049eArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        int i14;
        int i15;
        C7048d c7048d;
        int iQ0;
        C7048d c7048d2;
        int iO0;
        int i16;
        if (i10 == 0) {
            return;
        }
        this.f55198e1.clear();
        a aVar = new a(i11, this.f55082B, this.f55083C, this.f55084D, this.f55085E, i12);
        this.f55198e1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                C7049e c7049e = c7049eArr[i18];
                int iB1 = B1(c7049e, i12);
                if (c7049e.y() == C7049e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i12 || (this.f55191X0 + i17) + iB1 > i12) && aVar.f55205b != null;
                if (!z10 && i18 > 0 && (i16 = this.f55196c1) > 0 && i18 % i16 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = new a(i11, this.f55082B, this.f55083C, this.f55084D, this.f55085E, i12);
                    aVar.i(i18);
                    this.f55198e1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += this.f55191X0 + iB1;
                    }
                    aVar.b(c7049e);
                    i18++;
                    i13 = i19;
                }
                i17 = iB1;
                aVar.b(c7049e);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                C7049e c7049e2 = c7049eArr[i21];
                int iA1 = A1(c7049e2, i12);
                if (c7049e2.M() == C7049e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i12 || (this.f55192Y0 + i20) + iA1 > i12) && aVar.f55205b != null;
                if (!z11 && i21 > 0 && (i14 = this.f55196c1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = new a(i11, this.f55082B, this.f55083C, this.f55084D, this.f55085E, i12);
                    aVar.i(i21);
                    this.f55198e1.add(aVar);
                } else {
                    if (i21 > 0) {
                        i20 += this.f55192Y0 + iA1;
                    }
                    aVar.b(c7049e2);
                    i21++;
                    i13 = i22;
                }
                i20 = iA1;
                aVar.b(c7049e2);
                i21++;
                i13 = i22;
            }
        }
        int size = this.f55198e1.size();
        C7048d c7048d3 = this.f55082B;
        C7048d c7048d4 = this.f55083C;
        C7048d c7048d5 = this.f55084D;
        C7048d c7048d6 = this.f55085E;
        int iP0 = P0();
        int iR0 = R0();
        int iQ02 = Q0();
        int iO02 = O0();
        C7049e.b bVarY = y();
        C7049e.b bVar = C7049e.b.WRAP_CONTENT;
        boolean z12 = bVarY == bVar || M() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = (a) this.f55198e1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        int i24 = iR0;
        int i25 = iQ02;
        int iE = 0;
        int iF = 0;
        int i26 = 0;
        int i27 = iP0;
        C7048d c7048d7 = c7048d4;
        C7048d c7048d8 = c7048d3;
        int i28 = iO02;
        while (i26 < size) {
            a aVar3 = (a) this.f55198e1.get(i26);
            if (i11 == 0) {
                if (i26 < size - 1) {
                    c7048d2 = ((a) this.f55198e1.get(i26 + 1)).f55205b.f55083C;
                    iO0 = 0;
                } else {
                    c7048d2 = this.f55085E;
                    iO0 = O0();
                }
                C7048d c7048d9 = aVar3.f55205b.f55085E;
                C7048d c7048d10 = c7048d8;
                C7048d c7048d11 = c7048d8;
                int i29 = iE;
                C7048d c7048d12 = c7048d7;
                int i30 = iF;
                C7048d c7048d13 = c7048d5;
                C7048d c7048d14 = c7048d5;
                i15 = i26;
                aVar3.j(i11, c7048d10, c7048d12, c7048d13, c7048d2, i27, i24, i25, iO0, i12);
                int iMax = Math.max(i30, aVar3.f());
                iE = i29 + aVar3.e();
                if (i15 > 0) {
                    iE += this.f55192Y0;
                }
                c7048d8 = c7048d11;
                iF = iMax;
                i24 = 0;
                c7048d7 = c7048d9;
                c7048d = c7048d14;
                int i31 = iO0;
                c7048d6 = c7048d2;
                i28 = i31;
            } else {
                C7048d c7048d15 = c7048d8;
                int i32 = iE;
                int i33 = iF;
                i15 = i26;
                if (i15 < size - 1) {
                    c7048d = ((a) this.f55198e1.get(i15 + 1)).f55205b.f55082B;
                    iQ0 = 0;
                } else {
                    c7048d = this.f55084D;
                    iQ0 = Q0();
                }
                C7048d c7048d16 = aVar3.f55205b.f55084D;
                aVar3.j(i11, c7048d15, c7048d7, c7048d, c7048d6, i27, i24, iQ0, i28, i12);
                iF = i33 + aVar3.f();
                int iMax2 = Math.max(i32, aVar3.e());
                if (i15 > 0) {
                    iF += this.f55191X0;
                }
                iE = iMax2;
                i27 = 0;
                i25 = iQ0;
                c7048d8 = c7048d16;
            }
            i26 = i15 + 1;
            c7048d5 = c7048d;
        }
        iArr[0] = iF;
        iArr[1] = iE;
    }

    private void E1(C7049e[] c7049eArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f55198e1.size() == 0) {
            aVar = new a(i11, this.f55082B, this.f55083C, this.f55084D, this.f55085E, i12);
            this.f55198e1.add(aVar);
        } else {
            a aVar2 = (a) this.f55198e1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i11, this.f55082B, this.f55083C, this.f55084D, this.f55085E, P0(), R0(), Q0(), O0(), i12);
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(c7049eArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    private void z1(boolean z10) {
        C7049e c7049e;
        if (this.f55201h1 == null || this.f55200g1 == null || this.f55199f1 == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f55203j1; i10++) {
            this.f55202i1[i10].Z();
        }
        int[] iArr = this.f55201h1;
        int i11 = iArr[0];
        int i12 = iArr[1];
        C7049e c7049e2 = null;
        for (int i13 = 0; i13 < i11; i13++) {
            C7049e c7049e3 = this.f55200g1[z10 ? (i11 - i13) - 1 : i13];
            if (c7049e3 != null && c7049e3.O() != 8) {
                if (i13 == 0) {
                    c7049e3.j(c7049e3.f55082B, this.f55082B, P0());
                    c7049e3.j0(this.f55179L0);
                    c7049e3.i0(this.f55185R0);
                }
                if (i13 == i11 - 1) {
                    c7049e3.j(c7049e3.f55084D, this.f55084D, Q0());
                }
                if (i13 > 0) {
                    c7049e3.j(c7049e3.f55082B, c7049e2.f55084D, this.f55191X0);
                    c7049e2.j(c7049e2.f55084D, c7049e3.f55082B, 0);
                }
                c7049e2 = c7049e3;
            }
        }
        for (int i14 = 0; i14 < i12; i14++) {
            C7049e c7049e4 = this.f55199f1[i14];
            if (c7049e4 != null && c7049e4.O() != 8) {
                if (i14 == 0) {
                    c7049e4.j(c7049e4.f55083C, this.f55083C, R0());
                    c7049e4.y0(this.f55180M0);
                    c7049e4.x0(this.f55186S0);
                }
                if (i14 == i12 - 1) {
                    c7049e4.j(c7049e4.f55085E, this.f55085E, O0());
                }
                if (i14 > 0) {
                    c7049e4.j(c7049e4.f55083C, c7049e2.f55085E, this.f55192Y0);
                    c7049e2.j(c7049e2.f55085E, c7049e4.f55083C, 0);
                }
                c7049e2 = c7049e4;
            }
        }
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = (i16 * i11) + i15;
                if (this.f55197d1 == 1) {
                    i17 = (i15 * i12) + i16;
                }
                C7049e[] c7049eArr = this.f55202i1;
                if (i17 < c7049eArr.length && (c7049e = c7049eArr[i17]) != null && c7049e.O() != 8) {
                    C7049e c7049e5 = this.f55200g1[i15];
                    C7049e c7049e6 = this.f55199f1[i16];
                    if (c7049e != c7049e5) {
                        c7049e.j(c7049e.f55082B, c7049e5.f55082B, 0);
                        c7049e.j(c7049e.f55084D, c7049e5.f55084D, 0);
                    }
                    if (c7049e != c7049e6) {
                        c7049e.j(c7049e.f55083C, c7049e6.f55083C, 0);
                        c7049e.j(c7049e.f55085E, c7049e6.f55085E, 0);
                    }
                }
            }
        }
    }

    public void F1(float f10) {
        this.f55187T0 = f10;
    }

    public void G1(int i10) {
        this.f55181N0 = i10;
    }

    public void H1(float f10) {
        this.f55188U0 = f10;
    }

    public void I1(int i10) {
        this.f55182O0 = i10;
    }

    public void J1(int i10) {
        this.f55193Z0 = i10;
    }

    public void K1(float f10) {
        this.f55185R0 = f10;
    }

    public void L1(int i10) {
        this.f55191X0 = i10;
    }

    public void M1(int i10) {
        this.f55179L0 = i10;
    }

    public void N1(float f10) {
        this.f55189V0 = f10;
    }

    public void O1(int i10) {
        this.f55183P0 = i10;
    }

    public void P1(float f10) {
        this.f55190W0 = f10;
    }

    public void Q1(int i10) {
        this.f55184Q0 = i10;
    }

    public void R1(int i10) {
        this.f55196c1 = i10;
    }

    @Override // o1.AbstractC7056l
    public void S0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int[] iArr;
        boolean z10;
        if (this.f55230x0 > 0 && !U0()) {
            X0(0, 0);
            W0(false);
            return;
        }
        int iP0 = P0();
        int iQ0 = Q0();
        int iR0 = R0();
        int iO0 = O0();
        int[] iArr2 = new int[2];
        int i16 = (i11 - iP0) - iQ0;
        int i17 = this.f55197d1;
        if (i17 == 1) {
            i16 = (i13 - iR0) - iO0;
        }
        int i18 = i16;
        if (i17 == 0) {
            if (this.f55179L0 == -1) {
                this.f55179L0 = 0;
            }
            if (this.f55180M0 == -1) {
                this.f55180M0 = 0;
            }
        } else {
            if (this.f55179L0 == -1) {
                this.f55179L0 = 0;
            }
            if (this.f55180M0 == -1) {
                this.f55180M0 = 0;
            }
        }
        C7049e[] c7049eArr = this.f55229w0;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            i14 = this.f55230x0;
            if (i19 >= i14) {
                break;
            }
            if (this.f55229w0[i19].O() == 8) {
                i20++;
            }
            i19++;
        }
        if (i20 > 0) {
            c7049eArr = new C7049e[i14 - i20];
            int i21 = 0;
            for (int i22 = 0; i22 < this.f55230x0; i22++) {
                C7049e c7049e = this.f55229w0[i22];
                if (c7049e.O() != 8) {
                    c7049eArr[i21] = c7049e;
                    i21++;
                }
            }
            i15 = i21;
        } else {
            i15 = i14;
        }
        this.f55202i1 = c7049eArr;
        this.f55203j1 = i15;
        int i23 = this.f55195b1;
        if (i23 == 0) {
            iArr = iArr2;
            z10 = true;
            E1(c7049eArr, i15, this.f55197d1, i18, iArr2);
        } else if (i23 == 1) {
            z10 = true;
            iArr = iArr2;
            D1(c7049eArr, i15, this.f55197d1, i18, iArr2);
        } else if (i23 != 2) {
            z10 = true;
            iArr = iArr2;
        } else {
            z10 = true;
            iArr = iArr2;
            C1(c7049eArr, i15, this.f55197d1, i18, iArr2);
        }
        int iMin = iArr[0] + iP0 + iQ0;
        int iMin2 = iArr[z10 ? 1 : 0] + iR0 + iO0;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        X0(iMin, iMin2);
        E0(iMin);
        h0(iMin2);
        if (this.f55230x0 <= 0) {
            z10 = false;
        }
        W0(z10);
    }

    public void S1(int i10) {
        this.f55197d1 = i10;
    }

    public void T1(int i10) {
        this.f55194a1 = i10;
    }

    public void U1(float f10) {
        this.f55186S0 = f10;
    }

    public void V1(int i10) {
        this.f55192Y0 = i10;
    }

    public void W1(int i10) {
        this.f55180M0 = i10;
    }

    public void X1(int i10) {
        this.f55195b1 = i10;
    }

    @Override // o1.C7049e
    public void f(n1.d dVar) {
        super.f(dVar);
        boolean zA1 = G() != null ? ((C7050f) G()).a1() : false;
        int i10 = this.f55195b1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f55198e1.size();
                int i11 = 0;
                while (i11 < size) {
                    ((a) this.f55198e1.get(i11)).d(zA1, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                z1(zA1);
            }
        } else if (this.f55198e1.size() > 0) {
            ((a) this.f55198e1.get(0)).d(zA1, 0, true);
        }
        W0(false);
    }
}
