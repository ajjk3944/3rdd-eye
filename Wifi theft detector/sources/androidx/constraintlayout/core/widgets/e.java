package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class e extends h {
    public ConstraintWidget[] F1;

    /* renamed from: i1, reason: collision with root package name */
    public int f1823i1 = -1;

    /* renamed from: j1, reason: collision with root package name */
    public int f1824j1 = -1;

    /* renamed from: k1, reason: collision with root package name */
    public int f1825k1 = -1;

    /* renamed from: l1, reason: collision with root package name */
    public int f1826l1 = -1;

    /* renamed from: m1, reason: collision with root package name */
    public int f1827m1 = -1;

    /* renamed from: n1, reason: collision with root package name */
    public int f1828n1 = -1;

    /* renamed from: o1, reason: collision with root package name */
    public float f1829o1 = 0.5f;

    /* renamed from: p1, reason: collision with root package name */
    public float f1830p1 = 0.5f;

    /* renamed from: q1, reason: collision with root package name */
    public float f1831q1 = 0.5f;

    /* renamed from: r1, reason: collision with root package name */
    public float f1832r1 = 0.5f;

    /* renamed from: s1, reason: collision with root package name */
    public float f1833s1 = 0.5f;

    /* renamed from: t1, reason: collision with root package name */
    public float f1834t1 = 0.5f;

    /* renamed from: u1, reason: collision with root package name */
    public int f1835u1 = 0;

    /* renamed from: v1, reason: collision with root package name */
    public int f1836v1 = 0;

    /* renamed from: w1, reason: collision with root package name */
    public int f1837w1 = 2;

    /* renamed from: x1, reason: collision with root package name */
    public int f1838x1 = 2;

    /* renamed from: y1, reason: collision with root package name */
    public int f1839y1 = 0;

    /* renamed from: z1, reason: collision with root package name */
    public int f1840z1 = -1;
    public int A1 = 0;
    public ArrayList B1 = new ArrayList();
    public ConstraintWidget[] C1 = null;
    public ConstraintWidget[] D1 = null;
    public int[] E1 = null;
    public int G1 = 0;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f1841a;

        /* renamed from: d, reason: collision with root package name */
        public ConstraintAnchor f1844d;

        /* renamed from: e, reason: collision with root package name */
        public ConstraintAnchor f1845e;

        /* renamed from: f, reason: collision with root package name */
        public ConstraintAnchor f1846f;

        /* renamed from: g, reason: collision with root package name */
        public ConstraintAnchor f1847g;

        /* renamed from: h, reason: collision with root package name */
        public int f1848h;

        /* renamed from: i, reason: collision with root package name */
        public int f1849i;

        /* renamed from: j, reason: collision with root package name */
        public int f1850j;

        /* renamed from: k, reason: collision with root package name */
        public int f1851k;

        /* renamed from: q, reason: collision with root package name */
        public int f1857q;

        /* renamed from: b, reason: collision with root package name */
        public ConstraintWidget f1842b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f1843c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f1852l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f1853m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f1854n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f1855o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f1856p = 0;

        public a(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11) {
            this.f1848h = 0;
            this.f1849i = 0;
            this.f1850j = 0;
            this.f1851k = 0;
            this.f1857q = 0;
            this.f1841a = i10;
            this.f1844d = constraintAnchor;
            this.f1845e = constraintAnchor2;
            this.f1846f = constraintAnchor3;
            this.f1847g = constraintAnchor4;
            this.f1848h = e.this.u1();
            this.f1849i = e.this.w1();
            this.f1850j = e.this.v1();
            this.f1851k = e.this.t1();
            this.f1857q = i11;
        }

        public void b(ConstraintWidget constraintWidget) {
            if (this.f1841a == 0) {
                int iG2 = e.this.g2(constraintWidget, this.f1857q);
                if (constraintWidget.B() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f1856p++;
                    iG2 = 0;
                }
                this.f1852l += iG2 + (constraintWidget.T() != 8 ? e.this.f1835u1 : 0);
                int iF2 = e.this.f2(constraintWidget, this.f1857q);
                if (this.f1842b == null || this.f1843c < iF2) {
                    this.f1842b = constraintWidget;
                    this.f1843c = iF2;
                    this.f1853m = iF2;
                }
            } else {
                int iG22 = e.this.g2(constraintWidget, this.f1857q);
                int iF22 = e.this.f2(constraintWidget, this.f1857q);
                if (constraintWidget.R() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f1856p++;
                    iF22 = 0;
                }
                this.f1853m += iF22 + (constraintWidget.T() != 8 ? e.this.f1836v1 : 0);
                if (this.f1842b == null || this.f1843c < iG22) {
                    this.f1842b = constraintWidget;
                    this.f1843c = iG22;
                    this.f1852l = iG22;
                }
            }
            this.f1855o++;
        }

        public void c() {
            this.f1843c = 0;
            this.f1842b = null;
            this.f1852l = 0;
            this.f1853m = 0;
            this.f1854n = 0;
            this.f1855o = 0;
            this.f1856p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            ConstraintWidget constraintWidget;
            int i11;
            char c10;
            float f10;
            float f11;
            int i12 = this.f1855o;
            for (int i13 = 0; i13 < i12 && this.f1854n + i13 < e.this.G1; i13++) {
                ConstraintWidget constraintWidget2 = e.this.F1[this.f1854n + i13];
                if (constraintWidget2 != null) {
                    constraintWidget2.s0();
                }
            }
            if (i12 == 0 || this.f1842b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z10 ? (i12 - 1) - i16 : i16;
                if (this.f1854n + i17 >= e.this.G1) {
                    break;
                }
                if (e.this.F1[this.f1854n + i17].T() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            ConstraintWidget constraintWidget3 = null;
            if (this.f1841a != 0) {
                ConstraintWidget constraintWidget4 = this.f1842b;
                constraintWidget4.I0(e.this.f1823i1);
                int i18 = this.f1848h;
                if (i10 > 0) {
                    i18 += e.this.f1835u1;
                }
                if (z10) {
                    constraintWidget4.R.a(this.f1846f, i18);
                    if (z11) {
                        constraintWidget4.P.a(this.f1844d, this.f1850j);
                    }
                    if (i10 > 0) {
                        this.f1846f.f1658d.P.a(constraintWidget4.R, 0);
                    }
                } else {
                    constraintWidget4.P.a(this.f1844d, i18);
                    if (z11) {
                        constraintWidget4.R.a(this.f1846f, this.f1850j);
                    }
                    if (i10 > 0) {
                        this.f1844d.f1658d.R.a(constraintWidget4.P, 0);
                    }
                }
                int i19 = 0;
                while (i19 < i12 && this.f1854n + i19 < e.this.G1) {
                    ConstraintWidget constraintWidget5 = e.this.F1[this.f1854n + i19];
                    if (i19 == 0) {
                        constraintWidget5.k(constraintWidget5.Q, this.f1845e, this.f1849i);
                        int i20 = e.this.f1824j1;
                        float f12 = e.this.f1830p1;
                        if (this.f1854n == 0 && e.this.f1826l1 != -1) {
                            i20 = e.this.f1826l1;
                            f12 = e.this.f1832r1;
                        } else if (z11 && e.this.f1828n1 != -1) {
                            i20 = e.this.f1828n1;
                            f12 = e.this.f1834t1;
                        }
                        constraintWidget5.Z0(i20);
                        constraintWidget5.Y0(f12);
                    }
                    if (i19 == i12 - 1) {
                        constraintWidget5.k(constraintWidget5.S, this.f1847g, this.f1851k);
                    }
                    if (constraintWidget3 != null) {
                        constraintWidget5.Q.a(constraintWidget3.S, e.this.f1836v1);
                        if (i19 == i14) {
                            constraintWidget5.Q.u(this.f1849i);
                        }
                        constraintWidget3.S.a(constraintWidget5.Q, 0);
                        if (i19 == i15 + 1) {
                            constraintWidget3.S.u(this.f1851k);
                        }
                    }
                    if (constraintWidget5 != constraintWidget4) {
                        if (z10) {
                            int i21 = e.this.f1837w1;
                            if (i21 == 0) {
                                constraintWidget5.R.a(constraintWidget4.R, 0);
                            } else if (i21 == 1) {
                                constraintWidget5.P.a(constraintWidget4.P, 0);
                            } else if (i21 == 2) {
                                constraintWidget5.P.a(constraintWidget4.P, 0);
                                constraintWidget5.R.a(constraintWidget4.R, 0);
                            }
                        } else {
                            int i22 = e.this.f1837w1;
                            if (i22 == 0) {
                                constraintWidget5.P.a(constraintWidget4.P, 0);
                            } else if (i22 == 1) {
                                constraintWidget5.R.a(constraintWidget4.R, 0);
                            } else if (i22 == 2) {
                                if (z12) {
                                    constraintWidget5.P.a(this.f1844d, this.f1848h);
                                    constraintWidget5.R.a(this.f1846f, this.f1850j);
                                } else {
                                    constraintWidget5.P.a(constraintWidget4.P, 0);
                                    constraintWidget5.R.a(constraintWidget4.R, 0);
                                }
                            }
                        }
                    }
                    i19++;
                    constraintWidget3 = constraintWidget5;
                }
                return;
            }
            ConstraintWidget constraintWidget6 = this.f1842b;
            constraintWidget6.Z0(e.this.f1824j1);
            int i23 = this.f1849i;
            if (i10 > 0) {
                i23 += e.this.f1836v1;
            }
            constraintWidget6.Q.a(this.f1845e, i23);
            if (z11) {
                constraintWidget6.S.a(this.f1847g, this.f1851k);
            }
            if (i10 > 0) {
                this.f1845e.f1658d.S.a(constraintWidget6.Q, 0);
            }
            if (e.this.f1838x1 != 3 || constraintWidget6.X()) {
                constraintWidget = constraintWidget6;
            } else {
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = z10 ? (i12 - 1) - i24 : i24;
                    if (this.f1854n + i25 >= e.this.G1) {
                        break;
                    }
                    constraintWidget = e.this.F1[this.f1854n + i25];
                    if (constraintWidget.X()) {
                        break;
                    }
                }
                constraintWidget = constraintWidget6;
            }
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z10 ? (i12 - 1) - i26 : i26;
                if (this.f1854n + i27 >= e.this.G1) {
                    return;
                }
                ConstraintWidget constraintWidget7 = e.this.F1[this.f1854n + i27];
                if (i26 == 0) {
                    i11 = 1;
                    constraintWidget7.k(constraintWidget7.P, this.f1844d, this.f1848h);
                } else {
                    i11 = 1;
                }
                if (i27 == 0) {
                    int i28 = e.this.f1823i1;
                    float f13 = e.this.f1829o1;
                    if (z10) {
                        f13 = 1.0f - f13;
                    }
                    if (this.f1854n != 0 || e.this.f1825k1 == -1) {
                        if (z11 && e.this.f1827m1 != -1) {
                            i28 = e.this.f1827m1;
                            if (z10) {
                                f11 = e.this.f1833s1;
                                f10 = 1.0f - f11;
                                f13 = f10;
                            } else {
                                f10 = e.this.f1833s1;
                                f13 = f10;
                            }
                        }
                        constraintWidget7.I0(i28);
                        constraintWidget7.H0(f13);
                    } else {
                        i28 = e.this.f1825k1;
                        if (z10) {
                            f11 = e.this.f1831q1;
                            f10 = 1.0f - f11;
                            f13 = f10;
                            constraintWidget7.I0(i28);
                            constraintWidget7.H0(f13);
                        } else {
                            f10 = e.this.f1831q1;
                            f13 = f10;
                            constraintWidget7.I0(i28);
                            constraintWidget7.H0(f13);
                        }
                    }
                }
                if (i26 == i12 - 1) {
                    constraintWidget7.k(constraintWidget7.R, this.f1846f, this.f1850j);
                }
                if (constraintWidget3 != null) {
                    constraintWidget7.P.a(constraintWidget3.R, e.this.f1835u1);
                    if (i26 == i14) {
                        constraintWidget7.P.u(this.f1848h);
                    }
                    constraintWidget3.R.a(constraintWidget7.P, 0);
                    if (i26 == i15 + 1) {
                        constraintWidget3.R.u(this.f1850j);
                    }
                }
                if (constraintWidget7 != constraintWidget6) {
                    c10 = 3;
                    if (e.this.f1838x1 == 3 && constraintWidget.X() && constraintWidget7 != constraintWidget && constraintWidget7.X()) {
                        constraintWidget7.T.a(constraintWidget.T, 0);
                    } else {
                        int i29 = e.this.f1838x1;
                        if (i29 == 0) {
                            constraintWidget7.Q.a(constraintWidget6.Q, 0);
                        } else if (i29 == i11) {
                            constraintWidget7.S.a(constraintWidget6.S, 0);
                        } else if (z12) {
                            constraintWidget7.Q.a(this.f1845e, this.f1849i);
                            constraintWidget7.S.a(this.f1847g, this.f1851k);
                        } else {
                            constraintWidget7.Q.a(constraintWidget6.Q, 0);
                            constraintWidget7.S.a(constraintWidget6.S, 0);
                        }
                    }
                } else {
                    c10 = 3;
                }
                i26++;
                constraintWidget3 = constraintWidget7;
            }
        }

        public int e() {
            return this.f1841a == 1 ? this.f1853m - e.this.f1836v1 : this.f1853m;
        }

        public int f() {
            return this.f1841a == 0 ? this.f1852l - e.this.f1835u1 : this.f1852l;
        }

        public void g(int i10) {
            int i11 = this.f1856p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f1855o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f1854n + i14 < e.this.G1; i14++) {
                ConstraintWidget constraintWidget = e.this.F1[this.f1854n + i14];
                if (this.f1841a == 0) {
                    if (constraintWidget != null && constraintWidget.B() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f1717v == 0) {
                        e.this.y1(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i13, constraintWidget.R(), constraintWidget.y());
                    }
                } else if (constraintWidget != null && constraintWidget.R() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f1719w == 0) {
                    int i15 = i13;
                    e.this.y1(constraintWidget, constraintWidget.B(), constraintWidget.U(), ConstraintWidget.DimensionBehaviour.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public final void h() {
            this.f1852l = 0;
            this.f1853m = 0;
            this.f1842b = null;
            this.f1843c = 0;
            int i10 = this.f1855o;
            for (int i11 = 0; i11 < i10 && this.f1854n + i11 < e.this.G1; i11++) {
                ConstraintWidget constraintWidget = e.this.F1[this.f1854n + i11];
                if (this.f1841a == 0) {
                    int iU = constraintWidget.U();
                    int i12 = e.this.f1835u1;
                    if (constraintWidget.T() == 8) {
                        i12 = 0;
                    }
                    this.f1852l += iU + i12;
                    int iF2 = e.this.f2(constraintWidget, this.f1857q);
                    if (this.f1842b == null || this.f1843c < iF2) {
                        this.f1842b = constraintWidget;
                        this.f1843c = iF2;
                        this.f1853m = iF2;
                    }
                } else {
                    int iG2 = e.this.g2(constraintWidget, this.f1857q);
                    int iF22 = e.this.f2(constraintWidget, this.f1857q);
                    int i13 = e.this.f1836v1;
                    if (constraintWidget.T() == 8) {
                        i13 = 0;
                    }
                    this.f1853m += iF22 + i13;
                    if (this.f1842b == null || this.f1843c < iG2) {
                        this.f1842b = constraintWidget;
                        this.f1843c = iG2;
                        this.f1852l = iG2;
                    }
                }
            }
        }

        public void i(int i10) {
            this.f1854n = i10;
        }

        public void j(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11, int i12, int i13, int i14, int i15) {
            this.f1841a = i10;
            this.f1844d = constraintAnchor;
            this.f1845e = constraintAnchor2;
            this.f1846f = constraintAnchor3;
            this.f1847g = constraintAnchor4;
            this.f1848h = i11;
            this.f1849i = i12;
            this.f1850j = i13;
            this.f1851k = i14;
            this.f1857q = i15;
        }
    }

    public void A2(int i10) {
        this.f1836v1 = i10;
    }

    public void B2(int i10) {
        this.f1824j1 = i10;
    }

    public void C2(int i10) {
        this.f1839y1 = i10;
    }

    public final void e2(boolean z10) {
        ConstraintWidget constraintWidget;
        float f10;
        int i10;
        if (this.E1 == null || this.D1 == null || this.C1 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.G1; i11++) {
            this.F1[i11].s0();
        }
        int[] iArr = this.E1;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.f1829o1;
        ConstraintWidget constraintWidget2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.f1829o1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            ConstraintWidget constraintWidget3 = this.D1[i10];
            if (constraintWidget3 != null && constraintWidget3.T() != 8) {
                if (i14 == 0) {
                    constraintWidget3.k(constraintWidget3.P, this.P, u1());
                    constraintWidget3.I0(this.f1823i1);
                    constraintWidget3.H0(f10);
                }
                if (i14 == i12 - 1) {
                    constraintWidget3.k(constraintWidget3.R, this.R, v1());
                }
                if (i14 > 0 && constraintWidget2 != null) {
                    constraintWidget3.k(constraintWidget3.P, constraintWidget2.R, this.f1835u1);
                    constraintWidget2.k(constraintWidget2.R, constraintWidget3.P, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            ConstraintWidget constraintWidget4 = this.C1[i15];
            if (constraintWidget4 != null && constraintWidget4.T() != 8) {
                if (i15 == 0) {
                    constraintWidget4.k(constraintWidget4.Q, this.Q, w1());
                    constraintWidget4.Z0(this.f1824j1);
                    constraintWidget4.Y0(this.f1830p1);
                }
                if (i15 == i13 - 1) {
                    constraintWidget4.k(constraintWidget4.S, this.S, t1());
                }
                if (i15 > 0 && constraintWidget2 != null) {
                    constraintWidget4.k(constraintWidget4.Q, constraintWidget2.S, this.f1836v1);
                    constraintWidget2.k(constraintWidget2.S, constraintWidget4.Q, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.A1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                ConstraintWidget[] constraintWidgetArr = this.F1;
                if (i18 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i18]) != null && constraintWidget.T() != 8) {
                    ConstraintWidget constraintWidget5 = this.D1[i16];
                    ConstraintWidget constraintWidget6 = this.C1[i17];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.k(constraintWidget.P, constraintWidget5.P, 0);
                        constraintWidget.k(constraintWidget.R, constraintWidget5.R, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.k(constraintWidget.Q, constraintWidget6.Q, 0);
                        constraintWidget.k(constraintWidget.S, constraintWidget6.S, 0);
                    }
                }
            }
        }
    }

    public final int f2(ConstraintWidget constraintWidget, int i10) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.R() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f1719w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.D * i10);
                if (i12 != constraintWidget.y()) {
                    constraintWidget.T0(true);
                    y1(constraintWidget, constraintWidget.B(), constraintWidget.U(), ConstraintWidget.DimensionBehaviour.FIXED, i12);
                }
                return i12;
            }
            constraintWidget2 = constraintWidget;
            if (i11 == 1) {
                return constraintWidget2.y();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget2.U() * constraintWidget2.f1684e0) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.y();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.c cVar, boolean z10) {
        super.g(cVar, z10);
        boolean z11 = L() != null && ((d) L()).K1();
        int i10 = this.f1839y1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.B1.size();
                int i11 = 0;
                while (i11 < size) {
                    ((a) this.B1.get(i11)).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                e2(z11);
            }
        } else if (this.B1.size() > 0) {
            ((a) this.B1.get(0)).d(z11, 0, true);
        }
        B1(false);
    }

    public final int g2(ConstraintWidget constraintWidget, int i10) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.B() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f1717v;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.A * i10);
                if (i12 != constraintWidget.U()) {
                    constraintWidget.T0(true);
                    y1(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i12, constraintWidget.R(), constraintWidget.y());
                }
                return i12;
            }
            constraintWidget2 = constraintWidget;
            if (i11 == 1) {
                return constraintWidget2.U();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget2.y() * constraintWidget2.f1684e0) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.U();
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
    public final void h2(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.h2(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    public final void i2(ConstraintWidget[] constraintWidgetArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        e eVar;
        int i14;
        ConstraintAnchor constraintAnchor;
        int i15;
        e eVar2 = this;
        if (i10 == 0) {
            return;
        }
        eVar2.B1.clear();
        int i16 = i12;
        a aVar = eVar2.new a(i11, eVar2.P, eVar2.Q, eVar2.R, eVar2.S, i16);
        eVar2.B1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i18];
                int iG2 = eVar2.g2(constraintWidget, i16);
                if (constraintWidget.B() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (eVar2.f1835u1 + i17) + iG2 > i16) && aVar.f1842b != null;
                if (!z10 && i18 > 0 && (i15 = eVar2.f1840z1) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = eVar2.new a(i11, eVar2.P, eVar2.Q, eVar2.R, eVar2.S, i16);
                    aVar.i(i18);
                    eVar2.B1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += eVar2.f1835u1 + iG2;
                    }
                    aVar.b(constraintWidget);
                    i18++;
                    i13 = i19;
                }
                i17 = iG2;
                aVar.b(constraintWidget);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i21];
                int iF2 = eVar2.f2(constraintWidget2, i16);
                if (constraintWidget2.R() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (eVar2.f1836v1 + i20) + iF2 > i16) && aVar.f1842b != null;
                if (!z11 && i21 > 0 && (i14 = eVar2.f1840z1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = eVar2.new a(i11, eVar2.P, eVar2.Q, eVar2.R, eVar2.S, i16);
                    eVar = eVar2;
                    aVar.i(i21);
                    eVar.B1.add(aVar);
                } else {
                    eVar = eVar2;
                    if (i21 > 0) {
                        i20 += eVar.f1836v1 + iF2;
                    }
                    aVar.b(constraintWidget2);
                    i21++;
                    i16 = i12;
                    i13 = i22;
                    eVar2 = eVar;
                }
                i20 = iF2;
                aVar.b(constraintWidget2);
                i21++;
                i16 = i12;
                i13 = i22;
                eVar2 = eVar;
            }
        }
        e eVar3 = eVar2;
        int size = eVar3.B1.size();
        ConstraintAnchor constraintAnchor2 = eVar3.P;
        ConstraintAnchor constraintAnchor3 = eVar3.Q;
        ConstraintAnchor constraintAnchor4 = eVar3.R;
        ConstraintAnchor constraintAnchor5 = eVar3.S;
        int iU1 = eVar3.u1();
        int iW1 = eVar3.w1();
        int iV1 = eVar3.v1();
        int iT1 = eVar3.t1();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourB = eVar3.B();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z12 = dimensionBehaviourB == dimensionBehaviour || eVar3.R() == dimensionBehaviour;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = (a) eVar3.B1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor2;
        int iT12 = iT1;
        int i24 = 0;
        int iV12 = iV1;
        int i25 = iW1;
        int i26 = iU1;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor3;
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            a aVar3 = (a) eVar3.B1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    constraintAnchor7 = ((a) eVar3.B1.get(i28 + 1)).f1842b.Q;
                    iT12 = 0;
                } else {
                    constraintAnchor7 = eVar3.S;
                    iT12 = eVar3.t1();
                }
                ConstraintAnchor constraintAnchor10 = aVar3.f1842b.S;
                int i29 = i27;
                aVar3.j(i11, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i26, i25, iV12, iT12, i12);
                int iMax = Math.max(i24, aVar3.f());
                int iE = aVar3.e() + i29;
                if (i28 > 0) {
                    iE += eVar3.f1836v1;
                }
                i27 = iE;
                i24 = iMax;
                constraintAnchor9 = constraintAnchor10;
                i25 = 0;
            } else {
                int i30 = i24;
                int i31 = i27;
                if (i28 < size - 1) {
                    constraintAnchor = ((a) eVar3.B1.get(i28 + 1)).f1842b.P;
                    iV12 = 0;
                } else {
                    constraintAnchor = eVar3.R;
                    iV12 = eVar3.v1();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = aVar3.f1842b.R;
                aVar3.j(i11, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i26, i25, iV12, iT12, i12);
                int iF = aVar3.f() + i30;
                int iMax2 = Math.max(i31, aVar3.e());
                if (i28 > 0) {
                    iF += eVar3.f1835u1;
                }
                int i32 = iF;
                i27 = iMax2;
                i24 = i32;
                i26 = 0;
                constraintAnchor6 = constraintAnchor11;
            }
        }
        iArr[0] = i24;
        iArr[1] = i27;
    }

    public final void j2(ConstraintWidget[] constraintWidgetArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.B1.size() == 0) {
            aVar = new a(i11, this.P, this.Q, this.R, this.S, i12);
            this.B1.add(aVar);
        } else {
            a aVar2 = (a) this.B1.get(0);
            aVar2.c();
            aVar2.j(i11, this.P, this.Q, this.R, this.S, u1(), w1(), v1(), t1(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(constraintWidgetArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void k2(float f10) {
        this.f1831q1 = f10;
    }

    public void l2(int i10) {
        this.f1825k1 = i10;
    }

    @Override // x.b, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void m(ConstraintWidget constraintWidget, HashMap map) {
        super.m(constraintWidget, map);
        e eVar = (e) constraintWidget;
        this.f1823i1 = eVar.f1823i1;
        this.f1824j1 = eVar.f1824j1;
        this.f1825k1 = eVar.f1825k1;
        this.f1826l1 = eVar.f1826l1;
        this.f1827m1 = eVar.f1827m1;
        this.f1828n1 = eVar.f1828n1;
        this.f1829o1 = eVar.f1829o1;
        this.f1830p1 = eVar.f1830p1;
        this.f1831q1 = eVar.f1831q1;
        this.f1832r1 = eVar.f1832r1;
        this.f1833s1 = eVar.f1833s1;
        this.f1834t1 = eVar.f1834t1;
        this.f1835u1 = eVar.f1835u1;
        this.f1836v1 = eVar.f1836v1;
        this.f1837w1 = eVar.f1837w1;
        this.f1838x1 = eVar.f1838x1;
        this.f1839y1 = eVar.f1839y1;
        this.f1840z1 = eVar.f1840z1;
        this.A1 = eVar.A1;
    }

    public void m2(float f10) {
        this.f1832r1 = f10;
    }

    public void n2(int i10) {
        this.f1826l1 = i10;
    }

    public void o2(int i10) {
        this.f1837w1 = i10;
    }

    public void p2(float f10) {
        this.f1829o1 = f10;
    }

    public void q2(int i10) {
        this.f1835u1 = i10;
    }

    public void r2(int i10) {
        this.f1823i1 = i10;
    }

    public void s2(float f10) {
        this.f1833s1 = f10;
    }

    public void t2(int i10) {
        this.f1827m1 = i10;
    }

    public void u2(float f10) {
        this.f1834t1 = f10;
    }

    public void v2(int i10) {
        this.f1828n1 = i10;
    }

    public void w2(int i10) {
        this.f1840z1 = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.h
    public void x1(int i10, int i11, int i12, int i13) {
        int i14;
        ConstraintWidget[] constraintWidgetArr;
        if (this.U0 > 0 && !z1()) {
            C1(0, 0);
            B1(false);
            return;
        }
        int iU1 = u1();
        int iV1 = v1();
        int iW1 = w1();
        int iT1 = t1();
        int[] iArr = new int[2];
        int i15 = (i11 - iU1) - iV1;
        int i16 = this.A1;
        if (i16 == 1) {
            i15 = (i13 - iW1) - iT1;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f1823i1 == -1) {
                this.f1823i1 = 0;
            }
            if (this.f1824j1 == -1) {
                this.f1824j1 = 0;
            }
        } else {
            if (this.f1823i1 == -1) {
                this.f1823i1 = 0;
            }
            if (this.f1824j1 == -1) {
                this.f1824j1 = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr2 = this.T0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.U0;
            if (i18 >= i14) {
                break;
            }
            if (this.T0[i18].T() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.U0) {
                ConstraintWidget constraintWidget = this.T0[i20];
                ConstraintWidget[] constraintWidgetArr4 = constraintWidgetArr3;
                if (constraintWidget.T() != 8) {
                    constraintWidgetArr4[i14] = constraintWidget;
                    i14++;
                }
                i20++;
                constraintWidgetArr3 = constraintWidgetArr4;
            }
            constraintWidgetArr = constraintWidgetArr3;
        } else {
            constraintWidgetArr = constraintWidgetArr2;
        }
        int i21 = i14;
        this.F1 = constraintWidgetArr;
        this.G1 = i21;
        int i22 = this.f1839y1;
        if (i22 == 0) {
            j2(constraintWidgetArr, i21, this.A1, i17, iArr);
        } else if (i22 == 1) {
            i2(constraintWidgetArr, i21, this.A1, i17, iArr);
        } else if (i22 == 2) {
            h2(constraintWidgetArr, i21, this.A1, i17, iArr);
        }
        int iMin = iArr[0] + iU1 + iV1;
        int iMin2 = iArr[1] + iW1 + iT1;
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
        C1(iMin, iMin2);
        f1(iMin);
        G0(iMin2);
        B1(this.U0 > 0);
    }

    public void x2(int i10) {
        this.A1 = i10;
    }

    public void y2(int i10) {
        this.f1838x1 = i10;
    }

    public void z2(float f10) {
        this.f1830p1 = f10;
    }
}
