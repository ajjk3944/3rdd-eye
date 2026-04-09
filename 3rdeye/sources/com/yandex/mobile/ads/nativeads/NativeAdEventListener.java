package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.ImpressionData;

/* loaded from: classes3.dex */
public interface NativeAdEventListener {
    void onAdClicked();

    void onImpression(ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
