package Re;

import C0.C;
import E0.InterfaceC2629g;
import F9.AbstractC2856u;
import F9.AbstractC2859x;
import Ii.AbstractC3063k;
import Ii.N;
import L0.C3174d;
import L9.AbstractC3198d;
import L9.E;
import L9.L;
import L9.z;
import N.C0;
import N.a1;
import Re.m;
import T.A;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import Yg.J;
import Zg.AbstractC3682n;
import android.content.res.Resources;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import c2.AbstractC4197c;
import c2.C4195a;
import d.AbstractC5265c;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import of.C7125a;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import s9.b;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import ye.AbstractC8664j;
import ye.C8663i;
import z.AbstractC8685h;
import z.AbstractC8696t;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8675A;
import z.Y;
import z.a0;
import z.j0;

/* loaded from: classes4.dex */
public abstract class m {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f19758a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f19759b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Re.a f19760c;

        /* renamed from: Re.m$a$a, reason: collision with other inner class name */
        static final class C0712a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f19761a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Re.a f19762b;

            /* renamed from: Re.m$a$a$a, reason: collision with other inner class name */
            static final class C0713a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ N f19763a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Re.a f19764b;

                /* renamed from: Re.m$a$a$a$a, reason: collision with other inner class name */
                static final class C0714a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f19765a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Re.a f19766b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0714a(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f19766b = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new C0714a(this.f19766b, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        AbstractC5467b.g();
                        if (this.f19765a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                        this.f19766b.q0();
                        return J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C0714a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                    }
                }

                C0713a(N n10, Re.a aVar) {
                    this.f19763a = n10;
                    this.f19764b = aVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(N n10, Re.a aVar) {
                    AbstractC3063k.d(n10, null, null, new C0714a(aVar, null), 3, null);
                    return J.f24997a;
                }

                public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                    if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(537673139, i10, -1, "com.ui.wifiman.ui.settings.AppSettings.<anonymous>.<anonymous>.<anonymous> (AppSettingsUi.kt:72)");
                    }
                    s9.b bVarB = N9.b.f16117a.b();
                    interfaceC3540l.U(-1927689424);
                    boolean zL = interfaceC3540l.l(this.f19763a) | interfaceC3540l.T(this.f19764b);
                    final N n10 = this.f19763a;
                    final Re.a aVar = this.f19764b;
                    Object objF = interfaceC3540l.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: Re.l
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return m.a.C0712a.C0713a.c(n10, aVar);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    z.c(bVarB, null, 0L, false, (InterfaceC6824a) objF, interfaceC3540l, 0, 14);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            C0712a(N n10, Re.a aVar) {
                this.f19761a = n10;
                this.f19762b = aVar;
            }

            public final void a(Y UiToolbar, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiToolbar, "$this$UiToolbar");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1233113894, i10, -1, "com.ui.wifiman.ui.settings.AppSettings.<anonymous>.<anonymous> (AppSettingsUi.kt:71)");
                }
                L.b(null, b0.c.e(537673139, true, new C0713a(this.f19761a, this.f19762b), interfaceC3540l, 54), interfaceC3540l, 48, 1);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a(InterfaceC8511f.b bVar, N n10, Re.a aVar) {
            this.f19758a = bVar;
            this.f19759b = n10;
            this.f19760c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(274515946, i10, -1, "com.ui.wifiman.ui.settings.AppSettings.<anonymous> (AppSettingsUi.kt:63)");
            }
            androidx.compose.ui.e eVarC = j0.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            String strA = H0.f.a(AbstractC6780c.f53443Z1, interfaceC3540l, 0);
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            interfaceC3540l.U(-231235428);
            boolean zT = interfaceC3540l.T(this.f19758a);
            final InterfaceC8511f.b bVar = this.f19758a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Re.k
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return m.a.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            E.i(eVarC, strA, aVar, (InterfaceC6824a) objF, b0.c.e(-1233113894, true, new C0712a(this.f19759b, this.f19760c), interfaceC3540l, 54), 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, (AbstractC3198d.a.f11403c << 6) | 24576, 0, 2016);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Re.a f19767a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7125a.c f19768b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f19769c;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7125a.c f19770a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b.C2145b f19771b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ s9.b f19772c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ N f19773d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Re.a f19774e;

            /* renamed from: Re.m$b$a$a, reason: collision with other inner class name */
            static final class C0715a implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b.C2145b f19775a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s9.b f19776b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ N f19777c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Re.a f19778d;

                /* renamed from: Re.m$b$a$a$a, reason: collision with other inner class name */
                static final class C0716a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f19779a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Re.a f19780b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0716a(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f19780b = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new C0716a(this.f19780b, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        AbstractC5467b.g();
                        if (this.f19779a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                        this.f19780b.y0();
                        return J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C0716a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                    }
                }

                C0715a(b.C2145b c2145b, s9.b bVar, N n10, Re.a aVar) {
                    this.f19775a = c2145b;
                    this.f19776b = bVar;
                    this.f19777c = n10;
                    this.f19778d = aVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(N n10, Re.a aVar) {
                    AbstractC3063k.d(n10, null, null, new C0716a(aVar, null), 3, null);
                    return J.f24997a;
                }

                public final void b(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-721241803, i10, -1, "com.ui.wifiman.ui.settings.AppSettings.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppSettingsUi.kt:124)");
                    }
                    androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                    s9.b bVarF = N9.b.f16117a.a().f(this.f19775a);
                    String strA = H0.f.a(AbstractC6780c.f53411U1, interfaceC3540l, 0);
                    s9.b bVar = this.f19776b;
                    F9.r rVar = F9.r.DEFAULT_WITH_BLUE_ICON;
                    interfaceC3540l.U(449526002);
                    boolean zL = interfaceC3540l.l(this.f19777c) | interfaceC3540l.T(this.f19778d);
                    final N n10 = this.f19777c;
                    final Re.a aVar = this.f19778d;
                    Object objF = interfaceC3540l.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: Re.o
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return m.b.a.C0715a.c(n10, aVar);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    AbstractC2856u.c(eVarH, bVarF, strA, null, null, bVar, rVar, true, null, null, (InterfaceC6824a) objF, null, 0.0f, null, interfaceC3540l, 14155782, 0, 15128);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    b((InterfaceC3540l) obj, ((Number) obj2).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: Re.m$b$a$b, reason: collision with other inner class name */
            static final class C0717b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f19781a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Re.a f19782b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0717b(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f19782b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0717b(this.f19782b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f19781a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f19782b.t0();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C0717b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            a(C7125a.c cVar, b.C2145b c2145b, s9.b bVar, N n10, Re.a aVar) {
                this.f19770a = cVar;
                this.f19771b = c2145b;
                this.f19772c = bVar;
                this.f19773d = n10;
                this.f19774e = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(N n10, Re.a aVar) {
                AbstractC3063k.d(n10, null, null, new C0717b(aVar, null), 3, null);
                return J.f24997a;
            }

            public final void b(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1816217745, i10, -1, "com.ui.wifiman.ui.settings.AppSettings.<anonymous>.<anonymous>.<anonymous> (AppSettingsUi.kt:120)");
                }
                UiSettingsCard.a(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), o1.b(this.f19770a.n0(), null, interfaceC3540l, 0, 1).getValue() == C7125a.EnumC2013a.LOGGED_IN, b0.c.e(-721241803, true, new C0715a(this.f19771b, this.f19772c, this.f19773d, this.f19774e), interfaceC3540l, 54), interfaceC3540l, ((i10 << 9) & 7168) | 390);
                s9.b bVarF = N9.b.f16117a.y().f(this.f19771b);
                String strA = H0.f.a(AbstractC6780c.f53601w, interfaceC3540l, 0);
                F9.r rVar = F9.r.DEFAULT_WITH_BLUE_ICON;
                s9.b bVar = this.f19772c;
                interfaceC3540l.U(-1927594959);
                boolean zL = interfaceC3540l.l(this.f19773d) | interfaceC3540l.T(this.f19774e);
                final N n10 = this.f19773d;
                final Re.a aVar = this.f19774e;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: Re.n
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return m.b.a.c(n10, aVar);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                AbstractC2856u.c(null, bVarF, strA, null, null, bVar, rVar, true, null, null, (InterfaceC6824a) objF, null, 0.0f, null, interfaceC3540l, 14155776, 0, 15129);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                b((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        /* renamed from: Re.m$b$b, reason: collision with other inner class name */
        static final class C0718b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.C2145b f19783a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s9.b f19784b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f19785c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Re.a f19786d;

            /* renamed from: Re.m$b$b$a */
            static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f19787a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Re.a f19788b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f19788b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f19788b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f19787a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f19788b.A0();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: Re.m$b$b$b, reason: collision with other inner class name */
            static final class C0719b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f19789a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Re.a f19790b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0719b(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f19790b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0719b(this.f19790b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f19789a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f19790b.D0();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C0719b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: Re.m$b$b$c */
            static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f19791a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Re.a f19792b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f19792b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new c(this.f19792b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f19791a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f19792b.u0();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: Re.m$b$b$d */
            static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f19793a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Re.a f19794b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f19794b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new d(this.f19794b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f19793a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f19794b.B0();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            C0718b(b.C2145b c2145b, s9.b bVar, N n10, Re.a aVar) {
                this.f19783a = c2145b;
                this.f19784b = bVar;
                this.f19785c = n10;
                this.f19786d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J h(N n10, Re.a aVar) {
                AbstractC3063k.d(n10, null, null, new a(aVar, null), 3, null);
                return J.f24997a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J i(N n10, Re.a aVar) {
                AbstractC3063k.d(n10, null, null, new C0719b(aVar, null), 3, null);
                return J.f24997a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J j(N n10, Re.a aVar) {
                AbstractC3063k.d(n10, null, null, new c(aVar, null), 3, null);
                return J.f24997a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J k(N n10, Re.a aVar) {
                AbstractC3063k.d(n10, null, null, new d(aVar, null), 3, null);
                return J.f24997a;
            }

            public final void f(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2103227784, i10, -1, "com.ui.wifiman.ui.settings.AppSettings.<anonymous>.<anonymous>.<anonymous> (AppSettingsUi.kt:152)");
                }
                e.a aVar = androidx.compose.ui.e.f28771b0;
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
                N9.b bVar = N9.b.f16117a;
                s9.b bVarF = bVar.D().f(this.f19783a);
                String strA = H0.f.a(AbstractC6780c.f53464c2, interfaceC3540l, 0);
                F9.r rVar = F9.r.DEFAULT_WITH_BLUE_ICON;
                s9.b bVar2 = this.f19784b;
                interfaceC3540l.U(-1927568271);
                boolean zL = interfaceC3540l.l(this.f19785c) | interfaceC3540l.T(this.f19786d);
                final N n10 = this.f19785c;
                final Re.a aVar2 = this.f19786d;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: Re.p
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return m.b.C0718b.h(n10, aVar2);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                AbstractC2856u.c(eVarH, bVarF, strA, null, null, bVar2, rVar, true, null, null, (InterfaceC6824a) objF, null, 0.0f, null, interfaceC3540l, 14155782, 0, 15128);
                androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
                s9.b bVarF2 = Pe.a.f18599a.p().f(this.f19783a);
                String strA2 = H0.f.a(AbstractC6780c.f53492g2, interfaceC3540l, 0);
                String strA3 = H0.f.a(AbstractC6780c.f53499h2, interfaceC3540l, 0);
                s9.b bVar3 = this.f19784b;
                interfaceC3540l.U(-1927548494);
                boolean zL2 = interfaceC3540l.l(this.f19785c) | interfaceC3540l.T(this.f19786d);
                final N n11 = this.f19785c;
                final Re.a aVar3 = this.f19786d;
                Object objF2 = interfaceC3540l.f();
                if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new InterfaceC6824a() { // from class: Re.q
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return m.b.C0718b.i(n11, aVar3);
                        }
                    };
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                AbstractC2856u.c(eVarH2, bVarF2, strA2, strA3, null, bVar3, rVar, true, null, null, (InterfaceC6824a) objF2, null, 0.0f, null, interfaceC3540l, 14155782, 0, 15120);
                androidx.compose.ui.e eVarH3 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
                s9.b bVarF3 = bVar.N().f(this.f19783a);
                String strA4 = H0.f.a(AbstractC6780c.f53506i2, interfaceC3540l, 0);
                s9.b bVar4 = this.f19784b;
                interfaceC3540l.U(-1927531665);
                boolean zL3 = interfaceC3540l.l(this.f19785c) | interfaceC3540l.T(this.f19786d);
                final N n12 = this.f19785c;
                final Re.a aVar4 = this.f19786d;
                Object objF3 = interfaceC3540l.f();
                if (zL3 || objF3 == InterfaceC3540l.f21100a.a()) {
                    objF3 = new InterfaceC6824a() { // from class: Re.r
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return m.b.C0718b.j(n12, aVar4);
                        }
                    };
                    interfaceC3540l.K(objF3);
                }
                interfaceC3540l.J();
                AbstractC2856u.c(eVarH3, bVarF3, strA4, null, null, bVar4, rVar, true, null, null, (InterfaceC6824a) objF3, null, 0.0f, null, interfaceC3540l, 14155782, 0, 15128);
                androidx.compose.ui.e eVarH4 = androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null);
                s9.b bVarF4 = bVar.n().f(this.f19783a);
                String strA5 = H0.f.a(AbstractC6780c.f53478e2, interfaceC3540l, 0);
                s9.b bVar5 = this.f19784b;
                interfaceC3540l.U(-1927515215);
                boolean zL4 = interfaceC3540l.l(this.f19785c) | interfaceC3540l.T(this.f19786d);
                final N n13 = this.f19785c;
                final Re.a aVar5 = this.f19786d;
                Object objF4 = interfaceC3540l.f();
                if (zL4 || objF4 == InterfaceC3540l.f21100a.a()) {
                    objF4 = new InterfaceC6824a() { // from class: Re.s
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return m.b.C0718b.k(n13, aVar5);
                        }
                    };
                    interfaceC3540l.K(objF4);
                }
                interfaceC3540l.J();
                AbstractC2856u.c(eVarH4, bVarF4, strA5, null, null, bVar5, rVar, true, null, null, (InterfaceC6824a) objF4, null, 0.0f, null, interfaceC3540l, 14155782, 0, 15128);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                f((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        static final class c implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f19795a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f19796b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f19797c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Re.a f19798d;

            static final class a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ N f19799a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Re.a f19800b;

                /* renamed from: Re.m$b$c$a$a, reason: collision with other inner class name */
                static final class C0720a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f19801a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Re.a f19802b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0720a(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f19802b = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new C0720a(this.f19802b, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        AbstractC5467b.g();
                        if (this.f19801a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                        this.f19802b.v0();
                        return J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C0720a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                    }
                }

                a(N n10, Re.a aVar) {
                    this.f19799a = n10;
                    this.f19800b = aVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(N n10, Re.a aVar) {
                    AbstractC3063k.d(n10, null, null, new C0720a(aVar, null), 3, null);
                    return J.f24997a;
                }

                public final void b(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-397083799, i10, -1, "com.ui.wifiman.ui.settings.AppSettings.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppSettingsUi.kt:200)");
                    }
                    F9.r rVar = F9.r.DEFAULT_WITH_BLUE_ICON;
                    interfaceC3540l.U(449646416);
                    boolean zL = interfaceC3540l.l(this.f19799a) | interfaceC3540l.T(this.f19800b);
                    final N n10 = this.f19799a;
                    final Re.a aVar = this.f19800b;
                    Object objF = interfaceC3540l.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: Re.t
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return m.b.c.a.c(n10, aVar);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    AbstractC2856u.c(null, null, "Developer Settings", null, null, null, rVar, true, null, null, (InterfaceC6824a) objF, null, 0.0f, null, interfaceC3540l, 14156160, 0, 15163);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    b((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            c(float f10, float f11, N n10, Re.a aVar) {
                this.f19795a = f10;
                this.f19796b = f11;
                this.f19797c = n10;
                this.f19798d = aVar;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1164416015, i10, -1, "com.ui.wifiman.ui.settings.AppSettings.<anonymous>.<anonymous>.<anonymous> (AppSettingsUi.kt:192)");
                }
                AbstractC2859x.c(androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.o.j(androidx.compose.ui.e.f28771b0, this.f19795a, this.f19796b), 0.0f, 1, null), null, null, null, null, null, null, null, b0.c.e(-397083799, true, new a(this.f19797c, this.f19798d), interfaceC3540l, 54), interfaceC3540l, 100663296, 254);
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

        static final class d implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f19803a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f19804b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f19805c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Re.a f19806d;

            static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f19807a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Re.a f19808b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f19808b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f19808b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f19807a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    this.f19808b.x0();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            d(float f10, float f11, N n10, Re.a aVar) {
                this.f19803a = f10;
                this.f19804b = f11;
                this.f19805c = n10;
                this.f19806d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(N n10, Re.a aVar) {
                AbstractC3063k.d(n10, null, null, new a(aVar, null), 3, null);
                return J.f24997a;
            }

            public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1837596440, i10, -1, "com.ui.wifiman.ui.settings.AppSettings.<anonymous>.<anonymous>.<anonymous> (AppSettingsUi.kt:220)");
                }
                androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.ui.e.f28771b0, this.f19803a, this.f19804b);
                interfaceC3540l.U(-1927464034);
                boolean zL = interfaceC3540l.l(this.f19805c) | interfaceC3540l.T(this.f19806d);
                final N n10 = this.f19805c;
                final Re.a aVar = this.f19806d;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: Re.u
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return m.b.d.c(n10, aVar);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                w9.o.c(eVarJ, (InterfaceC6824a) objF, false, false, null, H0.f.a(AbstractC6780c.f53383Q1, interfaceC3540l, 0), interfaceC3540l, 0, 28);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(Re.a aVar, C7125a.c cVar, N n10) {
            this.f19767a = aVar;
            this.f19768b = cVar;
            this.f19769c = n10;
        }

        public final void a(z.N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(scaffoldPadding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1791485405, i11, -1, "com.ui.wifiman.ui.settings.AppSettings.<anonymous> (AppSettingsUi.kt:85)");
            }
            androidx.compose.foundation.o oVarA = androidx.compose.foundation.m.a(0, interfaceC3540l, 0, 1);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            float fC = c6562a.d(interfaceC3540l, i12).a().a().c();
            float fC2 = c6562a.d(interfaceC3540l, i12).a().b().c();
            b.C2145b c2145bG = AbstractC8049c.g(c6562a.a(interfaceC3540l, i12).a().b().f(), "blue6");
            s9.b bVarK = N9.b.f16117a.k();
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.o.h(androidx.compose.foundation.m.d(androidx.compose.foundation.layout.r.f(aVar, 0.0f, 1, null), oVarA, false, null, false, 14, null), scaffoldPadding);
            interfaceC3540l.U(-231199774);
            Object value = o1.b(this.f19767a.o0(), null, interfaceC3540l, 0, 1).getValue();
            Boolean bool = Boolean.TRUE;
            C8680c.m mVarI = AbstractC6492s.d(value, bool) ? m.i(interfaceC3540l, 0) : C8680c.f66832a.g();
            interfaceC3540l.J();
            c.b bVarG = f0.c.f46573a.g();
            Re.a aVar2 = this.f19767a;
            C7125a.c cVar = this.f19768b;
            N n10 = this.f19769c;
            C cA = AbstractC8685h.a(mVarI, bVarG, interfaceC3540l, 48);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
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
            e.c(aVar, aVar2, cVar, interfaceC3540l, 6, 0);
            a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(48)), interfaceC3540l, 6);
            AbstractC2859x.c(androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.o.j(aVar, fC, fC2), 0.0f, 1, null), null, null, null, null, null, null, null, b0.c.e(1816217745, true, new a(cVar, c2145bG, bVarK, n10, aVar2), interfaceC3540l, 54), interfaceC3540l, 100663296, 254);
            AbstractC2859x.c(androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.o.j(aVar, fC, fC2), 0.0f, 1, null), null, null, null, null, null, null, null, b0.c.e(2103227784, true, new C0718b(c2145bG, bVarK, n10, aVar2), interfaceC3540l, 54), interfaceC3540l, 100663296, 254);
            AbstractC7385d.d(c8688k, ((Boolean) o1.b(aVar2.p0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue(), null, null, null, null, b0.c.e(-1164416015, true, new c(fC, fC2, n10, aVar2), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            m.e(androidx.compose.foundation.layout.o.j(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), c6562a.d(interfaceC3540l, i12).a().a().a(Y0.h.j(32)), c6562a.d(interfaceC3540l, i12).a().b().e()), aVar2, interfaceC3540l, 0, 0);
            AbstractC7385d.d(c8688k, AbstractC6492s.d(o1.b(aVar2.o0(), null, interfaceC3540l, 0, 1).getValue(), bool), null, null, null, null, b0.c.e(-1837596440, true, new d(fC, fC2, n10, aVar2), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((z.N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Re.a f19809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f19810b;

        /* synthetic */ class a extends C6490p implements InterfaceC6824a {
            a(Object obj) {
                super(0, obj, Re.a.class, "onVersionLongClicked", "onVersionLongClicked()V", 0);
            }

            public final void a() {
                ((Re.a) this.receiver).E0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f19811a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Re.a f19812b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f19812b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new b(this.f19812b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f19811a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                this.f19812b.C0();
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: Re.m$c$c, reason: collision with other inner class name */
        static final class C0721c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f19813a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Re.a f19814b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0721c(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f19814b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0721c(this.f19814b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f19813a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                this.f19814b.z0();
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C0721c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f19815a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Re.a f19816b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Re.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f19816b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new d(this.f19816b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f19815a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                this.f19816b.s0();
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        c(Re.a aVar, N n10) {
            this.f19809a = aVar;
            this.f19810b = n10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J h() {
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J i(N n10, Re.a aVar) {
            AbstractC3063k.d(n10, null, null, new b(aVar, null), 3, null);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J j(N n10, Re.a aVar) {
            AbstractC3063k.d(n10, null, null, new C0721c(aVar, null), 3, null);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J k(N n10, Re.a aVar) {
            AbstractC3063k.d(n10, null, null, new d(aVar, null), 3, null);
            return J.f24997a;
        }

        public final void f(InterfaceC8675A FlowRow, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            AbstractC6492s.i(FlowRow, "$this$FlowRow");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(393425381, i10, -1, "com.ui.wifiman.ui.settings.FooterRow.<anonymous> (AppSettingsUi.kt:251)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            String strA = H0.f.a(AbstractC6780c.f53471d2, interfaceC3540l, 0);
            Re.a aVar2 = this.f19809a;
            interfaceC3540l.U(-813232561);
            boolean zT = interfaceC3540l.T(aVar2);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(aVar2);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) ((th.g) objF);
            interfaceC3540l.U(-813239300);
            Object objF2 = interfaceC3540l.f();
            InterfaceC3540l.a aVar3 = InterfaceC3540l.f21100a;
            if (objF2 == aVar3.a()) {
                objF2 = new InterfaceC6824a() { // from class: Re.v
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return m.c.h();
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            androidx.compose.ui.e eVarG = androidx.compose.foundation.d.g(aVar, (46 & 1) != 0 ? true : true, (46 & 2) != 0 ? null : null, (46 & 4) != 0 ? null : null, (46 & 8) != 0 ? null : strA, (46 & 16) != 0 ? null : interfaceC6824a, (46 & 32) != 0 ? null : null, (InterfaceC6824a) objF2);
            C3174d c3174dA = AbstractC7930a.a((s9.d) o1.b(this.f19809a.n0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            a1.c(c3174dA, eVarG, c6562a.a(interfaceC3540l, i11).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().f(), interfaceC3540l, 0, 0, 131064);
            d.b bVar = new d.b(AbstractC6780c.f53485f2);
            interfaceC3540l.U(-813221495);
            boolean zL = interfaceC3540l.l(this.f19810b) | interfaceC3540l.T(this.f19809a);
            final N n10 = this.f19810b;
            final Re.a aVar4 = this.f19809a;
            Object objF3 = interfaceC3540l.f();
            if (zL || objF3 == aVar3.a()) {
                objF3 = new InterfaceC6824a() { // from class: Re.w
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return m.c.i(n10, aVar4);
                    }
                };
                interfaceC3540l.K(objF3);
            }
            interfaceC3540l.J();
            h.b(null, bVar, (InterfaceC6824a) objF3, interfaceC3540l, 0, 1);
            d.b bVar2 = new d.b(AbstractC6780c.f53457b2);
            interfaceC3540l.U(-813214452);
            boolean zL2 = interfaceC3540l.l(this.f19810b) | interfaceC3540l.T(this.f19809a);
            final N n11 = this.f19810b;
            final Re.a aVar5 = this.f19809a;
            Object objF4 = interfaceC3540l.f();
            if (zL2 || objF4 == aVar3.a()) {
                objF4 = new InterfaceC6824a() { // from class: Re.x
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return m.c.j(n11, aVar5);
                    }
                };
                interfaceC3540l.K(objF4);
            }
            interfaceC3540l.J();
            h.b(null, bVar2, (InterfaceC6824a) objF4, interfaceC3540l, 0, 1);
            d.b bVar3 = new d.b(AbstractC6780c.f53450a2);
            interfaceC3540l.U(-813207249);
            boolean zL3 = interfaceC3540l.l(this.f19810b) | interfaceC3540l.T(this.f19809a);
            final N n12 = this.f19810b;
            final Re.a aVar6 = this.f19809a;
            Object objF5 = interfaceC3540l.f();
            if (zL3 || objF5 == aVar3.a()) {
                objF5 = new InterfaceC6824a() { // from class: Re.y
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return m.c.k(n12, aVar6);
                    }
                };
                interfaceC3540l.K(objF5);
            }
            interfaceC3540l.J();
            h.b(null, bVar3, (InterfaceC6824a) objF5, interfaceC3540l, 0, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
            f((InterfaceC8675A) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final class d implements C8680c.m {
        d() {
        }

        @Override // z.C8680c.m
        public void b(Y0.d dVar, int i10, int[] sizes, int[] outPositions) {
            AbstractC6492s.i(dVar, "<this>");
            AbstractC6492s.i(sizes, "sizes");
            AbstractC6492s.i(outPositions, "outPositions");
            int length = sizes.length;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int i14 = sizes[i11];
                int i15 = i12 + 1;
                if (i12 == AbstractC3682n.e0(sizes)) {
                    outPositions[i12] = i10 - i14;
                } else {
                    outPositions[i12] = i13;
                    i13 += i14;
                }
                i11++;
                i12 = i15;
            }
        }
    }

    public static final void c(Re.a aVar, C7125a.c cVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        Re.a aVar2;
        int i12;
        final C7125a.c cVar2;
        String str;
        String str2;
        C7125a.c cVar3;
        final Re.a aVar3;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(692173285);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                aVar2 = aVar;
                int i13 = interfaceC3540lR.T(aVar2) ? 4 : 2;
                i12 = i13 | i10;
            } else {
                aVar2 = aVar;
            }
            i12 = i13 | i10;
        } else {
            aVar2 = aVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            cVar2 = cVar;
            i12 |= ((i11 & 2) == 0 && interfaceC3540lR.T(cVar2)) ? 32 : 16;
        } else {
            cVar2 = cVar;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            aVar3 = aVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            interfaceC3540lR.q();
            if ((i10 & 1) == 0 || interfaceC3540lR.H()) {
                if ((i11 & 1) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    S sA = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    str2 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
                    androidx.lifecycle.N nB = AbstractC4197c.b(Re.a.class, sA, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT, str2);
                    androidx.appcompat.app.c cVar4 = (androidx.appcompat.app.c) objT;
                    Object objT2 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    interfaceC3540lR.U(831146569);
                    boolean zL = interfaceC3540lR.l(nB) | interfaceC3540lR.l(cVar4) | interfaceC3540lR.l(interfaceC4017o);
                    Object objF = interfaceC3540lR.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C8663i(nB, interfaceC4017o, cVar4);
                        interfaceC3540lR.K(objF);
                    }
                    interfaceC3540lR.J();
                    O.c(objT2, (InterfaceC6835l) objF, interfaceC3540lR, 0);
                    interfaceC3540lR.J();
                    aVar2 = (Re.a) nB;
                    i14 &= -15;
                } else {
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    str2 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
                }
                int i15 = i14;
                Re.a aVar4 = aVar2;
                if ((i11 & 2) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    S sA2 = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA2 == null) {
                        throw new IllegalStateException(str);
                    }
                    androidx.lifecycle.N nB2 = AbstractC4197c.b(C7125a.c.class, sA2, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o2 = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT3 = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT3, str2);
                    androidx.appcompat.app.c cVar5 = (androidx.appcompat.app.c) objT3;
                    Object objT4 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    interfaceC3540lR.U(831146569);
                    boolean zL2 = interfaceC3540lR.l(nB2) | interfaceC3540lR.l(cVar5) | interfaceC3540lR.l(interfaceC4017o2);
                    Object objF2 = interfaceC3540lR.f();
                    if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new C8663i(nB2, interfaceC4017o2, cVar5);
                        interfaceC3540lR.K(objF2);
                    }
                    interfaceC3540lR.J();
                    O.c(objT4, (InterfaceC6835l) objF2, interfaceC3540lR, 0);
                    interfaceC3540lR.J();
                    cVar3 = (C7125a.c) nB2;
                    aVar3 = aVar4;
                    i14 = i15 & (-113);
                } else {
                    cVar3 = cVar2;
                    aVar3 = aVar4;
                    i14 = i15;
                }
            } else {
                interfaceC3540lR.C();
                if ((i11 & 1) != 0) {
                    i14 &= -15;
                }
                if ((i11 & 2) != 0) {
                    i14 &= -113;
                }
                aVar3 = aVar2;
                cVar3 = cVar2;
            }
            interfaceC3540lR.S();
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(692173285, i14, -1, "com.ui.wifiman.ui.settings.AppSettings (AppSettingsUi.kt:56)");
            }
            Object objF3 = interfaceC3540lR.f();
            if (objF3 == InterfaceC3540l.f21100a.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF3 = a10;
            }
            N nA = ((A) objF3).a();
            C7125a.c cVar6 = cVar3;
            interfaceC3540l2 = interfaceC3540lR;
            C0.a(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, b0.c.e(274515946, true, new a((InterfaceC8511f.b) interfaceC3540lR.t(AbstractC8460B.K()), nA, aVar3), interfaceC3540lR, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a(), 0L, b0.c.e(-1791485405, true, new b(aVar3, cVar3, nA), interfaceC3540lR, 54), interfaceC3540l2, 390, 12582912, 98298);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            cVar2 = cVar6;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Re.i
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return m.d(aVar3, cVar2, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(Re.a aVar, C7125a.c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(aVar, cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final androidx.compose.ui.e eVar, final Re.a aVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(111108160);
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
                AbstractC3546o.Q(111108160, i12, -1, "com.ui.wifiman.ui.settings.FooterRow (AppSettingsUi.kt:244)");
            }
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            N nA = ((A) objF).a();
            C8680c c8680c = C8680c.f66832a;
            AbstractC8696t.a(eVar, c8680c.n(Y0.h.j(8)), c8680c.n(Y0.h.j(4)), 0, 0, null, b0.c.e(393425381, true, new c(aVar, nA), interfaceC3540lR, 54), interfaceC3540lR, (i12 & 14) | 1573296, 56);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Re.j
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return m.f(eVar, aVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(androidx.compose.ui.e eVar, Re.a aVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, aVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8680c.m i(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(839433124);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(839433124, i10, -1, "com.ui.wifiman.ui.settings.verticalArrangementWithLatestOnBottom (AppSettingsUi.kt:289)");
        }
        d dVar = new d();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return dVar;
    }
}
