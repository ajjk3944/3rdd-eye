package j9;

import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* compiled from: PlatformImplementations.kt */
/* renamed from: j9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5202a {

    /* compiled from: PlatformImplementations.kt */
    /* renamed from: j9.a$a, reason: collision with other inner class name */
    public static final class C0482a {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f43141a;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            l.c(methods);
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (l.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    l.e(parameterTypes, "getParameterTypes(...)");
                    if (l.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i++;
            }
            f43141a = method;
            int length2 = methods.length;
            for (int i10 = 0; i10 < length2 && !l.b(methods[i10].getName(), "getSuppressed"); i10++) {
            }
        }
    }

    public void a(Throwable cause, Throwable exception) {
        l.f(cause, "cause");
        l.f(exception, "exception");
        Method method = C0482a.f43141a;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
