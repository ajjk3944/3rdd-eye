package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* loaded from: classes.dex */
public class d extends WidgetRun {

    /* renamed from: k, reason: collision with root package name */
    public DependencyNode f1774k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.a f1775l;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1776a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f1776a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1776a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1776a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f1774k = dependencyNode;
        this.f1775l = null;
        this.f1762h.f1738e = DependencyNode.Type.TOP;
        this.f1763i.f1738e = DependencyNode.Type.BOTTOM;
        dependencyNode.f1738e = DependencyNode.Type.BASELINE;
        this.f1760f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, y.d
    public void a(y.d dVar) {
        float f10;
        float fW;
        float fW2;
        int i10;
        int i11 = a.f1776a[this.f1764j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            ConstraintWidget constraintWidget = this.f1756b;
            n(dVar, constraintWidget.Q, constraintWidget.S, 1);
            return;
        }
        androidx.constraintlayout.core.widgets.analyzer.a aVar = this.f1759e;
        if (aVar.f1736c && !aVar.f1743j && this.f1758d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f1756b;
            int i12 = constraintWidget2.f1719w;
            if (i12 == 2) {
                ConstraintWidget constraintWidgetL = constraintWidget2.L();
                if (constraintWidgetL != null) {
                    if (constraintWidgetL.f1685f.f1759e.f1743j) {
                        this.f1759e.d((int) ((r7.f1740g * this.f1756b.D) + 0.5f));
                    }
                }
            } else if (i12 == 3 && constraintWidget2.f1683e.f1759e.f1743j) {
                int iX = constraintWidget2.x();
                if (iX == -1) {
                    ConstraintWidget constraintWidget3 = this.f1756b;
                    f10 = constraintWidget3.f1683e.f1759e.f1740g;
                    fW = constraintWidget3.w();
                } else if (iX == 0) {
                    fW2 = r7.f1683e.f1759e.f1740g * this.f1756b.w();
                    i10 = (int) (fW2 + 0.5f);
                    this.f1759e.d(i10);
                } else if (iX != 1) {
                    i10 = 0;
                    this.f1759e.d(i10);
                } else {
                    ConstraintWidget constraintWidget4 = this.f1756b;
                    f10 = constraintWidget4.f1683e.f1759e.f1740g;
                    fW = constraintWidget4.w();
                }
                fW2 = f10 / fW;
                i10 = (int) (fW2 + 0.5f);
                this.f1759e.d(i10);
            }
        }
        DependencyNode dependencyNode = this.f1762h;
        if (dependencyNode.f1736c) {
            DependencyNode dependencyNode2 = this.f1763i;
            if (dependencyNode2.f1736c) {
                if (dependencyNode.f1743j && dependencyNode2.f1743j && this.f1759e.f1743j) {
                    return;
                }
                if (!this.f1759e.f1743j && this.f1758d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget5 = this.f1756b;
                    if (constraintWidget5.f1717v == 0 && !constraintWidget5.i0()) {
                        DependencyNode dependencyNode3 = (DependencyNode) this.f1762h.f1745l.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) this.f1763i.f1745l.get(0);
                        int i13 = dependencyNode3.f1740g;
                        DependencyNode dependencyNode5 = this.f1762h;
                        int i14 = i13 + dependencyNode5.f1739f;
                        int i15 = dependencyNode4.f1740g + this.f1763i.f1739f;
                        dependencyNode5.d(i14);
                        this.f1763i.d(i15);
                        this.f1759e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f1759e.f1743j && this.f1758d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f1755a == 1 && this.f1762h.f1745l.size() > 0 && this.f1763i.f1745l.size() > 0) {
                    DependencyNode dependencyNode6 = (DependencyNode) this.f1762h.f1745l.get(0);
                    int i16 = (((DependencyNode) this.f1763i.f1745l.get(0)).f1740g + this.f1763i.f1739f) - (dependencyNode6.f1740g + this.f1762h.f1739f);
                    androidx.constraintlayout.core.widgets.analyzer.a aVar2 = this.f1759e;
                    int i17 = aVar2.f1771m;
                    if (i16 < i17) {
                        aVar2.d(i16);
                    } else {
                        aVar2.d(i17);
                    }
                }
                if (this.f1759e.f1743j && this.f1762h.f1745l.size() > 0 && this.f1763i.f1745l.size() > 0) {
                    DependencyNode dependencyNode7 = (DependencyNode) this.f1762h.f1745l.get(0);
                    DependencyNode dependencyNode8 = (DependencyNode) this.f1763i.f1745l.get(0);
                    int i18 = dependencyNode7.f1740g + this.f1762h.f1739f;
                    int i19 = dependencyNode8.f1740g + this.f1763i.f1739f;
                    float fP = this.f1756b.P();
                    if (dependencyNode7 == dependencyNode8) {
                        i18 = dependencyNode7.f1740g;
                        i19 = dependencyNode8.f1740g;
                        fP = 0.5f;
                    }
                    this.f1762h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f1759e.f1740g) * fP)));
                    this.f1763i.d(this.f1762h.f1740g + this.f1759e.f1740g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        ConstraintWidget constraintWidgetL;
        ConstraintWidget constraintWidgetL2;
        ConstraintWidget constraintWidget = this.f1756b;
        if (constraintWidget.f1675a) {
            this.f1759e.d(constraintWidget.y());
        }
        if (!this.f1759e.f1743j) {
            this.f1758d = this.f1756b.R();
            if (this.f1756b.X()) {
                this.f1775l = new y.a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f1758d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetL2 = this.f1756b.L()) != null && constraintWidgetL2.R() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int iY = (constraintWidgetL2.y() - this.f1756b.Q.f()) - this.f1756b.S.f();
                    b(this.f1762h, constraintWidgetL2.f1685f.f1762h, this.f1756b.Q.f());
                    b(this.f1763i, constraintWidgetL2.f1685f.f1763i, -this.f1756b.S.f());
                    this.f1759e.d(iY);
                    return;
                }
                if (this.f1758d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f1759e.d(this.f1756b.y());
                }
            }
        } else if (this.f1758d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetL = this.f1756b.L()) != null && constraintWidgetL.R() == ConstraintWidget.DimensionBehaviour.FIXED) {
            b(this.f1762h, constraintWidgetL.f1685f.f1762h, this.f1756b.Q.f());
            b(this.f1763i, constraintWidgetL.f1685f.f1763i, -this.f1756b.S.f());
            return;
        }
        androidx.constraintlayout.core.widgets.analyzer.a aVar = this.f1759e;
        boolean z10 = aVar.f1743j;
        if (z10) {
            ConstraintWidget constraintWidget2 = this.f1756b;
            if (constraintWidget2.f1675a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.X;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f1660f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f1660f != null) {
                    if (constraintWidget2.i0()) {
                        this.f1762h.f1739f = this.f1756b.X[2].f();
                        this.f1763i.f1739f = -this.f1756b.X[3].f();
                    } else {
                        DependencyNode dependencyNodeH = h(this.f1756b.X[2]);
                        if (dependencyNodeH != null) {
                            b(this.f1762h, dependencyNodeH, this.f1756b.X[2].f());
                        }
                        DependencyNode dependencyNodeH2 = h(this.f1756b.X[3]);
                        if (dependencyNodeH2 != null) {
                            b(this.f1763i, dependencyNodeH2, -this.f1756b.X[3].f());
                        }
                        this.f1762h.f1735b = true;
                        this.f1763i.f1735b = true;
                    }
                    if (this.f1756b.X()) {
                        b(this.f1774k, this.f1762h, this.f1756b.q());
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeH3 = h(constraintAnchor);
                    if (dependencyNodeH3 != null) {
                        b(this.f1762h, dependencyNodeH3, this.f1756b.X[2].f());
                        b(this.f1763i, this.f1762h, this.f1759e.f1740g);
                        if (this.f1756b.X()) {
                            b(this.f1774k, this.f1762h, this.f1756b.q());
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f1660f != null) {
                    DependencyNode dependencyNodeH4 = h(constraintAnchor3);
                    if (dependencyNodeH4 != null) {
                        b(this.f1763i, dependencyNodeH4, -this.f1756b.X[3].f());
                        b(this.f1762h, this.f1763i, -this.f1759e.f1740g);
                    }
                    if (this.f1756b.X()) {
                        b(this.f1774k, this.f1762h, this.f1756b.q());
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f1660f != null) {
                    DependencyNode dependencyNodeH5 = h(constraintAnchor4);
                    if (dependencyNodeH5 != null) {
                        b(this.f1774k, dependencyNodeH5, 0);
                        b(this.f1762h, this.f1774k, -this.f1756b.q());
                        b(this.f1763i, this.f1762h, this.f1759e.f1740g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof x.a) || constraintWidget2.L() == null || this.f1756b.p(ConstraintAnchor.Type.CENTER).f1660f != null) {
                    return;
                }
                b(this.f1762h, this.f1756b.L().f1685f.f1762h, this.f1756b.W());
                b(this.f1763i, this.f1762h, this.f1759e.f1740g);
                if (this.f1756b.X()) {
                    b(this.f1774k, this.f1762h, this.f1756b.q());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f1758d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            aVar.b(this);
        } else {
            ConstraintWidget constraintWidget3 = this.f1756b;
            int i10 = constraintWidget3.f1719w;
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
            } else if (i10 == 3 && !constraintWidget3.i0()) {
                ConstraintWidget constraintWidget4 = this.f1756b;
                if (constraintWidget4.f1717v != 3) {
                    androidx.constraintlayout.core.widgets.analyzer.a aVar4 = constraintWidget4.f1683e.f1759e;
                    this.f1759e.f1745l.add(aVar4);
                    aVar4.f1744k.add(this.f1759e);
                    androidx.constraintlayout.core.widgets.analyzer.a aVar5 = this.f1759e;
                    aVar5.f1735b = true;
                    aVar5.f1744k.add(this.f1762h);
                    this.f1759e.f1744k.add(this.f1763i);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.f1756b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.X;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f1660f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f1660f != null) {
            if (constraintWidget5.i0()) {
                this.f1762h.f1739f = this.f1756b.X[2].f();
                this.f1763i.f1739f = -this.f1756b.X[3].f();
            } else {
                DependencyNode dependencyNodeH6 = h(this.f1756b.X[2]);
                DependencyNode dependencyNodeH7 = h(this.f1756b.X[3]);
                if (dependencyNodeH6 != null) {
                    dependencyNodeH6.b(this);
                }
                if (dependencyNodeH7 != null) {
                    dependencyNodeH7.b(this);
                }
                this.f1764j = WidgetRun.RunType.CENTER;
            }
            if (this.f1756b.X()) {
                c(this.f1774k, this.f1762h, 1, this.f1775l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode dependencyNodeH8 = h(constraintAnchor5);
            if (dependencyNodeH8 != null) {
                b(this.f1762h, dependencyNodeH8, this.f1756b.X[2].f());
                c(this.f1763i, this.f1762h, 1, this.f1759e);
                if (this.f1756b.X()) {
                    c(this.f1774k, this.f1762h, 1, this.f1775l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f1758d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f1756b.w() > 0.0f) {
                    c cVar = this.f1756b.f1683e;
                    if (cVar.f1758d == dimensionBehaviour3) {
                        cVar.f1759e.f1744k.add(this.f1759e);
                        this.f1759e.f1745l.add(this.f1756b.f1683e.f1759e);
                        this.f1759e.f1734a = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f1660f != null) {
                DependencyNode dependencyNodeH9 = h(constraintAnchor7);
                if (dependencyNodeH9 != null) {
                    b(this.f1763i, dependencyNodeH9, -this.f1756b.X[3].f());
                    c(this.f1762h, this.f1763i, -1, this.f1759e);
                    if (this.f1756b.X()) {
                        c(this.f1774k, this.f1762h, 1, this.f1775l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f1660f != null) {
                    DependencyNode dependencyNodeH10 = h(constraintAnchor8);
                    if (dependencyNodeH10 != null) {
                        b(this.f1774k, dependencyNodeH10, 0);
                        c(this.f1762h, this.f1774k, -1, this.f1775l);
                        c(this.f1763i, this.f1762h, 1, this.f1759e);
                    }
                } else if (!(constraintWidget5 instanceof x.a) && constraintWidget5.L() != null) {
                    b(this.f1762h, this.f1756b.L().f1685f.f1762h, this.f1756b.W());
                    c(this.f1763i, this.f1762h, 1, this.f1759e);
                    if (this.f1756b.X()) {
                        c(this.f1774k, this.f1762h, 1, this.f1775l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f1758d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.f1756b.w() > 0.0f) {
                        c cVar2 = this.f1756b.f1683e;
                        if (cVar2.f1758d == dimensionBehaviour5) {
                            cVar2.f1759e.f1744k.add(this.f1759e);
                            this.f1759e.f1745l.add(this.f1756b.f1683e.f1759e);
                            this.f1759e.f1734a = this;
                        }
                    }
                }
            }
        }
        if (this.f1759e.f1745l.size() == 0) {
            this.f1759e.f1736c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.f1762h;
        if (dependencyNode.f1743j) {
            this.f1756b.i1(dependencyNode.f1740g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f1757c = null;
        this.f1762h.c();
        this.f1763i.c();
        this.f1774k.c();
        this.f1759e.c();
        this.f1761g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean m() {
        return this.f1758d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f1756b.f1719w == 0;
    }

    public void q() {
        this.f1761g = false;
        this.f1762h.c();
        this.f1762h.f1743j = false;
        this.f1763i.c();
        this.f1763i.f1743j = false;
        this.f1774k.c();
        this.f1774k.f1743j = false;
        this.f1759e.f1743j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f1756b.u();
    }
}
