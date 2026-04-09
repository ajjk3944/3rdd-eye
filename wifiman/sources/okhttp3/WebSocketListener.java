package okhttp3;

import ej.h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lokhttp3/WebSocketListener;", "", "<init>", "()V", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "LYg/J;", "f", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", "", "text", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "Lej/h;", "bytes", "d", "(Lokhttp3/WebSocket;Lej/h;)V", "", "code", "reason", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/WebSocket;ILjava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "", SnmpConfigurator.O_TIMEOUT, SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class WebSocketListener {
    public void a(WebSocket webSocket, int code, String reason) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(reason, "reason");
    }

    public void b(WebSocket webSocket, int code, String reason) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(reason, "reason");
    }

    public void c(WebSocket webSocket, Throwable t10, Response response) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(t10, "t");
    }

    public void d(WebSocket webSocket, h bytes) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(bytes, "bytes");
    }

    public void e(WebSocket webSocket, String text) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(text, "text");
    }

    public void f(WebSocket webSocket, Response response) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(response, "response");
    }
}
