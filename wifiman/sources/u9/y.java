package U9;

import E0.InterfaceC2629g;
import Eb.w;
import Ii.AbstractC3063k;
import Ii.N;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import N.AbstractC3333m0;
import N.C3319f0;
import N.C3335n0;
import N.EnumC3337o0;
import N.O0;
import N.P0;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.K;
import T.L;
import T.L0;
import T.O;
import T.X0;
import U9.AbstractC3619f;
import U9.C3621h;
import U9.y;
import Yg.J;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.compose.animation.d;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.AbstractActivityC3999j;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.P;
import com.ui.core.ui.sso.SSOAccountVM;
import com.ui.core.ui.sso.UiSSO;
import d.AbstractC5263a;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f2.AbstractC5498D;
import ka.C6419i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.transport.TLSTM;
import q2.InterfaceC7418f;
import r.C7532h0;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.f0;
import z.j0;
import z.k0;

/* loaded from: classes3.dex */
public abstract class y {

    public static final class a extends Q9.a {
        a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f22249a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3335n0 f22250b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f22250b = c3335n0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f22250b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f22249a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C3335n0 c3335n0 = this.f22250b;
                this.f22249a = 1;
                if (c3335n0.i(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final class c extends Q9.a {
        c() {
        }
    }

    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22251a;

        d(String str) {
            this.f22251a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J f(f2.u NavHost) {
            AbstractC6492s.i(NavHost, "$this$NavHost");
            InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: U9.A
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return y.d.h((androidx.compose.animation.d) obj);
                }
            };
            InterfaceC6835l interfaceC6835l2 = new InterfaceC6835l() { // from class: U9.B
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return y.d.i((androidx.compose.animation.d) obj);
                }
            };
            String strA = AbstractC3619f.c.f22193a.a();
            C3614a c3614a = C3614a.f22153a;
            g2.k.b(NavHost, strA, null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.a(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.b.f22191a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.h(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.C0820f.f22199a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.i(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.a.f22189a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.j(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.d.f22195a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.k(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.g.f22201a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.l(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.e.f22197a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.m(), 230, null);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.animation.i h(androidx.compose.animation.d dVar) {
            AbstractC6492s.i(dVar, "<this>");
            return androidx.compose.animation.d.c(dVar, d.a.f27532a.c(), null, null, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.animation.k i(androidx.compose.animation.d dVar) {
            AbstractC6492s.i(dVar, "<this>");
            return androidx.compose.animation.d.a(dVar, d.a.f27532a.d(), null, null, 6, null);
        }

        public final void e(f2.w navController, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(navController, "navController");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-974778468, i10, -1, "com.ui.core.ui.sso.mfa.MainContent.<anonymous>.<anonymous> (UiMFA.kt:191)");
            }
            String str = this.f22251a;
            interfaceC3540l.U(-1021239807);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: U9.z
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return y.d.f((f2.u) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            g2.m.b(navController, str, null, null, null, null, null, null, null, null, (InterfaceC6835l) objF, interfaceC3540l, i10 & 14, 6, 1020);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            e((f2.w) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class e implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f22252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3335n0 f22253b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22254c;

        e(Activity activity, C3335n0 c3335n0, String str) {
            this.f22252a = activity;
            this.f22253b = c3335n0;
            this.f22254c = str;
        }

        public final void a(InterfaceC8687j ModalBottomSheetLayout, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-147118168, i10, -1, "com.ui.core.ui.sso.mfa.ModalSheet.<anonymous>.<anonymous> (UiMFA.kt:298)");
            }
            y.n(this.f22252a, this.f22253b, this.f22254c, interfaceC3540l, C3335n0.f14622e << 3);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class f implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f22255a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22256b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f2.w f22257c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3335n0 f22258d;

        f(Activity activity, String str, f2.w wVar, C3335n0 c3335n0) {
            this.f22255a = activity;
            this.f22256b = str;
            this.f22257c = wVar;
            this.f22258d = c3335n0;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1005141519, i10, -1, "com.ui.core.ui.sso.mfa.ModalSheet.<anonymous>.<anonymous> (UiMFA.kt:305)");
            }
            y.y(this.f22255a, this.f22256b, this.f22257c, this.f22258d, interfaceC3540l, C3335n0.f14622e << 9);
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

    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f22259a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f22260b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3621h f22261c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3335n0 f22262d;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f22263a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f22264b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3335n0 f22265c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f22265c = c3335n0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f22265c, interfaceC5380e);
                aVar.f22264b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f22263a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    C3621h.a.InterfaceC0821a interfaceC0821a = (C3621h.a.InterfaceC0821a) this.f22264b;
                    if (interfaceC0821a instanceof C3621h.a.InterfaceC0821a.b) {
                        C3335n0 c3335n0 = this.f22265c;
                        this.f22263a = 1;
                        if (c3335n0.l(this) == objG) {
                            return objG;
                        }
                    } else {
                        if (!(interfaceC0821a instanceof C3621h.a.InterfaceC0821a.C0822a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C3335n0 c3335n02 = this.f22265c;
                        this.f22263a = 2;
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
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C3621h.a.InterfaceC0821a interfaceC0821a, InterfaceC5380e interfaceC5380e) {
                return ((a) create(interfaceC0821a, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        public static final class b implements InterfaceC3220g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3220g f22266a;

            public static final class a implements InterfaceC3221h {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3221h f22267a;

                /* renamed from: U9.y$g$b$a$a, reason: collision with other inner class name */
                public static final class C0823a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f22268a;

                    /* renamed from: b, reason: collision with root package name */
                    int f22269b;

                    public C0823a(InterfaceC5380e interfaceC5380e) {
                        super(interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f22268a = obj;
                        this.f22269b |= PduHandle.NONE;
                        return a.this.a(null, this);
                    }
                }

                public a(InterfaceC3221h interfaceC3221h) {
                    this.f22267a = interfaceC3221h;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Li.InterfaceC3221h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof U9.y.g.b.a.C0823a
                        if (r0 == 0) goto L13
                        r0 = r6
                        U9.y$g$b$a$a r0 = (U9.y.g.b.a.C0823a) r0
                        int r1 = r0.f22269b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f22269b = r1
                        goto L18
                    L13:
                        U9.y$g$b$a$a r0 = new U9.y$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f22268a
                        java.lang.Object r1 = eh.AbstractC5467b.g()
                        int r2 = r0.f22269b
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L29
                        Yg.v.b(r6)
                        goto L44
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L32:
                        Yg.v.b(r6)
                        Li.h r6 = r4.f22267a
                        boolean r2 = r5 instanceof U9.C3621h.a.InterfaceC0821a
                        if (r2 == 0) goto L44
                        r0.f22269b = r3
                        java.lang.Object r5 = r6.a(r5, r0)
                        if (r5 != r1) goto L44
                        return r1
                    L44:
                        Yg.J r5 = Yg.J.f24997a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: U9.y.g.b.a.a(java.lang.Object, dh.e):java.lang.Object");
                }
            }

            public b(InterfaceC3220g interfaceC3220g) {
                this.f22266a = interfaceC3220g;
            }

            @Override // Li.InterfaceC3220g
            public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
                Object objB = this.f22266a.b(new a(interfaceC3221h), interfaceC5380e);
                return objB == AbstractC5467b.g() ? objB : J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3621h c3621h, C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f22261c = c3621h;
            this.f22262d = c3335n0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            g gVar = new g(this.f22261c, this.f22262d, interfaceC5380e);
            gVar.f22260b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f22259a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            AbstractC3222i.D(AbstractC3222i.I(new b(this.f22261c.b()), new a(this.f22262d, null)), (N) this.f22260b);
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((g) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f22271a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3335n0 f22272b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f22272b = c3335n0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new h(this.f22272b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f22271a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C3335n0 c3335n0 = this.f22272b;
                this.f22271a = 1;
                if (c3335n0.i(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((h) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final class i extends Q9.a {
        i() {
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f22273a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3335n0 f22274b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f22274b = c3335n0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new j(this.f22274b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f22273a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C3335n0 c3335n0 = this.f22274b;
                this.f22273a = 1;
                if (c3335n0.i(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((j) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class k implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22275a;

        k(String str) {
            this.f22275a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J f(f2.u NavHost) {
            AbstractC6492s.i(NavHost, "$this$NavHost");
            InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: U9.D
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return y.k.h((androidx.compose.animation.d) obj);
                }
            };
            InterfaceC6835l interfaceC6835l2 = new InterfaceC6835l() { // from class: U9.E
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return y.k.i((androidx.compose.animation.d) obj);
                }
            };
            String strA = AbstractC3619f.c.f22193a.a();
            C3614a c3614a = C3614a.f22153a;
            g2.k.b(NavHost, strA, null, null, null, interfaceC6835l2, null, null, null, c3614a.n(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.b.f22191a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.o(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.C0820f.f22199a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.b(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.a.f22189a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.c(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.d.f22195a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.d(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.g.f22201a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.e(), 230, null);
            g2.k.b(NavHost, AbstractC3619f.e.f22197a.a(), null, null, interfaceC6835l, interfaceC6835l2, null, null, null, c3614a.f(), 230, null);
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.animation.i h(androidx.compose.animation.d dVar) {
            AbstractC6492s.i(dVar, "<this>");
            return androidx.compose.animation.d.c(dVar, d.a.f27532a.c(), null, null, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.animation.k i(androidx.compose.animation.d dVar) {
            AbstractC6492s.i(dVar, "<this>");
            return androidx.compose.animation.d.a(dVar, d.a.f27532a.d(), null, null, 6, null);
        }

        public final void e(f2.w navController, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(navController, "navController");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1305494694, i10, -1, "com.ui.core.ui.sso.mfa.ModalSheetContent.<anonymous> (UiMFA.kt:359)");
            }
            androidx.compose.ui.e eVarA = j0.a(j0.b(androidx.compose.ui.e.f28771b0));
            String str = this.f22275a;
            interfaceC3540l.U(28051677);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: U9.C
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return y.k.f((f2.u) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            g2.m.b(navController, str, eVarA, null, null, null, null, null, null, null, (InterfaceC6835l) objF, interfaceC3540l, i10 & 14, 6, 1016);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            e((f2.w) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f22276a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3619f f22277b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SSOAccountVM f22278c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3621h f22279d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f22280e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC3619f f22281f;

        public static final class a extends Q9.a {
            a() {
            }
        }

        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SSOAccountVM f22282a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3621h f22283b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC3619f f22284c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f22285d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Fragment f22286e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC3619f f22287f;

            static final class a implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SSOAccountVM f22288a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3621h f22289b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ f2.w f22290c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ AbstractC3619f f22291d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC6835l f22292e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Fragment f22293f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ AbstractC3619f f22294g;

                /* renamed from: U9.y$l$b$a$a, reason: collision with other inner class name */
                static final class C0824a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f22295a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SSOAccountVM f22296b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0824a(SSOAccountVM sSOAccountVM, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f22296b = sSOAccountVM;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new C0824a(this.f22296b, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        AbstractC5467b.g();
                        if (this.f22295a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                        this.f22296b.s0();
                        return J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C0824a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                    }
                }

                /* renamed from: U9.y$l$b$a$b, reason: collision with other inner class name */
                static final class C0825b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f22297a;

                    /* renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f22298b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C3621h f22299c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ f2.w f22300d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ AbstractC3619f f22301e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ C3335n0 f22302f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ InterfaceC6835l f22303g;

                    /* renamed from: U9.y$l$b$a$b$a, reason: collision with other inner class name */
                    static final class C0826a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                        /* renamed from: a, reason: collision with root package name */
                        int f22304a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f22305b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ f2.w f22306c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ AbstractC3619f f22307d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ C3335n0 f22308e;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ InterfaceC6835l f22309f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0826a(f2.w wVar, AbstractC3619f abstractC3619f, C3335n0 c3335n0, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
                            super(2, interfaceC5380e);
                            this.f22306c = wVar;
                            this.f22307d = abstractC3619f;
                            this.f22308e = c3335n0;
                            this.f22309f = interfaceC6835l;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                            C0826a c0826a = new C0826a(this.f22306c, this.f22307d, this.f22308e, this.f22309f, interfaceC5380e);
                            c0826a.f22305b = obj;
                            return c0826a;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object objG = AbstractC5467b.g();
                            int i10 = this.f22304a;
                            if (i10 == 0) {
                                Yg.v.b(obj);
                                C3621h.a aVar = (C3621h.a) this.f22305b;
                                if (aVar instanceof U9.j) {
                                    f2.n.d0(this.f22306c, this.f22307d.a(), false, false, 4, null);
                                    C3335n0 c3335n0 = this.f22308e;
                                    this.f22304a = 1;
                                    if (c3335n0.l(this) == objG) {
                                        return objG;
                                    }
                                } else if (aVar instanceof C3622i) {
                                    C3335n0 c3335n02 = this.f22308e;
                                    this.f22304a = 2;
                                    if (c3335n02.i(this) == objG) {
                                        return objG;
                                    }
                                } else if (!(aVar instanceof C3621h.a.InterfaceC0821a)) {
                                    if (!(aVar instanceof U9.k)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    this.f22309f.invoke(((U9.k) aVar).a());
                                }
                            } else {
                                if (i10 != 1 && i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Yg.v.b(obj);
                            }
                            return J.f24997a;
                        }

                        @Override // mh.InterfaceC6839p
                        /* renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(C3621h.a aVar, InterfaceC5380e interfaceC5380e) {
                            return ((C0826a) create(aVar, interfaceC5380e)).invokeSuspend(J.f24997a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0825b(C3621h c3621h, f2.w wVar, AbstractC3619f abstractC3619f, C3335n0 c3335n0, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f22299c = c3621h;
                        this.f22300d = wVar;
                        this.f22301e = abstractC3619f;
                        this.f22302f = c3335n0;
                        this.f22303g = interfaceC6835l;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        C0825b c0825b = new C0825b(this.f22299c, this.f22300d, this.f22301e, this.f22302f, this.f22303g, interfaceC5380e);
                        c0825b.f22298b = obj;
                        return c0825b;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        AbstractC5467b.g();
                        if (this.f22297a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                        AbstractC3222i.D(AbstractC3222i.I(this.f22299c.b(), new C0826a(this.f22300d, this.f22301e, this.f22302f, this.f22303g, null)), (N) this.f22298b);
                        return J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C0825b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                    }
                }

                static final class c implements mh.q {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Fragment f22310a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AbstractC3619f f22311b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ f2.w f22312c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C3335n0 f22313d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ C3621h f22314e;

                    c(Fragment fragment, AbstractC3619f abstractC3619f, f2.w wVar, C3335n0 c3335n0, C3621h c3621h) {
                        this.f22310a = fragment;
                        this.f22311b = abstractC3619f;
                        this.f22312c = wVar;
                        this.f22313d = c3335n0;
                        this.f22314e = c3621h;
                    }

                    public final void a(InterfaceC8687j ModalBottomSheetLayout, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                        if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                            interfaceC3540l.C();
                            return;
                        }
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-194296006, i10, -1, "com.ui.core.ui.sso.mfa.UiMFA.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiMFA.kt:154)");
                        }
                        AbstractActivityC3999j abstractActivityC3999jO1 = this.f22310a.o1();
                        AbstractC6492s.h(abstractActivityC3999jO1, "requireActivity(...)");
                        y.u(abstractActivityC3999jO1, this.f22311b.a(), this.f22312c, this.f22313d, this.f22314e, interfaceC3540l, C3335n0.f14622e << 9);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                    }

                    @Override // mh.q
                    public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                        a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                        return J.f24997a;
                    }
                }

                static final class d implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Fragment f22315a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AbstractC3619f f22316b;

                    d(Fragment fragment, AbstractC3619f abstractC3619f) {
                        this.f22315a = fragment;
                        this.f22316b = abstractC3619f;
                    }

                    public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                        if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                            interfaceC3540l.C();
                            return;
                        }
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(972985633, i10, -1, "com.ui.core.ui.sso.mfa.UiMFA.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiMFA.kt:163)");
                        }
                        AbstractActivityC3999j abstractActivityC3999jO1 = this.f22315a.o1();
                        AbstractC6492s.h(abstractActivityC3999jO1, "requireActivity(...)");
                        y.r(abstractActivityC3999jO1, this.f22316b.a(), interfaceC3540l, 0);
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

                static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f22317a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C3335n0 f22318b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    e(C3335n0 c3335n0, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f22318b = c3335n0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new e(this.f22318b, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objG = AbstractC5467b.g();
                        int i10 = this.f22317a;
                        if (i10 == 0) {
                            Yg.v.b(obj);
                            C3335n0 c3335n0 = this.f22318b;
                            this.f22317a = 1;
                            if (c3335n0.i(this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Yg.v.b(obj);
                        }
                        return J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                        return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                    }
                }

                public static final class f implements K {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SSOAccountVM f22319a;

                    public f(SSOAccountVM sSOAccountVM) {
                        this.f22319a = sSOAccountVM;
                    }

                    @Override // T.K
                    public void dispose() {
                        this.f22319a.s0();
                    }
                }

                a(SSOAccountVM sSOAccountVM, C3621h c3621h, f2.w wVar, AbstractC3619f abstractC3619f, InterfaceC6835l interfaceC6835l, Fragment fragment, AbstractC3619f abstractC3619f2) {
                    this.f22288a = sSOAccountVM;
                    this.f22289b = c3621h;
                    this.f22290c = wVar;
                    this.f22291d = abstractC3619f;
                    this.f22292e = interfaceC6835l;
                    this.f22293f = fragment;
                    this.f22294g = abstractC3619f2;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean f(EnumC3337o0 it) {
                    AbstractC6492s.i(it, "it");
                    return true;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final K h(SSOAccountVM sSOAccountVM, L DisposableEffect) {
                    AbstractC6492s.i(DisposableEffect, "$this$DisposableEffect");
                    return new f(sSOAccountVM);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J i(N n10, C3335n0 c3335n0) {
                    AbstractC3063k.d(n10, null, null, new e(c3335n0, null), 3, null);
                    return J.f24997a;
                }

                public final void e(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-805628376, i10, -1, "com.ui.core.ui.sso.mfa.UiMFA.<anonymous>.<anonymous>.<anonymous> (UiMFA.kt:100)");
                    }
                    Object objF = interfaceC3540l.f();
                    InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
                    if (objF == aVar.a()) {
                        Object a10 = new T.A(O.i(C5385j.f46088a, interfaceC3540l));
                        interfaceC3540l.K(a10);
                        objF = a10;
                    }
                    final N nA = ((T.A) objF).a();
                    f2.w wVarD = g2.l.d(new AbstractC5498D[0], interfaceC3540l, 0);
                    EnumC3337o0 enumC3337o0 = EnumC3337o0.Hidden;
                    C7532h0 c7532h0A = P0.f13906a.a();
                    interfaceC3540l.U(1557943644);
                    Object objF2 = interfaceC3540l.f();
                    if (objF2 == aVar.a()) {
                        objF2 = new InterfaceC6835l() { // from class: U9.G
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(y.l.b.a.f((EnumC3337o0) obj));
                            }
                        };
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    final C3335n0 c3335n0J = AbstractC3333m0.j(enumC3337o0, c7532h0A, (InterfaceC6835l) objF2, true, interfaceC3540l, 3462, 0);
                    interfaceC3540l.U(1557946059);
                    boolean zL = interfaceC3540l.l(this.f22288a);
                    SSOAccountVM sSOAccountVM = this.f22288a;
                    Object objF3 = interfaceC3540l.f();
                    if (zL || objF3 == aVar.a()) {
                        objF3 = new C0824a(sSOAccountVM, null);
                        interfaceC3540l.K(objF3);
                    }
                    interfaceC3540l.J();
                    O.f("mfa", (InterfaceC6839p) objF3, interfaceC3540l, 6);
                    interfaceC3540l.U(1557950468);
                    boolean zL2 = interfaceC3540l.l(this.f22288a);
                    final SSOAccountVM sSOAccountVM2 = this.f22288a;
                    Object objF4 = interfaceC3540l.f();
                    if (zL2 || objF4 == aVar.a()) {
                        objF4 = new InterfaceC6835l() { // from class: U9.H
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return y.l.b.a.h(sSOAccountVM2, (L) obj);
                            }
                        };
                        interfaceC3540l.K(objF4);
                    }
                    interfaceC3540l.J();
                    O.c("mfa", (InterfaceC6835l) objF4, interfaceC3540l, 6);
                    C3621h c3621h = this.f22289b;
                    interfaceC3540l.U(1557957576);
                    boolean zL3 = interfaceC3540l.l(this.f22289b) | interfaceC3540l.l(this.f22290c) | interfaceC3540l.T(this.f22291d) | interfaceC3540l.l(c3335n0J) | interfaceC3540l.T(this.f22292e);
                    C3621h c3621h2 = this.f22289b;
                    f2.w wVar = this.f22290c;
                    AbstractC3619f abstractC3619f = this.f22291d;
                    InterfaceC6835l interfaceC6835l = this.f22292e;
                    Object objF5 = interfaceC3540l.f();
                    if (zL3 || objF5 == aVar.a()) {
                        objF5 = new C0825b(c3621h2, wVar, abstractC3619f, c3335n0J, interfaceC6835l, null);
                        interfaceC3540l.K(objF5);
                    }
                    interfaceC3540l.J();
                    O.f(c3621h, (InterfaceC6839p) objF5, interfaceC3540l, 0);
                    float f10 = 16;
                    float f11 = 0;
                    AbstractC3333m0.b(b0.c.e(-194296006, true, new c(this.f22293f, this.f22294g, wVarD, c3335n0J, this.f22289b), interfaceC3540l, 54), null, c3335n0J, false, E.h.e(Y0.h.j(f10), Y0.h.j(f10), Y0.h.j(f11), Y0.h.j(f11)), 0.0f, C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).e().a(), 0L, 0L, b0.c.e(972985633, true, new d(this.f22293f, this.f22291d), interfaceC3540l, 54), interfaceC3540l, (C3335n0.f14622e << 6) | 805306374, 426);
                    boolean zK = c3335n0J.k();
                    interfaceC3540l.U(1558026905);
                    boolean zL4 = interfaceC3540l.l(nA) | interfaceC3540l.l(c3335n0J);
                    Object objF6 = interfaceC3540l.f();
                    if (zL4 || objF6 == aVar.a()) {
                        objF6 = new InterfaceC6824a() { // from class: U9.I
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return y.l.b.a.i(nA, c3335n0J);
                            }
                        };
                        interfaceC3540l.K(objF6);
                    }
                    interfaceC3540l.J();
                    AbstractC5263a.a(zK, (InterfaceC6824a) objF6, interfaceC3540l, 0, 0);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    e((InterfaceC3540l) obj, ((Number) obj2).intValue());
                    return J.f24997a;
                }
            }

            b(SSOAccountVM sSOAccountVM, C3621h c3621h, AbstractC3619f abstractC3619f, InterfaceC6835l interfaceC6835l, Fragment fragment, AbstractC3619f abstractC3619f2) {
                this.f22282a = sSOAccountVM;
                this.f22283b = c3621h;
                this.f22284c = abstractC3619f;
                this.f22285d = interfaceC6835l;
                this.f22286e = fragment;
                this.f22287f = abstractC3619f2;
            }

            public final void a(f2.w navController, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(navController, "navController");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1076690924, i10, -1, "com.ui.core.ui.sso.mfa.UiMFA.<anonymous>.<anonymous> (UiMFA.kt:96)");
                }
                O0.a(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, C3319f0.f14419a.a(interfaceC3540l, C3319f0.f14420b).c(), 0L, null, 0.0f, b0.c.e(-805628376, true, new a(this.f22282a, this.f22283b, navController, this.f22284c, this.f22285d, this.f22286e, this.f22287f), interfaceC3540l, 54), interfaceC3540l, 1572870, 58);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((f2.w) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        l(Fragment fragment, AbstractC3619f abstractC3619f, SSOAccountVM sSOAccountVM, C3621h c3621h, InterfaceC6835l interfaceC6835l, AbstractC3619f abstractC3619f2) {
            this.f22276a = fragment;
            this.f22277b = abstractC3619f;
            this.f22278c = sSOAccountVM;
            this.f22279d = c3621h;
            this.f22280e = interfaceC6835l;
            this.f22281f = abstractC3619f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q9.j c() {
            return new a();
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1422574305, i10, -1, "com.ui.core.ui.sso.mfa.UiMFA.<anonymous> (UiMFA.kt:90)");
            }
            AbstractActivityC3999j abstractActivityC3999jO1 = this.f22276a.o1();
            AbstractC6492s.h(abstractActivityC3999jO1, "requireActivity(...)");
            f2.w wVarD = g2.l.d(new AbstractC5498D[0], interfaceC3540l, 0);
            String strA = this.f22277b.a();
            interfaceC3540l.U(-1594669994);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: U9.F
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return y.l.c();
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            Q9.h.g(abstractActivityC3999jO1, (InterfaceC6824a) objF, strA, null, wVarD, b0.c.e(1076690924, true, new b(this.f22278c, this.f22279d, this.f22277b, this.f22280e, this.f22276a, this.f22281f), interfaceC3540l, 54), interfaceC3540l, 196656, 8);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final J A(N n10, C3335n0 c3335n0) {
        AbstractC3063k.d(n10, null, null, new j(c3335n0, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J B(Activity activity, String str, f2.w wVar, C3335n0 c3335n0, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        y(activity, str, wVar, c3335n0, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void C(final Fragment fragment, final SSOAccountVM sessionVM, final C3621h mfaController, final InterfaceC6824a onCreateAccountClicked, final InterfaceC6835l onStartTrustedDeviceFlow, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        C3615b c3615bA;
        Eb.w wVarB;
        AbstractC3619f abstractC3619f;
        AbstractC6492s.i(fragment, "<this>");
        AbstractC6492s.i(sessionVM, "sessionVM");
        AbstractC6492s.i(mfaController, "mfaController");
        AbstractC6492s.i(onCreateAccountClicked, "onCreateAccountClicked");
        AbstractC6492s.i(onStartTrustedDeviceFlow, "onStartTrustedDeviceFlow");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(152747215);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(fragment) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(sessionVM) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(mfaController) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.l(onCreateAccountClicked) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.l(onStartTrustedDeviceFlow) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(152747215, i12, -1, "com.ui.core.ui.sso.mfa.UiMFA (UiMFA.kt:63)");
            }
            UiSSO.d dVarD = sessionVM.r0().d();
            if (dVarD == null || (c3615bA = dVarD.a()) == null || (wVarB = c3615bA.b()) == null) {
                throw new IllegalStateException("MFA screen requires set MFA methods as params");
            }
            if (wVarB instanceof w.Backup) {
                abstractC3619f = AbstractC3619f.e.f22197a;
            } else if (wVarB instanceof w.Email) {
                abstractC3619f = AbstractC3619f.b.f22191a;
            } else if (wVarB instanceof w.Push) {
                abstractC3619f = AbstractC3619f.d.f22195a;
            } else if (wVarB instanceof w.Sms) {
                abstractC3619f = AbstractC3619f.C0820f.f22199a;
            } else {
                if (!(wVarB instanceof w.Totp)) {
                    if (!(wVarB instanceof w.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Unknown method unsupported as Primary Auth method");
                }
                abstractC3619f = AbstractC3619f.a.f22189a;
            }
            AbstractC3619f abstractC3619f2 = abstractC3619f;
            AbstractC3619f.c cVar = AbstractC3619f.c.f22193a;
            interfaceC3540lR.U(1134962144);
            boolean zL = interfaceC3540lR.l(sessionVM) | interfaceC3540lR.l(mfaController) | interfaceC3540lR.l(fragment) | ((i12 & 7168) == 2048);
            Object objF = interfaceC3540lR.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: U9.u
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return y.D(sessionVM, mfaController, fragment, onCreateAccountClicked, (InterfaceC7418f) obj, (Bundle) obj2);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            R9.i.c(fragment, (InterfaceC6839p) objF, b0.c.e(1422574305, true, new l(fragment, abstractC3619f2, sessionVM, mfaController, onStartTrustedDeviceFlow, cVar), interfaceC3540lR, 54), interfaceC3540lR, (i12 & 14) | 384);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: U9.v
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return y.E(fragment, sessionVM, mfaController, onCreateAccountClicked, onStartTrustedDeviceFlow, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P.c D(SSOAccountVM sSOAccountVM, C3621h c3621h, Fragment fragment, InterfaceC6824a interfaceC6824a, InterfaceC7418f owner, Bundle arguments) {
        AbstractC6492s.i(owner, "owner");
        AbstractC6492s.i(arguments, "arguments");
        com.ui.core.ui.sso.c cVarR0 = sSOAccountVM.r0();
        Context contextP1 = fragment.p1();
        AbstractC6492s.h(contextP1, "requireContext(...)");
        C6419i c6419i = new C6419i(contextP1);
        Context contextP12 = fragment.p1();
        AbstractC6492s.h(contextP12, "requireContext(...)");
        return new C3620g(cVarR0, c3621h, c6419i, new ha.c(contextP12), interfaceC6824a, owner, arguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J E(Fragment fragment, SSOAccountVM sSOAccountVM, C3621h c3621h, InterfaceC6824a interfaceC6824a, InterfaceC6835l interfaceC6835l, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        C(fragment, sSOAccountVM, c3621h, interfaceC6824a, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void n(final Activity activity, final C3335n0 bsSheetState, final String startDestination, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(activity, "activity");
        AbstractC6492s.i(bsSheetState, "bsSheetState");
        AbstractC6492s.i(startDestination, "startDestination");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-532422319);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(activity) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? interfaceC3540lR.T(bsSheetState) : interfaceC3540lR.l(bsSheetState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(startDestination) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-532422319, i11, -1, "com.ui.core.ui.sso.mfa.LostAccessSheetContent (UiMFA.kt:458)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                T.A a10 = new T.A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            final N nA = ((T.A) objF).a();
            interfaceC3540lR.U(1677887327);
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new InterfaceC6824a() { // from class: U9.r
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return y.o();
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF2;
            interfaceC3540lR.J();
            interfaceC3540lR.U(1677889280);
            boolean zL = ((i11 & 112) == 32 || ((i11 & 64) != 0 && interfaceC3540lR.l(bsSheetState))) | interfaceC3540lR.l(nA);
            Object objF3 = interfaceC3540lR.f();
            if (zL || objF3 == aVar.a()) {
                objF3 = new InterfaceC6824a() { // from class: U9.s
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return y.p(nA, bsSheetState);
                    }
                };
                interfaceC3540lR.K(objF3);
            }
            interfaceC3540lR.J();
            Q9.h.g(activity, interfaceC6824a, startDestination, (InterfaceC6824a) objF3, null, C3614a.f22153a.g(), interfaceC3540lR, (i11 & 14) | 196656 | (i11 & 896), 16);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: U9.t
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return y.q(activity, bsSheetState, startDestination, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q9.j o() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(N n10, C3335n0 c3335n0) {
        AbstractC3063k.d(n10, null, null, new b(c3335n0, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J q(Activity activity, C3335n0 c3335n0, String str, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        n(activity, c3335n0, str, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void r(final Activity activity, final String startDestination, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(activity, "activity");
        AbstractC6492s.i(startDestination, "startDestination");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1685690415);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(activity) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(startDestination) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1685690415, i11, -1, "com.ui.core.ui.sso.mfa.MainContent (UiMFA.kt:179)");
            }
            androidx.compose.ui.e eVarA = j0.a(j0.d(androidx.compose.ui.e.f28771b0));
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540lR, 0);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarA);
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            f2.w wVarD = g2.l.d(new AbstractC5498D[0], interfaceC3540lR, 0);
            interfaceC3540lR.U(1625541474);
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: U9.n
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return y.s();
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            Q9.h.g(activity, (InterfaceC6824a) objF, startDestination, null, wVarD, b0.c.e(-974778468, true, new d(startDestination), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 196656 | ((i11 << 3) & 896), 8);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: U9.o
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return y.t(activity, startDestination, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q9.j s() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J t(Activity activity, String str, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        r(activity, str, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void u(final Activity activity, final String startDestination, final f2.w bottomSheetNavController, final C3335n0 bottomSheetState, final C3621h mfaController, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(activity, "activity");
        AbstractC6492s.i(startDestination, "startDestination");
        AbstractC6492s.i(bottomSheetNavController, "bottomSheetNavController");
        AbstractC6492s.i(bottomSheetState, "bottomSheetState");
        AbstractC6492s.i(mfaController, "mfaController");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1039164324);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(activity) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(startDestination) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(bottomSheetNavController) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? interfaceC3540lR.T(bottomSheetState) : interfaceC3540lR.l(bottomSheetState) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.l(mfaController) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1039164324, i12, -1, "com.ui.core.ui.sso.mfa.ModalSheet (UiMFA.kt:280)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                T.A a10 = new T.A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            final N nA = ((T.A) objF).a();
            EnumC3337o0 enumC3337o0 = EnumC3337o0.Hidden;
            C7532h0 c7532h0A = P0.f13906a.a();
            interfaceC3540lR.U(-889094473);
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new InterfaceC6835l() { // from class: U9.w
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(y.x((EnumC3337o0) obj));
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            final C3335n0 c3335n0J = AbstractC3333m0.j(enumC3337o0, c7532h0A, (InterfaceC6835l) objF2, true, interfaceC3540lR, 3462, 0);
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            interfaceC3540lR.U(-889087864);
            float fC = k0.b(f0.f66872a, interfaceC3540lR, 6).c(r8) / ((Y0.d) interfaceC3540lR.t(AbstractC3932k0.g())).d1(Y0.h.j(((Configuration) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.f())).screenHeightDp));
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.c(aVar2, 1.0f - fC), 0.0f, 1, null);
            C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarH);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
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
            E1.c(interfaceC3540lA, cH, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            AbstractC3333m0.b(b0.c.e(-147118168, true, new e(activity, c3335n0J, startDestination), interfaceC3540lR, 54), null, c3335n0J, false, null, 0.0f, C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a(), 0L, 0L, b0.c.e(1005141519, true, new f(activity, startDestination, bottomSheetNavController, bottomSheetState), interfaceC3540lR, 54), interfaceC3540lR, (C3335n0.f14622e << 6) | 805306374, 442);
            interfaceC3540lR.R();
            interfaceC3540l2 = interfaceC3540lR;
            interfaceC3540l2.U(-889057551);
            boolean zL = interfaceC3540l2.l(mfaController) | interfaceC3540l2.l(c3335n0J);
            Object objF3 = interfaceC3540l2.f();
            if (zL || objF3 == aVar.a()) {
                objF3 = new g(mfaController, c3335n0J, null);
                interfaceC3540l2.K(objF3);
            }
            interfaceC3540l2.J();
            O.f(bottomSheetNavController, (InterfaceC6839p) objF3, interfaceC3540l2, (i12 >> 6) & 14);
            boolean zK = c3335n0J.k();
            interfaceC3540l2.U(-889038616);
            boolean zL2 = interfaceC3540l2.l(nA) | interfaceC3540l2.l(c3335n0J);
            Object objF4 = interfaceC3540l2.f();
            if (zL2 || objF4 == aVar.a()) {
                objF4 = new InterfaceC6824a() { // from class: U9.x
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return y.v(nA, c3335n0J);
                    }
                };
                interfaceC3540l2.K(objF4);
            }
            interfaceC3540l2.J();
            AbstractC5263a.a(zK, (InterfaceC6824a) objF4, interfaceC3540l2, 0, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: U9.m
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return y.w(activity, startDestination, bottomSheetNavController, bottomSheetState, mfaController, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J v(N n10, C3335n0 c3335n0) {
        AbstractC3063k.d(n10, null, null, new h(c3335n0, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J w(Activity activity, String str, f2.w wVar, C3335n0 c3335n0, C3621h c3621h, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        u(activity, str, wVar, c3335n0, c3621h, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(EnumC3337o0 it) {
        AbstractC6492s.i(it, "it");
        return true;
    }

    public static final void y(final Activity activity, final String startDestination, final f2.w bsSheetController, final C3335n0 bsSheetState, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(activity, "activity");
        AbstractC6492s.i(startDestination, "startDestination");
        AbstractC6492s.i(bsSheetController, "bsSheetController");
        AbstractC6492s.i(bsSheetState, "bsSheetState");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-728349807);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(activity) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(startDestination) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(bsSheetController) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? interfaceC3540lR.T(bsSheetState) : interfaceC3540lR.l(bsSheetState) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-728349807, i11, -1, "com.ui.core.ui.sso.mfa.ModalSheetContent (UiMFA.kt:346)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                T.A a10 = new T.A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            final N nA = ((T.A) objF).a();
            interfaceC3540lR.U(-2104459094);
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new InterfaceC6824a() { // from class: U9.l
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return y.z();
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF2;
            interfaceC3540lR.J();
            interfaceC3540lR.U(-2104463093);
            boolean zL = ((i11 & 7168) == 2048 || ((i11 & 4096) != 0 && interfaceC3540lR.l(bsSheetState))) | interfaceC3540lR.l(nA);
            Object objF3 = interfaceC3540lR.f();
            if (zL || objF3 == aVar.a()) {
                objF3 = new InterfaceC6824a() { // from class: U9.p
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return y.A(nA, bsSheetState);
                    }
                };
                interfaceC3540lR.K(objF3);
            }
            interfaceC3540lR.J();
            Q9.h.g(activity, interfaceC6824a, startDestination, (InterfaceC6824a) objF3, bsSheetController, b0.c.e(1305494694, true, new k(startDestination), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 196656 | ((i11 << 3) & 896) | ((i11 << 6) & 57344), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: U9.q
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return y.B(activity, startDestination, bsSheetController, bsSheetState, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q9.j z() {
        return new i();
    }
}
