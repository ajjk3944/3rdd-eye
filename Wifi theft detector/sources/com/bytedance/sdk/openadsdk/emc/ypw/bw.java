package com.bytedance.sdk.openadsdk.emc.ypw;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class bw implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener emc;

    public bw(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.emc = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
    public void onError(final int i10, final String str) {
        if (this.emc == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.bw.1
            @Override // java.lang.Runnable
            public void run() {
                if (bw.this.emc != null) {
                    bw.this.emc.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.bw.2
            @Override // java.lang.Runnable
            public void run() {
                if (bw.this.emc != null) {
                    bw.this.emc.onAdLoaded(pAGNativeAd);
                }
            }
        });
    }
}
