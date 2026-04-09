package okhttp3.internal.connection;

import ej.E;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import ej.p;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 52\u00020\u00012\u00020\u0002:\u0002\u009d\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020)2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020)2\u0006\u0010\"\u001a\u00020!2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0011H\u0000¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0011H\u0000¢\u0006\u0004\b5\u00103JE\u00107\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u00106\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J'\u0010<\u001a\u00020)2\u0006\u0010:\u001a\u0002092\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010'H\u0000¢\u0006\u0004\b<\u0010=J\u001f\u0010C\u001a\u00020B2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0000¢\u0006\u0004\bC\u0010DJ\u0017\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020EH\u0000¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0005H\u0016¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0011¢\u0006\u0004\bL\u00103J\u000f\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020)2\u0006\u0010P\u001a\u00020)¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u00112\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010[\u001a\u00020\u00112\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0011\u0010]\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b]\u0010^J'\u0010b\u001a\u00020\u00112\u0006\u0010?\u001a\u00020>2\u0006\u0010_\u001a\u00020\u00052\u0006\u0010a\u001a\u00020`H\u0000¢\u0006\u0004\bb\u0010cJ!\u0010e\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020d2\b\u0010L\u001a\u0004\u0018\u00010`H\u0000¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bk\u0010lR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bU\u0010m\u001a\u0004\bn\u0010oR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010rR\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010uR\u0018\u0010w\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010vR\u0018\u0010y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010xR\u0018\u0010|\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010{R\u0018\u0010\u007f\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010~R(\u0010\u0085\u0001\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b#\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010\u0080\u0001R&\u0010\u008a\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u0019\u0010e\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0005\b\u0089\u0001\u0010\u001cR\u0018\u0010\u008c\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010eR\u0018\u0010\u008e\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010eR\u0018\u0010\u008f\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010eR*\u0010\u0094\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020d0\u0091\u00010\u0090\u00018\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0092\u0001\u001a\u0006\b\u008b\u0001\u0010\u0093\u0001R)\u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b]\u0010\u0096\u0001\u001a\u0006\b\u008d\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\u009c\u0001\u001a\u00020)8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u0082\u0001¨\u0006\u009e\u0001"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/Route;", "route", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;)V", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "eventListener", "LYg/J;", "k", "(IIILokhttp3/Call;Lokhttp3/EventListener;)V", "i", "(IILokhttp3/Call;Lokhttp3/EventListener;)V", "Lokhttp3/internal/connection/ConnectionSpecSelector;", "connectionSpecSelector", "pingIntervalMillis", SnmpConfigurator.O_CONTEXT_NAME, "(Lokhttp3/internal/connection/ConnectionSpecSelector;ILokhttp3/Call;Lokhttp3/EventListener;)V", "G", "(I)V", "j", "(Lokhttp3/internal/connection/ConnectionSpecSelector;)V", "Lokhttp3/Request;", "tunnelRequest", "Lokhttp3/HttpUrl;", "url", "l", "(IILokhttp3/Request;Lokhttp3/HttpUrl;)Lokhttp3/Request;", "m", "()Lokhttp3/Request;", "", "candidates", "", "C", "(Ljava/util/List;)Z", "H", "(Lokhttp3/HttpUrl;)Z", "Lokhttp3/Handshake;", "handshake", "f", "(Lokhttp3/HttpUrl;Lokhttp3/Handshake;)Z", SnmpConfigurator.O_AUTH_PASSPHRASE, "()V", "z", SnmpConfigurator.O_TIMEOUT, "connectionRetryEnabled", "g", "(IIIIZLokhttp3/Call;Lokhttp3/EventListener;)V", "Lokhttp3/Address;", SnmpConfigurator.O_ADDRESS, "routes", SnmpConfigurator.O_SECURITY_NAME, "(Lokhttp3/Address;Ljava/util/List;)Z", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "x", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/ws/RealWebSocket$Streams;", SnmpConfigurator.O_PRIV_PROTOCOL, "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/ws/RealWebSocket$Streams;", "B", "()Lokhttp3/Route;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/net/Socket;", "F", "()Ljava/net/Socket;", "doExtensiveChecks", SnmpConfigurator.O_VERSION, "(Z)Z", "Lokhttp3/internal/http2/Http2Stream;", "stream", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/internal/http2/Http2Stream;)V", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "s", "()Lokhttp3/Handshake;", "failedRoute", "Ljava/io/IOException;", "failure", "h", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "Lokhttp3/internal/connection/RealCall;", "I", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "Lokhttp3/Protocol;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Lokhttp3/Protocol;", "", "toString", "()Ljava/lang/String;", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "d", "Lokhttp3/Route;", "Ljava/net/Socket;", "rawSocket", "socket", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/internal/http2/Http2Connection;", "http2Connection", "Lej/g;", "Lej/g;", "source", "Lej/f;", "Lej/f;", "sink", "Z", "q", "()Z", SnmpConfigurator.O_CONTEXT_ENGINE_ID, "(Z)V", "noNewExchanges", "noCoalescedConnections", SnmpConfigurator.O_RETRIES, "()I", "setRouteFailureCount$okhttp", "routeFailureCount", SnmpConfigurator.O_OPERATION, "successCount", "p", "refusedStreamCount", "allocationLimit", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "()Ljava/util/List;", "calls", "", "J", "()J", "D", "(J)V", "idleAtNs", "w", "isMultiplexed", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final RealConnectionPool connectionPool;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Route route;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Socket rawSocket;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Socket socket;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Handshake handshake;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Protocol protocol;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Http2Connection http2Connection;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5483g source;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5482f sink;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean noNewExchanges;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean noCoalescedConnections;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int routeFailureCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int successCount;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int refusedStreamCount;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int allocationLimit;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final List calls;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long idleAtNs;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56430a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f56430a = iArr;
        }
    }

    public RealConnection(RealConnectionPool connectionPool, Route route) {
        AbstractC6492s.i(connectionPool, "connectionPool");
        AbstractC6492s.i(route, "route");
        this.connectionPool = connectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean C(List candidates) {
        List<Route> list = candidates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (Route route : list) {
            Proxy.Type type = route.getProxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.route.getProxy().type() == type2 && AbstractC6492s.d(this.route.getSocketAddress(), route.getSocketAddress())) {
                return true;
            }
        }
        return false;
    }

    private final void G(int pingIntervalMillis) throws SocketException {
        Socket socket = this.socket;
        AbstractC6492s.f(socket);
        InterfaceC5483g interfaceC5483g = this.source;
        AbstractC6492s.f(interfaceC5483g);
        InterfaceC5482f interfaceC5482f = this.sink;
        AbstractC6492s.f(interfaceC5482f);
        socket.setSoTimeout(0);
        Http2Connection http2ConnectionA = new Http2Connection.Builder(true, TaskRunner.f56345i).q(socket, this.route.getAddress().getUrl().getHost(), interfaceC5483g, interfaceC5482f).k(this).l(pingIntervalMillis).a();
        this.http2Connection = http2ConnectionA;
        this.allocationLimit = Http2Connection.INSTANCE.a().d();
        Http2Connection.O0(http2ConnectionA, false, null, 3, null);
    }

    private final boolean H(HttpUrl url) {
        Handshake handshake;
        if (Util.f56223h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        HttpUrl url2 = this.route.getAddress().getUrl();
        if (url.getPort() != url2.getPort()) {
            return false;
        }
        if (AbstractC6492s.d(url.getHost(), url2.getHost())) {
            return true;
        }
        if (this.noCoalescedConnections || (handshake = this.handshake) == null) {
            return false;
        }
        AbstractC6492s.f(handshake);
        return f(url, handshake);
    }

    private final boolean f(HttpUrl url, Handshake handshake) {
        List listD = handshake.d();
        if (listD.isEmpty()) {
            return false;
        }
        OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f56773a;
        String host = url.getHost();
        Object obj = listD.get(0);
        AbstractC6492s.g(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        return okHostnameVerifier.e(host, (X509Certificate) obj);
    }

    private final void i(int connectTimeout, int readTimeout, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Proxy proxy = this.route.getProxy();
        Address address = this.route.getAddress();
        Proxy.Type type = proxy.type();
        int i10 = type == null ? -1 : WhenMappings.f56430a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = address.getSocketFactory().createSocket();
            AbstractC6492s.f(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.rawSocket = socketCreateSocket;
        eventListener.j(call, this.route.getSocketAddress(), proxy);
        socketCreateSocket.setSoTimeout(readTimeout);
        try {
            Platform.INSTANCE.g().f(socketCreateSocket, this.route.getSocketAddress(), connectTimeout);
            try {
                this.source = p.d(p.l(socketCreateSocket));
                this.sink = p.c(p.h(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (AbstractC6492s.d(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.getSocketAddress());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private final void j(ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        Address address = this.route.getAddress();
        SSLSocketFactory sslSocketFactory = address.getSslSocketFactory();
        SSLSocket sSLSocket = null;
        try {
            AbstractC6492s.f(sslSocketFactory);
            Socket socketCreateSocket = sslSocketFactory.createSocket(this.rawSocket, address.getUrl().getHost(), address.getUrl().getPort(), true);
            AbstractC6492s.g(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecA = connectionSpecSelector.a(sSLSocket2);
                if (connectionSpecA.getSupportsTlsExtensions()) {
                    Platform.INSTANCE.g().e(sSLSocket2, address.getUrl().getHost(), address.getProtocols());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.INSTANCE;
                AbstractC6492s.h(sslSocketSession, "sslSocketSession");
                Handshake handshakeA = companion.a(sslSocketSession);
                HostnameVerifier hostnameVerifier = address.getHostnameVerifier();
                AbstractC6492s.f(hostnameVerifier);
                if (hostnameVerifier.verify(address.getUrl().getHost(), sslSocketSession)) {
                    CertificatePinner certificatePinner = address.getCertificatePinner();
                    AbstractC6492s.f(certificatePinner);
                    this.handshake = new Handshake(handshakeA.getTlsVersion(), handshakeA.getCipherSuite(), handshakeA.getLocalCertificates(), new RealConnection$connectTls$1(certificatePinner, handshakeA, address));
                    certificatePinner.b(address.getUrl().getHost(), new RealConnection$connectTls$2(this));
                    String strH = connectionSpecA.getSupportsTlsExtensions() ? Platform.INSTANCE.g().h(sSLSocket2) : null;
                    this.socket = sSLSocket2;
                    this.source = p.d(p.l(sSLSocket2));
                    this.sink = p.c(p.h(sSLSocket2));
                    this.protocol = strH != null ? Protocol.INSTANCE.a(strH) : Protocol.HTTP_1_1;
                    Platform.INSTANCE.g().b(sSLSocket2);
                    return;
                }
                List listD = handshakeA.d();
                if (listD.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + address.getUrl().getHost() + " not verified (no certificates)");
                }
                Object obj = listD.get(0);
                AbstractC6492s.g(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                throw new SSLPeerUnverifiedException(t.l("\n              |Hostname " + address.getUrl().getHost() + " not verified:\n              |    certificate: " + CertificatePinner.INSTANCE.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + OkHostnameVerifier.f56773a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.INSTANCE.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void k(int connectTimeout, int readTimeout, int writeTimeout, Call call, EventListener eventListener) throws IOException {
        Request requestM = m();
        HttpUrl url = requestM.getUrl();
        for (int i10 = 0; i10 < 21; i10++) {
            i(connectTimeout, readTimeout, call, eventListener);
            requestM = l(readTimeout, writeTimeout, requestM, url);
            if (requestM == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                Util.n(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.h(call, this.route.getSocketAddress(), this.route.getProxy(), null);
        }
    }

    private final Request l(int readTimeout, int writeTimeout, Request tunnelRequest, HttpUrl url) throws IOException {
        String str = "CONNECT " + Util.T(url, true) + " HTTP/1.1";
        while (true) {
            InterfaceC5483g interfaceC5483g = this.source;
            AbstractC6492s.f(interfaceC5483g);
            InterfaceC5482f interfaceC5482f = this.sink;
            AbstractC6492s.f(interfaceC5482f);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, interfaceC5483g, interfaceC5482f);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            interfaceC5483g.getTimeout().h(readTimeout, timeUnit);
            interfaceC5482f.c().h(writeTimeout, timeUnit);
            http1ExchangeCodec.A(tunnelRequest.getHeaders(), str);
            http1ExchangeCodec.a();
            Response.Builder builderD = http1ExchangeCodec.d(false);
            AbstractC6492s.f(builderD);
            Response responseC = builderD.r(tunnelRequest).c();
            http1ExchangeCodec.z(responseC);
            int code = responseC.getCode();
            if (code == 200) {
                if (interfaceC5483g.b().t() && interfaceC5482f.b().t()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (code != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + responseC.getCode());
            }
            Request requestA = this.route.getAddress().getProxyAuthenticator().a(this.route, responseC);
            if (requestA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (t.C("close", Response.C(responseC, "Connection", null, 2, null), true)) {
                return requestA;
            }
            tunnelRequest = requestA;
        }
    }

    private final Request m() {
        Request requestB = new Request.Builder().i(this.route.getAddress().getUrl()).e("CONNECT", null).c("Host", Util.T(this.route.getAddress().getUrl(), true)).c("Proxy-Connection", "Keep-Alive").c("User-Agent", "okhttp/4.12.0").b();
        Request requestA = this.route.getAddress().getProxyAuthenticator().a(this.route, new Response.Builder().r(requestB).p(Protocol.HTTP_1_1).g(407).m("Preemptive Authenticate").b(Util.f56218c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return requestA == null ? requestB : requestA;
    }

    private final void n(ConnectionSpecSelector connectionSpecSelector, int pingIntervalMillis, Call call, EventListener eventListener) throws Throwable {
        if (this.route.getAddress().getSslSocketFactory() != null) {
            eventListener.C(call);
            j(connectionSpecSelector);
            eventListener.B(call, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                G(pingIntervalMillis);
                return;
            }
            return;
        }
        List protocols = this.route.getAddress().getProtocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!protocols.contains(protocol)) {
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
        } else {
            this.socket = this.rawSocket;
            this.protocol = protocol;
            G(pingIntervalMillis);
        }
    }

    public final synchronized void A() {
        this.noNewExchanges = true;
    }

    /* renamed from: B, reason: from getter */
    public Route getRoute() {
        return this.route;
    }

    public final void D(long j10) {
        this.idleAtNs = j10;
    }

    public final void E(boolean z10) {
        this.noNewExchanges = z10;
    }

    public Socket F() {
        Socket socket = this.socket;
        AbstractC6492s.f(socket);
        return socket;
    }

    public final synchronized void I(RealCall call, IOException e10) {
        try {
            AbstractC6492s.i(call, "call");
            if (e10 instanceof StreamResetException) {
                if (((StreamResetException) e10).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i10 = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i10;
                    if (i10 > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) e10).errorCode != ErrorCode.CANCEL || !call.getCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!w() || (e10 instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (e10 != null) {
                        h(call.getClient(), this.route, e10);
                    }
                    this.routeFailureCount++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okhttp3.Connection
    public Protocol a() {
        Protocol protocol = this.protocol;
        AbstractC6492s.f(protocol);
        return protocol;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void b(Http2Connection connection, Settings settings) {
        AbstractC6492s.i(connection, "connection");
        AbstractC6492s.i(settings, "settings");
        this.allocationLimit = settings.d();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void c(Http2Stream stream) {
        AbstractC6492s.i(stream, "stream");
        stream.d(ErrorCode.REFUSED_STREAM, null);
    }

    public final void e() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            Util.n(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.g(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void h(OkHttpClient client, Route failedRoute, IOException failure) {
        AbstractC6492s.i(client, "client");
        AbstractC6492s.i(failedRoute, "failedRoute");
        AbstractC6492s.i(failure, "failure");
        if (failedRoute.getProxy().type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.getAddress();
            address.getProxySelector().connectFailed(address.getUrl().u(), failedRoute.getProxy().address(), failure);
        }
        client.getRouteDatabase().b(failedRoute);
    }

    /* renamed from: o, reason: from getter */
    public final List getCalls() {
        return this.calls;
    }

    /* renamed from: p, reason: from getter */
    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    /* renamed from: r, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    /* renamed from: s, reason: from getter */
    public Handshake getHandshake() {
        return this.handshake;
    }

    public final synchronized void t() {
        this.successCount++;
    }

    public String toString() {
        Object cipherSuite;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.route.getAddress().getUrl().getHost());
        sb2.append(':');
        sb2.append(this.route.getAddress().getUrl().getPort());
        sb2.append(", proxy=");
        sb2.append(this.route.getProxy());
        sb2.append(" hostAddress=");
        sb2.append(this.route.getSocketAddress());
        sb2.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        if (handshake == null || (cipherSuite = handshake.getCipherSuite()) == null) {
            cipherSuite = "none";
        }
        sb2.append(cipherSuite);
        sb2.append(" protocol=");
        sb2.append(this.protocol);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(Address address, List routes) {
        AbstractC6492s.i(address, "address");
        if (Util.f56223h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.getAddress().d(address)) {
            return false;
        }
        if (AbstractC6492s.d(address.getUrl().getHost(), getRoute().getAddress().getUrl().getHost())) {
            return true;
        }
        if (this.http2Connection == null || routes == null || !C(routes) || address.getHostnameVerifier() != OkHostnameVerifier.f56773a || !H(address.getUrl())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner = address.getCertificatePinner();
            AbstractC6492s.f(certificatePinner);
            String host = address.getUrl().getHost();
            Handshake handshake = getHandshake();
            AbstractC6492s.f(handshake);
            certificatePinner.a(host, handshake.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean v(boolean doExtensiveChecks) {
        long j10;
        if (Util.f56223h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        AbstractC6492s.f(socket);
        Socket socket2 = this.socket;
        AbstractC6492s.f(socket2);
        InterfaceC5483g interfaceC5483g = this.source;
        AbstractC6492s.f(interfaceC5483g);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.A0(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.idleAtNs;
        }
        if (j10 < 10000000000L || !doExtensiveChecks) {
            return true;
        }
        return Util.G(socket2, interfaceC5483g);
    }

    public final boolean w() {
        return this.http2Connection != null;
    }

    public final ExchangeCodec x(OkHttpClient client, RealInterceptorChain chain) throws SocketException {
        AbstractC6492s.i(client, "client");
        AbstractC6492s.i(chain, "chain");
        Socket socket = this.socket;
        AbstractC6492s.f(socket);
        InterfaceC5483g interfaceC5483g = this.source;
        AbstractC6492s.f(interfaceC5483g);
        InterfaceC5482f interfaceC5482f = this.sink;
        AbstractC6492s.f(interfaceC5482f);
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        socket.setSoTimeout(chain.getReadTimeoutMillis());
        E eC = interfaceC5483g.getTimeout();
        long jK = chain.k();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        eC.h(jK, timeUnit);
        interfaceC5482f.c().h(chain.getWriteTimeoutMillis(), timeUnit);
        return new Http1ExchangeCodec(client, this, interfaceC5483g, interfaceC5482f);
    }

    public final RealWebSocket.Streams y(final Exchange exchange) throws SocketException {
        AbstractC6492s.i(exchange, "exchange");
        Socket socket = this.socket;
        AbstractC6492s.f(socket);
        final InterfaceC5483g interfaceC5483g = this.source;
        AbstractC6492s.f(interfaceC5483g);
        final InterfaceC5482f interfaceC5482f = this.sink;
        AbstractC6492s.f(interfaceC5482f);
        socket.setSoTimeout(0);
        A();
        return new RealWebSocket.Streams(interfaceC5483g, interfaceC5482f) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                exchange.a(-1L, true, true, null);
            }
        };
    }

    public final synchronized void z() {
        this.noCoalescedConnections = true;
    }
}
