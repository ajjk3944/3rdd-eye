package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl {
    public static String ouw(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.yu.yu.vt(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
