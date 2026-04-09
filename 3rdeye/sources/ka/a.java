package ka;

import S1.i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: BoundaryInterfaceReflectionUtil.java */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: BoundaryInterfaceReflectionUtil.java */
    /* renamed from: ka.a$a, reason: collision with other inner class name */
    public static class C0486a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final i f43636a;

        public C0486a(i iVar) {
            this.f43636a = iVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return Class.forName(method.getDeclaringClass().getName(), true, i.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f43636a, objArr);
            } catch (InvocationTargetException e4) {
                throw e4.getTargetException();
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Reflection failed for method " + method, e10);
            }
        }
    }

    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
