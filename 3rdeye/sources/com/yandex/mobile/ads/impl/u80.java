package com.yandex.mobile.ads.impl;

import android.content.Context;
import d9.C4285c;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u80 extends tj<String> {

    /* renamed from: K, reason: collision with root package name */
    private final fa0 f33968K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(Context context, C4072a3 adConfiguration, String url, String query, vj requestListener, vj listener, fa0 fa0Var, hx1 sessionStorage, sc1 networkResponseParserCreator, p7 adRequestReporter) {
        super(context, adConfiguration, url, query, networkResponseParserCreator, requestListener, listener, adRequestReporter, sessionStorage, 1536);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(query, "query");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(sessionStorage, "sessionStorage");
        kotlin.jvm.internal.l.f(networkResponseParserCreator, "networkResponseParserCreator");
        kotlin.jvm.internal.l.f(adRequestReporter, "adRequestReporter");
        this.f33968K = fa0Var;
    }

    @Override // com.yandex.mobile.ads.impl.tj, com.yandex.mobile.ads.impl.op1
    public final Map<String, String> e() {
        Map<String, String> mapE = super.e();
        C4285c c4285c = new C4285c();
        if (this.f33968K != null) {
            c4285c.put(gh0.f27698L.a(), this.f33968K.a());
        }
        c4285c.putAll(mapE);
        return c4285c.c();
    }
}
