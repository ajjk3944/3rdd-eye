package com.facebook.ads.internal.dynamicloading;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8933a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8934b;

    public /* synthetic */ i(int i4, Object obj) {
        this.f8933a = i4;
        this.f8934b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        switch (this.f8933a) {
            case 0:
                if ("toString".equals(method.getName())) {
                    return null;
                }
                ((j) this.f8934b).f8935a = method;
                return null;
            default:
                try {
                    return Class.forName(method.getDeclaringClass().getName(), true, p6.i.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke((p6.i) this.f8934b, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getTargetException();
                } catch (ReflectiveOperationException e10) {
                    throw new RuntimeException("Reflection failed for method " + method, e10);
                }
        }
    }
}
