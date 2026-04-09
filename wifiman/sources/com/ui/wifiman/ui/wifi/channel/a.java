package com.ui.wifiman.ui.wifi.channel;

import Af.A;
import C0.C;
import E0.InterfaceC2629g;
import Ee.C2706g;
import Li.N;
import Li.P;
import Li.z;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import Y0.h;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import s9.d;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.a0;
import zf.C8743f;
import zf.C8745h;
import zf.EnumC8738a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f45166a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC6839p f45167b = b0.c.c(-769788321, false, C1640a.f45169a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f45168c = b0.c.c(2100956210, false, b.f45170a);

    /* renamed from: com.ui.wifiman.ui.wifi.channel.a$a, reason: collision with other inner class name */
    static final class C1640a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final C1640a f45169a = new C1640a();

        C1640a() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-769788321, i10, -1, "com.ui.wifiman.ui.wifi.channel.ComposableSingletons$WifiChannelDetailUiKt.lambda-1.<anonymous> (WifiChannelDetailUi.kt:97)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar);
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
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            float f10 = 16;
            a0.a(r.i(aVar, h.j(f10)), interfaceC3540l, 6);
            A.b(r.h(aVar, 0.0f, 1, null), null, interfaceC3540l, 6, 2);
            a0.a(r.i(aVar, h.j(f10)), interfaceC3540l, 6);
            androidx.compose.foundation.layout.d.a(r.i(aVar, h.j(164)), interfaceC3540l, 6);
            interfaceC3540l.R();
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

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f45170a = new b();

        /* renamed from: com.ui.wifiman.ui.wifi.channel.a$b$a, reason: collision with other inner class name */
        public static final class C1641a extends c {

            /* renamed from: g, reason: collision with root package name */
            private final z f45171g = P.a(new Bf.b(S8.c.GHZ_2_4, AbstractC3689v.l()));

            /* renamed from: h, reason: collision with root package name */
            private final z f45172h = P.a(Ci.a.h(AbstractC3689v.e(new C8745h(S8.d.MHZ_20, true, new d.c("Excellent")))));

            /* renamed from: i, reason: collision with root package name */
            private final z f45173i = P.a(new C8743f(EnumC8738a.INTERFERE, AbstractC3689v.l()));

            /* renamed from: j, reason: collision with root package name */
            private final N f45174j = P.a(new C2706g(AbstractC3689v.l()));

            /* renamed from: k, reason: collision with root package name */
            private final z f45175k = P.a(new d.c("Channel 1"));

            C1641a() {
            }

            @Override // org.kodein.di.c
            public DI d() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.wifi.channel.c
            public N p0() {
                return this.f45174j;
            }

            @Override // com.ui.wifiman.ui.wifi.channel.c
            public void s0(EnumC8738a filter) {
                AbstractC6492s.i(filter, "filter");
            }

            @Override // com.ui.wifiman.ui.wifi.channel.c
            public void t0(C5969a bssid) {
                AbstractC6492s.i(bssid, "bssid");
            }

            @Override // com.ui.wifiman.ui.wifi.channel.c
            /* renamed from: u0, reason: merged with bridge method [inline-methods] */
            public z n0() {
                return this.f45172h;
            }

            @Override // com.ui.wifiman.ui.wifi.channel.c
            /* renamed from: v0, reason: merged with bridge method [inline-methods] */
            public z o0() {
                return this.f45171g;
            }

            @Override // com.ui.wifiman.ui.wifi.channel.c
            /* renamed from: w0, reason: merged with bridge method [inline-methods] */
            public z q0() {
                return this.f45173i;
            }

            @Override // com.ui.wifiman.ui.wifi.channel.c
            /* renamed from: x0, reason: merged with bridge method [inline-methods] */
            public z c() {
                return this.f45175k;
            }
        }

        b() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2100956210, i10, -1, "com.ui.wifiman.ui.wifi.channel.ComposableSingletons$WifiChannelDetailUiKt.lambda-2.<anonymous> (WifiChannelDetailUi.kt:197)");
            }
            f.e(new C1641a(), interfaceC3540l, 0, 0);
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
        return f45167b;
    }
}
