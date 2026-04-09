package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.rb2;
import java.util.List;

/* loaded from: classes3.dex */
public final class ck2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f25690a;

    /* renamed from: b, reason: collision with root package name */
    private final v92 f25691b;

    /* renamed from: c, reason: collision with root package name */
    private final ad2 f25692c;

    /* renamed from: d, reason: collision with root package name */
    private final rb2 f25693d;

    public /* synthetic */ ck2(Context context, C4072a3 c4072a3, v92 v92Var, ad2 ad2Var) {
        this(context, c4072a3, v92Var, ad2Var, rb2.a.a(context));
    }

    public final void a(Context context, za2 wrapperAd, xp1<List<za2>> listener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(wrapperAd, "wrapperAd");
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f25693d.a(context, this.f25690a, this.f25691b, wrapperAd, this.f25692c, new dk2(context, wrapperAd, listener, new ek2(context, wrapperAd)));
    }

    public ck2(Context context, C4072a3 adConfiguration, v92 requestConfigurationParametersProvider, ad2 reportParametersProvider, rb2 videoAdLoadNetwork) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(reportParametersProvider, "reportParametersProvider");
        kotlin.jvm.internal.l.f(videoAdLoadNetwork, "videoAdLoadNetwork");
        this.f25690a = adConfiguration;
        this.f25691b = requestConfigurationParametersProvider;
        this.f25692c = reportParametersProvider;
        this.f25693d = videoAdLoadNetwork;
    }
}
