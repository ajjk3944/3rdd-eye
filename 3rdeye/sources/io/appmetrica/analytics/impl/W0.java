package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* loaded from: classes3.dex */
public final class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f40310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40311b;

    public W0(C4859p1 c4859p1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f40311b = c4859p1;
        this.f40310a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40311b.f41402a.getClass();
        C4961t0 c4961t0 = C4961t0.f41657e;
        c4961t0.f().a(this.f40310a);
    }
}
