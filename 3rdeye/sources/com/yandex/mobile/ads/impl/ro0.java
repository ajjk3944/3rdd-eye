package com.yandex.mobile.ads.impl;

import R9.AbstractC1564a;

/* loaded from: classes3.dex */
public final class ro0 implements ni2<mx> {

    /* renamed from: a, reason: collision with root package name */
    private final br1<String> f32728a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1564a f32729b;

    /* renamed from: c, reason: collision with root package name */
    private final hi2 f32730c;

    public ro0(t22 stringResponseParser, AbstractC1564a jsonParser, hi2 responseMapper) {
        kotlin.jvm.internal.l.f(stringResponseParser, "stringResponseParser");
        kotlin.jvm.internal.l.f(jsonParser, "jsonParser");
        kotlin.jvm.internal.l.f(responseMapper, "responseMapper");
        this.f32728a = stringResponseParser;
        this.f32729b = jsonParser;
        this.f32730c = responseMapper;
    }

    @Override // com.yandex.mobile.ads.impl.ni2
    public final mx a(nc1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        this.f32730c.getClass();
        String strA = this.f32728a.a(hi2.a(networkResponse));
        if (strA == null || y9.q.i0(strA)) {
            return null;
        }
        AbstractC1564a abstractC1564a = this.f32729b;
        abstractC1564a.getClass();
        return (mx) abstractC1564a.a(mx.Companion.serializer(), strA);
    }
}
