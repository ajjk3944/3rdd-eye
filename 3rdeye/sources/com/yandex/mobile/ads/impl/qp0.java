package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class qp0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f32305a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4105f1 f32306b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32307c;

    /* renamed from: d, reason: collision with root package name */
    private final d30 f32308d;

    /* renamed from: e, reason: collision with root package name */
    private final ip f32309e;

    /* renamed from: f, reason: collision with root package name */
    private final s41 f32310f;

    public /* synthetic */ qp0(C4072a3 c4072a3, InterfaceC4105f1 interfaceC4105f1, int i) {
        this(c4072a3, interfaceC4105f1, i, new d30(), new qh2(), new u41());
    }

    public final a30 a(Context context, a8 adResponse, h61 nativeAdPrivate, C4070a1 adActivityEventController, tr contentCloseListener, InterfaceC4224w2 adCompleteListener, yv debugEventsReporter, g20 divKitActionHandlerDelegate, s42 timeProviderContainer, w20 w20Var, y5 y5Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(adActivityEventController, "adActivityEventController");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(adCompleteListener, "adCompleteListener");
        kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
        kotlin.jvm.internal.l.f(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        try {
            this.f32308d.getClass();
            if (!d30.a(context) || w20Var == null) {
                return null;
            }
            return new a30(w20Var.b(), this.f32305a, new uq(new zp(adResponse, adActivityEventController, this.f32309e, contentCloseListener, this.f32310f, debugEventsReporter, timeProviderContainer), new ur(adResponse, adActivityEventController, adCompleteListener, nativeAdPrivate.b(), timeProviderContainer, w20Var), new kz1(y5Var, adActivityEventController, this.f32310f, bz1.a(y5Var))), this.f32306b, divKitActionHandlerDelegate, this.f32307c);
        } catch (Throwable unused) {
            return null;
        }
    }

    public qp0(C4072a3 adConfiguration, InterfaceC4105f1 adActivityListener, int i, d30 divKitIntegrationValidator, ip closeAppearanceController, s41 nativeAdControlViewProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(divKitIntegrationValidator, "divKitIntegrationValidator");
        kotlin.jvm.internal.l.f(closeAppearanceController, "closeAppearanceController");
        kotlin.jvm.internal.l.f(nativeAdControlViewProvider, "nativeAdControlViewProvider");
        this.f32305a = adConfiguration;
        this.f32306b = adActivityListener;
        this.f32307c = i;
        this.f32308d = divKitIntegrationValidator;
        this.f32309e = closeAppearanceController;
        this.f32310f = nativeAdControlViewProvider;
    }
}
