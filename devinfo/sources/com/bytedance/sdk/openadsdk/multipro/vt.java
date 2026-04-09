package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public static Boolean ouw;

    public static boolean lh() {
        Boolean bool = ouw;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!jg.fkw()) {
            return false;
        }
        if (ouw == null) {
            ouw = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_info", "is_support_multi_process", false));
        }
        return ouw.booleanValue();
    }

    public static void ouw() {
        Boolean bool = Boolean.TRUE;
        ouw = bool;
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_info", "is_support_multi_process", bool);
    }

    public static void vt() {
        ouw = Boolean.FALSE;
        BinderPoolService.ouw = true;
    }
}
