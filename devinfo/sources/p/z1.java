package p;

import android.widget.AbsListView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z1 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f30920a;

    public z1(b2 b2Var) {
        this.f30920a = b2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i4) {
        b2 b2Var = this.f30920a;
        y1 y1Var = b2Var.f30646r;
        y yVar = b2Var.f30654z;
        if (i4 != 1 || yVar.getInputMethodMode() == 2 || yVar.getContentView() == null) {
            return;
        }
        b2Var.f30650v.removeCallbacks(y1Var);
        y1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i4, int i10, int i11) {
    }
}
