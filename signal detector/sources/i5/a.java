package I5;

import U0.j;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final j f1996a;

    public a(j jVar) {
        this.f1996a = jVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, j.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f1996a, objArr);
        } catch (InvocationTargetException e6) {
            throw e6.getTargetException();
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Reflection failed for method " + method, e7);
        }
    }
}
