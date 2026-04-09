package com.ui.wifiman.ui.component.network;

import Be.AbstractC2487w;
import Be.EnumC2490z;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import androidx.compose.ui.e;
import com.ui.wifiman.ui.component.network.AbstractC5210h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import z.C8680c;

/* renamed from: com.ui.wifiman.ui.component.network.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5217o {
    private static final void d(final AbstractC5210h abstractC5210h, final androidx.compose.ui.e eVar, final float f10, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        EnumC2490z enumC2490z;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(829035252);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(abstractC5210h) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.g(f10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(829035252, i11, -1, "com.ui.wifiman.ui.component.network.Compose (NetworkConnectionProgress.kt:74)");
            }
            long jF = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).a().b().f();
            if (abstractC5210h instanceof AbstractC5210h.a) {
                enumC2490z = EnumC2490z.FINISHED;
            } else if (abstractC5210h instanceof AbstractC5210h.b.a) {
                enumC2490z = EnumC2490z.LTR;
            } else {
                if (!(abstractC5210h instanceof AbstractC5210h.b.C1557b)) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC2490z = EnumC2490z.RTL;
            }
            Be.C.c(eVar, 0, f10, enumC2490z, jF, interfaceC3540lR, ((i11 >> 3) & 14) | (i11 & 896), 2);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.component.network.n
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5217o.g(abstractC5210h, eVar, f10, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void e(final C5211i c5211i, final androidx.compose.ui.e eVar, final float f10, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(121640918);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(c5211i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.g(f10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(121640918, i11, -1, "com.ui.wifiman.ui.component.network.Compose (NetworkConnectionProgress.kt:64)");
            }
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC2487w.b(c5211i.a(), androidx.compose.foundation.layout.r.v(eVar, f10), null, null, null, 0.0f, 0L, interfaceC3540lR, 0, 62);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.component.network.m
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5217o.f(c5211i, eVar, f10, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(C5211i c5211i, androidx.compose.ui.e eVar, float f10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        e(c5211i, eVar, f10, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(AbstractC5210h abstractC5210h, androidx.compose.ui.e eVar, float f10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(abstractC5210h, eVar, f10, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void h(androidx.compose.ui.e eVar, float f10, float f11, final C5213k model, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1123920517);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = 2 & i11;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.g(f10) ? 32 : 16;
        }
        int i15 = 4 & i11;
        if (i15 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.g(f11) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.T(model) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (i14 != 0) {
                f10 = Y0.h.j(42);
            }
            if (i15 != 0) {
                f11 = Y0.h.j(6);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1123920517, i12, -1, "com.ui.wifiman.ui.component.network.NetworkConnectionProgress (NetworkConnectionProgress.kt:93)");
            }
            C0.C cB = z.W.b(C8680c.f66832a.n(Y0.h.j(1.5f * f11)), f0.c.f46573a.i(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
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
            int i16 = ((i12 << 3) & 896) | 48;
            e(model.a(), androidx.compose.ui.e.f28771b0, f10, interfaceC3540lR, i16);
            interfaceC3540lR.U(-279045462);
            for (C5212j c5212j : model.b()) {
                AbstractC5210h abstractC5210hA = c5212j.a();
                e.a aVar2 = androidx.compose.ui.e.f28771b0;
                d(abstractC5210hA, aVar2, f11, interfaceC3540lR, (i12 & 896) | 48);
                e(c5212j.b(), aVar2, f10, interfaceC3540lR, i16);
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        final androidx.compose.ui.e eVar2 = eVar;
        final float f12 = f10;
        final float f13 = f11;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.component.network.l
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5217o.i(eVar2, f12, f13, model, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(androidx.compose.ui.e eVar, float f10, float f11, C5213k c5213k, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        h(eVar, f10, f11, c5213k, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
