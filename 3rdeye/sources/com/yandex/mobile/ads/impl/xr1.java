package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class xr1 extends dd0<vr1> {

    /* renamed from: F, reason: collision with root package name */
    private final mm1 f35401F;

    /* renamed from: G, reason: collision with root package name */
    private final rr1 f35402G;

    public static final class a implements InterfaceC4178p4 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4164n4<xr1> f35403a;

        /* renamed from: b, reason: collision with root package name */
        private final xr1 f35404b;

        public a(InterfaceC4164n4<xr1> itemsFinishListener, xr1 loadController) {
            kotlin.jvm.internal.l.f(itemsFinishListener, "itemsFinishListener");
            kotlin.jvm.internal.l.f(loadController, "loadController");
            this.f35403a = itemsFinishListener;
            this.f35404b = loadController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4178p4
        public final void a() {
            this.f35403a.a(this.f35404b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr1(Context context, vu1 sdkEnvironmentModule, InterfaceC4164n4 itemsLoadFinishListener, h7 adRequestData, C4198s4 adLoadingPhasesManager, dg0 htmlAdResponseReportManager, wr1 contentControllerFactory, cs1 adApiControllerFactory, C4072a3 adConfiguration, mm1 proxyRewardedAdLoadListener, rr1 rewardDataValidator) {
        super(context, adConfiguration, sdkEnvironmentModule, proxyRewardedAdLoadListener, adLoadingPhasesManager, contentControllerFactory, htmlAdResponseReportManager);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(itemsLoadFinishListener, "itemsLoadFinishListener");
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        kotlin.jvm.internal.l.f(contentControllerFactory, "contentControllerFactory");
        kotlin.jvm.internal.l.f(adApiControllerFactory, "adApiControllerFactory");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(proxyRewardedAdLoadListener, "proxyRewardedAdLoadListener");
        kotlin.jvm.internal.l.f(rewardDataValidator, "rewardDataValidator");
        this.f35401F = proxyRewardedAdLoadListener;
        this.f35402G = rewardDataValidator;
        adConfiguration.a(adRequestData);
        proxyRewardedAdLoadListener.a(new a(itemsLoadFinishListener, this));
        proxyRewardedAdLoadListener.a(adConfiguration);
        proxyRewardedAdLoadListener.a(htmlAdResponseReportManager);
    }

    @Override // com.yandex.mobile.ads.impl.dd0
    public final wc0<vr1> a(xc0 controllerFactory) {
        kotlin.jvm.internal.l.f(controllerFactory, "controllerFactory");
        return controllerFactory.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.dd0, com.yandex.mobile.ads.impl.vj, com.yandex.mobile.ads.impl.rq1.b
    public final void a(a8<String> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        or1 or1VarJ = adResponse.J();
        this.f35402G.getClass();
        if (or1VarJ != null && (!or1VarJ.e() ? or1VarJ.c() != null : or1VarJ.d() != null)) {
            super.a(adResponse);
        } else {
            b(i7.k());
        }
    }

    public final void a(bu buVar) {
        this.f35401F.a(buVar);
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final void a(String str) {
        super.a(str);
        this.f35401F.a(str);
    }
}
