package i4;

import b4.C0344i;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class s extends v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f20631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20632c;

    public s(int i, Method method) {
        this.f20631b = method;
        this.f20632c = i;
    }

    @Override // i4.v
    public final Object a(Class cls) {
        String strP = C0344i.p(cls);
        if (strP == null) {
            return this.f20631b.invoke(null, cls, Integer.valueOf(this.f20632c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strP));
    }
}
