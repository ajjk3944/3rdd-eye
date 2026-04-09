package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class na {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f14189a = Log.isLoggable("Volley", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final String f14190b = na.class.getName();

    public static void a(String str, Object... objArr) {
        if (f14189a) {
            Log.v("Volley", d(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Log.d("Volley", d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e("Volley", d(str, objArr));
    }

    public static String d(String str, Object... objArr) {
        String strM;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i4 = 2;
        while (true) {
            if (i4 >= stackTrace.length) {
                strM = "<unknown>";
                break;
            }
            if (!stackTrace[i4].getClassName().equals(f14190b)) {
                String className = stackTrace[i4].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i4].getMethodName();
                strM = r5.c.m(new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length()), strSubstring2, ".", methodName);
                break;
            }
            i4++;
        }
        Locale locale = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(strM);
        return d.h.w(sb2, ": ", str2);
    }
}
