package Bb;

import com.ui.unifi.core.http.exceptions.LoginFailedException;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import com.ui.unifi.core.sso.exceptions.MissingCaptchaException;
import com.ui.unifi.core.sso.exceptions.UserNotFoundException;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import retrofit2.HttpException;
import xb.C8442c;
import xb.C8445f;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final C8442c f1264a = new C8442c(new InterfaceC6835l() { // from class: Bb.c
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return g.h((HttpException) obj);
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private static final C8442c f1265b = new C8442c(new InterfaceC6835l() { // from class: Bb.d
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return g.o((HttpException) obj);
        }
    });

    /* renamed from: c, reason: collision with root package name */
    private static final C8442c f1266c = new C8442c(new InterfaceC6835l() { // from class: Bb.e
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return g.p((HttpException) obj);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private static final C8442c f1267d = new C8442c(new InterfaceC6835l() { // from class: Bb.f
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return g.g((HttpException) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable g(HttpException httpException) {
        AbstractC6492s.i(httpException, "httpException");
        int iA = httpException.a();
        if (iA == 401 || iA == 403) {
            return new UnauthorisedException(null, null, 3, null);
        }
        if (iA != 404) {
            return null;
        }
        return new UserNotFoundException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable h(HttpException httpException) {
        AbstractC6492s.i(httpException, "httpException");
        int iA = httpException.a();
        if (iA == 401 || iA == 403) {
            return new LoginFailedException(null, httpException, 1, null);
        }
        if (iA != 499) {
            return null;
        }
        return q(httpException);
    }

    public static final z i(z zVar) {
        AbstractC6492s.i(zVar, "<this>");
        z zVarH = zVar.h(new C8445f(f1267d));
        AbstractC6492s.h(zVarH, "compose(...)");
        return zVarH;
    }

    public static final z j(z zVar) {
        AbstractC6492s.i(zVar, "<this>");
        z zVarH = zVar.h(new C8445f(new C8442c(new InterfaceC6835l() { // from class: Bb.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return g.k((HttpException) obj);
            }
        })));
        AbstractC6492s.h(zVarH, "compose(...)");
        return zVarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable k(HttpException httpException) {
        AbstractC6492s.i(httpException, "httpException");
        int iA = httpException.a();
        if (iA == 400) {
            return new MissingCaptchaException();
        }
        if (iA != 404) {
            return null;
        }
        return new UserNotFoundException();
    }

    public static final z l(z zVar) {
        AbstractC6492s.i(zVar, "<this>");
        z zVarH = zVar.h(new C8445f(f1266c));
        AbstractC6492s.h(zVarH, "compose(...)");
        return zVarH;
    }

    public static final z m(z zVar) {
        AbstractC6492s.i(zVar, "<this>");
        z zVarH = zVar.h(new C8445f(new C8442c(new InterfaceC6835l() { // from class: Bb.a
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return g.n((HttpException) obj);
            }
        })));
        AbstractC6492s.h(zVarH, "compose(...)");
        return zVarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable n(HttpException httpException) {
        AbstractC6492s.i(httpException, "httpException");
        if (httpException.a() == 404) {
            return new UserNotFoundException();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable o(HttpException httpException) {
        AbstractC6492s.i(httpException, "httpException");
        if (httpException.a() == 400) {
            return new UnauthorisedException(null, null, 3, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable p(HttpException httpException) {
        AbstractC6492s.i(httpException, "httpException");
        int iA = httpException.a();
        if (iA == 401 || iA == 403) {
            return new UnauthorisedException(null, null, 3, null);
        }
        if (iA != 499) {
            return null;
        }
        return q(httpException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        r4 = r4.C();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final com.ui.unifi.core.sso.exceptions.TwoFaRequiredException q(retrofit2.HttpException r4) {
        /*
            Mj.w r4 = r4.d()
            r0 = 0
            if (r4 == 0) goto L3f
            okhttp3.ResponseBody r4 = r4.d()
            if (r4 == 0) goto L3f
            java.lang.String r4 = r4.C()
            if (r4 == 0) goto L3f
            Eb.z$b r1 = Eb.TwoFaRequiredResponse.INSTANCE     // Catch: java.lang.Exception -> L1b
            Eb.z r4 = r1.a(r4)     // Catch: java.lang.Exception -> L1b
            r0 = r4
            goto L3f
        L1b:
            Eb.B$b r1 = Eb.TwoFaRequiredResponseWrapped.INSTANCE     // Catch: java.lang.Exception -> L26
            Eb.B r1 = r1.a(r4)     // Catch: java.lang.Exception -> L26
            Eb.z r0 = r1.getData()     // Catch: java.lang.Exception -> L26
            goto L3f
        L26:
            Sj.a$b r1 = Sj.a.f20830a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not decode TwoFaRequiredResponse from response body: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.o(r4, r2)
        L3f:
            com.ui.unifi.core.sso.exceptions.TwoFaRequiredException r4 = new com.ui.unifi.core.sso.exceptions.TwoFaRequiredException
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Bb.g.q(retrofit2.HttpException):com.ui.unifi.core.sso.exceptions.TwoFaRequiredException");
    }
}
