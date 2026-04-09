package com.bytedance.sdk.openadsdk.api.nativeAd;

/* loaded from: classes.dex */
public class PAGImageItem {
    private float dg;
    private final int emc;
    private final String xq;
    private final int ypw;

    public PAGImageItem(int i, int i3, String str, float f2) {
        this.emc = i;
        this.ypw = i3;
        this.xq = str;
        this.dg = f2;
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

    public PAGImageItem(int i, int i3, String str) {
        this(i, i3, str, 0.0f);
    }
}
