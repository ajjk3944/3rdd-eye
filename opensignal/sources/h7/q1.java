package h7;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class q1 extends c1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10192a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f10193b;

    public q1(l0 l0Var) {
        this.f10193b = l0Var;
    }

    @Override // h7.c1
    public final void a(int i10) {
        if (i10 == 0 && this.f10192a) {
            this.f10192a = false;
            this.f10193b.h();
        }
    }

    @Override // h7.c1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f10192a = true;
    }
}
