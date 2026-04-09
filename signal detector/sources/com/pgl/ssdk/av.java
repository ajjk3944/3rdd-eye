package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    private static Method f19612a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f19613b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f19614c;

    static {
        try {
            f19612a = Class.class.getDeclaredMethod("forName", String.class);
            f19613b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f19614c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
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
            Field field = (Field) f19614c.invoke(cls, str);
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
            Method method = (Method) f19613b.invoke(cls, str, clsArr);
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
        return (f19612a == null || f19613b == null || f19614c == null) ? false : true;
    }
}
