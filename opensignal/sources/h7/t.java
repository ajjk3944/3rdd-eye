package h7;

import android.view.View;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final dv.h f10205a = new dv.h(2);

    public static int a(j1 j1Var, j0 j0Var, View view, View view2, y0 y0Var, boolean z10) {
        if (y0Var.v() == 0 || j1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(y0.H(view) - y0.H(view2)) + 1;
        }
        return Math.min(j0Var.l(), j0Var.b(view2) - j0Var.e(view));
    }

    public static int b(j1 j1Var, j0 j0Var, View view, View view2, y0 y0Var, boolean z10, boolean z11) {
        if (y0Var.v() == 0 || j1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (j1Var.b() - Math.max(y0.H(view), y0.H(view2))) - 1) : Math.max(0, Math.min(y0.H(view), y0.H(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(j0Var.b(view2) - j0Var.e(view)) / (Math.abs(y0.H(view) - y0.H(view2)) + 1))) + (j0Var.k() - j0Var.e(view)));
        }
        return iMax;
    }

    public static int c(j1 j1Var, j0 j0Var, View view, View view2, y0 y0Var, boolean z10) {
        if (y0Var.v() == 0 || j1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return j1Var.b();
        }
        return (int) (((j0Var.b(view2) - j0Var.e(view)) / (Math.abs(y0.H(view) - y0.H(view2)) + 1)) * j1Var.b());
    }
}
