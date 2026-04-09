package com.ui.core.ui.sso.login;

import Ii.N;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import N.C3319f0;
import N.O0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.K;
import T.L;
import T.L0;
import T.O;
import Yg.J;
import Yg.v;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC3999j;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.P;
import com.ui.core.ui.sso.SSOAccountVM;
import com.ui.core.ui.sso.login.b;
import com.ui.core.ui.sso.login.f;
import com.ui.core.ui.sso.login.g;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f2.C5512k;
import f2.u;
import f2.w;
import g2.k;
import g2.m;
import ka.C6419i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import mh.r;
import q.InterfaceC7383b;
import q2.InterfaceC7418f;

/* loaded from: classes3.dex */
public abstract class b {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f41517a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f41518b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41519c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f41520d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f41521e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ SSOAccountVM f41522f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f41523g;

        /* renamed from: com.ui.core.ui.sso.login.b$a$a, reason: collision with other inner class name */
        public static final class C1326a extends Q9.a {
            C1326a() {
            }
        }

        /* renamed from: com.ui.core.ui.sso.login.b$a$b, reason: collision with other inner class name */
        static final class C1327b implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f41524a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f41525b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f41526c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f41527d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f41528e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ SSOAccountVM f41529f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Fragment f41530g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f41531h;

            /* renamed from: com.ui.core.ui.sso.login.b$a$b$a, reason: collision with other inner class name */
            static final class C1328a implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ w f41532a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f41533b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f41534c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f41535d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC6824a f41536e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ boolean f41537f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ SSOAccountVM f41538g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Fragment f41539h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ InterfaceC6835l f41540i;

                /* renamed from: com.ui.core.ui.sso.login.b$a$b$a$a, reason: collision with other inner class name */
                static final class C1329a implements r {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ boolean f41541a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ String f41542b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC6824a f41543c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ boolean f41544d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ SSOAccountVM f41545e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ w f41546f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ Fragment f41547g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ InterfaceC6835l f41548h;

                    /* renamed from: com.ui.core.ui.sso.login.b$a$b$a$a$a, reason: collision with other inner class name */
                    static final class C1330a extends l implements InterfaceC6839p {

                        /* renamed from: a, reason: collision with root package name */
                        int f41549a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f41550b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1330a(SSOAccountVM sSOAccountVM, InterfaceC5380e interfaceC5380e) {
                            super(2, interfaceC5380e);
                            this.f41550b = sSOAccountVM;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                            return new C1330a(this.f41550b, interfaceC5380e);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            AbstractC5467b.g();
                            if (this.f41549a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v.b(obj);
                            this.f41550b.s0();
                            return J.f24997a;
                        }

                        @Override // mh.InterfaceC6839p
                        /* renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                            return ((C1330a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                        }
                    }

                    /* renamed from: com.ui.core.ui.sso.login.b$a$b$a$a$b, reason: collision with other inner class name */
                    static final class C1331b extends l implements InterfaceC6839p {

                        /* renamed from: a, reason: collision with root package name */
                        int f41551a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ Fragment f41552b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ g f41553c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ InterfaceC6835l f41554d;

                        /* renamed from: com.ui.core.ui.sso.login.b$a$b$a$a$b$a, reason: collision with other inner class name */
                        static final class C1332a extends l implements InterfaceC6839p {

                            /* renamed from: a, reason: collision with root package name */
                            int f41555a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ g f41556b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ InterfaceC6835l f41557c;

                            /* renamed from: com.ui.core.ui.sso.login.b$a$b$a$a$b$a$a, reason: collision with other inner class name */
                            static final class C1333a implements InterfaceC3221h {

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ g f41558a;

                                /* renamed from: b, reason: collision with root package name */
                                final /* synthetic */ InterfaceC6835l f41559b;

                                C1333a(g gVar, InterfaceC6835l interfaceC6835l) {
                                    this.f41558a = gVar;
                                    this.f41559b = interfaceC6835l;
                                }

                                @Override // Li.InterfaceC3221h
                                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                public final Object a(g.a aVar, InterfaceC5380e interfaceC5380e) {
                                    if (AbstractC6492s.d(aVar, g.a.C1334a.f41573a)) {
                                        this.f41558a.o0();
                                    } else {
                                        if (!(aVar instanceof g.a.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        this.f41559b.invoke(aVar);
                                    }
                                    return J.f24997a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C1332a(g gVar, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
                                super(2, interfaceC5380e);
                                this.f41556b = gVar;
                                this.f41557c = interfaceC6835l;
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                                return new C1332a(this.f41556b, this.f41557c, interfaceC5380e);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                Object objG = AbstractC5467b.g();
                                int i10 = this.f41555a;
                                if (i10 == 0) {
                                    v.b(obj);
                                    InterfaceC3220g interfaceC3220gB = this.f41556b.b();
                                    C1333a c1333a = new C1333a(this.f41556b, this.f41557c);
                                    this.f41555a = 1;
                                    if (interfaceC3220gB.b(c1333a, this) == objG) {
                                        return objG;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    v.b(obj);
                                }
                                return J.f24997a;
                            }

                            @Override // mh.InterfaceC6839p
                            /* renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                                return ((C1332a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1331b(Fragment fragment, g gVar, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
                            super(2, interfaceC5380e);
                            this.f41552b = fragment;
                            this.f41553c = gVar;
                            this.f41554d = interfaceC6835l;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                            return new C1331b(this.f41552b, this.f41553c, this.f41554d, interfaceC5380e);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object objG = AbstractC5467b.g();
                            int i10 = this.f41551a;
                            if (i10 == 0) {
                                v.b(obj);
                                Fragment fragment = this.f41552b;
                                AbstractC4013k.b bVar = AbstractC4013k.b.STARTED;
                                C1332a c1332a = new C1332a(this.f41553c, this.f41554d, null);
                                this.f41551a = 1;
                                if (A.b(fragment, bVar, c1332a, this) == objG) {
                                    return objG;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                v.b(obj);
                            }
                            return J.f24997a;
                        }

                        @Override // mh.InterfaceC6839p
                        /* renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                            return ((C1331b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                        }
                    }

                    /* renamed from: com.ui.core.ui.sso.login.b$a$b$a$a$c */
                    public static final class c implements K {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f41560a;

                        public c(SSOAccountVM sSOAccountVM) {
                            this.f41560a = sSOAccountVM;
                        }

                        @Override // T.K
                        public void dispose() {
                            this.f41560a.s0();
                        }
                    }

                    C1329a(boolean z10, String str, InterfaceC6824a interfaceC6824a, boolean z11, SSOAccountVM sSOAccountVM, w wVar, Fragment fragment, InterfaceC6835l interfaceC6835l) {
                        this.f41541a = z10;
                        this.f41542b = str;
                        this.f41543c = interfaceC6824a;
                        this.f41544d = z11;
                        this.f41545e = sSOAccountVM;
                        this.f41546f = wVar;
                        this.f41547g = fragment;
                        this.f41548h = interfaceC6835l;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final J e(InterfaceC6824a interfaceC6824a) {
                        if (interfaceC6824a != null) {
                            interfaceC6824a.invoke();
                        }
                        return J.f24997a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final K f(SSOAccountVM sSOAccountVM, L DisposableEffect) {
                        AbstractC6492s.i(DisposableEffect, "$this$DisposableEffect");
                        return new c(sSOAccountVM);
                    }

                    public final void c(InterfaceC7383b composable, C5512k it, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(composable, "$this$composable");
                        AbstractC6492s.i(it, "it");
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(639857167, i10, -1, "com.ui.core.ui.sso.login.UiLogin.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiLogin.kt:65)");
                        }
                        g gVar = (g) Q9.h.l(it, g.class, interfaceC3540l, (i10 >> 3) & 14);
                        boolean z10 = this.f41541a;
                        String str = this.f41542b;
                        interfaceC3540l.U(-1842528045);
                        boolean zT = interfaceC3540l.T(this.f41543c);
                        final InterfaceC6824a interfaceC6824a = this.f41543c;
                        Object objF = interfaceC3540l.f();
                        if (zT || objF == InterfaceC3540l.f21100a.a()) {
                            objF = new InterfaceC6824a() { // from class: com.ui.core.ui.sso.login.d
                                @Override // mh.InterfaceC6824a
                                public final Object invoke() {
                                    return b.a.C1327b.C1328a.C1329a.e(interfaceC6824a);
                                }
                            };
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        T9.j.h(gVar, z10, str, (InterfaceC6824a) objF, this.f41544d, interfaceC3540l, 0, 0);
                        interfaceC3540l.U(-1842522462);
                        boolean zL = interfaceC3540l.l(this.f41545e);
                        SSOAccountVM sSOAccountVM = this.f41545e;
                        Object objF2 = interfaceC3540l.f();
                        if (zL || objF2 == InterfaceC3540l.f21100a.a()) {
                            objF2 = new C1330a(sSOAccountVM, null);
                            interfaceC3540l.K(objF2);
                        }
                        interfaceC3540l.J();
                        O.f("login", (InterfaceC6839p) objF2, interfaceC3540l, 6);
                        interfaceC3540l.U(-1842516949);
                        boolean zL2 = interfaceC3540l.l(this.f41545e);
                        final SSOAccountVM sSOAccountVM2 = this.f41545e;
                        Object objF3 = interfaceC3540l.f();
                        if (zL2 || objF3 == InterfaceC3540l.f21100a.a()) {
                            objF3 = new InterfaceC6835l() { // from class: com.ui.core.ui.sso.login.e
                                @Override // mh.InterfaceC6835l
                                public final Object invoke(Object obj) {
                                    return b.a.C1327b.C1328a.C1329a.f(sSOAccountVM2, (L) obj);
                                }
                            };
                            interfaceC3540l.K(objF3);
                        }
                        interfaceC3540l.J();
                        O.c("login", (InterfaceC6835l) objF3, interfaceC3540l, 6);
                        w wVar = this.f41546f;
                        interfaceC3540l.U(-1842508708);
                        boolean zL3 = interfaceC3540l.l(this.f41547g) | interfaceC3540l.T(gVar) | interfaceC3540l.T(this.f41548h);
                        Fragment fragment = this.f41547g;
                        InterfaceC6835l interfaceC6835l = this.f41548h;
                        Object objF4 = interfaceC3540l.f();
                        if (zL3 || objF4 == InterfaceC3540l.f21100a.a()) {
                            objF4 = new C1331b(fragment, gVar, interfaceC6835l, null);
                            interfaceC3540l.K(objF4);
                        }
                        interfaceC3540l.J();
                        O.f(wVar, (InterfaceC6839p) objF4, interfaceC3540l, 0);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                    }

                    @Override // mh.r
                    public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                        c((InterfaceC7383b) obj, (C5512k) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                        return J.f24997a;
                    }
                }

                C1328a(w wVar, String str, boolean z10, String str2, InterfaceC6824a interfaceC6824a, boolean z11, SSOAccountVM sSOAccountVM, Fragment fragment, InterfaceC6835l interfaceC6835l) {
                    this.f41532a = wVar;
                    this.f41533b = str;
                    this.f41534c = z10;
                    this.f41535d = str2;
                    this.f41536e = interfaceC6824a;
                    this.f41537f = z11;
                    this.f41538g = sSOAccountVM;
                    this.f41539h = fragment;
                    this.f41540i = interfaceC6835l;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(boolean z10, String str, InterfaceC6824a interfaceC6824a, boolean z11, SSOAccountVM sSOAccountVM, w wVar, Fragment fragment, InterfaceC6835l interfaceC6835l, u NavHost) {
                    AbstractC6492s.i(NavHost, "$this$NavHost");
                    k.b(NavHost, f.a.f41571a.a(), null, null, null, null, null, null, null, b0.c.c(639857167, true, new C1329a(z10, str, interfaceC6824a, z11, sSOAccountVM, wVar, fragment, interfaceC6835l)), 254, null);
                    return J.f24997a;
                }

                public final void b(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-212581588, i10, -1, "com.ui.core.ui.sso.login.UiLogin.<anonymous>.<anonymous>.<anonymous> (UiLogin.kt:58)");
                    }
                    w wVar = this.f41532a;
                    String str = this.f41533b;
                    interfaceC3540l.U(-662309095);
                    boolean zC = interfaceC3540l.c(this.f41534c) | interfaceC3540l.T(this.f41535d) | interfaceC3540l.T(this.f41536e) | interfaceC3540l.c(this.f41537f) | interfaceC3540l.l(this.f41538g) | interfaceC3540l.l(this.f41532a) | interfaceC3540l.l(this.f41539h) | interfaceC3540l.T(this.f41540i);
                    final boolean z10 = this.f41534c;
                    final String str2 = this.f41535d;
                    final InterfaceC6824a interfaceC6824a = this.f41536e;
                    final boolean z11 = this.f41537f;
                    final SSOAccountVM sSOAccountVM = this.f41538g;
                    final w wVar2 = this.f41532a;
                    final Fragment fragment = this.f41539h;
                    final InterfaceC6835l interfaceC6835l = this.f41540i;
                    Object objF = interfaceC3540l.f();
                    if (zC || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6835l() { // from class: com.ui.core.ui.sso.login.c
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return b.a.C1327b.C1328a.c(z10, str2, interfaceC6824a, z11, sSOAccountVM, wVar2, fragment, interfaceC6835l, (u) obj);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    m.b(wVar, str, null, null, null, null, null, null, null, null, (InterfaceC6835l) objF, interfaceC3540l, 48, 0, 1020);
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

            C1327b(String str, boolean z10, String str2, InterfaceC6824a interfaceC6824a, boolean z11, SSOAccountVM sSOAccountVM, Fragment fragment, InterfaceC6835l interfaceC6835l) {
                this.f41524a = str;
                this.f41525b = z10;
                this.f41526c = str2;
                this.f41527d = interfaceC6824a;
                this.f41528e = z11;
                this.f41529f = sSOAccountVM;
                this.f41530g = fragment;
                this.f41531h = interfaceC6835l;
            }

            public final void a(w navController, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(navController, "navController");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-451717144, i10, -1, "com.ui.core.ui.sso.login.UiLogin.<anonymous>.<anonymous> (UiLogin.kt:54)");
                }
                O0.a(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, C3319f0.f14419a.a(interfaceC3540l, C3319f0.f14420b).c(), 0L, null, 0.0f, b0.c.e(-212581588, true, new C1328a(navController, this.f41524a, this.f41525b, this.f41526c, this.f41527d, this.f41528e, this.f41529f, this.f41530g, this.f41531h), interfaceC3540l, 54), interfaceC3540l, 1572870, 58);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((w) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a(Fragment fragment, boolean z10, String str, InterfaceC6824a interfaceC6824a, boolean z11, SSOAccountVM sSOAccountVM, InterfaceC6835l interfaceC6835l) {
            this.f41517a = fragment;
            this.f41518b = z10;
            this.f41519c = str;
            this.f41520d = interfaceC6824a;
            this.f41521e = z11;
            this.f41522f = sSOAccountVM;
            this.f41523g = interfaceC6835l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q9.j c() {
            return new C1326a();
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(866306835, i10, -1, "com.ui.core.ui.sso.login.UiLogin.<anonymous> (UiLogin.kt:48)");
            }
            String strA = f.a.f41571a.a();
            AbstractActivityC3999j abstractActivityC3999jO1 = this.f41517a.o1();
            AbstractC6492s.h(abstractActivityC3999jO1, "requireActivity(...)");
            interfaceC3540l.U(-1548097448);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: com.ui.core.ui.sso.login.a
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return b.a.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Q9.h.g(abstractActivityC3999jO1, (InterfaceC6824a) objF, strA, null, null, b0.c.e(-451717144, true, new C1327b(strA, this.f41518b, this.f41519c, this.f41520d, this.f41521e, this.f41522f, this.f41517a, this.f41523g), interfaceC3540l, 54), interfaceC3540l, 197040, 24);
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.fragment.app.Fragment r19, final com.ui.core.ui.sso.SSOAccountVM r20, final mh.InterfaceC6835l r21, boolean r22, boolean r23, java.lang.String r24, mh.InterfaceC6824a r25, T.InterfaceC3540l r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.core.ui.sso.login.b.c(androidx.fragment.app.Fragment, com.ui.core.ui.sso.SSOAccountVM, mh.l, boolean, boolean, java.lang.String, mh.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P.c d(Fragment fragment, SSOAccountVM sSOAccountVM, InterfaceC7418f savedStateRegistryOwner, Bundle arguments) {
        AbstractC6492s.i(savedStateRegistryOwner, "savedStateRegistryOwner");
        AbstractC6492s.i(arguments, "arguments");
        Bundle bundleQ = fragment.q();
        Context contextP1 = fragment.p1();
        AbstractC6492s.h(contextP1, "requireContext(...)");
        C6419i c6419i = new C6419i(contextP1);
        if (arguments.isEmpty() && bundleQ != null) {
            arguments.putAll(bundleQ);
        }
        J j10 = J.f24997a;
        return new T9.l(sSOAccountVM, c6419i, savedStateRegistryOwner, arguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(Fragment fragment, SSOAccountVM sSOAccountVM, InterfaceC6835l interfaceC6835l, boolean z10, boolean z11, String str, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(fragment, sSOAccountVM, interfaceC6835l, z10, z11, str, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
