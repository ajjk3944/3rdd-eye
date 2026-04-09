package com.yandex.mobile.ads.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class rp {

    /* renamed from: a, reason: collision with root package name */
    private final Method f32732a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f32733b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f32734c;

    public static final class a {
        public static rp a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod(com.vungle.ads.internal.presenter.g.OPEN, String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new rp(method, method3, method2);
        }
    }

    public rp(Method method, Method method2, Method method3) {
        this.f32732a = method;
        this.f32733b = method2;
        this.f32734c = method3;
    }

    public final Object a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f32732a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = this.f32733b;
                kotlin.jvm.internal.l.c(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean a(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj != null) {
            try {
                Method method = this.f32734c;
                kotlin.jvm.internal.l.c(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
