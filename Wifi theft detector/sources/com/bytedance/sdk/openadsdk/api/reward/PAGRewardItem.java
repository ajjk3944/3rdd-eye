package com.bytedance.sdk.openadsdk.api.reward;

/* loaded from: classes.dex */
public class PAGRewardItem {
    private final int emc;
    private final String ypw;

    public PAGRewardItem(int i10, String str) {
        this.emc = i10;
        this.ypw = str;
    }

    public int getRewardAmount() {
        return this.emc;
    }

    public String getRewardName() {
        return this.ypw;
    }
}
