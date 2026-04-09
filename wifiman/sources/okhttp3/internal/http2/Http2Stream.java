package okhttp3.internal.http2;

import Yg.J;
import ej.C5479c;
import ej.C5481e;
import ej.E;
import ej.InterfaceC5474B;
import ej.InterfaceC5476D;
import ej.InterfaceC5483g;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.Headers;
import okhttp3.internal.Util;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 T2\u00020\u0001:\u0004jklmB3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020\u001dH\u0000¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0000¢\u0006\u0004\b0\u0010+J\u000f\u00101\u001a\u00020\u001dH\u0000¢\u0006\u0004\b1\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b6\u00107R*\u0010=\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010/R*\u0010@\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b>\u0010;\"\u0004\b?\u0010/R*\u0010C\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00109\u001a\u0004\bA\u0010;\"\u0004\bB\u0010/R*\u0010F\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00109\u001a\u0004\bD\u0010;\"\u0004\bE\u0010/R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010HR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010#\u001a\u00060MR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010V\u001a\u00060RR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010S\u001a\u0004\bT\u0010UR\u001e\u0010[\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010X\u001a\u0004\bY\u0010ZR\u001e\u0010]\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010X\u001a\u0004\b\\\u0010ZR$\u0010\u000e\u001a\u0004\u0018\u00010\r8@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010^\u001a\u0004\bJ\u0010_\"\u0004\b`\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010a\u001a\u0004\bN\u0010b\"\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010i\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010f¨\u0006n"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "", "id", "Lokhttp3/internal/http2/Http2Connection;", "connection", "", "outFinished", "inFinished", "Lokhttp3/Headers;", "headers", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "Ljava/io/IOException;", "errorException", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)Z", "C", "()Lokhttp3/Headers;", "Lej/E;", SnmpConfigurator.O_VERSION, "()Lej/E;", SnmpConfigurator.O_CONTEXT_ENGINE_ID, "Lej/B;", SnmpConfigurator.O_CONTEXT_NAME, "()Lej/B;", "rstStatusCode", "LYg/J;", "d", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "f", "(Lokhttp3/internal/http2/ErrorCode;)V", "Lej/g;", "source", "length", "w", "(Lej/g;I)V", "x", "(Lokhttp3/Headers;Z)V", SnmpConfigurator.O_PRIV_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "()V", "", "delta", SnmpConfigurator.O_AUTH_PROTOCOL, "(J)V", SnmpConfigurator.O_COMMUNITY, "D", "I", "j", "()I", "Lokhttp3/internal/http2/Http2Connection;", "g", "()Lokhttp3/internal/http2/Http2Connection;", "<set-?>", "J", "l", "()J", SnmpConfigurator.O_AUTH_PASSPHRASE, "readBytesTotal", "k", "z", "readBytesAcknowledged", SnmpConfigurator.O_RETRIES, "B", "writeBytesTotal", "q", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "h", "Z", "hasResponseHeaders", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "i", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "p", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", SnmpConfigurator.O_OPERATION, "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "m", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "readTimeout", "s", "writeTimeout", "Lokhttp3/internal/http2/ErrorCode;", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "Ljava/io/IOException;", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", SnmpConfigurator.O_SECURITY_NAME, "()Z", "isOpen", SnmpConfigurator.O_TIMEOUT, "isLocallyInitiated", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Http2Stream {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Http2Connection connection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long readBytesTotal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long readBytesAcknowledged;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long writeBytesTotal;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long writeBytesMaximum;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque headersQueue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean hasResponseHeaders;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final FramingSource source;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final FramingSink sink;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final StreamTimeout readTimeout;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final StreamTimeout writeTimeout;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private ErrorCode errorCode;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private IOException errorException;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\tR\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000e\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\t¨\u0006'"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lej/B;", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "outFinishedOnLastFrame", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Z)V", "Lej/e;", "source", "", "byteCount", "Z", "(Lej/e;J)V", "flush", "()V", "Lej/E;", SnmpConfigurator.O_COMMUNITY, "()Lej/E;", "close", "h", "()Z", "setFinished", SnmpConfigurator.O_BIND_ADDRESS, "Lej/e;", "sendBuffer", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "trailers", "d", "g", "setClosed", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FramingSink implements InterfaceC5474B {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C5481e sendBuffer = new C5481e();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Headers trailers;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public FramingSink(boolean z10) {
            this.finished = z10;
        }

        private final void a(boolean outFinishedOnLastFrame) throws IOException {
            long jMin;
            boolean z10;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                try {
                    http2Stream.getWriteTimeout().x();
                    while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.h() == null) {
                        try {
                            http2Stream.D();
                        } finally {
                            http2Stream.getWriteTimeout().E();
                        }
                    }
                    http2Stream.getWriteTimeout().E();
                    http2Stream.c();
                    jMin = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.D0());
                    http2Stream.B(http2Stream.getWriteBytesTotal() + jMin);
                    z10 = outFinishedOnLastFrame && jMin == this.sendBuffer.D0();
                    J j10 = J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Http2Stream.this.getWriteTimeout().x();
            try {
                Http2Stream.this.getConnection().Q0(Http2Stream.this.getId(), z10, this.sendBuffer, jMin);
            } finally {
                http2Stream = Http2Stream.this;
            }
        }

        @Override // ej.InterfaceC5474B
        public void Z(C5481e source, long byteCount) throws IOException {
            AbstractC6492s.i(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.f56223h || !Thread.holdsLock(http2Stream)) {
                this.sendBuffer.Z(source, byteCount);
                while (this.sendBuffer.D0() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
        }

        @Override // ej.InterfaceC5474B
        public E c() {
            return Http2Stream.this.getWriteTimeout();
        }

        @Override // ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.f56223h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                boolean z10 = http2Stream2.h() == null;
                J j10 = J.f24997a;
                if (!Http2Stream.this.getSink().finished) {
                    boolean z11 = this.sendBuffer.D0() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.D0() > 0) {
                            a(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id2 = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        AbstractC6492s.f(headers);
                        connection.R0(id2, z10, Util.P(headers));
                    } else if (z11) {
                        while (this.sendBuffer.D0() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        Http2Stream.this.getConnection().Q0(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                    J j11 = J.f24997a;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.b();
            }
        }

        @Override // ej.InterfaceC5474B, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.f56223h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.c();
                J j10 = J.f24997a;
            }
            while (this.sendBuffer.D0() > 0) {
                a(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        /* renamed from: g, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010(\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00103\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001d\u001a\u0004\b\u001a\u0010\u001f\"\u0004\b2\u0010!¨\u00064"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lej/D;", "", "maxByteCount", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "read", "LYg/J;", "s", "(J)V", "Lej/e;", "sink", "byteCount", "U", "(Lej/e;J)J", "Lej/g;", "source", "h", "(Lej/g;J)V", "Lej/E;", SnmpConfigurator.O_COMMUNITY, "()Lej/E;", "close", "()V", SnmpConfigurator.O_AUTH_PROTOCOL, "J", SnmpConfigurator.O_BIND_ADDRESS, "Z", "g", "()Z", "j", "(Z)V", "Lej/e;", "getReceiveBuffer", "()Lej/e;", "receiveBuffer", "d", "getReadBuffer", "readBuffer", "Lokhttp3/Headers;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "p", "(Lokhttp3/Headers;)V", "trailers", "f", "setClosed$okhttp", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FramingSource implements InterfaceC5476D {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long maxByteCount;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final C5481e receiveBuffer = new C5481e();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final C5481e readBuffer = new C5481e();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Headers trailers;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public FramingSource(long j10, boolean z10) {
            this.maxByteCount = j10;
            this.finished = z10;
        }

        private final void s(long read) {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.f56223h || !Thread.holdsLock(http2Stream)) {
                Http2Stream.this.getConnection().P0(read);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        @Override // ej.InterfaceC5476D
        public long U(C5481e sink, long byteCount) throws IOException {
            IOException errorException;
            boolean z10;
            long jU;
            AbstractC6492s.i(sink, "sink");
            long j10 = 0;
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.getReadTimeout().x();
                    try {
                        if (http2Stream.h() == null || this.finished) {
                            errorException = null;
                        } else {
                            errorException = http2Stream.getErrorException();
                            if (errorException == null) {
                                ErrorCode errorCodeH = http2Stream.h();
                                AbstractC6492s.f(errorCodeH);
                                errorException = new StreamResetException(errorCodeH);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.readBuffer.D0() > j10) {
                            C5481e c5481e = this.readBuffer;
                            jU = c5481e.U(sink, Math.min(byteCount, c5481e.D0()));
                            http2Stream.A(http2Stream.getReadBytesTotal() + jU);
                            long readBytesTotal = http2Stream.getReadBytesTotal() - http2Stream.getReadBytesAcknowledged();
                            if (errorException == null && readBytesTotal >= http2Stream.getConnection().getOkHttpSettings().c() / 2) {
                                http2Stream.getConnection().V0(http2Stream.getId(), readBytesTotal);
                                http2Stream.z(http2Stream.getReadBytesTotal());
                            }
                        } else {
                            if (!this.finished && errorException == null) {
                                http2Stream.D();
                                z10 = true;
                            }
                            jU = -1;
                        }
                        http2Stream.getReadTimeout().E();
                        J j11 = J.f24997a;
                    } finally {
                    }
                }
                if (!z10) {
                    if (jU != -1) {
                        return jU;
                    }
                    if (errorException == null) {
                        return -1L;
                    }
                    throw errorException;
                }
                j10 = 0;
            }
        }

        /* renamed from: a, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        @Override // ej.InterfaceC5476D
        /* renamed from: c */
        public E getTimeout() {
            return Http2Stream.this.getReadTimeout();
        }

        @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long jD0;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                jD0 = this.readBuffer.D0();
                this.readBuffer.clear();
                AbstractC6492s.g(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
                J j10 = J.f24997a;
            }
            if (jD0 > 0) {
                s(jD0);
            }
            Http2Stream.this.b();
        }

        /* renamed from: g, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        public final void h(InterfaceC5483g source, long byteCount) throws EOFException {
            boolean z10;
            boolean z11;
            AbstractC6492s.i(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.f56223h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            long j10 = byteCount;
            while (j10 > 0) {
                synchronized (Http2Stream.this) {
                    z10 = this.finished;
                    z11 = this.readBuffer.D0() + j10 > this.maxByteCount;
                    J j11 = J.f24997a;
                }
                if (z11) {
                    source.d(j10);
                    Http2Stream.this.f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.d(j10);
                    return;
                }
                long jU = source.U(this.receiveBuffer, j10);
                if (jU == -1) {
                    throw new EOFException();
                }
                j10 -= jU;
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    try {
                        if (this.closed) {
                            this.receiveBuffer.clear();
                        } else {
                            boolean z12 = this.readBuffer.D0() == 0;
                            this.readBuffer.e0(this.receiveBuffer);
                            if (z12) {
                                AbstractC6492s.g(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                                http2Stream2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            s(byteCount);
        }

        public final void j(boolean z10) {
            this.finished = z10;
        }

        public final void p(Headers headers) {
            this.trailers = headers;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lej/c;", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "LYg/J;", "D", "()V", "Ljava/io/IOException;", "cause", "z", "(Ljava/io/IOException;)Ljava/io/IOException;", SnmpConfigurator.O_CONTEXT_ENGINE_ID, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class StreamTimeout extends C5479c {
        public StreamTimeout() {
        }

        @Override // ej.C5479c
        protected void D() {
            Http2Stream.this.f(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().J0();
        }

        public final void E() throws IOException {
            if (y()) {
                throw z(null);
            }
        }

        @Override // ej.C5479c
        protected IOException z(IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }
    }

    public Http2Stream(int i10, Http2Connection connection, boolean z10, boolean z11, Headers headers) {
        AbstractC6492s.i(connection, "connection");
        this.id = i10;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(connection.getOkHttpSettings().c(), z11);
        this.sink = new FramingSink(z10);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    private final boolean e(ErrorCode errorCode, IOException errorException) {
        if (Util.f56223h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            AbstractC6492s.g(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.source.getFinished() && this.sink.getFinished()) {
                return false;
            }
            J j10 = J.f24997a;
            this.connection.I0(this.id);
            return true;
        }
    }

    public final void A(long j10) {
        this.readBytesTotal = j10;
    }

    public final void B(long j10) {
        this.writeBytesTotal = j10;
    }

    public final synchronized Headers C() {
        Object objRemoveFirst;
        this.readTimeout.x();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                D();
            } catch (Throwable th2) {
                this.readTimeout.E();
                throw th2;
            }
        }
        this.readTimeout.E();
        if (this.headersQueue.isEmpty()) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            AbstractC6492s.f(errorCode);
            throw new StreamResetException(errorCode);
        }
        objRemoveFirst = this.headersQueue.removeFirst();
        AbstractC6492s.h(objRemoveFirst, "headersQueue.removeFirst()");
        return (Headers) objRemoveFirst;
    }

    public final void D() throws InterruptedException, InterruptedIOException {
        try {
            AbstractC6492s.g(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final E E() {
        return this.writeTimeout;
    }

    public final void a(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            AbstractC6492s.g(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean zU;
        if (Util.f56223h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !this.source.getFinished() && this.source.getClosed() && (this.sink.getFinished() || this.sink.getClosed());
                zU = u();
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            d(ErrorCode.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.connection.I0(this.id);
        }
    }

    public final void c() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            AbstractC6492s.f(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void d(ErrorCode rstStatusCode, IOException errorException) {
        AbstractC6492s.i(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, errorException)) {
            this.connection.T0(this.id, rstStatusCode);
        }
    }

    public final void f(ErrorCode errorCode) {
        AbstractC6492s.i(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.connection.U0(this.id, errorCode);
        }
    }

    /* renamed from: g, reason: from getter */
    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode h() {
        return this.errorCode;
    }

    /* renamed from: i, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    /* renamed from: j, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: k, reason: from getter */
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    /* renamed from: l, reason: from getter */
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    /* renamed from: m, reason: from getter */
    public final StreamTimeout getReadTimeout() {
        return this.readTimeout;
    }

    public final InterfaceC5474B n() {
        synchronized (this) {
            try {
                if (!this.hasResponseHeaders && !t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.sink;
    }

    /* renamed from: o, reason: from getter */
    public final FramingSink getSink() {
        return this.sink;
    }

    /* renamed from: p, reason: from getter */
    public final FramingSource getSource() {
        return this.source;
    }

    /* renamed from: q, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* renamed from: r, reason: from getter */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    /* renamed from: s, reason: from getter */
    public final StreamTimeout getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean t() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished() || this.source.getClosed()) {
                if (this.sink.getFinished() || this.sink.getClosed()) {
                    if (this.hasResponseHeaders) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final E v() {
        return this.readTimeout;
    }

    public final void w(InterfaceC5483g source, int length) {
        AbstractC6492s.i(source, "source");
        if (!Util.f56223h || !Thread.holdsLock(this)) {
            this.source.h(source, length);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void x(Headers headers, boolean inFinished) {
        boolean zU;
        AbstractC6492s.i(headers, "headers");
        if (Util.f56223h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && inFinished) {
                    this.source.p(headers);
                } else {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(headers);
                }
                if (inFinished) {
                    this.source.j(true);
                }
                zU = u();
                AbstractC6492s.g(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zU) {
            return;
        }
        this.connection.I0(this.id);
    }

    public final synchronized void y(ErrorCode errorCode) {
        AbstractC6492s.i(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            AbstractC6492s.g(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void z(long j10) {
        this.readBytesAcknowledged = j10;
    }
}
