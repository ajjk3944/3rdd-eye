package com.bytedance.sdk.openadsdk.component.xq;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class ypw implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener emc;

    public ypw(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.emc = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.emc != null) {
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.xq.ypw.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = ypw.this.emc;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
    public void onError(final int i, final String str) {
        if (this.emc != null) {
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.xq.ypw.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = ypw.this.emc;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i, str);
                    }
                }
            });
        }
    }
}
