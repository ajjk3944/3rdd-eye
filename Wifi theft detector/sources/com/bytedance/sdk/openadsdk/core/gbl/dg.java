package com.bytedance.sdk.openadsdk.core.gbl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.gbl;

/* loaded from: classes.dex */
public class dg {
    public static String emc(String str) {
        return TextUtils.isEmpty(str) ? str : emc(gbl.xq().ylm(), str);
    }

    public static String emc(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith("http://") || str2.startsWith("https://")) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            return str + "/static/" + str2;
        }
        return str + "static/" + str2;
    }
}
