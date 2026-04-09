package Hf;

import Be.AbstractC2487w;
import C0.C;
import E0.InterfaceC2629g;
import N.C0;
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
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import f0.c;
import j0.AbstractC6234e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import sa.AbstractC7930a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.N;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7915a = 60;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7916b = 300;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7917c = 40;

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f7918a;

        /* renamed from: Hf.f$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0327a extends C6490p implements InterfaceC6824a {
            C0327a(Object obj) {
                super(0, obj, d.class, "onPrimaryButtonClicked", "onPrimaryButtonClicked()V", 0);
            }

            public final void a() {
                ((d) this.receiver).r0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* synthetic */ class b extends C6490p implements InterfaceC6824a {
            b(Object obj) {
                super(0, obj, d.class, "onSecondaryButtonClicked", "onSecondaryButtonClicked()V", 0);
            }

            public final void a() {
                ((d) this.receiver).s0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        a(d dVar) {
            this.f7918a = dVar;
        }

        public final void a(N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            C6562a c6562a;
            int i12;
            C6562a c6562a2;
            int i13;
            e.a aVar;
            int i14;
            C6562a c6562a3;
            e.a aVar2;
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(scaffoldPadding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1472623510, i11, -1, "com.ui.wifiman.ui.wizard.AppWizardStepUi.<anonymous> (AppWizardStep.kt:64)");
            }
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = o.h(r.f(aVar3, 0.0f, 1, null), scaffoldPadding);
            C6562a c6562a4 = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            androidx.compose.ui.e eVarK = o.k(eVarH, 0.0f, c6562a4.d(interfaceC3540l, i15).a().b().d(), 1, null);
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(Y0.h.j(8));
            d dVar = this.f7918a;
            c.a aVar4 = f0.c.f46573a;
            C cA = AbstractC8685h.a(fVarN, aVar4.k(), interfaceC3540l, 6);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
            InterfaceC2629g.a aVar5 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar5.a();
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
            E1.c(interfaceC3540lA, cA, aVar5.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar5.g());
            InterfaceC6839p interfaceC6839pB = aVar5.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar5.f());
            C8688k c8688k = C8688k.f66923a;
            float f10 = 16;
            androidx.compose.ui.e eVarL = o.l(InterfaceC8687j.b(c8688k, r.h(aVar3, 0.0f, 1, null), 1.0f, false, 2, null), c6562a4.d(interfaceC3540l, i15).a().a().d(), Y0.h.j(f.f7917c), c6562a4.d(interfaceC3540l, i15).a().a().d(), Y0.h.j(f10));
            C cA2 = AbstractC8685h.a(c8680c.n(Y0.h.j(f10)), aVar4.g(), interfaceC3540l, 54);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarL);
            InterfaceC6824a interfaceC6824aA2 = aVar5.a();
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
            E1.c(interfaceC3540lA2, cA2, aVar5.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar5.g());
            InterfaceC6839p interfaceC6839pB2 = aVar5.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar5.f());
            d dVar2 = dVar;
            AbstractC2487w.b(Pe.b.f18633a.b(), AbstractC6234e.a(r.v(aVar3, Y0.h.j(f.f7915a)), E.h.d(Y0.h.j(12))), null, null, null, 0.0f, 0L, interfaceC3540l, 6, 62);
            s9.d dVar3 = (s9.d) o1.b(dVar2.getTitle(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-1707463604);
            if (dVar3 == null) {
                i12 = i15;
                c6562a = c6562a4;
            } else {
                c6562a = c6562a4;
                i12 = i15;
                a1.c(AbstractC7930a.a(dVar3, interfaceC3540l, 0), null, c6562a4.a(interfaceC3540l, i15).f().a(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, c6562a4.c(interfaceC3540l, i15).a().d(), interfaceC3540l, 0, 0, 130554);
                J j10 = J.f24997a;
            }
            interfaceC3540l.J();
            s9.d dVar4 = (s9.d) o1.b(dVar2.q0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-1707452595);
            if (dVar4 == null) {
                c6562a2 = c6562a;
                i13 = i12;
            } else {
                C6562a c6562a5 = c6562a;
                int i16 = i12;
                c6562a2 = c6562a5;
                i13 = i16;
                a1.c(AbstractC7930a.a(dVar4, interfaceC3540l, 0), null, c6562a5.a(interfaceC3540l, i16).f().a(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, c6562a5.c(interfaceC3540l, i16).b().a(), interfaceC3540l, 0, 0, 130554);
                J j11 = J.f24997a;
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarH2 = r.h(InterfaceC8687j.b(c8688k, aVar3, 1.0f, false, 2, null), 0.0f, 1, null);
            C cH = androidx.compose.foundation.layout.d.h(aVar4.e(), false);
            int iA3 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l, eVarH2);
            InterfaceC6824a interfaceC6824aA3 = aVar5.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA3);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA3, cH, aVar5.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar5.g());
            InterfaceC6839p interfaceC6839pB3 = aVar5.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar5.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            s9.c cVar = (s9.c) o1.b(dVar2.p0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(892399505);
            if (cVar == null) {
                aVar = aVar3;
            } else {
                aVar = aVar3;
                AbstractC2487w.b(cVar, r.v(aVar3, Y0.h.j(f.f7916b)), null, null, null, 0.0f, 0L, interfaceC3540l, 48, 62);
                J j12 = J.f24997a;
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
            interfaceC3540l.R();
            s9.d dVar5 = (s9.d) o1.b(dVar2.n0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-593028217);
            if (dVar5 == null) {
                c6562a3 = c6562a2;
                i14 = i13;
                aVar2 = aVar;
            } else {
                e.a aVar6 = aVar;
                C6562a c6562a6 = c6562a2;
                int i17 = i13;
                androidx.compose.ui.e eVarK2 = o.k(r.h(aVar6, 0.0f, 1, null), c6562a6.d(interfaceC3540l, i17).a().a().a(Y0.h.j(32)), 0.0f, 2, null);
                String strB = AbstractC7930a.b(dVar5, interfaceC3540l, 0);
                interfaceC3540l.U(-1707419644);
                boolean zT = interfaceC3540l.T(dVar2);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C0327a(dVar2);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                dVar2 = dVar2;
                i14 = i17;
                c6562a3 = c6562a6;
                aVar2 = aVar6;
                w9.r.b(eVarK2, (InterfaceC6824a) ((th.g) objF), false, false, null, null, strB, null, interfaceC3540l, 0, 188);
                J j13 = J.f24997a;
            }
            interfaceC3540l.J();
            s9.d dVar6 = (s9.d) o1.b(dVar2.o0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-593015353);
            if (dVar6 != null) {
                androidx.compose.ui.e eVarK3 = o.k(r.h(aVar2, 0.0f, 1, null), c6562a3.d(interfaceC3540l, i14).a().a().a(Y0.h.j(32)), 0.0f, 2, null);
                String strB2 = AbstractC7930a.b(dVar6, interfaceC3540l, 0);
                interfaceC3540l.U(-1707406842);
                Object obj = dVar2;
                boolean zT2 = interfaceC3540l.T(obj);
                Object objF2 = interfaceC3540l.f();
                if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new b(obj);
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                w9.o.c(eVarK3, (InterfaceC6824a) ((th.g) objF2), false, false, null, strB2, interfaceC3540l, 0, 28);
                J j14 = J.f24997a;
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final void b(final d vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1275646868);
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
                AbstractC3546o.Q(1275646868, i11, -1, "com.ui.wifiman.ui.wizard.AppWizardStepUi (AppWizardStep.kt:60)");
            }
            interfaceC3540l2 = interfaceC3540lR;
            C0.a(r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, b0.c.e(1472623510, true, new a(vm), interfaceC3540lR, 54), interfaceC3540l2, 6, 12582912, 131070);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Hf.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return f.c(vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(d dVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(dVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
