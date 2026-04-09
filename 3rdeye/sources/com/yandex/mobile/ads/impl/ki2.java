package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ki2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final hi2 f29678a;

    /* renamed from: b, reason: collision with root package name */
    private final rc1<T> f29679b;

    public ki2(C4072a3 adConfiguration, ni2<T> volleyResponseBodyParser, vq1<T> responseBodyParser, hi2 volleyMapper, rc1<T> responseParser) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(volleyResponseBodyParser, "volleyResponseBodyParser");
        kotlin.jvm.internal.l.f(responseBodyParser, "responseBodyParser");
        kotlin.jvm.internal.l.f(volleyMapper, "volleyMapper");
        kotlin.jvm.internal.l.f(responseParser, "responseParser");
        this.f29678a = volleyMapper;
        this.f29679b = responseParser;
    }

    public final a8<T> a(nc1 networkResponse, Map<String, String> headers, ns responseAdType) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        kotlin.jvm.internal.l.f(headers, "headers");
        kotlin.jvm.internal.l.f(responseAdType, "responseAdType");
        this.f29678a.getClass();
        return this.f29679b.a(hi2.a(networkResponse), headers, responseAdType);
    }
}
