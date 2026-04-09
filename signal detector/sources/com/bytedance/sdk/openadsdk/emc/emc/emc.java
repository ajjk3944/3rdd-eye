package com.bytedance.sdk.openadsdk.emc.emc;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class emc implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener emc;

    public emc(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.emc = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
    public void onError(final int i, final String str) {
        if (this.emc == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.emc.emc.1
            @Override // java.lang.Runnable
            public void run() {
                emc.this.emc.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.emc.emc.2
            @Override // java.lang.Runnable
            public void run() {
                emc.this.emc.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
