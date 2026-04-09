package o;

import android.widget.AbsListView;

/* renamed from: o.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2749y0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0 f22658a;

    public C2749y0(A0 a02) {
        this.f22658a = a02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        A0 a02 = this.f22658a;
        RunnableC2747x0 runnableC2747x0 = a02.f22340F;
        if (i != 1 || a02.f22347N.getInputMethodMode() == 2 || a02.f22347N.getContentView() == null) {
            return;
        }
        a02.f22344J.removeCallbacks(runnableC2747x0);
        runnableC2747x0.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i3, int i6) {
    }
}
