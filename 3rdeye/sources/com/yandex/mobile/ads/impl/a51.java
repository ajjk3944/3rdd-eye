package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class a51 implements m81 {
    @Override // com.yandex.mobile.ads.impl.m81
    public final h61 a(Context context, w31 nativeAd, d61 nativeAdManager, ej0 imageProvider, el binderConfiguration, v41 nativeAdControllers) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        kotlin.jvm.internal.l.f(nativeAdManager, "nativeAdManager");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(binderConfiguration, "binderConfiguration");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        return new g41(context, nativeAd, nativeAdManager, imageProvider, binderConfiguration, nativeAdControllers);
    }
}
