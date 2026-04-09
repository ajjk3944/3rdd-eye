package F9;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Zg.AbstractC3689v;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import s9.InterfaceC7929a;
import sa.AbstractC7930a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes3.dex */
public abstract class F {
    public static final void c(androidx.compose.ui.e eVar, final Ci.c items, final InterfaceC6835l onItemSelected, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(items, "items");
        AbstractC6492s.i(onItemSelected, "onItemSelected");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(602197268);
        int i13 = 1;
        int i14 = i11 & 1;
        if (i14 != 0) {
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
            i12 |= (i10 & 64) == 0 ? interfaceC3540lR.T(items) : interfaceC3540lR.l(items) ? 32 : 16;
        }
        int i15 = i11 & 4;
        int i16 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i15 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(onItemSelected) ? 256 : 128;
        }
        int i17 = i12;
        if ((i17 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar4 = i14 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(602197268, i17, -1, "com.ui.core.ui.component.settings.UiSettingsCheckList (UiSettingsCheckList.kt:33)");
            }
            int i18 = 0;
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540lR, 0);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar4);
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
            interfaceC3540lR.U(-1958113942);
            int i19 = 0;
            for (Object obj : items) {
                int i20 = i19 + 1;
                if (i19 < 0) {
                    AbstractC3689v.v();
                }
                final C c10 = (C) obj;
                interfaceC3540lR.U(-1958113325);
                if (i19 != 0) {
                    AbstractC2859x.e(interfaceC3540lR, i18);
                }
                interfaceC3540lR.J();
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, i13, null);
                String strA = c10.a();
                if (strA != null) {
                    eVarH = M9.i.h(eVarH, strA, c10.c());
                }
                String strB = AbstractC7930a.b(c10.getTitle(), interfaceC3540lR, i18);
                InterfaceC7929a icon = c10.getIcon();
                boolean zC = c10.c();
                InterfaceC6824a interfaceC6824aB = c10.b();
                boolean zD = c10.d();
                interfaceC3540lR.U(-1650484541);
                int i21 = ((i17 & 896) == i16 ? i13 : i18) | (interfaceC3540lR.l(c10) ? 1 : 0);
                Object objF = interfaceC3540lR.f();
                if (i21 != 0 || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: F9.D
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj2) {
                            return F.d(onItemSelected, c10, ((Boolean) obj2).booleanValue());
                        }
                    };
                    interfaceC3540lR.K(objF);
                }
                interfaceC3540lR.J();
                InterfaceC3540l interfaceC3540l3 = interfaceC3540lR;
                B.d(eVarH, strB, null, zC, icon, 0.0f, (InterfaceC6835l) objF, interfaceC6824aB, zD, null, interfaceC3540l3, 0, 548);
                eVar4 = eVar4;
                i19 = i20;
                i18 = i18;
                i13 = i13;
                interfaceC3540lR = interfaceC3540l3;
                i16 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            eVar3 = eVar4;
            interfaceC3540l2 = interfaceC3540lR;
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: F9.E
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj2, Object obj3) {
                    return F.e(eVar3, items, onItemSelected, i10, i11, (InterfaceC3540l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(InterfaceC6835l interfaceC6835l, C c10, boolean z10) {
        interfaceC6835l.invoke(c10);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, Ci.c cVar, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, cVar, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
