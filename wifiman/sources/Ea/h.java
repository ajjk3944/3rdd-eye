package ea;

import Eb.ResendVerificationEmailRequest;
import Eb.SsoUser;
import Ii.N;
import Li.P;
import Li.z;
import Q9.j;
import Yg.J;
import Yg.v;
import ca.d;
import com.ui.core.ui.sso.SSOAccountVM;
import com.ui.core.ui.sso.UiSSO;
import com.ui.core.ui.sso.a;
import dh.InterfaceC5380e;
import ea.h;
import eh.AbstractC5467b;
import ga.C5884a;
import gg.s;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.p;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class h extends ea.e {

    /* renamed from: j, reason: collision with root package name */
    public static final a f46305j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f46306k = 8;

    /* renamed from: e, reason: collision with root package name */
    private final SSOAccountVM f46307e;

    /* renamed from: f, reason: collision with root package name */
    private final ca.d f46308f;

    /* renamed from: g, reason: collision with root package name */
    private final z f46309g;

    /* renamed from: h, reason: collision with root package name */
    private final z f46310h;

    /* renamed from: i, reason: collision with root package name */
    private final z f46311i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f46312a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.R(1L, TimeUnit.SECONDS);
        }
    }

    static final class c implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f46313a = new c();

        c() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(SsoUser it) {
            AbstractC6492s.i(it, "it");
            return it.getIsVerified();
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UiSSO.a apply(SsoUser user) {
            AbstractC6492s.i(user, "user");
            return C5884a.f47755a.a(user, h.this.f46307e.r0().h(), null, true);
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f46315a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i errors) {
            AbstractC6492s.i(errors, "errors");
            return errors.R(3L, TimeUnit.SECONDS);
        }
    }

    static final class f implements kg.n {

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f46317a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f46318b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ UiSSO.a f46319c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, UiSSO.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f46318b = hVar;
                this.f46319c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f46318b, this.f46319c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f46317a;
                if (i10 == 0) {
                    v.b(obj);
                    h hVar = this.f46318b;
                    UiSSO.a aVar = this.f46319c;
                    AbstractC6492s.f(aVar);
                    this.f46317a = 1;
                    if (hVar.r0(aVar, this) == objG) {
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
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(UiSSO.a authResult) {
            AbstractC6492s.i(authResult, "authResult");
            return Qi.g.c(null, new a(h.this, authResult, null), 1, null);
        }
    }

    static final class g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final g f46320a = new g();

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "Failed to process email verify check stream";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            S9.a.e(new InterfaceC6824a() { // from class: ea.i
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return h.g.c();
                }
            }, it);
        }
    }

    /* renamed from: ea.h$h, reason: collision with other inner class name */
    static final class C1738h implements InterfaceC6469f {
        C1738h() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            h.this.g0().j(Boolean.TRUE);
        }
    }

    static final class i implements kg.n {
        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(d.a recaptcha) {
            AbstractC6492s.i(recaptcha, "recaptcha");
            return h.this.f46307e.r0().g().b((String) h.this.f0().getValue(), new ResendVerificationEmailRequest(recaptcha.b(), recaptcha.a()));
        }
    }

    static final class j implements InterfaceC6469f {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "Failed to process resend verification email stream";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            AbstractC6492s.i(error, "error");
            S9.a.e(new InterfaceC6824a() { // from class: ea.j
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return h.j.c();
                }
            }, error);
            h.this.g0().j(Boolean.FALSE);
        }
    }

    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f46324a = new k();

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer apply(Long it) {
            AbstractC6492s.i(it, "it");
            return Integer.valueOf((int) (30 - it.longValue()));
        }
    }

    static final class l implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final l f46325a = new l();

        l() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Integer it) {
            AbstractC6492s.i(it, "it");
            return it.intValue() == 0;
        }
    }

    static final class n implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final n f46327a = new n();

        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "Failed to process resend countdown stream";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            S9.a.e(new InterfaceC6824a() { // from class: ea.k
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return h.n.c();
                }
            }, it);
        }
    }

    public h(SSOAccountVM sessionVM, ca.d ssoRecaptchaUseCase) {
        AbstractC6492s.i(sessionVM, "sessionVM");
        AbstractC6492s.i(ssoRecaptchaUseCase, "ssoRecaptchaUseCase");
        this.f46307e = sessionVM;
        this.f46308f = ssoRecaptchaUseCase;
        String strV = sessionVM.r0().h().v();
        this.f46309g = P.a(strV == null ? "" : strV);
        this.f46310h = P.a(30);
        this.f46311i = P.a(Boolean.FALSE);
        u0();
        p0();
    }

    private final void p0() {
        InterfaceC6043c interfaceC6043cU = this.f46307e.r0().g().g().K(b.f46312a).m0(c.f46313a).o0().A(new d()).L(e.f46315a).t(new f()).U(new InterfaceC6464a() { // from class: ea.g
            @Override // kg.InterfaceC6464a
            public final void run() {
                h.q0();
            }
        }, g.f46320a);
        AbstractC6492s.h(interfaceC6043cU, "subscribe(...)");
        c0(interfaceC6043cU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r0(UiSSO.a aVar, InterfaceC5380e interfaceC5380e) {
        Object objG = this.f46307e.r0().c().G(aVar, interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    private final void s0() {
        this.f46307e.X().b(new j.a.b(a.C1314a.f41411a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(h hVar) {
        hVar.g0().j(Boolean.FALSE);
        hVar.u0();
    }

    private final void u0() {
        s sVarU0 = s.g0(0L, 1L, TimeUnit.SECONDS, Gg.a.d()).i0(k.f46324a).U0(l.f46325a);
        final z zVarH0 = h0();
        InterfaceC6043c interfaceC6043cJ0 = sVarU0.J0(new InterfaceC6469f() { // from class: ea.h.m
            public final void a(int i10) {
                zVarH0.j(Integer.valueOf(i10));
            }

            @Override // kg.InterfaceC6469f
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                a(((Number) obj).intValue());
            }
        }, n.f46327a);
        AbstractC6492s.h(interfaceC6043cJ0, "subscribe(...)");
        c0(interfaceC6043cJ0);
    }

    @Override // ea.e
    public void e0() {
        X().b(new j.a.c("editEmail", f0().getValue()));
    }

    @Override // ea.e
    public z f0() {
        return this.f46309g;
    }

    @Override // ea.e
    public z g0() {
        return this.f46311i;
    }

    @Override // ea.e
    public z h0() {
        return this.f46310h;
    }

    @Override // ea.e
    public void i0() {
        s0();
    }

    @Override // ea.e
    public void j0() {
        s0();
    }

    @Override // ea.e
    public void k0() {
        InterfaceC6043c interfaceC6043cU = this.f46308f.c().n(new C1738h()).t(new i()).U(new InterfaceC6464a() { // from class: ea.f
            @Override // kg.InterfaceC6464a
            public final void run() {
                h.t0(this.f46304a);
            }
        }, new j());
        AbstractC6492s.h(interfaceC6043cU, "subscribe(...)");
        c0(interfaceC6043cU);
    }
}
