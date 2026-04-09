package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final m f1498a = new m(0);

    public static int a(t1 t1Var, m0 m0Var, View view, View view2, f1 f1Var, boolean z3) {
        if (f1Var.getChildCount() == 0 || t1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(f1Var.getPosition(view) - f1Var.getPosition(view2)) + 1;
        }
        return Math.min(m0Var.l(), m0Var.b(view2) - m0Var.e(view));
    }

    public static int b(t1 t1Var, m0 m0Var, View view, View view2, f1 f1Var, boolean z3, boolean z10) {
        if (f1Var.getChildCount() == 0 || t1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (t1Var.b() - Math.max(f1Var.getPosition(view), f1Var.getPosition(view2))) - 1) : Math.max(0, Math.min(f1Var.getPosition(view), f1Var.getPosition(view2)));
        if (z3) {
            return Math.round((iMax * (Math.abs(m0Var.b(view2) - m0Var.e(view)) / (Math.abs(f1Var.getPosition(view) - f1Var.getPosition(view2)) + 1))) + (m0Var.k() - m0Var.e(view)));
        }
        return iMax;
    }

    public static int c(t1 t1Var, m0 m0Var, View view, View view2, f1 f1Var, boolean z3) {
        if (f1Var.getChildCount() == 0 || t1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return t1Var.b();
        }
        return (int) (((m0Var.b(view2) - m0Var.e(view)) / (Math.abs(f1Var.getPosition(view) - f1Var.getPosition(view2)) + 1)) * t1Var.b());
    }
}
