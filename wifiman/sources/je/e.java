package Je;

import Af.C2428c;
import Be.z0;
import Ee.C2706g;
import Ee.z;
import Ke.a;
import Ke.s;
import Ke.u;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.o1;
import Yg.J;
import h9.C5969a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s9.InterfaceC7929a;

/* loaded from: classes4.dex */
public abstract class e {

    static final class a implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Je.c f10015a;

        /* renamed from: Je.e$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0409a extends C6490p implements InterfaceC6824a {
            C0409a(Object obj) {
                super(0, obj, Je.c.class, "onSpeedtestClicked", "onSpeedtestClicked()V", 0);
            }

            public final void a() {
                ((Je.c) this.receiver).v0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* synthetic */ class b extends C6490p implements InterfaceC6824a {
            b(Object obj) {
                super(0, obj, Je.c.class, "onManagerAppClicked", "onManagerAppClicked()V", 0);
            }

            public final void a() {
                ((Je.c) this.receiver).t0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* synthetic */ class c extends C6490p implements InterfaceC6835l {
            c(Object obj) {
                super(1, obj, Je.c.class, "onWifiSignalClicked", "onWifiSignalClicked(Lcom/ui/common/hwaddr/HwAddress;)V", 0);
            }

            public final void a(C5969a p02) {
                AbstractC6492s.i(p02, "p0");
                ((Je.c) this.receiver).w0(p02);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5969a) obj);
                return J.f24997a;
            }
        }

        /* synthetic */ class d extends C6490p implements InterfaceC6824a {
            d(Object obj) {
                super(0, obj, Je.c.class, "onPortScanStartClicked", "onPortScanStartClicked()V", 0);
            }

            public final void a() {
                ((Je.c) this.receiver).u0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        a(Je.c cVar) {
            this.f10015a = cVar;
        }

        public final void a(androidx.compose.ui.e itemModifier, Ke.a item, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(itemModifier, "itemModifier");
            AbstractC6492s.i(item, "item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(itemModifier) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? interfaceC3540l.T(item) : interfaceC3540l.l(item) ? 32 : 16;
            }
            if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1541707361, i11, -1, "com.ui.wifiman.ui.device.DeviceDetailUiContent.<anonymous> (DeviceDetailUiContent.kt:28)");
            }
            if (item instanceof a.C0430a) {
                interfaceC3540l.U(1122322676);
                Ke.i.f(itemModifier, (a.C0430a) item, interfaceC3540l, i11 & 14);
                interfaceC3540l.J();
            } else if (item instanceof a.g) {
                interfaceC3540l.U(1122327793);
                Je.c cVar = this.f10015a;
                interfaceC3540l.U(1122330879);
                boolean zT = interfaceC3540l.T(cVar);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C0409a(cVar);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                u.b(itemModifier, (InterfaceC6824a) ((th.g) objF), interfaceC3540l, i11 & 14);
                interfaceC3540l.J();
            } else if (item instanceof a.c) {
                interfaceC3540l.U(1122333715);
                a.c cVar2 = (a.c) item;
                InterfaceC7929a interfaceC7929aA = cVar2.a();
                s9.d dVarB = cVar2.b();
                Je.c cVar3 = this.f10015a;
                interfaceC3540l.U(1122338816);
                boolean zT2 = interfaceC3540l.T(cVar3);
                Object objF2 = interfaceC3540l.f();
                if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new b(cVar3);
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                Ke.k.b(itemModifier, interfaceC7929aA, dVarB, (InterfaceC6824a) ((th.g) objF2), interfaceC3540l, i11 & 14);
                interfaceC3540l.J();
            } else if (item instanceof a.b) {
                interfaceC3540l.U(1122341693);
                a.b bVar = (a.b) item;
                z0.b(itemModifier, bVar.c(), bVar.b(), bVar.d(), bVar.a(), 0, 0, 0, interfaceC3540l, i11 & 14, 224);
                interfaceC3540l.J();
            } else if (item instanceof a.f) {
                interfaceC3540l.U(1122351741);
                Ke.c.b(itemModifier, (a.f) item, interfaceC3540l, i11 & 14);
                interfaceC3540l.J();
            } else if (item instanceof a.h) {
                interfaceC3540l.U(1122357009);
                float f10 = 8;
                androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), 0.0f, Y0.h.j(f10), 1, null), Y0.h.j(16), 0.0f, Y0.h.j(f10), 0.0f, 10, null);
                C2428c c2428cA = ((a.h) item).a();
                Je.c cVar4 = this.f10015a;
                interfaceC3540l.U(1122365024);
                boolean zT3 = interfaceC3540l.T(cVar4);
                Object objF3 = interfaceC3540l.f();
                if (zT3 || objF3 == InterfaceC3540l.f21100a.a()) {
                    objF3 = new c(cVar4);
                    interfaceC3540l.K(objF3);
                }
                interfaceC3540l.J();
                Af.l.f(eVarM, c2428cA, (InterfaceC6835l) ((th.g) objF3), interfaceC3540l, 6, 0);
                interfaceC3540l.J();
            } else if (item instanceof a.d) {
                interfaceC3540l.U(1122368058);
                Ke.m mVar = (Ke.m) o1.b(this.f10015a.q0(), null, interfaceC3540l, 0, 1).getValue();
                Je.c cVar5 = this.f10015a;
                interfaceC3540l.U(1122373283);
                boolean zT4 = interfaceC3540l.T(cVar5);
                Object objF4 = interfaceC3540l.f();
                if (zT4 || objF4 == InterfaceC3540l.f21100a.a()) {
                    objF4 = new d(cVar5);
                    interfaceC3540l.K(objF4);
                }
                interfaceC3540l.J();
                s.h(itemModifier, mVar, (InterfaceC6824a) ((th.g) objF4), interfaceC3540l, i11 & 14);
                interfaceC3540l.J();
            } else {
                if (!(item instanceof a.e)) {
                    interfaceC3540l.U(1122322634);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(1122376223);
                s.j(itemModifier, ((a.e) item).a(), interfaceC3540l, i11 & 14);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((androidx.compose.ui.e) obj, (Ke.a) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final c vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1725510348);
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
                AbstractC3546o.Q(1725510348, i11, -1, "com.ui.wifiman.ui.device.DeviceDetailUiContent (DeviceDetailUiContent.kt:23)");
            }
            z.L(modifier, (C2706g) o1.b(vm.n0(), null, interfaceC3540lR, 0, 1).getValue(), null, false, false, null, null, b0.c.e(-1541707361, true, new a(vm), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 12582912, 124);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Je.d
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return e.c(modifier, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, c cVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, cVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
