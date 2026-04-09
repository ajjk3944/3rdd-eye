package p0;

import l0.AbstractC6525a;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6535k;
import m0.Q0;
import o0.InterfaceC7039f;

/* renamed from: p0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7184e {
    public static final void a(InterfaceC7039f interfaceC7039f, C7182c c7182c) {
        c7182c.h(interfaceC7039f.k1().d(), interfaceC7039f.k1().g());
    }

    public static final void b(C7182c c7182c, Q0 q02) {
        if (q02 instanceof Q0.b) {
            Q0.b bVar = (Q0.b) q02;
            c7182c.R(AbstractC6532h.a(bVar.b().k(), bVar.b().n()), AbstractC6538n.a(bVar.b().r(), bVar.b().j()));
            return;
        }
        if (q02 instanceof Q0.a) {
            c7182c.O(((Q0.a) q02).b());
            return;
        }
        if (q02 instanceof Q0.c) {
            Q0.c cVar = (Q0.c) q02;
            if (cVar.c() != null) {
                c7182c.O(cVar.c());
            } else {
                C6535k c6535kB = cVar.b();
                c7182c.W(AbstractC6532h.a(c6535kB.e(), c6535kB.g()), AbstractC6538n.a(c6535kB.j(), c6535kB.d()), AbstractC6525a.d(c6535kB.b()));
            }
        }
    }
}
