package okhttp3.internal.connection;

import ej.C5481e;
import ej.InterfaceC5474B;
import ej.InterfaceC5476D;
import ej.j;
import ej.k;
import ej.p;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002OPB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000e¢\u0006\u0004\b+\u0010\u001bJ\r\u0010,\u001a\u00020\u000e¢\u0006\u0004\b,\u0010\u001bJ\r\u0010-\u001a\u00020\u000e¢\u0006\u0004\b-\u0010\u001bJ\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b.\u0010\u001bJ9\u00104\u001a\u00028\u0000\"\n\b\u0000\u0010/*\u0004\u0018\u00010\f2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00152\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u000e¢\u0006\u0004\b6\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010@R$\u0010E\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010DR$\u0010G\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001a\u0010B\u001a\u0004\bF\u0010DR\u001a\u0010L\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010D¨\u0006Q"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/internal/connection/ExchangeFinder;", "finder", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "Ljava/io/IOException;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "LYg/J;", SnmpConfigurator.O_SECURITY_NAME, "(Ljava/io/IOException;)V", "Lokhttp3/Request;", "request", "w", "(Lokhttp3/Request;)V", "", "duplex", "Lej/B;", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/Request;Z)Lej/B;", "f", "()V", SnmpConfigurator.O_TIMEOUT, "expectContinue", "Lokhttp3/Response$Builder;", SnmpConfigurator.O_RETRIES, "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "s", "(Lokhttp3/Response;)V", "Lokhttp3/ResponseBody;", "q", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", SnmpConfigurator.O_CONTEXT_NAME, "()Lokhttp3/internal/ws/RealWebSocket$Streams;", SnmpConfigurator.O_VERSION, SnmpConfigurator.O_OPERATION, SnmpConfigurator.O_BIND_ADDRESS, "d", SnmpConfigurator.O_CONTEXT_ENGINE_ID, "", "bytesRead", "responseDone", "requestDone", SnmpConfigurator.O_AUTH_PROTOCOL, "(JZZLjava/io/IOException;)Ljava/io/IOException;", "p", "Lokhttp3/internal/connection/RealCall;", "g", "()Lokhttp3/internal/connection/RealCall;", "Lokhttp3/EventListener;", "i", "()Lokhttp3/EventListener;", "Lokhttp3/internal/connection/ExchangeFinder;", "j", "()Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/http/ExchangeCodec;", "<set-?>", "Z", "m", "()Z", "isDuplex", "k", "hasFailure", "Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/connection/RealConnection;", "h", "()Lokhttp3/internal/connection/RealConnection;", "connection", "l", "isCoalescedConnection", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Exchange {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final RealCall call;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EventListener eventListener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ExchangeFinder finder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ExchangeCodec codec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDuplex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasFailure;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final RealConnection connection;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u0000\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lej/j;", "Lej/B;", "delegate", "", "contentLength", "<init>", "(Lokhttp3/internal/connection/Exchange;Lej/B;J)V", "Ljava/io/IOException;", SnmpConfigurator.O_CONTEXT_ENGINE_ID, SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/io/IOException;)Ljava/io/IOException;", "Lej/e;", "source", "byteCount", "LYg/J;", "Z", "(Lej/e;J)V", "flush", "()V", "close", SnmpConfigurator.O_BIND_ADDRESS, "J", "", SnmpConfigurator.O_COMMUNITY, "completed", "d", "bytesReceived", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class RequestBodySink extends j {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Exchange f56372f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, InterfaceC5474B delegate, long j10) {
            super(delegate);
            AbstractC6492s.i(delegate, "delegate");
            this.f56372f = exchange;
            this.contentLength = j10;
        }

        private final IOException a(IOException e10) {
            if (this.completed) {
                return e10;
            }
            this.completed = true;
            return this.f56372f.a(this.bytesReceived, false, true, e10);
        }

        @Override // ej.j, ej.InterfaceC5474B
        public void Z(C5481e source, long byteCount) throws IOException {
            AbstractC6492s.i(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.contentLength;
            if (j10 == -1 || this.bytesReceived + byteCount <= j10) {
                try {
                    super.Z(source, byteCount);
                    this.bytesReceived += byteCount;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
        }

        @Override // ej.j, ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j10 = this.contentLength;
            if (j10 != -1 && this.bytesReceived != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // ej.j, ej.InterfaceC5474B, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lej/k;", "Lej/D;", "delegate", "", "contentLength", "<init>", "(Lokhttp3/internal/connection/Exchange;Lej/D;J)V", "Lej/e;", "sink", "byteCount", "U", "(Lej/e;J)J", "LYg/J;", "close", "()V", "Ljava/io/IOException;", SnmpConfigurator.O_CONTEXT_ENGINE_ID, SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "g", "(Ljava/io/IOException;)Ljava/io/IOException;", SnmpConfigurator.O_BIND_ADDRESS, "J", SnmpConfigurator.O_COMMUNITY, "bytesReceived", "", "d", "Z", "invokeStartEvent", "completed", "f", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ResponseBodySource extends k {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean invokeStartEvent;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Exchange f56378g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, InterfaceC5476D delegate, long j10) {
            super(delegate);
            AbstractC6492s.i(delegate, "delegate");
            this.f56378g = exchange;
            this.contentLength = j10;
            this.invokeStartEvent = true;
            if (j10 == 0) {
                g(null);
            }
        }

        @Override // ej.k, ej.InterfaceC5476D
        public long U(C5481e sink, long byteCount) throws IOException {
            AbstractC6492s.i(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            try {
                long jU = a().U(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.f56378g.getEventListener().w(this.f56378g.getCall());
                }
                if (jU == -1) {
                    g(null);
                    return -1L;
                }
                long j10 = this.bytesReceived + jU;
                long j11 = this.contentLength;
                if (j11 != -1 && j10 > j11) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j10);
                }
                this.bytesReceived = j10;
                if (j10 == j11) {
                    g(null);
                }
                return jU;
            } catch (IOException e10) {
                throw g(e10);
            }
        }

        @Override // ej.k, ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                g(null);
            } catch (IOException e10) {
                throw g(e10);
            }
        }

        public final IOException g(IOException e10) {
            if (this.completed) {
                return e10;
            }
            this.completed = true;
            if (e10 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.f56378g.getEventListener().w(this.f56378g.getCall());
            }
            return this.f56378g.a(this.bytesReceived, true, false, e10);
        }
    }

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec codec) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(eventListener, "eventListener");
        AbstractC6492s.i(finder, "finder");
        AbstractC6492s.i(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
        this.connection = codec.getConnection();
    }

    private final void u(IOException e10) {
        this.hasFailure = true;
        this.finder.h(e10);
        this.codec.getConnection().I(this.call, e10);
    }

    public final IOException a(long bytesRead, boolean responseDone, boolean requestDone, IOException e10) {
        if (e10 != null) {
            u(e10);
        }
        if (requestDone) {
            if (e10 != null) {
                this.eventListener.s(this.call, e10);
            } else {
                this.eventListener.q(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e10 != null) {
                this.eventListener.x(this.call, e10);
            } else {
                this.eventListener.v(this.call, bytesRead);
            }
        }
        return this.call.w(this, requestDone, responseDone, e10);
    }

    public final void b() {
        this.codec.cancel();
    }

    public final InterfaceC5474B c(Request request, boolean duplex) {
        AbstractC6492s.i(request, "request");
        this.isDuplex = duplex;
        RequestBody body = request.getBody();
        AbstractC6492s.f(body);
        long jA = body.a();
        this.eventListener.r(this.call);
        return new RequestBodySink(this, this.codec.h(request, jA), jA);
    }

    public final void d() {
        this.codec.cancel();
        this.call.w(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.codec.a();
        } catch (IOException e10) {
            this.eventListener.s(this.call, e10);
            u(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.codec.f();
        } catch (IOException e10) {
            this.eventListener.s(this.call, e10);
            u(e10);
            throw e10;
        }
    }

    /* renamed from: g, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    /* renamed from: h, reason: from getter */
    public final RealConnection getConnection() {
        return this.connection;
    }

    /* renamed from: i, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    /* renamed from: j, reason: from getter */
    public final ExchangeFinder getFinder() {
        return this.finder;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final boolean l() {
        return !AbstractC6492s.d(this.finder.getAddress().getUrl().getHost(), this.connection.getRoute().getAddress().getUrl().getHost());
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    public final RealWebSocket.Streams n() {
        this.call.E();
        return this.codec.getConnection().y(this);
    }

    public final void o() {
        this.codec.getConnection().A();
    }

    public final void p() {
        this.call.w(this, true, false, null);
    }

    public final ResponseBody q(Response response) throws IOException {
        AbstractC6492s.i(response, "response");
        try {
            String strC = Response.C(response, "Content-Type", null, 2, null);
            long jG = this.codec.g(response);
            return new RealResponseBody(strC, jG, p.d(new ResponseBodySource(this, this.codec.c(response), jG)));
        } catch (IOException e10) {
            this.eventListener.x(this.call, e10);
            u(e10);
            throw e10;
        }
    }

    public final Response.Builder r(boolean expectContinue) throws IOException {
        try {
            Response.Builder builderD = this.codec.d(expectContinue);
            if (builderD != null) {
                builderD.l(this);
            }
            return builderD;
        } catch (IOException e10) {
            this.eventListener.x(this.call, e10);
            u(e10);
            throw e10;
        }
    }

    public final void s(Response response) {
        AbstractC6492s.i(response, "response");
        this.eventListener.y(this.call, response);
    }

    public final void t() {
        this.eventListener.z(this.call);
    }

    public final void v() {
        a(-1L, true, true, null);
    }

    public final void w(Request request) throws IOException {
        AbstractC6492s.i(request, "request");
        try {
            this.eventListener.u(this.call);
            this.codec.b(request);
            this.eventListener.t(this.call, request);
        } catch (IOException e10) {
            this.eventListener.s(this.call, e10);
            u(e10);
            throw e10;
        }
    }
}
