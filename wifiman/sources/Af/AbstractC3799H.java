package af;

import Be.AbstractC2487w;
import E0.InterfaceC2629g;
import L0.C3174d;
import N.O0;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.t1;
import W0.t;
import Zg.AbstractC3689v;
import af.AbstractC3793B;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import b8.AbstractC4075b;
import f0.c;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6537m;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;
import q.AbstractC7385d;
import q.AbstractC7402u;
import q.InterfaceC7386e;
import s9.d;
import sa.AbstractC7930a;
import sh.AbstractC7978m;
import sh.C7974i;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: af.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3799H {

    /* renamed from: af.H$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3792A f26002a;

        a(C3792A c3792a) {
            this.f26002a = c3792a;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(624809678, i10, -1, "com.ui.wifiman.ui.speed.component.LatencyItem.<anonymous>.<anonymous> (SpeedTabLatencyCardUi.kt:176)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar, Y0.h.j(48));
            f0.c cVarE = f0.c.f46573a.e();
            C3792A c3792a = this.f26002a;
            C0.C cH = androidx.compose.foundation.layout.d.h(cVarE, false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarV);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
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
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            AbstractC2487w.b(c3792a.a(), androidx.compose.foundation.layout.r.v(aVar, Y0.h.j(24)), null, null, null, 0.0f, 0L, interfaceC3540l, 48, 62);
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

    /* renamed from: af.H$b */
    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3793B f26003a;

        /* renamed from: af.H$b$a */
        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC3793B f26004a;

            a(AbstractC3793B abstractC3793B) {
                this.f26004a = abstractC3793B;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1534765344, i10, -1, "com.ui.wifiman.ui.speed.component.SpeedTabLatencyCardUi.<anonymous>.<anonymous>.<anonymous> (SpeedTabLatencyCardUi.kt:102)");
                }
                AbstractC3793B abstractC3793B = this.f26004a;
                if ((abstractC3793B instanceof AbstractC3793B.a ? (AbstractC3793B.a) abstractC3793B : null) != null) {
                    AbstractC3799H.j(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), (AbstractC3793B.a) abstractC3793B, interfaceC3540l, 6);
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

        b(AbstractC3793B abstractC3793B) {
            this.f26003a = abstractC3793B;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(547745262, i10, -1, "com.ui.wifiman.ui.speed.component.SpeedTabLatencyCardUi.<anonymous> (SpeedTabLatencyCardUi.kt:77)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            float f10 = 16;
            float f11 = 8;
            androidx.compose.ui.e eVarB = androidx.compose.animation.f.b(androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.k(androidx.compose.foundation.layout.o.j(aVar, Y0.h.j(f10), Y0.h.j(f11)), Y0.h.j(60), 0.0f, 2, null), 0.0f, 1, null), null, null, 3, null);
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(Y0.h.j(f10));
            AbstractC3793B abstractC3793B = this.f26003a;
            c.a aVar2 = f0.c.f46573a;
            C0.C cA = AbstractC8685h.a(fVarN, aVar2.k(), interfaceC3540l, 6);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarB);
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
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), Y0.h.j(f11), 0.0f, 2, null);
            C0.C cB = z.W.b(c8680c.n(Y0.h.j(f10)), aVar2.i(), interfaceC3540l, 54);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
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
            E1.c(interfaceC3540lA2, cB, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            C3842z.f26194a.b(z.Z.f66823a.a(aVar, 1.0f, true), new d.b(AbstractC6780c.f53624z1), interfaceC3540l, 384, 0);
            Ee.K.b(null, interfaceC3540l, 0, 1);
            interfaceC3540l.R();
            AbstractC7385d.d(c8688k, abstractC3793B instanceof AbstractC3793B.a, null, null, null, null, b0.c.e(-1534765344, true, new a(abstractC3793B), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
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

    private static final void f(androidx.compose.ui.e eVar, final C3792A c3792a, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        int i13;
        C3174d c3174dA;
        InterfaceC3540l interfaceC3540l3;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(166059699);
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
            i12 |= interfaceC3540lR.T(c3792a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l3 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i14 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(166059699, i12, -1, "com.ui.wifiman.ui.speed.component.LatencyItem (SpeedTabLatencyCardUi.kt:170)");
            }
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.g(), interfaceC3540lR, 48);
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
            Be.G.b(null, b0.c.e(624809678, true, new a(c3792a), interfaceC3540lR, 54), interfaceC3540lR, 48, 1);
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, 0.0f, Y0.h.j(2), 0.0f, 0.0f, 13, null);
            C3174d c3174dA2 = AbstractC7930a.a(c3792a.c(), interfaceC3540lR, 0);
            t.a aVar2 = W0.t.f23567a;
            int iB = aVar2.b();
            C6562a c6562a = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            androidx.compose.ui.e eVar4 = eVar3;
            a1.c(c3174dA2, eVarM, c6562a.a(interfaceC3540lR, i15).f().c(), 0L, null, null, null, 0L, null, null, 0L, iB, false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i15).b().f(), interfaceC3540lR, 48, 3120, 120824);
            if (c3792a.d()) {
                interfaceC3540l2 = interfaceC3540lR;
                interfaceC3540l2.U(-1380711568);
                AbstractC4075b abstractC4075bB = c3792a.b();
                i13 = 0;
                s9.d dVarC = abstractC4075bB != null ? Ne.d.c(abstractC4075bB, false) : null;
                interfaceC3540l2.U(925293884);
                c3174dA = dVarC == null ? null : AbstractC7930a.a(dVarC, interfaceC3540l2, 0);
                interfaceC3540l2.J();
                if (c3174dA == null) {
                    c3174dA = AbstractC7930a.a(new d.b(AbstractC6780c.f53627z4), interfaceC3540l2, 0);
                }
                interfaceC3540l2.J();
            } else {
                interfaceC3540l2 = interfaceC3540lR;
                i13 = 0;
                interfaceC3540l2.U(-1380551887);
                c3174dA = AbstractC7930a.a(new d.c(""), interfaceC3540l2, 6);
                interfaceC3540l2.J();
            }
            C3174d c3174d = c3174dA;
            int iB2 = aVar2.b();
            L0.U uF = c6562a.c(interfaceC3540l2, i15).b().f();
            AbstractC4075b abstractC4075bB2 = c3792a.b();
            if (abstractC4075bB2 == null) {
                abstractC4075bB2 = AbstractC4075b.f33002a.a(MPv3.MAX_MESSAGE_ID);
            }
            interfaceC3540l3 = interfaceC3540l2;
            a1.c(c3174d, null, ((C6733v0) AbstractC7402u.a(Ne.d.a(abstractC4075bB2, interfaceC3540l2, i13), null, "latency", null, interfaceC3540l2, 384, 10).getValue()).u(), 0L, null, null, null, 0L, null, null, 0L, iB2, false, 1, 0, null, null, uF, interfaceC3540l3, 0, 3120, 120826);
            interfaceC3540l3.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540l3.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: af.G
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3799H.g(eVar2, c3792a, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(androidx.compose.ui.e eVar, C3792A c3792a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        f(eVar, c3792a, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    private static final void h(final androidx.compose.ui.e eVar, final AbstractC3793B.a aVar, final int i10, final int i11, InterfaceC3540l interfaceC3540l, final int i12) {
        int i13;
        Yg.J j10;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1697029733);
        if ((i12 & 6) == 0) {
            i13 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= interfaceC3540lR.T(aVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= interfaceC3540lR.i(i10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= interfaceC3540lR.i(i11) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1697029733, i13, -1, "com.ui.wifiman.ui.speed.component.LatencyItemRow (SpeedTabLatencyCardUi.kt:148)");
            }
            C0.C cB = z.W.b(C8680c.f66832a.n(Y0.h.j(8)), f0.c.f46573a.l(), interfaceC3540lR, 6);
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
            interfaceC3540lR.U(-563766804);
            if (!aVar.a().isEmpty()) {
                int i14 = i11 * i10;
                Iterator it = AbstractC7978m.s(i14, i14 + i10).iterator();
                while (it.hasNext()) {
                    C3792A c3792a = (C3792A) AbstractC3689v.t0(aVar.a(), ((Zg.Q) it).d());
                    interfaceC3540lR.U(-563761148);
                    if (c3792a == null) {
                        j10 = null;
                    } else {
                        f(z10.a(androidx.compose.ui.e.f28771b0, 1.0f, true), c3792a, interfaceC3540lR, 0, 0);
                        j10 = Yg.J.f24997a;
                    }
                    interfaceC3540lR.J();
                    interfaceC3540lR.U(-563762147);
                    if (j10 == null) {
                        z.a0.a(z10.a(androidx.compose.ui.e.f28771b0, 1.0f, true), interfaceC3540lR, 0);
                    }
                    interfaceC3540lR.J();
                }
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: af.F
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3799H.i(eVar, aVar, i10, i11, i12, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(androidx.compose.ui.e eVar, AbstractC3793B.a aVar, int i10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        h(eVar, aVar, i10, i11, interfaceC3540l, L0.a(i12 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final androidx.compose.ui.e eVar, final AbstractC3793B.a aVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(145989010);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(aVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(145989010, i12, -1, "com.ui.wifiman.ui.speed.component.LatencyItems (SpeedTabLatencyCardUi.kt:117)");
            }
            interfaceC3540lR.U(-2069488252);
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar2 = InterfaceC3540l.f21100a;
            if (objF == aVar2.a()) {
                objF = t1.d(C6537m.c(C6537m.f52356b.b()), null, 2, null);
                interfaceC3540lR.K(objF);
            }
            final InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
            interfaceC3540lR.J();
            Y0.d dVar = (Y0.d) interfaceC3540lR.t(AbstractC3932k0.g());
            long jL = l(interfaceC3551q0);
            interfaceC3540lR.U(-2069484930);
            boolean zJ = interfaceC3540lR.j(jL) | interfaceC3540lR.T(dVar);
            Object objF2 = interfaceC3540lR.f();
            if (zJ || objF2 == aVar2.a()) {
                objF2 = Integer.valueOf(Math.max(1, (int) Math.floor(C6537m.i(l(interfaceC3551q0)) / (Y0.h.j(60) * dVar.getDensity()))));
                interfaceC3540lR.K(objF2);
            }
            int iIntValue = ((Number) objF2).intValue();
            interfaceC3540lR.J();
            interfaceC3540lR.U(-2069477539);
            Object objF3 = interfaceC3540lR.f();
            if (objF3 == aVar2.a()) {
                objF3 = new InterfaceC6835l() { // from class: af.D
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC3799H.n(interfaceC3551q0, (C0.r) obj);
                    }
                };
                interfaceC3540lR.K(objF3);
            }
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarA = androidx.compose.ui.layout.o.a(eVar, (InterfaceC6835l) objF3);
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(4)), f0.c.f46573a.k(), interfaceC3540lR, 6);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarA);
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
            interfaceC3540lR.U(428572392);
            Iterator it = new C7974i(0, aVar.a().size() / iIntValue).iterator();
            while (it.hasNext()) {
                h(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), aVar, iIntValue, ((Zg.Q) it).d(), interfaceC3540lR, (i12 & 112) | 6);
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: af.E
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3799H.k(eVar, aVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J k(androidx.compose.ui.e eVar, AbstractC3793B.a aVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        j(eVar, aVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final long l(InterfaceC3551q0 interfaceC3551q0) {
        return ((C6537m) interfaceC3551q0.getValue()).m();
    }

    private static final void m(InterfaceC3551q0 interfaceC3551q0, long j10) {
        interfaceC3551q0.setValue(C6537m.c(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J n(InterfaceC3551q0 interfaceC3551q0, C0.r it) {
        AbstractC6492s.i(it, "it");
        m(interfaceC3551q0, Y0.s.d(it.h()));
        return Yg.J.f24997a;
    }

    public static final void o(final androidx.compose.ui.e modifier, final AbstractC3793B model, final InterfaceC6824a onCardClicked, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        boolean z10;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        AbstractC6492s.i(onCardClicked, "onCardClicked");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(607956146);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(onCardClicked) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(607956146, i11, -1, "com.ui.wifiman.ui.speed.component.SpeedTabLatencyCardUi (SpeedTabLatencyCardUi.kt:56)");
            }
            interfaceC3540lR.U(-529066779);
            boolean z11 = model instanceof AbstractC3793B.a;
            androidx.compose.ui.e eVarD = androidx.compose.foundation.d.d(modifier, z11, null, null, onCardClicked, 6, null);
            interfaceC3540lR.U(-529066111);
            if (!z11) {
                if (!(model instanceof AbstractC3793B.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVarD = H9.a.a(eVarD, interfaceC3540lR, 0);
            }
            interfaceC3540lR.J();
            interfaceC3540lR.J();
            E.a aVarA = C6562a.f52458a.b(interfaceC3540lR, C6562a.f52459b).a();
            C3842z c3842z = C3842z.f26194a;
            if (z11) {
                z10 = false;
            } else {
                if (!(model instanceof AbstractC3793B.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = true;
            }
            interfaceC3540l2 = interfaceC3540lR;
            O0.a(eVarD, aVarA, ((C6733v0) c3842z.d(z10, 0L, 0L, interfaceC3540l2, 3072, 6).getValue()).u(), 0L, null, 0.0f, b0.c.e(547745262, true, new b(model), interfaceC3540l2, 54), interfaceC3540l2, 1572864, 56);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: af.C
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3799H.p(modifier, model, onCardClicked, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J p(androidx.compose.ui.e eVar, AbstractC3793B abstractC3793B, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        o(eVar, abstractC3793B, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
