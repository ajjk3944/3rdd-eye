package r7;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* compiled from: PaddingItemDecoration.kt */
/* loaded from: classes.dex */
public final class i extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f45793a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45794b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45795c;

    public i(int i, int i10, int i11, int i12) {
        i10 = (i12 & 4) != 0 ? 0 : i10;
        this.f45793a = i;
        this.f45794b = i10;
        this.f45795c = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.B state) {
        int i;
        kotlin.jvm.internal.l.f(outRect, "outRect");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(parent, "parent");
        kotlin.jvm.internal.l.f(state, "state");
        RecyclerView.p layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            i = ((StaggeredGridLayoutManager) layoutManager).f16550p;
        } else {
            boolean z10 = layoutManager instanceof LinearLayoutManager;
            i = 1;
        }
        int i10 = this.f45795c;
        int i11 = this.f45793a;
        if (i != 1) {
            int i12 = i11 / 2;
            int i13 = this.f45794b / 2;
            if (i10 == 0) {
                outRect.set(i12, i13, i12, i13);
                return;
            } else {
                if (i10 != 1) {
                    return;
                }
                outRect.set(i13, i12, i13, i12);
                return;
            }
        }
        RecyclerView.h adapter = parent.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            boolean z11 = childAdapterPosition == itemCount - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    return;
                }
                if (z11) {
                    i11 = 0;
                }
                outRect.set(0, 0, 0, i11);
                return;
            }
            if (C6.r.d(parent)) {
                z11 = childAdapterPosition == 0;
            }
            if (z11) {
                i11 = 0;
            }
            outRect.set(0, 0, i11, 0);
        }
    }
}
