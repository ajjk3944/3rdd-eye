package z;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class a0 {
    public static final void a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-72882467, i10, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        b0 b0Var = b0.f66830a;
        int iA = AbstractC3536j.a(interfaceC3540l, 0);
        androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVar);
        InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
        InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
        InterfaceC6824a interfaceC6824aA = aVar.a();
        if (interfaceC3540l.x() == null) {
            AbstractC3536j.c();
        }
        interfaceC3540l.u();
        if (interfaceC3540l.o()) {
            interfaceC3540l.D(interfaceC6824aA);
        } else {
            interfaceC3540l.I();
        }
        InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
        E1.c(interfaceC3540lA, b0Var, aVar.e());
        E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
        E1.c(interfaceC3540lA, eVarE, aVar.f());
        InterfaceC6839p interfaceC6839pB = aVar.b();
        if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
            interfaceC3540lA.K(Integer.valueOf(iA));
            interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
        }
        interfaceC3540l.R();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
    }
}
