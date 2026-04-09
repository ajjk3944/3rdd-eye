package M6;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DivPagerBinder.kt */
/* loaded from: classes.dex */
public final class g extends RecyclerView.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O6.t f4240a;

    public g(O6.t tVar) {
        this.f4240a = tVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void b(RecyclerView recyclerView, int i, int i10) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.l.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        RecyclerView.h adapter = this.f4240a.getViewPager().getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int iI1 = linearLayoutManager.i1();
        int iJ1 = linearLayoutManager.j1();
        if (iI1 == itemCount - 2 && i > 0) {
            recyclerView.scrollToPosition(2);
        } else {
            if (iJ1 != 1 || i >= 0) {
                return;
            }
            recyclerView.scrollToPosition(itemCount - 3);
        }
    }
}
