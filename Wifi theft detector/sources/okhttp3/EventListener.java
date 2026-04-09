package okhttp3;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000 N2\u00020\u0001:\u0002NOB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u0010\u0018\u001a\r\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u000f0\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\bJ!\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J1\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\bJ\u001f\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u0010\bJ\u001f\u0010:\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b>\u0010\bJ\u001f\u0010A\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010\bJ\u001f\u0010D\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bD\u0010;J\u001f\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bE\u0010=J\u0017\u0010F\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bF\u0010\bJ\u001f\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bG\u0010=J\u0017\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010\bJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bI\u0010BJ\u001f\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bJ\u0010BJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010\bJ\u001f\u0010M\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010L\u001a\u00020?H\u0016¢\u0006\u0004\bM\u0010B¨\u0006P"}, d2 = {"Lokhttp3/EventListener;", "", "<init>", "()V", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Ly8/s;", "callStart", "(Lokhttp3/Call;)V", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "(Lokhttp3/Call;Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "Lkotlin/jvm/JvmSuppressWildcards;", "proxies", "proxySelectEnd", "(Lokhttp3/Call;Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "domainName", "dnsStart", "(Lokhttp3/Call;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connection", "connectionAcquired", "(Lokhttp3/Call;Lokhttp3/Connection;)V", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", AdActivity.REQUEST_KEY_EXTRA, "requestHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Request;)V", "requestBodyStart", "", "byteCount", "requestBodyEnd", "(Lokhttp3/Call;J)V", "requestFailed", "(Lokhttp3/Call;Ljava/io/IOException;)V", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Response;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "Companion", "Factory", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EventListener {

    @JvmField
    @NotNull
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lokhttp3/EventListener$Factory;", "", "create", "Lokhttp3/EventListener;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Factory {
        @NotNull
        EventListener create(@NotNull Call call);
    }

    public void cacheConditionalHit(@NotNull Call call, @NotNull Response cachedResponse) {
        p.e(call, "call");
        p.e(cachedResponse, "cachedResponse");
    }

    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        p.e(call, "call");
        p.e(response, "response");
    }

    public void cacheMiss(@NotNull Call call) {
        p.e(call, "call");
    }

    public void callEnd(@NotNull Call call) {
        p.e(call, "call");
    }

    public void callFailed(@NotNull Call call, @NotNull IOException ioe) {
        p.e(call, "call");
        p.e(ioe, "ioe");
    }

    public void callStart(@NotNull Call call) {
        p.e(call, "call");
    }

    public void canceled(@NotNull Call call) {
        p.e(call, "call");
    }

    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        p.e(call, "call");
        p.e(inetSocketAddress, "inetSocketAddress");
        p.e(proxy, "proxy");
    }

    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException ioe) {
        p.e(call, "call");
        p.e(inetSocketAddress, "inetSocketAddress");
        p.e(proxy, "proxy");
        p.e(ioe, "ioe");
    }

    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        p.e(call, "call");
        p.e(inetSocketAddress, "inetSocketAddress");
        p.e(proxy, "proxy");
    }

    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        p.e(call, "call");
        p.e(connection, "connection");
    }

    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        p.e(call, "call");
        p.e(connection, "connection");
    }

    public void dnsEnd(@NotNull Call call, @NotNull String domainName, @NotNull List<InetAddress> inetAddressList) {
        p.e(call, "call");
        p.e(domainName, "domainName");
        p.e(inetAddressList, "inetAddressList");
    }

    public void dnsStart(@NotNull Call call, @NotNull String domainName) {
        p.e(call, "call");
        p.e(domainName, "domainName");
    }

    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl url, @NotNull List<Proxy> proxies) {
        p.e(call, "call");
        p.e(url, "url");
        p.e(proxies, "proxies");
    }

    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl url) {
        p.e(call, "call");
        p.e(url, "url");
    }

    public void requestBodyEnd(@NotNull Call call, long byteCount) {
        p.e(call, "call");
    }

    public void requestBodyStart(@NotNull Call call) {
        p.e(call, "call");
    }

    public void requestFailed(@NotNull Call call, @NotNull IOException ioe) {
        p.e(call, "call");
        p.e(ioe, "ioe");
    }

    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        p.e(call, "call");
        p.e(request, "request");
    }

    public void requestHeadersStart(@NotNull Call call) {
        p.e(call, "call");
    }

    public void responseBodyEnd(@NotNull Call call, long byteCount) {
        p.e(call, "call");
    }

    public void responseBodyStart(@NotNull Call call) {
        p.e(call, "call");
    }

    public void responseFailed(@NotNull Call call, @NotNull IOException ioe) {
        p.e(call, "call");
        p.e(ioe, "ioe");
    }

    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        p.e(call, "call");
        p.e(response, "response");
    }

    public void responseHeadersStart(@NotNull Call call) {
        p.e(call, "call");
    }

    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        p.e(call, "call");
        p.e(response, "response");
    }

    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        p.e(call, "call");
    }

    public void secureConnectStart(@NotNull Call call) {
        p.e(call, "call");
    }
}
