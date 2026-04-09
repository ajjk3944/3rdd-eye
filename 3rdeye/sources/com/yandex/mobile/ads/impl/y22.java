package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class y22 implements lt {

    /* renamed from: a, reason: collision with root package name */
    private final lt f35601a;

    public y22(lt nativeAdEventListener) {
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        this.f35601a = nativeAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void closeNativeAd() {
        this.f35601a.closeNativeAd();
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onAdClicked() {
        this.f35601a.onAdClicked();
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onLeftApplication() {
        this.f35601a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onReturnedToApplication() {
        this.f35601a.onReturnedToApplication();
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void a(C4108f4 c4108f4) {
    }
}
