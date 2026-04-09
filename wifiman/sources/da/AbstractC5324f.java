package da;

import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import N.O0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC3999j;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.P;
import com.ui.core.ui.sso.SSOAccountVM;
import da.AbstractC5324f;
import da.AbstractC5337t;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f2.AbstractC5498D;
import f2.C5512k;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.InterfaceC7383b;
import q2.InterfaceC7418f;

/* renamed from: da.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5324f {

    /* renamed from: da.f$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f45879a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f45880b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f45881c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f45882d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f45883e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ SSOAccountVM f45884f;

        /* renamed from: da.f$a$a, reason: collision with other inner class name */
        public static final class C1702a extends Q9.a {
            C1702a() {
            }
        }

        /* renamed from: da.f$a$b */
        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f45885a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Fragment f45886b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f45887c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f45888d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f45889e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f45890f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ SSOAccountVM f45891g;

            /* renamed from: da.f$a$b$a, reason: collision with other inner class name */
            static final class C1703a implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ f2.w f45892a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f45893b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Fragment f45894c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f45895d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f45896e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC6824a f45897f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ boolean f45898g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ SSOAccountVM f45899h;

                /* renamed from: da.f$a$b$a$a, reason: collision with other inner class name */
                static final class C1704a implements mh.r {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Fragment f45900a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ boolean f45901b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ String f45902c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC6824a f45903d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ boolean f45904e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ SSOAccountVM f45905f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ f2.w f45906g;

                    /* renamed from: da.f$a$b$a$a$a, reason: collision with other inner class name */
                    static final class C1705a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                        /* renamed from: a, reason: collision with root package name */
                        int f45907a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f45908b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1705a(SSOAccountVM sSOAccountVM, InterfaceC5380e interfaceC5380e) {
                            super(2, interfaceC5380e);
                            this.f45908b = sSOAccountVM;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                            return new C1705a(this.f45908b, interfaceC5380e);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            AbstractC5467b.g();
                            if (this.f45907a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Yg.v.b(obj);
                            this.f45908b.s0();
                            return Yg.J.f24997a;
                        }

                        @Override // mh.InterfaceC6839p
                        /* renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                            return ((C1705a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                        }
                    }

                    /* renamed from: da.f$a$b$a$a$b, reason: collision with other inner class name */
                    static final class C1706b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                        /* renamed from: a, reason: collision with root package name */
                        int f45909a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ Fragment f45910b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ AbstractC5338u f45911c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ f2.w f45912d;

                        /* renamed from: da.f$a$b$a$a$b$a, reason: collision with other inner class name */
                        static final class C1707a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                            /* renamed from: a, reason: collision with root package name */
                            int f45913a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ AbstractC5338u f45914b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ f2.w f45915c;

                            /* renamed from: da.f$a$b$a$a$b$a$a, reason: collision with other inner class name */
                            static final class C1708a implements InterfaceC3221h {

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ f2.w f45916a;

                                C1708a(f2.w wVar) {
                                    this.f45916a = wVar;
                                }

                                @Override // Li.InterfaceC3221h
                                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                public final Object a(Yg.J j10, InterfaceC5380e interfaceC5380e) throws Resources.NotFoundException {
                                    f2.n.W(this.f45916a, AbstractC5337t.b.f45966a.a(), null, null, 6, null);
                                    return Yg.J.f24997a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C1707a(AbstractC5338u abstractC5338u, f2.w wVar, InterfaceC5380e interfaceC5380e) {
                                super(2, interfaceC5380e);
                                this.f45914b = abstractC5338u;
                                this.f45915c = wVar;
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                                return new C1707a(this.f45914b, this.f45915c, interfaceC5380e);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                Object objG = AbstractC5467b.g();
                                int i10 = this.f45913a;
                                if (i10 == 0) {
                                    Yg.v.b(obj);
                                    InterfaceC3220g interfaceC3220gE0 = this.f45914b.e0();
                                    C1708a c1708a = new C1708a(this.f45915c);
                                    this.f45913a = 1;
                                    if (interfaceC3220gE0.b(c1708a, this) == objG) {
                                        return objG;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    Yg.v.b(obj);
                                }
                                return Yg.J.f24997a;
                            }

                            @Override // mh.InterfaceC6839p
                            /* renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                                return ((C1707a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1706b(Fragment fragment, AbstractC5338u abstractC5338u, f2.w wVar, InterfaceC5380e interfaceC5380e) {
                            super(2, interfaceC5380e);
                            this.f45910b = fragment;
                            this.f45911c = abstractC5338u;
                            this.f45912d = wVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                            return new C1706b(this.f45910b, this.f45911c, this.f45912d, interfaceC5380e);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object objG = AbstractC5467b.g();
                            int i10 = this.f45909a;
                            if (i10 == 0) {
                                Yg.v.b(obj);
                                Fragment fragment = this.f45910b;
                                AbstractC4013k.b bVar = AbstractC4013k.b.STARTED;
                                C1707a c1707a = new C1707a(this.f45911c, this.f45912d, null);
                                this.f45909a = 1;
                                if (androidx.lifecycle.A.b(fragment, bVar, c1707a, this) == objG) {
                                    return objG;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Yg.v.b(obj);
                            }
                            return Yg.J.f24997a;
                        }

                        @Override // mh.InterfaceC6839p
                        /* renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                            return ((C1706b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                        }
                    }

                    /* renamed from: da.f$a$b$a$a$c */
                    public static final class c implements T.K {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f45917a;

                        public c(SSOAccountVM sSOAccountVM) {
                            this.f45917a = sSOAccountVM;
                        }

                        @Override // T.K
                        public void dispose() {
                            this.f45917a.s0();
                        }
                    }

                    C1704a(Fragment fragment, boolean z10, String str, InterfaceC6824a interfaceC6824a, boolean z11, SSOAccountVM sSOAccountVM, f2.w wVar) {
                        this.f45900a = fragment;
                        this.f45901b = z10;
                        this.f45902c = str;
                        this.f45903d = interfaceC6824a;
                        this.f45904e = z11;
                        this.f45905f = sSOAccountVM;
                        this.f45906g = wVar;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final T.K c(SSOAccountVM sSOAccountVM, T.L DisposableEffect) {
                        AbstractC6492s.i(DisposableEffect, "$this$DisposableEffect");
                        return new c(sSOAccountVM);
                    }

                    public final void b(InterfaceC7383b composable, C5512k entry, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(composable, "$this$composable");
                        AbstractC6492s.i(entry, "entry");
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-184629864, i10, -1, "com.ui.core.ui.sso.register.UiRegister.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiRegister.kt:66)");
                        }
                        AbstractC4013k abstractC4013kO = this.f45900a.O();
                        AbstractC6492s.h(abstractC4013kO, "<get-lifecycle>(...)");
                        AbstractC5338u abstractC5338u = (AbstractC5338u) Q9.h.m(AbstractC5338u.class, null, abstractC4013kO, interfaceC3540l, 0, 2);
                        if (((String) Q9.i.a(entry, "editEmail")) != null) {
                            abstractC5338u.t0();
                        }
                        AbstractC5336s.n(abstractC5338u, this.f45901b, this.f45902c, this.f45903d, this.f45904e, interfaceC3540l, 0, 0);
                        interfaceC3540l.U(-1745160941);
                        boolean zL = interfaceC3540l.l(this.f45905f);
                        SSOAccountVM sSOAccountVM = this.f45905f;
                        Object objF = interfaceC3540l.f();
                        if (zL || objF == InterfaceC3540l.f21100a.a()) {
                            objF = new C1705a(sSOAccountVM, null);
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        T.O.f("register", (InterfaceC6839p) objF, interfaceC3540l, 6);
                        interfaceC3540l.U(-1745155364);
                        boolean zL2 = interfaceC3540l.l(this.f45905f);
                        final SSOAccountVM sSOAccountVM2 = this.f45905f;
                        Object objF2 = interfaceC3540l.f();
                        if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                            objF2 = new InterfaceC6835l() { // from class: da.h
                                @Override // mh.InterfaceC6835l
                                public final Object invoke(Object obj) {
                                    return AbstractC5324f.a.b.C1703a.C1704a.c(sSOAccountVM2, (T.L) obj);
                                }
                            };
                            interfaceC3540l.K(objF2);
                        }
                        interfaceC3540l.J();
                        T.O.c("register", (InterfaceC6835l) objF2, interfaceC3540l, 6);
                        f2.w wVar = this.f45906g;
                        interfaceC3540l.U(-1745147329);
                        boolean zL3 = interfaceC3540l.l(this.f45900a) | interfaceC3540l.T(abstractC5338u) | interfaceC3540l.l(this.f45906g);
                        Fragment fragment = this.f45900a;
                        f2.w wVar2 = this.f45906g;
                        Object objF3 = interfaceC3540l.f();
                        if (zL3 || objF3 == InterfaceC3540l.f21100a.a()) {
                            objF3 = new C1706b(fragment, abstractC5338u, wVar2, null);
                            interfaceC3540l.K(objF3);
                        }
                        interfaceC3540l.J();
                        T.O.f(wVar, (InterfaceC6839p) objF3, interfaceC3540l, 0);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                    }

                    @Override // mh.r
                    public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                        b((InterfaceC7383b) obj, (C5512k) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                        return Yg.J.f24997a;
                    }
                }

                /* renamed from: da.f$a$b$a$b, reason: collision with other inner class name */
                static final class C1709b implements mh.r {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SSOAccountVM f45918a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Fragment f45919b;

                    /* renamed from: da.f$a$b$a$b$a, reason: collision with other inner class name */
                    static final class C1710a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                        /* renamed from: a, reason: collision with root package name */
                        int f45920a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f45921b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1710a(SSOAccountVM sSOAccountVM, InterfaceC5380e interfaceC5380e) {
                            super(2, interfaceC5380e);
                            this.f45921b = sSOAccountVM;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                            return new C1710a(this.f45921b, interfaceC5380e);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            AbstractC5467b.g();
                            if (this.f45920a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Yg.v.b(obj);
                            this.f45921b.s0();
                            return Yg.J.f24997a;
                        }

                        @Override // mh.InterfaceC6839p
                        /* renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                            return ((C1710a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                        }
                    }

                    /* renamed from: da.f$a$b$a$b$b, reason: collision with other inner class name */
                    public static final class C1711b implements T.K {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ SSOAccountVM f45922a;

                        public C1711b(SSOAccountVM sSOAccountVM) {
                            this.f45922a = sSOAccountVM;
                        }

                        @Override // T.K
                        public void dispose() {
                            this.f45922a.s0();
                        }
                    }

                    C1709b(SSOAccountVM sSOAccountVM, Fragment fragment) {
                        this.f45918a = sSOAccountVM;
                        this.f45919b = fragment;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final T.K c(SSOAccountVM sSOAccountVM, T.L DisposableEffect) {
                        AbstractC6492s.i(DisposableEffect, "$this$DisposableEffect");
                        return new C1711b(sSOAccountVM);
                    }

                    public final void b(InterfaceC7383b composable, C5512k it, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(composable, "$this$composable");
                        AbstractC6492s.i(it, "it");
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(2108275841, i10, -1, "com.ui.core.ui.sso.register.UiRegister.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiRegister.kt:104)");
                        }
                        interfaceC3540l.U(-1745130988);
                        boolean zL = interfaceC3540l.l(this.f45918a);
                        SSOAccountVM sSOAccountVM = this.f45918a;
                        Object objF = interfaceC3540l.f();
                        if (zL || objF == InterfaceC3540l.f21100a.a()) {
                            objF = new C1710a(sSOAccountVM, null);
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        T.O.f("verify", (InterfaceC6839p) objF, interfaceC3540l, 6);
                        interfaceC3540l.U(-1745125443);
                        boolean zL2 = interfaceC3540l.l(this.f45918a);
                        final SSOAccountVM sSOAccountVM2 = this.f45918a;
                        Object objF2 = interfaceC3540l.f();
                        if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                            objF2 = new InterfaceC6835l() { // from class: da.i
                                @Override // mh.InterfaceC6835l
                                public final Object invoke(Object obj) {
                                    return AbstractC5324f.a.b.C1703a.C1709b.c(sSOAccountVM2, (T.L) obj);
                                }
                            };
                            interfaceC3540l.K(objF2);
                        }
                        interfaceC3540l.J();
                        T.O.c("verify", (InterfaceC6835l) objF2, interfaceC3540l, 6);
                        AbstractC4013k abstractC4013kO = this.f45919b.O();
                        AbstractC6492s.h(abstractC4013kO, "<get-lifecycle>(...)");
                        ea.d.d((ea.e) Q9.h.m(ea.e.class, null, abstractC4013kO, interfaceC3540l, 0, 2), interfaceC3540l, 0);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                    }

                    @Override // mh.r
                    public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                        b((InterfaceC7383b) obj, (C5512k) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                        return Yg.J.f24997a;
                    }
                }

                C1703a(f2.w wVar, String str, Fragment fragment, boolean z10, String str2, InterfaceC6824a interfaceC6824a, boolean z11, SSOAccountVM sSOAccountVM) {
                    this.f45892a = wVar;
                    this.f45893b = str;
                    this.f45894c = fragment;
                    this.f45895d = z10;
                    this.f45896e = str2;
                    this.f45897f = interfaceC6824a;
                    this.f45898g = z11;
                    this.f45899h = sSOAccountVM;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Yg.J c(Fragment fragment, boolean z10, String str, InterfaceC6824a interfaceC6824a, boolean z11, SSOAccountVM sSOAccountVM, f2.w wVar, f2.u NavHost) {
                    AbstractC6492s.i(NavHost, "$this$NavHost");
                    g2.k.b(NavHost, AbstractC5337t.a.f45964a.a(), null, null, null, null, null, null, null, b0.c.c(-184629864, true, new C1704a(fragment, z10, str, interfaceC6824a, z11, sSOAccountVM, wVar)), 254, null);
                    g2.k.b(NavHost, AbstractC5337t.b.f45966a.a(), null, null, null, null, null, null, null, b0.c.c(2108275841, true, new C1709b(sSOAccountVM, fragment)), 254, null);
                    return Yg.J.f24997a;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v10 ??, still in use, count: 1, list:
                      (r3v10 ?? I:java.lang.Object) from 0x0083: INVOKE (r17v0 ?? I:T.l), (r3v10 ?? I:java.lang.Object) INTERFACE call: T.l.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
                    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
                    	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                    	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                    */
                public final void b(
                /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v10 ??, still in use, count: 1, list:
                      (r3v10 ?? I:java.lang.Object) from 0x0083: INVOKE (r17v0 ?? I:T.l), (r3v10 ?? I:java.lang.Object) INTERFACE call: T.l.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
                    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
                    	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                    */
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
                    */

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((InterfaceC3540l) obj, ((Number) obj2).intValue());
                    return Yg.J.f24997a;
                }
            }

            b(String str, Fragment fragment, boolean z10, String str2, InterfaceC6824a interfaceC6824a, boolean z11, SSOAccountVM sSOAccountVM) {
                this.f45885a = str;
                this.f45886b = fragment;
                this.f45887c = z10;
                this.f45888d = str2;
                this.f45889e = interfaceC6824a;
                this.f45890f = z11;
                this.f45891g = sSOAccountVM;
            }

            public final void a(f2.w navController, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(navController, "navController");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1442726047, i10, -1, "com.ui.core.ui.sso.register.UiRegister.<anonymous>.<anonymous> (UiRegister.kt:57)");
                }
                O0.a(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).e().a(), 0L, null, 0.0f, b0.c.e(-904864549, true, new C1703a(navController, this.f45885a, this.f45886b, this.f45887c, this.f45888d, this.f45889e, this.f45890f, this.f45891g), interfaceC3540l, 54), interfaceC3540l, 1572870, 58);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((f2.w) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        a(Fragment fragment, boolean z10, String str, InterfaceC6824a interfaceC6824a, boolean z11, SSOAccountVM sSOAccountVM) {
            this.f45879a = fragment;
            this.f45880b = z10;
            this.f45881c = str;
            this.f45882d = interfaceC6824a;
            this.f45883e = z11;
            this.f45884f = sSOAccountVM;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q9.j c() {
            return new C1702a();
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-177325036, i10, -1, "com.ui.core.ui.sso.register.UiRegister.<anonymous> (UiRegister.kt:50)");
            }
            String strA = AbstractC5337t.a.f45964a.a();
            AbstractActivityC3999j abstractActivityC3999jO1 = this.f45879a.o1();
            AbstractC6492s.h(abstractActivityC3999jO1, "requireActivity(...)");
            f2.w wVarD = g2.l.d(new AbstractC5498D[0], interfaceC3540l, 0);
            interfaceC3540l.U(75646505);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: da.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC5324f.a.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Q9.h.g(abstractActivityC3999jO1, (InterfaceC6824a) objF, strA, null, wVarD, b0.c.e(1442726047, true, new b(strA, this.f45879a, this.f45880b, this.f45881c, this.f45882d, this.f45883e, this.f45884f), interfaceC3540l, 54), interfaceC3540l, 197040, 8);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.fragment.app.Fragment r16, final com.ui.core.ui.sso.SSOAccountVM r17, final boolean r18, final boolean r19, java.lang.String r20, mh.InterfaceC6824a r21, T.InterfaceC3540l r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.AbstractC5324f.c(androidx.fragment.app.Fragment, com.ui.core.ui.sso.SSOAccountVM, boolean, boolean, java.lang.String, mh.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P.c d(Fragment fragment, SSOAccountVM sSOAccountVM, InterfaceC7418f savedStateRegistryOwner, Bundle arguments) {
        AbstractC6492s.i(savedStateRegistryOwner, "savedStateRegistryOwner");
        AbstractC6492s.i(arguments, "arguments");
        Bundle bundleQ = fragment.q();
        Application application = fragment.o1().getApplication();
        AbstractC6492s.h(application, "getApplication(...)");
        if (arguments.isEmpty() && bundleQ != null) {
            arguments.putAll(bundleQ);
        }
        Yg.J j10 = Yg.J.f24997a;
        return new v(application, sSOAccountVM, savedStateRegistryOwner, arguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(Fragment fragment, SSOAccountVM sSOAccountVM, boolean z10, boolean z11, String str, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(fragment, sSOAccountVM, z10, z11, str, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
