package okhttp3.logging;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001UB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001d\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u000eJ!\u0010'\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J1\u0010+\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J9\u0010/\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b6\u0010\u000eJ\u001f\u00109\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b;\u0010\u000eJ\u001f\u0010>\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bB\u0010\u000eJ\u001f\u0010E\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bG\u0010\u000eJ\u001f\u0010H\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\bH\u0010?J\u001f\u0010I\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bI\u0010AJ\u0017\u0010J\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bJ\u0010\u000eJ\u001f\u0010K\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bK\u0010AJ\u0017\u0010L\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bL\u0010\u000eJ\u001f\u0010M\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bM\u0010FJ\u001f\u0010N\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bN\u0010FJ\u0017\u0010O\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bO\u0010\u000eJ\u001f\u0010Q\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020CH\u0016¢\u0006\u0004\bQ\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010RR\u0016\u0010T\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010S¨\u0006V"}, d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "", "message", "LYg/J;", "D", "(Ljava/lang/String;)V", "Lokhttp3/Call;", "call", "f", "(Lokhttp3/Call;)V", "Lokhttp3/HttpUrl;", "url", "p", "(Lokhttp3/Call;Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "proxies", SnmpConfigurator.O_OPERATION, "(Lokhttp3/Call;Lokhttp3/HttpUrl;Ljava/util/List;)V", "domainName", SnmpConfigurator.O_CONTEXT_NAME, "(Lokhttp3/Call;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "m", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "C", "Lokhttp3/Handshake;", "handshake", "B", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "Lokhttp3/Protocol;", "protocol", "h", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "i", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connection", "k", "(Lokhttp3/Call;Lokhttp3/Connection;)V", "l", SnmpConfigurator.O_SECURITY_NAME, "Lokhttp3/Request;", "request", SnmpConfigurator.O_TIMEOUT, "(Lokhttp3/Call;Lokhttp3/Request;)V", SnmpConfigurator.O_RETRIES, "", "byteCount", "q", "(Lokhttp3/Call;J)V", "s", "(Lokhttp3/Call;Ljava/io/IOException;)V", "z", "Lokhttp3/Response;", "response", SnmpConfigurator.O_PRIV_PROTOCOL, "(Lokhttp3/Call;Lokhttp3/Response;)V", "w", SnmpConfigurator.O_VERSION, "x", "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "g", SnmpConfigurator.O_AUTH_PASSPHRASE, SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "cachedResponse", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "J", "startNs", "Factory", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoggingEventListener extends EventListener {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final HttpLoggingInterceptor.Logger logger;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long startNs;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Call;)Lokhttp3/EventListener;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Factory implements EventListener.Factory {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HttpLoggingInterceptor.Logger logger;

        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // okhttp3.EventListener.Factory
        public EventListener a(Call call) {
            AbstractC6492s.i(call, "call");
            return new LoggingEventListener(this.logger, null);
        }

        public Factory(HttpLoggingInterceptor.Logger logger) {
            AbstractC6492s.i(logger, "logger");
            this.logger = logger;
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? HttpLoggingInterceptor.Logger.f56864b : logger);
        }
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger);
    }

    private final void D(String message) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        this.logger.a('[' + millis + " ms] " + message);
    }

    @Override // okhttp3.EventListener
    public void A(Call call, Response response) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(response, "response");
        D("satisfactionFailure: " + response);
    }

    @Override // okhttp3.EventListener
    public void B(Call call, Handshake handshake) {
        AbstractC6492s.i(call, "call");
        D("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public void C(Call call) {
        AbstractC6492s.i(call, "call");
        D("secureConnectStart");
    }

    @Override // okhttp3.EventListener
    public void a(Call call, Response cachedResponse) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(cachedResponse, "cachedResponse");
        D("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.EventListener
    public void b(Call call, Response response) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(response, "response");
        D("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public void c(Call call) {
        AbstractC6492s.i(call, "call");
        D("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public void d(Call call) {
        AbstractC6492s.i(call, "call");
        D("callEnd");
    }

    @Override // okhttp3.EventListener
    public void e(Call call, IOException ioe) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(ioe, "ioe");
        D("callFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void f(Call call) {
        AbstractC6492s.i(call, "call");
        this.startNs = System.nanoTime();
        D("callStart: " + call.getOriginalRequest());
    }

    @Override // okhttp3.EventListener
    public void g(Call call) {
        AbstractC6492s.i(call, "call");
        D("canceled");
    }

    @Override // okhttp3.EventListener
    public void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(inetSocketAddress, "inetSocketAddress");
        AbstractC6492s.i(proxy, "proxy");
        D("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(inetSocketAddress, "inetSocketAddress");
        AbstractC6492s.i(proxy, "proxy");
        AbstractC6492s.i(ioe, "ioe");
        D("connectFailed: " + protocol + ' ' + ioe);
    }

    @Override // okhttp3.EventListener
    public void j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(inetSocketAddress, "inetSocketAddress");
        AbstractC6492s.i(proxy, "proxy");
        D("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public void k(Call call, Connection connection) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(connection, "connection");
        D("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public void l(Call call, Connection connection) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(connection, "connection");
        D("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void m(Call call, String domainName, List inetAddressList) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(domainName, "domainName");
        AbstractC6492s.i(inetAddressList, "inetAddressList");
        D("dnsEnd: " + inetAddressList);
    }

    @Override // okhttp3.EventListener
    public void n(Call call, String domainName) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(domainName, "domainName");
        D("dnsStart: " + domainName);
    }

    @Override // okhttp3.EventListener
    public void o(Call call, HttpUrl url, List proxies) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(url, "url");
        AbstractC6492s.i(proxies, "proxies");
        D("proxySelectEnd: " + proxies);
    }

    @Override // okhttp3.EventListener
    public void p(Call call, HttpUrl url) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(url, "url");
        D("proxySelectStart: " + url);
    }

    @Override // okhttp3.EventListener
    public void q(Call call, long byteCount) {
        AbstractC6492s.i(call, "call");
        D("requestBodyEnd: byteCount=" + byteCount);
    }

    @Override // okhttp3.EventListener
    public void r(Call call) {
        AbstractC6492s.i(call, "call");
        D("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void s(Call call, IOException ioe) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(ioe, "ioe");
        D("requestFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void t(Call call, Request request) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(request, "request");
        D("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public void u(Call call) {
        AbstractC6492s.i(call, "call");
        D("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void v(Call call, long byteCount) {
        AbstractC6492s.i(call, "call");
        D("responseBodyEnd: byteCount=" + byteCount);
    }

    @Override // okhttp3.EventListener
    public void w(Call call) {
        AbstractC6492s.i(call, "call");
        D("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void x(Call call, IOException ioe) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(ioe, "ioe");
        D("responseFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void y(Call call, Response response) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(response, "response");
        D("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public void z(Call call) {
        AbstractC6492s.i(call, "call");
        D("responseHeadersStart");
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }
}
