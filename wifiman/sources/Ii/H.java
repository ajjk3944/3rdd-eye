package Ii;

import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5381f;
import dh.InterfaceC5384i;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class H {
    private static final InterfaceC5384i d(InterfaceC5384i interfaceC5384i, InterfaceC5384i interfaceC5384i2, final boolean z10) {
        boolean zH = h(interfaceC5384i);
        boolean zH2 = h(interfaceC5384i2);
        if (!zH && !zH2) {
            return interfaceC5384i.plus(interfaceC5384i2);
        }
        final kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        n10.f51689a = interfaceC5384i2;
        C5385j c5385j = C5385j.f46088a;
        InterfaceC5384i interfaceC5384i3 = (InterfaceC5384i) interfaceC5384i.fold(c5385j, new InterfaceC6839p() { // from class: Ii.F
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return H.e(n10, z10, (InterfaceC5384i) obj, (InterfaceC5384i.b) obj2);
            }
        });
        if (zH2) {
            n10.f51689a = ((InterfaceC5384i) n10.f51689a).fold(c5385j, new InterfaceC6839p() { // from class: Ii.G
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return H.f((InterfaceC5384i) obj, (InterfaceC5384i.b) obj2);
                }
            });
        }
        return interfaceC5384i3.plus((InterfaceC5384i) n10.f51689a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5384i e(kotlin.jvm.internal.N n10, boolean z10, InterfaceC5384i interfaceC5384i, InterfaceC5384i.b bVar) {
        return interfaceC5384i.plus(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5384i f(InterfaceC5384i interfaceC5384i, InterfaceC5384i.b bVar) {
        return interfaceC5384i.plus(bVar);
    }

    public static final String g(InterfaceC5384i interfaceC5384i) {
        return null;
    }

    private static final boolean h(InterfaceC5384i interfaceC5384i) {
        return ((Boolean) interfaceC5384i.fold(Boolean.FALSE, new InterfaceC6839p() { // from class: Ii.E
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(H.i(((Boolean) obj).booleanValue(), (InterfaceC5384i.b) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z10, InterfaceC5384i.b bVar) {
        return z10;
    }

    public static final InterfaceC5384i j(N n10, InterfaceC5384i interfaceC5384i) {
        InterfaceC5384i interfaceC5384iD = d(n10.getCoroutineContext(), interfaceC5384i, true);
        return (interfaceC5384iD == C3048c0.a() || interfaceC5384iD.get(InterfaceC5381f.f46086m0) != null) ? interfaceC5384iD : interfaceC5384iD.plus(C3048c0.a());
    }

    public static final InterfaceC5384i k(InterfaceC5384i interfaceC5384i, InterfaceC5384i interfaceC5384i2) {
        return !h(interfaceC5384i2) ? interfaceC5384i.plus(interfaceC5384i2) : d(interfaceC5384i, interfaceC5384i2, false);
    }

    public static final Y0 l(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof Z) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof Y0) {
                return (Y0) eVar;
            }
        }
        return null;
    }

    public static final Y0 m(InterfaceC5380e interfaceC5380e, InterfaceC5384i interfaceC5384i, Object obj) {
        if (!(interfaceC5380e instanceof kotlin.coroutines.jvm.internal.e) || interfaceC5384i.get(Z0.f9297a) == null) {
            return null;
        }
        Y0 y0L = l((kotlin.coroutines.jvm.internal.e) interfaceC5380e);
        if (y0L != null) {
            y0L.U0(interfaceC5384i, obj);
        }
        return y0L;
    }
}
