package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class sup {
    public static void emc(String str) {
        emc("any_door_id", str);
    }

    private static String ypw(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static String emc() {
        return ypw("any_door_id", null);
    }

    private static void emc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
