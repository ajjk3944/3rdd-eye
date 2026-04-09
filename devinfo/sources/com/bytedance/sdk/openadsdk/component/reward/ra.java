package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener ouw;

    public ra(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.ouw = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final /* synthetic */ void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
        final PAGRewardedAd pAGRewardedAd2 = pAGRewardedAd;
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ra.2
                @Override // java.lang.Runnable
                public final void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = ra.this.ouw;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(final int i4, final String str) {
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ra.1
                @Override // java.lang.Runnable
                public final void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = ra.this.ouw;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i4, str);
                    }
                }
            });
        }
    }
}
