package com.bytedance.sdk.component.ycc.emc.emc.emc;

import android.text.TextUtils;
import android.util.Base64;

/* loaded from: classes.dex */
public class ycc {
    public static String emc(String str) {
        return TextUtils.isEmpty(str) ? "" : Base64.encodeToString(str.getBytes(), 10);
    }

    public static String ypw(String str) {
        return TextUtils.isEmpty(str) ? "" : new String(Base64.decode(str, 10));
    }
}
