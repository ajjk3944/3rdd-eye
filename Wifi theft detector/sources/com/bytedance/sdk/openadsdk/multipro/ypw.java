package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* loaded from: classes.dex */
public class ypw {
    public static Boolean emc;

    public static void emc() {
        Boolean bool = Boolean.TRUE;
        emc = bool;
        com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_info", "is_support_multi_process", bool);
    }

    public static boolean xq() {
        Boolean bool = emc;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!qh.bw()) {
            return false;
        }
        if (emc == null) {
            emc = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_info", "is_support_multi_process", false));
        }
        return emc.booleanValue();
    }

    public static void ypw() {
        emc = Boolean.FALSE;
        BinderPoolService.emc = true;
    }
}
