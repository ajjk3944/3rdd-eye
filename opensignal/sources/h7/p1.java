package h7;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class p1 extends u3.b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f10184d;

    /* renamed from: e, reason: collision with root package name */
    public final o1 f10185e;

    public p1(RecyclerView recyclerView) {
        this.f10184d = recyclerView;
        o1 o1Var = this.f10185e;
        if (o1Var != null) {
            this.f10185e = o1Var;
        } else {
            this.f10185e = new o1(this);
        }
    }

    @Override // u3.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f10184d.P()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // u3.b
    public final void d(View view, v3.c cVar) {
        this.f23147a.onInitializeAccessibilityNodeInfo(view, cVar.f23838a);
        RecyclerView recyclerView = this.f10184d;
        if (recyclerView.P() || recyclerView.getLayoutManager() == null) {
            return;
        }
        y0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f10274b;
        layoutManager.V(recyclerView2.f2064g, recyclerView2.D0, cVar);
    }

    @Override // u3.b
    public final boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f10184d;
        if (recyclerView.P() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        y0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f10274b;
        return layoutManager.i0(recyclerView2.f2064g, recyclerView2.D0, i10, bundle);
    }
}
