package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes3.dex */
public final class ud0 implements w00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    private w00<ExtendedNativeAdView> f34037a;

    public ud0(h61 nativeAdPrivate, tr contentCloseListener, lt nativeAdEventListener, oo clickConnector, mp1 reporter, w00<ExtendedNativeAdView> divKitAdBinder) {
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        kotlin.jvm.internal.l.f(clickConnector, "clickConnector");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(divKitAdBinder, "divKitAdBinder");
        this.f34037a = divKitAdBinder;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView fullscreenNativeAdView = (ExtendedNativeAdView) viewGroup;
        kotlin.jvm.internal.l.f(fullscreenNativeAdView, "fullscreenNativeAdView");
        this.f34037a.a(fullscreenNativeAdView);
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        this.f34037a.c();
    }
}
