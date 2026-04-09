package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qh0 extends hk {

    /* renamed from: a, reason: collision with root package name */
    private final hk f32216a;

    /* renamed from: b, reason: collision with root package name */
    private final p82 f32217b;

    public qh0(hk httpStackDelegate, p82 userAgentProvider) {
        kotlin.jvm.internal.l.f(httpStackDelegate, "httpStackDelegate");
        kotlin.jvm.internal.l.f(userAgentProvider, "userAgentProvider");
        this.f32216a = httpStackDelegate;
        this.f32217b = userAgentProvider;
    }

    @Override // com.yandex.mobile.ads.impl.hk
    public final mh0 a(op1<?> request, Map<String, String> additionalHeaders) throws IOException, th {
        kotlin.jvm.internal.l.f(request, "request");
        kotlin.jvm.internal.l.f(additionalHeaders, "additionalHeaders");
        HashMap map = new HashMap();
        map.putAll(additionalHeaders);
        map.put(gh0.f27706T.a(), this.f32217b.a());
        mh0 mh0VarA = this.f32216a.a(request, map);
        kotlin.jvm.internal.l.e(mh0VarA, "executeRequest(...)");
        return mh0VarA;
    }
}
