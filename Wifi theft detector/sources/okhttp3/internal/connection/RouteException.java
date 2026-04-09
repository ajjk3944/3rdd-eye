package okhttp3.internal.connection;

import com.unity3d.services.core.network.core.OkHttp3Client;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import y8.d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", "e", "Ly8/s;", "addConnectException", "Ljava/io/IOException;", "getFirstConnectException", "()Ljava/io/IOException;", "<set-?>", "lastConnectException", "getLastConnectException", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RouteException extends RuntimeException {

    @NotNull
    private final IOException firstConnectException;

    @NotNull
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        p.e(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void addConnectException(@NotNull IOException e10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        p.e(e10, "e");
        d.a(this.firstConnectException, e10);
        this.lastConnectException = e10;
    }

    @NotNull
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @NotNull
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
