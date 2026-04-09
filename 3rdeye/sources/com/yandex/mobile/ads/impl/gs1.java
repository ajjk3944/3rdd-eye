package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class gs1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f27974a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4105f1 f27975b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27976c;

    /* renamed from: d, reason: collision with root package name */
    private final d30 f27977d;

    public /* synthetic */ gs1(C4072a3 c4072a3, InterfaceC4105f1 interfaceC4105f1, int i) {
        this(c4072a3, interfaceC4105f1, i, new d30());
    }

    private static uq a(a8 a8Var, h61 h61Var, C4070a1 c4070a1, InterfaceC4224w2 interfaceC4224w2, es1 es1Var, s42 s42Var, w20 w20Var, y5 y5Var) {
        b52 b52Var = new b52();
        u41 u41Var = new u41();
        c91 c91VarB = h61Var.b();
        return new uq(new fs1(a8Var, c4070a1, es1Var, u41Var, c91VarB, s42Var, w20Var, new qp()), new ur(a8Var, c4070a1, interfaceC4224w2, c91VarB, s42Var, w20Var), new ms1(c4070a1, b52Var, c91VarB, s42Var), new kz1(y5Var, c4070a1, u41Var, bz1.a(y5Var)));
    }

    public gs1(C4072a3 adConfiguration, InterfaceC4105f1 adActivityListener, int i, d30 divKitIntegrationValidator) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(divKitIntegrationValidator, "divKitIntegrationValidator");
        this.f27974a = adConfiguration;
        this.f27975b = adActivityListener;
        this.f27976c = i;
        this.f27977d = divKitIntegrationValidator;
    }

    public final a30 a(Context context, a8 adResponse, h61 nativeAdPrivate, C4070a1 adActivityEventController, InterfaceC4224w2 adCompleteListener, es1 closeVerificationController, s42 timeProviderContainer, g20 divKitActionHandlerDelegate, w20 w20Var, y5 y5Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(adActivityEventController, "adActivityEventController");
        kotlin.jvm.internal.l.f(adCompleteListener, "adCompleteListener");
        kotlin.jvm.internal.l.f(closeVerificationController, "closeVerificationController");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        try {
            this.f27977d.getClass();
            if (!d30.a(context) || w20Var == null) {
                return null;
            }
            return new a30(w20Var.b(), this.f27974a, a(adResponse, nativeAdPrivate, adActivityEventController, adCompleteListener, closeVerificationController, timeProviderContainer, w20Var, y5Var), this.f27975b, divKitActionHandlerDelegate, this.f27976c);
        } catch (Throwable unused) {
            return null;
        }
    }
}
