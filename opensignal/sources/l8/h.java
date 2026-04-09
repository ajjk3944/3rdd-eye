package l8;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.u;

/* loaded from: classes.dex */
public final class h extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public static final h f14909g = new h(0);

    /* renamed from: r, reason: collision with root package name */
    public static final g f14910r = new g();

    @Override // androidx.lifecycle.o
    public final void V0(u uVar) {
        if (!(uVar instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((uVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) uVar;
        g gVar = f14910r;
        defaultLifecycleObserver.onCreate(gVar);
        defaultLifecycleObserver.onStart(gVar);
        defaultLifecycleObserver.onResume(gVar);
    }

    @Override // androidx.lifecycle.o
    public final androidx.lifecycle.n e1() {
        return androidx.lifecycle.n.RESUMED;
    }

    @Override // androidx.lifecycle.o
    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.o
    public final void m1(u uVar) {
    }
}
