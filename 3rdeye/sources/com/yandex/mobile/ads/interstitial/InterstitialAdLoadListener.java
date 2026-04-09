package com.yandex.mobile.ads.interstitial;

import com.yandex.mobile.ads.common.AdRequestError;

/* loaded from: classes3.dex */
public interface InterstitialAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded(InterstitialAd interstitialAd);
}
