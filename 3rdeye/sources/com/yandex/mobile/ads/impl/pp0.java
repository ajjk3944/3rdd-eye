package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class pp0 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f31864a;

    /* renamed from: b, reason: collision with root package name */
    private final C4070a1 f31865b;

    /* renamed from: c, reason: collision with root package name */
    private final tr f31866c;

    /* renamed from: d, reason: collision with root package name */
    private final ip f31867d;

    public pp0(a8<?> adResponse, C4070a1 adActivityEventController, tr contentCloseListener, ip closeAppearanceController) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adActivityEventController, "adActivityEventController");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(closeAppearanceController, "closeAppearanceController");
        this.f31864a = adResponse;
        this.f31865b = adActivityEventController;
        this.f31866c = contentCloseListener;
        this.f31867d = closeAppearanceController;
    }

    public final zp a(t41 nativeAdControlViewProvider, yv debugEventsReporter, s42 timeProviderContainer) {
        kotlin.jvm.internal.l.f(nativeAdControlViewProvider, "nativeAdControlViewProvider");
        kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        return new zp(this.f31864a, this.f31865b, this.f31867d, this.f31866c, nativeAdControlViewProvider, debugEventsReporter, timeProviderContainer);
    }
}
