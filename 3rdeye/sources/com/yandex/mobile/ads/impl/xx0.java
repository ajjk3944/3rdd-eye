package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class xx0 implements yi {

    /* renamed from: a, reason: collision with root package name */
    private final a8<String> f35534a;

    /* renamed from: b, reason: collision with root package name */
    private final vy0 f35535b;

    public xx0(a8<String> adResponse, vy0 mediationData) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(mediationData, "mediationData");
        this.f35534a = adResponse;
        this.f35535b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.yi
    public final xi a(ti loadController) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        return new com.monetization.ads.mediation.banner.c(loadController, this.f35534a, this.f35535b);
    }
}
