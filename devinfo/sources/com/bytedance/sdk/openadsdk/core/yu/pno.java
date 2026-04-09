package com.bytedance.sdk.openadsdk.core.yu;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno implements PAGBannerAdWrapperListener {
    private final PAGBannerAdInteractionListener ouw;

    public pno(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        this.ouw = pAGBannerAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public final void onAdClicked() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.ouw;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public final void onAdDismissed() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.ouw;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public final void onAdShow(View view, int i4) {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.ouw;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public final void onRenderFail(View view, String str, int i4) {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public final void onRenderSuccess(View view, float f10, float f11) {
    }
}
