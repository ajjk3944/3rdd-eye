package com.bytedance.sdk.openadsdk.component.lh;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener ouw;

    public vt(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.ouw = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final /* synthetic */ void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
        final PAGInterstitialAd pAGInterstitialAd2 = pAGInterstitialAd;
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.lh.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = vt.this.ouw;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(final int i4, final String str) {
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.lh.vt.1
                @Override // java.lang.Runnable
                public final void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = vt.this.ouw;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i4, str);
                    }
                }
            });
        }
    }
}
