package xe;

import Ii.AbstractC3063k;
import N.AbstractC3333m0;
import N.AbstractC3345t;
import N.C3335n0;
import N.EnumC3337o0;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.I0;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.o1;
import T.z1;
import Zg.AbstractC3689v;
import android.content.res.Resources;
import d.AbstractC5263a;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f2.AbstractC5495A;
import f2.C5501G;
import f2.C5512k;
import gf.AbstractC5909j;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import vf.AbstractC8223c;
import xe.AbstractC8460B;
import xe.AbstractC8464F;
import xe.I;
import xe.InterfaceC8511f;
import z.InterfaceC8687j;

/* renamed from: xe.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8460B {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f65624a = AbstractC3561w.f(new InterfaceC6824a() { // from class: xe.x
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return AbstractC8460B.C();
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f65625b = AbstractC3561w.f(new InterfaceC6824a() { // from class: xe.y
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return AbstractC8460B.B();
        }
    });

    /* renamed from: xe.B$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3335n0 f65626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f2.w f65627b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r0 f65628c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f65629d;

        /* renamed from: xe.B$a$a, reason: collision with other inner class name */
        static final class C2322a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f2.w f65630a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ r0 f65631b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3335n0 f65632c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC8511f.b f65633d;

            /* renamed from: xe.B$a$a$a, reason: collision with other inner class name */
            static final class C2323a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C3335n0 f65634a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC8511f.b f65635b;

                /* renamed from: xe.B$a$a$a$a, reason: collision with other inner class name */
                static final class C2324a implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC6839p f65636a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C3335n0 f65637b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC8511f.b f65638c;

                    C2324a(InterfaceC6839p interfaceC6839p, C3335n0 c3335n0, InterfaceC8511f.b bVar) {
                        this.f65636a = interfaceC6839p;
                        this.f65637b = c3335n0;
                        this.f65638c = bVar;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Yg.J c(InterfaceC8511f.b bVar) {
                        bVar.a();
                        return Yg.J.f24997a;
                    }

                    public final void b(InterfaceC3540l interfaceC3540l, int i10) {
                        if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                            interfaceC3540l.C();
                            return;
                        }
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(722229193, i10, -1, "com.ui.wifiman.ui.AppModalNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WiFimanAppNavigation.kt:218)");
                        }
                        this.f65636a.invoke(interfaceC3540l, 0);
                        boolean z10 = this.f65637b.g() != EnumC3337o0.Hidden;
                        interfaceC3540l.U(-317132409);
                        final InterfaceC8511f.b bVar = this.f65638c;
                        Object objF = interfaceC3540l.f();
                        if (objF == InterfaceC3540l.f21100a.a()) {
                            objF = new InterfaceC6824a() { // from class: xe.A
                                @Override // mh.InterfaceC6824a
                                public final Object invoke() {
                                    return AbstractC8460B.a.C2322a.C2323a.C2324a.c(bVar);
                                }
                            };
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        AbstractC5263a.a(z10, (InterfaceC6824a) objF, interfaceC3540l, 48, 0);
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

                C2323a(C3335n0 c3335n0, InterfaceC8511f.b bVar) {
                    this.f65634a = c3335n0;
                    this.f65635b = bVar;
                }

                public final void a(InterfaceC6839p content, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(content, "content");
                    if ((i10 & 6) == 0) {
                        i10 |= interfaceC3540l.l(content) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1090559467, i10, -1, "com.ui.wifiman.ui.AppModalNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WiFimanAppNavigation.kt:217)");
                    }
                    Fe.e.b(null, b0.c.e(722229193, true, new C2324a(content, this.f65634a, this.f65635b), interfaceC3540l, 54), interfaceC3540l, 48, 1);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((InterfaceC6839p) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return Yg.J.f24997a;
                }
            }

            /* renamed from: xe.B$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f65639a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f65640b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3335n0 f65641c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(boolean z10, C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f65640b = z10;
                    this.f65641c = c3335n0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new b(this.f65640b, this.f65641c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f65639a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        if (this.f65640b) {
                            C3335n0 c3335n0 = this.f65641c;
                            this.f65639a = 1;
                            if (c3335n0.l(this) == objG) {
                                return objG;
                            }
                        } else {
                            C3335n0 c3335n02 = this.f65641c;
                            this.f65639a = 2;
                            if (c3335n02.i(this) == objG) {
                                return objG;
                            }
                        }
                    } else {
                        if (i10 != 1 && i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return Yg.J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* renamed from: xe.B$a$a$c */
            static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f65642a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f65643b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ f2.w f65644c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(boolean z10, f2.w wVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f65643b = z10;
                    this.f65644c = wVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Yg.J E(C5501G c5501g) {
                    c5501g.c(true);
                    return Yg.J.f24997a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Yg.J v(f2.z zVar) {
                    zVar.c(0, new InterfaceC6835l() { // from class: xe.D
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return AbstractC8460B.a.C2322a.c.E((C5501G) obj);
                        }
                    });
                    return Yg.J.f24997a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new c(this.f65643b, this.f65644c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                    AbstractC5467b.g();
                    if (this.f65642a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    if (!this.f65643b) {
                        this.f65644c.V("empty", new InterfaceC6835l() { // from class: xe.C
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj2) {
                                return AbstractC8460B.a.C2322a.c.v((f2.z) obj2);
                            }
                        });
                    }
                    return Yg.J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            C2322a(f2.w wVar, r0 r0Var, C3335n0 c3335n0, InterfaceC8511f.b bVar) {
                this.f65630a = wVar;
                this.f65631b = r0Var;
                this.f65632c = c3335n0;
                this.f65633d = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J c(r0 r0Var, C3335n0 c3335n0, InterfaceC8511f.b bVar, f2.u NavHost) {
                AbstractC6492s.i(NavHost, "$this$NavHost");
                AbstractC8460B.F(NavHost, r0Var, b0.c.c(1090559467, true, new C2323a(c3335n0, bVar)));
                return Yg.J.f24997a;
            }

            public final void b(InterfaceC8687j ModalBottomSheetLayout, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1082639186, i10, -1, "com.ui.wifiman.ui.AppModalNavigation.<anonymous>.<anonymous> (WiFimanAppNavigation.kt:207)");
                }
                androidx.compose.ui.e eVarA = AbstractC8223c.a(androidx.compose.ui.e.f28771b0);
                f2.w wVar = this.f65630a;
                interfaceC3540l.U(-579611137);
                boolean zL = interfaceC3540l.l(this.f65631b) | interfaceC3540l.l(this.f65632c);
                final r0 r0Var = this.f65631b;
                final C3335n0 c3335n0 = this.f65632c;
                final InterfaceC8511f.b bVar = this.f65633d;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: xe.z
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return AbstractC8460B.a.C2322a.c(r0Var, c3335n0, bVar, (f2.u) obj);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                g2.m.b(wVar, "empty", eVarA, null, null, null, null, null, null, null, (InterfaceC6835l) objF, interfaceC3540l, 48, 0, 1016);
                List list = (List) o1.b(this.f65630a.N(), null, interfaceC3540l, 0, 1).getValue();
                C5512k c5512k = (C5512k) AbstractC3689v.D0(list);
                boolean z10 = (c5512k == null || AbstractC6492s.d(c5512k.f().w(), "empty")) ? false : true;
                Boolean boolValueOf = Boolean.valueOf(z10);
                interfaceC3540l.U(-579574291);
                boolean zC = interfaceC3540l.c(z10) | interfaceC3540l.l(this.f65632c);
                C3335n0 c3335n02 = this.f65632c;
                Object objF2 = interfaceC3540l.f();
                if (zC || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new b(z10, c3335n02, null);
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                T.O.e(boolValueOf, list, (InterfaceC6839p) objF2, interfaceC3540l, 0);
                boolean zK = this.f65632c.k();
                Boolean boolValueOf2 = Boolean.valueOf(!zK);
                interfaceC3540l.U(-579562749);
                boolean zC2 = interfaceC3540l.c(zK) | interfaceC3540l.l(this.f65630a);
                f2.w wVar2 = this.f65630a;
                Object objF3 = interfaceC3540l.f();
                if (zC2 || objF3 == InterfaceC3540l.f21100a.a()) {
                    objF3 = new c(zK, wVar2, null);
                    interfaceC3540l.K(objF3);
                }
                interfaceC3540l.J();
                T.O.f(boolValueOf2, (InterfaceC6839p) objF3, interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        a(C3335n0 c3335n0, f2.w wVar, r0 r0Var, InterfaceC8511f.b bVar) {
            this.f65626a = c3335n0;
            this.f65627b = wVar;
            this.f65628c = r0Var;
            this.f65629d = bVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(211402240, i10, -1, "com.ui.wifiman.ui.AppModalNavigation.<anonymous> (WiFimanAppNavigation.kt:199)");
            }
            AbstractC3333m0.b(b0.c.e(-1082639186, true, new C2322a(this.f65627b, this.f65628c, this.f65626a, this.f65629d), interfaceC3540l, 54), null, this.f65626a, false, Q.b.f18744a.b(interfaceC3540l, 6), Y0.h.j(0), C6733v0.f52951b.d(), ((C6733v0) interfaceC3540l.t(AbstractC3345t.a())).u(), 0L, C8484a.f65879a.a(), interfaceC3540l, (C3335n0.f14622e << 6) | 807075846, 266);
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

    /* renamed from: xe.B$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f65645a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3335n0 f65646b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f65646b = c3335n0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f65646b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f65645a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C3335n0 c3335n0 = this.f65646b;
                this.f65645a = 1;
                if (c3335n0.i(this) == objG) {
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
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: xe.B$c */
    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC8513h f65647a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3335n0 f65648b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ii.N f65649c;

        /* renamed from: xe.B$c$a */
        static final class a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3335n0 f65650a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f65651b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ii.N f65652c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1 f65653d;

            /* renamed from: xe.B$c$a$a, reason: collision with other inner class name */
            static final class C2325a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f65654a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3335n0 f65655b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2325a(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f65655b = c3335n0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C2325a(this.f65655b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f65654a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        C3335n0 c3335n0 = this.f65655b;
                        this.f65654a = 1;
                        if (c3335n0.i(this) == objG) {
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
                    return ((C2325a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* renamed from: xe.B$c$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f65656a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3335n0 f65657b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f65657b = c3335n0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new b(this.f65657b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f65656a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        C3335n0 c3335n0 = this.f65657b;
                        this.f65656a = 1;
                        if (c3335n0.l(this) == objG) {
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
                    return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* renamed from: xe.B$c$a$c, reason: collision with other inner class name */
            static final class C2326c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f65658a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3335n0 f65659b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2326c(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f65659b = c3335n0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C2326c(this.f65659b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f65658a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        C3335n0 c3335n0 = this.f65659b;
                        this.f65658a = 1;
                        if (c3335n0.l(this) == objG) {
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
                    return ((C2326c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* renamed from: xe.B$c$a$d */
            static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f65660a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3335n0 f65661b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f65661b = c3335n0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new d(this.f65661b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f65660a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        C3335n0 c3335n0 = this.f65661b;
                        this.f65660a = 1;
                        if (c3335n0.l(this) == objG) {
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
                    return ((d) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* renamed from: xe.B$c$a$e */
            static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f65662a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3335n0 f65663b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f65663b = c3335n0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new e(this.f65663b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f65662a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        C3335n0 c3335n0 = this.f65663b;
                        this.f65662a = 1;
                        if (c3335n0.i(this) == objG) {
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
                    return ((e) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* renamed from: xe.B$c$a$f */
            public /* synthetic */ class f {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f65664a;

                static {
                    int[] iArr = new int[EnumC8512g.values().length];
                    try {
                        iArr[EnumC8512g.NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC8512g.WIFIMAN_WIZARD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC8512g.SPEED_TEST_A2A.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC8512g.DIRECT_CONSOLE_CONNECT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f65664a = iArr;
                }
            }

            a(C3335n0 c3335n0, boolean z10, Ii.N n10, z1 z1Var) {
                this.f65650a = c3335n0;
                this.f65651b = z10;
                this.f65652c = n10;
                this.f65653d = z1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J c(Ii.N n10, C3335n0 c3335n0) {
                AbstractC3063k.d(n10, null, null, new e(c3335n0, null), 3, null);
                return Yg.J.f24997a;
            }

            public final void b(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1069461460, i10, -1, "com.ui.wifiman.ui.AppPopup.<anonymous>.<anonymous> (WiFimanAppNavigation.kt:290)");
                }
                int i11 = f.f65664a[c.c(this.f65653d).ordinal()];
                if (i11 == 1) {
                    interfaceC3540l.U(-130746633);
                    z.a0.a(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), interfaceC3540l, 6);
                    EnumC8512g enumC8512gC = c.c(this.f65653d);
                    interfaceC3540l.U(411427906);
                    boolean zL = interfaceC3540l.l(this.f65650a);
                    C3335n0 c3335n0 = this.f65650a;
                    Object objF = interfaceC3540l.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C2325a(c3335n0, null);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    T.O.f(enumC8512gC, (InterfaceC6839p) objF, interfaceC3540l, 0);
                    interfaceC3540l.J();
                } else if (i11 == 2) {
                    interfaceC3540l.U(-130508305);
                    If.P.d(null, interfaceC3540l, 0, 1);
                    EnumC8512g enumC8512gC2 = c.c(this.f65653d);
                    interfaceC3540l.U(411434850);
                    boolean zL2 = interfaceC3540l.l(this.f65650a);
                    C3335n0 c3335n02 = this.f65650a;
                    Object objF2 = interfaceC3540l.f();
                    if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new b(c3335n02, null);
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    T.O.f(enumC8512gC2, (InterfaceC6839p) objF2, interfaceC3540l, 0);
                    interfaceC3540l.J();
                } else if (i11 == 3) {
                    interfaceC3540l.U(-130292948);
                    AbstractC5909j.g(null, interfaceC3540l, 0, 1);
                    EnumC8512g enumC8512gC3 = c.c(this.f65653d);
                    interfaceC3540l.U(411441890);
                    boolean zL3 = interfaceC3540l.l(this.f65650a);
                    C3335n0 c3335n03 = this.f65650a;
                    Object objF3 = interfaceC3540l.f();
                    if (zL3 || objF3 == InterfaceC3540l.f21100a.a()) {
                        objF3 = new C2326c(c3335n03, null);
                        interfaceC3540l.K(objF3);
                    }
                    interfaceC3540l.J();
                    T.O.f(enumC8512gC3, (InterfaceC6839p) objF3, interfaceC3540l, 0);
                    interfaceC3540l.J();
                } else {
                    if (i11 != 4) {
                        interfaceC3540l.U(411422360);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-130066431);
                    uf.e.c(null, interfaceC3540l, 0, 1);
                    EnumC8512g enumC8512gC4 = c.c(this.f65653d);
                    interfaceC3540l.U(411449538);
                    boolean zL4 = interfaceC3540l.l(this.f65650a);
                    C3335n0 c3335n04 = this.f65650a;
                    Object objF4 = interfaceC3540l.f();
                    if (zL4 || objF4 == InterfaceC3540l.f21100a.a()) {
                        objF4 = new d(c3335n04, null);
                        interfaceC3540l.K(objF4);
                    }
                    interfaceC3540l.J();
                    T.O.f(enumC8512gC4, (InterfaceC6839p) objF4, interfaceC3540l, 0);
                    interfaceC3540l.J();
                }
                boolean z10 = this.f65651b;
                interfaceC3540l.U(411459436);
                boolean zL5 = interfaceC3540l.l(this.f65652c) | interfaceC3540l.l(this.f65650a);
                final Ii.N n10 = this.f65652c;
                final C3335n0 c3335n05 = this.f65650a;
                Object objF5 = interfaceC3540l.f();
                if (zL5 || objF5 == InterfaceC3540l.f21100a.a()) {
                    objF5 = new InterfaceC6824a() { // from class: xe.E
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return AbstractC8460B.c.a.c(n10, c3335n05);
                        }
                    };
                    interfaceC3540l.K(objF5);
                }
                interfaceC3540l.J();
                AbstractC5263a.a(z10, (InterfaceC6824a) objF5, interfaceC3540l, 0, 0);
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

        c(AbstractC8513h abstractC8513h, C3335n0 c3335n0, Ii.N n10) {
            this.f65647a = abstractC8513h;
            this.f65648b = c3335n0;
            this.f65649c = n10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EnumC8512g c(z1 z1Var) {
            return (EnumC8512g) z1Var.getValue();
        }

        public final void b(InterfaceC8687j ModalBottomSheetLayout, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1308025458, i10, -1, "com.ui.wifiman.ui.AppPopup.<anonymous> (WiFimanAppNavigation.kt:286)");
            }
            z1 z1VarB = o1.b(this.f65647a.n0(), null, interfaceC3540l, 0, 1);
            Fe.e.b(null, b0.c.e(1069461460, true, new a(this.f65648b, c(z1VarB) != EnumC8512g.NONE, this.f65649c, z1VarB), interfaceC3540l, 54), interfaceC3540l, 48, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: xe.B$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f65665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f65666b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ii.N f65667c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC8513h f65668d;

        /* renamed from: xe.B$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f65669a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC8513h f65670b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC8513h abstractC8513h, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f65670b = abstractC8513h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f65670b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f65669a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    AbstractC8513h abstractC8513h = this.f65670b;
                    this.f65669a = 1;
                    if (abstractC8513h.p0(this) == objG) {
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
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, Ii.N n10, AbstractC8513h abstractC8513h, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f65666b = z10;
            this.f65667c = n10;
            this.f65668d = abstractC8513h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f65666b, this.f65667c, this.f65668d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f65665a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            if (!this.f65666b) {
                AbstractC3063k.d(this.f65667c, null, null, new a(this.f65668d, null), 3, null);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: xe.B$e */
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65671a;

        static {
            int[] iArr = new int[EnumC3337o0.values().length];
            try {
                iArr[EnumC3337o0.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3337o0.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3337o0.HalfExpanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65671a = iArr;
        }
    }

    private static final boolean A(z1 z1Var) {
        return ((Boolean) z1Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3335n0 B() {
        throw new IllegalStateException("No Modal Sheet state set");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC8511f.b C() {
        return new InterfaceC8511f.c(0L, new InterfaceC6824a() { // from class: xe.n
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return AbstractC8460B.D();
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J D() {
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(f2.u uVar, r0 r0Var, mh.q qVar) {
        C8484a c8484a = C8484a.f65879a;
        g2.k.b(uVar, "empty", null, null, null, null, null, null, null, c8484a.w(), 254, null);
        I(r0Var, uVar, qVar, I.C8469c.f65781a, null, c8484a.H(), 16, null);
        H(r0Var, uVar, qVar, I.C8481p.f65821a, Ae.n.FADE_IN, c8484a.S());
        H(r0Var, uVar, qVar, I.t.f65829a, Ae.n.SLIDE_FROM_BOTTOM, c8484a.T());
        I(r0Var, uVar, qVar, I.C8468b.f65779a, null, c8484a.U(), 16, null);
        I(r0Var, uVar, qVar, I.L.f65757a, null, c8484a.V(), 16, null);
        I(r0Var, uVar, qVar, I.C8473g.f65793a, null, c8484a.W(), 16, null);
        I(r0Var, uVar, qVar, I.C2328I.f65749a, null, c8484a.b(), 16, null);
        I(r0Var, uVar, qVar, I.J.f65751a, null, c8484a.c(), 16, null);
        I(r0Var, uVar, qVar, I.C8470d.f65783a, null, c8484a.d(), 16, null);
        I(r0Var, uVar, qVar, I.C8467a.f65777a, null, c8484a.e(), 16, null);
        I(r0Var, uVar, qVar, I.s.f65827a, null, c8484a.f(), 16, null);
        I(r0Var, uVar, qVar, I.C8483r.f65825a, null, c8484a.g(), 16, null);
        I(r0Var, uVar, qVar, I.C8482q.f65823a, null, c8484a.h(), 16, null);
        I(r0Var, uVar, qVar, I.C8471e.f65785a, null, c8484a.i(), 16, null);
        I(r0Var, uVar, qVar, I.C8472f.f65789a, null, c8484a.j(), 16, null);
        I(r0Var, uVar, qVar, N.f65853a, null, c8484a.k(), 16, null);
        I(r0Var, uVar, qVar, M.f65851a, null, c8484a.m(), 16, null);
        I(r0Var, uVar, qVar, I.R.f65775a, null, c8484a.n(), 16, null);
        I(r0Var, uVar, qVar, I.Q.f65773a, null, c8484a.o(), 16, null);
        I(r0Var, uVar, qVar, I.O.f65767a, null, c8484a.p(), 16, null);
        I(r0Var, uVar, qVar, I.P.f65771a, null, c8484a.q(), 16, null);
        I(r0Var, uVar, qVar, I.M.f65759a, null, c8484a.r(), 16, null);
        I(r0Var, uVar, qVar, I.N.f65763a, null, c8484a.s(), 16, null);
        I(r0Var, uVar, qVar, I.K.f65753a, null, c8484a.t(), 16, null);
        I(r0Var, uVar, qVar, I.G.f65743a, null, c8484a.u(), 16, null);
        I(r0Var, uVar, qVar, I.H.f65747a, null, c8484a.v(), 16, null);
        I(r0Var, uVar, qVar, I.E.f65735a, null, c8484a.x(), 16, null);
        I(r0Var, uVar, qVar, I.F.f65739a, null, c8484a.y(), 16, null);
        I(r0Var, uVar, qVar, I.y.f65843a, null, c8484a.z(), 16, null);
        I(r0Var, uVar, qVar, I.C.f65731a, null, c8484a.A(), 16, null);
        I(r0Var, uVar, qVar, I.B.f65727a, null, c8484a.B(), 16, null);
        I(r0Var, uVar, qVar, I.z.f65847a, null, c8484a.C(), 16, null);
        I(r0Var, uVar, qVar, I.A.f65723a, null, c8484a.D(), 16, null);
        I(r0Var, uVar, qVar, I.D.f65733a, null, c8484a.E(), 16, null);
        I(r0Var, uVar, qVar, I.C8477l.f65811a, null, c8484a.F(), 16, null);
        I(r0Var, uVar, qVar, I.C8478m.f65813a, null, c8484a.G(), 16, null);
        I(r0Var, uVar, qVar, I.C8479n.f65815a, null, c8484a.I(), 16, null);
        I(r0Var, uVar, qVar, I.x.f65839a, null, c8484a.J(), 16, null);
        I(r0Var, uVar, qVar, I.C8474h.f65795a, null, c8484a.K(), 16, null);
        I(r0Var, uVar, qVar, I.C8476k.f65807a, null, c8484a.L(), 16, null);
        I(r0Var, uVar, qVar, I.i.f65799a, null, c8484a.M(), 16, null);
        I(r0Var, uVar, qVar, I.C8475j.f65803a, null, c8484a.N(), 16, null);
        I(r0Var, uVar, qVar, I.v.f65833a, null, c8484a.O(), 16, null);
        I(r0Var, uVar, qVar, I.w.f65835a, null, c8484a.P(), 16, null);
        I(r0Var, uVar, qVar, I.u.f65831a, null, c8484a.Q(), 16, null);
        I(r0Var, uVar, qVar, I.C8480o.f65817a, null, c8484a.R(), 16, null);
    }

    static /* synthetic */ void G(f2.u uVar, r0 r0Var, mh.q qVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qVar = null;
        }
        F(uVar, r0Var, qVar);
    }

    private static final void H(r0 r0Var, f2.u uVar, mh.q qVar, Ae.p pVar, Ae.n nVar, mh.q qVar2) {
        r0Var.b(pVar);
        Ae.a.a(uVar, pVar, nVar, qVar, qVar2);
    }

    static /* synthetic */ void I(r0 r0Var, f2.u uVar, mh.q qVar, Ae.p pVar, Ae.n nVar, mh.q qVar2, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            nVar = null;
        }
        H(r0Var, uVar, qVar, pVar, nVar, qVar2);
    }

    public static final H0 J() {
        return f65625b;
    }

    public static final H0 K() {
        return f65624a;
    }

    public static final void L(AbstractC8464F screen, f2.n navController, f2.n navControllerModal, Qe.d wifimanRootController) {
        AbstractC6492s.i(screen, "screen");
        AbstractC6492s.i(navController, "navController");
        AbstractC6492s.i(navControllerModal, "navControllerModal");
        AbstractC6492s.i(wifimanRootController, "wifimanRootController");
        if (screen instanceof AbstractC8464F.g) {
            wifimanRootController.f(((AbstractC8464F.g) screen).a());
            f2.r rVarG = navController.G();
            String strW = rVarG != null ? rVarG.w() : null;
            I.C8481p c8481p = I.C8481p.f65821a;
            if (!AbstractC6492s.d(strW, c8481p.a())) {
                f2.n.W(navController, c8481p.a(), AbstractC5495A.a(new InterfaceC6835l() { // from class: xe.i
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC8460B.M((f2.z) obj);
                    }
                }), null, 4, null);
            }
            f2.n.W(navControllerModal, "empty", AbstractC5495A.a(new InterfaceC6835l() { // from class: xe.q
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return AbstractC8460B.N((f2.z) obj);
                }
            }), null, 4, null);
            return;
        }
        if (screen instanceof AbstractC8464F.a) {
            f2.n.W(navController, I.C8469c.f65781a.a(), AbstractC5495A.a(new InterfaceC6835l() { // from class: xe.r
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return AbstractC8460B.P((f2.z) obj);
                }
            }), null, 4, null);
            return;
        }
        if (screen instanceof AbstractC8464F.i.e) {
            f2.n.W(navController, I.t.f65829a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.i.b) {
            f2.n.W(navController, I.C8468b.f65779a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.i.d) {
            f2.n.W(navControllerModal, I.C8473g.f65793a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.i.f) {
            f2.n.W(navControllerModal, I.C2328I.f65749a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.i.g) {
            f2.n.W(navControllerModal, I.J.f65751a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.i.h) {
            f2.n.W(navControllerModal, I.L.f65757a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.i.c) {
            f2.n.W(navController, I.C8470d.f65783a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.i.a) {
            f2.n.W(navControllerModal, I.C8467a.f65777a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.d) {
            f2.n.W(navControllerModal, I.C8477l.f65811a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.e.b) {
            f2.n.W(navController, I.C8478m.f65813a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.e.a) {
            f2.n.W(navControllerModal, I.C8479n.f65815a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.k) {
            f2.n.W(navControllerModal, I.x.f65839a.g(((AbstractC8464F.k) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.h.a) {
            f2.n.W(navControllerModal, I.C8483r.f65825a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.h.c) {
            f2.n.W(navControllerModal, I.C8482q.f65823a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.h.b) {
            f2.n.W(navController, I.s.f65827a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.b.a) {
            f2.n.W(navController, I.C8471e.f65785a.i(((AbstractC8464F.b.a) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.b.C2327b) {
            f2.n.W(navControllerModal, I.C8472f.f65789a.g(((AbstractC8464F.b.C2327b) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.c.b) {
            f2.n.W(navControllerModal, N.f65853a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.c.a) {
            f2.n.W(navControllerModal, M.f65851a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof C8466H) {
            f2.n.W(navControllerModal, I.R.f65775a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof C8465G) {
            f2.n.W(navControllerModal, I.Q.f65773a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.p.a) {
            f2.n.W(navController, I.O.f65767a.g(((AbstractC8464F.p.a) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.p.b) {
            f2.n.W(navControllerModal, I.P.f65771a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.n) {
            f2.n.W(navController, I.M.f65759a.f(((AbstractC8464F.n) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.o) {
            f2.n.W(navController, I.N.f65763a.r(new com.ui.wifiman.ui.wifi.channel.b(((AbstractC8464F.o) screen).a())), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.m.e) {
            f2.n.W(navControllerModal, I.K.f65753a.g(((AbstractC8464F.m.e) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.m.c) {
            f2.n.W(navControllerModal, I.G.f65743a.f(((AbstractC8464F.m.c) screen).a()), AbstractC5495A.a(new InterfaceC6835l() { // from class: xe.s
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return AbstractC8460B.R((f2.z) obj);
                }
            }), null, 4, null);
            return;
        }
        if (screen instanceof AbstractC8464F.m.d) {
            f2.n.W(navControllerModal, I.H.f65747a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.m.a) {
            f2.n.W(navControllerModal, I.E.f65735a.g(((AbstractC8464F.m.a) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.m.b) {
            f2.n.W(navControllerModal, I.F.f65739a.g(((AbstractC8464F.m.b) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.l.e) {
            f2.n.W(navControllerModal, I.y.f65843a.q(((AbstractC8464F.l.e) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.l.d) {
            f2.n.W(navController, I.C.f65731a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.l.b) {
            f2.n.W(navControllerModal, I.B.f65727a.h(((AbstractC8464F.l.b) screen).a()), AbstractC5495A.a(new InterfaceC6835l() { // from class: xe.t
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return AbstractC8460B.S((f2.z) obj);
                }
            }), null, 4, null);
            return;
        }
        if (screen instanceof AbstractC8464F.l.f) {
            f2.n.W(navControllerModal, I.z.f65847a.g(((AbstractC8464F.l.f) screen).a()), AbstractC5495A.a(new InterfaceC6835l() { // from class: xe.u
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return AbstractC8460B.T((f2.z) obj);
                }
            }), null, 4, null);
            return;
        }
        if (screen instanceof AbstractC8464F.l.c) {
            f2.n.W(navControllerModal, I.A.f65723a.g(((AbstractC8464F.l.c) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.l.a) {
            f2.n.W(navControllerModal, I.D.f65733a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.j.e) {
            f2.n.W(navController, I.C8474h.f65795a.i(((AbstractC8464F.j.e) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.j.c) {
            f2.n.W(navController, I.C8475j.f65803a.g(((AbstractC8464F.j.c) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.j.d) {
            f2.n.W(navControllerModal, I.C8476k.f65807a.g(((AbstractC8464F.j.d) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.j.b) {
            f2.n.W(navControllerModal, I.i.f65799a.g(((AbstractC8464F.j.b) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.j.f) {
            f2.n.W(navControllerModal, I.v.f65833a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.j.g) {
            f2.n.W(navControllerModal, I.w.f65835a.g(((AbstractC8464F.j.g) screen).a()), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.j.a) {
            f2.n.W(navControllerModal, I.u.f65831a.a(), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.f.c) {
            f2.n.W(navControllerModal, I.C8480o.f65817a.g(Oe.a.PERMISSION_LOCATION), null, null, 6, null);
            return;
        }
        if (screen instanceof AbstractC8464F.f.d) {
            f2.n.W(navControllerModal, I.C8480o.f65817a.g(Oe.a.LOCATION_ACCESS), null, null, 6, null);
        } else if (screen instanceof AbstractC8464F.f.a) {
            f2.n.W(navControllerModal, I.C8480o.f65817a.g(Oe.a.PERMISSION_CELLULAR), null, null, 6, null);
        } else {
            if (!(screen instanceof AbstractC8464F.f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f2.n.W(navControllerModal, I.C8480o.f65817a.g(Oe.a.NO_WIFIMAN_API), null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J M(f2.z navOptions) {
        AbstractC6492s.i(navOptions, "$this$navOptions");
        f2.z.e(navOptions, 0, null, 2, null);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J N(f2.z navOptions) {
        AbstractC6492s.i(navOptions, "$this$navOptions");
        navOptions.d("empty", new InterfaceC6835l() { // from class: xe.p
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8460B.O((C5501G) obj);
            }
        });
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J O(C5501G popUpTo) {
        AbstractC6492s.i(popUpTo, "$this$popUpTo");
        popUpTo.c(true);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J P(f2.z navOptions) {
        AbstractC6492s.i(navOptions, "$this$navOptions");
        navOptions.c(0, new InterfaceC6835l() { // from class: xe.o
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8460B.Q((C5501G) obj);
            }
        });
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J Q(C5501G popUpTo) {
        AbstractC6492s.i(popUpTo, "$this$popUpTo");
        popUpTo.c(true);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J R(f2.z navOptions) {
        AbstractC6492s.i(navOptions, "$this$navOptions");
        f2.z.f(navOptions, "empty", null, 2, null);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J S(f2.z navOptions) {
        AbstractC6492s.i(navOptions, "$this$navOptions");
        f2.z.f(navOptions, "empty", null, 2, null);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J T(f2.z navOptions) {
        AbstractC6492s.i(navOptions, "$this$navOptions");
        f2.z.f(navOptions, "empty", null, 2, null);
        return Yg.J.f24997a;
    }

    public static final void r(final r0 analytics, final f2.w navHostController, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(analytics, "analytics");
        AbstractC6492s.i(navHostController, "navHostController");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2010315072);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC3540lR.T(analytics) : interfaceC3540lR.l(analytics) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(navHostController) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2010315072, i11, -1, "com.ui.wifiman.ui.AppModalNavigation (WiFimanAppNavigation.kt:181)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                T.A a10 = new T.A(T.O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            final Ii.N nA = ((T.A) objF).a();
            final C3335n0 c3335n0 = (C3335n0) interfaceC3540lR.t(f65625b);
            interfaceC3540lR.U(-452184039);
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new InterfaceC8511f.c(0L, new InterfaceC6824a() { // from class: xe.v
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC8460B.s(navHostController, nA, c3335n0);
                    }
                }, 1, null);
                interfaceC3540lR.K(objF2);
            }
            InterfaceC8511f.c cVar = (InterfaceC8511f.c) objF2;
            interfaceC3540lR.J();
            AbstractC3561w.a(f65624a.d(cVar), b0.c.e(211402240, true, new a(c3335n0, navHostController, analytics, cVar), interfaceC3540lR, 54), interfaceC3540lR, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: xe.w
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8460B.t(analytics, navHostController, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J s(f2.w wVar, Ii.N n10, C3335n0 c3335n0) {
        f2.r rVarF;
        C5512k c5512kL = wVar.L();
        if (AbstractC6492s.d((c5512kL == null || (rVarF = c5512kL.f()) == null) ? null : rVarF.w(), "empty")) {
            AbstractC3063k.d(n10, null, null, new b(c3335n0, null), 3, null);
        } else {
            wVar.Z();
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J t(r0 r0Var, f2.w wVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        r(r0Var, wVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void u(final r0 analytics, final f2.w navHostController, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(analytics, "analytics");
        AbstractC6492s.i(navHostController, "navHostController");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1980538151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC3540lR.T(analytics) : interfaceC3540lR.l(analytics) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(navHostController) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1980538151, i11, -1, "com.ui.wifiman.ui.AppNavigation (WiFimanAppNavigation.kt:160)");
            }
            boolean z10 = true;
            androidx.compose.ui.e eVarA = AbstractC8223c.a(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            String strA = I.C8481p.f65821a.a();
            Ae.n nVar = Ae.n.SLIDE_FROM_RIGHT;
            InterfaceC6835l enterTransition = nVar.getEnterTransition();
            InterfaceC6835l exitTransition = nVar.getExitTransition();
            InterfaceC6835l popEnterTransition = nVar.getPopEnterTransition();
            InterfaceC6835l popExitTransition = nVar.getPopExitTransition();
            interfaceC3540lR.U(1681989480);
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !interfaceC3540lR.l(analytics))) {
                z10 = false;
            }
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: xe.j
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC8460B.v(analytics, (f2.u) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            g2.m.b(navHostController, strA, eVarA, null, null, enterTransition, exitTransition, popEnterTransition, popExitTransition, null, (InterfaceC6835l) objF, interfaceC3540lR, ((i11 >> 3) & 14) | 115015728, 0, 536);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: xe.k
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8460B.w(analytics, navHostController, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J v(r0 r0Var, f2.u NavHost) {
        AbstractC6492s.i(NavHost, "$this$NavHost");
        G(NavHost, r0Var, null, 2, null);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J w(r0 r0Var, f2.w wVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        u(r0Var, wVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void x(final AbstractC8513h vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-385051836);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(vm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-385051836, i11, -1, "com.ui.wifiman.ui.AppPopup (WiFimanAppNavigation.kt:262)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                T.A a10 = new T.A(T.O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            Ii.N nA = ((T.A) objF).a();
            final z1 z1VarB = o1.b(vm.o0(), null, interfaceC3540lR, 0, 1);
            EnumC3337o0 enumC3337o0 = EnumC3337o0.Hidden;
            interfaceC3540lR.U(1256848841);
            boolean zT = interfaceC3540lR.T(z1VarB);
            Object objF2 = interfaceC3540lR.f();
            if (zT || objF2 == aVar.a()) {
                objF2 = new InterfaceC6835l() { // from class: xe.l
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(AbstractC8460B.y(z1VarB, (EnumC3337o0) obj));
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            C3335n0 c3335n0J = AbstractC3333m0.j(enumC3337o0, null, (InterfaceC6835l) objF2, true, interfaceC3540lR, 3078, 2);
            boolean z10 = true;
            int i12 = i11;
            AbstractC3333m0.b(b0.c.e(1308025458, true, new c(vm, c3335n0J, nA), interfaceC3540lR, 54), null, c3335n0J, false, Q.b.f18744a.b(interfaceC3540lR, 6), Y0.h.j(0), C6733v0.f52951b.d(), ((C6733v0) interfaceC3540lR.t(AbstractC3345t.a())).u(), 0L, C8484a.f65879a.l(), interfaceC3540lR, (C3335n0.f14622e << 6) | 807075846, 266);
            boolean z11 = c3335n0J.g() != enumC3337o0;
            Boolean boolValueOf = Boolean.valueOf(z11);
            interfaceC3540l2 = interfaceC3540lR;
            interfaceC3540l2.U(1256923312);
            boolean zC = interfaceC3540l2.c(z11) | interfaceC3540l2.l(nA);
            if ((i12 & 14) != 4) {
                z10 = false;
            }
            boolean z12 = zC | z10;
            Object objF3 = interfaceC3540l2.f();
            if (z12 || objF3 == aVar.a()) {
                objF3 = new d(z11, nA, vm, null);
                interfaceC3540l2.K(objF3);
            }
            interfaceC3540l2.J();
            T.O.f(boolValueOf, (InterfaceC6839p) objF3, interfaceC3540l2, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: xe.m
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8460B.z(vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(z1 z1Var, EnumC3337o0 popupState) {
        AbstractC6492s.i(popupState, "popupState");
        Z7.b.h("Popup bottom sheet state change: " + popupState, null, 2, null);
        int i10 = e.f65671a[popupState.ordinal()];
        if (i10 == 1) {
            return A(z1Var);
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J z(AbstractC8513h abstractC8513h, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        x(abstractC8513h, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
