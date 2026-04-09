package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ga implements ha {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f27595b = {fa.a(ga.class, "adViewReference", "getAdViewReference()Lcom/monetization/ads/banner/InternalAdView;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final ao1 f27596a;

    public ga(ap0 adView) {
        kotlin.jvm.internal.l.f(adView, "adView");
        this.f27596a = bo1.a(adView);
    }

    @Override // com.yandex.mobile.ads.impl.ha
    public final boolean a() {
        ap0 ap0Var = (ap0) this.f27596a.getValue(this, f27595b[0]);
        return ap0Var != null && jh2.b(ap0Var) >= 1;
    }

    @Override // com.yandex.mobile.ads.impl.ha
    public final boolean b() {
        ap0 ap0Var = (ap0) this.f27596a.getValue(this, f27595b[0]);
        return (ap0Var == null || jh2.d(ap0Var)) ? false : true;
    }
}
