package com.bytedance.sdk.openadsdk.emc.ypw;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class uym implements ycc {
    private final PAGNativeAdInteractionListener emc;

    public uym(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.emc = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.uym.1
            @Override // java.lang.Runnable
            public void run() {
                if (uym.this.emc != null) {
                    uym.this.emc.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.emc.ypw.ycc
    public boolean ypw() {
        return this.emc != null;
    }

    @Override // com.bytedance.sdk.openadsdk.emc.ypw.ycc
    public void emc(PAGNativeAd pAGNativeAd) {
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.uym.2
            @Override // java.lang.Runnable
            public void run() {
                if (uym.this.emc != null) {
                    uym.this.emc.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.emc.ypw.ycc
    public void emc() {
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.uym.3
            @Override // java.lang.Runnable
            public void run() {
                if (uym.this.emc != null) {
                    uym.this.emc.onAdDismissed();
                }
            }
        });
    }
}
