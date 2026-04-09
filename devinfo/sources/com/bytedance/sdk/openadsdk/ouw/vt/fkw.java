package com.bytedance.sdk.openadsdk.ouw.vt;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener ouw;

    public fkw(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.ouw = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final /* synthetic */ void onAdLoaded(PAGNativeAd pAGNativeAd) {
        final PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        if (this.ouw != null) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.fkw.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (fkw.this.ouw != null) {
                        fkw.this.ouw.onAdLoaded(pAGNativeAd2);
                    }
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
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.fkw.1
            @Override // java.lang.Runnable
            public final void run() {
                if (fkw.this.ouw != null) {
                    fkw.this.ouw.onError(i4, str);
                }
            }
        });
    }
}
