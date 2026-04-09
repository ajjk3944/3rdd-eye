package p;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class r1 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f20151a;

    public r1(t1 t1Var) {
        this.f20151a = t1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        t1 t1Var = this.f20151a;
        q1 q1Var = t1Var.N;
        v vVar = t1Var.V;
        if (i10 != 1 || vVar.getInputMethodMode() == 2 || vVar.getContentView() == null) {
            return;
        }
        t1Var.R.removeCallbacks(q1Var);
        q1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
