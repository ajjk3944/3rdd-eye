package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class qo0 implements bq1<mx> {

    /* renamed from: a, reason: collision with root package name */
    private final ni2<mx> f32304a;

    public qo0(ni2<mx> responseParser) {
        kotlin.jvm.internal.l.f(responseParser, "responseParser");
        this.f32304a = responseParser;
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final mx a(nc1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        return this.f32304a.a(networkResponse);
    }
}
