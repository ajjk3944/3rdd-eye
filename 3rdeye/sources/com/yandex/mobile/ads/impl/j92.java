package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class j92 extends v52<u92, m92> {

    /* renamed from: C, reason: collision with root package name */
    private final p92 f29029C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j92(Context context, C4072a3 adConfiguration, String url, mi2 listener, u92 configuration, y92 requestReporter, p92 vastDataResponseParser) {
        super(context, adConfiguration, 0, url, listener, configuration, requestReporter, null, 1920);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(configuration, "configuration");
        kotlin.jvm.internal.l.f(requestReporter, "requestReporter");
        kotlin.jvm.internal.l.f(vastDataResponseParser, "vastDataResponseParser");
        this.f29029C = vastDataResponseParser;
        fp0.e(url);
    }

    @Override // com.yandex.mobile.ads.impl.v52
    public final rq1<m92> a(nc1 networkResponse, int i) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        m92 m92VarA = this.f29029C.a(networkResponse);
        if (m92VarA == null) {
            rq1<m92> rq1VarA = rq1.a(new wf1("Can't parse VAST response."));
            kotlin.jvm.internal.l.e(rq1VarA, "error(...)");
            return rq1VarA;
        }
        if (m92VarA.b().b().isEmpty()) {
            rq1<m92> rq1VarA2 = rq1.a(new b50());
            kotlin.jvm.internal.l.c(rq1VarA2);
            return rq1VarA2;
        }
        rq1<m92> rq1VarA3 = rq1.a(m92VarA, null);
        kotlin.jvm.internal.l.c(rq1VarA3);
        return rq1VarA3;
    }
}
