package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fvf {
    private static String ouw;

    public static boolean ouw() {
        if (com.bytedance.sdk.component.utils.ko.yu() && com.bytedance.sdk.openadsdk.core.bly.ouw().jg()) {
            com.bytedance.sdk.openadsdk.core.bly.ouw();
            if (com.bytedance.sdk.openadsdk.core.bly.ko()) {
                return true;
            }
        }
        return false;
    }

    public static String ouw(String str) {
        String str2;
        try {
            if (!ouw()) {
                return str;
            }
            com.bytedance.sdk.openadsdk.core.bly blyVarOuw = com.bytedance.sdk.openadsdk.core.bly.ouw();
            if (!TextUtils.isEmpty(blyVarOuw.f8048cf)) {
                str2 = blyVarOuw.f8048cf;
            } else {
                String strOuw = ryl.ouw("any_door_id", null);
                blyVarOuw.f8048cf = strOuw;
                if (!TextUtils.isEmpty(strOuw)) {
                    str2 = blyVarOuw.f8048cf;
                } else {
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    if (!TextUtils.isEmpty("any_door_id")) {
                        try {
                            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw((String) null, "any_door_id", strValueOf);
                        } catch (Throwable unused) {
                        }
                    }
                    blyVarOuw.f8048cf = strValueOf;
                    str2 = strValueOf;
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(str2)));
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            if (TextUtils.isEmpty(ouw)) {
                ouw = new String(Base64.decode("ZGV2aWNlX2lk", 0));
            }
            return builderBuildUpon.appendQueryParameter(ouw, str2).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused2) {
            return str;
        }
    }
}
