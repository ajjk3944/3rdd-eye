package com.yandex.mobile.ads.feed;

import com.yandex.mobile.ads.common.ImpressionData;

/* loaded from: classes3.dex */
public interface FeedAdEventListener {
    void onAdClicked();

    void onImpression(ImpressionData impressionData);
}
