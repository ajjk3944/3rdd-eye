package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ru1 implements cr1<du1> {

    /* renamed from: a, reason: collision with root package name */
    private final br1<du1> f32784a;

    /* renamed from: b, reason: collision with root package name */
    private final hi2 f32785b;

    public /* synthetic */ ru1(mp1 mp1Var) {
        this(mp1Var, lc1.a(mp1Var), new hi2());
    }

    @Override // com.yandex.mobile.ads.impl.cr1
    public final du1 a(nc1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        this.f32785b.getClass();
        return this.f32784a.a(hi2.a(networkResponse));
    }

    public ru1(mp1 reporter, br1<du1> sdkConfigurationResponseParser, hi2 volleyMapper) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(sdkConfigurationResponseParser, "sdkConfigurationResponseParser");
        kotlin.jvm.internal.l.f(volleyMapper, "volleyMapper");
        this.f32784a = sdkConfigurationResponseParser;
        this.f32785b = volleyMapper;
    }
}
