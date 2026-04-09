package Be;

import N.O0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import ma.AbstractC6784a;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class G {
    public static final void b(androidx.compose.ui.e eVar, final InterfaceC6839p content, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        float fJ;
        AbstractC6492s.i(content, "content");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(67066529);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.l(content) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(67066529, i12, -1, "com.ui.wifiman.ui.component.SurfaceCardSecondary (SurfaceCardSecondary.kt:17)");
            }
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            AbstractC6784a abstractC6784aA = c6562a.a(interfaceC3540lR, i14);
            interfaceC3540lR.U(512414565);
            boolean zT = interfaceC3540lR.T(abstractC6784aA);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                if (abstractC6784aA instanceof AbstractC6784a.d) {
                    fJ = Y0.h.j((float) 0.5d);
                } else {
                    if (!(abstractC6784aA instanceof AbstractC6784a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fJ = Y0.h.j(0);
                }
                objF = Y0.h.d(fJ);
                interfaceC3540lR.K(objF);
            }
            float fS = ((Y0.h) objF).s();
            interfaceC3540lR.J();
            O0.a(eVar3, c6562a.b(interfaceC3540lR, i14).a(), c6562a.a(interfaceC3540lR, i14).a().g().e(), 0L, null, fS, content, interfaceC3540lR, (i12 & 14) | ((i12 << 15) & 3670016), 24);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Be.F
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return G.c(eVar2, content, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, interfaceC6839p, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
