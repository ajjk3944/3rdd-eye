package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.f5;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final zb.g f11562a = new zb.g(new d5.v(24));

    /* renamed from: b, reason: collision with root package name */
    public static final zb.g f11563b = new zb.g(new d5.v(25));

    /* renamed from: c, reason: collision with root package name */
    public static final zb.g f11564c = new zb.g(new d5.v(26));

    /* renamed from: d, reason: collision with root package name */
    public static final zb.g f11565d = new zb.g(new d5.v(27));

    /* renamed from: e, reason: collision with root package name */
    public static final zb.g f11566e = new zb.g(new d5.v(23));

    public static void a(String str, b5 b5Var, String str2, Throwable th2) {
        io.sentry.e eVar = new io.sentry.e();
        eVar.B = "Logcat";
        eVar.f12203r = str2;
        eVar.E = b5Var;
        if (str != null) {
            eVar.b(str, "tag");
        }
        if (th2 != null && th2.getMessage() != null) {
            eVar.b(th2.getMessage(), "throwable");
        }
        c4.c().m(eVar);
    }

    public static void b(f5 f5Var, String str, Throwable th2) {
        if (c4.c().k().getLogs().f12693a) {
            String message = th2 != null ? th2.getMessage() : null;
            hf.y yVar = new hf.y();
            yVar.f10732a = "auto.log.logcat";
            if (th2 == null || message == null) {
                c4.c().s().e(f5Var, yVar, str, new Object[0]);
                return;
            }
            io.sentry.logger.a aVarS = c4.c().s();
            if (str != null) {
                message = w.g.g(str, "\n", message);
            }
            aVarS.e(f5Var, yVar, message, new Object[0]);
        }
    }

    public static int c(String str, String str2, Throwable th2) {
        a(str, b5.ERROR, str2, th2);
        b(f5.ERROR, str2, th2);
        return Log.e(str, str2, th2);
    }

    public static void d(String str, String str2) {
        a(str, b5.ERROR, str2, null);
        b(f5.ERROR, str2, null);
    }

    public static String e(io.sentry.u0 u0Var) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            u0Var.g(b5.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    public static ActivityManager.MemoryInfo f(Context context, io.sentry.u0 u0Var) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            u0Var.m(b5.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            u0Var.g(b5.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    public static PackageInfo g(Context context, f0 f0Var) {
        f0Var.getClass();
        return Build.VERSION.SDK_INT >= 33 ? (PackageInfo) f11562a.b(context) : (PackageInfo) f11563b.b(context);
    }

    public static String h(PackageInfo packageInfo, f0 f0Var) {
        f0Var.getClass();
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static boolean i() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean j(Bundle bundle, io.sentry.u0 u0Var, String str, boolean z10) {
        boolean z11 = bundle.getBoolean(str, z10);
        u0Var.m(b5.DEBUG, str + " read: " + z11, new Object[0]);
        return z11;
    }

    public static double k(Bundle bundle, io.sentry.u0 u0Var, String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        u0Var.m(b5.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        return dDoubleValue;
    }

    public static List l(Bundle bundle, io.sentry.u0 u0Var, String str) {
        String string = bundle.getString(str);
        u0Var.m(b5.DEBUG, w.g.g(str, " read: ", string), new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    public static long m(Bundle bundle, io.sentry.u0 u0Var, String str, long j) {
        long j7 = bundle.getInt(str, (int) j);
        u0Var.m(b5.DEBUG, str + " read: " + j7, new Object[0]);
        return j7;
    }

    public static String n(Bundle bundle, io.sentry.u0 u0Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        u0Var.m(b5.DEBUG, w.g.g(str, " read: ", string), new Object[0]);
        return string;
    }

    public static String o(Bundle bundle, io.sentry.u0 u0Var, String str, String str2) {
        String string = bundle.getString(str, str2);
        u0Var.m(b5.DEBUG, w.g.g(str, " read: ", string), new Object[0]);
        return string;
    }

    public static void p(String str, String str2) {
        a(str, b5.WARNING, str2, null);
        b(f5.WARN, str2, null);
        Log.w(str, str2);
    }

    public static void q(String str, String str2, Throwable th2) {
        a(str, b5.WARNING, str2, th2);
        b(f5.WARN, str2, th2);
        Log.w(str, str2, th2);
    }

    public static void r(String str, String str2, Exception exc) {
        a(str, b5.ERROR, str2, exc);
        b(f5.FATAL, str2, exc);
        Log.wtf(str, str2, exc);
    }
}
