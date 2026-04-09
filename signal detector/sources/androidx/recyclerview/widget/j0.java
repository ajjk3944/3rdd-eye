package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class j0 extends U {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5507a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f5508b;

    public j0(k0 k0Var) {
        this.f5508b = k0Var;
    }

    @Override // androidx.recyclerview.widget.U
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f5507a) {
            this.f5507a = false;
            this.f5508b.snapToTargetExistingView();
        }
    }

    @Override // androidx.recyclerview.widget.U
    public final void onScrolled(RecyclerView recyclerView, int i, int i3) {
        if (i == 0 && i3 == 0) {
            return;
        }
        this.f5507a = true;
    }
}
