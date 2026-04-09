package af;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import af.q0;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import sh.AbstractC7978m;
import z.C8680c;

/* loaded from: classes4.dex */
public abstract class u0 {
    private static final void d(final androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1106925147);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1106925147, i11, -1, "com.ui.wifiman.ui.speed.component.ContainerLoading (SpeedTabTopologyCardUi.kt:47)");
            }
            long jE = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).a().g().e();
            androidx.compose.ui.e eVarA = H9.a.a(eVar, interfaceC3540lR, i11 & 14);
            C0.C cB = z.W.b(C8680c.f66832a.b(), f0.c.f46573a.l(), interfaceC3540lR, 6);
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
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            z.Z z10 = z.Z.f66823a;
            interfaceC3540lR.U(-1323499090);
            Iterator it = AbstractC7978m.s(0, 3).iterator();
            while (it.hasNext()) {
                int iD = ((Zg.Q) it).d();
                interfaceC3540lR.U(-1323498584);
                if (iD != 0) {
                    z.a0.a(androidx.compose.foundation.layout.r.z(androidx.compose.ui.e.f28771b0, Y0.h.j(50)), interfaceC3540lR, 6);
                }
                interfaceC3540lR.J();
                z.a0.a(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.r.w(androidx.compose.ui.e.f28771b0, Y0.h.j(78), Y0.h.j(94)), jE, C6562a.f52458a.b(interfaceC3540lR, C6562a.f52459b).a()), interfaceC3540lR, 0);
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: af.s0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return u0.e(eVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(eVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final void f(final androidx.compose.ui.e eVar, final q0.a aVar, final InterfaceC6835l interfaceC6835l, final InterfaceC6835l interfaceC6835l2, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1787186835);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6835l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6835l2) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1787186835, i11, -1, "com.ui.wifiman.ui.speed.component.ContainerTopology (SpeedTabTopologyCardUi.kt:79)");
            }
            int i12 = i11 & 14;
            int i13 = i11 << 12;
            com.ui.wifiman.ui.component.network.X.p(eVar, aVar.a(), 0L, 0L, C6562a.f52458a.d(interfaceC3540lR, C6562a.f52459b).a().a().c(), false, interfaceC6835l, interfaceC6835l2, interfaceC3540lR, i12 | (3670016 & i13) | (i13 & 29360128), 44);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: af.t0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return u0.g(eVar, aVar, interfaceC6835l, interfaceC6835l2, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(androidx.compose.ui.e eVar, q0.a aVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        f(eVar, aVar, interfaceC6835l, interfaceC6835l2, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void h(final androidx.compose.ui.e modifier, final q0 model, final InterfaceC6835l onItemSpeedtestClicked, final InterfaceC6835l onItemClicked, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        AbstractC6492s.i(onItemSpeedtestClicked, "onItemSpeedtestClicked");
        AbstractC6492s.i(onItemClicked, "onItemClicked");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1490922508);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(onItemSpeedtestClicked) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.l(onItemClicked) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1490922508, i11, -1, "com.ui.wifiman.ui.speed.component.SpeedTabTopologyCardUi (SpeedTabTopologyCardUi.kt:28)");
            }
            C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, modifier);
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
            E1.c(interfaceC3540lA, cH, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            if (model instanceof q0.b) {
                interfaceC3540lR.U(1798262190);
                d(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), interfaceC3540lR, 6);
                interfaceC3540lR.J();
            } else {
                if (!(model instanceof q0.a)) {
                    interfaceC3540lR.U(1798260371);
                    interfaceC3540lR.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540lR.U(1798266654);
                f(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), (q0.a) model, onItemSpeedtestClicked, onItemClicked, interfaceC3540lR, 6 | (i11 & 896) | (i11 & 7168));
                interfaceC3540lR.J();
            }
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: af.r0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return u0.i(modifier, model, onItemSpeedtestClicked, onItemClicked, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(androidx.compose.ui.e eVar, q0 q0Var, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        h(eVar, q0Var, interfaceC6835l, interfaceC6835l2, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
