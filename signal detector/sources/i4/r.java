package i4;

import b4.C0344i;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r extends v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f20629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20630c;

    public r(Method method, Object obj) {
        this.f20629b = method;
        this.f20630c = obj;
    }

    @Override // i4.v
    public final Object a(Class cls) {
        String strP = C0344i.p(cls);
        if (strP == null) {
            return this.f20629b.invoke(this.f20630c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strP));
    }
}
