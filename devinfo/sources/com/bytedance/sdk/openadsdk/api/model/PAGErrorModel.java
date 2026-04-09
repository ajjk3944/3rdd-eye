package com.bytedance.sdk.openadsdk.api.model;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class PAGErrorModel {
    private final int ouw;
    private final String vt;

    public PAGErrorModel(int i4, String str) {
        this.ouw = i4;
        this.vt = str;
    }

    public int getErrorCode() {
        return this.ouw;
    }

    public String getErrorMessage() {
        return this.vt;
    }
}
