package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashSet;
import y.b;

/* loaded from: classes.dex */
public abstract class h extends x.b {
    public int V0 = 0;
    public int W0 = 0;
    public int X0 = 0;
    public int Y0 = 0;
    public int Z0 = 0;

    /* renamed from: a1, reason: collision with root package name */
    public int f1861a1 = 0;

    /* renamed from: b1, reason: collision with root package name */
    public int f1862b1 = 0;

    /* renamed from: c1, reason: collision with root package name */
    public int f1863c1 = 0;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f1864d1 = false;

    /* renamed from: e1, reason: collision with root package name */
    public int f1865e1 = 0;

    /* renamed from: f1, reason: collision with root package name */
    public int f1866f1 = 0;

    /* renamed from: g1, reason: collision with root package name */
    public b.a f1867g1 = new b.a();

    /* renamed from: h1, reason: collision with root package name */
    public b.InterfaceC0500b f1868h1 = null;

    public boolean A1() {
        return this.f1864d1;
    }

    public void B1(boolean z10) {
        this.f1864d1 = z10;
    }

    public void C1(int i10, int i11) {
        this.f1865e1 = i10;
        this.f1866f1 = i11;
    }

    public void D1(int i10) {
        this.X0 = i10;
        this.V0 = i10;
        this.Y0 = i10;
        this.W0 = i10;
        this.Z0 = i10;
        this.f1861a1 = i10;
    }

    public void E1(int i10) {
        this.W0 = i10;
    }

    public void F1(int i10) {
        this.f1861a1 = i10;
    }

    public void G1(int i10) {
        this.X0 = i10;
        this.f1862b1 = i10;
    }

    public void H1(int i10) {
        this.Y0 = i10;
        this.f1863c1 = i10;
    }

    public void I1(int i10) {
        this.Z0 = i10;
        this.f1862b1 = i10;
        this.f1863c1 = i10;
    }

    public void J1(int i10) {
        this.V0 = i10;
    }

    @Override // x.b, x.a
    public void c(d dVar) {
        p1();
    }

    public void o1(boolean z10) {
        int i10 = this.Z0;
        if (i10 > 0 || this.f1861a1 > 0) {
            if (z10) {
                this.f1862b1 = this.f1861a1;
                this.f1863c1 = i10;
            } else {
                this.f1862b1 = i10;
                this.f1863c1 = this.f1861a1;
            }
        }
    }

    public void p1() {
        for (int i10 = 0; i10 < this.U0; i10++) {
            ConstraintWidget constraintWidget = this.T0[i10];
            if (constraintWidget != null) {
                constraintWidget.P0(true);
            }
        }
    }

    public boolean q1(HashSet hashSet) {
        for (int i10 = 0; i10 < this.U0; i10++) {
            if (hashSet.contains(this.T0[i10])) {
                return true;
            }
        }
        return false;
    }

    public int r1() {
        return this.f1866f1;
    }

    public int s1() {
        return this.f1865e1;
    }

    public int t1() {
        return this.W0;
    }

    public int u1() {
        return this.f1862b1;
    }

    public int v1() {
        return this.f1863c1;
    }

    public int w1() {
        return this.V0;
    }

    public abstract void x1(int i10, int i11, int i12, int i13);

    public void y1(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        while (this.f1868h1 == null && L() != null) {
            this.f1868h1 = ((d) L()).D1();
        }
        b.a aVar = this.f1867g1;
        aVar.f24990a = dimensionBehaviour;
        aVar.f24991b = dimensionBehaviour2;
        aVar.f24992c = i10;
        aVar.f24993d = i11;
        this.f1868h1.b(constraintWidget, aVar);
        constraintWidget.f1(this.f1867g1.f24994e);
        constraintWidget.G0(this.f1867g1.f24995f);
        constraintWidget.F0(this.f1867g1.f24997h);
        constraintWidget.v0(this.f1867g1.f24996g);
    }

    public boolean z1() {
        ConstraintWidget constraintWidget = this.f1678b0;
        b.InterfaceC0500b interfaceC0500bD1 = constraintWidget != null ? ((d) constraintWidget).D1() : null;
        if (interfaceC0500bD1 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.U0; i10++) {
            ConstraintWidget constraintWidget2 = this.T0[i10];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof f)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviourV = constraintWidget2.v(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourV2 = constraintWidget2.v(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourV != dimensionBehaviour || constraintWidget2.f1717v == 1 || dimensionBehaviourV2 != dimensionBehaviour || constraintWidget2.f1719w == 1) {
                    if (dimensionBehaviourV == dimensionBehaviour) {
                        dimensionBehaviourV = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviourV2 == dimensionBehaviour) {
                        dimensionBehaviourV2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    b.a aVar = this.f1867g1;
                    aVar.f24990a = dimensionBehaviourV;
                    aVar.f24991b = dimensionBehaviourV2;
                    aVar.f24992c = constraintWidget2.U();
                    this.f1867g1.f24993d = constraintWidget2.y();
                    interfaceC0500bD1.b(constraintWidget2, this.f1867g1);
                    constraintWidget2.f1(this.f1867g1.f24994e);
                    constraintWidget2.G0(this.f1867g1.f24995f);
                    constraintWidget2.v0(this.f1867g1.f24996g);
                }
            }
        }
        return true;
    }
}
