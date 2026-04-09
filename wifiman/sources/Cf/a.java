package Cf;

import Af.A;
import Af.B;
import Af.l;
import Af.y;
import C0.C;
import Cf.a;
import Df.a;
import E0.InterfaceC2629g;
import Ee.C2706g;
import Li.N;
import Li.P;
import Li.z;
import S8.j;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.d0;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import f0.c;
import h9.C5969a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import org.kodein.di.DI;
import q.InterfaceC7386e;
import s9.d;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.W;
import z.Z;
import z.a0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2696a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f2697b = b0.c.c(-672471051, false, C0132a.f2702a);

    /* renamed from: c, reason: collision with root package name */
    public static q f2698c = b0.c.c(2099609798, false, b.f2703a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f2699d = b0.c.c(1382743241, false, c.f2704a);

    /* renamed from: e, reason: collision with root package name */
    public static InterfaceC6839p f2700e = b0.c.c(-121209089, false, d.f2705a);

    /* renamed from: f, reason: collision with root package name */
    public static InterfaceC6839p f2701f = b0.c.c(-1545431854, false, e.f2706a);

    /* renamed from: Cf.a$a, reason: collision with other inner class name */
    static final class C0132a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C0132a f2702a = new C0132a();

        C0132a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-672471051, i10, -1, "com.ui.wifiman.ui.wifi.network.ComposableSingletons$WifiNetworkDetailUiKt.lambda-1.<anonymous> (WifiNetworkDetailUi.kt:152)");
            }
            AbstractC8049c.c(Pe.a.f18599a.s(), null, C6733v0.g(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).c().a()), null, interfaceC3540l, 6, 5);
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

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2703a = new b();

        b() {
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2099609798, i10, -1, "com.ui.wifiman.ui.wifi.network.ComposableSingletons$WifiNetworkDetailUiKt.lambda-2.<anonymous> (WifiNetworkDetailUi.kt:159)");
            }
            a0.a(r.i(androidx.compose.ui.e.f28771b0, Y0.h.j(16)), interfaceC3540l, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f2704a = new c();

        c() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1382743241, i10, -1, "com.ui.wifiman.ui.wifi.network.ComposableSingletons$WifiNetworkDetailUiKt.lambda-3.<anonymous> (WifiNetworkDetailUi.kt:174)");
            }
            AbstractC8049c.c(Pe.a.f18599a.s(), null, null, null, interfaceC3540l, 6, 7);
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

    static final class d implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f2705a = new d();

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c() {
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-121209089, i10, -1, "com.ui.wifiman.ui.wifi.network.ComposableSingletons$WifiNetworkDetailUiKt.lambda-4.<anonymous> (WifiNetworkDetailUi.kt:163)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C8680c c8680c = C8680c.f66832a;
            C8680c.m mVarG = c8680c.g();
            c.a aVar2 = f0.c.f46573a;
            C cA = AbstractC8685h.a(mVarG, aVar2.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar);
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
            float f10 = 16;
            a0.a(r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
            androidx.compose.ui.e eVarH = r.h(aVar, 0.0f, 1, null);
            C cB = W.b(c8680c.f(), aVar2.l(), interfaceC3540l, 0);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
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
            Z z10 = Z.f66823a;
            A.b(aVar, null, interfaceC3540l, 6, 2);
            androidx.compose.ui.e eVarV = r.v(aVar, Y0.h.j(24));
            interfaceC3540l.U(-677880530);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Cf.b
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return a.d.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            N.Z.a((InterfaceC6824a) objF, eVarV, false, null, a.f2696a.c(), interfaceC3540l, 24630, 12);
            interfaceC3540l.R();
            a0.a(r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
            androidx.compose.foundation.layout.d.a(r.i(aVar, Y0.h.j(164)), interfaceC3540l, 6);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class e implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final e f2706a = new e();

        /* renamed from: Cf.a$e$a, reason: collision with other inner class name */
        public static final class C0133a extends Cf.d {

            /* renamed from: g, reason: collision with root package name */
            private final z f2707g = P.a(new d.c("WiFI Home"));

            /* renamed from: h, reason: collision with root package name */
            private final z f2708h;

            /* renamed from: i, reason: collision with root package name */
            private final z f2709i;

            /* renamed from: j, reason: collision with root package name */
            private final z f2710j;

            /* renamed from: k, reason: collision with root package name */
            private final N f2711k;

            /* renamed from: l, reason: collision with root package name */
            private final N f2712l;

            C0133a(InterfaceC3540l interfaceC3540l) {
                List listO = AbstractC3689v.o(1, 2, 3, 4, 5);
                S8.j jVarA = S8.j.f20385c.a(d0.c(j.b.C0730b.f20389a));
                s9.d dVarC = jVarA != null ? y.c(jVarA) : null;
                AbstractC6492s.f(dVarC);
                this.f2708h = P.a(new Df.b(listO, dVarC));
                this.f2709i = P.a(Boolean.TRUE);
                S8.c cVar = S8.c.GHZ_2_4;
                this.f2710j = P.a(new Bf.b(cVar, AbstractC3689v.l()));
                this.f2711k = P.a(new B(cVar, AbstractC3689v.i1(S8.c.getEntries()), null, 4, null));
                this.f2712l = P.a(new C2706g(AbstractC3689v.e(new C2706g.a.C0194a("accessPoints", new d.c("Access Points (3)"), null, AbstractC3689v.o(new a.C0159a(l.o("ap0", null, null, false, null, null, null, null, interfaceC3540l, 6, 254)), new a.C0159a(l.o("ap1", null, null, false, null, null, null, null, interfaceC3540l, 6, 254)), new a.C0159a(l.o("ap2", null, null, false, null, null, null, null, interfaceC3540l, 6, 254))), 4, null))));
            }

            @Override // org.kodein.di.c
            /* renamed from: d */
            public DI getDi() {
                throw new IllegalStateException();
            }

            @Override // Cf.d
            public N n0() {
                return this.f2712l;
            }

            @Override // Cf.d
            public N s0() {
                return this.f2711k;
            }

            @Override // Cf.d
            public void t0(C5969a bssid) {
                AbstractC6492s.i(bssid, "bssid");
            }

            @Override // Cf.d
            public void u0() {
            }

            @Override // Cf.d
            public void v0(S8.c cVar) {
            }

            @Override // Cf.d
            /* renamed from: w0, reason: merged with bridge method [inline-methods] */
            public z o0() {
                return this.f2710j;
            }

            @Override // Cf.d
            /* renamed from: x0, reason: merged with bridge method [inline-methods] */
            public z p0() {
                return this.f2709i;
            }

            @Override // Cf.d
            /* renamed from: y0, reason: merged with bridge method [inline-methods] */
            public z q0() {
                return this.f2708h;
            }

            @Override // Cf.d
            /* renamed from: z0, reason: merged with bridge method [inline-methods] */
            public z c() {
                return this.f2707g;
            }
        }

        e() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1545431854, i10, -1, "com.ui.wifiman.ui.wifi.network.ComposableSingletons$WifiNetworkDetailUiKt.lambda-5.<anonymous> (WifiNetworkDetailUi.kt:247)");
            }
            h.g(null, new C0133a(interfaceC3540l), interfaceC3540l, 0, 1);
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

    public final InterfaceC6839p a() {
        return f2697b;
    }

    public final q b() {
        return f2698c;
    }

    public final InterfaceC6839p c() {
        return f2699d;
    }

    public final InterfaceC6839p d() {
        return f2700e;
    }
}
