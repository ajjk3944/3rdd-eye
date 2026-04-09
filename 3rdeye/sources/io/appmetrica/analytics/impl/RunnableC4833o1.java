package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4833o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f41327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f41328b;

    public RunnableC4833o1(C4859p1 c4859p1, Throwable th) {
        this.f41328b = c4859p1;
        this.f41327a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f41328b).reportUnhandledException(this.f41327a);
    }
}
