package Ab;

import Eb.CreateAccountError;
import Eb.CreateSsoUser;
import Eb.DeleteAccountRequest;
import Eb.ForgotPasswordRequest;
import Eb.GenerateUsernamesRequest;
import Eb.MfaPushNotificationBody;
import Eb.PasswordStrengthRequest;
import Eb.ResendVerificationEmailError;
import Eb.ResendVerificationEmailRequest;
import Eb.SsoSignInBody;
import Eb.SsoSignInMfaBody;
import Eb.SsoUser;
import Eb.TrustedDeviceBody;
import Eb.w;
import Yg.J;
import Zg.AbstractC3689v;
import aj.AbstractC3868b;
import aj.C3871e;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import com.ui.unifi.core.sso.exceptions.CreateAccountException;
import com.ui.unifi.core.sso.exceptions.EmailNotVerifiedException;
import com.ui.unifi.core.sso.exceptions.ResendVerificationEmailException;
import com.ui.unifi.core.sso.exceptions.UserNotFoundException;
import gg.AbstractC5912b;
import gg.D;
import gg.y;
import gg.z;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import org.conscrypt.PSKKeyManager;
import retrofit2.HttpException;
import wb.C8294d;
import wb.InterfaceC8291a;
import xb.AbstractC8444e;
import zb.C8726b;

/* loaded from: classes3.dex */
public final class g implements Ab.a {

    /* renamed from: j, reason: collision with root package name */
    public static final a f579j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Ab.h f580a;

    /* renamed from: b, reason: collision with root package name */
    private final Gb.f f581b;

    /* renamed from: c, reason: collision with root package name */
    private final String f582c;

    /* renamed from: d, reason: collision with root package name */
    private final String f583d;

    /* renamed from: e, reason: collision with root package name */
    private final Cb.a f584e;

    /* renamed from: f, reason: collision with root package name */
    private final Ab.i f585f;

    /* renamed from: g, reason: collision with root package name */
    private final y f586g;

    /* renamed from: h, reason: collision with root package name */
    private final Fb.a f587h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f588i;

    public static final class a {

        /* renamed from: Ab.g$a$a, reason: collision with other inner class name */
        static final class C0016a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final C0016a f589a = new C0016a();

            C0016a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof UserNotFoundException ? z.z(Boolean.FALSE) : z.p(error);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final z b(z zVar) {
            z zVarF = zVar.F(C0016a.f589a);
            AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
            return zVarF;
        }

        private a() {
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CreateSsoUser f592b;

        c(CreateSsoUser c2674c) {
            this.f592b = c2674c;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(SsoUser it) {
            AbstractC6492s.i(it, "it");
            g.this.f581b.n(this.f592b.getPassword());
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            return z.p(g.this.E(it));
        }
    }

    /* renamed from: Ab.g$g, reason: collision with other inner class name */
    static final class C0017g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f596a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f597b;

        C0017g(String str, g gVar) {
            this.f596a = str;
            this.f597b = gVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(SsoUser it) {
            AbstractC6492s.i(it, "it");
            String str = this.f596a;
            if (str != null) {
                this.f597b.f581b.n(str);
            }
        }
    }

    static final class h implements kg.n {
        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            return AbstractC5912b.D(g.this.F(it));
        }
    }

    static final class i implements InterfaceC6469f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f600b;

        i(String str) {
            this.f600b = str;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(SsoUser it) {
            AbstractC6492s.i(it, "it");
            g.this.f581b.n(this.f600b);
        }
    }

    static final class l implements kg.n {
        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(SsoUser it) throws UnauthorisedException {
            AbstractC6492s.i(it, "it");
            String strR = g.this.f581b.r();
            if (strR != null) {
                return strR;
            }
            throw new UnauthorisedException(null, null, 3, null);
        }
    }

    static final class m implements kg.n {
        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(String it) {
            AbstractC6492s.i(it, "it");
            return g.this.f585f.g();
        }
    }

    static final class p implements kg.n {
        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(SsoUser it) throws UnauthorisedException {
            AbstractC6492s.i(it, "it");
            String strR = g.this.f581b.r();
            if (strR != null) {
                return strR;
            }
            throw new UnauthorisedException(null, null, 3, null);
        }
    }

    static final class q implements kg.n {
        q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(String it) {
            AbstractC6492s.i(it, "it");
            return g.this.f585f.g();
        }
    }

    public g(Ab.h ssoConfig, Gb.f storage, Ab.b bVar, String clientAppName, String clientAppVersion, InterfaceC8291a interfaceC8291a, Cb.a trustedDeviceHelper, HttpLoggingInterceptor.Level httpLogLevel, Ab.i service, y io2) {
        AbstractC6492s.i(ssoConfig, "ssoConfig");
        AbstractC6492s.i(storage, "storage");
        AbstractC6492s.i(clientAppName, "clientAppName");
        AbstractC6492s.i(clientAppVersion, "clientAppVersion");
        AbstractC6492s.i(trustedDeviceHelper, "trustedDeviceHelper");
        AbstractC6492s.i(httpLogLevel, "httpLogLevel");
        AbstractC6492s.i(service, "service");
        AbstractC6492s.i(io2, "io");
        this.f580a = ssoConfig;
        this.f581b = storage;
        this.f582c = clientAppName;
        this.f583d = clientAppVersion;
        this.f584e = trustedDeviceHelper;
        this.f585f = service;
        this.f586g = io2;
        this.f587h = new Fb.a(1, new InterfaceC6824a() { // from class: Ab.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return g.I(this.f576a);
            }
        });
        this.f588i = Yg.n.b(new InterfaceC6824a() { // from class: Ab.e
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return g.G(this.f577a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f C(g gVar) {
        HttpCookie httpCookie;
        List<HttpCookie> list;
        Object next;
        String strS = gVar.f581b.s();
        if (strS == null || (list = HttpCookie.parse(strS)) == null) {
            httpCookie = null;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                HttpCookie httpCookie2 = (HttpCookie) next;
                if (AbstractC6492s.d(httpCookie2.getName(), gVar.f580a.getUbicAuthCookieName()) && !httpCookie2.hasExpired()) {
                    break;
                }
            }
            httpCookie = (HttpCookie) next;
        }
        return httpCookie == null ? AbstractC5912b.D(new UnauthorisedException(null, null, 3, null)) : AbstractC5912b.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z D(SsoUser ssoUser) {
        if (ssoUser.getIsVerified()) {
            z zVarZ = z.z(ssoUser);
            AbstractC6492s.f(zVarZ);
            return zVarZ;
        }
        z zVarP = z.p(new EmailNotVerifiedException());
        AbstractC6492s.f(zVarP);
        return zVarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String G(g gVar) {
        gVar.getClass();
        return null;
    }

    private final z H(D d10) {
        z zVarL = o().k(d10).L(this.f587h);
        AbstractC6492s.h(zVarL, "retryWhen(...)");
        return zVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J I(g gVar) {
        gVar.f581b.u();
        return J.f24997a;
    }

    private final z K(String str, String str2, boolean z10) {
        z zVarO = this.f585f.m(new SsoSignInBody(str, str2, z10, this.f584e.b(), (String) null, 16, (DefaultConstructorMarker) null)).s(new kg.n() { // from class: Ab.g.j
            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final z apply(SsoUser p02) {
                AbstractC6492s.i(p02, "p0");
                return g.this.D(p02);
            }
        }).o(new InterfaceC6469f() { // from class: Ab.g.k
            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(SsoUser p02) {
                AbstractC6492s.i(p02, "p0");
                g.this.J(p02);
            }
        });
        AbstractC6492s.h(zVarO, "doOnSuccess(...)");
        z zVarO2 = Bb.g.l(zVarO).A(new l()).s(new m()).O(this.f586g);
        AbstractC6492s.h(zVarO2, "subscribeOn(...)");
        return zVarO2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J y(C3871e Json) {
        AbstractC6492s.i(Json, "$this$Json");
        Json.d(true);
        Json.f(true);
        cj.f fVar = new cj.f();
        fVar.i(w.INSTANCE.b());
        Json.h(fVar.h());
        return J.f24997a;
    }

    public Throwable E(Throwable error) {
        ResponseBody responseBodyD;
        AbstractC6492s.i(error, "error");
        if (!(error instanceof HttpException)) {
            return error;
        }
        Mj.w wVarD = ((HttpException) error).d();
        CreateAccountError createAccountError = null;
        String strC = (wVarD == null || (responseBodyD = wVarD.d()) == null) ? null : responseBodyD.C();
        if (strC != null) {
            AbstractC3868b.a aVar = AbstractC3868b.f26328d;
            aVar.a();
            createAccountError = (CreateAccountError) aVar.b(CreateAccountError.INSTANCE.serializer(), strC);
        }
        return new CreateAccountException(createAccountError, strC);
    }

    public Throwable F(Throwable error) {
        ResponseBody responseBodyD;
        AbstractC6492s.i(error, "error");
        if (!(error instanceof HttpException)) {
            return error;
        }
        Mj.w wVarD = ((HttpException) error).d();
        String strC = (wVarD == null || (responseBodyD = wVarD.d()) == null) ? null : responseBodyD.C();
        if (strC != null) {
            AbstractC3868b.a aVar = AbstractC3868b.f26328d;
            aVar.a();
            ResendVerificationEmailError nVar = (ResendVerificationEmailError) aVar.b(ResendVerificationEmailError.INSTANCE.serializer(), strC);
            if (nVar != null) {
                return new ResendVerificationEmailException(nVar.getLimitInSeconds());
            }
        }
        return (Exception) error;
    }

    public void J(SsoUser ssoUser) {
        AbstractC6492s.i(ssoUser, "ssoUser");
        this.f581b.k(ssoUser.getUuid());
        this.f581b.y(ssoUser.getUsername());
        this.f581b.q(ssoUser.getEmail());
    }

    @Override // Ab.a
    public z a() {
        return this.f585f.a();
    }

    @Override // Ab.a
    public AbstractC5912b b(String email, ResendVerificationEmailRequest resendVerificationEmailRequest) {
        AbstractC6492s.i(email, "email");
        AbstractC6492s.i(resendVerificationEmailRequest, "resendVerificationEmailRequest");
        AbstractC5912b abstractC5912bO = this.f585f.b(email, resendVerificationEmailRequest).O(new h());
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        return abstractC5912bO;
    }

    @Override // Ab.a
    public z c(PasswordStrengthRequest passwordStrengthRequest) {
        AbstractC6492s.i(passwordStrengthRequest, "passwordStrengthRequest");
        z zVarO = this.f585f.c(passwordStrengthRequest).O(Gg.a.d());
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        return zVarO;
    }

    @Override // Ab.a
    public z d() {
        return this.f585f.d();
    }

    @Override // Ab.a
    public z e(CreateSsoUser ssoUser) {
        AbstractC6492s.i(ssoUser, "ssoUser");
        z zVarF = this.f585f.e(ssoUser).o(new InterfaceC6469f() { // from class: Ab.g.b
            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(SsoUser p02) {
                AbstractC6492s.i(p02, "p0");
                g.this.J(p02);
            }
        }).o(new c(ssoUser)).F(new d());
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }

    @Override // Ab.a
    public z f(String usernameOrEmail, ForgotPasswordRequest forgotPasswordRequest) {
        AbstractC6492s.i(usernameOrEmail, "usernameOrEmail");
        AbstractC6492s.i(forgotPasswordRequest, "forgotPasswordRequest");
        z zVarH0 = this.f585f.f(usernameOrEmail, forgotPasswordRequest).W(this.f586g).h0(J.f24997a);
        AbstractC6492s.h(zVarH0, "toSingleDefault(...)");
        return Bb.g.j(zVarH0);
    }

    @Override // Ab.a
    public z g() {
        z zVarO = H(this.f585f.g()).o(new InterfaceC6469f() { // from class: Ab.g.e
            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(SsoUser p02) {
                AbstractC6492s.i(p02, "p0");
                g.this.J(p02);
            }
        });
        AbstractC6492s.h(zVarO, "doOnSuccess(...)");
        return zVarO;
    }

    @Override // Ab.a
    public String h() {
        return this.f581b.h();
    }

    @Override // Ab.a
    public z i(String twoFaToken) {
        AbstractC6492s.i(twoFaToken, "twoFaToken");
        z zVarO = this.f585f.r(new SsoSignInMfaBody(twoFaToken, this.f584e.b(), (String) null, 4, (DefaultConstructorMarker) null)).s(new kg.n() { // from class: Ab.g.n
            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final z apply(SsoUser p02) {
                AbstractC6492s.i(p02, "p0");
                return g.this.D(p02);
            }
        }).o(new InterfaceC6469f() { // from class: Ab.g.o
            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(SsoUser p02) {
                AbstractC6492s.i(p02, "p0");
                g.this.J(p02);
            }
        });
        AbstractC6492s.h(zVarO, "doOnSuccess(...)");
        z zVarO2 = Bb.g.l(zVarO).A(new p()).s(new q()).O(this.f586g);
        AbstractC6492s.h(zVarO2, "subscribeOn(...)");
        return zVarO2;
    }

    @Override // Ab.a
    public z j(String str) {
        z zVarO = this.f585f.j().o(new InterfaceC6469f() { // from class: Ab.g.f
            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(SsoUser p02) {
                AbstractC6492s.i(p02, "p0");
                g.this.J(p02);
            }
        }).o(new C0017g(str, this));
        AbstractC6492s.h(zVarO, "doOnSuccess(...)");
        return AbstractC8444e.c(zVarO);
    }

    @Override // Ab.a
    public AbstractC5912b k(String deviceId) {
        AbstractC6492s.i(deviceId, "deviceId");
        return this.f585f.q(new TrustedDeviceBody(deviceId));
    }

    @Override // Ab.a
    public AbstractC5912b l(w.Sms authenticator) {
        AbstractC6492s.i(authenticator, "authenticator");
        return AbstractC8444e.b(this.f585f.o(authenticator.getId()));
    }

    @Override // Ab.a
    public z m(String email) {
        AbstractC6492s.i(email, "email");
        return this.f585f.p(new GenerateUsernamesRequest(email));
    }

    @Override // Ab.a
    public AbstractC5912b n(w.Email authenticator) {
        AbstractC6492s.i(authenticator, "authenticator");
        return AbstractC8444e.b(this.f585f.h(authenticator.getId()));
    }

    @Override // Ab.a
    public AbstractC5912b o() {
        AbstractC5912b abstractC5912bS = AbstractC5912b.s(new kg.q() { // from class: Ab.f
            @Override // kg.q
            public final Object get() {
                return g.C(this.f578a);
            }
        });
        AbstractC6492s.h(abstractC5912bS, "defer(...)");
        return abstractC5912bS;
    }

    @Override // Ab.a
    public AbstractC5912b p() {
        return AbstractC8444e.b(this.f585f.l(new MfaPushNotificationBody(this.f584e.b(), (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0))));
    }

    @Override // Ab.a
    public z q(String userId, String password) {
        AbstractC6492s.i(userId, "userId");
        AbstractC6492s.i(password, "password");
        return Bb.g.i(this.f585f.k(userId, new DeleteAccountRequest(password)));
    }

    @Override // Ab.a
    public z r(String email, String password, String str, boolean z10) {
        AbstractC6492s.i(email, "email");
        AbstractC6492s.i(password, "password");
        z zVarO = (str == null ? K(email, password, z10) : i(str)).o(new i(password));
        AbstractC6492s.h(zVarO, "doOnSuccess(...)");
        return zVarO;
    }

    @Override // Ab.a
    public z s(String username) {
        AbstractC6492s.i(username, "username");
        a aVar = f579j;
        z zVarH0 = this.f585f.i(username).W(this.f586g).h0(Boolean.TRUE);
        AbstractC6492s.h(zVarH0, "toSingleDefault(...)");
        return aVar.b(Bb.g.m(zVarH0));
    }

    @Override // Ab.a
    public z t(String email) {
        AbstractC6492s.i(email, "email");
        a aVar = f579j;
        z zVarH0 = this.f585f.n(email).W(this.f586g).h0(Boolean.TRUE);
        AbstractC6492s.h(zVarH0, "toSingleDefault(...)");
        return aVar.b(Bb.g.m(zVarH0));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g(Ab.h hVar, Gb.f fVar, Ab.b bVar, String str, String str2, InterfaceC8291a interfaceC8291a, Cb.a aVar, HttpLoggingInterceptor.Level level, Ab.i iVar, y yVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC8291a interfaceC8291a2 = (i10 & 32) != 0 ? null : interfaceC8291a;
        HttpLoggingInterceptor.Level level2 = (i10 & 128) != 0 ? HttpLoggingInterceptor.Level.BASIC : level;
        this(hVar, fVar, bVar, str, str2, interfaceC8291a2, aVar, level2, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? (Ab.i) new C8294d(hVar.getSsoUrl(), null, AbstractC3689v.o(new Db.b("/api/sso/v1/user/self/mfa/push/poll-login"), new C8726b(str, str2), new Db.a(hVar, fVar), new Db.d(aVar)), null, null, null, aj.w.b(null, new InterfaceC6835l() { // from class: Ab.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return g.y((C3871e) obj);
            }
        }, 1, null), interfaceC8291a2, level2, 58, null).d().b(Ab.i.class) : iVar, (i10 & 512) != 0 ? Gg.a.d() : yVar);
    }
}
