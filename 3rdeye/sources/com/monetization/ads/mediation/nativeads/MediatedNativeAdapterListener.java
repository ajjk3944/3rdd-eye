package com.monetization.ads.mediation.nativeads;

import com.monetization.ads.mediation.base.MediatedAdRequestError;

/* loaded from: classes2.dex */
public interface MediatedNativeAdapterListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(MediatedAdRequestError mediatedAdRequestError);

    void onAdImpression();

    void onAdLeftApplication();

    void onAdOpened();

    void onAppInstallAdLoaded(MediatedNativeAd mediatedNativeAd);

    void onContentAdLoaded(MediatedNativeAd mediatedNativeAd);
}
