package com.bytedance.sdk.component.adexpress.dg;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.rie;
import java.util.Locale;

/* loaded from: classes.dex */
public class uym {
    private static float dg(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int emc(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static float xq(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().ypw();
        }
        return f10 * dg(context);
    }

    public static int ypw(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().ypw();
        }
        float fDg = dg(context);
        if (fDg <= 0.0f) {
            fDg = 1.0f;
        }
        return (int) ((f10 / fDg) + 0.5f);
    }

    public static float emc(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().ypw();
        }
        return (f10 * dg(context)) + 0.5f;
    }

    public static String xq(@NonNull Context context) {
        String language;
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = rie.ypw(context).getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        return emc(language);
    }

    public static int ypw(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().ypw();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int emc(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().ypw();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String emc(String str) {
        str.getClass();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
