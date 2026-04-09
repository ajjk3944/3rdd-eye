package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* loaded from: classes.dex */
public final class emc {
    private static final String emc = xq();
    private static final String ypw = aa.dg().bw();

    public static String emc() {
        return new String(Base64.decode(emc, 0)).substring(2);
    }

    private static String xq() {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i = 23; i >= 0; i--) {
            cArr2[23 - i] = (char) (cArr[i] ^ 255);
        }
        return new String(cArr2);
    }

    public static String ypw() {
        return new String(Base64.decode(ypw, 0)).substring(2);
    }
}
