package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class tt1 implements xi {

    /* renamed from: a, reason: collision with root package name */
    private final ti f33772a;

    /* renamed from: b, reason: collision with root package name */
    private final dv1<vt1> f33773b;

    /* renamed from: c, reason: collision with root package name */
    private final rt1 f33774c;

    /* renamed from: d, reason: collision with root package name */
    private a8<String> f33775d;

    public static final class a implements ev1<vt1> {

        /* renamed from: a, reason: collision with root package name */
        private final ti f33776a;

        public a(ti adViewController) {
            kotlin.jvm.internal.l.f(adViewController, "adViewController");
            this.f33776a = adViewController;
        }

        @Override // com.yandex.mobile.ads.impl.ev1
        public final void a(vt1 vt1Var) {
            vt1 ad = vt1Var;
            kotlin.jvm.internal.l.f(ad, "ad");
            ad.a(new st1(this));
        }

        @Override // com.yandex.mobile.ads.impl.ev1
        public final void a(C4128i3 adFetchRequestError) {
            kotlin.jvm.internal.l.f(adFetchRequestError, "adFetchRequestError");
            this.f33776a.b(adFetchRequestError);
        }
    }

    public tt1(ti adLoadController, vu1 sdkEnvironmentModule, C4072a3 adConfiguration, vi bannerAdSizeValidator, wt1 sdkBannerHtmlAdCreator, dv1<vt1> adCreationHandler, rt1 sdkAdapterReporter) {
        kotlin.jvm.internal.l.f(adLoadController, "adLoadController");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(bannerAdSizeValidator, "bannerAdSizeValidator");
        kotlin.jvm.internal.l.f(sdkBannerHtmlAdCreator, "sdkBannerHtmlAdCreator");
        kotlin.jvm.internal.l.f(adCreationHandler, "adCreationHandler");
        kotlin.jvm.internal.l.f(sdkAdapterReporter, "sdkAdapterReporter");
        this.f33772a = adLoadController;
        this.f33773b = adCreationHandler;
        this.f33774c = sdkAdapterReporter;
    }

    @Override // com.yandex.mobile.ads.impl.xi
    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        fp0.d(new Object[0]);
        this.f33773b.a();
        this.f33775d = null;
    }

    @Override // com.yandex.mobile.ads.impl.xi
    public final String getAdInfo() {
        a8<String> a8Var = this.f33775d;
        if (a8Var != null) {
            return a8Var.e();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.xi
    public final void a(Context context, a8<String> adResponse) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f33775d = adResponse;
        C4198s4 c4198s4I = this.f33772a.i();
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32454c;
        uj.a(c4198s4I, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
        this.f33774c.a(context, adResponse, (k71) null);
        this.f33774c.a(context, adResponse);
        this.f33773b.a(context, adResponse, new a(this.f33772a));
    }
}
