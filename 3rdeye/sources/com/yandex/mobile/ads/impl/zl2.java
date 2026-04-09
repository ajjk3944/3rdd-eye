package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

/* loaded from: classes3.dex */
public final class zl2 implements InterstitialAd {

    /* renamed from: a, reason: collision with root package name */
    private final ft f36544a;

    /* renamed from: b, reason: collision with root package name */
    private final wk2 f36545b;

    public zl2(ft coreInterstitialAd, wk2 adInfoConverter) {
        kotlin.jvm.internal.l.f(coreInterstitialAd, "coreInterstitialAd");
        kotlin.jvm.internal.l.f(adInfoConverter, "adInfoConverter");
        this.f36544a = coreInterstitialAd;
        this.f36545b = adInfoConverter;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zl2) && kotlin.jvm.internal.l.b(((zl2) obj).f36544a, this.f36544a);
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final AdInfo getInfo() {
        wk2 wk2Var = this.f36545b;
        ms info = this.f36544a.getInfo();
        wk2Var.getClass();
        return wk2.a(info);
    }

    public final int hashCode() {
        return this.f36544a.hashCode();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void setAdEventListener(InterstitialAdEventListener interstitialAdEventListener) {
        this.f36544a.a(new am2(interstitialAdEventListener));
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        this.f36544a.show(activity);
    }
}
