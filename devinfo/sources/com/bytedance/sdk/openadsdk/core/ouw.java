package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    private static final String ouw;
    private static final String vt;

    static {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i4 = 23; i4 >= 0; i4--) {
            cArr2[23 - i4] = (char) (cArr[i4] ^ 255);
        }
        ouw = new String(cArr2);
        vt = zih.yu().pno.ouw("aes_key", "");
    }

    public static String ouw() {
        return new String(Base64.decode(ouw, 0)).substring(2);
    }

    public static String vt() {
        return new String(Base64.decode(vt, 0)).substring(2);
    }
}
