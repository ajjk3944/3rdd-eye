package okhttp3.internal.http1;

import ej.C5481e;
import ej.E;
import ej.InterfaceC5474B;
import ej.InterfaceC5476D;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import ej.l;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import org.snmp4j.mp.MPv3;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 #2\u00020\u0001:\u0007QRSTUVWB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001dH\u0016¢\u0006\u0004\b/\u0010&J\u000f\u00100\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u0010&J\u001d\u00105\u001a\u00020\u001d2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0019\u0010:\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b<\u0010=R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010>R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010CR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010HR\u0018\u0010K\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010JR\u0018\u0010N\u001a\u000207*\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010N\u001a\u000207*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006X"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lej/g;", "source", "Lej/f;", "sink", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lej/g;Lej/f;)V", "Lej/B;", SnmpConfigurator.O_SECURITY_NAME, "()Lej/B;", "x", "", "length", "Lej/D;", "w", "(J)Lej/D;", "Lokhttp3/HttpUrl;", "url", SnmpConfigurator.O_VERSION, "(Lokhttp3/HttpUrl;)Lej/D;", SnmpConfigurator.O_PRIV_PROTOCOL, "()Lej/D;", "Lej/l;", "timeout", "LYg/J;", SnmpConfigurator.O_RETRIES, "(Lej/l;)V", "Lokhttp3/Request;", "request", "contentLength", "h", "(Lokhttp3/Request;J)Lej/B;", "cancel", "()V", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/Request;)V", "Lokhttp3/Response;", "response", "g", "(Lokhttp3/Response;)J", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/Response;)Lej/D;", "f", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/Headers;", "headers", "", "requestLine", SnmpConfigurator.O_AUTH_PASSPHRASE, "(Lokhttp3/Headers;Ljava/lang/String;)V", "", "expectContinue", "Lokhttp3/Response$Builder;", "d", "(Z)Lokhttp3/Response$Builder;", "z", "(Lokhttp3/Response;)V", "Lokhttp3/OkHttpClient;", "Lokhttp3/internal/connection/RealConnection;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Lokhttp3/internal/connection/RealConnection;", "Lej/g;", "Lej/f;", "", "I", "state", "Lokhttp3/internal/http1/HeadersReader;", "Lokhttp3/internal/http1/HeadersReader;", "headersReader", "Lokhttp3/Headers;", "trailers", SnmpConfigurator.O_TIMEOUT, "(Lokhttp3/Response;)Z", "isChunked", "s", "(Lokhttp3/Request;)Z", "AbstractSource", "ChunkedSink", "ChunkedSource", "Companion", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OkHttpClient client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RealConnection connection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5483g source;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5482f sink;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final HeadersReader headersReader;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Headers trailers;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lej/D;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Lej/E;", SnmpConfigurator.O_COMMUNITY, "()Lej/E;", "Lej/e;", "sink", "", "byteCount", "U", "(Lej/e;J)J", "LYg/J;", "g", "()V", "Lej/l;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lej/l;", "getTimeout", "()Lej/l;", "timeout", "", SnmpConfigurator.O_BIND_ADDRESS, "Z", "()Z", "h", "(Z)V", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private abstract class AbstractSource implements InterfaceC5476D {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final l timeout;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public AbstractSource() {
            this.timeout = new l(Http1ExchangeCodec.this.source.getTimeout());
        }

        @Override // ej.InterfaceC5476D
        public long U(C5481e sink, long byteCount) throws IOException {
            AbstractC6492s.i(sink, "sink");
            try {
                return Http1ExchangeCodec.this.source.U(sink, byteCount);
            } catch (IOException e10) {
                Http1ExchangeCodec.this.getConnection().A();
                g();
                throw e10;
            }
        }

        /* renamed from: a, reason: from getter */
        protected final boolean getClosed() {
            return this.closed;
        }

        @Override // ej.InterfaceC5476D
        /* renamed from: c */
        public E getTimeout() {
            return this.timeout;
        }

        public final void g() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state == 5) {
                Http1ExchangeCodec.this.r(this.timeout);
                Http1ExchangeCodec.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
            }
        }

        protected final void h(boolean z10) {
            this.closed = z10;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lej/B;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Lej/E;", SnmpConfigurator.O_COMMUNITY, "()Lej/E;", "Lej/e;", "source", "", "byteCount", "LYg/J;", "Z", "(Lej/e;J)V", "flush", "()V", "close", "Lej/l;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lej/l;", "timeout", "", SnmpConfigurator.O_BIND_ADDRESS, "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class ChunkedSink implements InterfaceC5474B {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final l timeout;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public ChunkedSink() {
            this.timeout = new l(Http1ExchangeCodec.this.sink.c());
        }

        @Override // ej.InterfaceC5474B
        public void Z(C5481e source, long byteCount) {
            AbstractC6492s.i(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (byteCount == 0) {
                return;
            }
            Http1ExchangeCodec.this.sink.K(byteCount);
            Http1ExchangeCodec.this.sink.F("\r\n");
            Http1ExchangeCodec.this.sink.Z(source, byteCount);
            Http1ExchangeCodec.this.sink.F("\r\n");
        }

        @Override // ej.InterfaceC5474B
        public E c() {
            return this.timeout;
        }

        @Override // ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.F("0\r\n\r\n");
            Http1ExchangeCodec.this.r(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // ej.InterfaceC5474B, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "url", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "LYg/J;", "j", "()V", "Lej/e;", "sink", "", "byteCount", "U", "(Lej/e;J)J", "close", "d", "Lokhttp3/HttpUrl;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "J", "bytesRemainingInChunk", "", "f", "Z", "hasMoreChunks", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class ChunkedSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final HttpUrl url;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long bytesRemainingInChunk;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean hasMoreChunks;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Http1ExchangeCodec f56505g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super();
            AbstractC6492s.i(url, "url");
            this.f56505g = http1ExchangeCodec;
            this.url = url;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void j() throws ProtocolException {
            if (this.bytesRemainingInChunk != -1) {
                this.f56505g.source.Q();
            }
            try {
                this.bytesRemainingInChunk = this.f56505g.source.k0();
                String string = t.q1(this.f56505g.source.Q()).toString();
                if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !t.P(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.f56505g;
                    http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.a();
                    OkHttpClient okHttpClient = this.f56505g.client;
                    AbstractC6492s.f(okHttpClient);
                    CookieJar cookieJar = okHttpClient.getCookieJar();
                    HttpUrl httpUrl = this.url;
                    Headers headers = this.f56505g.trailers;
                    AbstractC6492s.f(headers);
                    HttpHeaders.f(cookieJar, httpUrl, headers);
                    g();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, ej.InterfaceC5476D
        public long U(C5481e sink, long byteCount) throws IOException {
            AbstractC6492s.i(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j10 = this.bytesRemainingInChunk;
            if (j10 == 0 || j10 == -1) {
                j();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long jU = super.U(sink, Math.min(byteCount, this.bytesRemainingInChunk));
            if (jU != -1) {
                this.bytesRemainingInChunk -= jU;
                return jU;
            }
            this.f56505g.getConnection().A();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            g();
            throw protocolException;
        }

        @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f56505g.getConnection().A();
                g();
            }
            h(true);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "", "bytesRemaining", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;J)V", "Lej/e;", "sink", "byteCount", "U", "(Lej/e;J)J", "LYg/J;", "close", "()V", "d", "J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class FixedLengthSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long bytesRemaining;

        public FixedLengthSource(long j10) {
            super();
            this.bytesRemaining = j10;
            if (j10 == 0) {
                g();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, ej.InterfaceC5476D
        public long U(C5481e sink, long byteCount) throws IOException {
            AbstractC6492s.i(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.bytesRemaining;
            if (j10 == 0) {
                return -1L;
            }
            long jU = super.U(sink, Math.min(j10, byteCount));
            if (jU == -1) {
                Http1ExchangeCodec.this.getConnection().A();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                g();
                throw protocolException;
            }
            long j11 = this.bytesRemaining - jU;
            this.bytesRemaining = j11;
            if (j11 == 0) {
                g();
            }
            return jU;
        }

        @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.s(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().A();
                g();
            }
            h(true);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lej/B;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Lej/E;", SnmpConfigurator.O_COMMUNITY, "()Lej/E;", "Lej/e;", "source", "", "byteCount", "LYg/J;", "Z", "(Lej/e;J)V", "flush", "()V", "close", "Lej/l;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lej/l;", "timeout", "", SnmpConfigurator.O_BIND_ADDRESS, "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class KnownLengthSink implements InterfaceC5474B {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final l timeout;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public KnownLengthSink() {
            this.timeout = new l(Http1ExchangeCodec.this.sink.c());
        }

        @Override // ej.InterfaceC5474B
        public void Z(C5481e source, long byteCount) {
            AbstractC6492s.i(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Util.l(source.D0(), 0L, byteCount);
            Http1ExchangeCodec.this.sink.Z(source, byteCount);
        }

        @Override // ej.InterfaceC5474B
        public E c() {
            return this.timeout;
        }

        @Override // ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.r(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // ej.InterfaceC5474B, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Lej/e;", "sink", "", "byteCount", "U", "(Lej/e;J)J", "LYg/J;", "close", "()V", "", "d", "Z", "inputExhausted", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class UnknownLengthSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, ej.InterfaceC5476D
        public long U(C5481e sink, long byteCount) throws IOException {
            AbstractC6492s.i(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long jU = super.U(sink, byteCount);
            if (jU != -1) {
                return jU;
            }
            this.inputExhausted = true;
            g();
            return -1L;
        }

        @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                g();
            }
            h(true);
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection connection, InterfaceC5483g source, InterfaceC5482f sink) {
        AbstractC6492s.i(connection, "connection");
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(sink, "sink");
        this.client = okHttpClient;
        this.connection = connection;
        this.source = source;
        this.sink = sink;
        this.headersReader = new HeadersReader(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(l timeout) {
        E eK = timeout.k();
        timeout.l(E.f46437f);
        eK.b();
        eK.c();
    }

    private final boolean s(Request request) {
        return t.C("chunked", request.d("Transfer-Encoding"), true);
    }

    private final boolean t(Response response) {
        return t.C("chunked", Response.C(response, "Transfer-Encoding", null, 2, null), true);
    }

    private final InterfaceC5474B u() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC5476D v(HttpUrl url) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, url);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC5476D w(long length) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(length);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC5474B x() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC5476D y() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().A();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    public final void A(Headers headers, String requestLine) {
        AbstractC6492s.i(headers, "headers");
        AbstractC6492s.i(requestLine, "requestLine");
        if (this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.F(requestLine).F("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.sink.F(headers.e(i10)).F(": ").F(headers.j(i10)).F("\r\n");
        }
        this.sink.F("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void a() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void b(Request request) {
        AbstractC6492s.i(request, "request");
        RequestLine requestLine = RequestLine.f56478a;
        Proxy.Type type = getConnection().getRoute().getProxy().type();
        AbstractC6492s.h(type, "connection.route().proxy.type()");
        A(request.getHeaders(), requestLine.a(request, type));
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public InterfaceC5476D c(Response response) {
        AbstractC6492s.i(response, "response");
        if (!HttpHeaders.b(response)) {
            return w(0L);
        }
        if (t(response)) {
            return v(response.getRequest().getUrl());
        }
        long jV = Util.v(response);
        return jV != -1 ? w(jV) : y();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().e();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder d(boolean expectContinue) {
        int i10 = this.state;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            StatusLine statusLineA = StatusLine.INSTANCE.a(this.headersReader.b());
            Response.Builder builderK = new Response.Builder().p(statusLineA.protocol).g(statusLineA.code).m(statusLineA.message).k(this.headersReader.a());
            if (expectContinue && statusLineA.code == 100) {
                return null;
            }
            int i11 = statusLineA.code;
            if (i11 == 100) {
                this.state = 3;
                return builderK;
            }
            if (102 > i11 || i11 >= 200) {
                this.state = 4;
                return builderK;
            }
            this.state = 3;
            return builderK;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + getConnection().getRoute().getAddress().getUrl().r(), e10);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* renamed from: e, reason: from getter */
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void f() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long g(Response response) {
        AbstractC6492s.i(response, "response");
        if (!HttpHeaders.b(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return Util.v(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public InterfaceC5474B h(Request request, long contentLength) throws ProtocolException {
        AbstractC6492s.i(request, "request");
        if (request.getBody() != null && request.getBody().f()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return u();
        }
        if (contentLength != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final void z(Response response) {
        AbstractC6492s.i(response, "response");
        long jV = Util.v(response);
        if (jV == -1) {
            return;
        }
        InterfaceC5476D interfaceC5476DW = w(jV);
        Util.M(interfaceC5476DW, MPv3.MAX_MESSAGE_ID, TimeUnit.MILLISECONDS);
        interfaceC5476DW.close();
    }
}
