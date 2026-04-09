package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.d6;
import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a5 {

    /* renamed from: b, reason: collision with root package name */
    private static com.applovin.impl.sdk.k f3587b;

    /* renamed from: c, reason: collision with root package name */
    private static SharedPreferences f3588c;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f3589a;

    public a5(com.applovin.impl.sdk.k kVar) {
        this.f3589a = com.applovin.impl.sdk.k.o().getSharedPreferences("com.applovin.sdk.preferences." + kVar.i0(), 0);
        f3587b = kVar;
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        a(str, obj, (SharedPreferences) null, editor);
    }

    public void b(z4 z4Var, Object obj) {
        b(z4Var, obj, this.f3589a);
    }

    public void a(String str, Object obj, SharedPreferences sharedPreferences) {
        a(str, obj, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public void b(z4 z4Var, Object obj, SharedPreferences sharedPreferences) {
        a(z4Var.a(), obj, sharedPreferences);
    }

    public static void a(String str, Object obj, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z3 = editor != null;
        if (!z3) {
            editor = sharedPreferences.edit();
        }
        if (obj != null) {
            if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editor.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                editor.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                editor.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
            } else if (obj instanceof String) {
                editor.putString(str, (String) obj);
            } else if (obj instanceof Set) {
                editor.putStringSet(str, (Set) obj);
            } else {
                com.applovin.impl.sdk.o.h("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj);
                return;
            }
        } else {
            editor.remove(str);
        }
        if (z3) {
            return;
        }
        a(editor);
    }

    public static void b(z4 z4Var, Object obj, Context context) {
        a(z4Var.a(), obj, a(context), (SharedPreferences.Editor) null);
    }

    public void b(z4 z4Var) {
        a(this.f3589a.edit().remove(z4Var.a()));
    }

    public Object a(z4 z4Var, Object obj) {
        return a(z4Var, obj, this.f3589a);
    }

    public Object a(z4 z4Var, Object obj, SharedPreferences sharedPreferences) {
        return a(z4Var.a(), obj, z4Var.b(), sharedPreferences);
    }

    public static Object a(z4 z4Var, Object obj, Context context) {
        return a(z4Var.a(), obj, z4Var.b(), a(context));
    }

    public static Object a(z4 z4Var, Object obj, SharedPreferences sharedPreferences, boolean z3) {
        return a(z4Var.a(), obj, z4Var.b(), sharedPreferences, z3);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a(str, obj, cls, sharedPreferences, true);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences, boolean z3) {
        Object stringSet;
        long jLongValue;
        int iIntValue;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                return obj;
            }
            if (Boolean.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
                } else {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                }
            } else if (Float.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
                } else {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
                }
            } else if (Integer.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Long.class)) {
                        iIntValue = ((Long) obj).intValue();
                    } else {
                        iIntValue = ((Integer) obj).intValue();
                    }
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, iIntValue));
                } else {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, 0));
                }
            } else if (Long.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Integer.class)) {
                        jLongValue = ((Integer) obj).longValue();
                    } else {
                        jLongValue = ((Long) obj).longValue();
                    }
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, jLongValue));
                } else {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, 0L));
                }
            } else if (Double.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()))));
                } else {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                }
            } else if (String.class.equals(cls)) {
                stringSet = sharedPreferences.getString(str, (String) obj);
            } else {
                stringSet = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) obj) : obj;
            }
            return stringSet != null ? cls.cast(stringSet) : obj;
        } catch (Throwable th2) {
            if (z3) {
                try {
                    com.applovin.impl.sdk.o.c("SharedPreferencesManager", "Error getting value for key: " + str, th2);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            return obj;
        }
    }

    public Object a(z4 z4Var) {
        Object objA = a(z4Var, null);
        b(z4Var);
        return objA;
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public static void a(SharedPreferences.Editor editor) {
        try {
            if (n7.i()) {
                com.applovin.impl.sdk.k kVar = f3587b;
                if (kVar != null && kVar.q0() != null) {
                    d6 d6VarQ0 = f3587b.q0();
                    com.applovin.impl.sdk.k kVar2 = f3587b;
                    Objects.requireNonNull(editor);
                    d6VarQ0.a((i5) new r6(kVar2, true, "commitSharedPreferencesChanges", new v9(5, editor)), d6.b.OTHER);
                    return;
                }
                editor.apply();
                return;
            }
            editor.commit();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("SharedPreferencesManager", "Unable to apply changes", th2);
            try {
                f3587b.D().a("SharedPreferencesManager", "persistChanges", th2);
            } catch (Throwable unused) {
            }
        }
    }

    private static SharedPreferences a(Context context) {
        if (f3588c == null) {
            f3588c = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f3588c;
    }
}
