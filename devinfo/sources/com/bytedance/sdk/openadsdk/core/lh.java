package com.bytedance.sdk.openadsdk.core;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh {
    private static volatile lh ouw;

    private lh() {
    }

    public static lh ouw() {
        if (ouw == null) {
            synchronized (lh.class) {
                try {
                    if (ouw == null) {
                        ouw = new lh();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }

    public static String vt(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("ttopenadsdk", str, str2);
    }

    public static int vt(String str, int i4) {
        return com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", str, i4);
    }

    public static void ouw(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", str, str2);
    }

    public static void ouw(String str, int i4) {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", str, Integer.valueOf(i4));
    }

    public static void ouw(String str, long j) {
        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", str, Long.valueOf(j));
    }

    public static Long ouw(String str) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("ttopenadsdk", str, 0L));
    }
}
