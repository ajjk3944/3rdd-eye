package lf;

import Ee.C2706g;
import Ee.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.o1;
import Yg.J;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import lf.d;
import mf.AbstractC6818a;
import mf.AbstractC6821d;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.r;

/* loaded from: classes4.dex */
public abstract class d {

    static final class a implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f52599a;

        a(l lVar) {
            this.f52599a = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(l lVar, AbstractC6818a abstractC6818a) {
            lVar.q0(((AbstractC6818a.C1959a) abstractC6818a).getId());
            return J.f24997a;
        }

        public final void b(androidx.compose.ui.e itemModifier, final AbstractC6818a item, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(itemModifier, "itemModifier");
            AbstractC6492s.i(item, "item");
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.T(itemModifier) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= interfaceC3540l.T(item) ? 32 : 16;
            }
            if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-518193297, i11, -1, "com.ui.wifiman.ui.speedtest.server.SpeedtestInternetServerPickerContentUi.<anonymous> (SpeedtestInternetServerPickerContentUi.kt:20)");
            }
            if (!(item instanceof AbstractC6818a.C1959a)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540l.U(1841865201);
            boolean zT = interfaceC3540l.T(this.f52599a) | ((i11 & 112) == 32);
            final l lVar = this.f52599a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: lf.c
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return d.a.c(lVar, item);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            AbstractC6821d.c(androidx.compose.foundation.d.d(itemModifier, false, null, null, (InterfaceC6824a) objF, 7, null), (AbstractC6818a.C1959a) item, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            b((androidx.compose.ui.e) obj, (AbstractC6818a) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final l vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(233603264);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(233603264, i11, -1, "com.ui.wifiman.ui.speedtest.server.SpeedtestInternetServerPickerContentUi (SpeedtestInternetServerPickerContentUi.kt:14)");
            }
            z.L(modifier, (C2706g) o1.b(vm.o0(), null, interfaceC3540lR, 0, 1).getValue(), null, false, false, null, null, b0.c.e(-518193297, true, new a(vm), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 12585984, 116);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: lf.b
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d.c(modifier, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, l lVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, lVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
