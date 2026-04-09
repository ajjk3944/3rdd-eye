package Mj;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
abstract class y {
    y() {
    }

    static y b(x xVar, Class cls, Method method) {
        v vVarB = v.b(xVar, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (B.j(genericReturnType)) {
            throw B.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return m.f(xVar, method, vVarB);
        }
        throw B.n(method, "Service methods cannot return void.", new Object[0]);
    }

    abstract Object a(Object obj, Object[] objArr);
}
