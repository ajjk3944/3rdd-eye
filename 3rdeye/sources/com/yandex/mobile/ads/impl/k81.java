package com.yandex.mobile.ads.impl;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class k81 implements lt {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4105f1 f29559a;

    /* renamed from: b, reason: collision with root package name */
    private final pd0 f29560b;

    public k81(C4188r1 adActivityListener, pd0 fullscreenAdtuneCloseEnabledProvider) {
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(fullscreenAdtuneCloseEnabledProvider, "fullscreenAdtuneCloseEnabledProvider");
        this.f29559a = adActivityListener;
        this.f29560b = fullscreenAdtuneCloseEnabledProvider;
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void a(C4108f4 c4108f4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", c4108f4);
        this.f29559a.a(16, bundle);
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void closeNativeAd() {
        if (this.f29560b.a()) {
            this.f29559a.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onLeftApplication() {
        this.f29559a.a(17, null);
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onReturnedToApplication() {
        this.f29559a.a(18, null);
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onAdClicked() {
    }
}
