package okhttp3.internal.ws;

import ej.C5481e;
import ej.InterfaceC5482f;
import ej.h;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.asn1.BER;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010 R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u0004\u0018\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "isClient", "Lej/f;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLej/f;Ljava/util/Random;ZZJ)V", "", "opcode", "Lej/h;", "payload", "LYg/J;", "g", "(ILej/h;)V", "j", "(Lej/h;)V", "p", "code", "reason", SnmpConfigurator.O_AUTH_PROTOCOL, "formatOpcode", "data", "h", "close", "()V", "Z", SnmpConfigurator.O_BIND_ADDRESS, "Lej/f;", "getSink", "()Lej/f;", SnmpConfigurator.O_COMMUNITY, "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "f", "J", "Lej/e;", "Lej/e;", "messageBuffer", "sinkBuffer", "i", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "", "k", "[B", "maskKey", "Lej/e$a;", "l", "Lej/e$a;", "maskCursor", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebSocketWriter implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isClient;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5482f sink;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Random random;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean perMessageDeflate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long minimumDeflateSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C5481e messageBuffer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C5481e sinkBuffer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean writerClosed;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private MessageDeflater messageDeflater;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final byte[] maskKey;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C5481e.a maskCursor;

    public WebSocketWriter(boolean z10, InterfaceC5482f sink, Random random, boolean z11, boolean z12, long j10) {
        AbstractC6492s.i(sink, "sink");
        AbstractC6492s.i(random, "random");
        this.isClient = z10;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.minimumDeflateSize = j10;
        this.messageBuffer = new C5481e();
        this.sinkBuffer = sink.b();
        this.maskKey = z10 ? new byte[4] : null;
        this.maskCursor = z10 ? new C5481e.a() : null;
    }

    private final void g(int opcode, h payload) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iB0 = payload.b0();
        if (iB0 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.u(opcode | 128);
        if (this.isClient) {
            this.sinkBuffer.u(iB0 | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            AbstractC6492s.f(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.X(this.maskKey);
            if (iB0 > 0) {
                long jD0 = this.sinkBuffer.D0();
                this.sinkBuffer.R(payload);
                C5481e c5481e = this.sinkBuffer;
                C5481e.a aVar = this.maskCursor;
                AbstractC6492s.f(aVar);
                c5481e.t0(aVar);
                this.maskCursor.j(jD0);
                WebSocketProtocol.f56831a.b(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.u(iB0);
            this.sinkBuffer.R(payload);
        }
        this.sink.flush();
    }

    public final void a(int code, h reason) {
        h hVarV0 = h.f46471e;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.f56831a.c(code);
            }
            C5481e c5481e = new C5481e();
            c5481e.n(code);
            if (reason != null) {
                c5481e.R(reason);
            }
            hVarV0 = c5481e.v0();
        }
        try {
            g(8, hVarV0);
        } finally {
            this.writerClosed = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final void h(int formatOpcode, h data) throws IOException {
        AbstractC6492s.i(data, "data");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.R(data);
        int i10 = formatOpcode | 128;
        if (this.perMessageDeflate && data.b0() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.a(this.messageBuffer);
            i10 = formatOpcode | 192;
        }
        long jD0 = this.messageBuffer.D0();
        this.sinkBuffer.u(i10);
        int i11 = this.isClient ? 128 : 0;
        if (jD0 <= 125) {
            this.sinkBuffer.u(i11 | ((int) jD0));
        } else if (jD0 <= 65535) {
            this.sinkBuffer.u(i11 | 126);
            this.sinkBuffer.n((int) jD0);
        } else {
            this.sinkBuffer.u(i11 | BER.MAX_OID_LENGTH);
            this.sinkBuffer.P0(jD0);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            AbstractC6492s.f(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.X(this.maskKey);
            if (jD0 > 0) {
                C5481e c5481e = this.messageBuffer;
                C5481e.a aVar = this.maskCursor;
                AbstractC6492s.f(aVar);
                c5481e.t0(aVar);
                this.maskCursor.j(0L);
                WebSocketProtocol.f56831a.b(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.Z(this.messageBuffer, jD0);
        this.sink.m();
    }

    public final void j(h payload) {
        AbstractC6492s.i(payload, "payload");
        g(9, payload);
    }

    public final void p(h payload) throws IOException {
        AbstractC6492s.i(payload, "payload");
        g(10, payload);
    }
}
