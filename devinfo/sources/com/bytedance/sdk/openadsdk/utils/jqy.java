package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jqy {
    public static boolean ouw() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33) {
            return i4 >= 32 && ouw("T", Build.VERSION.CODENAME);
        }
        return true;
    }

    private static boolean ouw(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }
}
