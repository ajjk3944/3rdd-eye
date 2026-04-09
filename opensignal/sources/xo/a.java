package xo;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import br.l;
import h7.j1;
import h7.n1;
import h7.w0;

/* loaded from: classes.dex */
public final class a extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25451a;

    public a(int i10) {
        this.f25451a = i10;
    }

    @Override // h7.w0
    public final void c(Rect rect, View view, RecyclerView recyclerView, j1 j1Var) {
        RecyclerView recyclerView2;
        l.e(rect, "rect");
        l.e(view, "view");
        l.e(j1Var, "state");
        n1 n1VarM = RecyclerView.M(view);
        int iJ = -1;
        if (n1VarM != null && (recyclerView2 = n1VarM.f10170r) != null) {
            iJ = recyclerView2.J(n1VarM);
        }
        boolean z10 = iJ == 0;
        boolean z11 = iJ == j1Var.b() - 1;
        int i10 = this.f25451a / 2;
        int i11 = z10 ? 0 : i10;
        if (z11) {
            i10 = 0;
        }
        boolean z12 = recyclerView.getLayoutDirection() == 1;
        if (z12) {
            rect.right = i11;
        } else {
            rect.left = i11;
        }
        if (z12) {
            rect.left = i10;
        } else {
            rect.right = i10;
        }
        rect.top = 0;
        rect.bottom = 0;
    }
}
