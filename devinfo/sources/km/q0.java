package km;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q0 extends a {
    @Override // km.a
    public final String c(int i4, Method method) {
        Parameter parameter = method.getParameters()[i4];
        if (!parameter.isNamePresent()) {
            return super.c(i4, method);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // km.a
    public final Object d(Method method, Class cls, Object obj, Object[] objArr) {
        return r.a(method, cls, obj, objArr);
    }

    @Override // km.a
    public final boolean e(Method method) {
        return method.isDefault();
    }
}
