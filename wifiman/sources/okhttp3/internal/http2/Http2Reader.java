package okhttp3.internal.http2;

import ej.C5481e;
import ej.E;
import ej.InterfaceC5476D;
import ej.InterfaceC5483g;
import ej.h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import org.snmp4j.mp.MPv3;
import org.snmp4j.util.SnmpConfigurator;
import sh.AbstractC7978m;
import sh.C7972g;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u0001:\u0003456B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J/\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J/\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J/\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00067"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Lej/g;", "source", "", "client", "<init>", "(Lej/g;Z)V", "Lokhttp3/internal/http2/Http2Reader$Handler;", "handler", "", "length", "flags", "streamId", "LYg/J;", SnmpConfigurator.O_VERSION, "(Lokhttp3/internal/http2/Http2Reader$Handler;III)V", "padding", "", "Lokhttp3/internal/http2/Header;", "s", "(IIII)Ljava/util/List;", "j", "J", "C", "(Lokhttp3/internal/http2/Http2Reader$Handler;I)V", "S", "T", "P", SnmpConfigurator.O_PRIV_PROTOCOL, "p", SnmpConfigurator.O_PRIV_PASSPHRASE, "h", "(Lokhttp3/internal/http2/Http2Reader$Handler;)V", "requireSettings", "g", "(ZLokhttp3/internal/http2/Http2Reader$Handler;)Z", "close", "()V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lej/g;", SnmpConfigurator.O_BIND_ADDRESS, "Z", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", SnmpConfigurator.O_COMMUNITY, "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "continuation", "Lokhttp3/internal/http2/Hpack$Reader;", "d", "Lokhttp3/internal/http2/Hpack$Reader;", "hpackReader", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Companion", "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Http2Reader implements Closeable {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f56636f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5483g source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ContinuationSource continuation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Hpack.Reader hpackReader;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "<init>", "()V", "", "length", "flags", "padding", SnmpConfigurator.O_BIND_ADDRESS, "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return Http2Reader.f56636f;
        }

        public final int b(int length, int flags, int padding) throws IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            throw new IOException("PROTOCOL_ERROR padding " + padding + " > remaining length " + length);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010#\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\"\u0010&\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019\"\u0004\b%\u0010\u001bR\"\u0010*\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001b¨\u0006+"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lej/D;", "Lej/g;", "source", "<init>", "(Lej/g;)V", "LYg/J;", "g", "()V", "Lej/e;", "sink", "", "byteCount", "U", "(Lej/e;J)J", "Lej/E;", SnmpConfigurator.O_COMMUNITY, "()Lej/E;", "close", SnmpConfigurator.O_AUTH_PROTOCOL, "Lej/g;", "", SnmpConfigurator.O_BIND_ADDRESS, "I", "getLength", "()I", "p", "(I)V", "length", "getFlags", "h", "flags", "d", "getStreamId", SnmpConfigurator.O_VERSION, "streamId", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "j", "left", "f", "getPadding", "s", "padding", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ContinuationSource implements InterfaceC5476D {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5483g source;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int length;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int flags;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int streamId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int left;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int padding;

        public ContinuationSource(InterfaceC5483g source) {
            AbstractC6492s.i(source, "source");
            this.source = source;
        }

        private final void g() throws IOException {
            int i10 = this.streamId;
            int iK = Util.K(this.source);
            this.left = iK;
            this.length = iK;
            int iD = Util.d(this.source.readByte(), 255);
            this.flags = Util.d(this.source.readByte(), 255);
            Companion companion = Http2Reader.INSTANCE;
            if (companion.a().isLoggable(Level.FINE)) {
                companion.a().fine(Http2.f56544a.c(true, this.streamId, this.length, iD, this.flags));
            }
            int i11 = this.source.readInt() & MPv3.MAX_MESSAGE_ID;
            this.streamId = i11;
            if (iD == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iD + " != TYPE_CONTINUATION");
            }
        }

        @Override // ej.InterfaceC5476D
        public long U(C5481e sink, long byteCount) throws IOException {
            AbstractC6492s.i(sink, "sink");
            while (true) {
                int i10 = this.left;
                if (i10 != 0) {
                    long jU = this.source.U(sink, Math.min(byteCount, i10));
                    if (jU == -1) {
                        return -1L;
                    }
                    this.left -= (int) jU;
                    return jU;
                }
                this.source.d(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                g();
            }
        }

        /* renamed from: a, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        @Override // ej.InterfaceC5476D
        /* renamed from: c */
        public E getTimeout() {
            return this.source.getTimeout();
        }

        @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final void h(int i10) {
            this.flags = i10;
        }

        public final void j(int i10) {
            this.left = i10;
        }

        public final void p(int i10) {
            this.length = i10;
        }

        public final void s(int i10) {
            this.padding = i10;
        }

        public final void v(int i10) {
            this.streamId = i10;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "", "inFinished", "", "streamId", "Lej/g;", "source", "length", "LYg/J;", "h", "(ZILej/g;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", SnmpConfigurator.O_COMMUNITY, "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "k", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", SnmpConfigurator.O_BIND_ADDRESS, "(ZLokhttp3/internal/http2/Settings;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "()V", "ack", "payload1", "payload2", "i", "(ZII)V", "lastGoodStreamId", "Lej/h;", "debugData", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(ILokhttp3/internal/http2/ErrorCode;Lej/h;)V", "", "windowSizeIncrement", "f", "(IJ)V", "streamDependency", "weight", "exclusive", "j", "(IIIZ)V", "promisedStreamId", "requestHeaders", "l", "(IILjava/util/List;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Handler {
        void a();

        void b(boolean clearPrevious, Settings settings);

        void c(boolean inFinished, int streamId, int associatedStreamId, List headerBlock);

        void e(int lastGoodStreamId, ErrorCode errorCode, h debugData);

        void f(int streamId, long windowSizeIncrement);

        void h(boolean inFinished, int streamId, InterfaceC5483g source, int length);

        void i(boolean ack, int payload1, int payload2);

        void j(int streamId, int streamDependency, int weight, boolean exclusive);

        void k(int streamId, ErrorCode errorCode);

        void l(int streamId, int promisedStreamId, List requestHeaders);
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        AbstractC6492s.h(logger, "getLogger(Http2::class.java.name)");
        f56636f = logger;
    }

    public Http2Reader(InterfaceC5483g source, boolean z10) {
        AbstractC6492s.i(source, "source");
        this.source = source;
        this.client = z10;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void C(Handler handler, int streamId) {
        int i10 = this.source.readInt();
        handler.j(streamId, i10 & MPv3.MAX_MESSAGE_ID, Util.d(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i10) != 0);
    }

    private final void J(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length == 5) {
            if (streamId == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            C(handler, streamId);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + length + " != 5");
        }
    }

    private final void P(Handler handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iD = (flags & 8) != 0 ? Util.d(this.source.readByte(), 255) : 0;
        handler.l(streamId, this.source.readInt() & MPv3.MAX_MESSAGE_ID, s(INSTANCE.b(length - 4, flags, iD), iD, flags, streamId));
    }

    private final void S(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + length + " != 4");
        }
        if (streamId == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i10 = this.source.readInt();
        ErrorCode errorCodeA = ErrorCode.INSTANCE.a(i10);
        if (errorCodeA != null) {
            handler.k(streamId, errorCodeA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i10);
    }

    private final void T(Handler handler, int length, int flags, int streamId) throws IOException {
        int i10;
        if (streamId != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((flags & 1) != 0) {
            if (length != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.a();
            return;
        }
        if (length % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + length);
        }
        Settings settings = new Settings();
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, length), 6);
        int i11 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i11 <= iJ) || (iK < 0 && iJ <= i11)) {
            while (true) {
                int iE = Util.e(this.source.readShort(), 65535);
                i10 = this.source.readInt();
                if (iE != 2) {
                    if (iE == 3) {
                        iE = 4;
                    } else if (iE != 4) {
                        if (iE == 5 && (i10 < 16384 || i10 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i10 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iE = 7;
                    }
                } else if (i10 != 0 && i10 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.h(iE, i10);
                if (i11 == iJ) {
                    break;
                } else {
                    i11 += iK;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i10);
        }
        handler.b(false, settings);
    }

    private final void Y(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + length);
        }
        long jF = Util.f(this.source.readInt(), 2147483647L);
        if (jF == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.f(streamId, jF);
    }

    private final void j(Handler handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (flags & 1) != 0;
        if ((flags & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iD = (flags & 8) != 0 ? Util.d(this.source.readByte(), 255) : 0;
        handler.h(z10, streamId, this.source, INSTANCE.b(length, flags, iD));
        this.source.d(iD);
    }

    private final void p(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i10 = this.source.readInt();
        int i11 = this.source.readInt();
        int i12 = length - 8;
        ErrorCode errorCodeA = ErrorCode.INSTANCE.a(i11);
        if (errorCodeA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i11);
        }
        h hVarL = h.f46471e;
        if (i12 > 0) {
            hVarL = this.source.l(i12);
        }
        handler.e(i10, errorCodeA, hVarL);
    }

    private final List s(int length, int padding, int flags, int streamId) throws IOException {
        this.continuation.j(length);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.p(continuationSource.getLeft());
        this.continuation.s(padding);
        this.continuation.h(flags);
        this.continuation.v(streamId);
        this.hpackReader.k();
        return this.hpackReader.e();
    }

    private final void v(Handler handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (flags & 1) != 0;
        int iD = (flags & 8) != 0 ? Util.d(this.source.readByte(), 255) : 0;
        if ((flags & 32) != 0) {
            C(handler, streamId);
            length -= 5;
        }
        handler.c(z10, streamId, -1, s(INSTANCE.b(length, flags, iD), iD, flags, streamId));
    }

    private final void y(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length != 8) {
            throw new IOException("TYPE_PING length != 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.i((flags & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public final boolean g(boolean requireSettings, Handler handler) throws IOException {
        AbstractC6492s.i(handler, "handler");
        try {
            this.source.g0(9L);
            int iK = Util.K(this.source);
            if (iK > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iK);
            }
            int iD = Util.d(this.source.readByte(), 255);
            int iD2 = Util.d(this.source.readByte(), 255);
            int i10 = this.source.readInt() & MPv3.MAX_MESSAGE_ID;
            Logger logger = f56636f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.f56544a.c(true, i10, iK, iD, iD2));
            }
            if (requireSettings && iD != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.f56544a.b(iD));
            }
            switch (iD) {
                case 0:
                    j(handler, iK, iD2, i10);
                    return true;
                case 1:
                    v(handler, iK, iD2, i10);
                    return true;
                case 2:
                    J(handler, iK, iD2, i10);
                    return true;
                case 3:
                    S(handler, iK, iD2, i10);
                    return true;
                case 4:
                    T(handler, iK, iD2, i10);
                    return true;
                case 5:
                    P(handler, iK, iD2, i10);
                    return true;
                case 6:
                    y(handler, iK, iD2, i10);
                    return true;
                case 7:
                    p(handler, iK, iD2, i10);
                    return true;
                case 8:
                    Y(handler, iK, iD2, i10);
                    return true;
                default:
                    this.source.d(iK);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void h(Handler handler) throws IOException {
        AbstractC6492s.i(handler, "handler");
        if (this.client) {
            if (!g(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC5483g interfaceC5483g = this.source;
        h hVar = Http2.CONNECTION_PREFACE;
        h hVarL = interfaceC5483g.l(hVar.b0());
        Logger logger = f56636f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.t("<< CONNECTION " + hVarL.t(), new Object[0]));
        }
        if (AbstractC6492s.d(hVar, hVarL)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + hVarL.q0());
    }
}
