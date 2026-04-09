package okhttp3.internal.ws;

import ej.C5481e;
import ej.InterfaceC5483g;
import ej.h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.internal.Util;
import org.snmp4j.asn1.BER;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001<B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010$R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0015R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0015R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:¨\u0006="}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "", "isClient", "Lej/g;", "source", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLej/g;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "LYg/J;", "h", "()V", "g", "p", "s", "j", SnmpConfigurator.O_AUTH_PROTOCOL, "close", "Z", SnmpConfigurator.O_BIND_ADDRESS, "Lej/g;", "getSource", "()Lej/g;", SnmpConfigurator.O_COMMUNITY, "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "f", "closed", "", "I", "opcode", "", "J", "frameLength", "i", "isFinalFrame", "isControlFrame", "k", "readingCompressedMessage", "Lej/e;", "l", "Lej/e;", "controlFrameBuffer", "m", "messageFrameBuffer", "Lokhttp3/internal/ws/MessageInflater;", SnmpConfigurator.O_CONTEXT_NAME, "Lokhttp3/internal/ws/MessageInflater;", "messageInflater", "", SnmpConfigurator.O_OPERATION, "[B", "maskKey", "Lej/e$a;", "Lej/e$a;", "maskCursor", "FrameCallback", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebSocketReader implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isClient;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5483g source;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final FrameCallback frameCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean perMessageDeflate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int opcode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long frameLength;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isFinalFrame;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isControlFrame;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean readingCompressedMessage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C5481e controlFrameBuffer;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C5481e messageFrameBuffer;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private MessageInflater messageInflater;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final byte[] maskKey;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final C5481e.a maskCursor;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "", "text", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;)V", "Lej/h;", "bytes", "d", "(Lej/h;)V", "payload", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, SnmpConfigurator.O_BIND_ADDRESS, "", "code", "reason", "f", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface FrameCallback {
        void a(String text);

        void b(h payload);

        void d(h bytes);

        void e(h payload);

        void f(int code, String reason);
    }

    public WebSocketReader(boolean z10, InterfaceC5483g source, FrameCallback frameCallback, boolean z11, boolean z12) {
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(frameCallback, "frameCallback");
        this.isClient = z10;
        this.source = source;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.controlFrameBuffer = new C5481e();
        this.messageFrameBuffer = new C5481e();
        this.maskKey = z10 ? null : new byte[4];
        this.maskCursor = z10 ? null : new C5481e.a();
    }

    private final void g() throws ProtocolException, EOFException {
        short s10;
        String strZ0;
        long j10 = this.frameLength;
        if (j10 > 0) {
            this.source.w(this.controlFrameBuffer, j10);
            if (!this.isClient) {
                C5481e c5481e = this.controlFrameBuffer;
                C5481e.a aVar = this.maskCursor;
                AbstractC6492s.f(aVar);
                c5481e.t0(aVar);
                this.maskCursor.j(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.f56831a;
                C5481e.a aVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                AbstractC6492s.f(bArr);
                webSocketProtocol.b(aVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long jD0 = this.controlFrameBuffer.D0();
                if (jD0 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (jD0 != 0) {
                    s10 = this.controlFrameBuffer.readShort();
                    strZ0 = this.controlFrameBuffer.z0();
                    String strA = WebSocketProtocol.f56831a.a(s10);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    s10 = 1005;
                    strZ0 = "";
                }
                this.frameCallback.f(s10, strZ0);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.e(this.controlFrameBuffer.v0());
                return;
            case 10:
                this.frameCallback.b(this.controlFrameBuffer.v0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.R(this.opcode));
        }
    }

    private final void h() throws IOException {
        boolean z10;
        if (this.closed) {
            throw new IOException("closed");
        }
        long jI = this.source.getTimeout().i();
        this.source.getTimeout().c();
        try {
            int iD = Util.d(this.source.readByte(), 255);
            this.source.getTimeout().h(jI, TimeUnit.NANOSECONDS);
            int i10 = iD & 15;
            this.opcode = i10;
            boolean z11 = (iD & 128) != 0;
            this.isFinalFrame = z11;
            boolean z12 = (iD & 8) != 0;
            this.isControlFrame = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (iD & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.readingCompressedMessage = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iD & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iD & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iD2 = Util.d(this.source.readByte(), 255);
            boolean z14 = (iD2 & 128) != 0;
            if (z14 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j10 = iD2 & BER.MAX_OID_LENGTH;
            this.frameLength = j10;
            if (j10 == 126) {
                this.frameLength = Util.e(this.source.readShort(), 65535);
            } else if (j10 == 127) {
                long j11 = this.source.readLong();
                this.frameLength = j11;
                if (j11 < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.S(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z14) {
                InterfaceC5483g interfaceC5483g = this.source;
                byte[] bArr = this.maskKey;
                AbstractC6492s.f(bArr);
                interfaceC5483g.readFully(bArr);
            }
        } catch (Throwable th2) {
            this.source.getTimeout().h(jI, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }

    private final void j() throws IOException {
        while (!this.closed) {
            long j10 = this.frameLength;
            if (j10 > 0) {
                this.source.w(this.messageFrameBuffer, j10);
                if (!this.isClient) {
                    C5481e c5481e = this.messageFrameBuffer;
                    C5481e.a aVar = this.maskCursor;
                    AbstractC6492s.f(aVar);
                    c5481e.t0(aVar);
                    this.maskCursor.j(this.messageFrameBuffer.D0() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.f56831a;
                    C5481e.a aVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    AbstractC6492s.f(bArr);
                    webSocketProtocol.b(aVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            s();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.R(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private final void p() throws DataFormatException, IOException {
        int i10 = this.opcode;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.R(i10));
        }
        j();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.a(this.messageFrameBuffer);
        }
        if (i10 == 1) {
            this.frameCallback.a(this.messageFrameBuffer.z0());
        } else {
            this.frameCallback.d(this.messageFrameBuffer.v0());
        }
    }

    private final void s() throws IOException {
        while (!this.closed) {
            h();
            if (!this.isControlFrame) {
                return;
            } else {
                g();
            }
        }
    }

    public final void a() {
        h();
        if (this.isControlFrame) {
            g();
        } else {
            p();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }
}
