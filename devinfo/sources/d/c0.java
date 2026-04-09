package d;

import a0.x0;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f21582a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f21583b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f21584c;

    public c0(Runnable runnable) {
        this.f21582a = runnable;
        x0 x0Var = new x0(new ca.b(5, this));
        this.f21583b = x0Var;
        a0 a0Var = new a0();
        this.f21584c = a0Var;
        x0Var.i(a0Var);
    }

    public final void a(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        k5.h hVar = new k5.h(onBackInvokedDispatcher, 0);
        x0 x0Var = this.f21583b;
        x0Var.k(hVar, 1);
        x0Var.k(new k5.h(onBackInvokedDispatcher, 1000000), 0);
    }
}
