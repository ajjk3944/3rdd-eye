package com.bytedance.sdk.openadsdk.multipro.dg;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.emc;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.zz;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class ypw {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> emc;

    public static SharedPreferences emc(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(emc(str), 0);
        } catch (Throwable th) {
            ul.xq("SPMultiHelperImpl", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    public static Map<String, ?> xq(Context context, String str) {
        SharedPreferences sharedPreferencesEmc = emc(context, str);
        if (sharedPreferencesEmc == null) {
            return null;
        }
        return sharedPreferencesEmc.getAll();
    }

    private static void ypw(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = emc;
        if (softReference == null || softReference.get() == null || (map = emc.get().get(emc(str))) == null) {
            return;
        }
        map.clear();
    }

    private static String emc(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object emc(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = emc;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(emc(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static Object ypw(Context context, String str, String str2, String str3) {
        String strEmc = emc(str);
        if (!emc(context, strEmc, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase("string")) {
            return emc.emc(context, strEmc, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(emc.emc(context, strEmc, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(emc.emc(context, strEmc, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(emc.emc(context, strEmc, str2, 0L));
        }
        if (str3.equalsIgnoreCase("float")) {
            return Float.valueOf(emc.emc(context, strEmc, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return emc.emc(context, strEmc, str2, (String) null);
        }
        return null;
    }

    private static void emc(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = emc;
        if (softReference == null || softReference.get() == null) {
            emc = new SoftReference<>(new ConcurrentHashMap());
        }
        String strEmc = emc(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = emc.get();
        if (concurrentHashMap.get(strEmc) == null) {
            concurrentHashMap.put(strEmc, new HashMap());
        }
        concurrentHashMap.get(strEmc).put(str2, obj);
    }

    public static synchronized <T> void emc(Context context, String str, String str2, T t6) {
        String strEmc = emc.emc(str, str2);
        if (zz.uym(strEmc)) {
            com.bytedance.sdk.component.emc emcVarEmc = com.bytedance.sdk.component.emc.emc(context, strEmc);
            if (t6.equals(emc(strEmc, str2))) {
                return;
            }
            emc.xq xqVarYpw = emcVarEmc.ypw();
            emc(xqVarYpw, str2, (Object) t6);
            xqVarYpw.apply();
            emc(strEmc, str2, t6);
            return;
        }
        SharedPreferences sharedPreferencesEmc = emc(context, strEmc);
        if (sharedPreferencesEmc == null) {
            return;
        }
        if (t6.equals(emc(strEmc, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesEmc.edit();
        emc(editorEdit, str2, t6);
        editorEdit.apply();
        emc(strEmc, str2, t6);
    }

    public static void ypw(Context context, String str, String str2) {
        try {
            String strEmc = emc.emc(str, str2);
            if (zz.uym(strEmc)) {
                com.bytedance.sdk.component.emc.emc(context, strEmc).ypw().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesEmc = emc(context, strEmc);
            if (sharedPreferencesEmc == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesEmc.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = emc;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = emc.get().get(emc(strEmc));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void ypw(Context context, String str) {
        if (zz.uym(str)) {
            com.bytedance.sdk.component.emc.emc(context, str).ypw().clear().apply();
            ypw(str);
            return;
        }
        SharedPreferences sharedPreferencesEmc = emc(context, str);
        if (sharedPreferencesEmc == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesEmc.edit();
        editorEdit.clear();
        editorEdit.apply();
        ypw(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void emc(SharedPreferences.Editor editor, String str, T t6) {
        if (t6 instanceof Integer) {
            editor.putInt(str, ((Integer) t6).intValue());
        }
        if (t6 instanceof Long) {
            editor.putLong(str, ((Long) t6).longValue());
        }
        if (t6 instanceof Float) {
            editor.putFloat(str, ((Float) t6).floatValue());
        }
        if (t6 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t6).booleanValue());
        }
        if (t6 instanceof String) {
            editor.putString(str, (String) t6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void emc(emc.xq xqVar, String str, T t6) {
        if (t6 instanceof Integer) {
            xqVar.putInt(str, ((Integer) t6).intValue());
        }
        if (t6 instanceof Long) {
            xqVar.putLong(str, ((Long) t6).longValue());
        }
        if (t6 instanceof Float) {
            xqVar.putFloat(str, ((Float) t6).floatValue());
        }
        if (t6 instanceof Boolean) {
            xqVar.putBoolean(str, ((Boolean) t6).booleanValue());
        }
        if (t6 instanceof String) {
            xqVar.putString(str, (String) t6);
        }
    }

    public static String emc(Context context, String str, String str2, String str3) {
        Object objEmc = emc(str, str2);
        if (objEmc != null) {
            return String.valueOf(objEmc);
        }
        Object objYpw = ypw(context, str, str2, str3);
        emc(str, str2, objYpw);
        return String.valueOf(objYpw);
    }

    public static boolean emc(Context context, String str, String str2) {
        String strEmc = emc.emc(str, str2);
        if (zz.uym(strEmc)) {
            return com.bytedance.sdk.component.emc.emc(context, strEmc).emc(str2);
        }
        SharedPreferences sharedPreferencesEmc = emc(context, strEmc);
        return sharedPreferencesEmc != null && sharedPreferencesEmc.contains(str2);
    }
}
