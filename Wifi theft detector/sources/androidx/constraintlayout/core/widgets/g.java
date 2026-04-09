package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean[] f1860a = new boolean[3];

    public static void a(d dVar, androidx.constraintlayout.core.c cVar, ConstraintWidget constraintWidget) {
        constraintWidget.f1711s = -1;
        constraintWidget.f1713t = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f1676a0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f1676a0[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i10 = constraintWidget.P.f1661g;
            int iU = dVar.U() - constraintWidget.R.f1661g;
            ConstraintAnchor constraintAnchor = constraintWidget.P;
            constraintAnchor.f1663i = cVar.q(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.R;
            constraintAnchor2.f1663i = cVar.q(constraintAnchor2);
            cVar.f(constraintWidget.P.f1663i, i10);
            cVar.f(constraintWidget.R.f1663i, iU);
            constraintWidget.f1711s = 2;
            constraintWidget.J0(i10, iU);
        }
        if (dVar.f1676a0[1] == dimensionBehaviour2 || constraintWidget.f1676a0[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i11 = constraintWidget.Q.f1661g;
        int iY = dVar.y() - constraintWidget.S.f1661g;
        ConstraintAnchor constraintAnchor3 = constraintWidget.Q;
        constraintAnchor3.f1663i = cVar.q(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.S;
        constraintAnchor4.f1663i = cVar.q(constraintAnchor4);
        cVar.f(constraintWidget.Q.f1663i, i11);
        cVar.f(constraintWidget.S.f1663i, iY);
        if (constraintWidget.f1700m0 > 0 || constraintWidget.T() == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.T;
            constraintAnchor5.f1663i = cVar.q(constraintAnchor5);
            cVar.f(constraintWidget.T.f1663i, constraintWidget.f1700m0 + i11);
        }
        constraintWidget.f1713t = 2;
        constraintWidget.a1(i11, iY);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
