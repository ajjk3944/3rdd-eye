package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class uk0 {

    /* renamed from: a, reason: collision with root package name */
    private final p01 f34080a;

    /* renamed from: b, reason: collision with root package name */
    private final ws f34081b;

    public uk0(p01 mobileAdsExecutor, ws initializationListener) {
        kotlin.jvm.internal.l.f(mobileAdsExecutor, "mobileAdsExecutor");
        kotlin.jvm.internal.l.f(initializationListener, "initializationListener");
        this.f34080a = mobileAdsExecutor;
        this.f34081b = initializationListener;
    }

    public final void a() {
        this.f34080a.b(new Z(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(uk0 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.f34081b.onInitializationCompleted();
    }
}
