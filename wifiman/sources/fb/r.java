package fb;

import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class r implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    private static final a f47289b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final s f47290a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Headers headers) {
            List<HttpCookie> list;
            Object next;
            AbstractC6492s.i(headers, "headers");
            String strB = headers.b("Set-Cookie");
            if (strB == null || (list = HttpCookie.parse(strB)) == null) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                HttpCookie httpCookie = (HttpCookie) next;
                if (AbstractC6492s.d(httpCookie.getName(), "TOKEN") || AbstractC6492s.d(httpCookie.getName(), "UOS_TOKEN")) {
                    break;
                }
            }
            HttpCookie httpCookie2 = (HttpCookie) next;
            if (httpCookie2 == null) {
                return null;
            }
            return httpCookie2.getName() + "=" + httpCookie2.getValue();
        }

        private a() {
        }
    }

    public r(s localLoginTokenStorage) {
        AbstractC6492s.i(localLoginTokenStorage, "localLoginTokenStorage");
        this.f47290a = localLoginTokenStorage;
    }

    private final boolean b(Request request) {
        String strD = request.getUrl().d();
        return (AbstractC6492s.d(strD, "/api/auth/nca") || AbstractC6492s.d(strD, "/api/oauth/token") || AbstractC6492s.d(strD, "/api/auth/login")) ? false : true;
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        String strA;
        AbstractC6492s.i(chain, "chain");
        Request.Builder builderI = chain.j().i();
        if (b(chain.j()) && (strA = this.f47290a.a()) != null) {
            if (kotlin.text.t.P(strA, "TOKEN", false, 2, null) || kotlin.text.t.P(strA, "UOS_TOKEN", false, 2, null)) {
                builderI.a("Cookie", strA);
            } else {
                builderI.a("Cookie", "TOKEN=" + strA);
            }
        }
        Response responseB = chain.b(builderI.b());
        String strA2 = f47289b.a(responseB.getHeaders());
        if (strA2 != null) {
            this.f47290a.c(strA2);
        }
        return responseB;
    }
}
