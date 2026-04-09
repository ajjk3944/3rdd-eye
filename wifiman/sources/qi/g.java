package Qi;

import Ii.C3079s0;
import Ii.H;
import Ii.InterfaceC3091y0;
import Ii.N;
import Ii.P;
import dh.C5385j;
import dh.InterfaceC5384i;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class g {
    public static final AbstractC5912b b(InterfaceC5384i interfaceC5384i, InterfaceC6839p interfaceC6839p) {
        if (interfaceC5384i.get(InterfaceC3091y0.f9363O) == null) {
            return d(C3079s0.f9355a, interfaceC5384i, interfaceC6839p);
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + interfaceC5384i).toString());
    }

    public static /* synthetic */ AbstractC5912b c(InterfaceC5384i interfaceC5384i, InterfaceC6839p interfaceC6839p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5384i = C5385j.f46088a;
        }
        return b(interfaceC5384i, interfaceC6839p);
    }

    private static final AbstractC5912b d(final N n10, final InterfaceC5384i interfaceC5384i, final InterfaceC6839p interfaceC6839p) {
        return AbstractC5912b.r(new InterfaceC5915e() { // from class: Qi.f
            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                g.e(n10, interfaceC5384i, interfaceC6839p, interfaceC5913c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(N n10, InterfaceC5384i interfaceC5384i, InterfaceC6839p interfaceC6839p, InterfaceC5913c interfaceC5913c) {
        e eVar = new e(H.j(n10, interfaceC5384i), interfaceC5913c);
        interfaceC5913c.d(new c(eVar));
        eVar.Q0(P.DEFAULT, eVar, interfaceC6839p);
    }
}
