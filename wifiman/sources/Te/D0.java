package Te;

import Be.AbstractC2487w;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.X0;
import W0.t;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import ma.AbstractC6784a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import s9.InterfaceC7929a;
import sa.AbstractC7930a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes4.dex */
public abstract class D0 {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6733v0 f21616a;

        a(C6733v0 c6733v0) {
            this.f21616a = c6733v0;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1335968160, i10, -1, "com.ui.wifiman.ui.signal.components.SignalTabStatsItem.<anonymous>.<anonymous> (SignalTabStatsItem.kt:73)");
            }
            C6733v0 c6733v0 = this.f21616a;
            if (c6733v0 != null) {
                c6733v0.u();
                Be.E.b(null, c6733v0.u(), interfaceC3540l, 0, 1);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final B0 model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        int i12;
        long jB;
        int i13;
        e.a aVar;
        InterfaceC3540l interfaceC3540l2;
        int i14;
        L0.U uA;
        long jC;
        e.a aVar2;
        InterfaceC3540l interfaceC3540l3;
        int i15;
        InterfaceC3540l interfaceC3540l4;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1864561564);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l4 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1864561564, i11, -1, "com.ui.wifiman.ui.signal.components.SignalTabStatsItem (SignalTabStatsItem.kt:61)");
            }
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.r.k(modifier, Y0.h.j(60), 0.0f, 2, null);
            C8680c c8680c = C8680c.f66832a;
            float f10 = 8;
            C8680c.f fVarN = c8680c.n(Y0.h.j(f10));
            c.a aVar3 = f0.c.f46573a;
            C0.C cB = z.W.b(fVarN, aVar3.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
            InterfaceC2629g.a aVar4 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar4.a();
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
            E1.c(interfaceC3540lA, cB, aVar4.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar4.g());
            InterfaceC6839p interfaceC6839pB = aVar4.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar4.f());
            z.Z z10 = z.Z.f66823a;
            C6562a c6562a = C6562a.f52458a;
            int i16 = C6562a.f52459b;
            AbstractC6784a abstractC6784aA = c6562a.a(interfaceC3540lR, i16);
            N nA = model.a();
            interfaceC3540lR.U(-760967047);
            boolean zT = interfaceC3540lR.T(nA) | interfaceC3540lR.T(abstractC6784aA);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                N nA2 = model.a();
                objF = nA2 != null ? C6733v0.g(nA2.m2getColorvNxB06k(abstractC6784aA)) : null;
                interfaceC3540lR.K(objF);
            }
            C6733v0 c6733v0 = (C6733v0) objF;
            interfaceC3540lR.J();
            AbstractC7385d.e(z10, c6733v0 != null, null, null, null, null, b0.c.e(1335968160, true, new a(c6733v0), interfaceC3540lR, 54), interfaceC3540lR, 1572870, 30);
            InterfaceC7929a interfaceC7929aC = model.c();
            interfaceC3540lR.U(-760958688);
            if (interfaceC7929aC == null) {
                i12 = 6;
            } else {
                i12 = 6;
                AbstractC2487w.b(interfaceC7929aC, androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(32)), null, null, null, 0.0f, 0L, interfaceC3540lR, 48, 62);
                Yg.J j10 = Yg.J.f24997a;
            }
            interfaceC3540lR.J();
            e.a aVar5 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarA = z10.a(aVar5, 1.0f, true);
            C0.C cA = AbstractC8685h.a(c8680c.b(), aVar3.k(), interfaceC3540lR, i12);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarA);
            InterfaceC6824a interfaceC6824aA2 = aVar4.a();
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
            E1.c(interfaceC3540lA2, cA, aVar4.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar4.g());
            InterfaceC6839p interfaceC6839pB2 = aVar4.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar4.f());
            C8688k c8688k = C8688k.f66923a;
            C0.C cB2 = z.W.b(c8680c.n(Y0.h.j(f10)), aVar3.i(), interfaceC3540lR, 54);
            int iA3 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540lR, aVar5);
            InterfaceC6824a interfaceC6824aA3 = aVar4.a();
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
            E1.c(interfaceC3540lA3, cB2, aVar4.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar4.g());
            InterfaceC6839p interfaceC6839pB3 = aVar4.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar4.f());
            androidx.compose.ui.e eVarA2 = z10.a(aVar5, 1.0f, false);
            C3174d c3174dA = AbstractC7930a.a(model.e(), interfaceC3540lR, 0);
            L0.U uB = c6562a.c(interfaceC3540lR, i16).b().b();
            if (model.g()) {
                interfaceC3540lR.U(1948202458);
                jB = c6562a.a(interfaceC3540lR, i16).f().a();
            } else {
                interfaceC3540lR.U(1948203354);
                jB = c6562a.a(interfaceC3540lR, i16).f().b();
            }
            interfaceC3540lR.J();
            long j11 = jB;
            t.a aVar6 = W0.t.f23567a;
            a1.c(c3174dA, eVarA2, j11, 0L, null, null, null, 0L, null, null, 0L, aVar6.b(), false, 1, 0, null, null, uB, interfaceC3540lR, 0, 3120, 120824);
            De.a aVarF = model.f();
            interfaceC3540lR.U(1948207969);
            if (aVarF != null) {
                aVarF.c(interfaceC3540lR, 0);
                Yg.J j12 = Yg.J.f24997a;
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            s9.d dVarD = model.d();
            interfaceC3540lR.U(-1612972307);
            if (dVarD == null) {
                interfaceC3540l2 = interfaceC3540lR;
                i13 = i16;
                aVar = aVar5;
            } else {
                z.a0.a(androidx.compose.foundation.layout.r.i(aVar5, Y0.h.j(4)), interfaceC3540lR, 6);
                i13 = i16;
                aVar = aVar5;
                interfaceC3540l2 = interfaceC3540lR;
                a1.c(AbstractC7930a.a(model.d(), interfaceC3540lR, 0), null, c6562a.a(interfaceC3540lR, i16).f().c(), 0L, null, null, null, 0L, null, null, 0L, aVar6.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i16).b().f(), interfaceC3540l2, 0, 3120, 120826);
                Yg.J j13 = Yg.J.f24997a;
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            InterfaceC3540l interfaceC3540l5 = interfaceC3540l2;
            C0.C cA2 = AbstractC8685h.a(c8680c.b(), aVar3.j(), interfaceC3540l5, 54);
            int iA4 = AbstractC3536j.a(interfaceC3540l5, 0);
            InterfaceC3563x interfaceC3563xG4 = interfaceC3540l5.G();
            e.a aVar7 = aVar;
            androidx.compose.ui.e eVarE4 = androidx.compose.ui.c.e(interfaceC3540l5, aVar7);
            InterfaceC6824a interfaceC6824aA4 = aVar4.a();
            if (interfaceC3540l5.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l5.u();
            if (interfaceC3540l5.o()) {
                interfaceC3540l5.D(interfaceC6824aA4);
            } else {
                interfaceC3540l5.I();
            }
            InterfaceC3540l interfaceC3540lA4 = E1.a(interfaceC3540l5);
            E1.c(interfaceC3540lA4, cA2, aVar4.e());
            E1.c(interfaceC3540lA4, interfaceC3563xG4, aVar4.g());
            InterfaceC6839p interfaceC6839pB4 = aVar4.b();
            if (interfaceC3540lA4.o() || !AbstractC6492s.d(interfaceC3540lA4.f(), Integer.valueOf(iA4))) {
                interfaceC3540lA4.K(Integer.valueOf(iA4));
                interfaceC3540lA4.Q(Integer.valueOf(iA4), interfaceC6839pB4);
            }
            E1.c(interfaceC3540lA4, eVarE4, aVar4.f());
            s9.d dVarH = model.h();
            interfaceC3540l5.U(-1612954039);
            if (dVarH == null) {
                interfaceC3540l3 = interfaceC3540l5;
                aVar2 = aVar7;
                i15 = i13;
            } else {
                C3174d c3174dA2 = AbstractC7930a.a(model.h(), interfaceC3540l5, 0);
                if (model.i()) {
                    i14 = i13;
                    interfaceC3540l5.U(1948234174);
                    uA = c6562a.c(interfaceC3540l5, i14).b().a();
                } else {
                    interfaceC3540l5.U(1948232864);
                    i14 = i13;
                    uA = c6562a.c(interfaceC3540l5, i14).a().c();
                }
                interfaceC3540l5.J();
                L0.U u10 = uA;
                if (model.i()) {
                    interfaceC3540l5.U(1948237626);
                    jC = c6562a.a(interfaceC3540l5, i14).f().c();
                } else {
                    interfaceC3540l5.U(1948236730);
                    jC = c6562a.a(interfaceC3540l5, i14).f().a();
                }
                interfaceC3540l5.J();
                aVar2 = aVar7;
                interfaceC3540l3 = interfaceC3540l5;
                i15 = i14;
                a1.c(c3174dA2, null, jC, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, u10, interfaceC3540l3, 0, 0, 131066);
                Yg.J j14 = Yg.J.f24997a;
            }
            interfaceC3540l3.J();
            s9.d dVarJ = model.j();
            InterfaceC3540l interfaceC3540l6 = interfaceC3540l3;
            interfaceC3540l6.U(-1612942181);
            if (dVarJ == null) {
                interfaceC3540l4 = interfaceC3540l6;
            } else {
                z.a0.a(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(4)), interfaceC3540l6, 6);
                int i17 = i15;
                interfaceC3540l4 = interfaceC3540l6;
                a1.c(AbstractC7930a.a(model.j(), interfaceC3540l6, 0), null, c6562a.a(interfaceC3540l6, i17).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l6, i17).b().f(), interfaceC3540l4, 0, 0, 131066);
                Yg.J j15 = Yg.J.f24997a;
            }
            interfaceC3540l4.J();
            interfaceC3540l4.R();
            interfaceC3540l4.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l4.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.C0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return D0.c(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, B0 b02, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, b02, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
