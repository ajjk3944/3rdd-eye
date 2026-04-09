package com.bytedance.adsdk.ypw.dg;

/* loaded from: classes.dex */
public enum xq {
    JSON(".json"),
    ZIP(".zip");

    public final String xq;

    xq(String str) {
        this.xq = str;
    }

    public String emc() {
        return ".temp" + this.xq;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.xq;
    }
}
