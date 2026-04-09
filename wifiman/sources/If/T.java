package If;

import E0.InterfaceC2629g;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import androidx.compose.ui.e;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.c;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes4.dex */
public abstract class T {

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, Q.class, "onPrimaryButtonClicked", "onPrimaryButtonClicked()V", 0);
        }

        public final void a() {
            ((Q) this.receiver).p0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final Q vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        int i12;
        e.a aVar;
        e.a aVar2;
        InterfaceC5384i interfaceC5384i;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(553148559);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(553148559, i13, -1, "com.ui.wifiman.ui.wmw.WmwStatusPopupUnavailable (WmwStatusPopupUnavailable.kt:50)");
            }
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            androidx.compose.ui.e eVarI = androidx.compose.foundation.layout.o.i(modifier, c6562a.d(interfaceC3540lR, i14).a().a().c());
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(16)), f0.c.f46573a.g(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarI);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
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
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            com.ubnt.usurvey.product.r rVarA = com.ubnt.usurvey.product.s.a(com.ubnt.usurvey.product.l.WM_W_d64);
            AbstractC6492s.f(rVarA);
            c.a aVar4 = new c.a(rVarA.a(), null, 2, null);
            e.a aVar5 = androidx.compose.ui.e.f28771b0;
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC8049c.e(aVar4, androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar5, 0.0f, 1, null), 0.0f, c6562a.d(interfaceC3540lR, i14).a().a().c(), 1, null), L.b(EnumC3021a.REQUIREMENTS_NOT_MET)), null, null, null, null, null, 0.0f, null, interfaceC3540lR, 0, 254);
            s9.d dVar = (s9.d) o1.b(vm.getTitle(), null, interfaceC3540l2, 0, 1).getValue();
            interfaceC3540l2.U(-1782819601);
            if (dVar == null) {
                aVar = aVar5;
                i12 = i14;
            } else {
                i12 = i14;
                aVar = aVar5;
                a1.c(AbstractC7930a.a(dVar, interfaceC3540l2, 0), androidx.compose.foundation.layout.r.h(aVar5, 0.0f, 1, null), c6562a.a(interfaceC3540l2, i14).f().a(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l2, i14).a().c(), interfaceC3540l2, 48, 0, 130552);
            }
            interfaceC3540l2.J();
            s9.d dVar2 = (s9.d) o1.b(vm.o0(), null, interfaceC3540l2, 0, 1).getValue();
            interfaceC3540l2.U(-1782808586);
            if (dVar2 == null) {
                interfaceC5384i = null;
                aVar2 = aVar;
            } else {
                e.a aVar6 = aVar;
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar6, 0.0f, 1, null);
                C3174d c3174dA = AbstractC7930a.a(dVar2, interfaceC3540l2, 0);
                int i15 = i12;
                L0.U uA = c6562a.c(interfaceC3540l2, i15).b().a();
                aVar2 = aVar6;
                interfaceC5384i = null;
                a1.c(c3174dA, eVarH, c6562a.a(interfaceC3540l2, i15).f().b(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, uA, interfaceC3540l2, 48, 0, 130552);
            }
            interfaceC3540l2.J();
            s9.d dVar3 = (s9.d) o1.b(vm.n0(), interfaceC5384i, interfaceC3540l2, 0, 1).getValue();
            interfaceC3540l2.U(-1782797246);
            if (dVar3 != null) {
                androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar2, 0.0f, 1, interfaceC5384i);
                String strB = AbstractC7930a.b(dVar3, interfaceC3540l2, 0);
                interfaceC3540l2.U(-1534306498);
                boolean z10 = (i13 & 112) == 32;
                Object objF = interfaceC3540l2.f();
                if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new a(vm);
                    interfaceC3540l2.K(objF);
                }
                interfaceC3540l2.J();
                w9.r.b(eVarH2, (InterfaceC6824a) ((th.g) objF), false, false, null, null, strB, null, interfaceC3540l2, 6, 188);
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.S
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return T.c(modifier, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, Q q10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, q10, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
