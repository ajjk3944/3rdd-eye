package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class ga2 extends v52<za2, List<? extends za2>> {

    /* renamed from: C, reason: collision with root package name */
    private final p92 f27601C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga2(Context context, C4072a3 adConfiguration, String url, mi2 listener, za2 wrapper, mk2 requestReporter, p92 vastDataResponseParser) {
        super(context, adConfiguration, 0, url, listener, wrapper, requestReporter, null, 1920);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(wrapper, "wrapper");
        kotlin.jvm.internal.l.f(requestReporter, "requestReporter");
        kotlin.jvm.internal.l.f(vastDataResponseParser, "vastDataResponseParser");
        this.f27601C = vastDataResponseParser;
    }

    @Override // com.yandex.mobile.ads.impl.v52
    public final rq1<List<? extends za2>> a(nc1 networkResponse, int i) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        m92 m92VarA = this.f27601C.a(networkResponse);
        if (m92VarA == null) {
            rq1<List<? extends za2>> rq1VarA = rq1.a(new wf1("Can't parse VAST response."));
            kotlin.jvm.internal.l.e(rq1VarA, "error(...)");
            return rq1VarA;
        }
        List<za2> listB = m92VarA.b().b();
        if (listB.isEmpty()) {
            rq1<List<? extends za2>> rq1VarA2 = rq1.a(new b50());
            kotlin.jvm.internal.l.c(rq1VarA2);
            return rq1VarA2;
        }
        rq1<List<? extends za2>> rq1VarA3 = rq1.a(listB, null);
        kotlin.jvm.internal.l.c(rq1VarA3);
        return rq1VarA3;
    }
}
