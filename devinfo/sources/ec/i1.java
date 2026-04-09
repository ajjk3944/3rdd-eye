package ec;

import java.lang.Thread;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f22787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f22788b;

    public i1(l1 l1Var, String str) {
        this.f22788b = l1Var;
        this.f22787a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        s0 s0Var = ((o1) this.f22788b.f218b).f22954f;
        o1.m(s0Var);
        s0Var.g.e(th2, this.f22787a);
    }
}
