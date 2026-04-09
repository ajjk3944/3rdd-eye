package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class o91 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f31308a;

    /* renamed from: b, reason: collision with root package name */
    private final n91 f31309b;

    /* renamed from: c, reason: collision with root package name */
    private final z41 f31310c;

    public interface b {
        void a(h61 h61Var);

        void a(C4128i3 c4128i3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o91(Context context, vu1 vu1Var, C4072a3 c4072a3, C4198s4 c4198s4) {
        A9.E eA = lu.a();
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, vu1Var, c4072a3, c4198s4, eA, applicationContext, new n91(context, vu1Var.c()), new z41(applicationContext, vu1Var, c4072a3, c4198s4, eA));
    }

    public final void a(a8<String> adResponse, b responseCreationListener, xq1 converterListener) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(responseCreationListener, "responseCreationListener");
        kotlin.jvm.internal.l.f(converterListener, "converterListener");
        this.f31309b.a(adResponse, new a(this, adResponse, responseCreationListener, converterListener, new vv1(this.f31308a)));
    }

    public final class a implements xq1 {

        /* renamed from: a, reason: collision with root package name */
        private final a8<String> f31311a;

        /* renamed from: b, reason: collision with root package name */
        private final b f31312b;

        /* renamed from: c, reason: collision with root package name */
        private final xq1 f31313c;

        /* renamed from: d, reason: collision with root package name */
        private final vv1 f31314d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o91 f31315e;

        public a(o91 o91Var, a8<String> adResponse, b responseCreationListener, xq1 responseConverterListener, vv1 sdkNativeAdFactoriesProviderCreator) {
            kotlin.jvm.internal.l.f(adResponse, "adResponse");
            kotlin.jvm.internal.l.f(responseCreationListener, "responseCreationListener");
            kotlin.jvm.internal.l.f(responseConverterListener, "responseConverterListener");
            kotlin.jvm.internal.l.f(sdkNativeAdFactoriesProviderCreator, "sdkNativeAdFactoriesProviderCreator");
            this.f31315e = o91Var;
            this.f31311a = adResponse;
            this.f31312b = responseCreationListener;
            this.f31313c = responseConverterListener;
            this.f31314d = sdkNativeAdFactoriesProviderCreator;
        }

        @Override // com.yandex.mobile.ads.impl.xq1
        public final void a(C4128i3 adRequestError) {
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            this.f31313c.a(adRequestError);
            this.f31312b.a(adRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.xq1
        public final void a(p61 nativeAdResponse) {
            kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
            this.f31313c.a(nativeAdResponse);
            a8<String> a8Var = this.f31311a;
            b bVar = this.f31312b;
            this.f31315e.f31310c.a(a8Var, nativeAdResponse, this.f31314d.a(a8Var), new d81(bVar));
        }
    }

    public o91(Context context, vu1 sdkEnvironmentModule, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, A9.E coroutineScope, Context appContext, n91 nativeResponseConverter, z41 nativeAdCreationManager) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(nativeResponseConverter, "nativeResponseConverter");
        kotlin.jvm.internal.l.f(nativeAdCreationManager, "nativeAdCreationManager");
        this.f31308a = sdkEnvironmentModule;
        this.f31309b = nativeResponseConverter;
        this.f31310c = nativeAdCreationManager;
        adConfiguration.a(r91.f32561c);
    }

    public final void a() {
        this.f31310c.a();
    }
}
