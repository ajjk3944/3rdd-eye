package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends x.b {
    public int V0 = 0;
    public boolean W0 = true;
    public int X0 = 0;
    public boolean Y0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.c cVar, boolean z10) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        ConstraintAnchor[] constraintAnchorArr2 = this.X;
        constraintAnchorArr2[0] = this.P;
        constraintAnchorArr2[2] = this.Q;
        constraintAnchorArr2[1] = this.R;
        constraintAnchorArr2[3] = this.S;
        int i13 = 0;
        while (true) {
            constraintAnchorArr = this.X;
            if (i13 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i13];
            constraintAnchor.f1663i = cVar.q(constraintAnchor);
            i13++;
        }
        int i14 = this.V0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i14];
        if (!this.Y0) {
            o1();
        }
        if (this.Y0) {
            this.Y0 = false;
            int i15 = this.V0;
            if (i15 == 0 || i15 == 1) {
                cVar.f(this.P.f1663i, this.f1688g0);
                cVar.f(this.R.f1663i, this.f1688g0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    cVar.f(this.Q.f1663i, this.f1690h0);
                    cVar.f(this.S.f1663i, this.f1690h0);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.U0; i16++) {
            ConstraintWidget constraintWidget = this.T0[i16];
            if ((this.W0 || constraintWidget.h()) && ((((i11 = this.V0) == 0 || i11 == 1) && constraintWidget.B() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.P.f1660f != null && constraintWidget.R.f1660f != null) || (((i12 = this.V0) == 2 || i12 == 3) && constraintWidget.R() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.Q.f1660f != null && constraintWidget.S.f1660f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.P.l() || this.R.l();
        boolean z13 = this.Q.l() || this.S.l();
        int i17 = !(!z11 && (((i10 = this.V0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.U0; i18++) {
            ConstraintWidget constraintWidget2 = this.T0[i18];
            if (this.W0 || constraintWidget2.h()) {
                SolverVariable solverVariableQ = cVar.q(constraintWidget2.X[this.V0]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.X;
                int i19 = this.V0;
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i19];
                constraintAnchor3.f1663i = solverVariableQ;
                ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1660f;
                int i20 = (constraintAnchor4 == null || constraintAnchor4.f1658d != this) ? 0 : constraintAnchor3.f1661g;
                if (i19 == 0 || i19 == 2) {
                    cVar.i(constraintAnchor2.f1663i, solverVariableQ, this.X0 - i20, z11);
                } else {
                    cVar.g(constraintAnchor2.f1663i, solverVariableQ, this.X0 + i20, z11);
                }
                cVar.e(constraintAnchor2.f1663i, solverVariableQ, this.X0 + i20, i17);
            }
        }
        int i21 = this.V0;
        if (i21 == 0) {
            cVar.e(this.R.f1663i, this.P.f1663i, 0, 8);
            cVar.e(this.P.f1663i, this.f1678b0.R.f1663i, 0, 4);
            cVar.e(this.P.f1663i, this.f1678b0.P.f1663i, 0, 0);
            return;
        }
        if (i21 == 1) {
            cVar.e(this.P.f1663i, this.R.f1663i, 0, 8);
            cVar.e(this.P.f1663i, this.f1678b0.P.f1663i, 0, 4);
            cVar.e(this.P.f1663i, this.f1678b0.R.f1663i, 0, 0);
        } else if (i21 == 2) {
            cVar.e(this.S.f1663i, this.Q.f1663i, 0, 8);
            cVar.e(this.Q.f1663i, this.f1678b0.S.f1663i, 0, 4);
            cVar.e(this.Q.f1663i, this.f1678b0.Q.f1663i, 0, 0);
        } else if (i21 == 3) {
            cVar.e(this.Q.f1663i, this.S.f1663i, 0, 8);
            cVar.e(this.Q.f1663i, this.f1678b0.Q.f1663i, 0, 4);
            cVar.e(this.Q.f1663i, this.f1678b0.S.f1663i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean l0() {
        return this.Y0;
    }

    @Override // x.b, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void m(ConstraintWidget constraintWidget, HashMap map) {
        super.m(constraintWidget, map);
        a aVar = (a) constraintWidget;
        this.V0 = aVar.V0;
        this.W0 = aVar.W0;
        this.X0 = aVar.X0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean m0() {
        return this.Y0;
    }

    public boolean o1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.U0;
            if (i13 >= i10) {
                break;
            }
            ConstraintWidget constraintWidget = this.T0[i13];
            if ((this.W0 || constraintWidget.h()) && ((((i11 = this.V0) == 0 || i11 == 1) && !constraintWidget.l0()) || (((i12 = this.V0) == 2 || i12 == 3) && !constraintWidget.m0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.U0; i14++) {
            ConstraintWidget constraintWidget2 = this.T0[i14];
            if (this.W0 || constraintWidget2.h()) {
                if (!z11) {
                    int i15 = this.V0;
                    if (i15 == 0) {
                        iMax = constraintWidget2.p(ConstraintAnchor.Type.LEFT).e();
                    } else if (i15 == 1) {
                        iMax = constraintWidget2.p(ConstraintAnchor.Type.RIGHT).e();
                    } else if (i15 == 2) {
                        iMax = constraintWidget2.p(ConstraintAnchor.Type.TOP).e();
                    } else if (i15 == 3) {
                        iMax = constraintWidget2.p(ConstraintAnchor.Type.BOTTOM).e();
                    }
                    z11 = true;
                }
                int i16 = this.V0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.p(ConstraintAnchor.Type.LEFT).e());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.p(ConstraintAnchor.Type.RIGHT).e());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.p(ConstraintAnchor.Type.TOP).e());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.p(ConstraintAnchor.Type.BOTTOM).e());
                }
            }
        }
        int i17 = iMax + this.X0;
        int i18 = this.V0;
        if (i18 == 0 || i18 == 1) {
            A0(i17, i17);
        } else {
            D0(i17, i17);
        }
        this.Y0 = true;
        return true;
    }

    public boolean p1() {
        return this.W0;
    }

    public int q1() {
        return this.V0;
    }

    public int r1() {
        return this.X0;
    }

    public int s1() {
        int i10 = this.V0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    public void t1() {
        for (int i10 = 0; i10 < this.U0; i10++) {
            ConstraintWidget constraintWidget = this.T0[i10];
            if (this.W0 || constraintWidget.h()) {
                int i11 = this.V0;
                if (i11 == 0 || i11 == 1) {
                    constraintWidget.N0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    constraintWidget.N0(1, true);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + u() + " {";
        for (int i10 = 0; i10 < this.U0; i10++) {
            ConstraintWidget constraintWidget = this.T0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.u();
        }
        return str + "}";
    }

    public void u1(boolean z10) {
        this.W0 = z10;
    }

    public void v1(int i10) {
        this.V0 = i10;
    }

    public void w1(int i10) {
        this.X0 = i10;
    }
}
