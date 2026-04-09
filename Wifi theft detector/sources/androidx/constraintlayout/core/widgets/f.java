package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f extends ConstraintWidget {
    public float T0 = -1.0f;
    public int U0 = -1;
    public int V0 = -1;
    public ConstraintAnchor W0 = this.Q;
    public int X0 = 0;
    public int Y0 = 0;
    public boolean Z0;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1859a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f1859a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1859a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1859a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1859a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1859a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1859a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1859a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1859a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1859a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public f() {
        this.Y.clear();
        this.Y.add(this.W0);
        int length = this.X.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.X[i10] = this.W0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.c cVar, boolean z10) {
        d dVar = (d) L();
        if (dVar == null) {
            return;
        }
        ConstraintAnchor constraintAnchorP = dVar.p(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorP2 = dVar.p(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.f1678b0;
        boolean z11 = constraintWidget != null && constraintWidget.f1676a0[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.X0 == 0) {
            constraintAnchorP = dVar.p(ConstraintAnchor.Type.TOP);
            constraintAnchorP2 = dVar.p(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f1678b0;
            z11 = constraintWidget2 != null && constraintWidget2.f1676a0[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.Z0 && this.W0.n()) {
            SolverVariable solverVariableQ = cVar.q(this.W0);
            cVar.f(solverVariableQ, this.W0.e());
            if (this.U0 != -1) {
                if (z11) {
                    cVar.h(cVar.q(constraintAnchorP2), solverVariableQ, 0, 5);
                }
            } else if (this.V0 != -1 && z11) {
                SolverVariable solverVariableQ2 = cVar.q(constraintAnchorP2);
                cVar.h(solverVariableQ, cVar.q(constraintAnchorP), 0, 5);
                cVar.h(solverVariableQ2, solverVariableQ, 0, 5);
            }
            this.Z0 = false;
            return;
        }
        if (this.U0 != -1) {
            SolverVariable solverVariableQ3 = cVar.q(this.W0);
            cVar.e(solverVariableQ3, cVar.q(constraintAnchorP), this.U0, 8);
            if (z11) {
                cVar.h(cVar.q(constraintAnchorP2), solverVariableQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.V0 == -1) {
            if (this.T0 != -1.0f) {
                cVar.d(androidx.constraintlayout.core.c.s(cVar, cVar.q(this.W0), cVar.q(constraintAnchorP2), this.T0));
                return;
            }
            return;
        }
        SolverVariable solverVariableQ4 = cVar.q(this.W0);
        SolverVariable solverVariableQ5 = cVar.q(constraintAnchorP2);
        cVar.e(solverVariableQ4, solverVariableQ5, -this.V0, 8);
        if (z11) {
            cVar.h(solverVariableQ4, cVar.q(constraintAnchorP), 0, 5);
            cVar.h(solverVariableQ5, solverVariableQ4, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean l0() {
        return this.Z0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void l1(androidx.constraintlayout.core.c cVar, boolean z10) {
        if (L() == null) {
            return;
        }
        int iX = cVar.x(this.W0);
        if (this.X0 == 1) {
            h1(iX);
            i1(0);
            G0(L().y());
            f1(0);
            return;
        }
        h1(0);
        i1(iX);
        f1(L().U());
        G0(0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void m(ConstraintWidget constraintWidget, HashMap map) {
        super.m(constraintWidget, map);
        f fVar = (f) constraintWidget;
        this.T0 = fVar.T0;
        this.U0 = fVar.U0;
        this.V0 = fVar.V0;
        v1(fVar.X0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean m0() {
        return this.Z0;
    }

    public ConstraintAnchor m1() {
        return this.W0;
    }

    public int n1() {
        return this.X0;
    }

    public int o1() {
        return this.U0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor p(ConstraintAnchor.Type type) {
        int i10 = a.f1859a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.X0 == 1) {
                return this.W0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.X0 == 0) {
            return this.W0;
        }
        return null;
    }

    public int p1() {
        return this.V0;
    }

    public float q1() {
        return this.T0;
    }

    public void r1(int i10) {
        this.W0.t(i10);
        this.Z0 = true;
    }

    public void s1(int i10) {
        if (i10 > -1) {
            this.T0 = -1.0f;
            this.U0 = i10;
            this.V0 = -1;
        }
    }

    public void t1(int i10) {
        if (i10 > -1) {
            this.T0 = -1.0f;
            this.U0 = -1;
            this.V0 = i10;
        }
    }

    public void u1(float f10) {
        if (f10 > -1.0f) {
            this.T0 = f10;
            this.U0 = -1;
            this.V0 = -1;
        }
    }

    public void v1(int i10) {
        if (this.X0 == i10) {
            return;
        }
        this.X0 = i10;
        this.Y.clear();
        if (this.X0 == 1) {
            this.W0 = this.P;
        } else {
            this.W0 = this.Q;
        }
        this.Y.add(this.W0);
        int length = this.X.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.X[i11] = this.W0;
        }
    }
}
