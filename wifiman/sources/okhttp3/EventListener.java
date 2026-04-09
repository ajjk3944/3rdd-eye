package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000 L2\u00020\u0001:\u0002MNB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\bJ!\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J1\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J9\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\bJ\u001f\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\bJ\u001f\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\bJ\u001f\u0010@\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010\bJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\bC\u0010:J\u001f\u0010D\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bD\u0010<J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010\bJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bF\u0010<J\u0017\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\bJ\u001f\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bH\u0010AJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bI\u0010AJ\u0017\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010\bJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010A¨\u0006O"}, d2 = {"Lokhttp3/EventListener;", "", "<init>", "()V", "Lokhttp3/Call;", "call", "LYg/J;", "f", "(Lokhttp3/Call;)V", "Lokhttp3/HttpUrl;", "url", "p", "(Lokhttp3/Call;Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "proxies", SnmpConfigurator.O_OPERATION, "(Lokhttp3/Call;Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "domainName", SnmpConfigurator.O_CONTEXT_NAME, "(Lokhttp3/Call;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "m", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "C", "Lokhttp3/Handshake;", "handshake", "B", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "Lokhttp3/Protocol;", "protocol", "h", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "i", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connection", "k", "(Lokhttp3/Call;Lokhttp3/Connection;)V", "l", SnmpConfigurator.O_SECURITY_NAME, "Lokhttp3/Request;", "request", SnmpConfigurator.O_TIMEOUT, "(Lokhttp3/Call;Lokhttp3/Request;)V", SnmpConfigurator.O_RETRIES, "", "byteCount", "q", "(Lokhttp3/Call;J)V", "s", "(Lokhttp3/Call;Ljava/io/IOException;)V", "z", "Lokhttp3/Response;", "response", SnmpConfigurator.O_PRIV_PROTOCOL, "(Lokhttp3/Call;Lokhttp3/Response;)V", "w", SnmpConfigurator.O_VERSION, "x", "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "g", SnmpConfigurator.O_AUTH_PASSPHRASE, SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "cachedResponse", SnmpConfigurator.O_AUTH_PROTOCOL, "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EventListener {

    /* renamed from: b, reason: collision with root package name */
    public static final EventListener f56012b = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/EventListener$Factory;", "", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Call;)Lokhttp3/EventListener;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        EventListener a(Call call);
    }

    public void A(Call call, Response response) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(response, "response");
    }

    public void B(Call call, Handshake handshake) {
        AbstractC6492s.i(call, "call");
    }

    public void C(Call call) {
        AbstractC6492s.i(call, "call");
    }

    public void a(Call call, Response cachedResponse) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(cachedResponse, "cachedResponse");
    }

    public void b(Call call, Response response) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(response, "response");
    }

    public void c(Call call) {
        AbstractC6492s.i(call, "call");
    }

    public void d(Call call) {
        AbstractC6492s.i(call, "call");
    }

    public void e(Call call, IOException ioe) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(ioe, "ioe");
    }

    public void f(Call call) {
        AbstractC6492s.i(call, "call");
    }

    public void g(Call call) {
        AbstractC6492s.i(call, "call");
    }

    public void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(inetSocketAddress, "inetSocketAddress");
        AbstractC6492s.i(proxy, "proxy");
    }

    public void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(inetSocketAddress, "inetSocketAddress");
        AbstractC6492s.i(proxy, "proxy");
        AbstractC6492s.i(ioe, "ioe");
    }

    public void j(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(inetSocketAddress, "inetSocketAddress");
        AbstractC6492s.i(proxy, "proxy");
    }

    public void k(Call call, Connection connection) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(connection, "connection");
    }

    public void l(Call call, Connection connection) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(connection, "connection");
    }

    public void m(Call call, String domainName, List inetAddressList) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(domainName, "domainName");
        AbstractC6492s.i(inetAddressList, "inetAddressList");
    }

    public void n(Call call, String domainName) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(domainName, "domainName");
    }

    public void o(Call call, HttpUrl url, List proxies) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(url, "url");
        AbstractC6492s.i(proxies, "proxies");
    }

    public void p(Call call, HttpUrl url) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(url, "url");
    }

    public void q(Call call, long byteCount) {
        AbstractC6492s.i(call, "call");
    }

    public void r(Call call) {
        AbstractC6492s.i(call, "call");
    }

    public void s(Call call, IOException ioe) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(ioe, "ioe");
    }

    public void t(Call call, Request request) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(request, "request");
    }

    public void u(Call call) {
        AbstractC6492s.i(call, "call");
    }

    public void v(Call call, long byteCount) {
        AbstractC6492s.i(call, "call");
    }

    public void w(Call call) {
        AbstractC6492s.i(call, "call");
    }

    public void x(Call call, IOException ioe) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(ioe, "ioe");
    }

    public void y(Call call, Response response) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(response, "response");
    }

    public void z(Call call) {
        AbstractC6492s.i(call, "call");
    }
}
