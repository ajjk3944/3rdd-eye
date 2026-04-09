package androidx.compose.ui.focus;

import C0.InterfaceC2525e;
import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.C2620a0;
import E0.G;
import E0.e0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(FocusTargetNode focusTargetNode, int i10, InterfaceC6835l interfaceC6835l) {
        e.c cVarG;
        InterfaceC2525e interfaceC2525eJ2;
        int iC;
        C2620a0 c2620a0K0;
        int iA = e0.a(1024);
        if (!focusTargetNode.h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = focusTargetNode.h1().h2();
        G gM = AbstractC2633k.m(focusTargetNode);
        loop0: while (true) {
            if (gM == null) {
                cVarG = null;
                break;
            }
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        cVarG = cVarH2;
                        V.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
                                int i11 = 0;
                                for (e.c cVarE2 = ((AbstractC2635m) cVarG).E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new V.b(new e.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar.b(cVarE2);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = AbstractC2633k.g(bVar);
                        }
                    }
                    cVarH2 = cVarH2.h2();
                }
            }
            gM = gM.o0();
            cVarH2 = (gM == null || (c2620a0K0 = gM.k0()) == null) ? null : c2620a0K0.o();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarG;
        if ((focusTargetNode2 != null && AbstractC6492s.d(focusTargetNode2.J2(), focusTargetNode.J2())) || (interfaceC2525eJ2 = focusTargetNode.J2()) == null) {
            return null;
        }
        d.a aVar = d.f28823b;
        if (d.l(i10, aVar.h())) {
            iC = InterfaceC2525e.b.f2133a.a();
        } else if (d.l(i10, aVar.a())) {
            iC = InterfaceC2525e.b.f2133a.d();
        } else if (d.l(i10, aVar.d())) {
            iC = InterfaceC2525e.b.f2133a.e();
        } else if (d.l(i10, aVar.g())) {
            iC = InterfaceC2525e.b.f2133a.f();
        } else if (d.l(i10, aVar.e())) {
            iC = InterfaceC2525e.b.f2133a.b();
        } else {
            if (!d.l(i10, aVar.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iC = InterfaceC2525e.b.f2133a.c();
        }
        return interfaceC2525eJ2.a(iC, interfaceC6835l);
    }
}
