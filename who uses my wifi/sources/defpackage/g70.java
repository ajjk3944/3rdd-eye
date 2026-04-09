package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g70 implements AbsListView.OnScrollListener {
    public final /* synthetic */ i70 a;

    public g70(i70 i70Var) {
        this.a = i70Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        i70 i70Var = this.a;
        f70 f70Var = i70Var.w;
        r6 r6Var = i70Var.E;
        if (i != 1 || r6Var.getInputMethodMode() == 2 || r6Var.getContentView() == null) {
            return;
        }
        i70Var.A.removeCallbacks(f70Var);
        f70Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
