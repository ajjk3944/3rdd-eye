package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public ConstraintWidget f1777a;

    /* renamed from: b, reason: collision with root package name */
    public ConstraintWidget f1778b;

    /* renamed from: c, reason: collision with root package name */
    public ConstraintWidget f1779c;

    /* renamed from: d, reason: collision with root package name */
    public ConstraintWidget f1780d;

    /* renamed from: e, reason: collision with root package name */
    public ConstraintWidget f1781e;

    /* renamed from: f, reason: collision with root package name */
    public ConstraintWidget f1782f;

    /* renamed from: g, reason: collision with root package name */
    public ConstraintWidget f1783g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1784h;

    /* renamed from: i, reason: collision with root package name */
    public int f1785i;

    /* renamed from: j, reason: collision with root package name */
    public int f1786j;

    /* renamed from: k, reason: collision with root package name */
    public float f1787k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public int f1788l;

    /* renamed from: m, reason: collision with root package name */
    public int f1789m;

    /* renamed from: n, reason: collision with root package name */
    public int f1790n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1791o;

    /* renamed from: p, reason: collision with root package name */
    public int f1792p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1793q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1794r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1795s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1796t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1797u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1798v;

    public c(ConstraintWidget constraintWidget, int i10, boolean z10) {
        this.f1777a = constraintWidget;
        this.f1792p = i10;
        this.f1793q = z10;
    }

    public static boolean c(ConstraintWidget constraintWidget, int i10) {
        if (constraintWidget.T() == 8 || constraintWidget.f1676a0[i10] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        int i11 = constraintWidget.f1721x[i10];
        return i11 == 0 || i11 == 3;
    }

    public void a() {
        if (!this.f1798v) {
            b();
        }
        this.f1798v = true;
    }

    public final void b() {
        int i10 = this.f1792p * 2;
        ConstraintWidget constraintWidget = this.f1777a;
        this.f1791o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z10 = false;
        while (!z10) {
            this.f1785i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.N0;
            int i11 = this.f1792p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i11] = null;
            constraintWidget.M0[i11] = null;
            if (constraintWidget.T() != 8) {
                this.f1788l++;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourV = constraintWidget.v(this.f1792p);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourV != dimensionBehaviour) {
                    this.f1789m += constraintWidget.F(this.f1792p);
                }
                int iF = this.f1789m + constraintWidget.X[i10].f();
                this.f1789m = iF;
                int i12 = i10 + 1;
                this.f1789m = iF + constraintWidget.X[i12].f();
                int iF2 = this.f1790n + constraintWidget.X[i10].f();
                this.f1790n = iF2;
                this.f1790n = iF2 + constraintWidget.X[i12].f();
                if (this.f1778b == null) {
                    this.f1778b = constraintWidget;
                }
                this.f1780d = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f1676a0;
                int i13 = this.f1792p;
                if (dimensionBehaviourArr[i13] == dimensionBehaviour) {
                    int i14 = constraintWidget.f1721x[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f1786j++;
                        float f10 = constraintWidget.L0[i13];
                        if (f10 > 0.0f) {
                            this.f1787k += f10;
                        }
                        if (c(constraintWidget, i13)) {
                            if (f10 < 0.0f) {
                                this.f1794r = true;
                            } else {
                                this.f1795s = true;
                            }
                            if (this.f1784h == null) {
                                this.f1784h = new ArrayList();
                            }
                            this.f1784h.add(constraintWidget);
                        }
                        if (this.f1782f == null) {
                            this.f1782f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f1783g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.M0[this.f1792p] = constraintWidget;
                        }
                        this.f1783g = constraintWidget;
                    }
                    if (this.f1792p == 0) {
                        if (constraintWidget.f1717v != 0 || constraintWidget.f1723y != 0 || constraintWidget.f1725z != 0) {
                            this.f1791o = false;
                        }
                    } else if (constraintWidget.f1719w != 0 || constraintWidget.B != 0 || constraintWidget.C != 0) {
                        this.f1791o = false;
                    }
                    if (constraintWidget.f1684e0 != 0.0f) {
                        this.f1791o = false;
                        this.f1797u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.N0[this.f1792p] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.X[i10 + 1].f1660f;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f1658d;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.X[i10].f1660f;
                if (constraintAnchor2 != null && constraintAnchor2.f1658d == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z10 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f1778b;
        if (constraintWidget6 != null) {
            this.f1789m -= constraintWidget6.X[i10].f();
        }
        ConstraintWidget constraintWidget7 = this.f1780d;
        if (constraintWidget7 != null) {
            this.f1789m -= constraintWidget7.X[i10 + 1].f();
        }
        this.f1779c = constraintWidget;
        if (this.f1792p == 0 && this.f1793q) {
            this.f1781e = constraintWidget;
        } else {
            this.f1781e = this.f1777a;
        }
        this.f1796t = this.f1795s && this.f1794r;
    }
}
