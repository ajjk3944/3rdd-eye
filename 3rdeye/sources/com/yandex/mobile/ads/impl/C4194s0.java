package com.yandex.mobile.ads.impl;

import java.lang.reflect.Method;

/* renamed from: com.yandex.mobile.ads.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4194s0 {
    public static String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, f11.class.getClassLoader());
            kotlin.jvm.internal.l.e(cls, "forName(...)");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("getProcessName", new Class[0]);
            declaredMethod2.setAccessible(true);
            Object objInvoke = declaredMethod2.invoke(declaredMethod.invoke(null, new Object[0]), new Object[0]);
            kotlin.jvm.internal.l.d(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    public static String b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, f11.class.getClassLoader());
            kotlin.jvm.internal.l.e(cls, "forName(...)");
            Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            kotlin.jvm.internal.l.d(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }
}
