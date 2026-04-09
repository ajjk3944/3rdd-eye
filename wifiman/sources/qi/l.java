package Qi;

import Ii.C3079s0;
import Ii.H;
import Ii.InterfaceC3091y0;
import Ii.N;
import Ii.P;
import dh.C5385j;
import dh.InterfaceC5384i;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class l {
    public static final z b(InterfaceC5384i interfaceC5384i, InterfaceC6839p interfaceC6839p) {
        if (interfaceC5384i.get(InterfaceC3091y0.f9363O) == null) {
            return d(C3079s0.f9355a, interfaceC5384i, interfaceC6839p);
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + interfaceC5384i).toString());
    }

    public static /* synthetic */ z c(InterfaceC5384i interfaceC5384i, InterfaceC6839p interfaceC6839p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5384i = C5385j.f46088a;
        }
        return b(interfaceC5384i, interfaceC6839p);
    }

    private static final z d(final N n10, final InterfaceC5384i interfaceC5384i, final InterfaceC6839p interfaceC6839p) {
        return z.i(new C() { // from class: Qi.k
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                l.e(n10, interfaceC5384i, interfaceC6839p, interfaceC5910A);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(N n10, InterfaceC5384i interfaceC5384i, InterfaceC6839p interfaceC6839p, InterfaceC5910A interfaceC5910A) {
        j jVar = new j(H.j(n10, interfaceC5384i), interfaceC5910A);
        interfaceC5910A.d(new c(jVar));
        jVar.Q0(P.DEFAULT, jVar, interfaceC6839p);
    }
}
