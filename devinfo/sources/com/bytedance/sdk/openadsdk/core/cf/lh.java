package com.bytedance.sdk.openadsdk.core.cf;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    public static String ouw(String str) {
        return TextUtils.isEmpty(str) ? str : ouw(cf.vt().tlj(), str);
    }

    public static String ouw(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith("http://") || str2.startsWith("https://")) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            return h.E(str, "/static/", str2);
        }
        return h.E(str, "static/", str2);
    }
}
