package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class fk2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f27363a;

    /* renamed from: b, reason: collision with root package name */
    private final v92 f27364b;

    /* renamed from: c, reason: collision with root package name */
    private final ad2 f27365c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f27366d;

    /* renamed from: e, reason: collision with root package name */
    private int f27367e;

    public fk2(Context context, C4072a3 adConfiguration, v92 requestConfigurationParametersProvider, ad2 reportParametersProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(reportParametersProvider, "reportParametersProvider");
        this.f27363a = adConfiguration;
        this.f27364b = requestConfigurationParametersProvider;
        this.f27365c = reportParametersProvider;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f27366d = applicationContext;
    }

    public final void a(Context context, List<za2> wrapperAds, xp1<List<za2>> listener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(wrapperAds, "wrapperAds");
        kotlin.jvm.internal.l.f(listener, "listener");
        int i = this.f27367e + 1;
        this.f27367e = i;
        if (i > 5) {
            listener.a(new fb2(1, "Maximum count of VAST wrapper requests exceeded."));
            return;
        }
        Context context2 = this.f27366d;
        C4072a3 c4072a3 = this.f27363a;
        ad2 ad2Var = this.f27365c;
        v92 v92Var = this.f27364b;
        new gk2(context2, c4072a3, ad2Var, v92Var, new ck2(context2, c4072a3, v92Var, ad2Var)).a(context, wrapperAds, listener);
    }
}
