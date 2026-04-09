package x;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class c extends ConstraintWidget {
    public ArrayList T0 = new ArrayList();

    public void a(ConstraintWidget constraintWidget) {
        this.T0.add(constraintWidget);
        if (constraintWidget.L() != null) {
            ((c) constraintWidget.L()).o1(constraintWidget);
        }
        constraintWidget.X0(this);
    }

    public ArrayList m1() {
        return this.T0;
    }

    public abstract void n1();

    public void o1(ConstraintWidget constraintWidget) {
        this.T0.remove(constraintWidget);
        constraintWidget.r0();
    }

    public void p1() {
        this.T0.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void r0() {
        this.T0.clear();
        super.r0();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void u0(u.a aVar) {
        super.u0(aVar);
        int size = this.T0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ConstraintWidget) this.T0.get(i10)).u0(aVar);
        }
    }
}
