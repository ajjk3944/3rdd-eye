package com.bytedance.adsdk.ypw.xq;

/* loaded from: classes.dex */
public class ycc {
    public final float emc;
    private final String xq;
    public final float ypw;

    public ycc(String str, float f10, float f11) {
        this.xq = str;
        this.ypw = f11;
        this.emc = f10;
    }

    public boolean emc(String str) {
        if (this.xq.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.xq.endsWith("\r")) {
            String str2 = this.xq;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
