package Fe;

import C0.C;
import E0.InterfaceC2629g;
import N.AbstractC3345t;
import N.O0;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.a0;
import z.j0;

/* loaded from: classes4.dex */
public abstract class e {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f6494a;

        a(InterfaceC6839p interfaceC6839p) {
            this.f6494a = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1848204806, i10, -1, "com.ui.wifiman.ui.component.modal.ModalContainer.<anonymous>.<anonymous> (ModalContainer.kt:30)");
            }
            this.f6494a.invoke(interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final void b(androidx.compose.ui.e eVar, final InterfaceC6839p content, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(content, "content");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2027070536);
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
        if ((2 & i11) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.l(content) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2027070536, i12, -1, "com.ui.wifiman.ui.component.modal.ModalContainer (ModalContainer.kt:18)");
            }
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540lR, 0);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar3);
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
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            a0.a(j0.c(aVar2), interfaceC3540lR, 0);
            Q.b bVar = Q.b.f18744a;
            interfaceC3540l2 = interfaceC3540lR;
            O0.a(aVar2, bVar.b(interfaceC3540lR, 6), C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().b(), ((C6733v0) interfaceC3540lR.t(AbstractC3345t.a())).u(), null, bVar.a(), b0.c.e(-1848204806, true, new a(content), interfaceC3540lR, 54), interfaceC3540lR, 1572870, 16);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Fe.d
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return e.c(eVar3, content, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, interfaceC6839p, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
