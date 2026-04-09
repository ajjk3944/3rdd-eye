package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class p01 {

    /* renamed from: a, reason: collision with root package name */
    private final q01 f31556a;

    public p01(q01 mobileAdsExecutorProvider) {
        kotlin.jvm.internal.l.f(mobileAdsExecutorProvider, "mobileAdsExecutorProvider");
        this.f31556a = mobileAdsExecutorProvider;
    }

    public final void a(Runnable runnable) {
        kotlin.jvm.internal.l.f(runnable, "runnable");
        this.f31556a.a().execute(runnable);
    }

    public final void b(Runnable runnable) {
        kotlin.jvm.internal.l.f(runnable, "runnable");
        this.f31556a.b().execute(runnable);
    }
}
