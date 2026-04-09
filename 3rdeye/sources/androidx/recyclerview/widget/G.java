package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class G extends RecyclerView.s {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f16381a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16382b = new a();

    /* compiled from: SnapHelper.java */
    public class a extends RecyclerView.u {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16383a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.f16383a) {
                this.f16383a = false;
                G.this.e();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void b(RecyclerView recyclerView, int i, int i10) {
            if (i == 0 && i10 == 0) {
                return;
            }
            this.f16383a = true;
        }
    }

    public final void a(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f16381a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.f16382b;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(aVar);
            this.f16381a.setOnFlingListener(null);
        }
        this.f16381a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f16381a.addOnScrollListener(aVar);
            this.f16381a.setOnFlingListener(this);
            new Scroller(this.f16381a.getContext(), new DecelerateInterpolator());
            e();
        }
    }

    public abstract int[] b(RecyclerView.p pVar, View view);

    @SuppressLint({"UnknownNullness"})
    public abstract View c(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int d(RecyclerView.p pVar, int i, int i10);

    public final void e() {
        RecyclerView.p layoutManager;
        View viewC;
        RecyclerView recyclerView = this.f16381a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewC = c(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewC);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.f16381a.smoothScrollBy(i, iArrB[1]);
    }
}
