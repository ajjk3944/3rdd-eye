package z6;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.l;

/* compiled from: UpdateStateScrollListener.kt */
/* loaded from: classes.dex */
public final class k extends RecyclerView.u {

    /* renamed from: a, reason: collision with root package name */
    public final String f48472a;

    /* renamed from: b, reason: collision with root package name */
    public final C5866e f48473b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.p f48474c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(String blockId, C5866e c5866e, L6.e eVar) {
        l.f(blockId, "blockId");
        this.f48472a = blockId;
        this.f48473b = c5866e;
        this.f48474c = (RecyclerView.p) eVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [L6.e, androidx.recyclerview.widget.RecyclerView$p] */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void b(RecyclerView recyclerView, int i, int i10) {
        View view;
        ?? r22 = this.f48474c;
        int iJ = r22.j();
        RecyclerView.F fFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(iJ);
        this.f48473b.f48466b.put(this.f48472a, new C5867f(iJ, (fFindViewHolderForLayoutPosition == null || (view = fFindViewHolderForLayoutPosition.itemView) == null) ? 0 : r22.o(view)));
    }
}
