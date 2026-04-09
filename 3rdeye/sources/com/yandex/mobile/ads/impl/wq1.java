package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class wq1<T> implements vq1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ni2<T> f35043a;

    /* renamed from: b, reason: collision with root package name */
    private final hi2 f35044b;

    public /* synthetic */ wq1(ni2 ni2Var) {
        this(ni2Var, new hi2());
    }

    @Override // com.yandex.mobile.ads.impl.vq1
    public final T a(qq1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        this.f35044b.getClass();
        return this.f35043a.a(new nc1(networkResponse.c(), networkResponse.a().a(), networkResponse.b(), true));
    }

    public wq1(ni2<T> responseBodyParser, hi2 volleyMapper) {
        kotlin.jvm.internal.l.f(responseBodyParser, "responseBodyParser");
        kotlin.jvm.internal.l.f(volleyMapper, "volleyMapper");
        this.f35043a = responseBodyParser;
        this.f35044b = volleyMapper;
    }
}
