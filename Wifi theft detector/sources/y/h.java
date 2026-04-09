package y;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* loaded from: classes.dex */
public class h extends WidgetRun {
    public h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f1683e.f();
        constraintWidget.f1685f.f();
        this.f1760f = ((androidx.constraintlayout.core.widgets.f) constraintWidget).n1();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, y.d
    public void a(d dVar) {
        DependencyNode dependencyNode = this.f1762h;
        if (dependencyNode.f1736c && !dependencyNode.f1743j) {
            this.f1762h.d((int) ((((DependencyNode) dependencyNode.f1745l.get(0)).f1740g * ((androidx.constraintlayout.core.widgets.f) this.f1756b).q1()) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) this.f1756b;
        int iO1 = fVar.o1();
        int iP1 = fVar.p1();
        fVar.q1();
        if (fVar.n1() == 1) {
            if (iO1 != -1) {
                this.f1762h.f1745l.add(this.f1756b.f1678b0.f1683e.f1762h);
                this.f1756b.f1678b0.f1683e.f1762h.f1744k.add(this.f1762h);
                this.f1762h.f1739f = iO1;
            } else if (iP1 != -1) {
                this.f1762h.f1745l.add(this.f1756b.f1678b0.f1683e.f1763i);
                this.f1756b.f1678b0.f1683e.f1763i.f1744k.add(this.f1762h);
                this.f1762h.f1739f = -iP1;
            } else {
                DependencyNode dependencyNode = this.f1762h;
                dependencyNode.f1735b = true;
                dependencyNode.f1745l.add(this.f1756b.f1678b0.f1683e.f1763i);
                this.f1756b.f1678b0.f1683e.f1763i.f1744k.add(this.f1762h);
            }
            q(this.f1756b.f1683e.f1762h);
            q(this.f1756b.f1683e.f1763i);
            return;
        }
        if (iO1 != -1) {
            this.f1762h.f1745l.add(this.f1756b.f1678b0.f1685f.f1762h);
            this.f1756b.f1678b0.f1685f.f1762h.f1744k.add(this.f1762h);
            this.f1762h.f1739f = iO1;
        } else if (iP1 != -1) {
            this.f1762h.f1745l.add(this.f1756b.f1678b0.f1685f.f1763i);
            this.f1756b.f1678b0.f1685f.f1763i.f1744k.add(this.f1762h);
            this.f1762h.f1739f = -iP1;
        } else {
            DependencyNode dependencyNode2 = this.f1762h;
            dependencyNode2.f1735b = true;
            dependencyNode2.f1745l.add(this.f1756b.f1678b0.f1685f.f1763i);
            this.f1756b.f1678b0.f1685f.f1763i.f1744k.add(this.f1762h);
        }
        q(this.f1756b.f1685f.f1762h);
        q(this.f1756b.f1685f.f1763i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        if (((androidx.constraintlayout.core.widgets.f) this.f1756b).n1() == 1) {
            this.f1756b.h1(this.f1762h.f1740g);
        } else {
            this.f1756b.i1(this.f1762h.f1740g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f1762h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean m() {
        return false;
    }

    public final void q(DependencyNode dependencyNode) {
        this.f1762h.f1744k.add(dependencyNode);
        dependencyNode.f1745l.add(this.f1762h);
    }
}
