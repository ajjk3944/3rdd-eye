package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class yv1 implements b81 {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f35991f = {fa.a(yv1.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f35992a;

    /* renamed from: b, reason: collision with root package name */
    private final vv1 f35993b;

    /* renamed from: c, reason: collision with root package name */
    private final ao1 f35994c;

    /* renamed from: d, reason: collision with root package name */
    private final rt1 f35995d;

    /* renamed from: e, reason: collision with root package name */
    private final k71 f35996e;

    public yv1(vu1 sdkEnvironmentModule, x51 nativeAdLoadManager, C4072a3 adConfiguration, vv1 sdkNativeAdFactoriesProviderCreator) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(nativeAdLoadManager, "nativeAdLoadManager");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(sdkNativeAdFactoriesProviderCreator, "sdkNativeAdFactoriesProviderCreator");
        this.f35992a = adConfiguration;
        this.f35993b = sdkNativeAdFactoriesProviderCreator;
        this.f35994c = bo1.a(nativeAdLoadManager);
        this.f35995d = new rt1(nativeAdLoadManager.f());
        this.f35996e = new k71(nativeAdLoadManager.f());
    }

    @Override // com.yandex.mobile.ads.impl.b81
    public final void a(Context context, a8<p61> adResponse) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        x51 x51Var = (x51) this.f35994c.getValue(this, f35991f[0]);
        if (x51Var != null) {
            C4198s4 c4198s4I = x51Var.i();
            EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32454c;
            c4198s4I.getClass();
            kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
            c4198s4I.a(adLoadingPhaseType, null);
            l71 l71Var = new l71(adResponse, adResponse.I(), this.f35992a);
            this.f35995d.a(context, adResponse, this.f35996e);
            this.f35995d.a(context, adResponse, l71Var);
            x51Var.a(adResponse, this.f35993b.a(adResponse));
        }
    }
}
