package Ke;

import Be.AbstractC2487w;
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
import androidx.compose.ui.e;
import j0.AbstractC6240k;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import s9.InterfaceC7929a;
import sa.AbstractC7930a;
import z.C8680c;
import z.W;
import z.Z;

/* loaded from: classes4.dex */
public abstract class k {
    public static final void b(final androidx.compose.ui.e modifier, final InterfaceC7929a icon, final s9.d title, final InterfaceC6824a onClick, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(icon, "icon");
        AbstractC6492s.i(title, "title");
        AbstractC6492s.i(onClick, "onClick");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1346286450);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(icon) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(title) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.l(onClick) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1346286450, i12, -1, "com.ui.wifiman.ui.device.card.DeviceDetailCardManagerApp (DeviceDetailCardManagerApp.kt:33)");
            }
            float f10 = 12;
            float f11 = 16;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.foundation.d.d(modifier, false, null, null, onClick, 7, null), Y0.h.j(f11), Y0.h.j(f10));
            C cB = W.b(C8680c.f66832a.n(Y0.h.j(f11)), f0.c.f46573a.i(), interfaceC3540lR, 54);
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
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            Z z10 = Z.f66823a;
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar2, Y0.h.j(24));
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC2487w.b(icon, AbstractC6240k.b(androidx.compose.foundation.b.d(eVarV, c6562a.a(interfaceC3540lR, i13).e().b(), null, 2, null), Y0.h.j(1), E.h.d(Y0.h.j(f10)), false, 0L, 0L, 28, null), null, null, null, 0.0f, 0L, interfaceC3540l2, (i12 >> 3) & 14, 62);
            a1.c(AbstractC7930a.a(title, interfaceC3540l2, (i12 >> 6) & 14), aVar2, c6562a.a(interfaceC3540l2, i13).a().b().f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l2, i13).a().a(), interfaceC3540l2, 48, 0, 131064);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ke.j
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return k.c(modifier, icon, title, onClick, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, InterfaceC7929a interfaceC7929a, s9.d dVar, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, interfaceC7929a, dVar, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
