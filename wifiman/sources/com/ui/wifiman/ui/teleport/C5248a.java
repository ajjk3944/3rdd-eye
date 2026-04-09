package com.ui.wifiman.ui.teleport;

import E0.InterfaceC2629g;
import Li.P;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import androidx.compose.ui.e;
import com.ui.wifiman.ui.teleport.A;
import com.ui.wifiman.ui.teleport.y;
import f0.c;
import j0.AbstractC6234e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import s9.d;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.W;
import z.Z;
import z.a0;

/* renamed from: com.ui.wifiman.ui.teleport.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5248a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5248a f44984a = new C5248a();

    /* renamed from: b, reason: collision with root package name */
    public static mh.q f44985b = b0.c.c(814891094, false, C1627a.f44990a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6839p f44986c = b0.c.c(1886919999, false, b.f44991a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC6839p f44987d = b0.c.c(-1280638025, false, c.f44994a);

    /* renamed from: e, reason: collision with root package name */
    public static InterfaceC6839p f44988e = b0.c.c(1605662096, false, d.f44997a);

    /* renamed from: f, reason: collision with root package name */
    public static InterfaceC6839p f44989f = b0.c.c(529093635, false, e.f45000a);

    /* renamed from: com.ui.wifiman.ui.teleport.a$a, reason: collision with other inner class name */
    static final class C1627a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final C1627a f44990a = new C1627a();

        C1627a() {
        }

        public final void a(InterfaceC8687j UiContentCard, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiContentCard, "$this$UiContentCard");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(814891094, i10, -1, "com.ui.wifiman.ui.teleport.ComposableSingletons$TeleportTunnelUiKt.lambda-1.<anonymous> (TeleportTunnelUi.kt:157)");
            }
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            long jB = c6562a.a(interfaceC3540l, i11).a().g().b();
            e.a aVar = androidx.compose.ui.e.f28771b0;
            float f10 = 16;
            float f11 = 24;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), Y0.h.j(f11), Y0.h.j(f10));
            c.a aVar2 = f0.c.f46573a;
            c.b bVarG = aVar2.g();
            C8680c c8680c = C8680c.f66832a;
            C0.C cA = AbstractC8685h.a(c8680c.n(Y0.h.j(f10)), bVarG, interfaceC3540l, 54);
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
            float f12 = 144;
            androidx.compose.ui.e eVarD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.o.m(AbstractC6234e.a(androidx.compose.foundation.layout.r.B(aVar, Y0.h.j(f12), 0.0f, 2, null), c6562a.b(interfaceC3540l, i11).a()), 0.0f, c6562a.d(interfaceC3540l, i11).a().a().e(), 0.0f, 0.0f, 13, null), jB, null, 2, null);
            y.a aVar4 = y.a.f45163a;
            a1.b("", eVarD, c6562a.a(interfaceC3540l, i11).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 1, null, J.A(aVar4, interfaceC3540l, 6), interfaceC3540l, 6, 24576, 49144);
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(32)), interfaceC3540l, 6);
            float f13 = 8;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(aVar, Y0.h.j(f13), 0.0f, 2, null);
            C0.C cB = W.b(c8680c.f(), aVar2.l(), interfaceC3540l, 0);
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
            Z z10 = Z.f66823a;
            C0.C cA2 = AbstractC8685h.a(c8680c.g(), aVar2.g(), interfaceC3540l, 48);
            int iA3 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540l, aVar);
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
            E1.c(interfaceC3540lA3, cA2, aVar3.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar3.g());
            InterfaceC6839p interfaceC6839pB3 = aVar3.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar3.f());
            float f14 = 68;
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.d(AbstractC6234e.a(androidx.compose.foundation.layout.r.w(aVar, Y0.h.j(f14), Y0.h.j(f14)), c6562a.b(interfaceC3540l, i11).a()), jB, null, 2, null), interfaceC3540l, 0);
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(f13)), interfaceC3540l, 6);
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.d(AbstractC6234e.a(androidx.compose.foundation.layout.r.w(aVar, Y0.h.j(f14), Y0.h.j(f11)), c6562a.b(interfaceC3540l, i11).a()), jB, null, 2, null), interfaceC3540l, 0);
            interfaceC3540l.R();
            a0.a(z10.a(androidx.compose.foundation.layout.r.z(aVar, Y0.h.j(120)), 1.0f, false), interfaceC3540l, 0);
            C0.C cA3 = AbstractC8685h.a(c8680c.g(), aVar2.k(), interfaceC3540l, 0);
            int iA4 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG4 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE4 = androidx.compose.ui.c.e(interfaceC3540l, aVar);
            InterfaceC6824a interfaceC6824aA4 = aVar3.a();
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
            E1.c(interfaceC3540lA4, cA3, aVar3.e());
            E1.c(interfaceC3540lA4, interfaceC3563xG4, aVar3.g());
            InterfaceC6839p interfaceC6839pB4 = aVar3.b();
            if (interfaceC3540lA4.o() || !AbstractC6492s.d(interfaceC3540lA4.f(), Integer.valueOf(iA4))) {
                interfaceC3540lA4.K(Integer.valueOf(iA4));
                interfaceC3540lA4.Q(Integer.valueOf(iA4), interfaceC6839pB4);
            }
            E1.c(interfaceC3540lA4, eVarE4, aVar3.f());
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.d(AbstractC6234e.a(androidx.compose.foundation.layout.r.w(aVar, Y0.h.j(f14), Y0.h.j(f14)), c6562a.b(interfaceC3540l, i11).a()), jB, null, 2, null), interfaceC3540l, 0);
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(f13)), interfaceC3540l, 6);
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.d(AbstractC6234e.a(androidx.compose.foundation.layout.r.w(aVar, Y0.h.j(f14), Y0.h.j(f11)), c6562a.b(interfaceC3540l, i11).a()), jB, null, 2, null), interfaceC3540l, 0);
            interfaceC3540l.R();
            interfaceC3540l.R();
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
            a1.b("", androidx.compose.foundation.b.d(AbstractC6234e.a(androidx.compose.foundation.layout.r.B(aVar, Y0.h.j(f12), 0.0f, 2, null), c6562a.b(interfaceC3540l, i11).a()), jB, null, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 1, null, J.A(aVar4, interfaceC3540l, 6), interfaceC3540l, 6, 24576, 49148);
            a1.b("", androidx.compose.foundation.b.d(AbstractC6234e.a(androidx.compose.foundation.layout.r.B(aVar, Y0.h.j(224), 0.0f, 2, null), c6562a.b(interfaceC3540l, i11).a()), jB, null, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 2, null, c6562a.c(interfaceC3540l, i11).b().a(), interfaceC3540l, 6, 24576, 49148);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: com.ui.wifiman.ui.teleport.a$b */
    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44991a = new b();

        /* renamed from: com.ui.wifiman.ui.teleport.a$b$a, reason: collision with other inner class name */
        public static final class C1628a extends B {

            /* renamed from: g, reason: collision with root package name */
            private final Li.z f44992g;

            /* renamed from: h, reason: collision with root package name */
            private final Li.z f44993h = P.a(Boolean.TRUE);

            C1628a(InterfaceC3540l interfaceC3540l) {
                this.f44992g = P.a(new A(new d.c("Connected"), J.y(interfaceC3540l, 0), null, new x(new d.c("128 Mbps"), new d.c("900 Mbps")), true));
            }

            @Override // org.kodein.di.c
            /* renamed from: d */
            public DI getDi() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void p0() {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void q0() {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void r0(boolean z10) {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            /* renamed from: s0, reason: merged with bridge method [inline-methods] */
            public Li.z n0() {
                return this.f44992g;
            }

            @Override // com.ui.wifiman.ui.teleport.B
            /* renamed from: t0, reason: merged with bridge method [inline-methods] */
            public Li.z o0() {
                return this.f44993h;
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
                AbstractC3546o.Q(1886919999, i10, -1, "com.ui.wifiman.ui.teleport.ComposableSingletons$TeleportTunnelUiKt.lambda-2.<anonymous> (TeleportTunnelUi.kt:436)");
            }
            J.l(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new C1628a(interfaceC3540l), interfaceC3540l, 6);
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

    /* renamed from: com.ui.wifiman.ui.teleport.a$c */
    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f44994a = new c();

        /* renamed from: com.ui.wifiman.ui.teleport.a$c$a, reason: collision with other inner class name */
        public static final class C1629a extends B {

            /* renamed from: g, reason: collision with root package name */
            private final Li.z f44995g;

            /* renamed from: h, reason: collision with root package name */
            private final Li.z f44996h = P.a(Boolean.TRUE);

            C1629a(InterfaceC3540l interfaceC3540l) {
                this.f44995g = P.a(new A(new d.c("Offline"), J.y(interfaceC3540l, 0), null, null, true));
            }

            @Override // org.kodein.di.c
            /* renamed from: d */
            public DI getDi() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void p0() {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void q0() {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void r0(boolean z10) {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            /* renamed from: s0, reason: merged with bridge method [inline-methods] */
            public Li.z n0() {
                return this.f44995g;
            }

            @Override // com.ui.wifiman.ui.teleport.B
            /* renamed from: t0, reason: merged with bridge method [inline-methods] */
            public Li.z o0() {
                return this.f44996h;
            }
        }

        c() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1280638025, i10, -1, "com.ui.wifiman.ui.teleport.ComposableSingletons$TeleportTunnelUiKt.lambda-3.<anonymous> (TeleportTunnelUi.kt:469)");
            }
            J.l(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new C1629a(interfaceC3540l), interfaceC3540l, 6);
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

    /* renamed from: com.ui.wifiman.ui.teleport.a$d */
    static final class d implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f44997a = new d();

        /* renamed from: com.ui.wifiman.ui.teleport.a$d$a, reason: collision with other inner class name */
        public static final class C1630a extends B {

            /* renamed from: g, reason: collision with root package name */
            private final Li.z f44998g;

            /* renamed from: h, reason: collision with root package name */
            private final Li.z f44999h = P.a(Boolean.FALSE);

            C1630a(InterfaceC3540l interfaceC3540l) {
                this.f44998g = P.a(new A(new d.c("Offline"), J.y(interfaceC3540l, 0), new A.a(new d.b(AbstractC6780c.f53357M3), new d.b(AbstractC6780c.f53350L3), new d.c("Action")), null, true));
            }

            @Override // org.kodein.di.c
            /* renamed from: d */
            public DI getDi() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void p0() {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void q0() {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void r0(boolean z10) {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            /* renamed from: s0, reason: merged with bridge method [inline-methods] */
            public Li.z n0() {
                return this.f44998g;
            }

            @Override // com.ui.wifiman.ui.teleport.B
            /* renamed from: t0, reason: merged with bridge method [inline-methods] */
            public Li.z o0() {
                return this.f44999h;
            }
        }

        d() {
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1605662096, i10, -1, "com.ui.wifiman.ui.teleport.ComposableSingletons$TeleportTunnelUiKt.lambda-4.<anonymous> (TeleportTunnelUi.kt:499)");
            }
            J.l(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new C1630a(interfaceC3540l), interfaceC3540l, 6);
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

    /* renamed from: com.ui.wifiman.ui.teleport.a$e */
    static final class e implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final e f45000a = new e();

        /* renamed from: com.ui.wifiman.ui.teleport.a$e$a, reason: collision with other inner class name */
        public static final class C1631a extends B {

            /* renamed from: g, reason: collision with root package name */
            private final Li.z f45001g = P.a(null);

            /* renamed from: h, reason: collision with root package name */
            private final Li.z f45002h = P.a(Boolean.TRUE);

            C1631a() {
            }

            @Override // org.kodein.di.c
            /* renamed from: d */
            public DI getDi() {
                throw new IllegalStateException();
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void p0() {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void q0() {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            public void r0(boolean z10) {
            }

            @Override // com.ui.wifiman.ui.teleport.B
            /* renamed from: s0, reason: merged with bridge method [inline-methods] */
            public Li.z n0() {
                return this.f45001g;
            }

            @Override // com.ui.wifiman.ui.teleport.B
            /* renamed from: t0, reason: merged with bridge method [inline-methods] */
            public Li.z o0() {
                return this.f45002h;
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
                AbstractC3546o.Q(529093635, i10, -1, "com.ui.wifiman.ui.teleport.ComposableSingletons$TeleportTunnelUiKt.lambda-5.<anonymous> (TeleportTunnelUi.kt:533)");
            }
            J.l(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new C1631a(), interfaceC3540l, 6);
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

    public final mh.q a() {
        return f44985b;
    }
}
