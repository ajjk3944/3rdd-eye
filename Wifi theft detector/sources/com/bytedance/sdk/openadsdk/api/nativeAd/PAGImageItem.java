package com.bytedance.sdk.openadsdk.api.nativeAd;

/* loaded from: classes.dex */
public class PAGImageItem {
    private float dg;
    private final int emc;
    private final String xq;
    private final int ypw;

    public PAGImageItem(int i10, int i11, String str, float f10) {
        this.emc = i10;
        this.ypw = i11;
        this.xq = str;
        this.dg = f10;
    }

    public float getDuration() {
        return this.dg;
    }

    public int getHeight() {
        return this.emc;
    }

    public String getImageUrl() {
        return this.xq;
    }

    public int getWidth() {
        return this.ypw;
    }

    public PAGImageItem(int i10, int i11, String str) {
        this(i10, i11, str, 0.0f);
    }
}
