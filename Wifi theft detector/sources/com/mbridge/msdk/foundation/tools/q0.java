package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes3.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f15481a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f15482b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f15483c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f15484d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f15485e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f15486f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f15487g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f15488h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        f15487g = false;
        f15481a = false;
        f15483c = false;
        f15488h = false;
        f15482b = false;
        f15486f = false;
        f15485e = false;
        f15484d = false;
    }

    public static void a(String str, String str2) {
        if (!f15481a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f15482b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (!f15483c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (!f15488h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2, Throwable th) {
        if (!f15482b || str2 == null || th == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!f15488h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    public static void a(String str, String str2, Throwable th) {
        if (!f15481a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th);
    }

    public static void a(String str, Throwable th) {
        if (!f15488h || th == null) {
            return;
        }
        Log.w(a(str), th);
    }
}
