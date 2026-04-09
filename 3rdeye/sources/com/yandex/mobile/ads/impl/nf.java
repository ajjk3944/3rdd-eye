package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class nf extends dd0<lf> {

    /* renamed from: F, reason: collision with root package name */
    private final im1 f30853F;

    public static final class a implements InterfaceC4178p4 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4164n4<nf> f30854a;

        /* renamed from: b, reason: collision with root package name */
        private final nf f30855b;

        public a(InterfaceC4164n4<nf> itemsFinishListener, nf loadController) {
            kotlin.jvm.internal.l.f(itemsFinishListener, "itemsFinishListener");
            kotlin.jvm.internal.l.f(loadController, "loadController");
            this.f30854a = itemsFinishListener;
            this.f30855b = loadController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4178p4
        public final void a() {
            this.f30854a.a(this.f30855b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(Context context, vu1 sdkEnvironmentModule, InterfaceC4164n4 itemsLoadFinishListener, h7 adRequestData, C4198s4 adLoadingPhasesManager, dg0 htmlAdResponseReportManager, mf adContentControllerFactory, C4072a3 adConfiguration, im1 proxyAppOpenAdLoadListener) {
        super(context, adConfiguration, sdkEnvironmentModule, proxyAppOpenAdLoadListener, adLoadingPhasesManager, adContentControllerFactory, htmlAdResponseReportManager);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(itemsLoadFinishListener, "itemsLoadFinishListener");
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        kotlin.jvm.internal.l.f(adContentControllerFactory, "adContentControllerFactory");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(proxyAppOpenAdLoadListener, "proxyAppOpenAdLoadListener");
        this.f30853F = proxyAppOpenAdLoadListener;
        adConfiguration.a(adRequestData);
        proxyAppOpenAdLoadListener.a(new a(itemsLoadFinishListener, this));
        proxyAppOpenAdLoadListener.a(htmlAdResponseReportManager);
        proxyAppOpenAdLoadListener.a(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final wc0<lf> a(xc0 controllerFactory) {
        kotlin.jvm.internal.l.f(controllerFactory, "controllerFactory");
        return controllerFactory.c(this);
    }

    public final void a(qs qsVar) {
        this.f30853F.a(qsVar);
    }
}
