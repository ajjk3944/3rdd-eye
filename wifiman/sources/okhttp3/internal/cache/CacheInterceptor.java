package okhttp3.internal.cache;

import ej.C5481e;
import ej.E;
import ej.InterfaceC5474B;
import ej.InterfaceC5476D;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import ej.p;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0013B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Cache;", "cache", "<init>", "(Lokhttp3/Cache;)V", "Lokhttp3/internal/cache/CacheRequest;", "cacheRequest", "Lokhttp3/Response;", "response", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/internal/cache/CacheRequest;Lokhttp3/Response;)Lokhttp3/Response;", "Lokhttp3/Interceptor$Chain;", "chain", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CacheInterceptor implements Interceptor {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Cache cache;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "f", "(Lokhttp3/Response;)Lokhttp3/Response;", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "", "fieldName", "", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/lang/String;)Z", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers c(Headers cachedHeaders, Headers networkHeaders) {
            Headers.Builder builder = new Headers.Builder();
            int size = cachedHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strE = cachedHeaders.e(i10);
                String strJ = cachedHeaders.j(i10);
                if ((!t.C("Warning", strE, true) || !t.P(strJ, "1", false, 2, null)) && (d(strE) || !e(strE) || networkHeaders.b(strE) == null)) {
                    builder.d(strE, strJ);
                }
            }
            int size2 = networkHeaders.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strE2 = networkHeaders.e(i11);
                if (!d(strE2) && e(strE2)) {
                    builder.d(strE2, networkHeaders.j(i11));
                }
            }
            return builder.f();
        }

        private final boolean d(String fieldName) {
            return t.C("Content-Length", fieldName, true) || t.C("Content-Encoding", fieldName, true) || t.C("Content-Type", fieldName, true);
        }

        private final boolean e(String fieldName) {
            return (t.C("Connection", fieldName, true) || t.C("Keep-Alive", fieldName, true) || t.C("Proxy-Authenticate", fieldName, true) || t.C("Proxy-Authorization", fieldName, true) || t.C("TE", fieldName, true) || t.C("Trailers", fieldName, true) || t.C("Transfer-Encoding", fieldName, true) || t.C("Upgrade", fieldName, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Response f(Response response) {
            return (response != null ? response.getBody() : null) != null ? response.Y().b(null).c() : response;
        }

        private Companion() {
        }
    }

    public CacheInterceptor(Cache cache) {
        this.cache = cache;
    }

    private final Response b(final CacheRequest cacheRequest, Response response) {
        if (cacheRequest == null) {
            return response;
        }
        InterfaceC5474B body = cacheRequest.getBody();
        ResponseBody body2 = response.getBody();
        AbstractC6492s.f(body2);
        final InterfaceC5483g bodySource = body2.getBodySource();
        final InterfaceC5482f interfaceC5482fC = p.c(body);
        InterfaceC5476D interfaceC5476D = new InterfaceC5476D() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private boolean cacheRequestClosed;

            @Override // ej.InterfaceC5476D
            public long U(C5481e sink, long byteCount) throws IOException {
                AbstractC6492s.i(sink, "sink");
                try {
                    long jU = bodySource.U(sink, byteCount);
                    if (jU != -1) {
                        sink.S(interfaceC5482fC.b(), sink.D0() - jU, jU);
                        interfaceC5482fC.z();
                        return jU;
                    }
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        interfaceC5482fC.close();
                    }
                    return -1L;
                } catch (IOException e10) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.a();
                    }
                    throw e10;
                }
            }

            @Override // ej.InterfaceC5476D
            /* renamed from: c */
            public E getTimeout() {
                return bodySource.getTimeout();
            }

            @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (!this.cacheRequestClosed && !Util.s(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.a();
                }
                bodySource.close();
            }
        };
        return response.Y().b(new RealResponseBody(Response.C(response, "Content-Type", null, 2, null), response.getBody().getContentLength(), p.d(interfaceC5476D))).c();
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) throws IOException {
        EventListener eventListener;
        ResponseBody body;
        ResponseBody body2;
        AbstractC6492s.i(chain, "chain");
        Call call = chain.call();
        Cache cache = this.cache;
        Response responseG = cache != null ? cache.g(chain.getRequest()) : null;
        CacheStrategy cacheStrategyB = new CacheStrategy.Factory(System.currentTimeMillis(), chain.getRequest(), responseG).b();
        Request requestB = cacheStrategyB.getNetworkRequest();
        Response responseA = cacheStrategyB.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.J(cacheStrategyB);
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        if (realCall == null || (eventListener = realCall.getEventListener()) == null) {
            eventListener = EventListener.f56012b;
        }
        if (responseG != null && responseA == null && (body2 = responseG.getBody()) != null) {
            Util.m(body2);
        }
        if (requestB == null && responseA == null) {
            Response responseC = new Response.Builder().r(chain.getRequest()).p(Protocol.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(Util.f56218c).s(-1L).q(System.currentTimeMillis()).c();
            eventListener.A(call, responseC);
            return responseC;
        }
        if (requestB == null) {
            AbstractC6492s.f(responseA);
            Response responseC2 = responseA.Y().d(INSTANCE.f(responseA)).c();
            eventListener.b(call, responseC2);
            return responseC2;
        }
        if (responseA != null) {
            eventListener.a(call, responseA);
        } else if (this.cache != null) {
            eventListener.c(call);
        }
        try {
            Response responseB = chain.b(requestB);
            if (responseB == null && responseG != null && body != null) {
            }
            if (responseA != null) {
                if (responseB != null && responseB.getCode() == 304) {
                    Response.Builder builderY = responseA.Y();
                    Companion companion = INSTANCE;
                    Response responseC3 = builderY.k(companion.c(responseA.getHeaders(), responseB.getHeaders())).s(responseB.getSentRequestAtMillis()).q(responseB.getReceivedResponseAtMillis()).d(companion.f(responseA)).n(companion.f(responseB)).c();
                    ResponseBody body3 = responseB.getBody();
                    AbstractC6492s.f(body3);
                    body3.close();
                    Cache cache3 = this.cache;
                    AbstractC6492s.f(cache3);
                    cache3.C();
                    this.cache.P(responseA, responseC3);
                    eventListener.b(call, responseC3);
                    return responseC3;
                }
                ResponseBody body4 = responseA.getBody();
                if (body4 != null) {
                    Util.m(body4);
                }
            }
            AbstractC6492s.f(responseB);
            Response.Builder builderY2 = responseB.Y();
            Companion companion2 = INSTANCE;
            Response responseC4 = builderY2.d(companion2.f(responseA)).n(companion2.f(responseB)).c();
            if (this.cache != null) {
                if (HttpHeaders.b(responseC4) && CacheStrategy.INSTANCE.a(responseC4, requestB)) {
                    Response responseB2 = b(this.cache.p(responseC4), responseC4);
                    if (responseA != null) {
                        eventListener.c(call);
                    }
                    return responseB2;
                }
                if (HttpMethod.f56465a.a(requestB.getMethod())) {
                    try {
                        this.cache.s(requestB);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseC4;
        } finally {
            if (responseG != null && (body = responseG.getBody()) != null) {
                Util.m(body);
            }
        }
    }
}
