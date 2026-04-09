package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class jp0 extends dd0<hp0> {

    /* renamed from: F, reason: collision with root package name */
    private final km1 f29258F;

    public static final class a implements InterfaceC4178p4 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4164n4<jp0> f29259a;

        /* renamed from: b, reason: collision with root package name */
        private final jp0 f29260b;

        public a(InterfaceC4164n4<jp0> itemsFinishListener, jp0 loadController) {
            kotlin.jvm.internal.l.f(itemsFinishListener, "itemsFinishListener");
            kotlin.jvm.internal.l.f(loadController, "loadController");
            this.f29259a = itemsFinishListener;
            this.f29260b = loadController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4178p4
        public final void a() {
            this.f29259a.a(this.f29260b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(Context context, vu1 sdkEnvironmentModule, InterfaceC4164n4 itemsLoadFinishListener, h7 adRequestData, C4198s4 adLoadingPhasesManager, dg0 htmlAdResponseReportManager, ip0 contentControllerFactory, op0 adApiControllerFactory, C4072a3 adConfiguration, km1 proxyInterstitialAdLoadListener) {
        super(context, adConfiguration, sdkEnvironmentModule, proxyInterstitialAdLoadListener, adLoadingPhasesManager, contentControllerFactory, htmlAdResponseReportManager);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(itemsLoadFinishListener, "itemsLoadFinishListener");
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        kotlin.jvm.internal.l.f(contentControllerFactory, "contentControllerFactory");
        kotlin.jvm.internal.l.f(adApiControllerFactory, "adApiControllerFactory");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(proxyInterstitialAdLoadListener, "proxyInterstitialAdLoadListener");
        this.f29258F = proxyInterstitialAdLoadListener;
        adConfiguration.a(adRequestData);
        proxyInterstitialAdLoadListener.a(new a(itemsLoadFinishListener, this));
        proxyInterstitialAdLoadListener.a(adConfiguration);
        proxyInterstitialAdLoadListener.a(htmlAdResponseReportManager);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final wc0<hp0> a(xc0 controllerFactory) {
        kotlin.jvm.internal.l.f(controllerFactory, "controllerFactory");
        return controllerFactory.a(this);
    }

    public final void a(ht htVar) {
        this.f29258F.a(htVar);
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final void a(String str) {
        super.a(str);
        this.f29258F.a(str);
    }
}
