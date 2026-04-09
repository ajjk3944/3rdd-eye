package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ax {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences f21490a;

    public static String a(Context context, String str) {
        return a(context, str, "");
    }

    public static void b(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putString(str, str2).apply();
        }
    }

    public static String a(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getString(str, str2) : str2;
    }

    public static void b(Context context, String str, int i4) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            je.u.z(sharedPreferencesA, str, i4);
        }
    }

    public static int a(Context context, String str, int i4) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getInt(str, i4) : i4;
    }

    public static long a(Context context, String str, long j) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getLong(str, j) : j;
    }

    public static SharedPreferences a(Context context) {
        if (f21490a == null) {
            f21490a = context.getSharedPreferences("ss_config", 0);
        }
        return f21490a;
    }

    public static void b(Context context, String str, long j) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putLong(str, j).apply();
        }
    }
}
