package com.bytedance.sdk.openadsdk.core;

/* loaded from: classes.dex */
public class xq {
    private static volatile xq emc;

    private xq() {
    }

    public static xq emc() {
        if (emc == null) {
            synchronized (xq.class) {
                try {
                    if (emc == null) {
                        emc = new xq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public String ypw(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("ttopenadsdk", str, str2);
    }

    public int ypw(String str, int i10) {
        return com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("ttopenadsdk", str, i10);
    }

    public Long ypw(String str, long j10) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("ttopenadsdk", str, j10));
    }

    public void emc(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("ttopenadsdk", str, str2);
    }

    public void emc(String str, int i10) {
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("ttopenadsdk", str, Integer.valueOf(i10));
    }

    public void emc(String str, long j10) {
        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("ttopenadsdk", str, Long.valueOf(j10));
    }
}
