package com.yandex.mobile.ads.appopenad;

import com.yandex.mobile.ads.common.AdRequestError;

/* loaded from: classes3.dex */
public interface AppOpenAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded(AppOpenAd appOpenAd);
}
