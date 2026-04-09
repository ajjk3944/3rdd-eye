package com.monetization.ads.mediation.nativeads;

/* loaded from: classes2.dex */
public interface MediatedNativeAd {
    void bindNativeAd(MediatedNativeAdViewProvider mediatedNativeAdViewProvider);

    void destroy();

    MediatedNativeAdAssets getMediatedNativeAdAssets();

    void unbindNativeAd(MediatedNativeAdViewProvider mediatedNativeAdViewProvider);
}
