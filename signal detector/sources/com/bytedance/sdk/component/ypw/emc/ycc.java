package com.bytedance.sdk.component.ypw.emc;

/* loaded from: classes.dex */
public final class ycc {
    private final String[] emc;

    public ycc(String[] strArr) {
        this.emc = strArr;
    }

    public int emc() {
        return this.emc.length / 2;
    }

    public String ypw(int i) {
        return this.emc[(i * 2) + 1];
    }

    public String emc(int i) {
        return this.emc[i * 2];
    }
}
