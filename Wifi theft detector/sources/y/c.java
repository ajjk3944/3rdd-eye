package y;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends WidgetRun {

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f25000k;

    /* renamed from: l, reason: collision with root package name */
    public int f25001l;

    public c(ConstraintWidget constraintWidget, int i10) {
        super(constraintWidget);
        this.f25000k = new ArrayList();
        this.f1760f = i10;
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, y.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(y.d r27) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.a(y.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        ArrayList arrayList = this.f25000k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((WidgetRun) obj).d();
        }
        int size2 = this.f25000k.size();
        if (size2 < 1) {
            return;
        }
        ConstraintWidget constraintWidget = ((WidgetRun) this.f25000k.get(0)).f1756b;
        ConstraintWidget constraintWidget2 = ((WidgetRun) this.f25000k.get(size2 - 1)).f1756b;
        if (this.f1760f == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.P;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.R;
            DependencyNode dependencyNodeI = i(constraintAnchor, 0);
            int iF = constraintAnchor.f();
            ConstraintWidget constraintWidgetR = r();
            if (constraintWidgetR != null) {
                iF = constraintWidgetR.P.f();
            }
            if (dependencyNodeI != null) {
                b(this.f1762h, dependencyNodeI, iF);
            }
            DependencyNode dependencyNodeI2 = i(constraintAnchor2, 0);
            int iF2 = constraintAnchor2.f();
            ConstraintWidget constraintWidgetS = s();
            if (constraintWidgetS != null) {
                iF2 = constraintWidgetS.R.f();
            }
            if (dependencyNodeI2 != null) {
                b(this.f1763i, dependencyNodeI2, -iF2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.Q;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.S;
            DependencyNode dependencyNodeI3 = i(constraintAnchor3, 1);
            int iF3 = constraintAnchor3.f();
            ConstraintWidget constraintWidgetR2 = r();
            if (constraintWidgetR2 != null) {
                iF3 = constraintWidgetR2.Q.f();
            }
            if (dependencyNodeI3 != null) {
                b(this.f1762h, dependencyNodeI3, iF3);
            }
            DependencyNode dependencyNodeI4 = i(constraintAnchor4, 1);
            int iF4 = constraintAnchor4.f();
            ConstraintWidget constraintWidgetS2 = s();
            if (constraintWidgetS2 != null) {
                iF4 = constraintWidgetS2.S.f();
            }
            if (dependencyNodeI4 != null) {
                b(this.f1763i, dependencyNodeI4, -iF4);
            }
        }
        this.f1762h.f1734a = this;
        this.f1763i.f1734a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        for (int i10 = 0; i10 < this.f25000k.size(); i10++) {
            ((WidgetRun) this.f25000k.get(i10)).e();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f1757c = null;
        ArrayList arrayList = this.f25000k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((WidgetRun) obj).f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long j() {
        int size = this.f25000k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f1762h.f1739f + ((WidgetRun) this.f25000k.get(i10)).j() + r4.f1763i.f1739f;
        }
        return j10;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean m() {
        int size = this.f25000k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((WidgetRun) this.f25000k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.f1756b;
        ConstraintWidget constraintWidgetM = constraintWidget2.M(this.f1760f);
        while (true) {
            ConstraintWidget constraintWidget3 = constraintWidgetM;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                constraintWidgetM = constraintWidget2.M(this.f1760f);
            }
        }
        this.f1756b = constraintWidget;
        this.f25000k.add(constraintWidget.O(this.f1760f));
        ConstraintWidget constraintWidgetK = constraintWidget.K(this.f1760f);
        while (constraintWidgetK != null) {
            this.f25000k.add(constraintWidgetK.O(this.f1760f));
            constraintWidgetK = constraintWidgetK.K(this.f1760f);
        }
        ArrayList arrayList = this.f25000k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            WidgetRun widgetRun = (WidgetRun) obj;
            int i11 = this.f1760f;
            if (i11 == 0) {
                widgetRun.f1756b.f1679c = this;
            } else if (i11 == 1) {
                widgetRun.f1756b.f1681d = this;
            }
        }
        if (this.f1760f == 0 && ((androidx.constraintlayout.core.widgets.d) this.f1756b.L()).K1() && this.f25000k.size() > 1) {
            ArrayList arrayList2 = this.f25000k;
            this.f1756b = ((WidgetRun) arrayList2.get(arrayList2.size() - 1)).f1756b;
        }
        this.f25001l = this.f1760f == 0 ? this.f1756b.A() : this.f1756b.Q();
    }

    public final ConstraintWidget r() {
        for (int i10 = 0; i10 < this.f25000k.size(); i10++) {
            WidgetRun widgetRun = (WidgetRun) this.f25000k.get(i10);
            if (widgetRun.f1756b.T() != 8) {
                return widgetRun.f1756b;
            }
        }
        return null;
    }

    public final ConstraintWidget s() {
        for (int size = this.f25000k.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = (WidgetRun) this.f25000k.get(size);
            if (widgetRun.f1756b.T() != 8) {
                return widgetRun.f1756b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f1760f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f25000k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            sb.append("<");
            sb.append((WidgetRun) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
