package Ee;

import E0.InterfaceC2629g;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.a0;

/* loaded from: classes4.dex */
public abstract class D {
    public static final void b(final androidx.compose.ui.e modifier, final s9.d text, final s9.b icon, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(text, "text");
        AbstractC6492s.i(icon, "icon");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-688788620);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(text) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(icon) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-688788620, i12, -1, "com.ui.wifiman.ui.component.list.ListEmptyDescriptionIconifiedItem (ListEmptyDescriptionIconifiedItem.kt:28)");
            }
            float f10 = 16;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.b(modifier, 0.0f, Y0.h.j(120), 1, null), Y0.h.j(24), Y0.h.j(f10));
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.g(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
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
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar2, Y0.h.j(64));
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            AbstractC8049c.c(icon, eVarV, C6733v0.g(c6562a.a(interfaceC3540lR, i13).a().b().b()), null, interfaceC3540lR, ((i12 >> 6) & 14) | 48, 4);
            a0.a(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(f10)), interfaceC3540lR, 6);
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(AbstractC7930a.a(text, interfaceC3540lR, (i12 >> 3) & 14), null, c6562a.a(interfaceC3540lR, i13).f().a(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i13).a().b(), interfaceC3540l2, 0, 0, 130554);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ee.C
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return D.c(modifier, text, icon, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, s9.d dVar, s9.b bVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, dVar, bVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
