package com.applovin.impl;

import android.os.Looper;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Thread f4415a = Looper.getMainLooper().getThread();

    public static void a(Throwable th2) {
    }

    public static void a(Throwable th2, String str, Object... objArr) {
    }

    public static boolean a(boolean z3) {
        return a(z3, "Assertion failed", new Object[0]);
    }

    public static boolean a(boolean z3, String str, Object... objArr) {
        if (!z3) {
            a(str, objArr);
        }
        return z3;
    }

    public static boolean a(Object obj) {
        return a(obj, "Null value not expected", new Object[0]);
    }

    public static boolean a(Object obj, String str, Object... objArr) {
        return a(obj != null, str, objArr);
    }

    public static void a(String str, Object... objArr) {
        a((Throwable) null, str, objArr);
    }
}
