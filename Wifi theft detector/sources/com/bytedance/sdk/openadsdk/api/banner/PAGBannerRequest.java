package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize emc;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.emc = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.emc;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.emc = pAGBannerSize;
    }
}
