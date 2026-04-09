package com.yandex.mobile.ads.impl;

import android.view.ContextThemeWrapper;

/* loaded from: classes3.dex */
public final class e90 extends j6.e {

    /* renamed from: a, reason: collision with root package name */
    private final sz1 f26739a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(ContextThemeWrapper baseContext, j6.i configuration, sz1 sliderAdsBindingExtensionHandler) {
        super(baseContext, configuration, 0, new mb0(), 4, null);
        kotlin.jvm.internal.l.f(baseContext, "baseContext");
        kotlin.jvm.internal.l.f(configuration, "configuration");
        kotlin.jvm.internal.l.f(sliderAdsBindingExtensionHandler, "sliderAdsBindingExtensionHandler");
        this.f26739a = sliderAdsBindingExtensionHandler;
    }

    public final void a(N7.U3 divData, pz1 nativeAdPrivate) {
        kotlin.jvm.internal.l.f(divData, "divData");
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        this.f26739a.a(divData, nativeAdPrivate);
    }
}
