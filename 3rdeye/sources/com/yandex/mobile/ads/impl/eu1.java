package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class eu1 {

    /* renamed from: a, reason: collision with root package name */
    private final fu1 f27045a;

    /* renamed from: b, reason: collision with root package name */
    private final ju1 f27046b;

    public eu1(af appMetricaPolicyConfigurator, fu1 sdkConfigurationChangeListener, ju1 sdkConfigurationProvider) {
        kotlin.jvm.internal.l.f(appMetricaPolicyConfigurator, "appMetricaPolicyConfigurator");
        kotlin.jvm.internal.l.f(sdkConfigurationChangeListener, "sdkConfigurationChangeListener");
        kotlin.jvm.internal.l.f(sdkConfigurationProvider, "sdkConfigurationProvider");
        this.f27045a = sdkConfigurationChangeListener;
        this.f27046b = sdkConfigurationProvider;
    }

    public final void a() {
        this.f27046b.a(this.f27045a);
    }
}
