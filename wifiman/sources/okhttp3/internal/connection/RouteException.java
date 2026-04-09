package okhttp3.internal.connection;

import Yg.AbstractC3663g;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/io/IOException;", SnmpConfigurator.O_COMMUNITY, "()Ljava/io/IOException;", "<set-?>", SnmpConfigurator.O_BIND_ADDRESS, "d", "lastConnectException", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IOException firstConnectException;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        AbstractC6492s.i(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void a(IOException e10) {
        AbstractC6492s.i(e10, "e");
        AbstractC3663g.a(this.firstConnectException, e10);
        this.lastConnectException = e10;
    }

    /* renamed from: c, reason: from getter */
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    /* renamed from: d, reason: from getter */
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
