package com.bytedance.sdk.openadsdk.multipro.dg;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ycc.emc.ycc;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.zz;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashSet;

/* loaded from: classes.dex */
public class emc {
    public static HashSet<String> emc = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.dg.emc.1
        {
            add(MBridgeConstans.APP_ID);
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
        return com.bytedance.sdk.openadsdk.multipro.dg.ypw + "/t_sp/";
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
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool);
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
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str3);
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
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, num);
                    yccVarYpw.emc(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void emc(String str, String str2, Long l10) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    ypw.emc(xq(), str, str2, l10);
                    return;
                }
                ycc yccVarYpw = ypw();
                if (yccVarYpw != null) {
                    Uri uri = Uri.parse(dg() + "long/" + str2 + ypw(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, l10);
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

    public static int emc(String str, String str2, int i10) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    return emc(xq(), str, str2, i10);
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
        return i10;
    }

    public static int emc(Context context, String str, String str2, int i10) {
        String strEmc = emc(str, str2);
        if (zz.uym(strEmc)) {
            return com.bytedance.sdk.component.emc.emc(context, strEmc).emc(str2, i10);
        }
        SharedPreferences sharedPreferencesEmc = ypw.emc(context, strEmc);
        return sharedPreferencesEmc == null ? i10 : sharedPreferencesEmc.getInt(str2, i10);
    }

    public static float emc(Context context, String str, String str2, float f10) {
        String strEmc = emc(str, str2);
        if (zz.uym(strEmc)) {
            return com.bytedance.sdk.component.emc.emc(context, strEmc).emc(str2, f10);
        }
        SharedPreferences sharedPreferencesEmc = ypw.emc(context, strEmc);
        return sharedPreferencesEmc == null ? f10 : sharedPreferencesEmc.getFloat(str2, f10);
    }

    public static boolean emc(String str, String str2, boolean z10) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    return emc(xq(), str, str2, z10);
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
        return z10;
    }

    public static boolean emc(Context context, String str, String str2, boolean z10) {
        String strEmc = emc(str, str2);
        if (zz.uym(strEmc)) {
            return com.bytedance.sdk.component.emc.emc(context, strEmc).emc(str2, z10);
        }
        SharedPreferences sharedPreferencesEmc = ypw.emc(context, strEmc);
        return sharedPreferencesEmc == null ? z10 : sharedPreferencesEmc.getBoolean(str2, z10);
    }

    public static long emc(String str, String str2, long j10) {
        if (emc()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    return emc(xq(), str, str2, j10);
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
        return j10;
    }

    public static long emc(Context context, String str, String str2, long j10) {
        String strEmc = emc(str, str2);
        if (zz.uym(strEmc)) {
            return com.bytedance.sdk.component.emc.emc(context, strEmc).emc(str2, j10);
        }
        SharedPreferences sharedPreferencesEmc = ypw.emc(context, strEmc);
        return sharedPreferencesEmc == null ? j10 : sharedPreferencesEmc.getLong(str2, j10);
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
