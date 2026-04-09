package com.bytedance.sdk.openadsdk.common;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ksc;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    private static String ouw;

    public static String ouw() {
        int iOuw = ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
        return iOuw != 2 ? iOuw != 3 ? iOuw != 4 ? iOuw != 5 ? iOuw != 6 ? "mobile" : "5g" : "4g" : "wifi" : "3g" : "2g";
    }

    public static String vt() {
        try {
            if (!TextUtils.isEmpty(ouw)) {
                return ouw;
            }
            String strOuw = com.bytedance.sdk.openadsdk.core.bly.ouw("sdk_app_sha1", 259200000L);
            ouw = strOuw;
            if (ouw(strOuw)) {
                return ouw;
            }
            String strOuw2 = com.bytedance.sdk.component.utils.lh.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw());
            ouw = strOuw2;
            if (!ouw(strOuw2)) {
                return "";
            }
            String upperCase = ouw.toUpperCase();
            ouw = upperCase;
            com.bytedance.sdk.openadsdk.core.bly.ouw("sdk_app_sha1", upperCase);
            return ouw;
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean ouw(String str) {
        String[] strArrSplit;
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(":")) != null && strArrSplit.length >= 20) {
            for (String str2 : strArrSplit) {
                if (!"00".equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
