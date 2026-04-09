package Ee;

import N.Z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class I {
    public static final void c(final androidx.compose.ui.e eVar, final InterfaceC6824a interfaceC6824a, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(972292258);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6824a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (i14 != 0) {
                interfaceC3540lR.U(-553932877);
                Object objF = interfaceC3540lR.f();
                if (objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: Ee.G
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return I.d();
                        }
                    };
                    interfaceC3540lR.K(objF);
                }
                interfaceC6824a = (InterfaceC6824a) objF;
                interfaceC3540lR.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(972292258, i12, -1, "com.ui.wifiman.ui.component.list.ListItemActionDeleteWidget (ListItemActionDeleteWidget.kt:15)");
            }
            Z.a(interfaceC6824a, androidx.compose.foundation.layout.r.v(eVar, Y0.h.j(20)), false, null, C2702c.f4583a.a(), interfaceC3540lR, ((i12 >> 3) & 14) | 24576, 12);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ee.H
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return I.e(eVar, interfaceC6824a, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d() {
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
