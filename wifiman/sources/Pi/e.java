package Pi;

import Ii.C3048c0;
import Li.InterfaceC3220g;
import dh.InterfaceC5384i;
import java.util.ServiceLoader;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final a[] f18701a = (a[]) AbstractC8783m.Z(AbstractC8783m.g(ServiceLoader.load(a.class, a.class.getClassLoader()).iterator())).toArray(new a[0]);

    public static final InterfaceC3220g a(Dj.a aVar) {
        return new d(aVar, null, 0, null, 14, null);
    }

    public static final Dj.a b(InterfaceC3220g interfaceC3220g, InterfaceC5384i interfaceC5384i) {
        return new b(interfaceC3220g, C3048c0.d().plus(interfaceC5384i));
    }

    public static final Dj.a c(Dj.a aVar, InterfaceC5384i interfaceC5384i) {
        a[] aVarArr = f18701a;
        if (aVarArr.length <= 0) {
            return aVar;
        }
        a aVar2 = aVarArr[0];
        throw null;
    }
}
