package Te;

import Af.p;
import Be.AbstractC2487w;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.AbstractC3313c0;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.X0;
import Te.C3578e0;
import W0.t;
import androidx.compose.ui.e;
import f0.c;
import j0.AbstractC6230a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.InterfaceC7929a;
import s9.d;
import sa.AbstractC7930a;
import tf.C8085a;
import x9.AbstractC8438h;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: Te.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3582g0 {

    /* renamed from: Te.g0$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3578e0 f21843a;

        a(C3578e0 c3578e0) {
            this.f21843a = c3578e0;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1778658824, i10, -1, "com.ui.wifiman.ui.signal.components.SignalTabApComparisonApItem.<anonymous>.<anonymous> (SignalTabApComparisonApItem.kt:94)");
            }
            AbstractC8438h.m(androidx.compose.ui.e.f28771b0, this.f21843a.h(), null, true, null, interfaceC3540l, 3462, 16);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void b(androidx.compose.ui.e eVar, final C3578e0 model, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        float fA;
        s9.d bVar;
        long jB;
        InterfaceC3540l interfaceC3540l2;
        int i13;
        C3174d c3174dA;
        long jC;
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-273974300);
        int i14 = i11 & 1;
        if (i14 != 0) {
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
            i12 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i14 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-273974300, i12, -1, "com.ui.wifiman.ui.signal.components.SignalTabApComparisonApItem (SignalTabApComparisonApItem.kt:80)");
            }
            float f10 = 8;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(eVar3, Y0.h.j(16), Y0.h.j(f10));
            if (model.c()) {
                interfaceC3540lR.U(-248443208);
                fA = C8085a.f62104a.b(interfaceC3540lR, 6);
            } else {
                interfaceC3540lR.U(-248442311);
                fA = C8085a.f62104a.a(interfaceC3540lR, 6);
            }
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarA = AbstractC6230a.a(eVarJ, fA);
            c.a aVar = f0.c.f46573a;
            c.InterfaceC1752c interfaceC1752cI = aVar.i();
            C8680c c8680c = C8680c.f66832a;
            C0.C cB = z.W.b(c8680c.n(Y0.h.j(12)), interfaceC1752cI, interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarA);
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
            AbstractC3561w.a(AbstractC3313c0.b().d(Boolean.FALSE), b0.c.e(1778658824, true, new a(model), interfaceC3540lR, 54), interfaceC3540lR, T.I0.f20869i | 48);
            InterfaceC7929a interfaceC7929aE = model.e();
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVar4 = eVar3;
            AbstractC2487w.b(interfaceC7929aE, androidx.compose.foundation.layout.r.v(aVar3, Y0.h.j(48)), null, null, null, 0.0f, 0L, interfaceC3540lR, 48, 62);
            androidx.compose.ui.e eVarB = z.Y.b(z10, aVar3, 1.0f, false, 2, null);
            float f11 = 4;
            C0.C cA = AbstractC8685h.a(c8680c.n(Y0.h.j(f11)), aVar.k(), interfaceC3540lR, 54);
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
            C0.C cB2 = z.W.b(c8680c.n(Y0.h.j(f10)), aVar.i(), interfaceC3540lR, 54);
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
            E1.c(interfaceC3540lA3, cB2, aVar2.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar2.g());
            InterfaceC6839p interfaceC6839pB3 = aVar2.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar2.f());
            androidx.compose.ui.e eVarA2 = z10.a(aVar3, 1.0f, false);
            C3578e0.a aVarG = model.g();
            if (aVarG instanceof C3578e0.a.C0803a) {
                bVar = ((C3578e0.a.C0803a) model.g()).a();
            } else {
                if (!(aVarG instanceof C3578e0.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new d.b(AbstractC6780c.f53441Z);
            }
            String strB = AbstractC7930a.b(bVar, interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            L0.U uB = c6562a.c(interfaceC3540lR, i15).b().b();
            C3578e0.a aVarG2 = model.g();
            if (aVarG2 instanceof C3578e0.a.C0803a) {
                interfaceC3540lR.U(-948254288);
                jB = c6562a.a(interfaceC3540lR, i15).f().a();
                interfaceC3540lR.J();
            } else {
                if (!(aVarG2 instanceof C3578e0.a.b)) {
                    interfaceC3540lR.U(-948257886);
                    interfaceC3540lR.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540lR.U(-948251088);
                jB = c6562a.a(interfaceC3540lR, i15).f().b();
                interfaceC3540lR.J();
            }
            long j10 = jB;
            t.a aVar4 = W0.t.f23567a;
            interfaceC3540l2 = interfaceC3540lR;
            a1.b(strB, eVarA2, j10, 0L, null, null, null, 0L, null, null, 0L, aVar4.b(), false, 1, 0, null, uB, interfaceC3540l2, 0, 3120, 55288);
            interfaceC3540l2.U(-948246249);
            if (model.b()) {
                p.a.f721a.c(interfaceC3540l2, 6);
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            a1.b(model.f().d(":"), null, c6562a.a(interfaceC3540l2, i15).f().c(), 0L, null, null, null, 0L, null, null, 0L, aVar4.b(), false, 1, 0, null, c6562a.c(interfaceC3540l2, i15).b().f(), interfaceC3540l2, 0, 3120, 55290);
            interfaceC3540l2.R();
            C0.C cA2 = AbstractC8685h.a(c8680c.n(Y0.h.j(f11)), aVar.j(), interfaceC3540l2, 54);
            int iA4 = AbstractC3536j.a(interfaceC3540l2, 0);
            InterfaceC3563x interfaceC3563xG4 = interfaceC3540l2.G();
            androidx.compose.ui.e eVarE4 = androidx.compose.ui.c.e(interfaceC3540l2, aVar3);
            InterfaceC6824a interfaceC6824aA4 = aVar2.a();
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
            E1.c(interfaceC3540lA4, cA2, aVar2.e());
            E1.c(interfaceC3540lA4, interfaceC3563xG4, aVar2.g());
            InterfaceC6839p interfaceC6839pB4 = aVar2.b();
            if (interfaceC3540lA4.o() || !AbstractC6492s.d(interfaceC3540lA4.f(), Integer.valueOf(iA4))) {
                interfaceC3540lA4.K(Integer.valueOf(iA4));
                interfaceC3540lA4.Q(Integer.valueOf(iA4), interfaceC6839pB4);
            }
            E1.c(interfaceC3540lA4, eVarE4, aVar2.f());
            S8.l lVarI = model.i();
            interfaceC3540l2.U(-276377801);
            if (lVarI == null) {
                c3174dA = null;
                i13 = 0;
            } else {
                i13 = 0;
                c3174dA = AbstractC7930a.a(Ne.f.h(lVarI, true, null, 2, null), interfaceC3540l2, 0);
            }
            interfaceC3540l2.J();
            interfaceC3540l2.U(-276378146);
            if (c3174dA == null) {
                c3174dA = new C3174d(H0.f.a(AbstractC6780c.f53349L2, interfaceC3540l2, i13), null, null, 6, null);
            }
            C3174d c3174d = c3174dA;
            interfaceC3540l2.J();
            L0.U uA = c6562a.c(interfaceC3540l2, i15).b().a();
            if (model.i() != null) {
                interfaceC3540l2.U(-276369519);
                jC = c6562a.a(interfaceC3540l2, i15).f().a();
            } else {
                interfaceC3540l2.U(-276368623);
                jC = c6562a.a(interfaceC3540l2, i15).f().c();
            }
            interfaceC3540l2.J();
            a1.c(c3174d, null, jC, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, uA, interfaceC3540l2, 0, 0, 131066);
            a1.b(AbstractC7930a.b(Ne.h.c(model.a()), interfaceC3540l2, 0), null, c6562a.a(interfaceC3540l2, i15).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l2, i15).b().f(), interfaceC3540l2, 0, 0, 65530);
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.f0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3582g0.c(eVar2, model, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, C3578e0 c3578e0, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, c3578e0, interfaceC3540l, T.L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
