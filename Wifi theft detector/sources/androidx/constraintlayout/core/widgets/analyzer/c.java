package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* loaded from: classes.dex */
public class c extends WidgetRun {

    /* renamed from: k, reason: collision with root package name */
    public static int[] f1772k = new int[2];

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1773a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f1773a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1773a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1773a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f1762h.f1738e = DependencyNode.Type.LEFT;
        this.f1763i.f1738e = DependencyNode.Type.RIGHT;
        this.f1760f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ca  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, y.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(y.d r14) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.c.a(y.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        ConstraintWidget constraintWidgetL;
        ConstraintWidget constraintWidgetL2;
        ConstraintWidget constraintWidget = this.f1756b;
        if (constraintWidget.f1675a) {
            this.f1759e.d(constraintWidget.U());
        }
        if (this.f1759e.f1743j) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f1758d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour == dimensionBehaviour2 && (constraintWidgetL = this.f1756b.L()) != null && (constraintWidgetL.B() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetL.B() == dimensionBehaviour2)) {
                b(this.f1762h, constraintWidgetL.f1683e.f1762h, this.f1756b.P.f());
                b(this.f1763i, constraintWidgetL.f1683e.f1763i, -this.f1756b.R.f());
                return;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourB = this.f1756b.B();
            this.f1758d = dimensionBehaviourB;
            if (dimensionBehaviourB != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviourB == dimensionBehaviour3 && (constraintWidgetL2 = this.f1756b.L()) != null && (constraintWidgetL2.B() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetL2.B() == dimensionBehaviour3)) {
                    int iU = (constraintWidgetL2.U() - this.f1756b.P.f()) - this.f1756b.R.f();
                    b(this.f1762h, constraintWidgetL2.f1683e.f1762h, this.f1756b.P.f());
                    b(this.f1763i, constraintWidgetL2.f1683e.f1763i, -this.f1756b.R.f());
                    this.f1759e.d(iU);
                    return;
                }
                if (this.f1758d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f1759e.d(this.f1756b.U());
                }
            }
        }
        androidx.constraintlayout.core.widgets.analyzer.a aVar = this.f1759e;
        if (aVar.f1743j) {
            ConstraintWidget constraintWidget2 = this.f1756b;
            if (constraintWidget2.f1675a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.X;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f1660f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f1660f != null) {
                    if (constraintWidget2.g0()) {
                        this.f1762h.f1739f = this.f1756b.X[0].f();
                        this.f1763i.f1739f = -this.f1756b.X[1].f();
                        return;
                    }
                    DependencyNode dependencyNodeH = h(this.f1756b.X[0]);
                    if (dependencyNodeH != null) {
                        b(this.f1762h, dependencyNodeH, this.f1756b.X[0].f());
                    }
                    DependencyNode dependencyNodeH2 = h(this.f1756b.X[1]);
                    if (dependencyNodeH2 != null) {
                        b(this.f1763i, dependencyNodeH2, -this.f1756b.X[1].f());
                    }
                    this.f1762h.f1735b = true;
                    this.f1763i.f1735b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        b(this.f1762h, dependencyNodeH3, this.f1756b.X[0].f());
                        b(this.f1763i, this.f1762h, this.f1759e.f1740g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f1660f != null) {
                    DependencyNode dependencyNodeH4 = h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        b(this.f1763i, dependencyNodeH4, -this.f1756b.X[1].f());
                        b(this.f1762h, this.f1763i, -this.f1759e.f1740g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof x.a) || constraintWidget2.L() == null || this.f1756b.p(ConstraintAnchor.Type.CENTER).f1660f != null) {
                    return;
                }
                b(this.f1762h, this.f1756b.L().f1683e.f1762h, this.f1756b.V());
                b(this.f1763i, this.f1762h, this.f1759e.f1740g);
                return;
            }
        }
        if (this.f1758d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f1756b;
            int i10 = constraintWidget3.f1717v;
            if (i10 == 2) {
                ConstraintWidget constraintWidgetL3 = constraintWidget3.L();
                if (constraintWidgetL3 != null) {
                    androidx.constraintlayout.core.widgets.analyzer.a aVar2 = constraintWidgetL3.f1685f.f1759e;
                    this.f1759e.f1745l.add(aVar2);
                    aVar2.f1744k.add(this.f1759e);
                    androidx.constraintlayout.core.widgets.analyzer.a aVar3 = this.f1759e;
                    aVar3.f1735b = true;
                    aVar3.f1744k.add(this.f1762h);
                    this.f1759e.f1744k.add(this.f1763i);
                }
            } else if (i10 == 3) {
                if (constraintWidget3.f1719w == 3) {
                    this.f1762h.f1734a = this;
                    this.f1763i.f1734a = this;
                    d dVar = constraintWidget3.f1685f;
                    dVar.f1762h.f1734a = this;
                    dVar.f1763i.f1734a = this;
                    aVar.f1734a = this;
                    if (constraintWidget3.i0()) {
                        this.f1759e.f1745l.add(this.f1756b.f1685f.f1759e);
                        this.f1756b.f1685f.f1759e.f1744k.add(this.f1759e);
                        d dVar2 = this.f1756b.f1685f;
                        dVar2.f1759e.f1734a = this;
                        this.f1759e.f1745l.add(dVar2.f1762h);
                        this.f1759e.f1745l.add(this.f1756b.f1685f.f1763i);
                        this.f1756b.f1685f.f1762h.f1744k.add(this.f1759e);
                        this.f1756b.f1685f.f1763i.f1744k.add(this.f1759e);
                    } else if (this.f1756b.g0()) {
                        this.f1756b.f1685f.f1759e.f1745l.add(this.f1759e);
                        this.f1759e.f1744k.add(this.f1756b.f1685f.f1759e);
                    } else {
                        this.f1756b.f1685f.f1759e.f1745l.add(this.f1759e);
                    }
                } else {
                    androidx.constraintlayout.core.widgets.analyzer.a aVar4 = constraintWidget3.f1685f.f1759e;
                    aVar.f1745l.add(aVar4);
                    aVar4.f1744k.add(this.f1759e);
                    this.f1756b.f1685f.f1762h.f1744k.add(this.f1759e);
                    this.f1756b.f1685f.f1763i.f1744k.add(this.f1759e);
                    androidx.constraintlayout.core.widgets.analyzer.a aVar5 = this.f1759e;
                    aVar5.f1735b = true;
                    aVar5.f1744k.add(this.f1762h);
                    this.f1759e.f1744k.add(this.f1763i);
                    this.f1762h.f1745l.add(this.f1759e);
                    this.f1763i.f1745l.add(this.f1759e);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f1756b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.X;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f1660f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f1660f != null) {
            if (constraintWidget4.g0()) {
                this.f1762h.f1739f = this.f1756b.X[0].f();
                this.f1763i.f1739f = -this.f1756b.X[1].f();
                return;
            }
            DependencyNode dependencyNodeH5 = h(this.f1756b.X[0]);
            DependencyNode dependencyNodeH6 = h(this.f1756b.X[1]);
            if (dependencyNodeH5 != null) {
                dependencyNodeH5.b(this);
            }
            if (dependencyNodeH6 != null) {
                dependencyNodeH6.b(this);
            }
            this.f1764j = WidgetRun.RunType.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode dependencyNodeH7 = h(constraintAnchor4);
            if (dependencyNodeH7 != null) {
                b(this.f1762h, dependencyNodeH7, this.f1756b.X[0].f());
                c(this.f1763i, this.f1762h, 1, this.f1759e);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f1660f != null) {
            DependencyNode dependencyNodeH8 = h(constraintAnchor6);
            if (dependencyNodeH8 != null) {
                b(this.f1763i, dependencyNodeH8, -this.f1756b.X[1].f());
                c(this.f1762h, this.f1763i, -1, this.f1759e);
                return;
            }
            return;
        }
        if ((constraintWidget4 instanceof x.a) || constraintWidget4.L() == null) {
            return;
        }
        b(this.f1762h, this.f1756b.L().f1683e.f1762h, this.f1756b.V());
        c(this.f1763i, this.f1762h, 1, this.f1759e);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.f1762h;
        if (dependencyNode.f1743j) {
            this.f1756b.h1(dependencyNode.f1740g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f1757c = null;
        this.f1762h.c();
        this.f1763i.c();
        this.f1759e.c();
        this.f1761g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean m() {
        return this.f1758d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f1756b.f1717v == 0;
    }

    public final void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    public void r() {
        this.f1761g = false;
        this.f1762h.c();
        this.f1762h.f1743j = false;
        this.f1763i.c();
        this.f1763i.f1743j = false;
        this.f1759e.f1743j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f1756b.u();
    }
}
