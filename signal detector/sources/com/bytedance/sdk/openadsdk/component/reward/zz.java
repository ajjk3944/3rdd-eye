package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class zz implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener emc;

    public zz(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.emc = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.emc != null) {
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zz.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = zz.this.emc;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
    public void onError(final int i, final String str) {
        if (this.emc != null) {
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zz.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = zz.this.emc;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i, str);
                    }
                }
            });
        }
    }
}
