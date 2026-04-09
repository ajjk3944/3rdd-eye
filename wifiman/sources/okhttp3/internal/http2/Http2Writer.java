package okhttp3.internal.http2;

import ej.C5481e;
import ej.InterfaceC5482f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import org.snmp4j.mp.MPv3;
import org.snmp4j.transport.TLSTM;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001RB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0010J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\u0014J%\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\f2\u0006\u00102\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00107\u001a\u00020\n¢\u0006\u0004\b8\u0010\u000eJ-\u0010;\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\fH\u0016¢\u0006\u0004\b=\u0010\u0010J+\u0010?\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010CR\u0017\u0010Q\u001a\u00020L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Lej/f;", "sink", "", "client", "<init>", "(Lej/f;Z)V", "", "streamId", "", "byteCount", "LYg/J;", SnmpConfigurator.O_PRIV_PASSPHRASE, "(IJ)V", "g", "()V", "Lokhttp3/internal/http2/Settings;", "peerSettings", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/internal/http2/Settings;)V", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "J", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "P", "(ILokhttp3/internal/http2/ErrorCode;)V", SnmpConfigurator.O_PRIV_PROTOCOL, "()I", "outFinished", "Lej/e;", "source", "h", "(ZILej/e;I)V", "flags", "buffer", "j", "(IILej/e;I)V", "settings", "S", "ack", "payload1", "payload2", "C", "(ZII)V", "lastGoodStreamId", "", "debugData", "s", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "windowSizeIncrement", "T", "length", "type", "p", "(IIII)V", "close", "headerBlock", SnmpConfigurator.O_VERSION, "(ZILjava/util/List;)V", "Lej/f;", SnmpConfigurator.O_BIND_ADDRESS, "Z", SnmpConfigurator.O_COMMUNITY, "Lej/e;", "hpackBuffer", "d", "I", "maxFrameSize", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "closed", "Lokhttp3/internal/http2/Hpack$Writer;", "f", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Http2Writer implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f56676h = Logger.getLogger(Http2.class.getName());

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5482f sink;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C5481e hpackBuffer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int maxFrameSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Hpack.Writer hpackWriter;

    public Http2Writer(InterfaceC5482f sink, boolean z10) {
        AbstractC6492s.i(sink, "sink");
        this.sink = sink;
        this.client = z10;
        C5481e c5481e = new C5481e();
        this.hpackBuffer = c5481e;
        this.maxFrameSize = TLSTM.TLS_MAX_FRAGMENT_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, c5481e, 3, null);
    }

    private final void Y(int streamId, long byteCount) {
        while (byteCount > 0) {
            long jMin = Math.min(this.maxFrameSize, byteCount);
            byteCount -= jMin;
            p(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
            this.sink.Z(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void C(boolean ack, int payload1, int payload2) {
        if (this.closed) {
            throw new IOException("closed");
        }
        p(0, 8, 6, ack ? 1 : 0);
        this.sink.o(payload1);
        this.sink.o(payload2);
        this.sink.flush();
    }

    public final synchronized void J(int streamId, int promisedStreamId, List requestHeaders) {
        AbstractC6492s.i(requestHeaders, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.g(requestHeaders);
        long jD0 = this.hpackBuffer.D0();
        int iMin = (int) Math.min(this.maxFrameSize - 4, jD0);
        long j10 = iMin;
        p(streamId, iMin + 4, 5, jD0 == j10 ? 4 : 0);
        this.sink.o(promisedStreamId & MPv3.MAX_MESSAGE_ID);
        this.sink.Z(this.hpackBuffer, j10);
        if (jD0 > j10) {
            Y(streamId, jD0 - j10);
        }
    }

    public final synchronized void P(int streamId, ErrorCode errorCode) {
        AbstractC6492s.i(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        p(streamId, 4, 3, 0);
        this.sink.o(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void S(Settings settings) {
        try {
            AbstractC6492s.i(settings, "settings");
            if (this.closed) {
                throw new IOException("closed");
            }
            int i10 = 0;
            p(0, settings.i() * 6, 4, 0);
            while (i10 < 10) {
                if (settings.f(i10)) {
                    this.sink.n(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.sink.o(settings.a(i10));
                }
                i10++;
            }
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void T(int streamId, long windowSizeIncrement) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
        }
        p(streamId, 4, 8, 0);
        this.sink.o((int) windowSizeIncrement);
        this.sink.flush();
    }

    public final synchronized void a(Settings peerSettings) {
        try {
            AbstractC6492s.i(peerSettings, "peerSettings");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = peerSettings.e(this.maxFrameSize);
            if (peerSettings.b() != -1) {
                this.hpackWriter.e(peerSettings.b());
            }
            p(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void flush() {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final synchronized void g() {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger = f56676h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.t(">> CONNECTION " + Http2.CONNECTION_PREFACE.t(), new Object[0]));
                }
                this.sink.R(Http2.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void h(boolean outFinished, int streamId, C5481e source, int byteCount) {
        if (this.closed) {
            throw new IOException("closed");
        }
        j(streamId, outFinished ? 1 : 0, source, byteCount);
    }

    public final void j(int streamId, int flags, C5481e buffer, int byteCount) {
        p(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            InterfaceC5482f interfaceC5482f = this.sink;
            AbstractC6492s.f(buffer);
            interfaceC5482f.Z(buffer, byteCount);
        }
    }

    public final void p(int streamId, int length, int type, int flags) {
        Logger logger = f56676h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.f56544a.c(false, streamId, length, type, flags));
        }
        if (length > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + length).toString());
        }
        if ((Integer.MIN_VALUE & streamId) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + streamId).toString());
        }
        Util.c0(this.sink, length);
        this.sink.u(type & 255);
        this.sink.u(flags & 255);
        this.sink.o(streamId & MPv3.MAX_MESSAGE_ID);
    }

    public final synchronized void s(int lastGoodStreamId, ErrorCode errorCode, byte[] debugData) {
        try {
            AbstractC6492s.i(errorCode, "errorCode");
            AbstractC6492s.i(debugData, "debugData");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            p(0, debugData.length + 8, 7, 0);
            this.sink.o(lastGoodStreamId);
            this.sink.o(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.sink.X(debugData);
            }
            this.sink.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void v(boolean outFinished, int streamId, List headerBlock) {
        AbstractC6492s.i(headerBlock, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.g(headerBlock);
        long jD0 = this.hpackBuffer.D0();
        long jMin = Math.min(this.maxFrameSize, jD0);
        int i10 = jD0 == jMin ? 4 : 0;
        if (outFinished) {
            i10 |= 1;
        }
        p(streamId, (int) jMin, 1, i10);
        this.sink.Z(this.hpackBuffer, jMin);
        if (jD0 > jMin) {
            Y(streamId, jD0 - jMin);
        }
    }

    /* renamed from: y, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }
}
