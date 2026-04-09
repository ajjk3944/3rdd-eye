package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    private static Method f21484a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f21485b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f21486c;

    static {
        try {
            f21484a = Class.class.getDeclaredMethod("forName", String.class);
            f21485b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f21486c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    public static Object a(Object obj, Class cls, String str, Object obj2) {
        Field fieldA;
        try {
            fieldA = a(cls, str);
        } catch (Throwable unused) {
        }
        if (fieldA == null) {
            return obj2;
        }
        fieldA.setAccessible(true);
        return fieldA.get(obj);
    }

    public static Field a(Class cls, String str) {
        if (!a()) {
            return null;
        }
        try {
            Field field = (Field) f21486c.invoke(cls, str);
            try {
                field.setAccessible(true);
                return field;
            } catch (Throwable unused) {
                return field;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        if (!a()) {
            return null;
        }
        try {
            Method method = (Method) f21485b.invoke(cls, str, clsArr);
            try {
                method.setAccessible(true);
                return method;
            } catch (Throwable unused) {
                return method;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Object a(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        try {
            Method methodA = a(cls, str, clsArr);
            if (methodA != null) {
                return methodA.invoke(obj, objArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean a() {
        return (f21484a == null || f21485b == null || f21486c == null) ? false : true;
    }
}
