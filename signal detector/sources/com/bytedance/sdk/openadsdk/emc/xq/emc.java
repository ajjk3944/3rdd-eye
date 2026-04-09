package com.bytedance.sdk.openadsdk.emc.xq;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class emc implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener emc;

    public emc(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.emc = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
    public void onError(final int i, final String str) {
        if (this.emc == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.xq.emc.1
            @Override // java.lang.Runnable
            public void run() {
                if (emc.this.emc != null) {
                    emc.this.emc.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.xq.emc.2
            @Override // java.lang.Runnable
            public void run() {
                if (emc.this.emc != null) {
                    emc.this.emc.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
