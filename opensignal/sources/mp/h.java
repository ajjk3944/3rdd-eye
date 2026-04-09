package mp;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import br.l;
import h7.j1;
import h7.n1;
import h7.w0;

/* loaded from: classes.dex */
public final class h extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f16920a;

    public h(a aVar) {
        this.f16920a = aVar;
    }

    @Override // h7.w0
    public final void c(Rect rect, View view, RecyclerView recyclerView, j1 j1Var) {
        RecyclerView recyclerView2;
        a aVar = this.f16920a;
        int i10 = aVar.f16902b;
        l.e(rect, "rect");
        l.e(view, "view");
        l.e(j1Var, "s");
        n1 n1VarM = RecyclerView.M(view);
        int iJ = -1;
        if (n1VarM != null && (recyclerView2 = n1VarM.f10170r) != null) {
            iJ = recyclerView2.J(n1VarM);
        }
        int i11 = iJ == 0 ? 0 : iJ == 1 ? (aVar.f16901a + i10) / 2 : i10;
        boolean z10 = recyclerView.getLayoutDirection() == 1;
        if (z10) {
            rect.right = i11;
        } else {
            rect.left = i11;
        }
        if (z10) {
            rect.left = 0;
        } else {
            rect.right = 0;
        }
        rect.top = 0;
        rect.bottom = i10;
    }
}
