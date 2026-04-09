package com.monetization.ads.mediation.rewarded;

import com.monetization.ads.mediation.base.MediatedAdRequestError;

/* loaded from: classes2.dex */
public interface MediatedRewardedAdapterListener {
    void onAdImpression();

    void onRewarded(MediatedReward mediatedReward);

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToLoad(MediatedAdRequestError mediatedAdRequestError);

    void onRewardedAdLeftApplication();

    void onRewardedAdLoaded();

    void onRewardedAdShown();
}
