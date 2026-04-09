package okhttp3.internal.ws;

import ej.C5481e;
import ej.InterfaceC5474B;
import ej.h;
import ej.i;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import jh.AbstractC6329b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lej/e;", "Lej/h;", "suffix", "g", "(Lej/e;Lej/h;)Z", "buffer", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lej/e;)V", "close", "()V", "Z", SnmpConfigurator.O_BIND_ADDRESS, "Lej/e;", "deflatedBytes", "Ljava/util/zip/Deflater;", SnmpConfigurator.O_COMMUNITY, "Ljava/util/zip/Deflater;", "deflater", "Lej/i;", "d", "Lej/i;", "deflaterSink", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MessageDeflater implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5481e deflatedBytes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Deflater deflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i deflaterSink;

    public MessageDeflater(boolean z10) {
        this.noContextTakeover = z10;
        C5481e c5481e = new C5481e();
        this.deflatedBytes = c5481e;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new i((InterfaceC5474B) c5481e, deflater);
    }

    private final boolean g(C5481e c5481e, h hVar) {
        return c5481e.i0(c5481e.D0() - hVar.b0(), hVar);
    }

    public final void a(C5481e buffer) throws IOException {
        AbstractC6492s.i(buffer, "buffer");
        if (this.deflatedBytes.D0() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.Z(buffer, buffer.D0());
        this.deflaterSink.flush();
        if (g(this.deflatedBytes, MessageDeflaterKt.f56778a)) {
            long jD0 = this.deflatedBytes.D0() - 4;
            C5481e.a aVarU0 = C5481e.u0(this.deflatedBytes, null, 1, null);
            try {
                aVarU0.h(jD0);
                AbstractC6329b.a(aVarU0, null);
            } finally {
            }
        } else {
            this.deflatedBytes.u(0);
        }
        C5481e c5481e = this.deflatedBytes;
        buffer.Z(c5481e, c5481e.D0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }
}
