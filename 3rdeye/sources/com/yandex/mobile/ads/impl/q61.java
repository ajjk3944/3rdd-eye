package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class q61 implements ni2<p61> {

    /* renamed from: a, reason: collision with root package name */
    private final bq1<p61> f32087a;

    public q61(bq1<p61> requestPolicy) {
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        this.f32087a = requestPolicy;
    }

    @Override // com.yandex.mobile.ads.impl.ni2
    public final p61 a(nc1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        return this.f32087a.a(networkResponse);
    }
}
