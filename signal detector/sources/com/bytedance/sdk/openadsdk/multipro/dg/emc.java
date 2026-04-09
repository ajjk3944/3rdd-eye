package com.bytedance.sdk.openadsdk.multipro.dg;

import A.f;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ycc.emc.ycc;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.zz;
import java.util.HashSet;

/* loaded from: classes.dex */
public class emc {
    public static HashSet<String> emc = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.dg.emc.1
        {
            add("app_id");
            add("tt_gdpr");
            add("extra_data");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static String dg() {
        return f.p(new StringBuilder(), com.bytedance.sdk.openadsdk.multipro.dg.ypw, "/t_sp/");
    }

    public static boolean emc() {
        return aa.emc() != null;
    }

    private static Context xq() {
        return aa.emc();
    }

    private static ycc ypw() {
        try {
            if (emc()) {
                return com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(aa.emc());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized void emc(String str, String str2, Boolean bool) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    ypw.emc(xq(), str, str2, bool);
                    return;
                }
                ycc yccVarYpw = ypw();
                if (yccVarYpw != null) {
                    Uri uri = Uri.parse(dg() + "boolean/" + str2 + ypw(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", bool);
                    yccVarYpw.emc(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static String ypw(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=".concat(String.valueOf(str));
    }

    public static String ypw(String str, String str2, String str3) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    return emc(xq(), str, str2, str3);
                }
                ycc yccVarYpw = ypw();
                if (yccVarYpw != null) {
                    String strEmc = yccVarYpw.emc(Uri.parse(dg() + "string/" + str2 + ypw(str)));
                    if (strEmc != null && !strEmc.equals("null")) {
                        return strEmc;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str3;
    }

    public static void ypw(String str, String str2) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    ypw.ypw(xq(), str, str2);
                    return;
                }
                ycc yccVarYpw = ypw();
                if (yccVarYpw != null) {
                    yccVarYpw.emc(Uri.parse(dg() + "long/" + str2 + ypw(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void emc(String str, String str2, String str3) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    ypw.emc(xq(), str, str2, str3);
                    return;
                }
                ycc yccVarYpw = ypw();
                if (yccVarYpw != null) {
                    Uri uri = Uri.parse(dg() + "string/" + str2 + ypw(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", str3);
                    yccVarYpw.emc(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void emc(String str, String str2, Integer num) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    ypw.emc(xq(), str, str2, num);
                    return;
                }
                ycc yccVarYpw = ypw();
                if (yccVarYpw != null) {
                    Uri uri = Uri.parse(dg() + "int/" + str2 + ypw(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", num);
                    yccVarYpw.emc(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void emc(String str, String str2, Long l2) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    ypw.emc(xq(), str, str2, l2);
                    return;
                }
                ycc yccVarYpw = ypw();
                if (yccVarYpw != null) {
                    Uri uri = Uri.parse(dg() + "long/" + str2 + ypw(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", l2);
                    yccVarYpw.emc(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String emc(Context context, String str, String str2, String str3) {
        String strEmc = emc(str, str2);
        if (zz.uym(strEmc)) {
            return com.bytedance.sdk.component.emc.emc(context, strEmc).emc(str2, str3);
        }
        SharedPreferences sharedPreferencesEmc = ypw.emc(context, strEmc);
        return sharedPreferencesEmc == null ? str3 : sharedPreferencesEmc.getString(str2, str3);
    }

    public static String emc(String str, String str2) {
        return emc.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int emc(String str, String str2, int i) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    return emc(xq(), str, str2, i);
                }
                ycc yccVarYpw = ypw();
                if (yccVarYpw != null) {
                    String strEmc = yccVarYpw.emc(Uri.parse(dg() + "int/" + str2 + ypw(str)));
                    if (strEmc != null && !strEmc.equals("null")) {
                        return Integer.parseInt(strEmc);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    public static int emc(Context context, String str, String str2, int i) {
        String strEmc = emc(str, str2);
        if (zz.uym(strEmc)) {
            return com.bytedance.sdk.component.emc.emc(context, strEmc).emc(str2, i);
        }
        SharedPreferences sharedPreferencesEmc = ypw.emc(context, strEmc);
        return sharedPreferencesEmc == null ? i : sharedPreferencesEmc.getInt(str2, i);
    }

    public static float emc(Context context, String str, String str2, float f2) {
        String strEmc = emc(str, str2);
        if (zz.uym(strEmc)) {
            return com.bytedance.sdk.component.emc.emc(context, strEmc).emc(str2, f2);
        }
        SharedPreferences sharedPreferencesEmc = ypw.emc(context, strEmc);
        return sharedPreferencesEmc == null ? f2 : sharedPreferencesEmc.getFloat(str2, f2);
    }

    public static boolean emc(String str, String str2, boolean z6) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    return emc(xq(), str, str2, z6);
                }
                ycc yccVarYpw = ypw();
                if (yccVarYpw != null) {
                    String strEmc = yccVarYpw.emc(Uri.parse(dg() + "boolean/" + str2 + ypw(str)));
                    if (strEmc != null && !strEmc.equals("null")) {
                        return Boolean.parseBoolean(strEmc);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z6;
    }

    public static boolean emc(Context context, String str, String str2, boolean z6) {
        String strEmc = emc(str, str2);
        if (zz.uym(strEmc)) {
            return com.bytedance.sdk.component.emc.emc(context, strEmc).emc(str2, z6);
        }
        SharedPreferences sharedPreferencesEmc = ypw.emc(context, strEmc);
        return sharedPreferencesEmc == null ? z6 : sharedPreferencesEmc.getBoolean(str2, z6);
    }

    public static long emc(String str, String str2, long j6) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    return emc(xq(), str, str2, j6);
                }
                ycc yccVarYpw = ypw();
                if (yccVarYpw != null) {
                    String strEmc = yccVarYpw.emc(Uri.parse(dg() + "long/" + str2 + ypw(str)));
                    if (strEmc != null && !strEmc.equals("null")) {
                        return Long.parseLong(strEmc);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return j6;
    }

    public static long emc(Context context, String str, String str2, long j6) {
        String strEmc = emc(str, str2);
        if (zz.uym(strEmc)) {
            return com.bytedance.sdk.component.emc.emc(context, strEmc).emc(str2, j6);
        }
        SharedPreferences sharedPreferencesEmc = ypw.emc(context, strEmc);
        return sharedPreferencesEmc == null ? j6 : sharedPreferencesEmc.getLong(str2, j6);
    }

    public static void emc(String str) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    ypw.ypw(xq(), str);
                    return;
                }
                ycc yccVarYpw = ypw();
                if (yccVarYpw != null) {
                    yccVarYpw.emc(Uri.parse(dg() + "clean" + ypw(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
