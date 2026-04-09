package com.bytedance.sdk.openadsdk;

/* loaded from: classes.dex */
public class TTImage {
    private double dg;
    private final int emc;
    private final String xq;
    private final int ypw;

    public TTImage(int i, int i3, String str, double d6) {
        this.emc = i;
        this.ypw = i3;
        this.xq = str;
        this.dg = d6;
    }

    public double getDuration() {
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

    public boolean isValid() {
        String str;
        return this.emc > 0 && this.ypw > 0 && (str = this.xq) != null && str.length() > 0;
    }

    public TTImage(int i, int i3, String str) {
        this(i, i3, str, 0.0d);
    }
}
