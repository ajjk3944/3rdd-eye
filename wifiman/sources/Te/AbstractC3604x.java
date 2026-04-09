package Te;

import E0.InterfaceC2629g;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.X0;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: Te.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3604x {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1904717438);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1904717438, i11, -1, "com.ui.wifiman.ui.signal.components.BottomBar (FloorplanRecordItemLoading.kt:140)");
            }
            C0.C cB = z.W.b(C8680c.f66832a.c(), f0.c.f46573a.i(), interfaceC3540lR, 54);
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
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            float f10 = 16;
            float f11 = 8;
            float f12 = 50;
            androidx.compose.ui.e eVarZ = androidx.compose.foundation.layout.r.z(androidx.compose.foundation.layout.o.j(aVar2, Y0.h.j(f10), Y0.h.j(f11)), Y0.h.j(f12));
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            a1.b("", androidx.compose.foundation.b.d(eVarZ, c6562a.a(interfaceC3540lR, i12).a().g().e(), null, 2, null), c6562a.a(interfaceC3540lR, i12).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 1, null, c6562a.c(interfaceC3540lR, i12).b().b(), interfaceC3540lR, 6, 24576, 49144);
            z.a0.a(androidx.compose.foundation.layout.r.z(aVar2, Y0.h.j(4)), interfaceC3540lR, 6);
            interfaceC3540l2 = interfaceC3540lR;
            a1.b("", androidx.compose.foundation.b.d(androidx.compose.foundation.layout.r.z(androidx.compose.foundation.layout.o.j(aVar2, Y0.h.j(f10), Y0.h.j(f11)), Y0.h.j(f12)), c6562a.a(interfaceC3540lR, i12).a().g().e(), null, 2, null), c6562a.a(interfaceC3540lR, i12).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 1, null, c6562a.c(interfaceC3540lR, i12).b().b(), interfaceC3540l2, 6, 24576, 49144);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.v
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3604x.e(eVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(eVar, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void f(final androidx.compose.ui.e modifier, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-367156661);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-367156661, i11, -1, "com.ui.wifiman.ui.signal.components.FloorplanRecordItemLoading (FloorplanRecordItemLoading.kt:26)");
            }
            B9.h.i(H9.a.a(androidx.compose.foundation.layout.o.j(modifier, C6562a.f52458a.d(interfaceC3540lR, C6562a.f52459b).a().a().c(), Y0.h.j(8)), interfaceC3540lR, 0), null, null, null, null, null, null, null, C3585i.f21850a.a(), interfaceC3540lR, 100663296, 254);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.u
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3604x.g(modifier, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(androidx.compose.ui.e eVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        f(eVar, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1958252048);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1958252048, i11, -1, "com.ui.wifiman.ui.signal.components.TopBar (FloorplanRecordItemLoading.kt:74)");
            }
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(Y0.h.j(12));
            c.a aVar = f0.c.f46573a;
            C0.C cB = z.W.b(fVarN, aVar.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
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
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            z.Z z10 = z.Z.f66823a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar3, Y0.h.j(40));
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.d(eVarV, c6562a.a(interfaceC3540lR, i12).a().g().e(), null, 2, null), interfaceC3540lR, 0);
            androidx.compose.ui.e eVarB = z.Y.b(z10, aVar3, 1.0f, false, 2, null);
            float f10 = 2;
            C0.C cA = AbstractC8685h.a(c8680c.n(Y0.h.j(f10)), aVar.k(), interfaceC3540lR, 6);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarB);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cA, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            float f11 = 50;
            a1.b("", androidx.compose.foundation.b.d(androidx.compose.foundation.layout.r.z(aVar3, Y0.h.j(f11)), c6562a.a(interfaceC3540lR, i12).a().g().e(), null, 2, null), c6562a.a(interfaceC3540lR, i12).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 1, null, c6562a.c(interfaceC3540lR, i12).b().b(), interfaceC3540lR, 6, 24576, 49144);
            float f12 = 35;
            a1.b("", androidx.compose.foundation.b.d(androidx.compose.foundation.layout.r.z(aVar3, Y0.h.j(f12)), c6562a.a(interfaceC3540lR, i12).a().g().e(), null, 2, null), c6562a.a(interfaceC3540lR, i12).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 1, null, c6562a.c(interfaceC3540lR, i12).b().f(), interfaceC3540lR, 6, 24576, 49144);
            interfaceC3540lR.R();
            C0.C cA2 = AbstractC8685h.a(c8680c.n(Y0.h.j(f10)), aVar.j(), interfaceC3540lR, 54);
            int iA3 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540lR, aVar3);
            InterfaceC6824a interfaceC6824aA3 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA3);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA3, cA2, aVar2.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar2.g());
            InterfaceC6839p interfaceC6839pB3 = aVar2.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar2.f());
            a1.b("", androidx.compose.foundation.b.d(androidx.compose.foundation.layout.r.z(aVar3, Y0.h.j(f11)), c6562a.a(interfaceC3540lR, i12).a().g().e(), null, 2, null), c6562a.a(interfaceC3540lR, i12).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 1, null, c6562a.c(interfaceC3540lR, i12).b().b(), interfaceC3540lR, 6, 24576, 49144);
            interfaceC3540l2 = interfaceC3540lR;
            a1.b("", androidx.compose.foundation.b.d(androidx.compose.foundation.layout.r.z(aVar3, Y0.h.j(f12)), c6562a.a(interfaceC3540lR, i12).a().g().e(), null, 2, null), c6562a.a(interfaceC3540lR, i12).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 1, null, c6562a.c(interfaceC3540lR, i12).b().f(), interfaceC3540l2, 6, 24576, 49144);
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.w
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3604x.i(eVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(androidx.compose.ui.e eVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        h(eVar, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
