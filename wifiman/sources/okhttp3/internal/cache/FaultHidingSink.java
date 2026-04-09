package okhttp3.internal.cache;

import ej.C5481e;
import ej.InterfaceC5474B;
import ej.j;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u000e¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lej/j;", "Lej/B;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "LYg/J;", "onException", "<init>", "(Lej/B;Lmh/l;)V", "Lej/e;", "source", "", "byteCount", "Z", "(Lej/e;J)V", "flush", "()V", "close", SnmpConfigurator.O_BIND_ADDRESS, "Lmh/l;", "getOnException", "()Lmh/l;", "", SnmpConfigurator.O_COMMUNITY, "hasErrors", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class FaultHidingSink extends j {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l onException;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasErrors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(InterfaceC5474B delegate, InterfaceC6835l onException) {
        super(delegate);
        AbstractC6492s.i(delegate, "delegate");
        AbstractC6492s.i(onException, "onException");
        this.onException = onException;
    }

    @Override // ej.j, ej.InterfaceC5474B
    public void Z(C5481e source, long byteCount) throws EOFException {
        AbstractC6492s.i(source, "source");
        if (this.hasErrors) {
            source.d(byteCount);
            return;
        }
        try {
            super.Z(source, byteCount);
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // ej.j, ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // ej.j, ej.InterfaceC5474B, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }
}
