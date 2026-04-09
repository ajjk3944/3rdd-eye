package kf;

import Be.v0;
import C0.C;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import Zg.Q;
import androidx.compose.foundation.layout.r;
import j0.AbstractC6234e;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import sh.AbstractC7978m;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.a0;

/* loaded from: classes4.dex */
public abstract class k {
    public static final void b(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(191573606);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i12 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(191573606, i12, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsLoadingUi (SpeedtestResultsLoadingUi.kt:24)");
            }
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            long jB = c6562a.a(interfaceC3540lR, i14).a().g().b();
            androidx.compose.ui.e eVar4 = null;
            androidx.compose.ui.e eVarA = H9.a.a(androidx.compose.foundation.layout.o.k(r.h(eVar3, 0.0f, 1, null), c6562a.d(interfaceC3540lR, i14).a().a().c(), 0.0f, 2, null), interfaceC3540lR, 0);
            C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(2)), f0.c.f46573a.k(), interfaceC3540lR, 6);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarA);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            v0.b(null, interfaceC3540lR, 0, 1);
            interfaceC3540lR.U(51314018);
            Iterator it = AbstractC7978m.s(0, 3).iterator();
            while (it.hasNext()) {
                ((Q) it).d();
                a0.a(AbstractC6234e.a(androidx.compose.foundation.b.d(r.i(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, eVar4), Y0.h.j(113)), jB, null, 2, null), C6562a.f52458a.b(interfaceC3540lR, C6562a.f52459b).a()), interfaceC3540lR, 0);
                eVar4 = eVar4;
            }
            interfaceC3540lR.J();
            v0.b(eVar4, interfaceC3540lR, 0, 1);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: kf.j
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return k.c(eVar3, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
