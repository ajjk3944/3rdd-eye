package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import r3.AbstractC7570h;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f34876a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f34877b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f34878c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f34879d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f34879d == null) {
            boolean z10 = false;
            if (k.d() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f34879d = Boolean.valueOf(z10);
        }
        return f34879d.booleanValue();
    }

    public static boolean b() {
        int i10 = AbstractC7570h.f60088a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !k.c()) {
            return true;
        }
        if (e(context)) {
            return !k.d() || k.g();
        }
        return false;
    }

    public static boolean e(Context context) {
        if (f34877b == null) {
            f34877b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f34877b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f34878c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f34878c = Boolean.valueOf(z10);
        }
        return f34878c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f34876a == null) {
            f34876a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f34876a.booleanValue();
    }
}
