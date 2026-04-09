package gh;

import Zg.AbstractC3682n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;
import qh.AbstractC7510c;
import qh.C7509b;

/* renamed from: gh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5916a {

    /* renamed from: gh.a$a, reason: collision with other inner class name */
    private static final class C1786a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1786a f47917a = new C1786a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f47918b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f47919c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC6492s.f(methods);
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
                if (AbstractC6492s.d(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC6492s.h(parameterTypes, "getParameterTypes(...)");
                    if (AbstractC6492s.d(AbstractC3682n.R0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f47918b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (AbstractC6492s.d(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f47919c = method;
        }

        private C1786a() {
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(cause, "cause");
        AbstractC6492s.i(exception, "exception");
        Method method = C1786a.f47918b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public AbstractC7510c b() {
        return new C7509b();
    }
}
