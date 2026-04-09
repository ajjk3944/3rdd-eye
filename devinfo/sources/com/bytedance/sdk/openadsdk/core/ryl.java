package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ryl {

    /* renamed from: lh, reason: collision with root package name */
    private static String f8390lh;
    private static String ouw;
    private static String vt;
    private static boolean yu;

    @SuppressLint({"HardwareIds"})
    private static void fkw(Context context) {
        if (yu || yu(context) == null) {
            return;
        }
        vt = String.valueOf(Build.TIME);
        lh.ouw();
        f8390lh = lh.vt("uuid", (String) null);
        yu = true;
    }

    public static String ouw(Context context) {
        if (!TextUtils.isEmpty(ouw)) {
            return ouw;
        }
        if (yu(context) != null) {
            lh.ouw();
            String strVt = lh.vt("abcd", (String) null);
            if (!TextUtils.isEmpty(strVt)) {
                try {
                    JSONObject jSONObject = new JSONObject(strVt);
                    int iOptInt = jSONObject.optInt("cypher", -1);
                    String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
                    if (iOptInt == 3) {
                        String strVt2 = com.bytedance.sdk.component.utils.ouw.vt(strOptString);
                        if (!TextUtils.isEmpty(strVt2)) {
                            ouw = new JSONObject(strVt2).optString("abcd");
                            ouw();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return ouw;
    }

    public static String vt(Context context) {
        if (vt == null && !yu) {
            synchronized (ryl.class) {
                try {
                    if (!yu) {
                        fkw(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vt;
    }

    private static Context yu(Context context) {
        return context == null ? zih.ouw() : context;
    }

    public static String lh(Context context) {
        if (TextUtils.isEmpty(f8390lh) && !yu) {
            synchronized (ryl.class) {
                try {
                    if (!yu) {
                        fkw(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f8390lh;
    }

    public static String vt() {
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

    public static void ouw(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(ouw)) {
                ouw = str;
            }
            ouw();
        }
        if (TextUtils.isEmpty(ouw)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.tlj.lh.vt(ouw);
        cf.ouw(ouw);
    }

    public static void ouw() {
        if (TextUtils.isEmpty(ouw)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.bs.vt(new com.bytedance.sdk.component.pno.pno("update_did") { // from class: com.bytedance.sdk.openadsdk.core.ryl.1
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", ryl.ouw);
                    lh.ouw();
                    lh.ouw("abcd", com.bytedance.sdk.component.utils.ouw.ouw(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }
}
