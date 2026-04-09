package y;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import y.b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.d f25002a;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.d f25005d;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25003b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25004c = true;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f25006e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f25007f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public b.InterfaceC0500b f25008g = null;

    /* renamed from: h, reason: collision with root package name */
    public b.a f25009h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f25010i = new ArrayList();

    public e(androidx.constraintlayout.core.widgets.d dVar) {
        this.f25002a = dVar;
        this.f25005d = dVar;
    }

    public final void a(DependencyNode dependencyNode, int i10, int i11, DependencyNode dependencyNode2, ArrayList arrayList, i iVar) {
        int i12;
        DependencyNode dependencyNode3;
        ArrayList arrayList2;
        WidgetRun widgetRun = dependencyNode.f1737d;
        if (widgetRun.f1757c == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.f25002a;
            if (widgetRun == dVar.f1683e || widgetRun == dVar.f1685f) {
                return;
            }
            if (iVar == null) {
                iVar = new i(widgetRun, i11);
                arrayList.add(iVar);
            }
            i iVar2 = iVar;
            widgetRun.f1757c = iVar2;
            iVar2.a(widgetRun);
            for (d dVar2 : widgetRun.f1762h.f1744k) {
                if (dVar2 instanceof DependencyNode) {
                    i12 = i10;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                    a((DependencyNode) dVar2, i12, 0, dependencyNode3, arrayList2, iVar2);
                } else {
                    i12 = i10;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                }
                i10 = i12;
                dependencyNode2 = dependencyNode3;
                arrayList = arrayList2;
            }
            int i13 = i10;
            DependencyNode dependencyNode4 = dependencyNode2;
            ArrayList arrayList3 = arrayList;
            for (d dVar3 : widgetRun.f1763i.f1744k) {
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i13, 1, dependencyNode4, arrayList3, iVar2);
                }
            }
            if (i13 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                for (d dVar4 : ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f1774k.f1744k) {
                    if (dVar4 instanceof DependencyNode) {
                        a((DependencyNode) dVar4, i13, 2, dependencyNode4, arrayList3, iVar2);
                    }
                }
            }
            for (DependencyNode dependencyNode5 : widgetRun.f1762h.f1745l) {
                if (dependencyNode5 == dependencyNode4) {
                    iVar2.f25016b = true;
                }
                a(dependencyNode5, i13, 0, dependencyNode4, arrayList3, iVar2);
            }
            for (DependencyNode dependencyNode6 : widgetRun.f1763i.f1745l) {
                if (dependencyNode6 == dependencyNode4) {
                    iVar2.f25016b = true;
                }
                a(dependencyNode6, i13, 1, dependencyNode4, arrayList3, iVar2);
            }
            if (i13 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                Iterator it = ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f1774k.f1745l.iterator();
                while (it.hasNext()) {
                    a((DependencyNode) it.next(), i13, 2, dependencyNode4, arrayList3, iVar2);
                }
            }
        }
    }

    public final boolean b(androidx.constraintlayout.core.widgets.d dVar) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        float f10;
        float f11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ArrayList arrayList = dVar.T0;
        int size = arrayList.size();
        byte b10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ConstraintWidget constraintWidget = (ConstraintWidget) obj;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f1676a0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[b10 == true ? 1 : 0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr[1];
            if (constraintWidget.T() == 8) {
                constraintWidget.f1675a = true;
            } else {
                if (constraintWidget.A < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f1717v = 2;
                }
                if (constraintWidget.D < 1.0f && dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f1719w = 2;
                }
                if (constraintWidget.w() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour6 == dimensionBehaviour8 && (dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f1717v = 3;
                    } else if (dimensionBehaviour7 == dimensionBehaviour8 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f1719w = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour8 && dimensionBehaviour7 == dimensionBehaviour8) {
                        if (constraintWidget.f1717v == 0) {
                            constraintWidget.f1717v = 3;
                        }
                        if (constraintWidget.f1719w == 0) {
                            constraintWidget.f1719w = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour6 == dimensionBehaviour9 && constraintWidget.f1717v == 1 && (constraintWidget.P.f1660f == null || constraintWidget.R.f1660f == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour7 == dimensionBehaviour9 && constraintWidget.f1719w == 1 && (constraintWidget.Q.f1660f == null || constraintWidget.S.f1660f == null)) {
                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                androidx.constraintlayout.core.widgets.analyzer.c cVar = constraintWidget.f1683e;
                cVar.f1758d = dimensionBehaviour6;
                int i12 = constraintWidget.f1717v;
                cVar.f1755a = i12;
                androidx.constraintlayout.core.widgets.analyzer.d dVar2 = constraintWidget.f1685f;
                dVar2.f1758d = dimensionBehaviour7;
                int i13 = constraintWidget.f1719w;
                dVar2.f1755a = i13;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                byte b11 = b10 == true ? 1 : 0;
                if ((dimensionBehaviour6 == dimensionBehaviour10 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour7 == dimensionBehaviour10 || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviour7;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviour6;
                    int iU = constraintWidget.U();
                    if (dimensionBehaviour12 == dimensionBehaviour10) {
                        iU = (dVar.U() - constraintWidget.P.f1661g) - constraintWidget.R.f1661g;
                        dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int i14 = iU;
                    int iY = constraintWidget.y();
                    if (dimensionBehaviour11 == dimensionBehaviour10) {
                        iY = (dVar.y() - constraintWidget.Q.f1661g) - constraintWidget.S.f1661g;
                        dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    l(constraintWidget, dimensionBehaviour12, i14, dimensionBehaviour11, iY);
                    constraintWidget.f1683e.f1759e.d(constraintWidget.U());
                    constraintWidget.f1685f.f1759e.d(constraintWidget.y());
                    constraintWidget.f1675a = true;
                } else {
                    if (dimensionBehaviour6 == dimensionBehaviour9) {
                        dimensionBehaviour2 = dimensionBehaviour9;
                        f11 = 0.5f;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        f10 = 1.0f;
                        if (dimensionBehaviour7 != dimensionBehaviour13 && dimensionBehaviour7 != ConstraintWidget.DimensionBehaviour.FIXED) {
                            dimensionBehaviour = dimensionBehaviour7;
                            i10 = 3;
                        } else if (i12 == 3) {
                            if (dimensionBehaviour7 == dimensionBehaviour13) {
                                l(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour13, 0);
                            }
                            int iY2 = constraintWidget.y();
                            int i15 = (int) ((iY2 * constraintWidget.f1684e0) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            l(constraintWidget, dimensionBehaviour14, i15, dimensionBehaviour14, iY2);
                            constraintWidget.f1683e.f1759e.d(constraintWidget.U());
                            constraintWidget.f1685f.f1759e.d(constraintWidget.y());
                            constraintWidget.f1675a = true;
                        } else if (i12 == 1) {
                            l(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour7, 0);
                            constraintWidget.f1683e.f1759e.f1771m = constraintWidget.U();
                        } else {
                            dimensionBehaviour = dimensionBehaviour7;
                            i10 = 3;
                            if (i12 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = dVar.f1676a0[b11];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour15 == dimensionBehaviour16 || dimensionBehaviour15 == dimensionBehaviour10) {
                                    l(constraintWidget, dimensionBehaviour16, (int) ((constraintWidget.A * dVar.U()) + 0.5f), dimensionBehaviour, constraintWidget.y());
                                    constraintWidget.f1683e.f1759e.d(constraintWidget.U());
                                    constraintWidget.f1685f.f1759e.d(constraintWidget.y());
                                    constraintWidget.f1675a = true;
                                }
                            } else {
                                ConstraintAnchor[] constraintAnchorArr = constraintWidget.X;
                                if (constraintAnchorArr[b11].f1660f == null || constraintAnchorArr[1].f1660f == null) {
                                    l(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour, 0);
                                    constraintWidget.f1683e.f1759e.d(constraintWidget.U());
                                    constraintWidget.f1685f.f1759e.d(constraintWidget.y());
                                    constraintWidget.f1675a = true;
                                }
                            }
                        }
                    } else {
                        dimensionBehaviour = dimensionBehaviour7;
                        i10 = 3;
                        dimensionBehaviour2 = dimensionBehaviour9;
                        f10 = 1.0f;
                        f11 = 0.5f;
                    }
                    if (dimensionBehaviour != dimensionBehaviour2 || (dimensionBehaviour6 != (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && dimensionBehaviour6 != ConstraintWidget.DimensionBehaviour.FIXED)) {
                        dimensionBehaviour3 = dimensionBehaviour6;
                    } else if (i13 == i10) {
                        if (dimensionBehaviour6 == dimensionBehaviour4) {
                            l(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                        }
                        int iU2 = constraintWidget.U();
                        float f12 = constraintWidget.f1684e0;
                        if (constraintWidget.x() == -1) {
                            f12 = f10 / f12;
                        }
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                        l(constraintWidget, dimensionBehaviour17, iU2, dimensionBehaviour17, (int) ((iU2 * f12) + f11));
                        constraintWidget.f1683e.f1759e.d(constraintWidget.U());
                        constraintWidget.f1685f.f1759e.d(constraintWidget.y());
                        constraintWidget.f1675a = true;
                    } else if (i13 == 1) {
                        l(constraintWidget, dimensionBehaviour6, 0, dimensionBehaviour4, 0);
                        constraintWidget.f1685f.f1759e.f1771m = constraintWidget.y();
                    } else {
                        dimensionBehaviour3 = dimensionBehaviour6;
                        if (i13 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dVar.f1676a0[1];
                            dimensionBehaviour5 = dimensionBehaviour;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour18 == dimensionBehaviour19 || dimensionBehaviour18 == dimensionBehaviour10) {
                                l(constraintWidget, dimensionBehaviour3, constraintWidget.U(), dimensionBehaviour19, (int) ((constraintWidget.D * dVar.y()) + f11));
                                constraintWidget.f1683e.f1759e.d(constraintWidget.U());
                                constraintWidget.f1685f.f1759e.d(constraintWidget.y());
                                constraintWidget.f1675a = true;
                            }
                            dimensionBehaviour = dimensionBehaviour5;
                        } else {
                            dimensionBehaviour5 = dimensionBehaviour;
                            ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.X;
                            if (constraintAnchorArr2[2].f1660f == null || constraintAnchorArr2[i10].f1660f == null) {
                                l(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour5, 0);
                                constraintWidget.f1683e.f1759e.d(constraintWidget.U());
                                constraintWidget.f1685f.f1759e.d(constraintWidget.y());
                                constraintWidget.f1675a = true;
                            }
                            dimensionBehaviour = dimensionBehaviour5;
                        }
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour2 && dimensionBehaviour == dimensionBehaviour2) {
                        if (i12 == 1 || i13 == 1) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            l(constraintWidget, dimensionBehaviour20, 0, dimensionBehaviour20, 0);
                            constraintWidget.f1683e.f1759e.f1771m = constraintWidget.U();
                            constraintWidget.f1685f.f1759e.f1771m = constraintWidget.y();
                        } else if (i13 == 2 && i12 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.f1676a0;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = dimensionBehaviourArr2[b11];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour21 == dimensionBehaviour22 && dimensionBehaviourArr2[1] == dimensionBehaviour22) {
                                l(constraintWidget, dimensionBehaviour22, (int) ((constraintWidget.A * dVar.U()) + f11), dimensionBehaviour22, (int) ((constraintWidget.D * dVar.y()) + f11));
                                constraintWidget.f1683e.f1759e.d(constraintWidget.U());
                                constraintWidget.f1685f.f1759e.d(constraintWidget.y());
                                constraintWidget.f1675a = true;
                            }
                        }
                    }
                }
                b10 = b11;
            }
        }
        return b10 == true ? 1 : 0;
    }

    public void c() {
        d(this.f25006e);
        this.f25010i.clear();
        i.f25014h = 0;
        i(this.f25002a.f1683e, 0, this.f25010i);
        i(this.f25002a.f1685f, 1, this.f25010i);
        this.f25003b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f25005d.f1683e.f();
        this.f25005d.f1685f.f();
        arrayList.add(this.f25005d.f1683e);
        arrayList.add(this.f25005d.f1685f);
        ArrayList arrayList2 = this.f25005d.T0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ConstraintWidget constraintWidget = (ConstraintWidget) obj;
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                arrayList.add(new h(constraintWidget));
            } else {
                if (constraintWidget.g0()) {
                    if (constraintWidget.f1679c == null) {
                        constraintWidget.f1679c = new c(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f1679c);
                } else {
                    arrayList.add(constraintWidget.f1683e);
                }
                if (constraintWidget.i0()) {
                    if (constraintWidget.f1681d == null) {
                        constraintWidget.f1681d = new c(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f1681d);
                } else {
                    arrayList.add(constraintWidget.f1685f);
                }
                if (constraintWidget instanceof x.b) {
                    arrayList.add(new androidx.constraintlayout.core.widgets.analyzer.b(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            ((WidgetRun) obj2).f();
        }
        int size3 = arrayList.size();
        while (i10 < size3) {
            Object obj3 = arrayList.get(i10);
            i10++;
            WidgetRun widgetRun = (WidgetRun) obj3;
            if (widgetRun.f1756b != this.f25005d) {
                widgetRun.d();
            }
        }
    }

    public final int e(androidx.constraintlayout.core.widgets.d dVar, int i10) {
        int size = this.f25010i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((i) this.f25010i.get(i11)).b(dVar, i10));
        }
        return (int) jMax;
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f25003b || this.f25004c) {
            ArrayList arrayList = this.f25002a.T0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ConstraintWidget constraintWidget = (ConstraintWidget) obj;
                constraintWidget.o();
                constraintWidget.f1675a = false;
                constraintWidget.f1683e.r();
                constraintWidget.f1685f.q();
            }
            this.f25002a.o();
            androidx.constraintlayout.core.widgets.d dVar = this.f25002a;
            dVar.f1675a = false;
            dVar.f1683e.r();
            this.f25002a.f1685f.q();
            this.f25004c = false;
        }
        if (b(this.f25005d)) {
            return false;
        }
        this.f25002a.h1(0);
        this.f25002a.i1(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourV = this.f25002a.v(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourV2 = this.f25002a.v(1);
        if (this.f25003b) {
            c();
        }
        int iV = this.f25002a.V();
        int iW = this.f25002a.W();
        this.f25002a.f1683e.f1762h.d(iV);
        this.f25002a.f1685f.f1762h.d(iW);
        m();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviourV == dimensionBehaviour || dimensionBehaviourV2 == dimensionBehaviour) {
            if (z10) {
                ArrayList arrayList2 = this.f25006e;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    if (!((WidgetRun) obj2).m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && dimensionBehaviourV == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f25002a.K0(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar2 = this.f25002a;
                dVar2.f1(e(dVar2, 0));
                androidx.constraintlayout.core.widgets.d dVar3 = this.f25002a;
                dVar3.f1683e.f1759e.d(dVar3.U());
            }
            if (z10 && dimensionBehaviourV2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f25002a.b1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar4 = this.f25002a;
                dVar4.G0(e(dVar4, 1));
                androidx.constraintlayout.core.widgets.d dVar5 = this.f25002a;
                dVar5.f1685f.f1759e.d(dVar5.y());
            }
        }
        androidx.constraintlayout.core.widgets.d dVar6 = this.f25002a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar6.f1676a0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int iU = dVar6.U() + iV;
            this.f25002a.f1683e.f1763i.d(iU);
            this.f25002a.f1683e.f1759e.d(iU - iV);
            m();
            androidx.constraintlayout.core.widgets.d dVar7 = this.f25002a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar7.f1676a0[1];
            if (dimensionBehaviour4 == dimensionBehaviour3 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iY = dVar7.y() + iW;
                this.f25002a.f1685f.f1763i.d(iY);
                this.f25002a.f1685f.f1759e.d(iY - iW);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList3 = this.f25006e;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            WidgetRun widgetRun = (WidgetRun) obj3;
            if (widgetRun.f1756b != this.f25002a || widgetRun.f1761g) {
                widgetRun.e();
            }
        }
        ArrayList arrayList4 = this.f25006e;
        int size4 = arrayList4.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                z12 = true;
                break;
            }
            Object obj4 = arrayList4.get(i13);
            i13++;
            WidgetRun widgetRun2 = (WidgetRun) obj4;
            if (z11 || widgetRun2.f1756b != this.f25002a) {
                if (!widgetRun2.f1762h.f1743j || ((!widgetRun2.f1763i.f1743j && !(widgetRun2 instanceof h)) || (!widgetRun2.f1759e.f1743j && !(widgetRun2 instanceof c) && !(widgetRun2 instanceof h)))) {
                    break;
                }
            }
        }
        this.f25002a.K0(dimensionBehaviourV);
        this.f25002a.b1(dimensionBehaviourV2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f25003b) {
            ArrayList arrayList = this.f25002a.T0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ConstraintWidget constraintWidget = (ConstraintWidget) obj;
                constraintWidget.o();
                constraintWidget.f1675a = false;
                androidx.constraintlayout.core.widgets.analyzer.c cVar = constraintWidget.f1683e;
                cVar.f1759e.f1743j = false;
                cVar.f1761g = false;
                cVar.r();
                androidx.constraintlayout.core.widgets.analyzer.d dVar = constraintWidget.f1685f;
                dVar.f1759e.f1743j = false;
                dVar.f1761g = false;
                dVar.q();
            }
            this.f25002a.o();
            androidx.constraintlayout.core.widgets.d dVar2 = this.f25002a;
            dVar2.f1675a = false;
            androidx.constraintlayout.core.widgets.analyzer.c cVar2 = dVar2.f1683e;
            cVar2.f1759e.f1743j = false;
            cVar2.f1761g = false;
            cVar2.r();
            androidx.constraintlayout.core.widgets.analyzer.d dVar3 = this.f25002a.f1685f;
            dVar3.f1759e.f1743j = false;
            dVar3.f1761g = false;
            dVar3.q();
            c();
        }
        if (b(this.f25005d)) {
            return false;
        }
        this.f25002a.h1(0);
        this.f25002a.i1(0);
        this.f25002a.f1683e.f1762h.d(0);
        this.f25002a.f1685f.f1762h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z12 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourV = this.f25002a.v(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourV2 = this.f25002a.v(1);
        int iV = this.f25002a.V();
        int iW = this.f25002a.W();
        if (z10 && (dimensionBehaviourV == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviourV2 == dimensionBehaviour)) {
            ArrayList arrayList = this.f25006e;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                WidgetRun widgetRun = (WidgetRun) obj;
                if (widgetRun.f1760f == i10 && !widgetRun.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && dimensionBehaviourV == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.f25002a.K0(ConstraintWidget.DimensionBehaviour.FIXED);
                    androidx.constraintlayout.core.widgets.d dVar = this.f25002a;
                    dVar.f1(e(dVar, 0));
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f25002a;
                    dVar2.f1683e.f1759e.d(dVar2.U());
                }
            } else if (z10 && dimensionBehaviourV2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f25002a.b1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar3 = this.f25002a;
                dVar3.G0(e(dVar3, 1));
                androidx.constraintlayout.core.widgets.d dVar4 = this.f25002a;
                dVar4.f1685f.f1759e.d(dVar4.y());
            }
        }
        if (i10 == 0) {
            androidx.constraintlayout.core.widgets.d dVar5 = this.f25002a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar5.f1676a0[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iU = dVar5.U() + iV;
                this.f25002a.f1683e.f1763i.d(iU);
                this.f25002a.f1683e.f1759e.d(iU - iV);
                z11 = true;
            }
            z11 = false;
        } else {
            androidx.constraintlayout.core.widgets.d dVar6 = this.f25002a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dVar6.f1676a0[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iY = dVar6.y() + iW;
                this.f25002a.f1685f.f1763i.d(iY);
                this.f25002a.f1685f.f1759e.d(iY - iW);
                z11 = true;
            }
            z11 = false;
        }
        m();
        ArrayList arrayList2 = this.f25006e;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            WidgetRun widgetRun2 = (WidgetRun) obj2;
            if (widgetRun2.f1760f == i10 && (widgetRun2.f1756b != this.f25002a || widgetRun2.f1761g)) {
                widgetRun2.e();
            }
        }
        ArrayList arrayList3 = this.f25006e;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                z12 = true;
                break;
            }
            Object obj3 = arrayList3.get(i13);
            i13++;
            WidgetRun widgetRun3 = (WidgetRun) obj3;
            if (widgetRun3.f1760f == i10 && (z11 || widgetRun3.f1756b != this.f25002a)) {
                if (!widgetRun3.f1762h.f1743j || !widgetRun3.f1763i.f1743j || (!(widgetRun3 instanceof c) && !widgetRun3.f1759e.f1743j)) {
                    break;
                }
            }
        }
        this.f25002a.K0(dimensionBehaviourV);
        this.f25002a.b1(dimensionBehaviourV2);
        return z12;
    }

    public final void i(WidgetRun widgetRun, int i10, ArrayList arrayList) {
        for (d dVar : widgetRun.f1762h.f1744k) {
            if (dVar instanceof DependencyNode) {
                a((DependencyNode) dVar, i10, 0, widgetRun.f1763i, arrayList, null);
            } else if (dVar instanceof WidgetRun) {
                a(((WidgetRun) dVar).f1762h, i10, 0, widgetRun.f1763i, arrayList, null);
            }
        }
        for (d dVar2 : widgetRun.f1763i.f1744k) {
            if (dVar2 instanceof DependencyNode) {
                a((DependencyNode) dVar2, i10, 1, widgetRun.f1762h, arrayList, null);
            } else if (dVar2 instanceof WidgetRun) {
                a(((WidgetRun) dVar2).f1763i, i10, 1, widgetRun.f1762h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f1774k.f1744k) {
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    public void j() {
        this.f25003b = true;
    }

    public void k() {
        this.f25004c = true;
    }

    public final void l(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        b.a aVar = this.f25009h;
        aVar.f24990a = dimensionBehaviour;
        aVar.f24991b = dimensionBehaviour2;
        aVar.f24992c = i10;
        aVar.f24993d = i11;
        this.f25008g.b(constraintWidget, aVar);
        constraintWidget.f1(this.f25009h.f24994e);
        constraintWidget.G0(this.f25009h.f24995f);
        constraintWidget.F0(this.f25009h.f24997h);
        constraintWidget.v0(this.f25009h.f24996g);
    }

    public void m() {
        androidx.constraintlayout.core.widgets.analyzer.a aVar;
        ArrayList arrayList = this.f25002a.T0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ConstraintWidget constraintWidget = (ConstraintWidget) obj;
            if (!constraintWidget.f1675a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f1676a0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i11 = constraintWidget.f1717v;
                int i12 = constraintWidget.f1719w;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z10 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i11 == 1);
                boolean z11 = dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i12 == 1);
                androidx.constraintlayout.core.widgets.analyzer.a aVar2 = constraintWidget.f1683e.f1759e;
                boolean z12 = aVar2.f1743j;
                androidx.constraintlayout.core.widgets.analyzer.a aVar3 = constraintWidget.f1685f.f1759e;
                boolean z13 = aVar3.f1743j;
                if (z12 && z13) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    l(constraintWidget, dimensionBehaviour4, aVar2.f1740g, dimensionBehaviour4, aVar3.f1740g);
                    constraintWidget.f1675a = true;
                } else if (z12 && z11) {
                    l(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, aVar2.f1740g, dimensionBehaviour3, aVar3.f1740g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f1685f.f1759e.f1771m = constraintWidget.y();
                    } else {
                        constraintWidget.f1685f.f1759e.d(constraintWidget.y());
                        constraintWidget.f1675a = true;
                    }
                } else if (z13 && z10) {
                    l(constraintWidget, dimensionBehaviour3, aVar2.f1740g, ConstraintWidget.DimensionBehaviour.FIXED, aVar3.f1740g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f1683e.f1759e.f1771m = constraintWidget.U();
                    } else {
                        constraintWidget.f1683e.f1759e.d(constraintWidget.U());
                        constraintWidget.f1675a = true;
                    }
                }
                if (constraintWidget.f1675a && (aVar = constraintWidget.f1685f.f1775l) != null) {
                    aVar.d(constraintWidget.q());
                }
            }
        }
    }

    public void n(b.InterfaceC0500b interfaceC0500b) {
        this.f25008g = interfaceC0500b;
    }
}
