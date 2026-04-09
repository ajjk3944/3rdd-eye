package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import y.i;

/* loaded from: classes.dex */
public abstract class WidgetRun implements y.d {

    /* renamed from: a, reason: collision with root package name */
    public int f1755a;

    /* renamed from: b, reason: collision with root package name */
    public ConstraintWidget f1756b;

    /* renamed from: c, reason: collision with root package name */
    public i f1757c;

    /* renamed from: d, reason: collision with root package name */
    public ConstraintWidget.DimensionBehaviour f1758d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.a f1759e = new androidx.constraintlayout.core.widgets.analyzer.a(this);

    /* renamed from: f, reason: collision with root package name */
    public int f1760f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1761g = false;

    /* renamed from: h, reason: collision with root package name */
    public DependencyNode f1762h = new DependencyNode(this);

    /* renamed from: i, reason: collision with root package name */
    public DependencyNode f1763i = new DependencyNode(this);

    /* renamed from: j, reason: collision with root package name */
    public RunType f1764j = RunType.NONE;

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1770a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f1770a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1770a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1770a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1770a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1770a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f1756b = constraintWidget;
    }

    @Override // y.d
    public abstract void a(y.d dVar);

    public final void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10) {
        dependencyNode.f1745l.add(dependencyNode2);
        dependencyNode.f1739f = i10;
        dependencyNode2.f1744k.add(dependencyNode);
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10, androidx.constraintlayout.core.widgets.analyzer.a aVar) {
        dependencyNode.f1745l.add(dependencyNode2);
        dependencyNode.f1745l.add(this.f1759e);
        dependencyNode.f1741h = i10;
        dependencyNode.f1742i = aVar;
        dependencyNode2.f1744k.add(dependencyNode);
        aVar.f1744k.add(dependencyNode);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            ConstraintWidget constraintWidget = this.f1756b;
            int i12 = constraintWidget.f1725z;
            int iMax = Math.max(constraintWidget.f1723y, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f1756b;
            int i13 = constraintWidget2.C;
            int iMax2 = Math.max(constraintWidget2.B, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    public final DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f1660f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f1658d;
        int i10 = a.f1770a[constraintAnchor2.f1659e.ordinal()];
        if (i10 == 1) {
            return constraintWidget.f1683e.f1762h;
        }
        if (i10 == 2) {
            return constraintWidget.f1683e.f1763i;
        }
        if (i10 == 3) {
            return constraintWidget.f1685f.f1762h;
        }
        if (i10 == 4) {
            return constraintWidget.f1685f.f1774k;
        }
        if (i10 != 5) {
            return null;
        }
        return constraintWidget.f1685f.f1763i;
    }

    public final DependencyNode i(ConstraintAnchor constraintAnchor, int i10) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f1660f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f1658d;
        WidgetRun widgetRun = i10 == 0 ? constraintWidget.f1683e : constraintWidget.f1685f;
        int i11 = a.f1770a[constraintAnchor2.f1659e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f1763i;
        }
        return widgetRun.f1762h;
    }

    public long j() {
        if (this.f1759e.f1743j) {
            return r0.f1740g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f1761g;
    }

    public final void l(int i10, int i11) {
        int i12 = this.f1755a;
        if (i12 == 0) {
            this.f1759e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f1759e.d(Math.min(g(this.f1759e.f1771m, i10), i11));
            return;
        }
        if (i12 == 2) {
            ConstraintWidget constraintWidgetL = this.f1756b.L();
            if (constraintWidgetL != null) {
                if ((i10 == 0 ? constraintWidgetL.f1683e : constraintWidgetL.f1685f).f1759e.f1743j) {
                    ConstraintWidget constraintWidget = this.f1756b;
                    this.f1759e.d(g((int) ((r9.f1740g * (i10 == 0 ? constraintWidget.A : constraintWidget.D)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        ConstraintWidget constraintWidget2 = this.f1756b;
        WidgetRun widgetRun = constraintWidget2.f1683e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun.f1758d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2 && widgetRun.f1755a == 3) {
            d dVar = constraintWidget2.f1685f;
            if (dVar.f1758d == dimensionBehaviour2 && dVar.f1755a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            widgetRun = constraintWidget2.f1685f;
        }
        if (widgetRun.f1759e.f1743j) {
            float fW = constraintWidget2.w();
            this.f1759e.d(i10 == 1 ? (int) ((widgetRun.f1759e.f1740g / fW) + 0.5f) : (int) ((fW * widgetRun.f1759e.f1740g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(y.d dVar, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        DependencyNode dependencyNodeH = h(constraintAnchor);
        DependencyNode dependencyNodeH2 = h(constraintAnchor2);
        if (dependencyNodeH.f1743j && dependencyNodeH2.f1743j) {
            int iF = dependencyNodeH.f1740g + constraintAnchor.f();
            int iF2 = dependencyNodeH2.f1740g - constraintAnchor2.f();
            int i11 = iF2 - iF;
            if (!this.f1759e.f1743j && this.f1758d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            androidx.constraintlayout.core.widgets.analyzer.a aVar = this.f1759e;
            if (aVar.f1743j) {
                if (aVar.f1740g == i11) {
                    this.f1762h.d(iF);
                    this.f1763i.d(iF2);
                    return;
                }
                ConstraintWidget constraintWidget = this.f1756b;
                float fZ = i10 == 0 ? constraintWidget.z() : constraintWidget.P();
                if (dependencyNodeH == dependencyNodeH2) {
                    iF = dependencyNodeH.f1740g;
                    iF2 = dependencyNodeH2.f1740g;
                    fZ = 0.5f;
                }
                this.f1762h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f1759e.f1740g) * fZ)));
                this.f1763i.d(this.f1762h.f1740g + this.f1759e.f1740g);
            }
        }
    }

    public void o(y.d dVar) {
    }

    public void p(y.d dVar) {
    }
}
