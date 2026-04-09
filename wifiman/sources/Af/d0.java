package af;

import Af.p;
import E0.InterfaceC2629g;
import N.O0;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import W0.t;
import Zg.AbstractC3689v;
import af.C3806O;
import android.content.res.Resources;
import androidx.compose.ui.e;
import f0.c;
import j0.AbstractC6234e;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7383b;
import q.InterfaceC7386e;
import s.AbstractC7847h;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.AbstractC8696t;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8675A;

/* loaded from: classes4.dex */
public abstract class d0 {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6733v0 f26088a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3808Q f26089b;

        a(C6733v0 c6733v0, C3808Q c3808q) {
            this.f26088a = c6733v0;
            this.f26089b = c3808q;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1533279711, i10, -1, "com.ui.wifiman.ui.speed.component.BandTabs.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:353)");
            }
            C6733v0 c6733v0 = this.f26088a;
            if (c6733v0 != null) {
                C3808Q c3808q = this.f26089b;
                c6733v0.u();
                float f10 = 4;
                androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, 0.0f, Y0.h.j(f10), 0.0f, 0.0f, 13, null);
                C0.C cB = z.W.b(C8680c.f66832a.n(Y0.h.j(f10)), f0.c.f46573a.i(), interfaceC3540l, 54);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarM);
                InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
                InterfaceC6824a interfaceC6824aA = aVar.a();
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
                E1.c(interfaceC3540lA, cB, aVar.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
                InterfaceC6839p interfaceC6839pB = aVar.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar.f());
                z.Z z10 = z.Z.f66823a;
                Be.E.b(null, c6733v0.u(), interfaceC3540l, 0, 1);
                a1.b(AbstractC7930a.b(c3808q == null ? new d.c("") : c3808q.c() ? p.a.f721a.a() : p.c.f723a.a(), interfaceC3540l, 0), null, c6733v0.u(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).b().f(), interfaceC3540l, 0, 0, 65530);
                interfaceC3540l.R();
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

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3806O f26090a;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3806O f26091a;

            a(C3806O c3806o) {
                this.f26091a = c3806o;
            }

            public final void a(InterfaceC8675A FlowRow, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                AbstractC6492s.i(FlowRow, "$this$FlowRow");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1583200305, i10, -1, "com.ui.wifiman.ui.speed.component.Item.<anonymous>.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:207)");
                }
                Iterator it = this.f26091a.d().iterator();
                while (it.hasNext()) {
                    d0.s(null, (C3806O.b) it.next(), interfaceC3540l, 0, 1);
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                a((InterfaceC8675A) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        b(C3806O c3806o) {
            this.f26090a = c3806o;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-396976950, i10, -1, "com.ui.wifiman.ui.speed.component.Item.<anonymous> (SpeedTabSpeedFactorCardUi.kt:174)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            float f10 = 8;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(aVar, Y0.h.j(f10), Y0.h.j(f10));
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(Y0.h.j(f10));
            C3806O c3806o = this.f26090a;
            c.a aVar2 = f0.c.f46573a;
            C0.C cA = AbstractC8685h.a(fVarN, aVar2.k(), interfaceC3540l, 6);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarJ);
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
            C0.C cB = z.W.b(c8680c.f(), aVar2.i(), interfaceC3540l, 48);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, aVar);
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
            z.Z z10 = z.Z.f66823a;
            String strB = AbstractC7930a.b(c3806o.c(), interfaceC3540l, 0);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            a1.b(strB, aVar, c6562a.a(interfaceC3540l, i11).f().a(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, c6562a.c(interfaceC3540l, i11).a().a(), interfaceC3540l, 48, 3120, 55288);
            z.a0.a(z.Y.b(z10, aVar, 1.0f, false, 2, null), interfaceC3540l, 0);
            d0.u(null, c3806o.b(), interfaceC3540l, 0, 1);
            interfaceC3540l.R();
            AbstractC8696t.a(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c8680c.n(Y0.h.j(16)), c8680c.n(Y0.h.j(4)), 0, 0, null, b0.c.e(-1583200305, true, new a(c3806o), interfaceC3540l, 54), interfaceC3540l, 1573302, 56);
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

    static final class c implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f26092a;

        c(androidx.compose.ui.e eVar) {
            this.f26092a = eVar;
        }

        public final void a(InterfaceC7383b AnimatedContent, C3806O.a targetState, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedContent, "$this$AnimatedContent");
            AbstractC6492s.i(targetState, "targetState");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1919008861, i10, -1, "com.ui.wifiman.ui.speed.component.Rating.<anonymous> (SpeedTabSpeedFactorCardUi.kt:247)");
            }
            if (targetState instanceof C3806O.a.C1006a) {
                interfaceC3540l.U(-1781505182);
                AbstractC8049c.c(Pe.a.f18599a.h(), null, C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).c().c()), null, interfaceC3540l, 6, 5);
                interfaceC3540l.J();
            } else {
                if (!(targetState instanceof C3806O.a.b)) {
                    interfaceC3540l.U(1189456312);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(-1781289298);
                androidx.compose.ui.e eVar = this.f26092a;
                C0.C cB = z.W.b(C8680c.f66832a.f(), f0.c.f46573a.i(), interfaceC3540l, 48);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVar);
                InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
                InterfaceC6824a interfaceC6824aA = aVar.a();
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
                E1.c(interfaceC3540lA, cB, aVar.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
                InterfaceC6839p interfaceC6839pB = aVar.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar.f());
                z.Z z10 = z.Z.f66823a;
                String strB = AbstractC7930a.b(new d.b(AbstractC6780c.f53292D1, AbstractC3689v.e(Integer.valueOf(((C3806O.a.b) targetState).a()))), interfaceC3540l, 0);
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                a1.b(strB, null, c6562a.a(interfaceC3540l, i11).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 0, 0, 65530);
                e.a aVar2 = androidx.compose.ui.e.f28771b0;
                z.a0.a(androidx.compose.foundation.layout.r.z(aVar2, Y0.h.j(4)), interfaceC3540l, 6);
                AbstractC8049c.c(N9.b.f16117a.v(), androidx.compose.foundation.layout.r.v(aVar2, Y0.h.j(20)), C6733v0.g(c6562a.a(interfaceC3540l, i11).c().b()), null, interfaceC3540l, 48, 4);
                interfaceC3540l.R();
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((InterfaceC7383b) obj, (C3806O.a) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3807P f26093a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f26094b;

        d(C3807P c3807p, InterfaceC6835l interfaceC6835l) {
            this.f26093a = c3807p;
            this.f26094b = interfaceC6835l;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1128890906, i10, -1, "com.ui.wifiman.ui.speed.component.SpeedTabSpeedFactorCardUi.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:101)");
            }
            d0.l(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f26093a.g(), this.f26094b, interfaceC3540l, 6, 0);
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

    static final class e implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3807P f26095a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f26096b;

        e(C3807P c3807p, InterfaceC6835l interfaceC6835l) {
            this.f26095a = c3807p;
            this.f26096b = interfaceC6835l;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-304888611, i10, -1, "com.ui.wifiman.ui.speed.component.SpeedTabSpeedFactorCardUi.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:109)");
            }
            if (this.f26095a.b() != null) {
                C3807P c3807p = this.f26095a;
                d0.p(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), c3807p.b(), this.f26096b, interfaceC3540l, 6, 0);
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

    static final class f implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3807P f26097a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f26098b;

        f(C3807P c3807p, InterfaceC6835l interfaceC6835l) {
            this.f26097a = c3807p;
            this.f26098b = interfaceC6835l;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-872860834, i10, -1, "com.ui.wifiman.ui.speed.component.SpeedTabSpeedFactorCardUi.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:119)");
            }
            if (this.f26097a.d() != null) {
                C3807P c3807p = this.f26097a;
                d0.p(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), c3807p.d(), this.f26098b, interfaceC3540l, 6, 0);
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

    static final class g implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3807P f26099a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f26100b;

        g(C3807P c3807p, InterfaceC6835l interfaceC6835l) {
            this.f26099a = c3807p;
            this.f26100b = interfaceC6835l;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1440833057, i10, -1, "com.ui.wifiman.ui.speed.component.SpeedTabSpeedFactorCardUi.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:129)");
            }
            if (this.f26099a.e() != null) {
                C3807P c3807p = this.f26099a;
                d0.p(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), c3807p.e(), this.f26100b, interfaceC3540l, 6, 0);
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

    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26101a;

        static {
            int[] iArr = new int[C3806O.b.a.values().length];
            try {
                iArr[C3806O.b.a.BAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3806O.b.a.CHANNEL_WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3806O.b.a.STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C3806O.b.a.MIMO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C3806O.b.a.SIGNAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C3806O.b.a.CHANNEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C3806O.b.a.UTILIZATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C3806O.b.a.TX_RETRIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C3806O.b.a.PROVIDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f26101a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J A() {
        return Yg.J.f24997a;
    }

    public static final int F(C3806O.b.a aVar) {
        AbstractC6492s.i(aVar, "<this>");
        switch (h.f26101a[aVar.ordinal()]) {
            case 1:
                return AbstractC6780c.f53295D4;
            case 2:
                return AbstractC6780c.f53353M;
            case 3:
                return AbstractC6780c.f53308F3;
            case 4:
                return AbstractC6780c.f53372O4;
            case 5:
                return AbstractC6780c.f53314G2;
            case 6:
                return AbstractC6780c.f53346L;
            case 7:
                return AbstractC6780c.f53363N2;
            case 8:
                return AbstractC6780c.f53324H5;
            case 9:
                return AbstractC6780c.f53355M1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(androidx.compose.ui.e eVar, final Ci.c cVar, final InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        androidx.compose.ui.e eVar3;
        Object next;
        C6733v0 c6733v0G;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1780930013);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6835l) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1780930013, i12, -1, "com.ui.wifiman.ui.speed.component.BandTabs (SpeedTabSpeedFactorCardUi.kt:280)");
            }
            Iterator<E> it = cVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((C3808Q) next).e()) {
                        break;
                    }
                }
            }
            C3808Q c3808q = (C3808Q) next;
            if (c3808q == null && (c3808q = (C3808Q) AbstractC3689v.s0(cVar)) == null) {
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                X0 x0Z = interfaceC3540lR.z();
                if (x0Z != null) {
                    final androidx.compose.ui.e eVar4 = eVar3;
                    x0Z.a(new InterfaceC6839p() { // from class: af.Z
                        @Override // mh.InterfaceC6839p
                        public final Object invoke(Object obj, Object obj2) {
                            return d0.m(eVar4, cVar, interfaceC6835l, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            C3808Q c3808q2 = c3808q;
            C0.C cB = z.W.b(C8680c.f66832a.n(Y0.h.j(4)), f0.c.f46573a.l(), interfaceC3540lR, 6);
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
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            z.Z z10 = z.Z.f66823a;
            androidx.compose.ui.e eVarA = z10.a(androidx.compose.ui.e.f28771b0, 1.0f, true);
            interfaceC3540lR.U(-351751831);
            boolean z11 = (i12 & 896) == 256;
            Object objF = interfaceC3540lR.f();
            if (z11 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: af.a0
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return d0.n(interfaceC6835l, (C3808Q) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            Be.s0.g(eVarA, c3808q2, cVar, (InterfaceC6835l) objF, C3817a.f26060a.a(), interfaceC3540lR, ((i12 << 3) & 896) | 24576, 0);
            if (c3808q2.d() && c3808q2.c()) {
                interfaceC3540lR.U(-351681771);
                long jB = p.a.f721a.b(interfaceC3540lR, 6);
                interfaceC3540lR.J();
                c6733v0G = C6733v0.g(jB);
            } else if (c3808q2.d()) {
                interfaceC3540lR.U(-351679179);
                long jB2 = p.c.f723a.b(interfaceC3540lR, 6);
                interfaceC3540lR.J();
                c6733v0G = C6733v0.g(jB2);
            } else {
                interfaceC3540lR.U(1982875023);
                interfaceC3540lR.J();
                c6733v0G = null;
            }
            AbstractC7385d.e(z10, c6733v0G != null, null, null, null, null, b0.c.e(-1533279711, true, new a(c6733v0G, c3808q2), interfaceC3540lR, 54), interfaceC3540lR, 1572870, 30);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z2 = interfaceC3540lR.z();
        if (x0Z2 != null) {
            final androidx.compose.ui.e eVar5 = eVar3;
            x0Z2.a(new InterfaceC6839p() { // from class: af.b0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d0.o(eVar5, cVar, interfaceC6835l, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(androidx.compose.ui.e eVar, Ci.c cVar, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        l(eVar, cVar, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J n(InterfaceC6835l interfaceC6835l, C3808Q it) {
        AbstractC6492s.i(it, "it");
        interfaceC6835l.invoke(it.a());
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J o(androidx.compose.ui.e eVar, Ci.c cVar, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        l(eVar, cVar, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(androidx.compose.ui.e eVar, final C3806O c3806o, final InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1309983374);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(c3806o) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6835l) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            androidx.compose.ui.e eVar4 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1309983374, i12, -1, "com.ui.wifiman.ui.speed.component.Item (SpeedTabSpeedFactorCardUi.kt:161)");
            }
            float f10 = 8;
            androidx.compose.ui.e eVarA = AbstractC6234e.a(eVar4, E.h.d(Y0.h.j(f10)));
            boolean zE = c3806o.e();
            interfaceC3540lR.U(-313581172);
            boolean z10 = ((i12 & 896) == 256) | ((i12 & 112) == 32);
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: af.X
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return d0.q(interfaceC6835l, c3806o);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarD = androidx.compose.foundation.d.d(eVarA, zE, null, null, (InterfaceC6824a) objF, 6, null);
            E.g gVarD = E.h.d(Y0.h.j(f10));
            float fJ = Y0.h.j(1);
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            eVar3 = eVar4;
            O0.a(eVarD, gVarD, c6562a.a(interfaceC3540lR, i14).e().b(), 0L, AbstractC7847h.a(fJ, c6562a.a(interfaceC3540lR, i14).a().g().f()), 0.0f, b0.c.e(-396976950, true, new b(c3806o), interfaceC3540lR, 54), interfaceC3540lR, 1572864, 40);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar5 = eVar3;
            x0Z.a(new InterfaceC6839p() { // from class: af.Y
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d0.r(eVar5, c3806o, interfaceC6835l, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J q(InterfaceC6835l interfaceC6835l, C3806O c3806o) {
        interfaceC6835l.invoke(c3806o.a());
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J r(androidx.compose.ui.e eVar, C3806O c3806o, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        p(eVar, c3806o, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(androidx.compose.ui.e eVar, final C3806O.b bVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) throws Resources.NotFoundException {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        long jC;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-971945240);
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
            i12 |= interfaceC3540lR.T(bVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-971945240, i12, -1, "com.ui.wifiman.ui.speed.component.ItemValue (SpeedTabSpeedFactorCardUi.kt:221)");
            }
            C0.C cB = z.W.b(C8680c.f66832a.f(), f0.c.f46573a.l(), interfaceC3540lR, 0);
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
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            z.Z z10 = z.Z.f66823a;
            String strA = H0.f.a(F(bVar.b()), interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            L0.U uA = c6562a.c(interfaceC3540lR, i14).b().a();
            long jB = c6562a.a(interfaceC3540lR, i14).f().b();
            t.a aVar2 = W0.t.f23567a;
            a1.b(strA, null, jB, 0L, null, null, null, 0L, null, null, 0L, aVar2.b(), false, 1, 0, null, uA, interfaceC3540lR, 0, 3120, 55290);
            z.a0.a(androidx.compose.foundation.layout.r.z(androidx.compose.ui.e.f28771b0, Y0.h.j(4)), interfaceC3540lR, 6);
            String strB = AbstractC7930a.b(bVar.c(), interfaceC3540lR, 0);
            L0.U uA2 = c6562a.c(interfaceC3540lR, i14).b().a();
            if (bVar.a() != null) {
                interfaceC3540lR.U(861790920);
                jC = Ne.e.b(bVar.a(), interfaceC3540lR, 0);
            } else {
                interfaceC3540lR.U(861791971);
                jC = c6562a.a(interfaceC3540lR, i14).f().c();
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            a1.b(strB, null, jC, 0L, null, null, null, 0L, null, null, 0L, aVar2.b(), false, 1, 0, null, uA2, interfaceC3540l2, 0, 3120, 55290);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: af.T
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d0.t(eVar3, bVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J t(androidx.compose.ui.e eVar, C3806O.b bVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) throws Resources.NotFoundException {
        s(eVar, bVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final androidx.compose.ui.e eVar, final C3806O.a aVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1836237017);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1836237017, i12, -1, "com.ui.wifiman.ui.speed.component.Rating (SpeedTabSpeedFactorCardUi.kt:245)");
            }
            androidx.compose.animation.a.a(aVar, null, null, null, "rating", null, b0.c.e(1919008861, true, new c(eVar), interfaceC3540lR, 54), interfaceC3540lR, ((i12 >> 3) & 14) | 1597440, 46);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: af.c0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d0.v(eVar, aVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J v(androidx.compose.ui.e eVar, C3806O.a aVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        u(eVar, aVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void w(androidx.compose.ui.e r36, final af.C3807P r37, mh.InterfaceC6835l r38, mh.InterfaceC6835l r39, mh.InterfaceC6824a r40, T.InterfaceC3540l r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: af.d0.w(androidx.compose.ui.e, af.P, mh.l, mh.l, mh.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J x(S8.c it) {
        AbstractC6492s.i(it, "it");
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J y(androidx.compose.ui.e eVar, C3807P c3807p, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        w(eVar, c3807p, interfaceC6835l, interfaceC6835l2, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J z(String it) {
        AbstractC6492s.i(it, "it");
        return Yg.J.f24997a;
    }
}
