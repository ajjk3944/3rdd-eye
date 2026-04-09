package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sup {
    private static boolean dg;
    private static String emc;
    private static String xq;
    private static String ypw;

    @RequiresPermission(anyOf = {"android.permission.ACCESS_WIFI_STATE"})
    @SuppressLint({"HardwareIds"})
    private static void bw(Context context) {
        if (dg || dg(context) == null) {
            return;
        }
        ypw = String.valueOf(Build.TIME);
        xq = xq.emc().ypw("uuid", (String) null);
        dg = true;
    }

    private static Context dg(Context context) {
        return context == null ? aa.emc() : context;
    }

    public static String emc(Context context) {
        if (!TextUtils.isEmpty(emc)) {
            return emc;
        }
        ycc(context);
        return emc;
    }

    private static void ycc(Context context) {
        if (dg(context) == null) {
            return;
        }
        String strYpw = xq.emc().ypw("abcd", (String) null);
        if (TextUtils.isEmpty(strYpw)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strYpw);
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            if (iOptInt == 3) {
                String strXq = com.bytedance.sdk.component.utils.emc.xq(strOptString);
                if (TextUtils.isEmpty(strXq)) {
                    return;
                }
                emc = new JSONObject(strXq).optString("abcd");
                emc();
            }
        } catch (Throwable unused) {
        }
    }

    public static String ypw(Context context) {
        if (ypw == null && !dg) {
            synchronized (sup.class) {
                try {
                    if (!dg) {
                        bw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ypw;
    }

    public static String xq(Context context) {
        if (TextUtils.isEmpty(xq) && !dg) {
            synchronized (sup.class) {
                try {
                    if (!dg) {
                        bw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return xq;
    }

    public static void emc(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(emc)) {
                emc = str;
            }
            emc();
        }
        if (TextUtils.isEmpty(emc)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ru.xq.ypw(emc);
        gbl.emc(emc);
    }

    public static String ypw() {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(string)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void emc() {
        if (TextUtils.isEmpty(emc)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.iyl.ypw(new com.bytedance.sdk.component.msw.msw("update_did") { // from class: com.bytedance.sdk.openadsdk.core.sup.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", sup.emc);
                    xq.emc().emc("abcd", com.bytedance.sdk.component.utils.emc.emc(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }
}
