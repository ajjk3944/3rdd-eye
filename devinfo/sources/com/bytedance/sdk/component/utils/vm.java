package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vm {
    public static boolean ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean vt(Context context) {
        if (context == null) {
            return false;
        }
        int iOuw = ksc.ouw(context, 60000L);
        return iOuw == 2 || iOuw == 3 || iOuw == 4 || iOuw == 5 || iOuw == 6;
    }

    public static boolean ouw(Context context) {
        return ksc.ouw(context, 60000L) == 4;
    }
}
