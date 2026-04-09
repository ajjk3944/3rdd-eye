package com.bytedance.sdk.openadsdk.emc.bw;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class ypw implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener emc;

    public ypw(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.emc = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
    public void onError(final int i, final String str) {
        if (this.emc == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.bw.ypw.1
            @Override // java.lang.Runnable
            public void run() {
                if (ypw.this.emc != null) {
                    ypw.this.emc.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.bw.ypw.2
            @Override // java.lang.Runnable
            public void run() {
                if (ypw.this.emc != null) {
                    ypw.this.emc.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
