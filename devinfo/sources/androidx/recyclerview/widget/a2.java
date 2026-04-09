package androidx.recyclerview.widget;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a2 extends j1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1305a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f1306b;

    public a2(b2 b2Var) {
        this.f1306b = b2Var;
    }

    @Override // androidx.recyclerview.widget.j1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i4) {
        if (i4 == 0 && this.f1305a) {
            this.f1305a = false;
            this.f1306b.snapToTargetExistingView();
        }
    }

    @Override // androidx.recyclerview.widget.j1
    public final void onScrolled(RecyclerView recyclerView, int i4, int i10) {
        if (i4 == 0 && i10 == 0) {
            return;
        }
        this.f1305a = true;
    }
}
