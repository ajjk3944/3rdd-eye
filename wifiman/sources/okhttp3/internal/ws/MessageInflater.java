package okhttp3.internal.ws;

import ej.C5481e;
import ej.InterfaceC5476D;
import ej.n;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lej/e;", "buffer", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lej/e;)V", "close", "()V", "Z", SnmpConfigurator.O_BIND_ADDRESS, "Lej/e;", "deflatedBytes", "Ljava/util/zip/Inflater;", SnmpConfigurator.O_COMMUNITY, "Ljava/util/zip/Inflater;", "inflater", "Lej/n;", "d", "Lej/n;", "inflaterSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MessageInflater implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5481e deflatedBytes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n inflaterSource;

    public MessageInflater(boolean z10) {
        this.noContextTakeover = z10;
        C5481e c5481e = new C5481e();
        this.deflatedBytes = c5481e;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new n((InterfaceC5476D) c5481e, inflater);
    }

    public final void a(C5481e buffer) throws DataFormatException, IOException {
        AbstractC6492s.i(buffer, "buffer");
        if (this.deflatedBytes.D0() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.e0(buffer);
        this.deflatedBytes.o(65535);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.D0();
        do {
            this.inflaterSource.a(buffer, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }
}
