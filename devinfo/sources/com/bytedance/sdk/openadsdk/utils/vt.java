package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.vpp> ouw;
    private static Boolean vt;

    public static boolean ouw() {
        try {
            if (vt == null) {
                boolean z3 = true;
                if (com.bytedance.sdk.openadsdk.vpp.ouw.ouw("enable_get_ad_new", 0) != 1) {
                    z3 = false;
                }
                vt = Boolean.valueOf(z3);
            }
            return vt.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.vpp vt() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.vpp> softReference = ouw;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (vppVar == null) {
            return;
        }
        ouw = new SoftReference<>(vppVar);
    }
}
