package com.ui.wifiman.ui.teleport;

import Be.U;
import Ii.AbstractC3063k;
import L9.AbstractC3198d;
import Li.AbstractC3222i;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.X0;
import T.o1;
import T.t1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import c2.AbstractC4197c;
import c2.C4195a;
import com.ui.wifiman.ui.teleport.AbstractC5249b;
import com.ui.wifiman.ui.teleport.AbstractC5250c;
import com.ui.wifiman.ui.teleport.AbstractC5262o;
import com.ui.wifiman.ui.teleport.consoles.i;
import d.AbstractC5263a;
import d.AbstractC5265c;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import of.C7125a;
import s9.d;
import sa.AbstractC7930a;
import ye.AbstractC8664j;
import ye.C8663i;
import z.Y;
import z.j0;

/* renamed from: com.ui.wifiman.ui.teleport.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5262o {

    /* renamed from: com.ui.wifiman.ui.teleport.o$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5251d f45124a;

        a(AbstractC5251d abstractC5251d) {
            this.f45124a = abstractC5251d;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(307972109, i10, -1, "com.ui.wifiman.ui.teleport.TeleportHomeUi.<anonymous> (TeleportHomeUi.kt:44)");
            }
            AbstractC5251d abstractC5251d = this.f45124a;
            interfaceC3540l.U(-1927673007);
            S sA = C4195a.f33733a.a(interfaceC3540l, C4195a.f33735c);
            if (sA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            androidx.lifecycle.N nB = AbstractC4197c.b(C7125a.c.class, sA, null, (P.c) interfaceC3540l.t(AbstractC8664j.c()), null, interfaceC3540l, 0, 16);
            InterfaceC4017o interfaceC4017o = (InterfaceC4017o) interfaceC3540l.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Object objT = interfaceC3540l.t(AbstractC5265c.a());
            AbstractC6492s.g(objT, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) objT;
            Object objT2 = interfaceC3540l.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            interfaceC3540l.U(831146569);
            boolean zL = interfaceC3540l.l(nB) | interfaceC3540l.l(cVar) | interfaceC3540l.l(interfaceC4017o);
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C8663i(nB, interfaceC4017o, cVar);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            T.O.c(objT2, (InterfaceC6835l) objF, interfaceC3540l, 0);
            interfaceC3540l.J();
            AbstractC5262o.q(abstractC5251d, (C7125a.c) nB, interfaceC3540l, 0);
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

    /* renamed from: com.ui.wifiman.ui.teleport.o$b */
    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5251d f45125a;

        b(AbstractC5251d abstractC5251d) {
            this.f45125a = abstractC5251d;
        }

        public final void a(z.N padding, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(padding, "padding");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(padding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(686439668, i10, -1, "com.ui.wifiman.ui.teleport.TeleportHomeUi.<anonymous> (TeleportHomeUi.kt:51)");
            }
            AbstractC5249b abstractC5249b = (AbstractC5249b) o1.b(this.f45125a.n0(), null, interfaceC3540l, 0, 1).getValue();
            if (abstractC5249b instanceof AbstractC5249b.c) {
                interfaceC3540l.U(43511982);
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), padding);
                interfaceC3540l.U(-1927673007);
                S sA = C4195a.f33733a.a(interfaceC3540l, C4195a.f33735c);
                if (sA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                androidx.lifecycle.N nB = AbstractC4197c.b(B.class, sA, null, (P.c) interfaceC3540l.t(AbstractC8664j.c()), null, interfaceC3540l, 0, 16);
                InterfaceC4017o interfaceC4017o = (InterfaceC4017o) interfaceC3540l.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                Object objT = interfaceC3540l.t(AbstractC5265c.a());
                AbstractC6492s.g(objT, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) objT;
                Object objT2 = interfaceC3540l.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                interfaceC3540l.U(831146569);
                boolean zL = interfaceC3540l.l(nB) | interfaceC3540l.l(cVar) | interfaceC3540l.l(interfaceC4017o);
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C8663i(nB, interfaceC4017o, cVar);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                T.O.c(objT2, (InterfaceC6835l) objF, interfaceC3540l, 0);
                interfaceC3540l.J();
                J.l(eVarH, (B) nB, interfaceC3540l, 0);
                interfaceC3540l.J();
            } else if (abstractC5249b instanceof AbstractC5249b.C1634b) {
                interfaceC3540l.U(43519309);
                AbstractC5253f.b(androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), padding), interfaceC3540l, 0);
                interfaceC3540l.J();
            } else {
                if (!(abstractC5249b instanceof AbstractC5249b.a)) {
                    interfaceC3540l.U(43509006);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(1349293974);
                v.d(androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), padding), (AbstractC5249b.a) abstractC5249b, this.f45125a, interfaceC3540l, 0);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((z.N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: com.ui.wifiman.ui.teleport.o$c */
    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f45126a;

        c(InterfaceC3551q0 interfaceC3551q0) {
            this.f45126a = interfaceC3551q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(InterfaceC3551q0 interfaceC3551q0) {
            AbstractC5262o.m(interfaceC3551q0, !AbstractC5262o.l(interfaceC3551q0));
            return Yg.J.f24997a;
        }

        public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(795751132, i10, -1, "com.ui.wifiman.ui.teleport.ToolbarActionsMenu.<anonymous> (TeleportHomeUi.kt:177)");
            }
            s9.b bVarF = N9.b.f16117a.F();
            long jA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).c().a();
            interfaceC3540l.U(202250999);
            final InterfaceC3551q0 interfaceC3551q0 = this.f45126a;
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.teleport.p
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC5262o.c.c(interfaceC3551q0);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            L9.z.c(bVarF, null, jA, false, (InterfaceC6824a) objF, interfaceC3540l, 24576, 10);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: com.ui.wifiman.ui.teleport.o$d */
    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5251d f45127a;

        d(AbstractC5251d abstractC5251d) {
            this.f45127a = abstractC5251d;
        }

        public final void a(Y WifimanToolbar, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(WifimanToolbar, "$this$WifimanToolbar");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(135749782, i10, -1, "com.ui.wifiman.ui.teleport.TunnelToolbar.<anonymous> (TeleportHomeUi.kt:90)");
            }
            AbstractC5262o.k(this.f45127a, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: com.ui.wifiman.ui.teleport.o$e */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f45128a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ He.p f45129b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(He.p pVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f45129b = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new e(this.f45129b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f45128a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            if (this.f45129b.c()) {
                this.f45129b.b();
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: com.ui.wifiman.ui.teleport.o$f */
    static final class f implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7125a.c f45130a;

        f(C7125a.c cVar) {
            this.f45130a = cVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1745272152, i10, -1, "com.ui.wifiman.ui.teleport.TunnelToolbar.<anonymous> (TeleportHomeUi.kt:106)");
            }
            He.k.b(androidx.compose.ui.e.f28771b0, this.f45130a, interfaceC3540l, 6, 0);
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

    /* renamed from: com.ui.wifiman.ui.teleport.o$g */
    static final class g implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ He.p f45131a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5251d f45132b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ii.N f45133c;

        /* renamed from: com.ui.wifiman.ui.teleport.o$g$a */
        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.N f45134a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ He.p f45135b;

            /* renamed from: com.ui.wifiman.ui.teleport.o$g$a$a, reason: collision with other inner class name */
            static final class C1639a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f45136a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ He.p f45137b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1639a(He.p pVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f45137b = pVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C1639a(this.f45137b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f45136a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f45137b.b();
                    return Yg.J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C1639a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            a(Ii.N n10, He.p pVar) {
                this.f45134a = n10;
                this.f45135b = pVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J c(Ii.N n10, He.p pVar) {
                AbstractC3063k.d(n10, null, null, new C1639a(pVar, null), 3, null);
                return Yg.J.f24997a;
            }

            public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1832827533, i10, -1, "com.ui.wifiman.ui.teleport.TunnelToolbar.<anonymous>.<anonymous> (TeleportHomeUi.kt:128)");
                }
                s9.b bVarT = N9.b.f16117a.t();
                long jA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).c().a();
                interfaceC3540l.U(-1356234936);
                boolean zL = interfaceC3540l.l(this.f45134a) | interfaceC3540l.T(this.f45135b);
                final Ii.N n10 = this.f45134a;
                final He.p pVar = this.f45135b;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.teleport.q
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return AbstractC5262o.g.a.c(n10, pVar);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                L9.z.c(bVarT, null, jA, false, (InterfaceC6824a) objF, interfaceC3540l, 0, 10);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        g(He.p pVar, AbstractC5251d abstractC5251d, Ii.N n10) {
            this.f45131a = pVar;
            this.f45132b = abstractC5251d;
            this.f45133c = n10;
        }

        public final void a(Y WifimanToolbarDropdown, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(WifimanToolbarDropdown, "$this$WifimanToolbarDropdown");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1018200985, i10, -1, "com.ui.wifiman.ui.teleport.TunnelToolbar.<anonymous> (TeleportHomeUi.kt:126)");
            }
            if (this.f45131a.c()) {
                interfaceC3540l.U(1537489520);
                L9.L.b(null, b0.c.e(1832827533, true, new a(this.f45133c, this.f45131a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(1537958116);
                AbstractC5262o.k(this.f45132b, interfaceC3540l, 0);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: com.ui.wifiman.ui.teleport.o$h */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f45138a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ He.p f45139b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5251d f45140c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(He.p pVar, AbstractC5251d abstractC5251d, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f45139b = pVar;
            this.f45140c = abstractC5251d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new h(this.f45139b, this.f45140c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f45138a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            if (!this.f45139b.c()) {
                this.f45140c.t0();
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((h) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: com.ui.wifiman.ui.teleport.o$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f45141a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f45142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.teleport.consoles.i f45143c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ He.p f45144d;

        /* renamed from: com.ui.wifiman.ui.teleport.o$i$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f45145a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f45146b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ He.p f45147c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(He.p pVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f45147c = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f45147c, interfaceC5380e);
                aVar.f45146b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f45145a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                if (!(((i.a) this.f45146b) instanceof i.a.C1638a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f45147c.b();
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i.a aVar, InterfaceC5380e interfaceC5380e) {
                return ((a) create(aVar, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(com.ui.wifiman.ui.teleport.consoles.i iVar, He.p pVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f45143c = iVar;
            this.f45144d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            i iVar = new i(this.f45143c, this.f45144d, interfaceC5380e);
            iVar.f45142b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f45141a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            AbstractC3222i.D(AbstractC3222i.I(this.f45143c.b(), new a(this.f45144d, null)), (Ii.N) this.f45142b);
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((i) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(com.ui.wifiman.ui.teleport.AbstractC5251d r31, T.InterfaceC3540l r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.teleport.AbstractC5262o.i(com.ui.wifiman.ui.teleport.d, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j(AbstractC5251d abstractC5251d, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        i(abstractC5251d, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final AbstractC5251d abstractC5251d, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(192128469);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(abstractC5251d) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(192128469, i11, -1, "com.ui.wifiman.ui.teleport.ToolbarActionsMenu (TeleportHomeUi.kt:173)");
            }
            interfaceC3540lR.U(-1338106398);
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = t1.d(Boolean.FALSE, null, 2, null);
                interfaceC3540lR.K(objF);
            }
            final InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
            interfaceC3540lR.J();
            L9.L.b(null, b0.c.e(795751132, true, new c(interfaceC3551q0), interfaceC3540lR, 54), interfaceC3540lR, 48, 1);
            boolean zL = l(interfaceC3551q0);
            interfaceC3540lR.U(-1338095692);
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.teleport.l
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC5262o.n(interfaceC3551q0);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF2;
            interfaceC3540lR.J();
            interfaceC3540lR.U(-1338094158);
            boolean z10 = (i11 & 14) == 4;
            Object objF3 = interfaceC3540lR.f();
            if (z10 || objF3 == aVar.a()) {
                objF3 = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.teleport.m
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC5262o.o(abstractC5251d, interfaceC3551q0, (String) obj);
                    }
                };
                interfaceC3540lR.K(objF3);
            }
            interfaceC3540lR.J();
            U.e(null, zL, interfaceC6824a, 0L, null, (InterfaceC6835l) objF3, (Ci.c) o1.b(abstractC5251d.o0(), null, interfaceC3540lR, 0, 1).getValue(), interfaceC3540lR, 384, 25);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.n
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5262o.p(abstractC5251d, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(InterfaceC3551q0 interfaceC3551q0) {
        return ((Boolean) interfaceC3551q0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(InterfaceC3551q0 interfaceC3551q0, boolean z10) {
        interfaceC3551q0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J n(InterfaceC3551q0 interfaceC3551q0) {
        m(interfaceC3551q0, false);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J o(AbstractC5251d abstractC5251d, InterfaceC3551q0 interfaceC3551q0, String it) {
        AbstractC6492s.i(it, "it");
        m(interfaceC3551q0, false);
        abstractC5251d.w0(it);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J p(AbstractC5251d abstractC5251d, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        k(abstractC5251d, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void q(final AbstractC5251d vm, final C7125a.c accountVM, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        int i12;
        AbstractC3198d bVar;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(vm, "vm");
        AbstractC6492s.i(accountVM, "accountVM");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1160803100);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(vm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(accountVM) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1160803100, i11, -1, "com.ui.wifiman.ui.teleport.TunnelToolbar (TeleportHomeUi.kt:78)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                T.A a10 = new T.A(T.O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            Ii.N nA = ((T.A) objF).a();
            com.ui.wifiman.ui.teleport.consoles.i iVar = (com.ui.wifiman.ui.teleport.consoles.i) interfaceC3540lR.t(Qe.q.r());
            final He.p pVar = (He.p) interfaceC3540lR.t(Qe.q.s());
            final AbstractC5250c abstractC5250c = (AbstractC5250c) o1.b(vm.p0(), null, interfaceC3540lR, 0, 1).getValue();
            if (abstractC5250c instanceof AbstractC5250c.b) {
                interfaceC3540lR.U(694350126);
                He.A.b(j0.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null)), accountVM, ((AbstractC5250c.b) abstractC5250c).a(), b0.c.e(135749782, true, new d(vm), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 112) | 3072, 0);
                Boolean boolValueOf = Boolean.valueOf(pVar.c());
                interfaceC3540lR.U(992240463);
                boolean zT = interfaceC3540lR.T(pVar);
                Object objF2 = interfaceC3540lR.f();
                if (zT || objF2 == aVar.a()) {
                    objF2 = new e(pVar, null);
                    interfaceC3540lR.K(objF2);
                }
                interfaceC3540lR.J();
                T.O.f(boolValueOf, (InterfaceC6839p) objF2, interfaceC3540lR, 0);
                interfaceC3540lR.J();
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                if (!(abstractC5250c instanceof AbstractC5250c.a)) {
                    interfaceC3540lR.U(992229218);
                    interfaceC3540lR.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540lR.U(694943776);
                androidx.compose.ui.e eVarC = j0.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
                interfaceC3540lR.U(992252559);
                if (pVar.c()) {
                    AbstractC5250c.a aVar2 = (AbstractC5250c.a) abstractC5250c;
                    if (aVar2.a()) {
                        i12 = 0;
                        bVar = new AbstractC3198d.c.b(new d.b(AbstractC6780c.f53468d), false, 2, null);
                    } else {
                        i12 = 0;
                        bVar = aVar2.c() ? new AbstractC3198d.c.b(new d.b(AbstractC6780c.f53475e), false, 2, null) : null;
                    }
                } else {
                    bVar = new AbstractC3198d.c.a(b0.c.e(-1745272152, true, new f(accountVM), interfaceC3540lR, 54));
                    i12 = 0;
                }
                interfaceC3540lR.J();
                AbstractC5250c.a aVar3 = (AbstractC5250c.a) abstractC5250c;
                String strB = AbstractC7930a.b(aVar3.b(), interfaceC3540lR, i12);
                interfaceC3540lR.U(992271843);
                int i13 = i11 & 14;
                boolean zT2 = (i13 == 4) | interfaceC3540lR.T(pVar) | interfaceC3540lR.T(abstractC5250c);
                Object objF3 = interfaceC3540lR.f();
                if (zT2 || objF3 == aVar.a()) {
                    objF3 = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.teleport.h
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return AbstractC5262o.s(pVar, abstractC5250c, vm);
                        }
                    };
                    interfaceC3540lR.K(objF3);
                }
                interfaceC3540lR.J();
                interfaceC3540l2 = interfaceC3540lR;
                He.v.e(eVarC, bVar, (InterfaceC6824a) objF3, strB, null, pVar, b0.c.e(1018200985, true, new g(pVar, vm, nA), interfaceC3540lR, 54), 0L, 0.0f, null, interfaceC3540l2, (AbstractC3198d.c.f11406b << 3) | 1572864, 912);
                Boolean boolValueOf2 = Boolean.valueOf(pVar.c());
                interfaceC3540l2.U(992308081);
                boolean zT3 = interfaceC3540l2.T(pVar) | (i13 == 4);
                Object objF4 = interfaceC3540l2.f();
                if (zT3 || objF4 == aVar.a()) {
                    objF4 = new h(pVar, vm, null);
                    interfaceC3540l2.K(objF4);
                }
                interfaceC3540l2.J();
                T.O.f(boolValueOf2, (InterfaceC6839p) objF4, interfaceC3540l2, 0);
                interfaceC3540l2.U(992313758);
                boolean zT4 = interfaceC3540l2.T(iVar) | interfaceC3540l2.T(pVar);
                Object objF5 = interfaceC3540l2.f();
                if (zT4 || objF5 == aVar.a()) {
                    objF5 = new i(iVar, pVar, null);
                    interfaceC3540l2.K(objF5);
                }
                interfaceC3540l2.J();
                T.O.f(iVar, (InterfaceC6839p) objF5, interfaceC3540l2, 0);
                boolean zC = pVar.c();
                interfaceC3540l2.U(992326056);
                boolean zT5 = interfaceC3540l2.T(pVar);
                Object objF6 = interfaceC3540l2.f();
                if (zT5 || objF6 == aVar.a()) {
                    objF6 = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.teleport.i
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return AbstractC5262o.t(pVar);
                        }
                    };
                    interfaceC3540l2.K(objF6);
                }
                interfaceC3540l2.J();
                AbstractC5263a.a(zC, (InterfaceC6824a) objF6, interfaceC3540l2, 0, 0);
                boolean zA = aVar3.a();
                interfaceC3540l2.U(992329425);
                boolean z10 = i13 == 4;
                Object objF7 = interfaceC3540l2.f();
                if (z10 || objF7 == aVar.a()) {
                    objF7 = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.teleport.j
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return AbstractC5262o.u(vm);
                        }
                    };
                    interfaceC3540l2.K(objF7);
                }
                interfaceC3540l2.J();
                AbstractC5263a.a(zA, (InterfaceC6824a) objF7, interfaceC3540l2, 0, 0);
                interfaceC3540l2.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.k
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5262o.r(vm, accountVM, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J r(AbstractC5251d abstractC5251d, C7125a.c cVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        q(abstractC5251d, cVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J s(He.p pVar, AbstractC5250c abstractC5250c, AbstractC5251d abstractC5251d) {
        if (pVar.c()) {
            AbstractC5250c.a aVar = (AbstractC5250c.a) abstractC5250c;
            if (aVar.a()) {
                abstractC5251d.s0();
            } else if (aVar.c()) {
                abstractC5251d.r0();
            }
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J t(He.p pVar) {
        pVar.b();
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J u(AbstractC5251d abstractC5251d) {
        abstractC5251d.s0();
        return Yg.J.f24997a;
    }
}
