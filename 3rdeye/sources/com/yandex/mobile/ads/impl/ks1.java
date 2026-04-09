package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ks1 implements y00 {

    /* renamed from: a, reason: collision with root package name */
    private final gs1 f29771a;

    public ks1(C4072a3 adConfiguration, InterfaceC4105f1 adActivityListener, gs1 rewardedDivKitDesignCreatorProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(rewardedDivKitDesignCreatorProvider, "rewardedDivKitDesignCreatorProvider");
        this.f29771a = rewardedDivKitDesignCreatorProvider;
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
        ArrayList arrayList = new ArrayList();
        a30 a30VarA = this.f29771a.a(context, adResponse, nativeAdPrivate, eventController, adCompleteListener, closeVerificationController, timeProviderContainer, divKitActionHandlerDelegate, w20Var, y5Var);
        if (a30VarA != null) {
            arrayList.add(a30VarA);
        }
        return arrayList;
    }
}
