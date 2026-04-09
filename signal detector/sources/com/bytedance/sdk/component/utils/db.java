package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class db {
    private static volatile String emc;

    public static String emc() {
        if (!TextUtils.isEmpty(emc)) {
            return emc;
        }
        String str = Build.MODEL;
        emc = str;
        return str;
    }

    public static int emc(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception unused) {
            return 0;
        }
    }
}
