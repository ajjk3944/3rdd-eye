package com.bytedance.sdk.openadsdk.emc.ypw;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.rie;

/* loaded from: classes.dex */
public class dg implements PAGNativeAdData {
    private final emc emc;

    public dg(emc emcVar) {
        this.emc = emcVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        emc emcVar = this.emc;
        if (emcVar != null) {
            return emcVar.gbl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        emc emcVar = this.emc;
        if (emcVar != null) {
            return emcVar.ru();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        emc emcVar = this.emc;
        if (emcVar != null) {
            return emcVar.ycc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        emc emcVar = this.emc;
        if (emcVar != null) {
            return emcVar.bw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        emc emcVar = this.emc;
        if (emcVar != null) {
            return emcVar.xq();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        return rie.bw(this.emc.emc) ? PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo : PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        emc emcVar = this.emc;
        if (emcVar != null) {
            return emcVar.uym();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        emc emcVar = this.emc;
        if (emcVar != null) {
            return emcVar.dg();
        }
        return null;
    }
}
