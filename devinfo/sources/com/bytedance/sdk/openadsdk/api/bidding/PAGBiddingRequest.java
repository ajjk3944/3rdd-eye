package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class PAGBiddingRequest {
    private PAGBannerSize ouw = null;
    private String vt = null;

    /* renamed from: lh, reason: collision with root package name */
    private String f7817lh = null;

    public String getAdxId() {
        return this.f7817lh;
    }

    public PAGBannerSize getBannerSize() {
        return this.ouw;
    }

    public String getSlotId() {
        return this.vt;
    }

    public void setAdxId(String str) {
        this.f7817lh = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.ouw = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.vt = str;
    }
}
