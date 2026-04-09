package x;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import y.g;
import y.j;

/* loaded from: classes.dex */
public class b extends ConstraintWidget implements a {
    public ConstraintWidget[] T0 = new ConstraintWidget[4];
    public int U0 = 0;

    @Override // x.a
    public void a(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i10 = this.U0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.T0;
        if (i10 > constraintWidgetArr.length) {
            this.T0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.T0;
        int i11 = this.U0;
        constraintWidgetArr2[i11] = constraintWidget;
        this.U0 = i11 + 1;
    }

    @Override // x.a
    public void b() {
        this.U0 = 0;
        Arrays.fill(this.T0, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void m(ConstraintWidget constraintWidget, HashMap map) {
        super.m(constraintWidget, map);
        b bVar = (b) constraintWidget;
        this.U0 = 0;
        int i10 = bVar.U0;
        for (int i11 = 0; i11 < i10; i11++) {
            a((ConstraintWidget) map.get(bVar.T0[i11]));
        }
    }

    public void m1(ArrayList arrayList, int i10, j jVar) {
        for (int i11 = 0; i11 < this.U0; i11++) {
            jVar.a(this.T0[i11]);
        }
        for (int i12 = 0; i12 < this.U0; i12++) {
            g.a(this.T0[i12], i10, arrayList, jVar);
        }
    }

    public int n1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.U0; i13++) {
            ConstraintWidget constraintWidget = this.T0[i13];
            if (i10 == 0 && (i12 = constraintWidget.Q0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = constraintWidget.R0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    public void c(d dVar) {
    }
}
