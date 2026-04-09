package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class xm0 {

    /* renamed from: a, reason: collision with root package name */
    private final zs f35350a;

    /* renamed from: b, reason: collision with root package name */
    private final mb2<tn0> f35351b;

    public xm0(zs adBreak, mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f35350a = adBreak;
        this.f35351b = videoAdInfo;
    }

    public final String a() {
        int iA = this.f35351b.d().b().a();
        return "yma_" + this.f35350a + "_position_" + iA;
    }
}
