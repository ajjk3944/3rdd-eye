package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize ouw;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.ouw = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.ouw;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.ouw = pAGBannerSize;
    }
}
