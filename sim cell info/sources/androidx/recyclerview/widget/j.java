package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class j {
    static int a(RecyclerView.a0 a0Var, h hVar, View view, View view2, RecyclerView.o oVar, boolean z2) {
        if (oVar.I() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(oVar.f0(view) - oVar.f0(view2)) + 1;
        }
        return Math.min(hVar.n(), hVar.d(view2) - hVar.g(view));
    }

    static int b(RecyclerView.a0 a0Var, h hVar, View view, View view2, RecyclerView.o oVar, boolean z2, boolean z3) {
        if (oVar.I() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z3 ? Math.max(0, (a0Var.b() - Math.max(oVar.f0(view), oVar.f0(view2))) - 1) : Math.max(0, Math.min(oVar.f0(view), oVar.f0(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(hVar.d(view2) - hVar.g(view)) / (Math.abs(oVar.f0(view) - oVar.f0(view2)) + 1))) + (hVar.m() - hVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.a0 a0Var, h hVar, View view, View view2, RecyclerView.o oVar, boolean z2) {
        if (oVar.I() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return a0Var.b();
        }
        return (int) (((hVar.d(view2) - hVar.g(view)) / (Math.abs(oVar.f0(view) - oVar.f0(view2)) + 1)) * a0Var.b());
    }
}
