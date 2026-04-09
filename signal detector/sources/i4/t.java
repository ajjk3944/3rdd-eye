package i4;

import b4.C0344i;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class t extends v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f20633b;

    public t(Method method) {
        this.f20633b = method;
    }

    @Override // i4.v
    public final Object a(Class cls) {
        String strP = C0344i.p(cls);
        if (strP == null) {
            return this.f20633b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strP));
    }
}
