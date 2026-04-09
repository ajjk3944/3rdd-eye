package Te;

import E0.InterfaceC2629g;
import N.O0;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.X0;
import Zg.AbstractC3689v;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import f0.c;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.j1;
import ma.AbstractC6784a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;
import sa.AbstractC7930a;
import vf.AbstractC8227g;
import z.C8680c;

/* loaded from: classes4.dex */
public abstract class D {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W f21614a;

        a(W w10) {
            this.f21614a = w10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-851639048, i10, -1, "com.ui.wifiman.ui.signal.components.SignalMapperScale.<anonymous> (FloorplanScale.kt:96)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            W w10 = this.f21614a;
            C8680c c8680c = C8680c.f66832a;
            C8680c.e eVarF = c8680c.f();
            c.a aVar2 = f0.c.f46573a;
            C0.C cB = z.W.b(eVarF, aVar2.l(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
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
            z.Z z10 = z.Z.f66823a;
            D.k(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.b.d(aVar, ((X) AbstractC3689v.q0(w10.b())).b(), null, 2, null), Y0.h.j(16), 0.0f, 2, null), w10.c(), interfaceC3540l, 0);
            androidx.compose.ui.e eVarA = z10.a(aVar, 1.0f, true);
            C0.C cH = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarA);
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
            E1.c(interfaceC3540lA2, cH, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
            C0.C cB2 = z.W.b(c8680c.f(), aVar2.l(), interfaceC3540l, 0);
            int iA3 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l, eVarH2);
            InterfaceC6824a interfaceC6824aA3 = aVar3.a();
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
            E1.c(interfaceC3540lA3, cB2, aVar3.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar3.g());
            InterfaceC6839p interfaceC6839pB3 = aVar3.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar3.f());
            interfaceC3540l.U(991909856);
            int i11 = 0;
            for (Object obj : w10.b()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC3689v.v();
                }
                X x10 = (X) obj;
                interfaceC3540l.U(991911176);
                if (i11 == 0) {
                    D.g(z.Y.b(z10, androidx.compose.ui.e.f28771b0, 0.5f, false, 2, null), new j1(x10.b(), null), interfaceC3540l, 0);
                }
                interfaceC3540l.J();
                e.a aVar4 = androidx.compose.ui.e.f28771b0;
                D.f(z10.a(aVar4, 1.0f, true), x10, interfaceC3540l, 0);
                interfaceC3540l.U(991926233);
                if (i11 == w10.b().size() - 1) {
                    D.g(z.Y.b(z10, aVar4, 0.5f, false, 2, null), new j1(x10.a(), null), interfaceC3540l, 0);
                }
                interfaceC3540l.J();
                i11 = i12;
            }
            interfaceC3540l.J();
            interfaceC3540l.R();
            androidx.compose.ui.e eVarH3 = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            C0.C cB3 = z.W.b(C8680c.f66832a.f(), f0.c.f46573a.l(), interfaceC3540l, 0);
            int iA4 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG4 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE4 = androidx.compose.ui.c.e(interfaceC3540l, eVarH3);
            InterfaceC2629g.a aVar5 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA4 = aVar5.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA4);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA4 = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA4, cB3, aVar5.e());
            E1.c(interfaceC3540lA4, interfaceC3563xG4, aVar5.g());
            InterfaceC6839p interfaceC6839pB4 = aVar5.b();
            if (interfaceC3540lA4.o() || !AbstractC6492s.d(interfaceC3540lA4.f(), Integer.valueOf(iA4))) {
                interfaceC3540lA4.K(Integer.valueOf(iA4));
                interfaceC3540lA4.Q(Integer.valueOf(iA4), interfaceC6839pB4);
            }
            E1.c(interfaceC3540lA4, eVarE4, aVar5.f());
            z.Z z11 = z.Z.f66823a;
            interfaceC3540l.U(991941196);
            Iterator it = w10.b().iterator();
            while (it.hasNext()) {
                D.j(z11.a(androidx.compose.ui.e.f28771b0, 1.0f, true), (X) it.next(), interfaceC3540l, 0);
            }
            interfaceC3540l.J();
            D.k(z11.a(androidx.compose.ui.e.f28771b0, 1.0f, true), new d.c(AbstractC8227g.a(((X) AbstractC3689v.B0(w10.b())).c().j())), interfaceC3540l, 0);
            interfaceC3540l.R();
            interfaceC3540l.R();
            interfaceC3540l.R();
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

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21615a;

        static {
            int[] iArr = new int[Y0.t.values().length];
            try {
                iArr[Y0.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y0.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21615a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final androidx.compose.ui.e eVar, final X x10, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        List listO;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-32816027);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(x10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-32816027, i11, -1, "com.ui.wifiman.ui.signal.components.ScaleColorSegment (FloorplanScale.kt:200)");
            }
            Y0.t tVar = (Y0.t) interfaceC3540lR.t(AbstractC3932k0.m());
            interfaceC3540lR.U(240841853);
            boolean zT = interfaceC3540lR.T(tVar);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                AbstractC6713l0.a aVar = AbstractC6713l0.f52928b;
                int i12 = b.f21615a[tVar.ordinal()];
                if (i12 == 1) {
                    listO = AbstractC3689v.o(C6733v0.g(x10.b()), C6733v0.g(x10.a()));
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listO = AbstractC3689v.o(C6733v0.g(x10.a()), C6733v0.g(x10.b()));
                }
                objF = AbstractC6713l0.a.b(aVar, listO, 0.0f, 0.0f, 0, 14, null);
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            g(eVar, (AbstractC6713l0) objF, interfaceC3540lR, i11 & 14);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.C
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return D.i(eVar, x10, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final androidx.compose.ui.e eVar, final AbstractC6713l0 abstractC6713l0, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(822124204);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(abstractC6713l0) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(822124204, i11, -1, "com.ui.wifiman.ui.signal.components.ScaleColorSegment (FloorplanScale.kt:185)");
            }
            interfaceC3540l2 = interfaceC3540lR;
            a1.b(AbstractC8227g.a(0), androidx.compose.foundation.layout.o.j(androidx.compose.foundation.b.b(eVar, abstractC6713l0, null, 0.0f, 6, null), Y0.h.j(16), Y0.h.j(2)), C6733v0.f52951b.d(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C6562a.f52458a.c(interfaceC3540lR, C6562a.f52459b).a().a(), interfaceC3540l2, 384, 0, 65528);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.A
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return D.h(eVar, abstractC6713l0, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J h(androidx.compose.ui.e eVar, AbstractC6713l0 abstractC6713l0, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        g(eVar, abstractC6713l0, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(androidx.compose.ui.e eVar, X x10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        f(eVar, x10, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final androidx.compose.ui.e eVar, final X x10, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1495502503);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(x10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1495502503, i11, -1, "com.ui.wifiman.ui.signal.components.ScaleTextSegment (FloorplanScale.kt:174)");
            }
            k(eVar, new d.c(AbstractC8227g.a(x10.c().i())), interfaceC3540lR, i11 & 14);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.B
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return D.m(eVar, x10, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final androidx.compose.ui.e eVar, final s9.d dVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(840213726);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(dVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(840213726, i11, -1, "com.ui.wifiman.ui.signal.components.ScaleTextSegment (FloorplanScale.kt:159)");
            }
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(AbstractC7930a.a(dVar, interfaceC3540lR, (i11 >> 3) & 14), androidx.compose.foundation.layout.o.k(eVar, 0.0f, Y0.h.j(2), 1, null), AbstractC6784a.b.f53648a.f().a(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, C6562a.f52458a.c(interfaceC3540lR, C6562a.f52459b).a().a(), interfaceC3540l2, 0, 0, 130552);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.z
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return D.l(eVar, dVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J l(androidx.compose.ui.e eVar, s9.d dVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        k(eVar, dVar, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(androidx.compose.ui.e eVar, X x10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        j(eVar, x10, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void n(final androidx.compose.ui.e modifier, final W model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-2123934540);
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
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2123934540, i11, -1, "com.ui.wifiman.ui.signal.components.SignalMapperScale (FloorplanScale.kt:90)");
            }
            interfaceC3540l2 = interfaceC3540lR;
            O0.a(androidx.compose.foundation.layout.r.A(modifier, Y0.h.j(200), Y0.h.j(400)), E.h.d(Y0.h.j(14)), 0L, 0L, null, 0.0f, b0.c.e(-851639048, true, new a(model), interfaceC3540lR, 54), interfaceC3540lR, 1572864, 60);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.y
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return D.o(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J o(androidx.compose.ui.e eVar, W w10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        n(eVar, w10, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
