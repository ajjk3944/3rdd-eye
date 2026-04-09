package com.bytedance.sdk.openadsdk.api.model;

/* loaded from: classes.dex */
public class PAGErrorModel {
    private final int emc;
    private final String ypw;

    public PAGErrorModel(int i10, String str) {
        this.emc = i10;
        this.ypw = str;
    }

    public int getErrorCode() {
        return this.emc;
    }

    public String getErrorMessage() {
        return this.ypw;
    }
}
