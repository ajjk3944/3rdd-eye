package fa;

import C0.C;
import E0.InterfaceC2629g;
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
import Yg.J;
import android.content.res.Resources;
import androidx.compose.ui.e;
import d.AbstractC5263a;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.r;
import q.InterfaceC7383b;
import s.AbstractC7833F;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8681d;
import z.W;
import z.Z;
import z.j0;

/* loaded from: classes3.dex */
public abstract class i {

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, j.class, "onCancelClicked", "onCancelClicked()V", 0);
        }

        public final void a() {
            ((j) this.receiver).e0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class b implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8681d f47217a;

        b(InterfaceC8681d interfaceC8681d) {
            this.f47217a = interfaceC8681d;
        }

        public final void a(InterfaceC7383b AnimatedContent, e eVar, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(AnimatedContent, "$this$AnimatedContent");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1147866847, i10, -1, "com.ui.core.ui.sso.trusted.UiTrustedDeviceLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiTrustedDeviceLayout.kt:104)");
            }
            if (eVar != null) {
                interfaceC3540l.U(-2017020303);
                e.a aVar = androidx.compose.ui.e.f28771b0;
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(eVarH, c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, 2, null);
                c.a aVar2 = f0.c.f46573a;
                c.InterfaceC1752c interfaceC1752cI = aVar2.i();
                C8680c c8680c = C8680c.f66832a;
                C cB = W.b(c8680c.n(Y0.h.j(8)), interfaceC1752cI, interfaceC3540l, 54);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
                InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
                InterfaceC6824a interfaceC6824aA = aVar3.a();
                if (interfaceC3540l.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540l.u();
                if (interfaceC3540l.o()) {
                    interfaceC3540l.D(interfaceC6824aA);
                } else {
                    interfaceC3540l.I();
                }
                InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
                E1.c(interfaceC3540lA, cB, aVar3.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
                InterfaceC6839p interfaceC6839pB = aVar3.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar3.f());
                Z z10 = Z.f66823a;
                AbstractC7833F.a(H0.c.c(P9.a.f18368e, interfaceC3540l, 0), null, null, null, null, 0.0f, null, interfaceC3540l, 48, 124);
                androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
                C cA = AbstractC8685h.a(c8680c.n(Y0.h.j(4)), aVar2.k(), interfaceC3540l, 6);
                int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
                androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarH2);
                InterfaceC6824a interfaceC6824aA2 = aVar3.a();
                if (interfaceC3540l.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540l.u();
                if (interfaceC3540l.o()) {
                    interfaceC3540l.D(interfaceC6824aA2);
                } else {
                    interfaceC3540l.I();
                }
                InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540l);
                E1.c(interfaceC3540lA2, cA, aVar3.e());
                E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
                InterfaceC6839p interfaceC6839pB2 = aVar3.b();
                if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                    interfaceC3540lA2.K(Integer.valueOf(iA2));
                    interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
                }
                E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
                C8688k c8688k = C8688k.f66923a;
                a1.b(eVar.b(), null, c6562a.a(interfaceC3540l, i11).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).a().c(), interfaceC3540l, 0, 0, 65530);
                a1.b(H0.f.a(P9.b.f18419V0, interfaceC3540l, 0), null, c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 65530);
                interfaceC3540l.R();
                interfaceC3540l.R();
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(-2015563675);
                AbstractC3346t0.b(this.f47217a.f(androidx.compose.ui.e.f28771b0, f0.c.f46573a.e()), 0L, 0.0f, 0L, 0, interfaceC3540l, 0, 30);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) throws Resources.NotFoundException {
            a((InterfaceC7383b) obj, (e) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    /* synthetic */ class c extends C6490p implements InterfaceC6824a {
        c(Object obj) {
            super(0, obj, j.class, "onCancelClicked", "onCancelClicked()V", 0);
        }

        public final void a() {
            ((j) this.receiver).e0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public static final void c(final j vm, InterfaceC3540l interfaceC3540l, final int i10) throws Resources.NotFoundException {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1530509706);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(vm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1530509706, i11, -1, "com.ui.core.ui.sso.trusted.UiTrustedDeviceLayout (UiTrustedDeviceLayout.kt:48)");
            }
            interfaceC3540lR.U(705440232);
            int i12 = i11 & 14;
            boolean z10 = i12 == 4;
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(vm);
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            AbstractC5263a.a(false, (InterfaceC6824a) ((th.g) objF), interfaceC3540lR, 0, 1);
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(j0.d(androidx.compose.foundation.layout.r.f(androidx.compose.foundation.b.d(aVar, c6562a.a(interfaceC3540lR, i13).e().a(), null, 2, null), 0.0f, 1, null)), 0.0f, Y0.h.j(36), 0.0f, Y0.h.j(24), 5, null);
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarE = c8680c.e();
            c.a aVar2 = f0.c.f46573a;
            C cA = AbstractC8685h.a(fVarE, aVar2.k(), interfaceC3540lR, 6);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarM);
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
            final f fVar = (f) o1.b(vm.g0(), null, interfaceC3540lR, 0, 1).getValue();
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            C cA2 = AbstractC8685h.a(c8680c.g(), aVar2.k(), interfaceC3540lR, 0);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarH);
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
            float f10 = 16;
            a1.b(H0.f.a(P9.b.f18423X0, interfaceC3540lR, 0), androidx.compose.foundation.layout.o.m(aVar, c6562a.d(interfaceC3540lR, i13).a().a().c(), Y0.h.j(f10), c6562a.d(interfaceC3540lR, i13).a().a().c(), 0.0f, 8, null), c6562a.a(interfaceC3540lR, i13).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540lR, i13).a().e(), interfaceC3540lR, 0, 0, 65528);
            a1.b(H0.f.a(P9.b.f18421W0, interfaceC3540lR, 0), androidx.compose.foundation.layout.o.l(aVar, c6562a.d(interfaceC3540lR, i13).a().a().c(), Y0.h.j(4), c6562a.d(interfaceC3540lR, i13).a().a().c(), Y0.h.j(f10)), c6562a.a(interfaceC3540lR, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540lR, i13).b().a(), interfaceC3540lR, 0, 0, 65528);
            float f11 = 12;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), Y0.h.j(124), 0.0f, 2, null), c6562a.d(interfaceC3540lR, i13).a().a().c(), Y0.h.j(f10)), c6562a.a(interfaceC3540lR, i13).e().b(), E.h.d(Y0.h.j(f11))), 0.0f, Y0.h.j(f11), 1, null);
            C cH = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int iA3 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
            InterfaceC6824a interfaceC6824aA3 = aVar3.a();
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
            E1.c(interfaceC3540lA3, cH, aVar3.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar3.g());
            InterfaceC6839p interfaceC6839pB3 = aVar3.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar3.f());
            androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.f.f28130a;
            androidx.compose.animation.a.a(fVar.b(), fVar2.f(aVar, aVar2.e()), null, null, "device-data-animation", null, b0.c.e(-1147866847, true, new b(fVar2), interfaceC3540lR, 54), interfaceC3540lR, 1597440, 44);
            interfaceC3540lR.R();
            interfaceC3540lR.R();
            androidx.compose.ui.e eVarK2 = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540lR, i13).a().a().c(), 0.0f, 2, null);
            C cA3 = AbstractC8685h.a(c8680c.n(Y0.h.j(8)), aVar2.k(), interfaceC3540lR, 6);
            int iA4 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG4 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE4 = androidx.compose.ui.c.e(interfaceC3540lR, eVarK2);
            InterfaceC6824a interfaceC6824aA4 = aVar3.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA4);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA4 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA4, cA3, aVar3.e());
            E1.c(interfaceC3540lA4, interfaceC3563xG4, aVar3.g());
            InterfaceC6839p interfaceC6839pB4 = aVar3.b();
            if (interfaceC3540lA4.o() || !AbstractC6492s.d(interfaceC3540lA4.f(), Integer.valueOf(iA4))) {
                interfaceC3540lA4.K(Integer.valueOf(iA4));
                interfaceC3540lA4.Q(Integer.valueOf(iA4), interfaceC6839pB4);
            }
            E1.c(interfaceC3540lA4, eVarE4, aVar3.f());
            String strA = H0.f.a(P9.b.f18415T0, interfaceC3540lR, 0);
            boolean zA = fVar.a();
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            interfaceC3540lR.U(523913738);
            boolean zT = interfaceC3540lR.T(fVar) | (i12 == 4);
            Object objF2 = interfaceC3540lR.f();
            if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6824a() { // from class: fa.g
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return i.d(fVar, vm);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            w9.r.b(eVarH2, (InterfaceC6824a) objF2, zA, false, null, null, strA, null, interfaceC3540lR, 6, 184);
            String strA2 = H0.f.a(P9.b.f18417U0, interfaceC3540l2, 0);
            interfaceC3540l2.U(523923462);
            boolean z11 = i12 == 4;
            Object objF3 = interfaceC3540l2.f();
            if (z11 || objF3 == InterfaceC3540l.f21100a.a()) {
                objF3 = new c(vm);
                interfaceC3540l2.K(objF3);
            }
            interfaceC3540l2.J();
            w9.o.c(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), (InterfaceC6824a) ((th.g) objF3), fVar.c(), false, null, strA2, interfaceC3540l2, 6, 24);
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: fa.h
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return i.e(vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(f fVar, j jVar) {
        String strA;
        e eVarB = fVar.b();
        if (eVarB != null && (strA = eVarB.a()) != null) {
            jVar.f0(strA);
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(j jVar, int i10, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
        c(jVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
