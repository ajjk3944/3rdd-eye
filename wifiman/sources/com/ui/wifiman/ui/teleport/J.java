package com.ui.wifiman.ui.teleport;

import Be.v0;
import E0.InterfaceC2629g;
import F.AbstractC2718h;
import Ii.Y;
import L0.C3174d;
import L0.U;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import T.t1;
import W0.j;
import Zg.AbstractC3689v;
import androidx.compose.ui.e;
import com.google.ar.core.ImageMetadata;
import com.ui.wifiman.ui.teleport.A;
import com.ui.wifiman.ui.teleport.J;
import com.ui.wifiman.ui.teleport.y;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f0.c;
import ff.AbstractC5822c;
import ff.EnumC5820a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6778a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import q.AbstractC7385d;
import q.AbstractC7391j;
import q.InterfaceC7386e;
import s9.c;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.W;
import z.Z;
import z.a0;

/* loaded from: classes4.dex */
public abstract class J {

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, B.class, "onTunnelActionButtonClicked", "onTunnelActionButtonClicked()V", 0);
        }

        public final void a() {
            ((B) this.receiver).q0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f44963a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f44964b;

        b(A a10, B b10) {
            this.f44963a = a10;
            this.f44964b = b10;
        }

        public final void a(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.c(z10) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-344699224, i11, -1, "com.ui.wifiman.ui.teleport.TeleportTunnelUi.<anonymous>.<anonymous> (TeleportTunnelUi.kt:263)");
            }
            if (z10) {
                interfaceC3540l.U(659091582);
                e.a aVar = androidx.compose.ui.e.f28771b0;
                androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(aVar, 0.0f, 1, null);
                C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarF);
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
                v0.b(null, interfaceC3540l, 0, 1);
                J.p(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null), interfaceC3540l, 0);
                v0.b(null, interfaceC3540l, 0, 1);
                interfaceC3540l.R();
                interfaceC3540l.J();
            } else if (this.f44963a != null) {
                interfaceC3540l.U(659565603);
                e.a aVar3 = androidx.compose.ui.e.f28771b0;
                androidx.compose.ui.e eVarD = androidx.compose.foundation.m.d(androidx.compose.foundation.layout.r.f(aVar3, 0.0f, 1, null), androidx.compose.foundation.m.a(0, interfaceC3540l, 0, 1), false, null, false, 14, null);
                A a10 = this.f44963a;
                B b10 = this.f44964b;
                C0.C cA2 = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
                int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
                androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarD);
                InterfaceC2629g.a aVar4 = InterfaceC2629g.f3916K;
                InterfaceC6824a interfaceC6824aA2 = aVar4.a();
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
                E1.c(interfaceC3540lA2, cA2, aVar4.e());
                E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar4.g());
                InterfaceC6839p interfaceC6839pB2 = aVar4.b();
                if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                    interfaceC3540lA2.K(Integer.valueOf(iA2));
                    interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
                }
                E1.c(interfaceC3540lA2, eVarE2, aVar4.f());
                C8688k c8688k2 = C8688k.f66923a;
                v0.b(null, interfaceC3540l, 0, 1);
                J.n(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null), a10, b10, interfaceC3540l, 0);
                v0.b(null, interfaceC3540l, 0, 1);
                interfaceC3540l.R();
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(660145086);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f44965a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f44966b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f44967c;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ A f44968a;

            a(A a10) {
                this.f44968a = a10;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-308367526, i10, -1, "com.ui.wifiman.ui.teleport.TunnelCard.<anonymous>.<anonymous>.<anonymous> (TeleportTunnelUi.kt:95)");
                }
                x xVarC = this.f44968a.c();
                if (xVarC != null) {
                    J.g(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), 0.0f, Y0.h.j(12), 1, null), xVarC, interfaceC3540l, 6);
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

        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ A f44969a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ B f44970b;

            b(A a10, B b10) {
                this.f44969a = a10;
                this.f44970b = b10;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1283855505, i10, -1, "com.ui.wifiman.ui.teleport.TunnelCard.<anonymous>.<anonymous>.<anonymous> (TeleportTunnelUi.kt:106)");
                }
                A.a aVarB = this.f44969a.b();
                if (aVarB != null) {
                    J.i(aVarB, androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), Y0.h.j(24), Y0.h.j(16)), this.f44970b, interfaceC3540l, 0);
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

        /* renamed from: com.ui.wifiman.ui.teleport.J$c$c, reason: collision with other inner class name */
        static final class C1625c implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f44971a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ B f44972b;

            /* renamed from: com.ui.wifiman.ui.teleport.J$c$c$a */
            static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f44973a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f44974b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC3551q0 f44975c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(boolean z10, InterfaceC3551q0 interfaceC3551q0, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f44974b = z10;
                    this.f44975c = interfaceC3551q0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f44974b, this.f44975c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f44973a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        this.f44973a = 1;
                        if (Y.a(500L, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    boolean zF = C1625c.f(this.f44975c);
                    boolean z10 = this.f44974b;
                    if (zF != z10) {
                        C1625c.h(this.f44975c, z10);
                    }
                    return Yg.J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            C1625c(androidx.compose.ui.e eVar, B b10) {
                this.f44971a = eVar;
                this.f44972b = b10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean f(InterfaceC3551q0 interfaceC3551q0) {
                return ((Boolean) interfaceC3551q0.getValue()).booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void h(InterfaceC3551q0 interfaceC3551q0, boolean z10) {
                interfaceC3551q0.setValue(Boolean.valueOf(z10));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J i(B b10, InterfaceC3551q0 interfaceC3551q0, boolean z10) {
                h(interfaceC3551q0, z10);
                b10.r0(z10);
                return Yg.J.f24997a;
            }

            public final void e(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(923395794, i10, -1, "com.ui.wifiman.ui.teleport.TunnelCard.<anonymous>.<anonymous>.<anonymous> (TeleportTunnelUi.kt:115)");
                }
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(this.f44971a, 0.0f, 1, null);
                c.b bVarG = f0.c.f46573a.g();
                final B b10 = this.f44972b;
                C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), bVarG, interfaceC3540l, 48);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
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
                E1.c(interfaceC3540lA, cA, aVar.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
                InterfaceC6839p interfaceC6839pB = aVar.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar.f());
                C8688k c8688k = C8688k.f66923a;
                e.a aVar2 = androidx.compose.ui.e.f28771b0;
                a0.a(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(4)), interfaceC3540l, 6);
                interfaceC3540l.U(1983943246);
                Object objF = interfaceC3540l.f();
                InterfaceC3540l.a aVar3 = InterfaceC3540l.f21100a;
                if (objF == aVar3.a()) {
                    objF = t1.d(b10.o0().getValue(), null, 2, null);
                    interfaceC3540l.K(objF);
                }
                final InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
                interfaceC3540l.J();
                boolean zF = f(interfaceC3551q0);
                d.b bVar = new d.b(AbstractC6780c.f53322H3);
                d.b bVar2 = new d.b(AbstractC6780c.f53315G3);
                interfaceC3540l.U(1983951132);
                boolean zT = interfaceC3540l.T(b10);
                Object objF2 = interfaceC3540l.f();
                if (zT || objF2 == aVar3.a()) {
                    objF2 = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.teleport.K
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return J.c.C1625c.i(b10, interfaceC3551q0, ((Boolean) obj).booleanValue());
                        }
                    };
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                rf.v.s(aVar2, zF, bVar, bVar2, (InterfaceC6835l) objF2, interfaceC3540l, 6);
                Boolean bool = (Boolean) o1.b(b10.o0(), null, interfaceC3540l, 0, 1).getValue();
                boolean zBooleanValue = bool.booleanValue();
                Boolean boolValueOf = Boolean.valueOf(f(interfaceC3551q0));
                interfaceC3540l.U(1983968943);
                boolean zC = interfaceC3540l.c(zBooleanValue);
                Object objF3 = interfaceC3540l.f();
                if (zC || objF3 == aVar3.a()) {
                    objF3 = new a(zBooleanValue, interfaceC3551q0, null);
                    interfaceC3540l.K(objF3);
                }
                interfaceC3540l.J();
                T.O.e(boolValueOf, bool, (InterfaceC6839p) objF3, interfaceC3540l, 0);
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                e((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        c(A a10, B b10, androidx.compose.ui.e eVar) {
            this.f44965a = a10;
            this.f44966b = b10;
            this.f44967c = eVar;
        }

        public final void a(InterfaceC8687j UiContentCard, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiContentCard, "$this$UiContentCard");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-130681588, i10, -1, "com.ui.wifiman.ui.teleport.TunnelCard.<anonymous> (TeleportTunnelUi.kt:68)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            float f10 = 16;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), 0.0f, Y0.h.j(f10), 1, null);
            c.b bVarG = f0.c.f46573a.g();
            C8680c.f fVarN = C8680c.f66832a.n(Y0.h.j(f10));
            A a10 = this.f44965a;
            B b10 = this.f44966b;
            androidx.compose.ui.e eVar = this.f44967c;
            C0.C cA = AbstractC8685h.a(fVarN, bVarG, interfaceC3540l, 54);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
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
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            a1.c(AbstractC7930a.a(a10.a(), interfaceC3540l, 0), androidx.compose.foundation.layout.o.m(aVar, 0.0f, c6562a.d(interfaceC3540l, i11).a().a().e(), 0.0f, 0.0f, 13, null), J.z(a10.d().g(), interfaceC3540l, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, J.A(a10.d().g(), interfaceC3540l, 0), interfaceC3540l, 0, 0, 131064);
            rf.j.h(androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), Y0.h.j(24), Y0.h.j(f10)), a10.d(), c6562a.a(interfaceC3540l, i11).e().b(), interfaceC3540l, 0, 0);
            AbstractC7385d.d(c8688k, a10.c() != null, null, null, null, null, b0.c.e(-308367526, true, new a(a10), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            AbstractC7385d.d(c8688k, a10.b() != null, null, null, null, null, b0.c.e(1283855505, true, new b(a10, b10), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            AbstractC7385d.d(c8688k, a10.e(), null, null, null, null, b0.c.e(923395794, true, new C1625c(eVar, b10), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final U A(y yVar, InterfaceC3540l interfaceC3540l, int i10) {
        U uF;
        interfaceC3540l.U(-788008681);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-788008681, i10, -1, "com.ui.wifiman.ui.teleport.textStyle (TeleportTunnelUi.kt:357)");
        }
        if (yVar instanceof y.a) {
            interfaceC3540l.U(-737138484);
            uF = C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).a().f();
            interfaceC3540l.J();
        } else {
            if (!(yVar instanceof y.b) && !(yVar instanceof y.c)) {
                interfaceC3540l.U(-737141102);
                interfaceC3540l.J();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540l.U(-737134036);
            uF = C6562a.f52458a.c(interfaceC3540l, C6562a.f52459b).b().f();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return uF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final androidx.compose.ui.e eVar, final x xVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-935714053);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(xVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-935714053, i11, -1, "com.ui.wifiman.ui.teleport.ConnectionSpeed (TeleportTunnelUi.kt:367)");
            }
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(eVar, Y0.h.j(16), 0.0f, 2, null);
            c.a aVar = f0.c.f46573a;
            c.InterfaceC1752c interfaceC1752cL = aVar.l();
            C8680c c8680c = C8680c.f66832a;
            C0.C cB = W.b(c8680c.f(), interfaceC1752cL, interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
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
            Z z10 = Z.f66823a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarA = z10.a(aVar3, 1.0f, true);
            C0.C cB2 = W.b(c8680c.c(), aVar.i(), interfaceC3540lR, 54);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarA);
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
            E1.c(interfaceC3540lA2, cB2, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            Pe.a aVar4 = Pe.a.f18599a;
            s9.b bVarD = aVar4.d();
            float f10 = 20;
            androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar3, Y0.h.j(f10));
            EnumC5820a enumC5820a = EnumC5820a.DOWN;
            AbstractC8049c.c(bVarD, eVarV, C6733v0.g(AbstractC5822c.a(enumC5820a, interfaceC3540lR, 6)), null, interfaceC3540lR, 54, 4);
            float f11 = 2;
            a0.a(androidx.compose.foundation.layout.r.z(aVar3, Y0.h.j(f11)), interfaceC3540lR, 6);
            C3174d c3174dA = AbstractC7930a.a(xVar.a(), interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            a1.c(c3174dA, null, AbstractC5822c.a(enumC5820a, interfaceC3540lR, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i12).b().a(), interfaceC3540lR, 0, 0, 131066);
            interfaceC3540lR.R();
            a0.a(androidx.compose.foundation.layout.r.z(aVar3, Y0.h.j(36)), interfaceC3540lR, 6);
            androidx.compose.ui.e eVarA2 = z10.a(aVar3, 1.0f, true);
            C0.C cB3 = W.b(c8680c.f(), aVar.i(), interfaceC3540lR, 54);
            int iA3 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG3 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540lR, eVarA2);
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
            E1.c(interfaceC3540lA3, cB3, aVar2.e());
            E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar2.g());
            InterfaceC6839p interfaceC6839pB3 = aVar2.b();
            if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                interfaceC3540lA3.K(Integer.valueOf(iA3));
                interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
            }
            E1.c(interfaceC3540lA3, eVarE3, aVar2.f());
            s9.b bVarE = aVar4.e();
            androidx.compose.ui.e eVarV2 = androidx.compose.foundation.layout.r.v(aVar3, Y0.h.j(f10));
            EnumC5820a enumC5820a2 = EnumC5820a.UP;
            AbstractC8049c.c(bVarE, eVarV2, C6733v0.g(AbstractC5822c.a(enumC5820a2, interfaceC3540lR, 6)), null, interfaceC3540lR, 54, 4);
            a0.a(androidx.compose.foundation.layout.r.z(aVar3, Y0.h.j(f11)), interfaceC3540lR, 6);
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(AbstractC7930a.a(xVar.b(), interfaceC3540lR, 0), null, AbstractC5822c.a(enumC5820a2, interfaceC3540lR, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i12).b().a(), interfaceC3540l2, 0, 0, 131066);
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.G
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return J.h(eVar, xVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J h(androidx.compose.ui.e eVar, x xVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        g(eVar, xVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final A.a aVar, final androidx.compose.ui.e eVar, final B b10, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1894941581);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(b10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1894941581, i12, -1, "com.ui.wifiman.ui.teleport.ErrorContent (TeleportTunnelUi.kt:300)");
            }
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.g(), interfaceC3540lR, 48);
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
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            C3174d c3174dA = AbstractC7930a.a(aVar.c(), interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            U uA = c6562a.c(interfaceC3540lR, i13).a().a();
            long jA = c6562a.a(interfaceC3540lR, i13).f().a();
            j.a aVar3 = W0.j.f23523b;
            a1.c(c3174dA, null, jA, 0L, null, null, null, 0L, null, W0.j.h(aVar3.a()), 0L, 0, false, 0, 0, null, null, uA, interfaceC3540lR, 0, 0, 130554);
            e.a aVar4 = androidx.compose.ui.e.f28771b0;
            a0.a(androidx.compose.foundation.layout.r.i(aVar4, Y0.h.j(8)), interfaceC3540lR, 6);
            final C3174d c3174dA2 = AbstractC7930a.a(aVar.b(), interfaceC3540lR, 0);
            U uA2 = c6562a.c(interfaceC3540lR, i13).b().a();
            U uB = uA2.b((15204351 & 1) != 0 ? uA2.f11108a.g() : c6562a.a(interfaceC3540lR, i13).f().b(), (15204351 & 2) != 0 ? uA2.f11108a.k() : 0L, (15204351 & 4) != 0 ? uA2.f11108a.n() : null, (15204351 & 8) != 0 ? uA2.f11108a.l() : null, (15204351 & 16) != 0 ? uA2.f11108a.m() : null, (15204351 & 32) != 0 ? uA2.f11108a.i() : null, (15204351 & 64) != 0 ? uA2.f11108a.j() : null, (15204351 & 128) != 0 ? uA2.f11108a.o() : 0L, (15204351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? uA2.f11108a.e() : null, (15204351 & 512) != 0 ? uA2.f11108a.u() : null, (15204351 & 1024) != 0 ? uA2.f11108a.p() : null, (15204351 & 2048) != 0 ? uA2.f11108a.d() : 0L, (15204351 & 4096) != 0 ? uA2.f11108a.s() : null, (15204351 & 8192) != 0 ? uA2.f11108a.r() : null, (15204351 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? uA2.f11108a.h() : null, (15204351 & 32768) != 0 ? uA2.f11109b.h() : aVar3.a(), (15204351 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uA2.f11109b.i() : 0, (15204351 & 131072) != 0 ? uA2.f11109b.e() : 0L, (15204351 & 262144) != 0 ? uA2.f11109b.j() : null, (15204351 & ImageMetadata.LENS_APERTURE) != 0 ? uA2.f11110c : null, (15204351 & ImageMetadata.SHADING_MODE) != 0 ? uA2.f11109b.f() : null, (15204351 & 2097152) != 0 ? uA2.f11109b.d() : 0, (15204351 & 4194304) != 0 ? uA2.f11109b.c() : 0, (15204351 & 8388608) != 0 ? uA2.f11109b.k() : null);
            interfaceC3540lR.U(-2091024400);
            int i14 = i12 & 896;
            boolean zT = interfaceC3540lR.T(c3174dA2) | (i14 == 256);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.teleport.H
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return J.k(c3174dA2, b10, ((Integer) obj).intValue());
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC2718h.a(c3174dA2, null, uB, false, 0, 0, null, (InterfaceC6835l) objF, interfaceC3540lR, 0, 122);
            s9.d dVarA = aVar.a();
            interfaceC3540l2.U(-2091012030);
            if (dVarA != null) {
                a0.a(androidx.compose.foundation.layout.r.i(aVar4, Y0.h.j(16)), interfaceC3540l2, 6);
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.B(aVar4, 0.0f, Y0.h.j(400), 1, null), 0.0f, 1, null);
                String strB = AbstractC7930a.b(dVarA, interfaceC3540l2, 0);
                interfaceC3540l2.U(1135318541);
                boolean z10 = i14 == 256;
                Object objF2 = interfaceC3540l2.f();
                if (z10 || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new a(b10);
                    interfaceC3540l2.K(objF2);
                }
                interfaceC3540l2.J();
                w9.r.b(eVarH, (InterfaceC6824a) ((th.g) objF2), false, false, null, null, strB, null, interfaceC3540l2, 6, 188);
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.I
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return J.j(aVar, eVar, b10, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j(A.a aVar, androidx.compose.ui.e eVar, B b10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        i(aVar, eVar, b10, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J k(C3174d c3174d, B b10, int i10) {
        if (((C3174d.c) AbstractC3689v.s0(c3174d.j("report", i10, i10))) != null) {
            b10.p0();
        }
        return Yg.J.f24997a;
    }

    public static final void l(final androidx.compose.ui.e modifier, final B vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1801339613);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1801339613, i11, -1, "com.ui.wifiman.ui.teleport.TeleportTunnelUi (TeleportTunnelUi.kt:259)");
            }
            androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(modifier, 0.0f, 1, null);
            C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarF);
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
            E1.c(interfaceC3540lA, cH, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            A a10 = (A) o1.b(vm.n0(), null, interfaceC3540lR, 0, 1).getValue();
            AbstractC7391j.a(Boolean.valueOf(a10 == null), null, null, "crossfade", b0.c.e(-344699224, true, new b(a10, vm), interfaceC3540lR, 54), interfaceC3540lR, 27648, 6);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.D
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return J.m(modifier, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J m(androidx.compose.ui.e eVar, B b10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        l(eVar, b10, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final androidx.compose.ui.e eVar, final A a10, final B b10, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2121247358);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(a10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(b10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2121247358, i11, -1, "com.ui.wifiman.ui.teleport.TunnelCard (TeleportTunnelUi.kt:64)");
            }
            interfaceC3540l2 = interfaceC3540lR;
            B9.h.i(eVar, null, null, null, null, null, null, null, b0.c.e(-130681588, true, new c(a10, b10, eVar), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 100663296, 254);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.E
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return J.o(eVar, a10, b10, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J o(androidx.compose.ui.e eVar, A a10, B b10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        n(eVar, a10, b10, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1303735204);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1303735204, i11, -1, "com.ui.wifiman.ui.teleport.TunnelCardEmpty (TeleportTunnelUi.kt:152)");
            }
            B9.h.i(H9.a.a(eVar, interfaceC3540lR, i11 & 14), null, null, null, null, null, null, null, C5248a.f44984a.a(), interfaceC3540lR, 100663296, 254);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.F
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return J.q(eVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J q(androidx.compose.ui.e eVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        p(eVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rf.f y(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(1071118391);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1071118391, i10, -1, "com.ui.wifiman.ui.teleport.previewTopologyState (TeleportTunnelUi.kt:413)");
        }
        int i11 = AbstractC6778a.f53239l0;
        rf.f fVar = new rf.f(new rf.e("0", new c.a(i11, null, 2, null), new d.c("Console"), new d.c("Online"), z.ONLINE), new rf.e("1", new c.a(i11, null, 2, null), new d.c("Myself"), new d.c("Your Device"), null), new y.b(0.6f));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long z(y yVar, InterfaceC3540l interfaceC3540l, int i10) {
        long jB;
        interfaceC3540l.U(296201476);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(296201476, i10, -1, "com.ui.wifiman.ui.teleport.textColor (TeleportTunnelUi.kt:350)");
        }
        if (yVar instanceof y.a) {
            interfaceC3540l.U(2087611673);
            jB = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
            interfaceC3540l.J();
        } else if (yVar instanceof y.b) {
            interfaceC3540l.U(2087614073);
            jB = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().a();
            interfaceC3540l.J();
        } else {
            if (!(yVar instanceof y.c)) {
                interfaceC3540l.U(2087609006);
                interfaceC3540l.J();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540l.U(2087616537);
            jB = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).f().b();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jB;
    }
}
