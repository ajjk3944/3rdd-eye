package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class o92 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f31316a;

    /* renamed from: b, reason: collision with root package name */
    private final C4198s4 f31317b;

    public o92(C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f31316a = adConfiguration;
        this.f31317b = adLoadingPhasesManager;
    }

    public final n92 a(Context context, u92 configuration, v92 requestConfigurationParametersProvider, xp1<m92> requestListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(configuration, "configuration");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        k92 k92Var = new k92(configuration, new m7(configuration.a()));
        C4072a3 c4072a3 = this.f31316a;
        return new n92(context, c4072a3, configuration, requestConfigurationParametersProvider, this.f31317b, k92Var, requestListener, new ld2(context, c4072a3, k92Var, requestConfigurationParametersProvider));
    }
}
