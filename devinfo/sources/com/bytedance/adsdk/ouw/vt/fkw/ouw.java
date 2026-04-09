package com.bytedance.adsdk.ouw.vt.fkw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static boolean ouw(char c9) {
        if (c9 < 'A' || c9 > 'Z') {
            return c9 >= 'a' && c9 <= 'z';
        }
        return true;
    }

    public static boolean vt(char c9) {
        return c9 >= '0' && c9 <= '9';
    }
}
