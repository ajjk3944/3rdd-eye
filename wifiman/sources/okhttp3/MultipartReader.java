package okhttp3;

import ej.C5481e;
import ej.E;
import ej.InterfaceC5476D;
import ej.InterfaceC5483g;
import ej.h;
import ej.s;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0003\u001a\u001b\u001cJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\b\u0018\u00010\u0015R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "", "maxResult", "p", "(J)J", "LYg/J;", "close", "()V", "Lej/g;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lej/g;", "source", "Lej/h;", SnmpConfigurator.O_BIND_ADDRESS, "Lej/h;", "crlfDashDashBoundary", "", SnmpConfigurator.O_COMMUNITY, "Z", "closed", "Lokhttp3/MultipartReader$PartSource;", "d", "Lokhttp3/MultipartReader$PartSource;", "currentPart", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultipartReader implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    private static final s f56083f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5483g source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h crlfDashDashBoundary;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private PartSource currentPart;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "LYg/J;", "close", "()V", "Lej/g;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lej/g;", "body", "()Lej/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5483g body;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lej/D;", "LYg/J;", "close", "()V", "Lej/e;", "sink", "", "byteCount", "U", "(Lej/e;J)J", "Lej/E;", SnmpConfigurator.O_COMMUNITY, "()Lej/E;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lej/E;", "timeout", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class PartSource implements InterfaceC5476D {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final E timeout;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MultipartReader f56090b;

        @Override // ej.InterfaceC5476D
        public long U(C5481e sink, long byteCount) {
            AbstractC6492s.i(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (!AbstractC6492s.d(this.f56090b.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            E timeout = this.f56090b.source.getTimeout();
            E e10 = this.timeout;
            MultipartReader multipartReader = this.f56090b;
            long jI = timeout.i();
            long jA = E.f46436e.a(e10.i(), timeout.i());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.h(jA, timeUnit);
            if (!timeout.f()) {
                if (e10.f()) {
                    timeout.e(e10.d());
                }
                try {
                    long jP = multipartReader.p(byteCount);
                    long jU = jP == 0 ? -1L : multipartReader.source.U(sink, jP);
                    timeout.h(jI, timeUnit);
                    if (e10.f()) {
                        timeout.b();
                    }
                    return jU;
                } catch (Throwable th2) {
                    timeout.h(jI, TimeUnit.NANOSECONDS);
                    if (e10.f()) {
                        timeout.b();
                    }
                    throw th2;
                }
            }
            long jD = timeout.d();
            if (e10.f()) {
                timeout.e(Math.min(timeout.d(), e10.d()));
            }
            try {
                long jP2 = multipartReader.p(byteCount);
                long jU2 = jP2 == 0 ? -1L : multipartReader.source.U(sink, jP2);
                timeout.h(jI, timeUnit);
                if (e10.f()) {
                    timeout.e(jD);
                }
                return jU2;
            } catch (Throwable th3) {
                timeout.h(jI, TimeUnit.NANOSECONDS);
                if (e10.f()) {
                    timeout.e(jD);
                }
                throw th3;
            }
        }

        @Override // ej.InterfaceC5476D
        /* renamed from: c, reason: from getter */
        public E getTimeout() {
            return this.timeout;
        }

        @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (AbstractC6492s.d(this.f56090b.currentPart, this)) {
                this.f56090b.currentPart = null;
            }
        }
    }

    static {
        s.a aVar = s.f46493d;
        h.a aVar2 = h.f46470d;
        f56083f = aVar.d(aVar2.d("\r\n"), aVar2.d("--"), aVar2.d(" "), aVar2.d("\t"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long p(long maxResult) {
        this.source.g0(this.crlfDashDashBoundary.b0());
        long jW = this.source.b().W(this.crlfDashDashBoundary);
        return jW == -1 ? Math.min(maxResult, (this.source.b().D0() - this.crlfDashDashBoundary.b0()) + 1) : Math.min(maxResult, jW);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }
}
