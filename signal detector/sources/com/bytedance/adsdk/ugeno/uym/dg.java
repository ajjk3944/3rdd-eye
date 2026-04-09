package com.bytedance.adsdk.ugeno.uym;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class dg {
    private static String emc;

    @SuppressLint({"StaticFieldLeak"})
    private static Context xq;
    private static Resources ypw;

    public static void emc(String str) {
        emc = str;
    }

    public static int ypw(Context context, String str) {
        return emc(context, str, "drawable");
    }

    private static String emc(Context context) {
        if (emc == null) {
            emc = context.getPackageName();
        }
        return emc;
    }

    private static int emc(Context context, String str, String str2) {
        if (ypw == null) {
            ypw = context.getResources();
        }
        return ypw.getIdentifier(str, str2, emc(context));
    }

    public static int emc(Context context, String str) {
        return emc(context, str, "raw");
    }
}
