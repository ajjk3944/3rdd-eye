package g2;

import Zg.AbstractC3689v;
import f2.C5506e;
import f2.p;
import f2.u;
import java.util.Iterator;
import java.util.List;
import mh.InterfaceC6835l;
import mh.r;

/* loaded from: classes.dex */
public abstract class k {
    public static final void a(u uVar, String str, List list, List list2, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, InterfaceC6835l interfaceC6835l4, InterfaceC6835l interfaceC6835l5, r rVar) {
        C5856f c5856f = new C5856f((C5855e) uVar.h().d(C5855e.class), str, rVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5506e c5506e = (C5506e) it.next();
            c5856f.a(c5506e.a(), c5506e.b());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c5856f.c((p) it2.next());
        }
        c5856f.h(interfaceC6835l);
        c5856f.i(interfaceC6835l2);
        c5856f.j(interfaceC6835l3);
        c5856f.k(interfaceC6835l4);
        c5856f.l(interfaceC6835l5);
        uVar.g(c5856f);
    }

    public static /* synthetic */ void b(u uVar, String str, List list, List list2, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, InterfaceC6835l interfaceC6835l4, InterfaceC6835l interfaceC6835l5, r rVar, int i10, Object obj) {
        List listL = (i10 & 2) != 0 ? AbstractC3689v.l() : list;
        List listL2 = (i10 & 4) != 0 ? AbstractC3689v.l() : list2;
        InterfaceC6835l interfaceC6835l6 = (i10 & 8) != 0 ? null : interfaceC6835l;
        InterfaceC6835l interfaceC6835l7 = (i10 & 16) != 0 ? null : interfaceC6835l2;
        a(uVar, str, listL, listL2, interfaceC6835l6, interfaceC6835l7, (i10 & 32) != 0 ? interfaceC6835l6 : interfaceC6835l3, (i10 & 64) != 0 ? interfaceC6835l7 : interfaceC6835l4, (i10 & 128) != 0 ? null : interfaceC6835l5, rVar);
    }
}
