package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface MaxRewardedAdapterListener extends MaxAdapterListener {
    void onRewardedAdClicked();

    void onRewardedAdClicked(Bundle bundle);

    void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle);

    void onRewardedAdDisplayed();

    void onRewardedAdDisplayed(Bundle bundle);

    void onRewardedAdHidden();

    void onRewardedAdHidden(Bundle bundle);

    void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError);

    void onRewardedAdLoaded();

    void onRewardedAdLoaded(Bundle bundle);

    void onUserRewarded(MaxReward maxReward);

    void onUserRewarded(MaxReward maxReward, Bundle bundle);
}
