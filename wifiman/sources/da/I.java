package da;

import Eb.CreateAccountError;
import Eb.CreateSsoUser;
import Eb.DeleteAccountResponse;
import Eb.GenerateUsernamesResponse;
import Eb.PasswordStrengthRequest;
import Eb.PasswordStrengthResponse;
import Eb.SsoUser;
import Eb.TermsRevisions;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Q9.j;
import Zg.AbstractC3689v;
import android.util.Patterns;
import ca.d;
import com.ui.core.ui.sso.SSOAccountVM;
import com.ui.core.ui.sso.a;
import com.ui.unifi.core.sso.exceptions.CreateAccountException;
import da.AbstractC5337t;
import da.AbstractC5338u;
import da.I;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.AbstractC5912b;
import hg.InterfaceC6043c;
import ja.AbstractC6262b;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import s9.d;

/* loaded from: classes3.dex */
public final class I extends AbstractC5338u {

    /* renamed from: e, reason: collision with root package name */
    private final SSOAccountVM f45798e;

    /* renamed from: f, reason: collision with root package name */
    private final ca.d f45799f;

    /* renamed from: g, reason: collision with root package name */
    private final H.l f45800g;

    /* renamed from: h, reason: collision with root package name */
    private final Li.z f45801h;

    /* renamed from: i, reason: collision with root package name */
    private final H.l f45802i;

    /* renamed from: j, reason: collision with root package name */
    private final Li.z f45803j;

    /* renamed from: k, reason: collision with root package name */
    private final Li.z f45804k;

    /* renamed from: l, reason: collision with root package name */
    private final Li.z f45805l;

    /* renamed from: m, reason: collision with root package name */
    private final H.l f45806m;

    /* renamed from: n, reason: collision with root package name */
    private final Li.z f45807n;

    /* renamed from: o, reason: collision with root package name */
    private final Li.z f45808o;

    /* renamed from: p, reason: collision with root package name */
    private final Li.z f45809p;

    /* renamed from: q, reason: collision with root package name */
    private final Li.y f45810q;

    /* renamed from: r, reason: collision with root package name */
    private final Li.z f45811r;

    /* renamed from: s, reason: collision with root package name */
    private final Li.z f45812s;

    /* renamed from: t, reason: collision with root package name */
    private final Li.y f45813t;

    /* renamed from: u, reason: collision with root package name */
    private final Pattern f45814u;

    static final class a implements InterfaceC6469f {
        a() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(PasswordStrengthResponse response) {
            AbstractC6492s.i(response, "response");
            AbstractC5338u.a aVarB1 = I.this.b1(response);
            if (aVarB1 != null) {
                I.this.l0().j(aVarB1);
            }
            I.this.a1().j(Boolean.valueOf(response.getIsAcceptable()));
            I.this.m0().j(AbstractC3689v.M0(AbstractC3689v.e(response.getWarning()), response.getSuggestions()));
        }
    }

    static final class b implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ I f45817a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.a f45818b;

            /* renamed from: da.I$b$a$a, reason: collision with other inner class name */
            static final class C1698a extends kotlin.coroutines.jvm.internal.l implements mh.s {

                /* renamed from: a, reason: collision with root package name */
                int f45819a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f45820b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f45821c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f45822d;

                /* renamed from: e, reason: collision with root package name */
                /* synthetic */ boolean f45823e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ d.a f45824f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ TermsRevisions f45825g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1698a(d.a aVar, TermsRevisions termsRevisions, InterfaceC5380e interfaceC5380e) {
                    super(5, interfaceC5380e);
                    this.f45824f = aVar;
                    this.f45825g = termsRevisions;
                }

                @Override // mh.s
                public /* bridge */ /* synthetic */ Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    return n((CharSequence) obj, (CharSequence) obj2, (CharSequence) obj3, ((Boolean) obj4).booleanValue(), (InterfaceC5380e) obj5);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f45819a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    CharSequence charSequence = (CharSequence) this.f45820b;
                    CharSequence charSequence2 = (CharSequence) this.f45821c;
                    CharSequence charSequence3 = (CharSequence) this.f45822d;
                    return new CreateSsoUser(charSequence3.toString(), charSequence.toString(), charSequence2.toString(), "", "", this.f45824f.b(), this.f45824f.a(), this.f45825g.getTermsRevision(), this.f45825g.getPrivacyRevision(), this.f45823e, (String) null, (String) null, false, 7168, (DefaultConstructorMarker) null);
                }

                public final Object n(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z10, InterfaceC5380e interfaceC5380e) {
                    C1698a c1698a = new C1698a(this.f45824f, this.f45825g, interfaceC5380e);
                    c1698a.f45820b = charSequence;
                    c1698a.f45821c = charSequence2;
                    c1698a.f45822d = charSequence3;
                    c1698a.f45823e = z10;
                    return c1698a.invokeSuspend(Yg.J.f24997a);
                }
            }

            /* renamed from: da.I$b$a$b, reason: collision with other inner class name */
            static final class C1699b implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ I f45826a;

                /* renamed from: da.I$b$a$b$a, reason: collision with other inner class name */
                static final class C1700a implements InterfaceC6469f {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ I f45827a;

                    C1700a(I i10) {
                        this.f45827a = i10;
                    }

                    @Override // kg.InterfaceC6469f
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final void accept(SsoUser it) {
                        AbstractC6492s.i(it, "it");
                        this.f45827a.f45798e.r0().h().q(it.getEmail());
                    }
                }

                C1699b(I i10) {
                    this.f45826a = i10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void c(I i10) {
                    i10.e0().j(Yg.J.f24997a);
                }

                @Override // kg.n
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final gg.f apply(CreateSsoUser payload) {
                    AbstractC6492s.i(payload, "payload");
                    AbstractC5912b abstractC5912bY = this.f45826a.f45798e.r0().g().e(payload).o(new C1700a(this.f45826a)).y();
                    final I i10 = this.f45826a;
                    return abstractC5912bY.x(new InterfaceC6464a() { // from class: da.J
                        @Override // kg.InterfaceC6464a
                        public final void run() {
                            I.b.a.C1699b.c(i10);
                        }
                    });
                }
            }

            a(I i10, d.a aVar) {
                this.f45817a = i10;
                this.f45818b = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(TermsRevisions termsRevisions) {
                AbstractC6492s.i(termsRevisions, "termsRevisions");
                return Qi.i.e(AbstractC3222i.j(AbstractC6262b.b(this.f45817a.i0()), AbstractC6262b.b(this.f45817a.k0()), AbstractC6262b.b(this.f45817a.p0()), this.f45817a.f0(), new C1698a(this.f45818b, termsRevisions, null)), null, 1, null).P().t(new C1699b(this.f45817a));
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(d.a recaptcha) {
            AbstractC6492s.i(recaptcha, "recaptcha");
            return I.this.f45798e.r0().g().d().t(new a(I.this, recaptcha));
        }
    }

    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            I.this.g0().j(Boolean.TRUE);
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(DeleteAccountResponse it) {
            AbstractC6492s.i(it, "it");
            return I.this.S0();
        }
    }

    static final class e implements InterfaceC6469f {
        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(GenerateUsernamesResponse response) {
            String str;
            AbstractC6492s.i(response, "response");
            List usernames = response.getUsernames();
            if (usernames == null || (str = (String) AbstractC3689v.s0(usernames)) == null) {
                return;
            }
            H.l lVarP0 = I.this.p0();
            H.f fVarR = lVarP0.r();
            try {
                fVarR.append(str);
                lVarP0.d(fVarR);
            } finally {
                lVarP0.f();
            }
        }
    }

    static final class f implements InterfaceC6469f {
        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            I.this.g0().j(Boolean.TRUE);
        }
    }

    public static final class g implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g[] f45832a;

        public static final class a implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3220g[] f45833a;

            public a(InterfaceC3220g[] interfaceC3220gArr) {
                this.f45833a = interfaceC3220gArr;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f45833a.length];
            }
        }

        public static final class b extends kotlin.coroutines.jvm.internal.l implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            int f45834a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f45835b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f45836c;

            public b(InterfaceC5380e interfaceC5380e) {
                super(3, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f45834a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f45835b;
                    Object[] objArr = (Object[]) this.f45836c;
                    boolean z10 = false;
                    Object obj2 = objArr[0];
                    boolean z11 = (obj2 instanceof s9.d ? (s9.d) obj2 : null) == null;
                    Object obj3 = objArr[1];
                    boolean zD = AbstractC6492s.d(obj3 instanceof Boolean ? (Boolean) obj3 : null, kotlin.coroutines.jvm.internal.b.a(true));
                    Object obj4 = objArr[2];
                    boolean z12 = (obj4 instanceof s9.d ? (s9.d) obj4 : null) == null;
                    Object obj5 = objArr[3];
                    boolean zD2 = AbstractC6492s.d(obj5 instanceof Boolean ? (Boolean) obj5 : null, kotlin.coroutines.jvm.internal.b.a(true));
                    Object obj6 = objArr[4];
                    boolean zD3 = AbstractC6492s.d(obj6 instanceof Boolean ? (Boolean) obj6 : null, kotlin.coroutines.jvm.internal.b.a(true));
                    if (z11 && zD && z12 && zD2 && !zD3) {
                        z10 = true;
                    }
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(z10);
                    this.f45834a = 1;
                    if (interfaceC3221h.a(boolA, this) == objG) {
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

            @Override // mh.q
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object s(InterfaceC3221h interfaceC3221h, Object[] objArr, InterfaceC5380e interfaceC5380e) {
                b bVar = new b(interfaceC5380e);
                bVar.f45835b = interfaceC3221h;
                bVar.f45836c = objArr;
                return bVar.invokeSuspend(Yg.J.f24997a);
            }
        }

        public g(InterfaceC3220g[] interfaceC3220gArr) {
            this.f45832a = interfaceC3220gArr;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            InterfaceC3220g[] interfaceC3220gArr = this.f45832a;
            Object objA = Mi.j.a(interfaceC3221h, interfaceC3220gArr, new a(interfaceC3220gArr), new b(null), interfaceC5380e);
            return objA == AbstractC5467b.g() ? objA : Yg.J.f24997a;
        }
    }

    static final class i implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final i f45838a = new i();

        i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "Failed to process create account enabled stream";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            S9.a.e(new InterfaceC6824a() { // from class: da.K
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return I.i.c();
                }
            }, it);
        }
    }

    static final class j implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f45840a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(Throwable it) {
                AbstractC6492s.i(it, "it");
                return gg.z.z(Boolean.FALSE);
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ I f45841a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CharSequence f45842b;

            b(I i10, CharSequence charSequence) {
                this.f45841a = i10;
                this.f45842b = charSequence;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Object c(I i10) {
                return Boolean.valueOf(i10.j0().j(new d.b(P9.b.f18442h0)));
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Boolean emailTaken) {
                AbstractC6492s.i(emailTaken, "emailTaken");
                if (emailTaken.booleanValue()) {
                    final I i10 = this.f45841a;
                    return AbstractC5912b.F(new Callable() { // from class: da.O
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return I.j.b.c(i10);
                        }
                    });
                }
                this.f45841a.j0().j(null);
                if (kotlin.text.t.m0(this.f45841a.p0().i())) {
                    return this.f45841a.X0(this.f45842b.toString());
                }
                AbstractC5912b abstractC5912bM = AbstractC5912b.m();
                AbstractC6492s.f(abstractC5912bM);
                return abstractC5912bM;
            }
        }

        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object e(I i10) {
            return Boolean.valueOf(i10.j0().j(null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object f(I i10) {
            return Boolean.valueOf(i10.j0().j(null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object g(I i10) {
            return Boolean.valueOf(i10.j0().j(new d.b(P9.b.f18440g0)));
        }

        @Override // kg.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(CharSequence email) {
            AbstractC6492s.i(email, "email");
            if (kotlin.text.t.m0(email)) {
                final I i10 = I.this;
                return AbstractC5912b.F(new Callable() { // from class: da.L
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return I.j.e(i10);
                    }
                });
            }
            if (AbstractC6492s.d(email.toString(), I.this.f45798e.r0().h().v())) {
                final I i11 = I.this;
                return AbstractC5912b.F(new Callable() { // from class: da.M
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return I.j.f(i11);
                    }
                });
            }
            if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                return I.this.f45798e.r0().g().t(email.toString()).F(a.f45840a).t(new b(I.this, email));
            }
            final I i12 = I.this;
            return AbstractC5912b.F(new Callable() { // from class: da.N
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return I.j.g(i12);
                }
            });
        }
    }

    static final class k implements kg.n {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object d(I i10) {
            i10.l0().j(AbstractC5338u.a.C1713a.f45968a);
            i10.a1().j(Boolean.FALSE);
            return Boolean.valueOf(i10.m0().j(AbstractC3689v.l()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object e(I i10) {
            i10.l0().j(AbstractC5338u.a.f.f45973a);
            i10.a1().j(Boolean.FALSE);
            return Boolean.valueOf(i10.m0().j(AbstractC3689v.l()));
        }

        @Override // kg.n
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(CharSequence password) {
            AbstractC6492s.i(password, "password");
            if (password.length() == 0) {
                final I i10 = I.this;
                return AbstractC5912b.F(new Callable() { // from class: da.P
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return I.k.d(i10);
                    }
                });
            }
            if (password.length() >= 12) {
                return I.this.R0(password.toString());
            }
            final I i11 = I.this;
            return AbstractC5912b.F(new Callable() { // from class: da.Q
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return I.k.e(i11);
                }
            });
        }
    }

    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f45844a = new l();

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(CharSequence it) {
            AbstractC6492s.i(it, "it");
            return it.toString();
        }
    }

    static final class m implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f45846a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(Throwable it) {
                AbstractC6492s.i(it, "it");
                return gg.z.z(Boolean.FALSE);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ I f45847a;

            b(I i10) {
                this.f45847a = i10;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Boolean taken) {
                AbstractC6492s.i(taken, "taken");
                this.f45847a.q0().j(taken.booleanValue() ? new d.b(P9.b.f18377A0) : null);
            }
        }

        m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object e(I i10) {
            return Boolean.valueOf(i10.q0().j(null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object f(I i10) {
            return Boolean.valueOf(i10.q0().j(null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object g(I i10) {
            return Boolean.valueOf(i10.q0().j(new d.b(P9.b.f18478z0)));
        }

        @Override // kg.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(String username) {
            AbstractC6492s.i(username, "username");
            if (kotlin.text.t.m0(username)) {
                final I i10 = I.this;
                return AbstractC5912b.F(new Callable() { // from class: da.S
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return I.m.e(i10);
                    }
                });
            }
            if (AbstractC6492s.d(username, I.this.f45798e.r0().h().G())) {
                final I i11 = I.this;
                return AbstractC5912b.F(new Callable() { // from class: da.T
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return I.m.f(i11);
                    }
                });
            }
            if (I.this.f45814u.matcher(username).matches()) {
                return I.this.f45798e.r0().g().s(username).F(a.f45846a).o(new b(I.this)).y();
            }
            final I i12 = I.this;
            return AbstractC5912b.F(new Callable() { // from class: da.U
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return I.m.g(i12);
                }
            });
        }
    }

    public I(SSOAccountVM sessionVM, ca.d ssoRecaptchaUseCase) {
        AbstractC6492s.i(sessionVM, "sessionVM");
        AbstractC6492s.i(ssoRecaptchaUseCase, "ssoRecaptchaUseCase");
        this.f45798e = sessionVM;
        this.f45799f = ssoRecaptchaUseCase;
        this.f45800g = new H.l((String) null, 0L, 3, (DefaultConstructorMarker) null);
        this.f45801h = Li.P.a(null);
        this.f45802i = new H.l((String) null, 0L, 3, (DefaultConstructorMarker) null);
        this.f45803j = Li.P.a(AbstractC5338u.a.C1713a.f45968a);
        Boolean bool = Boolean.FALSE;
        this.f45804k = Li.P.a(bool);
        this.f45805l = Li.P.a(AbstractC3689v.l());
        this.f45806m = new H.l((String) null, 0L, 3, (DefaultConstructorMarker) null);
        this.f45807n = Li.P.a(null);
        this.f45808o = Li.P.a(Boolean.TRUE);
        this.f45809p = Li.P.a(bool);
        this.f45810q = Li.F.b(1, 0, Ki.a.DROP_LATEST, 2, null);
        this.f45811r = Li.P.a(bool);
        this.f45812s = Li.P.a(bool);
        this.f45813t = Li.F.b(0, 1, null, 5, null);
        this.f45814u = Pattern.compile("^\\w[-_.+A-Za-z\\d]{0,127}$");
        k1();
        n1();
        q1();
        j1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b R0(String str) {
        Ab.a aVarG = this.f45798e.r0().g();
        String string = i0().i().toString();
        if (kotlin.text.t.m0(string)) {
            string = null;
        }
        String string2 = p0().i().toString();
        AbstractC5912b abstractC5912bM = aVarG.c(new PasswordStrengthRequest(str, AbstractC3689v.q(string, kotlin.text.t.m0(string2) ? null : string2))).o(new a()).y().M();
        AbstractC6492s.h(abstractC5912bM, "onErrorComplete(...)");
        return abstractC5912bM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b S0() {
        AbstractC5912b abstractC5912bT = this.f45799f.c().t(new b());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    private final void T0(String str, String str2) {
        AbstractC5912b abstractC5912bW = this.f45798e.r0().g().q(str, str2).n(new c()).t(new d()).w(new InterfaceC6464a() { // from class: da.A
            @Override // kg.InterfaceC6464a
            public final void run() {
                I.U0(this.f45797a);
            }
        });
        AbstractC6492s.h(abstractC5912bW, "doFinally(...)");
        c0(Ag.f.g(abstractC5912bW, new InterfaceC6835l() { // from class: da.B
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.V0((Throwable) obj);
            }
        }, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(I i10) {
        i10.g0().j(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J V0(Throwable error) {
        AbstractC6492s.i(error, "error");
        S9.a.e(new InterfaceC6824a() { // from class: da.D
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return I.W0();
            }
        }, error);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String W0() {
        return "Failed to process re-create account stream";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b X0(String str) {
        AbstractC5912b abstractC5912bM = this.f45798e.r0().g().m(str).o(new e()).y().M();
        AbstractC6492s.h(abstractC5912bM, "onErrorComplete(...)");
        return abstractC5912bM;
    }

    private final boolean Z0() {
        Gb.f fVarH = this.f45798e.r0().h();
        return (fVarH.v() == null || fVarH.j() == null || fVarH.G() == null || fVarH.h() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5338u.a b1(PasswordStrengthResponse passwordStrengthResponse) {
        int score = passwordStrengthResponse.getScore();
        if (score == 0) {
            return new AbstractC5338u.a.e(passwordStrengthResponse.getWarning());
        }
        if (score == 1) {
            return new AbstractC5338u.a.g(passwordStrengthResponse.getWarning());
        }
        if (score == 2) {
            return new AbstractC5338u.a.d(passwordStrengthResponse.getWarning());
        }
        if (score != 3) {
            if (score != 4) {
                return null;
            }
            return AbstractC5338u.a.c.f45970a;
        }
        String warning = passwordStrengthResponse.getWarning();
        String str = kotlin.text.t.m0(warning) ? null : warning;
        return str != null ? new AbstractC5338u.a.d(str) : AbstractC5338u.a.b.f45969a;
    }

    private final void d1() {
        X().b(new j.a.d(AbstractC5337t.b.f45966a));
    }

    private final boolean e1() {
        Gb.f fVarH = this.f45798e.r0().h();
        return (AbstractC6492s.d(fVarH.v(), i0().i().toString()) && AbstractC6492s.d(fVarH.j(), k0().i().toString()) && AbstractC6492s.d(fVarH.G(), p0().i().toString())) ? false : true;
    }

    private final void f1() {
        AbstractC5912b abstractC5912bW = S0().B(new f()).w(new InterfaceC6464a() { // from class: da.w
            @Override // kg.InterfaceC6464a
            public final void run() {
                I.g1(this.f45977a);
            }
        });
        AbstractC6492s.h(abstractC5912bW, "doFinally(...)");
        c0(Ag.f.g(abstractC5912bW, new InterfaceC6835l() { // from class: da.z
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.h1(this.f45978a, (Throwable) obj);
            }
        }, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(I i10) {
        i10.g0().j(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J h1(I i10, Throwable error) {
        List emailErrors;
        AbstractC6492s.i(error, "error");
        S9.a.e(new InterfaceC6824a() { // from class: da.C
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return I.i1();
            }
        }, error);
        String str = null;
        CreateAccountException createAccountException = error instanceof CreateAccountException ? (CreateAccountException) error : null;
        if (createAccountException != null) {
            CreateAccountError error2 = createAccountException.getError();
            if (error2 != null && (emailErrors = error2.getEmailErrors()) != null) {
                str = (String) AbstractC3689v.s0(emailErrors);
            }
            if (str != null) {
                i10.j0().j(new d.c(str));
            }
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i1() {
        return "Failed to process create account stream";
    }

    private final void j1() {
        gg.s sVarE = Qi.i.e(new g(new InterfaceC3220g[]{j0(), a1(), q0(), o0(), g0()}), null, 1, null);
        final Li.z zVarH0 = h0();
        InterfaceC6043c interfaceC6043cJ0 = sVarE.J0(new InterfaceC6469f() { // from class: da.I.h
            public final void a(boolean z10) {
                zVarH0.j(Boolean.valueOf(z10));
            }

            @Override // kg.InterfaceC6469f
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                a(((Boolean) obj).booleanValue());
            }
        }, i.f45838a);
        AbstractC6492s.h(interfaceC6043cJ0, "subscribe(...)");
        c0(interfaceC6043cJ0);
    }

    private final void k1() {
        AbstractC5912b abstractC5912bQ0 = Qi.i.e(AbstractC6262b.b(i0()), null, 1, null).Q0(new j());
        AbstractC6492s.h(abstractC5912bQ0, "switchMapCompletable(...)");
        c0(Ag.f.g(abstractC5912bQ0, new InterfaceC6835l() { // from class: da.F
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.l1((Throwable) obj);
            }
        }, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J l1(Throwable it) {
        AbstractC6492s.i(it, "it");
        S9.a.e(new InterfaceC6824a() { // from class: da.x
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return I.m1();
            }
        }, it);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m1() {
        return "Failed to process email validation stream";
    }

    private final void n1() {
        AbstractC5912b abstractC5912bQ0 = Qi.i.e(AbstractC6262b.b(k0()), null, 1, null).Q0(new k());
        AbstractC6492s.h(abstractC5912bQ0, "switchMapCompletable(...)");
        c0(Ag.f.g(abstractC5912bQ0, new InterfaceC6835l() { // from class: da.G
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.o1((Throwable) obj);
            }
        }, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J o1(Throwable it) {
        AbstractC6492s.i(it, "it");
        S9.a.e(new InterfaceC6824a() { // from class: da.H
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return I.p1();
            }
        }, it);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p1() {
        return "Failed to process password validation stream";
    }

    private final void q1() {
        AbstractC5912b abstractC5912bQ0 = Qi.i.e(AbstractC6262b.b(p0()), null, 1, null).i0(l.f45844a).v().p(500L, TimeUnit.MILLISECONDS).Q0(new m());
        AbstractC6492s.h(abstractC5912bQ0, "switchMapCompletable(...)");
        c0(Ag.f.g(abstractC5912bQ0, new InterfaceC6835l() { // from class: da.E
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return I.r1((Throwable) obj);
            }
        }, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J r1(Throwable it) {
        AbstractC6492s.i(it, "it");
        S9.a.e(new InterfaceC6824a() { // from class: da.y
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return I.s1();
            }
        }, it);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s1() {
        return "Failed to process username validation stream";
    }

    @Override // da.AbstractC5338u
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public Li.y e0() {
        return this.f45813t;
    }

    public Li.z a1() {
        return this.f45804k;
    }

    @Override // da.AbstractC5338u
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public Li.y n0() {
        return this.f45810q;
    }

    @Override // da.AbstractC5338u
    public Li.z f0() {
        return this.f45808o;
    }

    @Override // da.AbstractC5338u
    public Li.z g0() {
        return this.f45811r;
    }

    @Override // da.AbstractC5338u
    public Li.z h0() {
        return this.f45812s;
    }

    @Override // da.AbstractC5338u
    public H.l i0() {
        return this.f45800g;
    }

    @Override // da.AbstractC5338u
    public Li.z j0() {
        return this.f45801h;
    }

    @Override // da.AbstractC5338u
    public H.l k0() {
        return this.f45802i;
    }

    @Override // da.AbstractC5338u
    public Li.z l0() {
        return this.f45803j;
    }

    @Override // da.AbstractC5338u
    public Li.z m0() {
        return this.f45805l;
    }

    @Override // da.AbstractC5338u
    public Li.z o0() {
        return this.f45809p;
    }

    @Override // da.AbstractC5338u
    public H.l p0() {
        return this.f45806m;
    }

    @Override // da.AbstractC5338u
    public Li.z q0() {
        return this.f45807n;
    }

    @Override // da.AbstractC5338u
    public void r0(boolean z10) {
        f0().j(Boolean.valueOf(z10));
    }

    @Override // da.AbstractC5338u
    public Object s0(InterfaceC5380e interfaceC5380e) {
        if (!Z0()) {
            f1();
        } else if (e1()) {
            Gb.f fVarH = this.f45798e.r0().h();
            String strH = fVarH.h();
            AbstractC6492s.f(strH);
            String strJ = fVarH.j();
            AbstractC6492s.f(strJ);
            T0(strH, strJ);
        } else {
            d1();
        }
        return Yg.J.f24997a;
    }

    @Override // da.AbstractC5338u
    public void t0() {
        H.m.a(k0());
    }

    @Override // da.AbstractC5338u
    public void u0() {
        this.f45798e.X().b(new j.a.d(a.C1314a.f41411a));
    }

    @Override // da.AbstractC5338u
    public void v0() {
        n0().j(Yg.J.f24997a);
    }

    @Override // da.AbstractC5338u
    public void w0(boolean z10) {
        o0().j(Boolean.valueOf(z10));
    }

    @Override // da.AbstractC5338u
    public void x0() {
        X().b(j.a.C0677a.f19270a);
    }

    @Override // da.AbstractC5338u
    public void y0(String url) {
        AbstractC6492s.i(url, "url");
        X().b(new j.a.e(url));
    }
}
