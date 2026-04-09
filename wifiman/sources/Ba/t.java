package ba;

import Eb.ForgotPasswordRequest;
import Li.F;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.P;
import Li.y;
import Li.z;
import Q9.j;
import Yg.J;
import android.util.Patterns;
import ba.l;
import ba.t;
import ca.d;
import com.ui.core.ui.sso.SSOAccountVM;
import com.ui.unifi.core.sso.exceptions.UserNotFoundException;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.AbstractC5912b;
import gg.D;
import hg.InterfaceC6043c;
import ja.AbstractC6262b;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;
import s9.d;

/* loaded from: classes3.dex */
public final class t extends l {

    /* renamed from: e, reason: collision with root package name */
    private final SSOAccountVM f33056e;

    /* renamed from: f, reason: collision with root package name */
    private final ca.d f33057f;

    /* renamed from: g, reason: collision with root package name */
    private final z f33058g;

    /* renamed from: h, reason: collision with root package name */
    private final z f33059h;

    /* renamed from: i, reason: collision with root package name */
    private final H.l f33060i;

    /* renamed from: j, reason: collision with root package name */
    private final z f33061j;

    /* renamed from: k, reason: collision with root package name */
    private final z f33062k;

    /* renamed from: l, reason: collision with root package name */
    private final Pattern f33063l;

    /* renamed from: m, reason: collision with root package name */
    private final z f33064m;

    /* renamed from: n, reason: collision with root package name */
    private final z f33065n;

    /* renamed from: o, reason: collision with root package name */
    private final z f33066o;

    /* renamed from: p, reason: collision with root package name */
    private final z f33067p;

    /* renamed from: q, reason: collision with root package name */
    private final z f33068q;

    /* renamed from: r, reason: collision with root package name */
    private final z f33069r;

    /* renamed from: s, reason: collision with root package name */
    private final z f33070s;

    /* renamed from: t, reason: collision with root package name */
    private final y f33071t;

    /* renamed from: u, reason: collision with root package name */
    private final Fg.c f33072u;

    private static abstract class a {

        /* renamed from: ba.t$a$a, reason: collision with other inner class name */
        public static final class C1149a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1149a f33073a = new C1149a();

            private C1149a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f33074a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String email) {
                super(null);
                AbstractC6492s.i(email, "email");
                this.f33074a = email;
            }

            public final String a() {
                return this.f33074a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f33074a, ((b) obj).f33074a);
            }

            public int hashCode() {
                return this.f33074a.hashCode();
            }

            public String toString() {
                return "Send(email=" + this.f33074a + ")";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f33075a = new c();

            private c() {
                super(null);
            }
        }

        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f33076a = new d();

            private d() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements kg.n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(a aVar) {
            if (AbstractC6492s.d(aVar, a.C1149a.f33073a)) {
                return t.this.N0();
            }
            if (aVar instanceof a.b) {
                return t.this.T0(((a.b) aVar).a());
            }
            if (AbstractC6492s.d(aVar, a.c.f33075a)) {
                return t.this.P0();
            }
            if (AbstractC6492s.d(aVar, a.d.f33076a)) {
                return t.this.R0();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class c implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33079b;

        c(String str) {
            this.f33079b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(d.a recaptcha) {
            AbstractC6492s.i(recaptcha, "recaptcha");
            return t.this.f33056e.r0().g().f(this.f33079b, new ForgotPasswordRequest(recaptcha.b(), recaptcha.a()));
        }
    }

    static final class d implements InterfaceC6469f {
        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            t.this.n0().j(new d.b(P9.b.f18387F0));
            z zVarM0 = t.this.m0();
            Boolean bool = Boolean.FALSE;
            zVarM0.j(bool);
            t.this.i0().j(bool);
        }
    }

    static final class e implements InterfaceC6469f {
        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            t.this.f33072u.h(a.C1149a.f33073a);
            t.this.j0().j(it instanceof UserNotFoundException ? new d.b(P9.b.f18413S0) : new d.b(P9.b.f18411R0));
        }
    }

    public static final class f implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f33082a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f33083b;

        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f33084a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f33085b;

            /* renamed from: ba.t$f$a$a, reason: collision with other inner class name */
            public static final class C1150a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f33086a;

                /* renamed from: b, reason: collision with root package name */
                int f33087b;

                public C1150a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f33086a = obj;
                    this.f33087b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h, t tVar) {
                this.f33084a = interfaceC3221h;
                this.f33085b = tVar;
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
                    boolean r0 = r6 instanceof ba.t.f.a.C1150a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ba.t$f$a$a r0 = (ba.t.f.a.C1150a) r0
                    int r1 = r0.f33087b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33087b = r1
                    goto L18
                L13:
                    ba.t$f$a$a r0 = new ba.t$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f33086a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f33087b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L54
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f33084a
                    java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                    ba.t r2 = r4.f33085b
                    java.util.regex.Pattern r2 = ba.t.D0(r2)
                    java.util.regex.Matcher r5 = r2.matcher(r5)
                    boolean r5 = r5.matches()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f33087b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L54
                    return r1
                L54:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ba.t.f.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public f(InterfaceC3220g interfaceC3220g, t tVar) {
            this.f33082a = interfaceC3220g;
            this.f33083b = tVar;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f33082a.b(new a(interfaceC3221h, this.f33083b), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : J.f24997a;
        }
    }

    static final class g implements InterfaceC6469f {
        g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Boolean it) {
            AbstractC6492s.i(it, "it");
            t.this.m0().j(it);
        }
    }

    static final class h implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final h f33090a = new h();

        h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "Failed to process email valid stream";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            S9.a.e(new InterfaceC6824a() { // from class: ba.u
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return t.h.c();
                }
            }, it);
        }
    }

    public t(SSOAccountVM sessionVM, ca.d ssoRecaptchaUseCase) {
        AbstractC6492s.i(sessionVM, "sessionVM");
        AbstractC6492s.i(ssoRecaptchaUseCase, "ssoRecaptchaUseCase");
        this.f33056e = sessionVM;
        this.f33057f = ssoRecaptchaUseCase;
        this.f33058g = P.a(new d.b(P9.b.f18407P0));
        this.f33059h = P.a(new d.b(P9.b.f18399L0));
        this.f33060i = new H.l((String) null, 0L, 3, (DefaultConstructorMarker) null);
        Boolean bool = Boolean.TRUE;
        this.f33061j = P.a(bool);
        this.f33062k = P.a(null);
        this.f33063l = Patterns.EMAIL_ADDRESS;
        this.f33064m = P.a(new d.b(P9.b.f18385E0));
        this.f33065n = P.a(bool);
        this.f33066o = P.a(bool);
        Boolean bool2 = Boolean.FALSE;
        this.f33067p = P.a(bool2);
        this.f33068q = P.a(bool2);
        this.f33069r = P.a(new d.b(P9.b.f18393I0));
        this.f33070s = P.a(new d.b(P9.b.f18395J0));
        this.f33071t = F.b(1, 0, null, 6, null);
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create(...)");
        this.f33072u = cVarJ2;
        V0();
        K0();
    }

    private final void K0() {
        AbstractC5912b abstractC5912bL1 = this.f33072u.L1(new b());
        AbstractC6492s.h(abstractC5912bL1, "switchMapCompletable(...)");
        c0(Ag.f.g(abstractC5912bL1, new InterfaceC6835l() { // from class: ba.n
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return t.L0((Throwable) obj);
            }
        }, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J L0(Throwable it) {
        AbstractC6492s.i(it, "it");
        S9.a.e(new InterfaceC6824a() { // from class: ba.o
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return t.M0();
            }
        }, it);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String M0() {
        return "Failed to process reset email stream";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b N0() {
        AbstractC5912b abstractC5912bF = AbstractC5912b.F(new Callable() { // from class: ba.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.O0(this.f33055a);
            }
        });
        AbstractC6492s.h(abstractC5912bF, "fromCallable(...)");
        return abstractC5912bF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object O0(t tVar) {
        tVar.q0().j(new d.b(P9.b.f18407P0));
        tVar.p0().j(new d.b(P9.b.f18399L0));
        z zVarO0 = tVar.o0();
        Boolean bool = Boolean.TRUE;
        zVarO0.j(bool);
        tVar.m0().j(bool);
        tVar.n0().j(new d.b(P9.b.f18385E0));
        z zVarL0 = tVar.l0();
        Boolean bool2 = Boolean.FALSE;
        zVarL0.j(bool2);
        tVar.k0().j(bool2);
        return Boolean.valueOf(tVar.i0().j(bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b P0() {
        AbstractC5912b abstractC5912bF = AbstractC5912b.F(new Callable() { // from class: ba.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.Q0(this.f33054a);
            }
        });
        AbstractC6492s.h(abstractC5912bF, "fromCallable(...)");
        return abstractC5912bF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Q0(t tVar) {
        tVar.q0().j(new d.b(P9.b.f18405O0));
        tVar.p0().j(new d.b(P9.b.f18401M0));
        z zVarO0 = tVar.o0();
        Boolean bool = Boolean.FALSE;
        zVarO0.j(bool);
        z zVarL0 = tVar.l0();
        Boolean bool2 = Boolean.TRUE;
        zVarL0.j(bool2);
        tVar.k0().j(bool2);
        tVar.i0().j(bool);
        tVar.g0().j(new d.b(P9.b.f18391H0));
        return Boolean.valueOf(tVar.j0().j(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b R0() {
        AbstractC5912b abstractC5912bF = AbstractC5912b.F(new Callable() { // from class: ba.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.S0(this.f33053a);
            }
        });
        AbstractC6492s.h(abstractC5912bF, "fromCallable(...)");
        return abstractC5912bF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object S0(t tVar) {
        tVar.q0().j(new d.b(P9.b.f18409Q0));
        tVar.p0().j(new d.b(P9.b.f18403N0));
        z zVarO0 = tVar.o0();
        Boolean bool = Boolean.TRUE;
        zVarO0.j(bool);
        tVar.m0().j(bool);
        tVar.n0().j(new d.b(P9.b.f18381C0));
        z zVarL0 = tVar.l0();
        Boolean bool2 = Boolean.FALSE;
        zVarL0.j(bool2);
        tVar.k0().j(bool2);
        return Boolean.valueOf(tVar.i0().j(bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b T0(String str) {
        AbstractC5912b abstractC5912bM = this.f33057f.c().s(new c(str)).y().B(new d()).x(new InterfaceC6464a() { // from class: ba.p
            @Override // kg.InterfaceC6464a
            public final void run() {
                t.U0(this.f33052a);
            }
        }).z(new e()).M();
        AbstractC6492s.h(abstractC5912bM, "onErrorComplete(...)");
        return abstractC5912bM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(t tVar) {
        tVar.f33072u.h(a.c.f33075a);
    }

    private final void V0() {
        InterfaceC6043c interfaceC6043cB1 = Qi.i.c(new f(AbstractC6262b.b(h0()), this), null, 1, null).B1(new g(), h.f33090a);
        AbstractC6492s.h(interfaceC6043cB1, "subscribe(...)");
        d0(interfaceC6043cB1);
    }

    @Override // ba.l
    public z f0() {
        return this.f33070s;
    }

    @Override // ba.l
    public z g0() {
        return this.f33069r;
    }

    @Override // ba.l
    public H.l h0() {
        return this.f33060i;
    }

    @Override // ba.l
    public z i0() {
        return this.f33061j;
    }

    @Override // ba.l
    public z j0() {
        return this.f33062k;
    }

    @Override // ba.l
    public z k0() {
        return this.f33068q;
    }

    @Override // ba.l
    public z l0() {
        return this.f33067p;
    }

    @Override // ba.l
    public z m0() {
        return this.f33065n;
    }

    @Override // ba.l
    public z n0() {
        return this.f33064m;
    }

    @Override // ba.l
    public z o0() {
        return this.f33066o;
    }

    @Override // ba.l
    public z p0() {
        return this.f33059h;
    }

    @Override // ba.l
    public z q0() {
        return this.f33058g;
    }

    @Override // ba.l
    protected y r0() {
        return this.f33071t;
    }

    @Override // ba.l
    public Object s0(InterfaceC5380e interfaceC5380e) {
        this.f33072u.h(a.d.f33076a);
        return J.f24997a;
    }

    @Override // ba.l
    public Object t0(InterfaceC5380e interfaceC5380e) {
        w0();
        return J.f24997a;
    }

    @Override // ba.l
    public Object u0(InterfaceC5380e interfaceC5380e) {
        if (((Boolean) m0().getValue()).booleanValue()) {
            e0(l.a.b.f33049a);
        }
        return J.f24997a;
    }

    @Override // ba.l
    public void v0() {
        this.f33072u.h(new a.b(h0().i().toString()));
        e0(l.a.C1148a.f33048a);
    }

    @Override // ba.l
    public void w0() {
        X().b(j.a.C0677a.f19270a);
    }
}
