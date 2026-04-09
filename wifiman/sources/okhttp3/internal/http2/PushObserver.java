package okhttp3.internal.http2;

import ej.InterfaceC5483g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\u0018J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/http2/PushObserver;", "", "", "streamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", SnmpConfigurator.O_AUTH_PROTOCOL, "(ILjava/util/List;)Z", "responseHeaders", "last", SnmpConfigurator.O_BIND_ADDRESS, "(ILjava/util/List;Z)Z", "Lej/g;", "source", "byteCount", SnmpConfigurator.O_COMMUNITY, "(ILej/g;IZ)Z", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "LYg/J;", "d", "(ILokhttp3/internal/http2/ErrorCode;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PushObserver {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f56692a;

    /* renamed from: b, reason: collision with root package name */
    public static final PushObserver f56691b = new Companion.PushObserverCancel();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/PushObserver$Companion;", "", "()V", "CANCEL", "Lokhttp3/internal/http2/PushObserver;", "PushObserverCancel", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f56692a = new Companion();

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/http2/PushObserver$Companion$PushObserverCancel;", "Lokhttp3/internal/http2/PushObserver;", "<init>", "()V", "", "streamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", SnmpConfigurator.O_AUTH_PROTOCOL, "(ILjava/util/List;)Z", "responseHeaders", "last", SnmpConfigurator.O_BIND_ADDRESS, "(ILjava/util/List;Z)Z", "Lej/g;", "source", "byteCount", SnmpConfigurator.O_COMMUNITY, "(ILej/g;IZ)Z", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "LYg/J;", "d", "(ILokhttp3/internal/http2/ErrorCode;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean a(int streamId, List requestHeaders) {
                AbstractC6492s.i(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean b(int streamId, List responseHeaders, boolean last) {
                AbstractC6492s.i(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean c(int streamId, InterfaceC5483g source, int byteCount, boolean last) {
                AbstractC6492s.i(source, "source");
                source.d(byteCount);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void d(int streamId, ErrorCode errorCode) {
                AbstractC6492s.i(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean a(int streamId, List requestHeaders);

    boolean b(int streamId, List responseHeaders, boolean last);

    boolean c(int streamId, InterfaceC5483g source, int byteCount, boolean last);

    void d(int streamId, ErrorCode errorCode);
}
