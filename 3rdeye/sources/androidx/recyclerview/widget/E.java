package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
public final class E {
    public static int a(RecyclerView.B b10, A a10, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.O() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(RecyclerView.p.b0(view) - RecyclerView.p.b0(view2)) + 1;
        }
        return Math.min(a10.l(), a10.b(view2) - a10.e(view));
    }

    public static int b(RecyclerView.B b10, A a10, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        if (pVar.O() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (b10.b() - Math.max(RecyclerView.p.b0(view), RecyclerView.p.b0(view2))) - 1) : Math.max(0, Math.min(RecyclerView.p.b0(view), RecyclerView.p.b0(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(a10.b(view2) - a10.e(view)) / (Math.abs(RecyclerView.p.b0(view) - RecyclerView.p.b0(view2)) + 1))) + (a10.k() - a10.e(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.B b10, A a10, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.O() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b10.b();
        }
        return (int) (((a10.b(view2) - a10.e(view)) / (Math.abs(RecyclerView.p.b0(view) - RecyclerView.p.b0(view2)) + 1)) * b10.b());
    }
}
