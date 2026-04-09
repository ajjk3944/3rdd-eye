package com.yandex.mobile.ads.feed;

import com.yandex.mobile.ads.common.AdRequestError;

/* loaded from: classes3.dex */
public interface FeedAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded();
}
