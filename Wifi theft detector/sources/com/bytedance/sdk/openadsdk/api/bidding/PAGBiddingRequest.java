package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* loaded from: classes.dex */
public class PAGBiddingRequest {
    private PAGBannerSize emc = null;
    private String ypw = null;
    private String xq = null;

    public String getAdxId() {
        return this.xq;
    }

    public PAGBannerSize getBannerSize() {
        return this.emc;
    }

    public String getSlotId() {
        return this.ypw;
    }

    public void setAdxId(String str) {
        this.xq = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.emc = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.ypw = str;
    }
}
