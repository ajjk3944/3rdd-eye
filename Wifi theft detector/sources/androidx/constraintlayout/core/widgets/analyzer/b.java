package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b extends WidgetRun {
    public b(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void q(DependencyNode dependencyNode) {
        this.f1762h.f1744k.add(dependencyNode);
        dependencyNode.f1745l.add(this.f1762h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, y.d
    public void a(y.d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f1756b;
        int iQ1 = aVar.q1();
        Iterator it = this.f1762h.f1745l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((DependencyNode) it.next()).f1740g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iQ1 == 0 || iQ1 == 2) {
            this.f1762h.d(i11 + aVar.r1());
        } else {
            this.f1762h.d(i10 + aVar.r1());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        ConstraintWidget constraintWidget = this.f1756b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            this.f1762h.f1735b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int iQ1 = aVar.q1();
            boolean zP1 = aVar.p1();
            int i10 = 0;
            if (iQ1 == 0) {
                this.f1762h.f1738e = DependencyNode.Type.LEFT;
                while (i10 < aVar.U0) {
                    ConstraintWidget constraintWidget2 = aVar.T0[i10];
                    if (zP1 || constraintWidget2.T() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.f1683e.f1762h;
                        dependencyNode.f1744k.add(this.f1762h);
                        this.f1762h.f1745l.add(dependencyNode);
                    }
                    i10++;
                }
                q(this.f1756b.f1683e.f1762h);
                q(this.f1756b.f1683e.f1763i);
                return;
            }
            if (iQ1 == 1) {
                this.f1762h.f1738e = DependencyNode.Type.RIGHT;
                while (i10 < aVar.U0) {
                    ConstraintWidget constraintWidget3 = aVar.T0[i10];
                    if (zP1 || constraintWidget3.T() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.f1683e.f1763i;
                        dependencyNode2.f1744k.add(this.f1762h);
                        this.f1762h.f1745l.add(dependencyNode2);
                    }
                    i10++;
                }
                q(this.f1756b.f1683e.f1762h);
                q(this.f1756b.f1683e.f1763i);
                return;
            }
            if (iQ1 == 2) {
                this.f1762h.f1738e = DependencyNode.Type.TOP;
                while (i10 < aVar.U0) {
                    ConstraintWidget constraintWidget4 = aVar.T0[i10];
                    if (zP1 || constraintWidget4.T() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.f1685f.f1762h;
                        dependencyNode3.f1744k.add(this.f1762h);
                        this.f1762h.f1745l.add(dependencyNode3);
                    }
                    i10++;
                }
                q(this.f1756b.f1685f.f1762h);
                q(this.f1756b.f1685f.f1763i);
                return;
            }
            if (iQ1 != 3) {
                return;
            }
            this.f1762h.f1738e = DependencyNode.Type.BOTTOM;
            while (i10 < aVar.U0) {
                ConstraintWidget constraintWidget5 = aVar.T0[i10];
                if (zP1 || constraintWidget5.T() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.f1685f.f1763i;
                    dependencyNode4.f1744k.add(this.f1762h);
                    this.f1762h.f1745l.add(dependencyNode4);
                }
                i10++;
            }
            q(this.f1756b.f1685f.f1762h);
            q(this.f1756b.f1685f.f1763i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        ConstraintWidget constraintWidget = this.f1756b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int iQ1 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).q1();
            if (iQ1 == 0 || iQ1 == 1) {
                this.f1756b.h1(this.f1762h.f1740g);
            } else {
                this.f1756b.i1(this.f1762h.f1740g);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f1757c = null;
        this.f1762h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean m() {
        return false;
    }
}
