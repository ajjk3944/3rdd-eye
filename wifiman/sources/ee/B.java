package Ee;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Zg.AbstractC3689v;
import la.C6562a;
import m0.AbstractC6713l0;
import m0.C6733v0;
import mh.InterfaceC6839p;
import z.a0;

/* loaded from: classes4.dex */
public abstract class B {
    public static final void b(androidx.compose.ui.e eVar, long j10, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        long jA;
        androidx.compose.ui.e eVar3;
        long j11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(881555383);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = i10 | (interfaceC3540lR.T(eVar2) ? 4 : 2);
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            jA = j10;
            i12 |= ((i11 & 2) == 0 && interfaceC3540lR.j(jA)) ? 32 : 16;
        } else {
            jA = j10;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            j11 = jA;
        } else {
            interfaceC3540lR.q();
            if ((i10 & 1) == 0 || interfaceC3540lR.H()) {
                eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
                if ((i11 & 2) != 0) {
                    jA = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a();
                    i12 &= -113;
                }
            } else {
                interfaceC3540lR.C();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                eVar3 = eVar2;
            }
            int i14 = i12;
            j11 = jA;
            interfaceC3540lR.S();
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(881555383, i14, -1, "com.ui.wifiman.ui.component.list.LazyColumnCardTopScrollOverlay (LazyColumnCardTopScrollOverlay.kt:20)");
            }
            boolean z10 = true;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.i(eVar3, Y0.h.j(24)), 0.0f, 1, null);
            interfaceC3540lR.U(597632536);
            if ((((i14 & 112) ^ 48) <= 32 || !interfaceC3540lR.j(j11)) && (i14 & 48) != 32) {
                z10 = false;
            }
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = AbstractC6713l0.a.i(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(j11), C6733v0.g(C6733v0.k(j11, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, null);
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            a0.a(androidx.compose.foundation.b.b(eVarH, (AbstractC6713l0) objF, null, 0.0f, 6, null), interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar4 = eVar3;
            final long j12 = j11;
            x0Z.a(new InterfaceC6839p() { // from class: Ee.A
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return B.c(eVar4, j12, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, long j10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, j10, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
