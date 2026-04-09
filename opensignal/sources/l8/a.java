package l8;

import androidx.lifecycle.v;
import wt.t0;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.o f14895a;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f14896d;

    public a(androidx.lifecycle.o oVar, t0 t0Var) {
        this.f14895a = oVar;
        this.f14896d = t0Var;
    }

    @Override // l8.p
    public final void h() {
        this.f14895a.m1(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(v vVar) {
        this.f14896d.h(null);
    }

    @Override // l8.p
    public final void start() {
        this.f14895a.V0(this);
    }
}
