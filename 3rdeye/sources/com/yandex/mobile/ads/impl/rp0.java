package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import c9.C2097r;
import java.util.List;

/* loaded from: classes3.dex */
public final class rp0 implements y00 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f32735a;

    /* renamed from: b, reason: collision with root package name */
    private final qp0 f32736b;

    /* renamed from: c, reason: collision with root package name */
    private final t41 f32737c;

    public rp0(C4072a3 adConfiguration, InterfaceC4105f1 adActivityListener, qp0 interstitialDivKitDesignCreatorProvider, t41 nativeAdControlViewProviderById) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(interstitialDivKitDesignCreatorProvider, "interstitialDivKitDesignCreatorProvider");
        kotlin.jvm.internal.l.f(nativeAdControlViewProviderById, "nativeAdControlViewProviderById");
        this.f32735a = adConfiguration;
        this.f32736b = interstitialDivKitDesignCreatorProvider;
        this.f32737c = nativeAdControlViewProviderById;
    }

    @Override // com.yandex.mobile.ads.impl.y00
    public final List<yd0> a(Context context, a8<?> adResponse, h61 nativeAdPrivate, tr contentCloseListener, lt nativeAdEventListener, C4070a1 eventController, yv debugEventsReporter, InterfaceC4224w2 adCompleteListener, es1 closeVerificationController, s42 timeProviderContainer, g20 divKitActionHandlerDelegate, w20 w20Var, y5 y5Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(eventController, "eventController");
        kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
        kotlin.jvm.internal.l.f(adCompleteListener, "adCompleteListener");
        kotlin.jvm.internal.l.f(closeVerificationController, "closeVerificationController");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        zp zpVarA = new pp0(adResponse, eventController, contentCloseListener, new qh2()).a(this.f32737c, debugEventsReporter, timeProviderContainer);
        g01 g01VarC = this.f32735a.q().c();
        return C2097r.n0(C2097r.y0(C2092m.W(new hj1(zpVarA, g01VarC, new pq()), new pq0(zpVarA, g01VarC, new oq1(), new pq()), new oq0(zpVarA, g01VarC, new oq1(), new pq())), E.u.G(this.f32736b.a(context, adResponse, nativeAdPrivate, eventController, contentCloseListener, adCompleteListener, debugEventsReporter, divKitActionHandlerDelegate, timeProviderContainer, w20Var, y5Var))));
    }
}
