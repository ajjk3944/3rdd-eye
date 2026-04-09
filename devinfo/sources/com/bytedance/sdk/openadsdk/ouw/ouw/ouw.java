package com.bytedance.sdk.openadsdk.ouw.ouw;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener ouw;

    public ouw(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.ouw = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final /* synthetic */ void onAdLoaded(PAGBannerAd pAGBannerAd) {
        final PAGBannerAd pAGBannerAd2 = pAGBannerAd;
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.ouw.ouw.2
                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.ouw.onAdLoaded(pAGBannerAd2);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(final int i4, final String str) {
        if (this.ouw == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.ouw.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                ouw.this.ouw.onError(i4, str);
            }
        });
    }
}
