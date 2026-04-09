package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class r71 implements lt {

    /* renamed from: a, reason: collision with root package name */
    private final ti f32548a;

    public r71(ti adViewController) {
        kotlin.jvm.internal.l.f(adViewController, "adViewController");
        this.f32548a = adViewController;
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void a(C4108f4 c4108f4) {
        this.f32548a.a(c4108f4);
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void closeNativeAd() {
        this.f32548a.A();
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onLeftApplication() {
        this.f32548a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onReturnedToApplication() {
        this.f32548a.onReturnedToApplication();
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onAdClicked() {
    }
}
