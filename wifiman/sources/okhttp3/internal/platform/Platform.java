package okhttp3.internal.platform;

import Zg.AbstractC3689v;
import ej.C5481e;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 <2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J-\u0010&\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u001e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\u0006¨\u0006>"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "<init>", "()V", "", "g", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", SnmpConfigurator.O_CONTEXT_NAME, "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "p", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lokhttp3/Protocol;", "protocols", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", SnmpConfigurator.O_BIND_ADDRESS, "(Ljavax/net/ssl/SSLSocket;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", SnmpConfigurator.O_ADDRESS, "", "connectTimeout", "f", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "message", "level", "", SnmpConfigurator.O_TIMEOUT, "k", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "", "j", "(Ljava/lang/String;)Z", "closer", "i", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", "m", "(Ljava/lang/String;Ljava/lang/Object;)V", "trustManager", "Lokhttp3/internal/tls/CertificateChainCleaner;", SnmpConfigurator.O_COMMUNITY, "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "d", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;", "Ljavax/net/ssl/SSLSocketFactory;", SnmpConfigurator.O_OPERATION, "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", SnmpConfigurator.O_AUTH_PROTOCOL, "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class Platform {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Platform f56729b;

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f56730c;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "<init>", "()V", "Lokhttp3/internal/platform/Platform;", "f", "()Lokhttp3/internal/platform/Platform;", "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "g", "", "Lokhttp3/Protocol;", "protocols", "", SnmpConfigurator.O_BIND_ADDRESS, "(Ljava/util/List;)Ljava/util/List;", "", SnmpConfigurator.O_COMMUNITY, "(Ljava/util/List;)[B", "", "j", "()Z", "isConscryptPreferred", "k", "isOpenJSSEPreferred", "i", "isBouncyCastlePreferred", "h", "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "platform", "Lokhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Platform d() {
            AndroidLog.f56735a.b();
            Platform platformA = Android10Platform.INSTANCE.a();
            if (platformA != null) {
                return platformA;
            }
            Platform platformA2 = AndroidPlatform.f56701f.a();
            AbstractC6492s.f(platformA2);
            return platformA2;
        }

        private final Platform e() {
            OpenJSSEPlatform openJSSEPlatformA;
            BouncyCastlePlatform bouncyCastlePlatformA;
            ConscryptPlatform conscryptPlatformB;
            if (j() && (conscryptPlatformB = ConscryptPlatform.INSTANCE.b()) != null) {
                return conscryptPlatformB;
            }
            if (i() && (bouncyCastlePlatformA = BouncyCastlePlatform.INSTANCE.a()) != null) {
                return bouncyCastlePlatformA;
            }
            if (k() && (openJSSEPlatformA = OpenJSSEPlatform.INSTANCE.a()) != null) {
                return openJSSEPlatformA;
            }
            Jdk9Platform jdk9PlatformA = Jdk9Platform.INSTANCE.a();
            if (jdk9PlatformA != null) {
                return jdk9PlatformA;
            }
            Platform platformA = Jdk8WithJettyBootPlatform.INSTANCE.a();
            return platformA != null ? platformA : new Platform();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Platform f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return AbstractC6492s.d("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return AbstractC6492s.d("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return AbstractC6492s.d("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List b(List protocols) {
            AbstractC6492s.i(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).getProtocol());
            }
            return arrayList2;
        }

        public final byte[] c(List protocols) {
            AbstractC6492s.i(protocols, "protocols");
            C5481e c5481e = new C5481e();
            for (String str : b(protocols)) {
                c5481e.u(str.length());
                c5481e.F(str);
            }
            return c5481e.r();
        }

        public final Platform g() {
            return Platform.f56729b;
        }

        public final boolean h() {
            return AbstractC6492s.d("Dalvik", System.getProperty("java.vm.name"));
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f56729b = companion.f();
        f56730c = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static /* synthetic */ void l(Platform platform, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        platform.k(str, i10, th2);
    }

    public void b(SSLSocket sslSocket) {
        AbstractC6492s.i(sslSocket, "sslSocket");
    }

    public CertificateChainCleaner c(X509TrustManager trustManager) {
        AbstractC6492s.i(trustManager, "trustManager");
        return new BasicCertificateChainCleaner(d(trustManager));
    }

    public TrustRootIndex d(X509TrustManager trustManager) {
        AbstractC6492s.i(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        AbstractC6492s.h(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String hostname, List protocols) {
        AbstractC6492s.i(sslSocket, "sslSocket");
        AbstractC6492s.i(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int connectTimeout) throws IOException {
        AbstractC6492s.i(socket, "socket");
        AbstractC6492s.i(address, "address");
        socket.connect(address, connectTimeout);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sslSocket) {
        AbstractC6492s.i(sslSocket, "sslSocket");
        return null;
    }

    public Object i(String closer) {
        AbstractC6492s.i(closer, "closer");
        if (f56730c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean j(String hostname) {
        AbstractC6492s.i(hostname, "hostname");
        return true;
    }

    public void k(String message, int level, Throwable t10) {
        AbstractC6492s.i(message, "message");
        f56730c.log(level == 5 ? Level.WARNING : Level.INFO, message, t10);
    }

    public void m(String message, Object stackTrace) {
        AbstractC6492s.i(message, "message");
        if (stackTrace == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(message, 5, (Throwable) stackTrace);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC6492s.h(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager trustManager) throws KeyManagementException {
        AbstractC6492s.i(trustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            AbstractC6492s.h(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC6492s.f(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC6492s.g(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        AbstractC6492s.h(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        AbstractC6492s.h(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
