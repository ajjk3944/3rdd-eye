package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class rie {
    private static boolean bw = false;
    private static String dg = null;

    @SuppressLint({"StaticFieldLeak"})
    private static Context emc = null;
    private static Resources xq = null;
    private static boolean ycc = false;
    private static String ypw;

    public static int bw(Context context, String str) {
        return emc(context, str, "id");
    }

    private static String dg(Context context) {
        if (dg == null) {
            dg = context.getPackageName();
        }
        return dg;
    }

    public static void emc(Context context) {
        emc = context;
    }

    public static int msw(Context context, String str) {
        return emc(context, str, TtmlNode.ATTR_TTS_COLOR);
    }

    public static int uym(Context context, String str) {
        return ypw(context).getColor(msw(context, str));
    }

    public static Drawable xq(Context context, String str) {
        try {
            return ypw(context).getDrawable(dg(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int ycc(Context context, String str) {
        return emc(context, str, TtmlNode.TAG_STYLE);
    }

    public static int ypw(Context context, String str) {
        return emc(context, str, "string");
    }

    public static int zz(Context context, String str) {
        return emc(context, str, "anim");
    }

    public static void emc(String str) {
        dg = str;
    }

    public static Resources ypw(Context context) {
        Resources resources = xq;
        if (resources == null) {
            resources = null;
        }
        Context context2 = emc;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    private static int emc(Context context, String str, String str2) {
        int identifier = ypw(context).getIdentifier(str, str2, dg(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!bw) {
            xq(context);
            return ypw(context).getIdentifier(str, str2, dg(context));
        }
        return context.getResources().getIdentifier(str, str2, dg(context));
    }

    public static synchronized void xq(Context context) {
        try {
            if (TextUtils.isEmpty(ypw)) {
                return;
            }
            bw = true;
        } catch (Throwable th) {
            Log.e("ResourceHelp", "makePluginResources failed", th);
        }
    }

    public static int dg(Context context, String str) {
        try {
            return emc(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String emc(Context context, String str) {
        return ypw(context).getString(ypw(context, str));
    }
}
