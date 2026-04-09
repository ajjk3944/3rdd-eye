package com.bytedance.adsdk.ugeno.ra;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {

    /* renamed from: lh, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f6951lh;
    private static String ouw;
    private static Resources vt;

    public static void ouw(String str) {
        ouw = str;
    }

    public static int vt(Context context, String str) {
        return ouw(context, str, "drawable");
    }

    private static int ouw(Context context, String str, String str2) {
        if (vt == null) {
            vt = context.getResources();
        }
        Resources resources = vt;
        if (ouw == null) {
            ouw = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, ouw);
    }

    public static int ouw(Context context, String str) {
        return ouw(context, str, "raw");
    }
}
