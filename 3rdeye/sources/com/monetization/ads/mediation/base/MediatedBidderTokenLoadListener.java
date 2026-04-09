package com.monetization.ads.mediation.base;

import com.monetization.ads.mediation.banner.MediatedBannerSize;

/* loaded from: classes2.dex */
public interface MediatedBidderTokenLoadListener {
    void onBidderTokenFailedToLoad(String str);

    void onBidderTokenLoaded(String str, MediatedBannerSize mediatedBannerSize);
}
