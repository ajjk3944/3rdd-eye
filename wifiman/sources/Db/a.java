package Db;

import Ab.h;
import Gb.f;
import java.net.HttpCookie;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import yb.AbstractC8643a;

/* loaded from: classes3.dex */
public final class a implements Interceptor {

    /* renamed from: c, reason: collision with root package name */
    public static final C0151a f3178c = new C0151a(null);

    /* renamed from: a, reason: collision with root package name */
    private final f f3179a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3180b;

    /* renamed from: Db.a$a, reason: collision with other inner class name */
    public static final class C0151a {
        public /* synthetic */ C0151a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean e(Request request) {
            return AbstractC6492s.d(request.getUrl().d(), "/api/sso/v1/login/token/setup");
        }

        private final boolean f(Request request) {
            return AbstractC6492s.d(request.getUrl().d(), "/api/sso/v1/jwt/token/login");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean g(Request request) {
            return AbstractC6492s.d(request.getUrl().d(), "/api/sso/v1/login/2fa");
        }

        private final boolean h(Request request) {
            return AbstractC6492s.d(request.getUrl().d(), "/api/sso/v1/login");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean i(Request request) {
            return t.P(request.getUrl().d(), "/api/sso/v1/user/self/mfa/sms", false, 2, null) || t.P(request.getUrl().d(), "/api/sso/v1/user/self/mfa/email", false, 2, null) || t.P(request.getUrl().d(), "/api/sso/v1/user/self/mfa/push", false, 2, null) || AbstractC6492s.d(request.getUrl().d(), "/api/sso/v1/user/self/mfa/webauthn/challenge") || AbstractC6492s.d(request.getUrl().d(), "/api/sso/v1/user/self/mfa/webauthn/login");
        }

        private final boolean j(Request request) {
            return AbstractC6492s.d(request.getUrl().d(), "/api/sso/v1/login/token/poll");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(Request request) {
            return !(i(request) || h(request) || g(request) || e(request) || j(request) || f(request));
        }

        public final void d(Request.Builder request, String cookies) {
            AbstractC6492s.i(request, "request");
            AbstractC6492s.i(cookies, "cookies");
            AbstractC8643a.a(request, cookies);
        }

        public final void l(String str, f storage, Response response) {
            AbstractC6492s.i(storage, "storage");
            AbstractC6492s.i(response, "response");
            List<String> listB = AbstractC8643a.b(response);
            if (listB != null) {
                for (String str2 : listB) {
                    List<HttpCookie> list = HttpCookie.parse(str2);
                    if (list != null) {
                        for (HttpCookie httpCookie : list) {
                            String name = httpCookie.getName();
                            if (AbstractC6492s.d(name, str)) {
                                String value = httpCookie.getValue();
                                AbstractC6492s.f(value);
                                if (t.m0(value)) {
                                    value = null;
                                }
                                storage.m(value);
                                String value2 = httpCookie.getValue();
                                AbstractC6492s.h(value2, "getValue(...)");
                                storage.o(t.m0(value2) ? null : str2);
                            } else if (AbstractC6492s.d(name, "UBIC_2FA")) {
                                storage.C(httpCookie.toString());
                            }
                        }
                    }
                }
            }
        }

        private C0151a() {
        }
    }

    public a(h hVar, f storage) {
        AbstractC6492s.i(storage, "storage");
        this.f3179a = storage;
        this.f3180b = hVar != null ? hVar.getUbicAuthCookieName() : null;
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        String strZ;
        String strS;
        AbstractC6492s.i(chain, "chain");
        Request.Builder builderI = chain.getRequest().i();
        C0151a c0151a = f3178c;
        if (c0151a.k(chain.getRequest()) && (strS = this.f3179a.s()) != null) {
            c0151a.d(builderI, strS);
        }
        Request request = chain.getRequest();
        if ((c0151a.i(request) || c0151a.g(request)) && (strZ = this.f3179a.z()) != null) {
            AbstractC8643a.a(builderI, strZ);
        }
        Response responseB = chain.b(builderI.b());
        c0151a.l(this.f3180b, this.f3179a, responseB);
        return responseB;
    }

    public /* synthetic */ a(h hVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : hVar, fVar);
    }
}
