package com.bytedance.sdk.openadsdk.ouw.vt;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra implements le {
    private final PAGNativeAdInteractionListener ouw;

    public ra(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.ouw = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.vt.le
    public final boolean lh() {
        return this.ouw != null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public final void onAdClicked() {
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ra.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ra.this.ouw != null) {
                    ra.this.ouw.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.vt.le
    public final void vt() {
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ra.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ra.this.ouw != null) {
                    ra.this.ouw.onAdDismissed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.vt.le
    public final void ouw() {
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ra.2
            @Override // java.lang.Runnable
            public final void run() {
                if (ra.this.ouw != null) {
                    ra.this.ouw.onAdShowed();
                }
            }
        });
    }
}
