package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class cl0 {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        i30.j(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (i30.c(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                i30.l(parameterTypes, "getParameterTypes(...)");
                if (i30.c(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !i30.c(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
