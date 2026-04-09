package kf;

import Ee.C2706g;
import Ee.I;
import Ee.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.o1;
import Yg.J;
import hf.s;
import kf.f;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import mh.r;

/* loaded from: classes4.dex */
public abstract class f {

    static final class a implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6460b f51434a;

        a(AbstractC6460b abstractC6460b) {
            this.f51434a = abstractC6460b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J e(AbstractC6460b abstractC6460b) {
            abstractC6460b.q0();
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J f(AbstractC6460b abstractC6460b, hf.o oVar) {
            abstractC6460b.s0(oVar.getId());
            return J.f24997a;
        }

        public final void c(androidx.compose.ui.e itemModifier, final hf.o item, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(itemModifier, "itemModifier");
            AbstractC6492s.i(item, "item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(itemModifier) ? 4 : 2);
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
                AbstractC3546o.Q(98052226, i11, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsContentUi.<anonymous> (SpeedtestResultsContentUi.kt:30)");
            }
            interfaceC3540l.U(1730760596);
            boolean zT = interfaceC3540l.T(this.f51434a);
            final AbstractC6460b abstractC6460b = this.f51434a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: kf.d
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return f.a.e(abstractC6460b);
                    }
                };
                interfaceC3540l.K(objF);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF;
            interfaceC3540l.J();
            interfaceC3540l.U(1730758395);
            int i12 = i11 & 112;
            boolean zT2 = (i12 == 32) | interfaceC3540l.T(this.f51434a);
            final AbstractC6460b abstractC6460b2 = this.f51434a;
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6824a() { // from class: kf.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return f.a.f(abstractC6460b2, item);
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            s.f(androidx.compose.foundation.layout.o.j(androidx.compose.foundation.d.g(itemModifier, (46 & 1) != 0, (46 & 2) != 0 ? null : null, (46 & 4) != 0 ? null : null, (46 & 8) != 0 ? null : null, (46 & 16) != 0 ? null : interfaceC6824a, (46 & 32) != 0 ? null : null, (InterfaceC6824a) objF2), Y0.h.j(16), Y0.h.j(8)), item, interfaceC3540l, i12);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            c((androidx.compose.ui.e) obj, (hf.o) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6460b f51435a;

        b(AbstractC6460b abstractC6460b) {
            this.f51435a = abstractC6460b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(AbstractC6460b abstractC6460b, hf.o oVar) {
            abstractC6460b.t0(oVar.getId());
            return J.f24997a;
        }

        public final void b(final hf.o item, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(item, "item");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(item) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-160885308, i10, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsContentUi.<anonymous> (SpeedtestResultsContentUi.kt:25)");
            }
            interfaceC3540l.U(1730750145);
            boolean zT = ((i10 & 14) == 4) | interfaceC3540l.T(this.f51435a);
            final AbstractC6460b abstractC6460b = this.f51435a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: kf.g
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return f.b.c(abstractC6460b, item);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            I.c(null, (InterfaceC6824a) objF, interfaceC3540l, 0, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((hf.o) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final void b(androidx.compose.ui.e eVar, final AbstractC6460b vm, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(268430045);
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
            i12 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar4 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(268430045, i12, -1, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsContentUi (SpeedtestResultsContentUi.kt:19)");
            }
            eVar3 = eVar4;
            interfaceC3540l2 = interfaceC3540lR;
            z.B(androidx.compose.foundation.layout.r.f(eVar4, 0.0f, 1, null), (C2706g) o1.b(vm.n0(), null, interfaceC3540lR, 0, 1).getValue(), ((Boolean) o1.b(vm.p0(), null, interfaceC3540lR, 0, 1).getValue()).booleanValue(), null, false, false, null, b0.c.e(98052226, true, new a(vm), interfaceC3540lR, 54), b0.c.e(-160885308, true, new b(vm), interfaceC3540lR, 54), interfaceC3540lR, 113246208, 120);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: kf.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return f.c(eVar3, vm, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, AbstractC6460b abstractC6460b, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, abstractC6460b, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
