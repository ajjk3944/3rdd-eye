package gk;

import java.lang.reflect.Method;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f24754a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f24755b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        k.b(methods);
        int length = methods.length;
        int i4 = 0;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i10];
            if (k.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                k.d(parameterTypes, "getParameterTypes(...)");
                if (k.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i10++;
        }
        f24754a = method2;
        int length2 = methods.length;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            Method method3 = methods[i4];
            if (k.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i4++;
        }
        f24755b = method;
    }
}
