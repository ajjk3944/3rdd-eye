package xr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a0 extends w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f25484a;

    public a0(Object obj) {
        br.l.e(obj, "recordComponent");
        this.f25484a = obj;
    }

    @Override // xr.w
    public final Member b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.f25484a;
        br.l.e(obj, "recordComponent");
        q3.a aVar = xu.l.f25560b;
        Method method = null;
        if (aVar == null) {
            Class<?> cls = obj.getClass();
            try {
                aVar = new q3.a(cls.getMethod("getType", null), 22, cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                aVar = new q3.a(method, 22, method);
            }
            xu.l.f25560b = aVar;
        }
        Method method2 = (Method) aVar.f20680g;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            br.l.c(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final hs.d f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.f25484a;
        br.l.e(obj, "recordComponent");
        q3.a aVar = xu.l.f25560b;
        Class cls = null;
        if (aVar == null) {
            Class<?> cls2 = obj.getClass();
            try {
                aVar = new q3.a(cls2.getMethod("getType", null), 22, cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                aVar = new q3.a(cls, 22, cls);
            }
            xu.l.f25560b = aVar;
        }
        Method method = (Method) aVar.f20679d;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            br.l.c(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new q(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
