package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* loaded from: classes3.dex */
public final class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f40260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40261b;

    public V0(C4859p1 c4859p1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f40261b = c4859p1;
        this.f40260a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40261b.f41402a.getClass();
        C4961t0 c4961t0 = C4961t0.f41657e;
        c4961t0.f().a(this.f40260a);
    }
}
