package com.yandex.mobile.ads.impl;

import N7.G8;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public final class rs0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f32769a = new Object();

    private static String a(String str, Throwable th) {
        String strReplace;
        synchronized (f32769a) {
            try {
                if (th != null) {
                    Throwable cause = th;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    }
                } else {
                    strReplace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbV = G8.v(str, "\n  ");
        sbV.append(strReplace.replace("\n", "\n  "));
        sbV.append('\n');
        return sbV.toString();
    }

    public static void b(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    public static void c(String str, String str2) {
        synchronized (f32769a) {
            Log.i(str, str2);
        }
    }

    public static void d(String str, String str2) {
        synchronized (f32769a) {
            Log.w(str, str2);
        }
    }

    public static void b(String str, String str2) {
        synchronized (f32769a) {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    public static void a(String str, Exception exc) {
        c("BundleUtil", a(str, (Throwable) exc));
    }

    public static void a(String str, String str2) {
        synchronized (f32769a) {
            Log.d(str, str2);
        }
    }
}
