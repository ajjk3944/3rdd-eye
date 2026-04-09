package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class l {
    public static int a(RecyclerView.y yVar, i iVar, View view, View view2, RecyclerView.n nVar, boolean z10) {
        if (nVar.getChildCount() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1;
        }
        return Math.min(iVar.o(), iVar.d(view2) - iVar.g(view));
    }

    public static int b(RecyclerView.y yVar, i iVar, View view, View view2, RecyclerView.n nVar, boolean z10, boolean z11) {
        if (nVar.getChildCount() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (yVar.b() - Math.max(nVar.getPosition(view), nVar.getPosition(view2))) - 1) : Math.max(0, Math.min(nVar.getPosition(view), nVar.getPosition(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(iVar.d(view2) - iVar.g(view)) / (Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1))) + (iVar.n() - iVar.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.y yVar, i iVar, View view, View view2, RecyclerView.n nVar, boolean z10) {
        if (nVar.getChildCount() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return yVar.b();
        }
        return (int) (((iVar.d(view2) - iVar.g(view)) / (Math.abs(nVar.getPosition(view) - nVar.getPosition(view2)) + 1)) * yVar.b());
    }
}
