package Ff;

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
import androidx.compose.ui.e;
import f0.c;
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
public abstract class y {
    public static final void b(final androidx.compose.ui.e modifier, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(775032987);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(775032987, i11, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiLoading (WifiScanUiLoading.kt:23)");
            }
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            long jB = c6562a.a(interfaceC3540lR, i12).a().g().b();
            androidx.compose.ui.e eVarA = H9.a.a(androidx.compose.foundation.layout.o.k(modifier, c6562a.d(interfaceC3540lR, i12).a().a().c(), 0.0f, 2, null), interfaceC3540lR, 0);
            C8680c c8680c = C8680c.f66832a;
            C8680c.m mVarG = c8680c.g();
            c.a aVar = f0.c.f46573a;
            C cA = AbstractC8685h.a(mVarG, aVar.k(), interfaceC3540lR, 0);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarA);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
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
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            v0.b(null, interfaceC3540lR, 0, 1);
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarA2 = AbstractC6234e.a(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), jB, null, 2, null), c6562a.b(interfaceC3540lR, i12).a());
            C cA2 = AbstractC8685h.a(c8680c.g(), aVar.k(), interfaceC3540lR, 0);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarA2);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cA2, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            interfaceC3540lR.R();
            v0.b(null, interfaceC3540lR, 0, 1);
            a0.a(androidx.compose.foundation.layout.r.i(aVar3, Y0.h.j(24)), interfaceC3540lR, 6);
            interfaceC3540lR.U(-897626372);
            Iterator it = AbstractC7978m.s(0, 5).iterator();
            while (it.hasNext()) {
                ((Q) it).d();
                e.a aVar4 = androidx.compose.ui.e.f28771b0;
                a0.a(androidx.compose.foundation.layout.r.i(aVar4, Y0.h.j(1)), interfaceC3540lR, 6);
                a0.a(AbstractC6234e.a(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.h(aVar4, 0.0f, 1, null), Y0.h.j(60)), jB, null, 2, null), C6562a.f52458a.b(interfaceC3540lR, C6562a.f52459b).a()), interfaceC3540lR, 0);
            }
            interfaceC3540lR.J();
            v0.b(null, interfaceC3540lR, 0, 1);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ff.x
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return y.c(modifier, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
