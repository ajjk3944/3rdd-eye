package okhttp3.internal.http;

import Zg.AbstractC3689v;
import ej.m;
import ej.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/CookieJar;", "cookieJar", "<init>", "(Lokhttp3/CookieJar;)V", "", "Lokhttp3/Cookie;", "cookies", "", SnmpConfigurator.O_BIND_ADDRESS, "(Ljava/util/List;)Ljava/lang/String;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/CookieJar;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CookieJar cookieJar;

    public BridgeInterceptor(CookieJar cookieJar) {
        AbstractC6492s.i(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    private final String b(List cookies) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : cookies) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            Cookie cookie = (Cookie) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(cookie.getName());
            sb2.append('=');
            sb2.append(cookie.getValue());
            i10 = i11;
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        ResponseBody body;
        AbstractC6492s.i(chain, "chain");
        Request request = chain.getRequest();
        Request.Builder builderI = request.i();
        RequestBody body2 = request.getBody();
        if (body2 != null) {
            MediaType contentType = body2.getContentType();
            if (contentType != null) {
                builderI.c("Content-Type", contentType.getMediaType());
            }
            long jA = body2.a();
            if (jA != -1) {
                builderI.c("Content-Length", String.valueOf(jA));
                builderI.f("Transfer-Encoding");
            } else {
                builderI.c("Transfer-Encoding", "chunked");
                builderI.f("Content-Length");
            }
        }
        boolean z10 = false;
        if (request.d("Host") == null) {
            builderI.c("Host", Util.U(request.getUrl(), false, 1, null));
        }
        if (request.d("Connection") == null) {
            builderI.c("Connection", "Keep-Alive");
        }
        if (request.d("Accept-Encoding") == null && request.d("Range") == null) {
            builderI.c("Accept-Encoding", "gzip");
            z10 = true;
        }
        List listB = this.cookieJar.b(request.getUrl());
        if (!listB.isEmpty()) {
            builderI.c("Cookie", b(listB));
        }
        if (request.d("User-Agent") == null) {
            builderI.c("User-Agent", "okhttp/4.12.0");
        }
        Response responseB = chain.b(builderI.b());
        HttpHeaders.f(this.cookieJar, request.getUrl(), responseB.getHeaders());
        Response.Builder builderR = responseB.Y().r(request);
        if (z10 && t.C("gzip", Response.C(responseB, "Content-Encoding", null, 2, null), true) && HttpHeaders.b(responseB) && (body = responseB.getBody()) != null) {
            m mVar = new m(body.getSource());
            builderR.k(responseB.getHeaders().g().i("Content-Encoding").i("Content-Length").f());
            builderR.b(new RealResponseBody(Response.C(responseB, "Content-Type", null, 2, null), -1L, p.d(mVar)));
        }
        return builderR.c();
    }
}
