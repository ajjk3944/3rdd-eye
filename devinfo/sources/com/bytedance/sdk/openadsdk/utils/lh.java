package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    public static int ouw = -1;

    public static int ouw(Context context, int i4) {
        int iOuw = ouw(context);
        if (iOuw == -1) {
            return ouw;
        }
        return Math.max(Math.min(i4 > 655 ? Math.round((i4 / 728.0f) * 90.0f) : i4 > 632 ? 81 : i4 > 526 ? Math.round((i4 / 468.0f) * 60.0f) : i4 > 432 ? 68 : Math.round((i4 / 320.0f) * 50.0f), Math.min(90, Math.round(iOuw * 0.15f))), 50);
    }

    public static int ouw(Context context) {
        DisplayMetrics displayMetrics;
        if (context != null) {
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && resources.getConfiguration() != null) {
                    return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                }
            } catch (Throwable unused) {
                return ouw;
            }
        }
        return ouw;
    }
}
