package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f39916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f39917b;

    public O0(C4859p1 c4859p1, boolean z10) {
        this.f39917b = c4859p1;
        this.f39916a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4986u0 c4986u0 = this.f39917b.f41402a;
        boolean z10 = this.f39916a;
        c4986u0.getClass();
        C4961t0.c().setDataSendingEnabled(z10);
    }
}
