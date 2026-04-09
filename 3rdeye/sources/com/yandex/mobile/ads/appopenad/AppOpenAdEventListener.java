package com.yandex.mobile.ads.appopenad;

import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;

/* loaded from: classes3.dex */
public interface AppOpenAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(AdError adError);

    void onAdImpression(ImpressionData impressionData);

    void onAdShown();
}
