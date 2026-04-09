package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vpp {
    private static boolean fkw = false;

    /* renamed from: le, reason: collision with root package name */
    private static boolean f7637le = false;

    /* renamed from: lh, reason: collision with root package name */
    private static Resources f7638lh;

    @SuppressLint({"StaticFieldLeak"})
    private static Context ouw;
    private static String vt;
    private static String yu;

    public static int fkw(Context context, String str) {
        return ouw(context, str, FacebookMediationAdapter.KEY_ID);
    }

    public static int le(Context context, String str) {
        return ouw(context, str, "style");
    }

    private static String lh(Context context) {
        if (yu == null) {
            yu = context.getPackageName();
        }
        return yu;
    }

    public static void ouw(Context context) {
        ouw = context;
    }

    public static int pno(Context context, String str) {
        return ouw(context, str, "anim");
    }

    public static int ra(Context context, String str) {
        return vt(context).getColor(ouw(context, str, "color"));
    }

    public static int vt(Context context, String str) {
        return ouw(context, str, "string");
    }

    public static int yu(Context context, String str) {
        try {
            return ouw(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void ouw(String str) {
        yu = str;
    }

    public static Resources vt(Context context) {
        Resources resources = f7638lh;
        if (resources == null) {
            resources = null;
        }
        Context context2 = ouw;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    private static int ouw(Context context, String str, String str2) {
        int identifier = vt(context).getIdentifier(str, str2, lh(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!fkw) {
            ouw();
            return vt(context).getIdentifier(str, str2, lh(context));
        }
        return context.getResources().getIdentifier(str, str2, lh(context));
    }

    public static Drawable lh(Context context, String str) {
        try {
            return vt(context).getDrawable(yu(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    private static synchronized void ouw() {
        try {
            if (TextUtils.isEmpty(vt)) {
                return;
            }
            fkw = true;
        } catch (Throwable th2) {
            Log.e("ResourceHelp", "makePluginResources failed", th2);
        }
    }

    public static String ouw(Context context, String str) {
        return vt(context).getString(ouw(context, str, "string"));
    }
}
