package f9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.p;
import kotlin.random.Random;
import z8.o;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: f9.a$a, reason: collision with other inner class name */
    public static final class C0399a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0399a f21172a = new C0399a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f21173b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f21174c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            p.b(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (p.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    p.d(parameterTypes, "getParameterTypes(...)");
                    if (p.a(o.P(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f21173b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (p.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f21174c = method;
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        p.e(cause, "cause");
        p.e(exception, "exception");
        Method method = C0399a.f21173b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public Random b() {
        return new o9.b();
    }
}
