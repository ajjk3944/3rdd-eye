package okhttp3;

import Zg.AbstractC3689v;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u00152\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u009c\u0001\u009d\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178G¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8G¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8G¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020#0\"8G¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u0017\u00101\u001a\u00020,8G¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00107\u001a\u0002028G¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010<\u001a\u0002088G¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b3\u0010;R\u0017\u0010?\u001a\u0002028G¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u00106R\u0017\u0010B\u001a\u0002028G¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u00106R\u0017\u0010H\u001a\u00020C8G¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010M\u001a\u0004\u0018\u00010I8G¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b=\u0010LR\u0017\u0010S\u001a\u00020N8G¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010Y\u001a\u0004\u0018\u00010T8G¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010^\u001a\u00020Z8G¢\u0006\f\n\u0004\b\u001f\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010a\u001a\u0002088G¢\u0006\f\n\u0004\b_\u0010:\u001a\u0004\b`\u0010;R\u0017\u0010f\u001a\u00020b8G¢\u0006\f\n\u0004\bF\u0010c\u001a\u0004\bd\u0010eR\u0016\u0010i\u001a\u0004\u0018\u00010g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010hR\u0019\u0010n\u001a\u0004\u0018\u00010j8G¢\u0006\f\n\u0004\bQ\u0010k\u001a\u0004\bl\u0010mR\u001d\u0010q\u001a\b\u0012\u0004\u0012\u00020o0\"8G¢\u0006\f\n\u0004\bp\u0010%\u001a\u0004\b_\u0010'R\u001d\u0010t\u001a\b\u0012\u0004\u0012\u00020r0\"8G¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\bs\u0010'R\u0017\u0010y\u001a\u00020u8G¢\u0006\f\n\u0004\b>\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010~\u001a\u00020z8G¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\bO\u0010}R\u001c\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8G¢\u0006\u000e\n\u0005\bA\u0010\u0080\u0001\u001a\u0005\bJ\u0010\u0081\u0001R\u001b\u0010\u0086\u0001\u001a\u00030\u0083\u00018G¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010W\u001a\u0005\b@\u0010\u0085\u0001R\u001b\u0010\u0088\u0001\u001a\u00030\u0083\u00018G¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010W\u001a\u0005\bU\u0010\u0085\u0001R\u001b\u0010\u008a\u0001\u001a\u00030\u0083\u00018G¢\u0006\u000e\n\u0004\bw\u0010W\u001a\u0006\b\u0089\u0001\u0010\u0085\u0001R\u001b\u0010\u008c\u0001\u001a\u00030\u0083\u00018G¢\u0006\u000e\n\u0004\b&\u0010W\u001a\u0006\b\u008b\u0001\u0010\u0085\u0001R\u001c\u0010\u008f\u0001\u001a\u00030\u0083\u00018G¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010W\u001a\u0006\b\u008e\u0001\u0010\u0085\u0001R\u001d\u0010\u0094\u0001\u001a\u00030\u0090\u00018G¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u008d\u0001\u0010\u0093\u0001R\u001c\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0006¢\u0006\u000f\n\u0005\b*\u0010\u0096\u0001\u001a\u0006\b\u0084\u0001\u0010\u0097\u0001R\u0014\u0010\u009b\u0001\u001a\u00020g8G¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009e\u0001"}, d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "Lokhttp3/OkHttpClient$Builder;", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "LYg/J;", "Q", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/Request;)Lokhttp3/Call;", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocket;", "F", "(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;", SnmpConfigurator.O_CONTEXT_ENGINE_ID, "()Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dispatcher;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/Dispatcher;", "q", "()Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "Lokhttp3/ConnectionPool;", SnmpConfigurator.O_CONTEXT_NAME, "()Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", SnmpConfigurator.O_COMMUNITY, "Ljava/util/List;", SnmpConfigurator.O_AUTH_PASSPHRASE, "()Ljava/util/List;", "interceptors", "d", "D", "networkInterceptors", "Lokhttp3/EventListener$Factory;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lokhttp3/EventListener$Factory;", SnmpConfigurator.O_TIMEOUT, "()Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "f", "Z", "N", "()Z", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "g", "Lokhttp3/Authenticator;", "()Lokhttp3/Authenticator;", "authenticator", "h", SnmpConfigurator.O_SECURITY_NAME, "followRedirects", "i", "w", "followSslRedirects", "Lokhttp3/CookieJar;", "j", "Lokhttp3/CookieJar;", "p", "()Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "k", "Lokhttp3/Cache;", "()Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "l", "Lokhttp3/Dns;", SnmpConfigurator.O_RETRIES, "()Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "m", "Ljava/net/Proxy;", "I", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "L", "()Ljava/net/ProxySelector;", "proxySelector", SnmpConfigurator.O_OPERATION, "K", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "O", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "S", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Lokhttp3/ConnectionSpec;", "s", "connectionSpecs", "Lokhttp3/Protocol;", "H", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "z", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", SnmpConfigurator.O_VERSION, "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "certificatePinner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "", "x", "()I", "callTimeoutMillis", SnmpConfigurator.O_PRIV_PROTOCOL, "connectTimeoutMillis", "M", "readTimeoutMillis", "R", "writeTimeoutMillis", "B", "G", "pingIntervalMillis", "", "C", "J", "()J", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/RouteDatabase;", "Lokhttp3/internal/connection/RouteDatabase;", "()Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "P", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: F, reason: collision with root package name */
    private static final List f56093F = Util.w(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: G, reason: collision with root package name */
    private static final List f56094G = Util.w(ConnectionSpec.f55963i, ConnectionSpec.f55965k);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final int writeTimeoutMillis;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int pingIntervalMillis;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final long minWebSocketMessageToCompress;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final RouteDatabase routeDatabase;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Dispatcher dispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ConnectionPool connectionPool;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List interceptors;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List networkInterceptors;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final EventListener.Factory eventListenerFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean retryOnConnectionFailure;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Authenticator authenticator;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean followRedirects;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean followSslRedirects;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final CookieJar cookieJar;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Cache cache;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Dns dns;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Proxy proxy;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ProxySelector proxySelector;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Authenticator proxyAuthenticator;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final SocketFactory socketFactory;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final SSLSocketFactory sslSocketFactoryOrNull;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final X509TrustManager x509TrustManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final List connectionSpecs;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List protocols;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final HostnameVerifier hostnameVerifier;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final CertificatePinner certificatePinner;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final CertificateChainCleaner certificateChainCleaner;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final int callTimeoutMillis;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final int connectTimeoutMillis;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final int readTimeoutMillis;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "<init>", "()V", "", "Lokhttp3/Protocol;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", SnmpConfigurator.O_BIND_ADDRESS, "()Ljava/util/List;", "Lokhttp3/ConnectionSpec;", "DEFAULT_CONNECTION_SPECS", SnmpConfigurator.O_AUTH_PROTOCOL, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return OkHttpClient.f56094G;
        }

        public final List b() {
            return OkHttpClient.f56093F;
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        AbstractC6492s.i(builder, "builder");
        this.dispatcher = builder.getDispatcher();
        this.connectionPool = builder.getConnectionPool();
        this.interceptors = Util.V(builder.getInterceptors());
        this.networkInterceptors = Util.V(builder.getNetworkInterceptors());
        this.eventListenerFactory = builder.getEventListenerFactory();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = NullProxySelector.f56760a;
        } else {
            proxySelector = builder.getProxySelector();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = NullProxySelector.f56760a;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List connectionSpecs = builder.getConnectionSpecs();
        this.connectionSpecs = connectionSpecs;
        this.protocols = builder.getProtocols();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        RouteDatabase routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        List list = connectionSpecs;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.f55823d;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).getIsTls()) {
                    if (builder.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
                        CertificateChainCleaner certificateChainCleaner = builder.getCertificateChainCleaner();
                        AbstractC6492s.f(certificateChainCleaner);
                        this.certificateChainCleaner = certificateChainCleaner;
                        X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
                        AbstractC6492s.f(x509TrustManagerOrNull);
                        this.x509TrustManager = x509TrustManagerOrNull;
                        CertificatePinner certificatePinner = builder.getCertificatePinner();
                        AbstractC6492s.f(certificateChainCleaner);
                        this.certificatePinner = certificatePinner.e(certificateChainCleaner);
                    } else {
                        Platform.Companion companion = Platform.INSTANCE;
                        X509TrustManager x509TrustManagerP = companion.g().p();
                        this.x509TrustManager = x509TrustManagerP;
                        Platform platformG = companion.g();
                        AbstractC6492s.f(x509TrustManagerP);
                        this.sslSocketFactoryOrNull = platformG.o(x509TrustManagerP);
                        CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.INSTANCE;
                        AbstractC6492s.f(x509TrustManagerP);
                        CertificateChainCleaner certificateChainCleanerA = companion2.a(x509TrustManagerP);
                        this.certificateChainCleaner = certificateChainCleanerA;
                        CertificatePinner certificatePinner2 = builder.getCertificatePinner();
                        AbstractC6492s.f(certificateChainCleanerA);
                        this.certificatePinner = certificatePinner2.e(certificateChainCleanerA);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.f55823d;
        }
        Q();
    }

    private final void Q() {
        List list = this.interceptors;
        AbstractC6492s.g(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        List list2 = this.networkInterceptors;
        AbstractC6492s.g(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).getIsTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC6492s.d(this.certificatePinner, CertificatePinner.f55823d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: A, reason: from getter */
    public final List getInterceptors() {
        return this.interceptors;
    }

    /* renamed from: B, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    /* renamed from: D, reason: from getter */
    public final List getNetworkInterceptors() {
        return this.networkInterceptors;
    }

    public Builder E() {
        return new Builder(this);
    }

    public WebSocket F(Request request, WebSocketListener listener) {
        AbstractC6492s.i(request, "request");
        AbstractC6492s.i(listener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.f56345i, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.n(this);
        return realWebSocket;
    }

    /* renamed from: G, reason: from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* renamed from: H, reason: from getter */
    public final List getProtocols() {
        return this.protocols;
    }

    /* renamed from: I, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    /* renamed from: K, reason: from getter */
    public final Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* renamed from: L, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    /* renamed from: M, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* renamed from: N, reason: from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    /* renamed from: O, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory P() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: R, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    /* renamed from: S, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    @Override // okhttp3.Call.Factory
    public Call b(Request request) {
        AbstractC6492s.i(request, "request");
        return new RealCall(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: f, reason: from getter */
    public final Authenticator getAuthenticator() {
        return this.authenticator;
    }

    /* renamed from: h, reason: from getter */
    public final Cache getCache() {
        return this.cache;
    }

    /* renamed from: i, reason: from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* renamed from: k, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    /* renamed from: l, reason: from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    /* renamed from: m, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* renamed from: n, reason: from getter */
    public final ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    /* renamed from: o, reason: from getter */
    public final List getConnectionSpecs() {
        return this.connectionSpecs;
    }

    /* renamed from: p, reason: from getter */
    public final CookieJar getCookieJar() {
        return this.cookieJar;
    }

    /* renamed from: q, reason: from getter */
    public final Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    /* renamed from: r, reason: from getter */
    public final Dns getDns() {
        return this.dns;
    }

    /* renamed from: t, reason: from getter */
    public final EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    /* renamed from: x, reason: from getter */
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    /* renamed from: z, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010(J\u001d\u0010*\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b*\u0010(J\u001d\u0010+\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b+\u0010(J\u001d\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b-\u0010(J\r\u0010.\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/R\"\u00106\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00070>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010?\u001a\u0004\b@\u0010AR \u0010D\u001a\b\u0012\u0004\u0012\u00020\u00070>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010?\u001a\u0004\bC\u0010AR\"\u0010K\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010R\u001a\u00020L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Y\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010\\\u001a\u00020L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010M\u001a\u0004\bZ\u0010O\"\u0004\b[\u0010QR\"\u0010`\u001a\u00020L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010M\u001a\u0004\b^\u0010O\"\u0004\b_\u0010QR\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010m\u001a\u0004\u0018\u00010g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\b]\u0010j\"\u0004\bk\u0010lR\"\u0010u\u001a\u00020n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010}\u001a\u0004\u0018\u00010v8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R)\u0010\u0084\u0001\u001a\u0004\u0018\u00010~8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b9\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R&\u0010\u0088\u0001\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010T\u001a\u0005\b\u0086\u0001\u0010V\"\u0005\b\u0087\u0001\u0010XR)\u0010\u008f\u0001\u001a\u00030\u0089\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bc\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b2\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bq\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R-\u0010\u009f\u0001\u001a\t\u0012\u0005\u0012\u00030\u009c\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bG\u0010?\u001a\u0005\b\u0085\u0001\u0010A\"\u0006\b\u009d\u0001\u0010\u009e\u0001R+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bZ\u0010?\u001a\u0005\b \u0001\u0010A\"\u0006\b¡\u0001\u0010\u009e\u0001R'\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b^\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R)\u0010¬\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b£\u0001\u0010¨\u0001\u001a\u0005\bo\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R*\u0010²\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b@\u0010®\u0001\u001a\u0005\bh\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R)\u0010¸\u0001\u001a\u00030³\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b´\u0001\u0010\u0091\u0001\u001a\u0005\ba\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R(\u0010º\u0001\u001a\u00030³\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bC\u0010\u0091\u0001\u001a\u0005\bw\u0010µ\u0001\"\u0006\b¹\u0001\u0010·\u0001R*\u0010¾\u0001\u001a\u00030³\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010\u0091\u0001\u001a\u0006\b¼\u0001\u0010µ\u0001\"\u0006\b½\u0001\u0010·\u0001R*\u0010Á\u0001\u001a\u00030³\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010\u0091\u0001\u001a\u0006\b¿\u0001\u0010µ\u0001\"\u0006\bÀ\u0001\u0010·\u0001R)\u0010Ã\u0001\u001a\u00030³\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\by\u0010\u0091\u0001\u001a\u0006\b»\u0001\u0010µ\u0001\"\u0006\bÂ\u0001\u0010·\u0001R)\u0010Ç\u0001\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010¿\u0001\u001a\u0006\b´\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R,\u0010Î\u0001\u001a\u0005\u0018\u00010È\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001¨\u0006Ï\u0001"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Interceptor;", "interceptor", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", SnmpConfigurator.O_BIND_ADDRESS, "Lokhttp3/EventListener;", "eventListener", "g", "(Lokhttp3/EventListener;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/CookieJar;", "cookieJar", "f", "(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "P", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Protocol;", "protocols", "N", "(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "L", "(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "d", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "O", "Q", "interval", "M", SnmpConfigurator.O_COMMUNITY, "()Lokhttp3/OkHttpClient;", "Lokhttp3/Dispatcher;", "Lokhttp3/Dispatcher;", "q", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "dispatcher", "Lokhttp3/ConnectionPool;", "Lokhttp3/ConnectionPool;", SnmpConfigurator.O_CONTEXT_NAME, "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "connectionPool", "", "Ljava/util/List;", "w", "()Ljava/util/List;", "interceptors", SnmpConfigurator.O_PRIV_PROTOCOL, "networkInterceptors", "Lokhttp3/EventListener$Factory;", "Lokhttp3/EventListener$Factory;", "s", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "eventListenerFactory", "", "Z", "F", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "Lokhttp3/Authenticator;", "h", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "authenticator", SnmpConfigurator.O_TIMEOUT, "setFollowRedirects$okhttp", "followRedirects", "i", SnmpConfigurator.O_SECURITY_NAME, "setFollowSslRedirects$okhttp", "followSslRedirects", "j", "Lokhttp3/CookieJar;", "p", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Cache;", "k", "Lokhttp3/Cache;", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "cache", "Lokhttp3/Dns;", "l", "Lokhttp3/Dns;", SnmpConfigurator.O_RETRIES, "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "dns", "Ljava/net/Proxy;", "m", "Ljava/net/Proxy;", "B", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "D", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "proxySelector", SnmpConfigurator.O_OPERATION, "C", "setProxyAuthenticator$okhttp", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "H", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "I", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "K", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "Lokhttp3/ConnectionSpec;", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "connectionSpecs", SnmpConfigurator.O_AUTH_PASSPHRASE, "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", SnmpConfigurator.O_VERSION, "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/CertificatePinner;", "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "certificatePinner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "certificateChainCleaner", "", "x", "()I", "setCallTimeout$okhttp", "(I)V", "callTimeout", "setConnectTimeout$okhttp", "connectTimeout", "z", SnmpConfigurator.O_CONTEXT_ENGINE_ID, "setReadTimeout$okhttp", "readTimeout", "J", "setWriteTimeout$okhttp", "writeTimeout", "setPingInterval$okhttp", "pingInterval", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/RouteDatabase;", "Lokhttp3/internal/connection/RouteDatabase;", "G", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "routeDatabase", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private int writeTimeout;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int pingInterval;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private long minWebSocketMessageToCompress;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private RouteDatabase routeDatabase;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Dispatcher dispatcher;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private ConnectionPool connectionPool;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List interceptors;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List networkInterceptors;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private EventListener.Factory eventListenerFactory;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean retryOnConnectionFailure;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Authenticator authenticator;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean followRedirects;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean followSslRedirects;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private CookieJar cookieJar;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Cache cache;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Dns dns;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Proxy proxy;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private ProxySelector proxySelector;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private Authenticator proxyAuthenticator;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private SocketFactory socketFactory;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private SSLSocketFactory sslSocketFactoryOrNull;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private X509TrustManager x509TrustManagerOrNull;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private List connectionSpecs;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private List protocols;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private HostnameVerifier hostnameVerifier;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private CertificatePinner certificatePinner;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private CertificateChainCleaner certificateChainCleaner;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private int callTimeout;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private int connectTimeout;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private int readTimeout;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.g(EventListener.f56012b);
            this.retryOnConnectionFailure = true;
            Authenticator authenticator = Authenticator.f55760b;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.f55998b;
            this.dns = Dns.f56009b;
            this.proxyAuthenticator = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            AbstractC6492s.h(socketFactory, "getDefault()");
            this.socketFactory = socketFactory;
            Companion companion = OkHttpClient.INSTANCE;
            this.connectionSpecs = companion.a();
            this.protocols = companion.b();
            this.hostnameVerifier = OkHostnameVerifier.f56773a;
            this.certificatePinner = CertificatePinner.f55823d;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        /* renamed from: A, reason: from getter */
        public final List getProtocols() {
            return this.protocols;
        }

        /* renamed from: B, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        /* renamed from: C, reason: from getter */
        public final Authenticator getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        /* renamed from: D, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        /* renamed from: E, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        /* renamed from: F, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        /* renamed from: G, reason: from getter */
        public final RouteDatabase getRouteDatabase() {
            return this.routeDatabase;
        }

        /* renamed from: H, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        /* renamed from: I, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* renamed from: J, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        /* renamed from: K, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        public final Builder L(HostnameVerifier hostnameVerifier) {
            AbstractC6492s.i(hostnameVerifier, "hostnameVerifier");
            if (!AbstractC6492s.d(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final Builder M(long interval, TimeUnit unit) {
            AbstractC6492s.i(unit, "unit");
            this.pingInterval = Util.k("interval", interval, unit);
            return this;
        }

        public final Builder N(List protocols) {
            AbstractC6492s.i(protocols, "protocols");
            List listL1 = AbstractC3689v.l1(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!listL1.contains(protocol) && !listL1.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listL1).toString());
            }
            if (listL1.contains(protocol) && listL1.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listL1).toString());
            }
            if (listL1.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listL1).toString());
            }
            AbstractC6492s.g(listL1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (listL1.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            listL1.remove(Protocol.SPDY_3);
            if (!AbstractC6492s.d(listL1, this.protocols)) {
                this.routeDatabase = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(listL1);
            AbstractC6492s.h(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.protocols = listUnmodifiableList;
            return this;
        }

        public final Builder O(long timeout, TimeUnit unit) {
            AbstractC6492s.i(unit, "unit");
            this.readTimeout = Util.k("timeout", timeout, unit);
            return this;
        }

        public final Builder P(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            AbstractC6492s.i(sslSocketFactory, "sslSocketFactory");
            AbstractC6492s.i(trustManager, "trustManager");
            if (!AbstractC6492s.d(sslSocketFactory, this.sslSocketFactoryOrNull) || !AbstractC6492s.d(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.INSTANCE.a(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        public final Builder Q(long timeout, TimeUnit unit) {
            AbstractC6492s.i(unit, "unit");
            this.writeTimeout = Util.k("timeout", timeout, unit);
            return this;
        }

        public final Builder a(Interceptor interceptor) {
            AbstractC6492s.i(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        public final Builder b(Interceptor interceptor) {
            AbstractC6492s.i(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        public final OkHttpClient c() {
            return new OkHttpClient(this);
        }

        public final Builder d(long timeout, TimeUnit unit) {
            AbstractC6492s.i(unit, "unit");
            this.callTimeout = Util.k("timeout", timeout, unit);
            return this;
        }

        public final Builder e(long timeout, TimeUnit unit) {
            AbstractC6492s.i(unit, "unit");
            this.connectTimeout = Util.k("timeout", timeout, unit);
            return this;
        }

        public final Builder f(CookieJar cookieJar) {
            AbstractC6492s.i(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        public final Builder g(EventListener eventListener) {
            AbstractC6492s.i(eventListener, "eventListener");
            this.eventListenerFactory = Util.g(eventListener);
            return this;
        }

        /* renamed from: h, reason: from getter */
        public final Authenticator getAuthenticator() {
            return this.authenticator;
        }

        /* renamed from: i, reason: from getter */
        public final Cache getCache() {
            return this.cache;
        }

        /* renamed from: j, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        /* renamed from: k, reason: from getter */
        public final CertificateChainCleaner getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        /* renamed from: l, reason: from getter */
        public final CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        /* renamed from: m, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        /* renamed from: n, reason: from getter */
        public final ConnectionPool getConnectionPool() {
            return this.connectionPool;
        }

        /* renamed from: o, reason: from getter */
        public final List getConnectionSpecs() {
            return this.connectionSpecs;
        }

        /* renamed from: p, reason: from getter */
        public final CookieJar getCookieJar() {
            return this.cookieJar;
        }

        /* renamed from: q, reason: from getter */
        public final Dispatcher getDispatcher() {
            return this.dispatcher;
        }

        /* renamed from: r, reason: from getter */
        public final Dns getDns() {
            return this.dns;
        }

        /* renamed from: s, reason: from getter */
        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* renamed from: t, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        /* renamed from: u, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        /* renamed from: v, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        /* renamed from: w, reason: from getter */
        public final List getInterceptors() {
            return this.interceptors;
        }

        /* renamed from: x, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        /* renamed from: y, reason: from getter */
        public final List getNetworkInterceptors() {
            return this.networkInterceptors;
        }

        /* renamed from: z, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            AbstractC6492s.i(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.getDispatcher();
            this.connectionPool = okHttpClient.getConnectionPool();
            AbstractC3689v.C(this.interceptors, okHttpClient.getInterceptors());
            AbstractC3689v.C(this.networkInterceptors, okHttpClient.getNetworkInterceptors());
            this.eventListenerFactory = okHttpClient.getEventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.getRetryOnConnectionFailure();
            this.authenticator = okHttpClient.getAuthenticator();
            this.followRedirects = okHttpClient.getFollowRedirects();
            this.followSslRedirects = okHttpClient.getFollowSslRedirects();
            this.cookieJar = okHttpClient.getCookieJar();
            this.cache = okHttpClient.getCache();
            this.dns = okHttpClient.getDns();
            this.proxy = okHttpClient.getProxy();
            this.proxySelector = okHttpClient.getProxySelector();
            this.proxyAuthenticator = okHttpClient.getProxyAuthenticator();
            this.socketFactory = okHttpClient.getSocketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.getConnectionSpecs();
            this.protocols = okHttpClient.getProtocols();
            this.hostnameVerifier = okHttpClient.getHostnameVerifier();
            this.certificatePinner = okHttpClient.getCertificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.getCallTimeoutMillis();
            this.connectTimeout = okHttpClient.getConnectTimeoutMillis();
            this.readTimeout = okHttpClient.getReadTimeoutMillis();
            this.writeTimeout = okHttpClient.getWriteTimeoutMillis();
            this.pingInterval = okHttpClient.getPingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
