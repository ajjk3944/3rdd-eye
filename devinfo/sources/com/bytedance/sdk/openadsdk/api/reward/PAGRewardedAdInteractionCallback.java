package com.bytedance.sdk.openadsdk.api.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class PAGRewardedAdInteractionCallback {
    public void onAdClicked() {
    }

    public void onAdDismissed() {
    }

    public void onAdShowed() {
    }

    public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
    }

    public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
    }

    public void onUserEarnedRewardFail(PAGErrorModel pAGErrorModel) {
    }
}
