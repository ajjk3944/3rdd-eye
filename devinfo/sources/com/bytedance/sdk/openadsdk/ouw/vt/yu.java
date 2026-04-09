package com.bytedance.sdk.openadsdk.ouw.vt;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu implements PAGNativeAdData {
    private final ouw ouw;

    public yu(ouw ouwVar) {
        this.ouw = ouwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public final View getAdChoicesView() {
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.pno();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public final View getAdLogoView() {
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.ra();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public final String getButtonText() {
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.yu();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public final String getDescription() {
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.lh();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public final PAGImageItem getIcon() {
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.ouw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public final PAGNativeAdData.PAGNativeMediaType getMediaType() {
        return vpp.fkw(this.ouw.ouw) ? PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo : PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public final PAGMediaView getMediaView() {
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.fkw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public final String getTitle() {
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.vt();
        }
        return null;
    }
}
