package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.tp;

/* loaded from: classes.dex */
public class xq {
    private static String emc;

    public static String bw() {
        return com.bytedance.sdk.openadsdk.core.zz.ypw().msw();
    }

    public static String dg() {
        return tp.msw();
    }

    public static String emc() {
        return "open_news";
    }

    public static String uym() {
        try {
            if (!TextUtils.isEmpty(emc)) {
                return emc;
            }
            String strEmc = com.bytedance.sdk.openadsdk.core.zz.emc("sdk_app_sha1", 259200000L);
            emc = strEmc;
            if (emc(strEmc)) {
                return emc;
            }
            String strEmc2 = com.bytedance.sdk.component.utils.xq.emc(com.bytedance.sdk.openadsdk.core.aa.emc());
            emc = strEmc2;
            if (!emc(strEmc2)) {
                return "";
            }
            String upperCase = emc.toUpperCase();
            emc = upperCase;
            com.bytedance.sdk.openadsdk.core.zz.emc("sdk_app_sha1", upperCase);
            return emc;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String xq() {
        return BuildConfig.VERSION_NAME;
    }

    public static String ycc() {
        return com.bytedance.sdk.component.utils.sba.uym(com.bytedance.sdk.openadsdk.core.aa.emc());
    }

    public static String ypw() {
        return "1371";
    }

    public static String emc(Context context) {
        return com.bytedance.sdk.openadsdk.core.sup.emc(context);
    }

    private static boolean emc(String str) {
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
