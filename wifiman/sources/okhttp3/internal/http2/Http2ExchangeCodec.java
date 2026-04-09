package okhttp3.internal.http2;

import ej.E;
import ej.InterfaceC5474B;
import ej.InterfaceC5476D;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u00013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010/R\u0016\u00102\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00101¨\u00064"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http2/Http2Connection;", "http2Connection", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V", "Lokhttp3/Request;", "request", "", "contentLength", "Lej/B;", "h", "(Lokhttp3/Request;J)Lej/B;", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/Request;)V", "f", "()V", SnmpConfigurator.O_AUTH_PROTOCOL, "", "expectContinue", "Lokhttp3/Response$Builder;", "d", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "g", "(Lokhttp3/Response;)J", "Lej/D;", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/Response;)Lej/D;", "cancel", "Lokhttp3/internal/connection/RealConnection;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/internal/http2/Http2Connection;", "Lokhttp3/internal/http2/Http2Stream;", "Lokhttp3/internal/http2/Http2Stream;", "stream", "Lokhttp3/Protocol;", "Lokhttp3/Protocol;", "protocol", "Z", "canceled", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final List f56627h = Util.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i, reason: collision with root package name */
    private static final List f56628i = Util.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final RealConnection connection;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RealInterceptorChain chain;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Http2Connection http2Connection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile Http2Stream stream;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Protocol protocol;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "", "Lokhttp3/internal/http2/Header;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Request;)Ljava/util/List;", "Lokhttp3/Headers;", "headerBlock", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Response$Builder;", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/Headers;Lokhttp3/Protocol;)Lokhttp3/Response$Builder;", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(Request request) {
            AbstractC6492s.i(request, "request");
            Headers headers = request.getHeaders();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new Header(Header.f56516g, request.getMethod()));
            arrayList.add(new Header(Header.f56517h, RequestLine.f56478a.c(request.getUrl())));
            String strD = request.d("Host");
            if (strD != null) {
                arrayList.add(new Header(Header.f56519j, strD));
            }
            arrayList.add(new Header(Header.f56518i, request.getUrl().getScheme()));
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strE = headers.e(i10);
                Locale US = Locale.US;
                AbstractC6492s.h(US, "US");
                String lowerCase = strE.toLowerCase(US);
                AbstractC6492s.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.f56627h.contains(lowerCase) || (AbstractC6492s.d(lowerCase, "te") && AbstractC6492s.d(headers.j(i10), "trailers"))) {
                    arrayList.add(new Header(lowerCase, headers.j(i10)));
                }
            }
            return arrayList;
        }

        public final Response.Builder b(Headers headerBlock, Protocol protocol) throws ProtocolException, NumberFormatException {
            AbstractC6492s.i(headerBlock, "headerBlock");
            AbstractC6492s.i(protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int size = headerBlock.size();
            StatusLine statusLineA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strE = headerBlock.e(i10);
                String strJ = headerBlock.j(i10);
                if (AbstractC6492s.d(strE, ":status")) {
                    statusLineA = StatusLine.INSTANCE.a("HTTP/1.1 " + strJ);
                } else if (!Http2ExchangeCodec.f56628i.contains(strE)) {
                    builder.d(strE, strJ);
                }
            }
            if (statusLineA != null) {
                return new Response.Builder().p(protocol).g(statusLineA.code).m(statusLineA.message).k(builder.f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient client, RealConnection connection, RealInterceptorChain chain, Http2Connection http2Connection) {
        AbstractC6492s.i(client, "client");
        AbstractC6492s.i(connection, "connection");
        AbstractC6492s.i(chain, "chain");
        AbstractC6492s.i(http2Connection, "http2Connection");
        this.connection = connection;
        this.chain = chain;
        this.http2Connection = http2Connection;
        List protocols = client.getProtocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = protocols.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void a() {
        Http2Stream http2Stream = this.stream;
        AbstractC6492s.f(http2Stream);
        http2Stream.n().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void b(Request request) throws IOException {
        AbstractC6492s.i(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.C0(INSTANCE.a(request), request.getBody() != null);
        if (this.canceled) {
            Http2Stream http2Stream = this.stream;
            AbstractC6492s.f(http2Stream);
            http2Stream.f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream2 = this.stream;
        AbstractC6492s.f(http2Stream2);
        E eV = http2Stream2.v();
        long jK = this.chain.k();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        eV.h(jK, timeUnit);
        Http2Stream http2Stream3 = this.stream;
        AbstractC6492s.f(http2Stream3);
        http2Stream3.E().h(this.chain.getWriteTimeoutMillis(), timeUnit);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public InterfaceC5476D c(Response response) {
        AbstractC6492s.i(response, "response");
        Http2Stream http2Stream = this.stream;
        AbstractC6492s.f(http2Stream);
        return http2Stream.getSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.f(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder d(boolean expectContinue) throws NumberFormatException, IOException {
        Http2Stream http2Stream = this.stream;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        Response.Builder builderB = INSTANCE.b(http2Stream.C(), this.protocol);
        if (expectContinue && builderB.getCode() == 100) {
            return null;
        }
        return builderB;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* renamed from: e, reason: from getter */
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void f() {
        this.http2Connection.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long g(Response response) {
        AbstractC6492s.i(response, "response");
        if (HttpHeaders.b(response)) {
            return Util.v(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public InterfaceC5474B h(Request request, long contentLength) {
        AbstractC6492s.i(request, "request");
        Http2Stream http2Stream = this.stream;
        AbstractC6492s.f(http2Stream);
        return http2Stream.n();
    }
}
