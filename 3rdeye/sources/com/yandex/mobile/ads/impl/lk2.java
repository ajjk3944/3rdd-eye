package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.cn1;

/* loaded from: classes3.dex */
public final class lk2 {

    /* renamed from: a, reason: collision with root package name */
    private final ca2 f30025a;

    /* renamed from: b, reason: collision with root package name */
    private final en0 f30026b;

    public lk2(ca2 vastUrlConfigurator, en0 instreamHostChecker) {
        kotlin.jvm.internal.l.f(vastUrlConfigurator, "vastUrlConfigurator");
        kotlin.jvm.internal.l.f(instreamHostChecker, "instreamHostChecker");
        this.f30025a = vastUrlConfigurator;
        this.f30026b = instreamHostChecker;
    }

    public final ga2 a(Context context, C4072a3 adConfiguration, v92 requestConfigurationParametersProvider, za2 wrapperAd, ad2 reportParametersProvider, dk2 requestListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(wrapperAd, "wrapperAd");
        kotlin.jvm.internal.l.f(reportParametersProvider, "reportParametersProvider");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        String strK = wrapperAd.k();
        if (strK == null) {
            strK = "";
        }
        Uri uri = Uri.parse(strK);
        this.f30026b.getClass();
        if (en0.a(uri)) {
            ca2 ca2Var = this.f30025a;
            ca2Var.getClass();
            kotlin.jvm.internal.l.f(uri, "uri");
            strK = cn1.a.a(uri, new ba2(ca2Var, requestConfigurationParametersProvider, adConfiguration, context)).toString();
            kotlin.jvm.internal.l.e(strK, "toString(...)");
        }
        return new ga2(context, adConfiguration, strK, new mi2(requestListener), wrapperAd, new mk2(reportParametersProvider), new p92(context, adConfiguration.q().c()));
    }
}
