package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class ypw {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.rie> emc;
    private static Boolean xq;
    private static Boolean ypw;

    public static boolean emc() {
        try {
            if (ypw == null) {
                boolean z10 = true;
                if (com.bytedance.sdk.openadsdk.sra.emc.emc("enable_get_ad_new", 0) != 1) {
                    z10 = false;
                }
                ypw = Boolean.valueOf(z10);
            }
            return ypw.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.rie xq() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.rie> softReference = emc;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static boolean ypw() {
        try {
            if (xq == null) {
                boolean z10 = true;
                if (com.bytedance.sdk.openadsdk.sra.emc.emc("iv_rv_load_show_new", 0) != 1) {
                    z10 = false;
                }
                xq = Boolean.valueOf(z10);
            }
            return xq.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (rieVar == null) {
            return;
        }
        emc = new SoftReference<>(rieVar);
    }
}
