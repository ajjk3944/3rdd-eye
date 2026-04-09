package ea;

import C0.C;
import E0.InterfaceC2629g;
import L0.C3174d;
import L0.U;
import L9.AbstractC3198d;
import L9.E;
import N.AbstractC3346t0;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import W0.j;
import Yg.J;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.foundation.m;
import androidx.compose.ui.e;
import d.AbstractC5263a;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m0.k1;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.c;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.a0;
import z.j0;

/* loaded from: classes3.dex */
public abstract class d {

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, e.class, "onToolbarNavigationClicked", "onToolbarNavigationClicked()V", 0);
        }

        public final void a() {
            ((e) this.receiver).j0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6824a {
        b(Object obj) {
            super(0, obj, e.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void a() {
            ((e) this.receiver).i0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public static final void d(final e vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        String strB;
        final e eVar;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1826016875);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(vm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar = vm;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1826016875, i11, -1, "com.ui.core.ui.sso.register.verify.UiEmailVerifyLayout (UiEmailVerifyLayout.kt:40)");
            }
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            float fC = c6562a.d(interfaceC3540lR, i12).a().a().c();
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarF = r.f(j0.a(j0.d(aVar)), 0.0f, 1, null);
            C8680c c8680c = C8680c.f66832a;
            C8680c.m mVarG = c8680c.g();
            c.a aVar2 = f0.c.f46573a;
            C cA = AbstractC8685h.a(mVarG, aVar2.k(), interfaceC3540lR, 0);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarF);
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
            androidx.compose.ui.e eVarH = r.h(aVar, 0.0f, 1, null);
            AbstractC3198d.b bVar = AbstractC3198d.b.f11404b;
            interfaceC3540lR.U(618929799);
            int i13 = i11 & 14;
            boolean z10 = i13 == 4;
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(vm);
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            E.i(eVarH, null, bVar, (InterfaceC6824a) ((th.g) objF), null, 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540lR, (AbstractC3198d.b.f11405c << 6) | 6, 0, 2034);
            interfaceC3540lR.U(618932058);
            boolean z11 = i13 == 4;
            Object objF2 = interfaceC3540lR.f();
            if (z11 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new b(vm);
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            AbstractC5263a.a(false, (InterfaceC6824a) ((th.g) objF2), interfaceC3540lR, 0, 1);
            androidx.compose.ui.e eVarD = m.d(r.f(aVar, 0.0f, 1, null), m.a(0, interfaceC3540lR, 0, 1), false, null, false, 14, null);
            C cA2 = AbstractC8685h.a(c8680c.g(), aVar2.k(), interfaceC3540lR, 0);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarD);
            InterfaceC6824a interfaceC6824aA2 = aVar3.a();
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
            E1.c(interfaceC3540lA2, cA2, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            androidx.compose.ui.e eVarL = o.l(r.h(aVar, 0.0f, 1, null), fC, c6562a.d(interfaceC3540lR, i12).a().b().a(Y0.h.j(24)), fC, c6562a.d(interfaceC3540lR, i12).a().b().d());
            C3174d c3174dA = AbstractC7930a.a(new d.b(P9.b.f18435e), interfaceC3540lR, 0);
            U uE = c6562a.c(interfaceC3540lR, i12).a().e();
            long jB = c6562a.a(interfaceC3540lR, i12).f().b();
            j.a aVar4 = W0.j.f23523b;
            a1.c(c3174dA, eVarL, jB, 0L, null, null, null, 0L, null, W0.j.h(aVar4.a()), 0L, 0, false, 0, 0, null, null, uE, interfaceC3540lR, 0, 0, 130552);
            a1.b((String) o1.b(vm.f0(), null, interfaceC3540lR, 0, 1).getValue(), o.j(r.h(aVar, 0.0f, 1, null), fC, c6562a.d(interfaceC3540lR, i12).a().b().c()), c6562a.a(interfaceC3540lR, i12).f().b(), 0L, null, null, null, 0L, null, W0.j.h(aVar4.a()), 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540lR, i12).b().b(), interfaceC3540lR, 0, 0, 65016);
            a1.c(AbstractC7930a.a(new d.b(P9.b.f18433d), interfaceC3540lR, 0), o.k(r.h(aVar, 0.0f, 1, null), fC, 0.0f, 2, null), c6562a.a(interfaceC3540lR, i12).f().c(), 0L, null, null, null, 0L, null, W0.j.h(aVar4.a()), 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i12).b().a(), interfaceC3540lR, 0, 0, 130552);
            a0.a(InterfaceC8687j.b(c8688k, aVar, 0.5f, false, 2, null), interfaceC3540lR, 0);
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC8049c.e(new c.a(P9.a.f18364a, new d.c("Verification email sent")), o.k(r.D(r.h(aVar, 0.0f, 1, null), null, false, 3, null), Y0.h.j(64), 0.0f, 2, null), null, null, null, null, null, 0.0f, null, interfaceC3540lR, 48, 254);
            a0.a(InterfaceC8687j.b(c8688k, aVar, 1.0f, false, 2, null), interfaceC3540l2, 0);
            int iIntValue = ((Number) o1.b(vm.h0(), null, interfaceC3540l2, 0, 1).getValue()).intValue();
            float f10 = 20;
            androidx.compose.ui.e eVarM = o.m(aVar, 0.0f, 0.0f, 0.0f, c6562a.d(interfaceC3540l2, i12).a().b().a(Y0.h.j(f10)), 7, null);
            C cA3 = AbstractC8685h.a(c8680c.g(), aVar2.g(), interfaceC3540l2, 48);
            int iA3 = AbstractC3536j.a(interfaceC3540l2, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540l2.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l2, eVarM);
            InterfaceC6824a interfaceC6824aA3 = aVar3.a();
            if (interfaceC3540l2.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l2.u();
            if (interfaceC3540l2.o()) {
                interfaceC3540l2.D(interfaceC6824aA3);
            } else {
                interfaceC3540l2.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540l2);
            E1.c(interfaceC3540lA3, cA3, aVar3.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar3.g());
            InterfaceC6839p interfaceC6839pB3 = aVar3.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar3.f());
            C cH = androidx.compose.foundation.layout.d.h(aVar2.e(), false);
            int iA4 = AbstractC3536j.a(interfaceC3540l2, 0);
            InterfaceC3563x interfaceC3563xG4 = interfaceC3540l2.G();
            androidx.compose.ui.e eVarE4 = androidx.compose.ui.c.e(interfaceC3540l2, aVar);
            InterfaceC6824a interfaceC6824aA4 = aVar3.a();
            if (interfaceC3540l2.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l2.u();
            if (interfaceC3540l2.o()) {
                interfaceC3540l2.D(interfaceC6824aA4);
            } else {
                interfaceC3540l2.I();
            }
            InterfaceC3540l interfaceC3540lA4 = E1.a(interfaceC3540l2);
            E1.c(interfaceC3540lA4, cH, aVar3.e());
            E1.c(interfaceC3540lA4, interfaceC3563xG4, aVar3.g());
            InterfaceC6839p interfaceC6839pB4 = aVar3.b();
            if (interfaceC3540lA4.o() || !AbstractC6492s.d(interfaceC3540lA4.f(), Integer.valueOf(iA4))) {
                interfaceC3540lA4.K(Integer.valueOf(iA4));
                interfaceC3540lA4.Q(Integer.valueOf(iA4), interfaceC6839pB4);
            }
            E1.c(interfaceC3540lA4, eVarE4, aVar3.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            boolean zBooleanValue = ((Boolean) o1.b(vm.g0(), null, interfaceC3540l2, 0, 1).getValue()).booleanValue();
            float f11 = 32;
            androidx.compose.ui.e eVarK = o.k(r.h(aVar, 0.0f, 1, null), Y0.h.j(f11), 0.0f, 2, null);
            if (zBooleanValue) {
                interfaceC3540l2.U(1947213240);
                interfaceC3540l2.J();
                strB = "";
            } else if (iIntValue == 0) {
                interfaceC3540l2.U(1863930239);
                strB = H0.f.a(P9.b.f18429b, interfaceC3540l2, 0);
                interfaceC3540l2.J();
            } else {
                interfaceC3540l2.U(1863933265);
                strB = H0.f.b(P9.b.f18431c, new Object[]{String.valueOf(iIntValue)}, interfaceC3540l2, 0);
                interfaceC3540l2.J();
            }
            String str = strB;
            boolean z12 = iIntValue == 0 && !zBooleanValue;
            interfaceC3540l2.U(1863939578);
            boolean z13 = i13 == 4;
            Object objF3 = interfaceC3540l2.f();
            if (z13 || objF3 == InterfaceC3540l.f21100a.a()) {
                objF3 = new InterfaceC6824a() { // from class: ea.a
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return d.f(vm);
                    }
                };
                interfaceC3540l2.K(objF3);
            }
            interfaceC3540l2.J();
            w9.r.b(eVarK, (InterfaceC6824a) objF3, z12, false, null, null, str, null, interfaceC3540l2, 6, 184);
            interfaceC3540l2.U(1863941950);
            if (zBooleanValue) {
                AbstractC3346t0.b(r.v(aVar, Y0.h.j(f10)), c6562a.a(interfaceC3540l2, i12).a().b().f(), Y0.h.j(2), 0L, k1.f52924a.b(), interfaceC3540l2, 390, 8);
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            androidx.compose.ui.e eVarK2 = o.k(r.h(aVar, 0.0f, 1, null), Y0.h.j(f11), 0.0f, 2, null);
            String strA = H0.f.a(P9.b.f18427a, interfaceC3540l2, 0);
            interfaceC3540l2.U(-701595943);
            boolean z14 = i13 == 4;
            Object objF4 = interfaceC3540l2.f();
            if (z14 || objF4 == InterfaceC3540l.f21100a.a()) {
                eVar = vm;
                objF4 = new InterfaceC6824a() { // from class: ea.b
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return d.g(eVar);
                    }
                };
                interfaceC3540l2.K(objF4);
            } else {
                eVar = vm;
            }
            interfaceC3540l2.J();
            w9.o.c(eVarK2, (InterfaceC6824a) objF4, false, false, null, strA, interfaceC3540l2, 6, 28);
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: ea.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d.e(eVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(e eVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(eVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(e eVar) {
        eVar.k0();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(e eVar) {
        eVar.e0();
        return J.f24997a;
    }
}
