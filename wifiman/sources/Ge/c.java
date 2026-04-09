package Ge;

import C0.C;
import E0.InterfaceC2629g;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import f0.c;
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
import z.W;
import z.Y;
import z.Z;

/* loaded from: classes4.dex */
public abstract class c {
    public static final void b(final androidx.compose.ui.e modifier, final a model, final InterfaceC6824a onCloseClicked, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        AbstractC6492s.i(onCloseClicked, "onCloseClicked");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-883934519);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(onCloseClicked) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-883934519, i12, -1, "com.ui.wifiman.ui.component.notification.ApRoamingNotificationContent (ApRoamingNotification.kt:45)");
            }
            float f10 = 8;
            androidx.compose.ui.e eVarL = o.l(r.k(modifier, Y0.h.j(72), 0.0f, 2, null), Y0.h.j(12), Y0.h.j(f10), Y0.h.j(0), Y0.h.j(f10));
            c.a aVar = f0.c.f46573a;
            c.InterfaceC1752c interfaceC1752cI = aVar.i();
            C8680c c8680c = C8680c.f66832a;
            C cB = W.b(c8680c.n(Y0.h.j(16)), interfaceC1752cI, interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarL);
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
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            Z z10 = Z.f66823a;
            s9.b bVarR = Pe.a.f18599a.r();
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarV = r.v(aVar3, Y0.h.j(24));
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            AbstractC8049c.c(bVarR, eVarV, C6733v0.g(c6562a.a(interfaceC3540lR, i13).c().a()), null, interfaceC3540lR, 54, 4);
            androidx.compose.ui.e eVarB = Y.b(z10, aVar3, 1.0f, false, 2, null);
            C cA = AbstractC8685h.a(c8680c.n(Y0.h.j(4)), aVar.k(), interfaceC3540lR, 6);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarB);
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
            E1.c(interfaceC3540lA2, cA, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            a1.c(AbstractC7930a.a(model.c(), interfaceC3540lR, 0), null, c6562a.a(interfaceC3540lR, i13).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().f(), interfaceC3540lR, 0, 0, 131066);
            s9.d dVarB = model.b();
            interfaceC3540lR.U(126366450);
            if (dVarB != null) {
                a1.c(AbstractC7930a.a(model.b(), interfaceC3540lR, 0), null, c6562a.a(interfaceC3540lR, i13).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().f(), interfaceC3540lR, 0, 0, 131066);
                J j10 = J.f24997a;
            }
            interfaceC3540lR.J();
            s9.d dVarA = model.a();
            interfaceC3540lR.U(126374808);
            if (dVarA != null) {
                a1.c(AbstractC7930a.a(model.a(), interfaceC3540lR, 0), null, c6562a.a(interfaceC3540lR, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i13).b().f(), interfaceC3540lR, 0, 0, 131066);
                J j11 = J.f24997a;
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            interfaceC3540lR = interfaceC3540lR;
            N.Z.a(onCloseClicked, r.v(aVar3, Y0.h.j(20)), false, null, d.f7333a.a(), interfaceC3540lR, ((i12 >> 6) & 14) | 24624, 12);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ge.b
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return c.c(modifier, model, onCloseClicked, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, a aVar, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, aVar, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
