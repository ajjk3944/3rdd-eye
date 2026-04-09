package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ji2 implements ii2 {

    /* renamed from: a, reason: collision with root package name */
    private final hi2 f29155a;

    /* renamed from: b, reason: collision with root package name */
    private final pc1 f29156b;

    public ji2(hi2 volleyMapper, pc1 networkResponseDecoder) {
        kotlin.jvm.internal.l.f(volleyMapper, "volleyMapper");
        kotlin.jvm.internal.l.f(networkResponseDecoder, "networkResponseDecoder");
        this.f29155a = volleyMapper;
        this.f29156b = networkResponseDecoder;
    }

    @Override // com.yandex.mobile.ads.impl.ii2
    public final String a(nc1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        this.f29155a.getClass();
        return this.f29156b.a(hi2.a(networkResponse));
    }
}
