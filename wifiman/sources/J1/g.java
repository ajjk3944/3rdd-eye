package j1;

import c1.C4188d;
import j1.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g extends l {

    /* renamed from: w1, reason: collision with root package name */
    private e[] f49998w1;

    /* renamed from: Z0, reason: collision with root package name */
    private int f49975Z0 = -1;

    /* renamed from: a1, reason: collision with root package name */
    private int f49976a1 = -1;

    /* renamed from: b1, reason: collision with root package name */
    private int f49977b1 = -1;

    /* renamed from: c1, reason: collision with root package name */
    private int f49978c1 = -1;

    /* renamed from: d1, reason: collision with root package name */
    private int f49979d1 = -1;

    /* renamed from: e1, reason: collision with root package name */
    private int f49980e1 = -1;

    /* renamed from: f1, reason: collision with root package name */
    private float f49981f1 = 0.5f;

    /* renamed from: g1, reason: collision with root package name */
    private float f49982g1 = 0.5f;

    /* renamed from: h1, reason: collision with root package name */
    private float f49983h1 = 0.5f;

    /* renamed from: i1, reason: collision with root package name */
    private float f49984i1 = 0.5f;

    /* renamed from: j1, reason: collision with root package name */
    private float f49985j1 = 0.5f;

    /* renamed from: k1, reason: collision with root package name */
    private float f49986k1 = 0.5f;

    /* renamed from: l1, reason: collision with root package name */
    private int f49987l1 = 0;

    /* renamed from: m1, reason: collision with root package name */
    private int f49988m1 = 0;

    /* renamed from: n1, reason: collision with root package name */
    private int f49989n1 = 2;

    /* renamed from: o1, reason: collision with root package name */
    private int f49990o1 = 2;

    /* renamed from: p1, reason: collision with root package name */
    private int f49991p1 = 0;

    /* renamed from: q1, reason: collision with root package name */
    private int f49992q1 = -1;

    /* renamed from: r1, reason: collision with root package name */
    private int f49993r1 = 0;

    /* renamed from: s1, reason: collision with root package name */
    private ArrayList f49994s1 = new ArrayList();

    /* renamed from: t1, reason: collision with root package name */
    private e[] f49995t1 = null;

    /* renamed from: u1, reason: collision with root package name */
    private e[] f49996u1 = null;

    /* renamed from: v1, reason: collision with root package name */
    private int[] f49997v1 = null;

    /* renamed from: x1, reason: collision with root package name */
    private int f49999x1 = 0;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        private int f50000a;

        /* renamed from: d, reason: collision with root package name */
        private d f50003d;

        /* renamed from: e, reason: collision with root package name */
        private d f50004e;

        /* renamed from: f, reason: collision with root package name */
        private d f50005f;

        /* renamed from: g, reason: collision with root package name */
        private d f50006g;

        /* renamed from: h, reason: collision with root package name */
        private int f50007h;

        /* renamed from: i, reason: collision with root package name */
        private int f50008i;

        /* renamed from: j, reason: collision with root package name */
        private int f50009j;

        /* renamed from: k, reason: collision with root package name */
        private int f50010k;

        /* renamed from: q, reason: collision with root package name */
        private int f50016q;

        /* renamed from: b, reason: collision with root package name */
        private e f50001b = null;

        /* renamed from: c, reason: collision with root package name */
        int f50002c = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f50011l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f50012m = 0;

        /* renamed from: n, reason: collision with root package name */
        private int f50013n = 0;

        /* renamed from: o, reason: collision with root package name */
        private int f50014o = 0;

        /* renamed from: p, reason: collision with root package name */
        private int f50015p = 0;

        a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f50007h = 0;
            this.f50008i = 0;
            this.f50009j = 0;
            this.f50010k = 0;
            this.f50016q = 0;
            this.f50000a = i10;
            this.f50003d = dVar;
            this.f50004e = dVar2;
            this.f50005f = dVar3;
            this.f50006g = dVar4;
            this.f50007h = g.this.h1();
            this.f50008i = g.this.j1();
            this.f50009j = g.this.i1();
            this.f50010k = g.this.g1();
            this.f50016q = i11;
        }

        private void h() {
            this.f50011l = 0;
            this.f50012m = 0;
            this.f50001b = null;
            this.f50002c = 0;
            int i10 = this.f50014o;
            for (int i11 = 0; i11 < i10 && this.f50013n + i11 < g.this.f49999x1; i11++) {
                e eVar = g.this.f49998w1[this.f50013n + i11];
                if (this.f50000a == 0) {
                    int iO = eVar.O();
                    int i12 = g.this.f49987l1;
                    if (eVar.N() == 8) {
                        i12 = 0;
                    }
                    this.f50011l += iO + i12;
                    int iR1 = g.this.R1(eVar, this.f50016q);
                    if (this.f50001b == null || this.f50002c < iR1) {
                        this.f50001b = eVar;
                        this.f50002c = iR1;
                        this.f50012m = iR1;
                    }
                } else {
                    int iS1 = g.this.S1(eVar, this.f50016q);
                    int iR12 = g.this.R1(eVar, this.f50016q);
                    int i13 = g.this.f49988m1;
                    if (eVar.N() == 8) {
                        i13 = 0;
                    }
                    this.f50012m += iR12 + i13;
                    if (this.f50001b == null || this.f50002c < iS1) {
                        this.f50001b = eVar;
                        this.f50002c = iS1;
                        this.f50011l = iS1;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f50000a == 0) {
                int iS1 = g.this.S1(eVar, this.f50016q);
                if (eVar.x() == e.b.MATCH_CONSTRAINT) {
                    this.f50015p++;
                    iS1 = 0;
                }
                this.f50011l += iS1 + (eVar.N() != 8 ? g.this.f49987l1 : 0);
                int iR1 = g.this.R1(eVar, this.f50016q);
                if (this.f50001b == null || this.f50002c < iR1) {
                    this.f50001b = eVar;
                    this.f50002c = iR1;
                    this.f50012m = iR1;
                }
            } else {
                int iS12 = g.this.S1(eVar, this.f50016q);
                int iR12 = g.this.R1(eVar, this.f50016q);
                if (eVar.M() == e.b.MATCH_CONSTRAINT) {
                    this.f50015p++;
                    iR12 = 0;
                }
                this.f50012m += iR12 + (eVar.N() != 8 ? g.this.f49988m1 : 0);
                if (this.f50001b == null || this.f50002c < iS12) {
                    this.f50001b = eVar;
                    this.f50002c = iS12;
                    this.f50011l = iS12;
                }
            }
            this.f50014o++;
        }

        public void c() {
            this.f50002c = 0;
            this.f50001b = null;
            this.f50011l = 0;
            this.f50012m = 0;
            this.f50013n = 0;
            this.f50014o = 0;
            this.f50015p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            e eVar;
            char c10;
            float f10;
            float f11;
            int i11 = this.f50014o;
            for (int i12 = 0; i12 < i11 && this.f50013n + i12 < g.this.f49999x1; i12++) {
                e eVar2 = g.this.f49998w1[this.f50013n + i12];
                if (eVar2 != null) {
                    eVar2.l0();
                }
            }
            if (i11 == 0 || this.f50001b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i13 = -1;
            int i14 = -1;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = z10 ? (i11 - 1) - i15 : i15;
                if (this.f50013n + i16 >= g.this.f49999x1) {
                    break;
                }
                e eVar3 = g.this.f49998w1[this.f50013n + i16];
                if (eVar3 != null && eVar3.N() == 0) {
                    if (i13 == -1) {
                        i13 = i15;
                    }
                    i14 = i15;
                }
            }
            e eVar4 = null;
            if (this.f50000a != 0) {
                e eVar5 = this.f50001b;
                eVar5.B0(g.this.f49975Z0);
                int i17 = this.f50007h;
                if (i10 > 0) {
                    i17 += g.this.f49987l1;
                }
                if (z10) {
                    eVar5.f49881P.a(this.f50005f, i17);
                    if (z11) {
                        eVar5.f49879N.a(this.f50003d, this.f50009j);
                    }
                    if (i10 > 0) {
                        this.f50005f.f49850d.f49879N.a(eVar5.f49881P, 0);
                    }
                } else {
                    eVar5.f49879N.a(this.f50003d, i17);
                    if (z11) {
                        eVar5.f49881P.a(this.f50005f, this.f50009j);
                    }
                    if (i10 > 0) {
                        this.f50003d.f49850d.f49881P.a(eVar5.f49879N, 0);
                    }
                }
                for (int i18 = 0; i18 < i11 && this.f50013n + i18 < g.this.f49999x1; i18++) {
                    e eVar6 = g.this.f49998w1[this.f50013n + i18];
                    if (eVar6 != null) {
                        if (i18 == 0) {
                            eVar6.h(eVar6.f49880O, this.f50004e, this.f50008i);
                            int i19 = g.this.f49976a1;
                            float f12 = g.this.f49982g1;
                            if (this.f50013n == 0 && g.this.f49978c1 != -1) {
                                i19 = g.this.f49978c1;
                                f12 = g.this.f49984i1;
                            } else if (z11 && g.this.f49980e1 != -1) {
                                i19 = g.this.f49980e1;
                                f12 = g.this.f49986k1;
                            }
                            eVar6.O0(i19);
                            eVar6.N0(f12);
                        }
                        if (i18 == i11 - 1) {
                            eVar6.h(eVar6.f49882Q, this.f50006g, this.f50010k);
                        }
                        if (eVar4 != null) {
                            eVar6.f49880O.a(eVar4.f49882Q, g.this.f49988m1);
                            if (i18 == i13) {
                                eVar6.f49880O.u(this.f50008i);
                            }
                            eVar4.f49882Q.a(eVar6.f49880O, 0);
                            if (i18 == i14 + 1) {
                                eVar4.f49882Q.u(this.f50010k);
                            }
                        }
                        if (eVar6 == eVar5) {
                            eVar4 = eVar6;
                        } else if (z10) {
                            int i20 = g.this.f49989n1;
                            if (i20 == 0) {
                                eVar6.f49881P.a(eVar5.f49881P, 0);
                            } else if (i20 == 1) {
                                eVar6.f49879N.a(eVar5.f49879N, 0);
                            } else if (i20 == 2) {
                                eVar6.f49879N.a(eVar5.f49879N, 0);
                                eVar6.f49881P.a(eVar5.f49881P, 0);
                            }
                            eVar4 = eVar6;
                        } else {
                            int i21 = g.this.f49989n1;
                            if (i21 == 0) {
                                eVar6.f49879N.a(eVar5.f49879N, 0);
                            } else if (i21 == 1) {
                                eVar6.f49881P.a(eVar5.f49881P, 0);
                            } else if (i21 == 2) {
                                if (z12) {
                                    eVar6.f49879N.a(this.f50003d, this.f50007h);
                                    eVar6.f49881P.a(this.f50005f, this.f50009j);
                                } else {
                                    eVar6.f49879N.a(eVar5.f49879N, 0);
                                    eVar6.f49881P.a(eVar5.f49881P, 0);
                                }
                            }
                            eVar4 = eVar6;
                        }
                    }
                }
                return;
            }
            e eVar7 = this.f50001b;
            eVar7.O0(g.this.f49976a1);
            int i22 = this.f50008i;
            if (i10 > 0) {
                i22 += g.this.f49988m1;
            }
            eVar7.f49880O.a(this.f50004e, i22);
            if (z11) {
                eVar7.f49882Q.a(this.f50006g, this.f50010k);
            }
            if (i10 > 0) {
                this.f50004e.f49850d.f49882Q.a(eVar7.f49880O, 0);
            }
            char c11 = 3;
            if (g.this.f49990o1 != 3 || eVar7.R()) {
                eVar = eVar7;
            } else {
                for (int i23 = 0; i23 < i11; i23++) {
                    int i24 = z10 ? (i11 - 1) - i23 : i23;
                    if (this.f50013n + i24 >= g.this.f49999x1) {
                        break;
                    }
                    eVar = g.this.f49998w1[this.f50013n + i24];
                    if (eVar.R()) {
                        break;
                    }
                }
                eVar = eVar7;
            }
            int i25 = 0;
            while (i25 < i11) {
                int i26 = z10 ? (i11 - 1) - i25 : i25;
                if (this.f50013n + i26 >= g.this.f49999x1) {
                    return;
                }
                e eVar8 = g.this.f49998w1[this.f50013n + i26];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c10 = c11;
                } else {
                    if (i25 == 0) {
                        eVar8.h(eVar8.f49879N, this.f50003d, this.f50007h);
                    }
                    if (i26 == 0) {
                        int i27 = g.this.f49975Z0;
                        float f13 = g.this.f49981f1;
                        if (z10) {
                            f13 = 1.0f - f13;
                        }
                        if (this.f50013n != 0 || g.this.f49977b1 == -1) {
                            if (z11 && g.this.f49979d1 != -1) {
                                i27 = g.this.f49979d1;
                                if (z10) {
                                    f11 = g.this.f49985j1;
                                    f10 = 1.0f - f11;
                                    f13 = f10;
                                } else {
                                    f10 = g.this.f49985j1;
                                    f13 = f10;
                                }
                            }
                            eVar8.B0(i27);
                            eVar8.A0(f13);
                        } else {
                            i27 = g.this.f49977b1;
                            if (z10) {
                                f11 = g.this.f49983h1;
                                f10 = 1.0f - f11;
                                f13 = f10;
                                eVar8.B0(i27);
                                eVar8.A0(f13);
                            } else {
                                f10 = g.this.f49983h1;
                                f13 = f10;
                                eVar8.B0(i27);
                                eVar8.A0(f13);
                            }
                        }
                    }
                    if (i25 == i11 - 1) {
                        eVar8.h(eVar8.f49881P, this.f50005f, this.f50009j);
                    }
                    if (eVar4 != null) {
                        eVar8.f49879N.a(eVar4.f49881P, g.this.f49987l1);
                        if (i25 == i13) {
                            eVar8.f49879N.u(this.f50007h);
                        }
                        eVar4.f49881P.a(eVar8.f49879N, 0);
                        if (i25 == i14 + 1) {
                            eVar4.f49881P.u(this.f50009j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c10 = 3;
                        if (g.this.f49990o1 == 3 && eVar.R() && eVar8 != eVar && eVar8.R()) {
                            eVar8.f49883R.a(eVar.f49883R, 0);
                        } else {
                            int i28 = g.this.f49990o1;
                            if (i28 == 0) {
                                eVar8.f49880O.a(eVar7.f49880O, 0);
                            } else if (i28 == 1) {
                                eVar8.f49882Q.a(eVar7.f49882Q, 0);
                            } else if (z12) {
                                eVar8.f49880O.a(this.f50004e, this.f50008i);
                                eVar8.f49882Q.a(this.f50006g, this.f50010k);
                            } else {
                                eVar8.f49880O.a(eVar7.f49880O, 0);
                                eVar8.f49882Q.a(eVar7.f49882Q, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                }
                i25++;
                c11 = c10;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f50000a == 1 ? this.f50012m - g.this.f49988m1 : this.f50012m;
        }

        public int f() {
            return this.f50000a == 0 ? this.f50011l - g.this.f49987l1 : this.f50011l;
        }

        public void g(int i10) {
            int i11 = this.f50015p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f50014o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f50013n + i14 < g.this.f49999x1; i14++) {
                e eVar = g.this.f49998w1[this.f50013n + i14];
                if (this.f50000a == 0) {
                    if (eVar != null && eVar.x() == e.b.MATCH_CONSTRAINT && eVar.f49936w == 0) {
                        g.this.l1(eVar, e.b.FIXED, i13, eVar.M(), eVar.u());
                    }
                } else if (eVar != null && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f49938x == 0) {
                    g.this.l1(eVar, eVar.x(), eVar.O(), e.b.FIXED, i13);
                }
            }
            h();
        }

        public void i(int i10) {
            this.f50013n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f50000a = i10;
            this.f50003d = dVar;
            this.f50004e = dVar2;
            this.f50005f = dVar3;
            this.f50006g = dVar4;
            this.f50007h = i11;
            this.f50008i = i12;
            this.f50009j = i13;
            this.f50010k = i14;
            this.f50016q = i15;
        }
    }

    private void Q1(boolean z10) {
        e eVar;
        float f10;
        int i10;
        if (this.f49997v1 == null || this.f49996u1 == null || this.f49995t1 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f49999x1; i11++) {
            this.f49998w1[i11].l0();
        }
        int[] iArr = this.f49997v1;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.f49981f1;
        e eVar2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.f49981f1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            e eVar3 = this.f49996u1[i10];
            if (eVar3 != null && eVar3.N() != 8) {
                if (i14 == 0) {
                    eVar3.h(eVar3.f49879N, this.f49879N, h1());
                    eVar3.B0(this.f49975Z0);
                    eVar3.A0(f10);
                }
                if (i14 == i12 - 1) {
                    eVar3.h(eVar3.f49881P, this.f49881P, i1());
                }
                if (i14 > 0 && eVar2 != null) {
                    eVar3.h(eVar3.f49879N, eVar2.f49881P, this.f49987l1);
                    eVar2.h(eVar2.f49881P, eVar3.f49879N, 0);
                }
                eVar2 = eVar3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            e eVar4 = this.f49995t1[i15];
            if (eVar4 != null && eVar4.N() != 8) {
                if (i15 == 0) {
                    eVar4.h(eVar4.f49880O, this.f49880O, j1());
                    eVar4.O0(this.f49976a1);
                    eVar4.N0(this.f49982g1);
                }
                if (i15 == i13 - 1) {
                    eVar4.h(eVar4.f49882Q, this.f49882Q, g1());
                }
                if (i15 > 0 && eVar2 != null) {
                    eVar4.h(eVar4.f49880O, eVar2.f49882Q, this.f49988m1);
                    eVar2.h(eVar2.f49882Q, eVar4.f49880O, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f49993r1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                e[] eVarArr = this.f49998w1;
                if (i18 < eVarArr.length && (eVar = eVarArr[i18]) != null && eVar.N() != 8) {
                    e eVar5 = this.f49996u1[i16];
                    e eVar6 = this.f49995t1[i17];
                    if (eVar != eVar5) {
                        eVar.h(eVar.f49879N, eVar5.f49879N, 0);
                        eVar.h(eVar.f49881P, eVar5.f49881P, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.h(eVar.f49880O, eVar6.f49880O, 0);
                        eVar.h(eVar.f49882Q, eVar6.f49882Q, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R1(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.M() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f49938x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f49865E * i10);
                if (i12 != eVar.u()) {
                    eVar.J0(true);
                    l1(eVar, eVar.x(), eVar.O(), e.b.FIXED, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return eVar.u();
            }
            if (i11 == 3) {
                return (int) ((eVar.O() * eVar.f49897c0) + 0.5f);
            }
        }
        return eVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int S1(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.x() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f49936w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f49859B * i10);
                if (i12 != eVar.O()) {
                    eVar.J0(true);
                    l1(eVar, e.b.FIXED, i12, eVar.M(), eVar.u());
                }
                return i12;
            }
            if (i11 == 1) {
                return eVar.O();
            }
            if (i11 == 3) {
                return (int) ((eVar.u() * eVar.f49897c0) + 0.5f);
            }
        }
        return eVar.O();
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
    private void T1(j1.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.g.T1(j1.e[], int, int, int, int[]):void");
    }

    private void U1(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        int i14;
        int i15;
        d dVar;
        int iI1;
        d dVar2;
        int iG1;
        int i16;
        if (i10 == 0) {
            return;
        }
        this.f49994s1.clear();
        a aVar = new a(i11, this.f49879N, this.f49880O, this.f49881P, this.f49882Q, i12);
        this.f49994s1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int iS1 = S1(eVar, i12);
                if (eVar.x() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i12 || (this.f49987l1 + i17) + iS1 > i12) && aVar.f50001b != null;
                if (!z10 && i18 > 0 && (i16 = this.f49992q1) > 0 && i18 % i16 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = new a(i11, this.f49879N, this.f49880O, this.f49881P, this.f49882Q, i12);
                    aVar.i(i18);
                    this.f49994s1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += this.f49987l1 + iS1;
                    }
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = iS1;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int iR1 = R1(eVar2, i12);
                if (eVar2.M() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i12 || (this.f49988m1 + i20) + iR1 > i12) && aVar.f50001b != null;
                if (!z11 && i21 > 0 && (i14 = this.f49992q1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = new a(i11, this.f49879N, this.f49880O, this.f49881P, this.f49882Q, i12);
                    aVar.i(i21);
                    this.f49994s1.add(aVar);
                } else {
                    if (i21 > 0) {
                        i20 += this.f49988m1 + iR1;
                    }
                    aVar.b(eVar2);
                    i21++;
                    i13 = i22;
                }
                i20 = iR1;
                aVar.b(eVar2);
                i21++;
                i13 = i22;
            }
        }
        int size = this.f49994s1.size();
        d dVar3 = this.f49879N;
        d dVar4 = this.f49880O;
        d dVar5 = this.f49881P;
        d dVar6 = this.f49882Q;
        int iH1 = h1();
        int iJ1 = j1();
        int iI12 = i1();
        int iG12 = g1();
        e.b bVarX = x();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z12 = bVarX == bVar || M() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = (a) this.f49994s1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        int i24 = iJ1;
        int i25 = iI12;
        int iE = 0;
        int iF = 0;
        int i26 = 0;
        int i27 = iH1;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i28 = iG12;
        while (i26 < size) {
            a aVar3 = (a) this.f49994s1.get(i26);
            if (i11 == 0) {
                if (i26 < size - 1) {
                    dVar2 = ((a) this.f49994s1.get(i26 + 1)).f50001b.f49880O;
                    iG1 = 0;
                } else {
                    dVar2 = this.f49882Q;
                    iG1 = g1();
                }
                d dVar9 = aVar3.f50001b.f49882Q;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i29 = iE;
                d dVar12 = dVar7;
                int i30 = iF;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i15 = i26;
                aVar3.j(i11, dVar10, dVar12, dVar13, dVar2, i27, i24, i25, iG1, i12);
                int iMax = Math.max(i30, aVar3.f());
                iE = i29 + aVar3.e();
                if (i15 > 0) {
                    iE += this.f49988m1;
                }
                dVar8 = dVar11;
                iF = iMax;
                i24 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i31 = iG1;
                dVar6 = dVar2;
                i28 = i31;
            } else {
                d dVar15 = dVar8;
                int i32 = iE;
                int i33 = iF;
                i15 = i26;
                if (i15 < size - 1) {
                    dVar = ((a) this.f49994s1.get(i15 + 1)).f50001b.f49879N;
                    iI1 = 0;
                } else {
                    dVar = this.f49881P;
                    iI1 = i1();
                }
                d dVar16 = aVar3.f50001b.f49881P;
                aVar3.j(i11, dVar15, dVar7, dVar, dVar6, i27, i24, iI1, i28, i12);
                iF = i33 + aVar3.f();
                int iMax2 = Math.max(i32, aVar3.e());
                if (i15 > 0) {
                    iF += this.f49987l1;
                }
                iE = iMax2;
                i27 = 0;
                i25 = iI1;
                dVar8 = dVar16;
            }
            i26 = i15 + 1;
            dVar5 = dVar;
        }
        iArr[0] = iF;
        iArr[1] = iE;
    }

    private void V1(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        int i14;
        int i15;
        d dVar;
        int iI1;
        d dVar2;
        int iG1;
        int i16;
        if (i10 == 0) {
            return;
        }
        this.f49994s1.clear();
        a aVar = new a(i11, this.f49879N, this.f49880O, this.f49881P, this.f49882Q, i12);
        this.f49994s1.add(aVar);
        if (i11 == 0) {
            int i17 = 0;
            i13 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i10) {
                i17++;
                e eVar = eVarArr[i19];
                int iS1 = S1(eVar, i12);
                if (eVar.x() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i20 = i13;
                boolean z10 = (i18 == i12 || (this.f49987l1 + i18) + iS1 > i12) && aVar.f50001b != null;
                if (!z10 && i19 > 0 && (i16 = this.f49992q1) > 0 && i17 > i16) {
                    z10 = true;
                }
                if (z10) {
                    aVar = new a(i11, this.f49879N, this.f49880O, this.f49881P, this.f49882Q, i12);
                    aVar.i(i19);
                    this.f49994s1.add(aVar);
                    i18 = iS1;
                    i17 = 1;
                } else {
                    i18 = i19 > 0 ? i18 + this.f49987l1 + iS1 : iS1;
                }
                aVar.b(eVar);
                i19++;
                i13 = i20;
            }
        } else {
            int i21 = 0;
            i13 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i10) {
                i21++;
                e eVar2 = eVarArr[i23];
                int iR1 = R1(eVar2, i12);
                if (eVar2.M() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i24 = i13;
                boolean z11 = (i22 == i12 || (this.f49988m1 + i22) + iR1 > i12) && aVar.f50001b != null;
                if (!z11 && i23 > 0 && (i14 = this.f49992q1) > 0 && i21 > i14) {
                    z11 = true;
                }
                if (z11) {
                    aVar = new a(i11, this.f49879N, this.f49880O, this.f49881P, this.f49882Q, i12);
                    aVar.i(i23);
                    this.f49994s1.add(aVar);
                    i22 = iR1;
                    i21 = 1;
                } else {
                    i22 = i23 > 0 ? i22 + this.f49988m1 + iR1 : iR1;
                }
                aVar.b(eVar2);
                i23++;
                i13 = i24;
            }
        }
        int size = this.f49994s1.size();
        d dVar3 = this.f49879N;
        d dVar4 = this.f49880O;
        d dVar5 = this.f49881P;
        d dVar6 = this.f49882Q;
        int iH1 = h1();
        int iJ1 = j1();
        int iI12 = i1();
        int iG12 = g1();
        e.b bVarX = x();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z12 = bVarX == bVar || M() == bVar;
        if (i13 > 0 && z12) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = (a) this.f49994s1.get(i25);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        int i26 = iJ1;
        int i27 = iI12;
        int iE = 0;
        int iF = 0;
        int i28 = 0;
        int i29 = iH1;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i30 = iG12;
        while (i28 < size) {
            a aVar3 = (a) this.f49994s1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar2 = ((a) this.f49994s1.get(i28 + 1)).f50001b.f49880O;
                    iG1 = 0;
                } else {
                    dVar2 = this.f49882Q;
                    iG1 = g1();
                }
                d dVar9 = aVar3.f50001b.f49882Q;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i31 = iE;
                d dVar12 = dVar7;
                int i32 = iF;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i15 = i28;
                aVar3.j(i11, dVar10, dVar12, dVar13, dVar2, i29, i26, i27, iG1, i12);
                int iMax = Math.max(i32, aVar3.f());
                iE = i31 + aVar3.e();
                if (i15 > 0) {
                    iE += this.f49988m1;
                }
                dVar8 = dVar11;
                iF = iMax;
                i26 = 0;
                dVar7 = dVar9;
                dVar = dVar14;
                int i33 = iG1;
                dVar6 = dVar2;
                i30 = i33;
            } else {
                d dVar15 = dVar8;
                int i34 = iE;
                int i35 = iF;
                i15 = i28;
                if (i15 < size - 1) {
                    dVar = ((a) this.f49994s1.get(i15 + 1)).f50001b.f49879N;
                    iI1 = 0;
                } else {
                    dVar = this.f49881P;
                    iI1 = i1();
                }
                d dVar16 = aVar3.f50001b.f49881P;
                aVar3.j(i11, dVar15, dVar7, dVar, dVar6, i29, i26, iI1, i30, i12);
                iF = i35 + aVar3.f();
                int iMax2 = Math.max(i34, aVar3.e());
                if (i15 > 0) {
                    iF += this.f49987l1;
                }
                iE = iMax2;
                i29 = 0;
                i27 = iI1;
                dVar8 = dVar16;
            }
            i28 = i15 + 1;
            dVar5 = dVar;
        }
        iArr[0] = iF;
        iArr[1] = iE;
    }

    private void W1(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f49994s1.size() == 0) {
            aVar = new a(i11, this.f49879N, this.f49880O, this.f49881P, this.f49882Q, i12);
            this.f49994s1.add(aVar);
        } else {
            a aVar2 = (a) this.f49994s1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i11, this.f49879N, this.f49880O, this.f49881P, this.f49882Q, h1(), j1(), i1(), g1(), i12);
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void X1(float f10) {
        this.f49983h1 = f10;
    }

    public void Y1(int i10) {
        this.f49977b1 = i10;
    }

    public void Z1(float f10) {
        this.f49984i1 = f10;
    }

    public void a2(int i10) {
        this.f49978c1 = i10;
    }

    public void b2(int i10) {
        this.f49989n1 = i10;
    }

    public void c2(float f10) {
        this.f49981f1 = f10;
    }

    @Override // j1.e
    public void d(C4188d c4188d, boolean z10) {
        super.d(c4188d, z10);
        boolean z11 = F() != null && ((f) F()).y1();
        int i10 = this.f49991p1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f49994s1.size();
                int i11 = 0;
                while (i11 < size) {
                    ((a) this.f49994s1.get(i11)).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                Q1(z11);
            } else if (i10 == 3) {
                int size2 = this.f49994s1.size();
                int i12 = 0;
                while (i12 < size2) {
                    ((a) this.f49994s1.get(i12)).d(z11, i12, i12 == size2 + (-1));
                    i12++;
                }
            }
        } else if (this.f49994s1.size() > 0) {
            ((a) this.f49994s1.get(0)).d(z11, 0, true);
        }
        o1(false);
    }

    public void d2(int i10) {
        this.f49987l1 = i10;
    }

    public void e2(int i10) {
        this.f49975Z0 = i10;
    }

    public void f2(float f10) {
        this.f49985j1 = f10;
    }

    public void g2(int i10) {
        this.f49979d1 = i10;
    }

    public void h2(float f10) {
        this.f49986k1 = f10;
    }

    public void i2(int i10) {
        this.f49980e1 = i10;
    }

    public void j2(int i10) {
        this.f49992q1 = i10;
    }

    @Override // j1.l
    public void k1(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int[] iArr;
        boolean z10;
        if (this.f50028L0 > 0 && !m1()) {
            p1(0, 0);
            o1(false);
            return;
        }
        int iH1 = h1();
        int iI1 = i1();
        int iJ1 = j1();
        int iG1 = g1();
        int[] iArr2 = new int[2];
        int i16 = (i11 - iH1) - iI1;
        int i17 = this.f49993r1;
        if (i17 == 1) {
            i16 = (i13 - iJ1) - iG1;
        }
        int i18 = i16;
        if (i17 == 0) {
            if (this.f49975Z0 == -1) {
                this.f49975Z0 = 0;
            }
            if (this.f49976a1 == -1) {
                this.f49976a1 = 0;
            }
        } else {
            if (this.f49975Z0 == -1) {
                this.f49975Z0 = 0;
            }
            if (this.f49976a1 == -1) {
                this.f49976a1 = 0;
            }
        }
        e[] eVarArr = this.f50027K0;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            i14 = this.f50028L0;
            if (i19 >= i14) {
                break;
            }
            if (this.f50027K0[i19].N() == 8) {
                i20++;
            }
            i19++;
        }
        if (i20 > 0) {
            eVarArr = new e[i14 - i20];
            int i21 = 0;
            for (int i22 = 0; i22 < this.f50028L0; i22++) {
                e eVar = this.f50027K0[i22];
                if (eVar.N() != 8) {
                    eVarArr[i21] = eVar;
                    i21++;
                }
            }
            i15 = i21;
        } else {
            i15 = i14;
        }
        this.f49998w1 = eVarArr;
        this.f49999x1 = i15;
        int i23 = this.f49991p1;
        if (i23 == 0) {
            iArr = iArr2;
            z10 = true;
            W1(eVarArr, i15, this.f49993r1, i18, iArr2);
        } else if (i23 == 1) {
            z10 = true;
            iArr = iArr2;
            U1(eVarArr, i15, this.f49993r1, i18, iArr2);
        } else if (i23 == 2) {
            z10 = true;
            iArr = iArr2;
            T1(eVarArr, i15, this.f49993r1, i18, iArr2);
        } else if (i23 != 3) {
            z10 = true;
            iArr = iArr2;
        } else {
            z10 = true;
            iArr = iArr2;
            V1(eVarArr, i15, this.f49993r1, i18, iArr2);
        }
        int iMin = iArr[0] + iH1 + iI1;
        int iMin2 = iArr[z10 ? 1 : 0] + iJ1 + iG1;
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
        p1(iMin, iMin2);
        U0(iMin);
        z0(iMin2);
        if (this.f50028L0 <= 0) {
            z10 = false;
        }
        o1(z10);
    }

    public void k2(int i10) {
        this.f49993r1 = i10;
    }

    public void l2(int i10) {
        this.f49990o1 = i10;
    }

    public void m2(float f10) {
        this.f49982g1 = f10;
    }

    public void n2(int i10) {
        this.f49988m1 = i10;
    }

    public void o2(int i10) {
        this.f49976a1 = i10;
    }

    public void p2(int i10) {
        this.f49991p1 = i10;
    }
}
