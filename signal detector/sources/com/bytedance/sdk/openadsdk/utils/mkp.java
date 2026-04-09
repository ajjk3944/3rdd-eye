package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* loaded from: classes.dex */
public class mkp {
    private static String emc;

    public static boolean emc() {
        return com.bytedance.sdk.component.utils.cf.dg() && com.bytedance.sdk.openadsdk.core.zz.ypw().aa() && com.bytedance.sdk.openadsdk.core.zz.ypw().yzg();
    }

    public static boolean xq() {
        return false;
    }

    public static String ypw() {
        if (TextUtils.isEmpty(emc)) {
            emc = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return emc;
    }

    public static String emc(String str) {
        try {
            if (!emc()) {
                return str;
            }
            String strUl = com.bytedance.sdk.openadsdk.core.zz.ypw().ul();
            if (TextUtils.isEmpty(strUl)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(strUl)));
            return Uri.parse(str).buildUpon().appendQueryParameter(ypw(), strUl).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
