package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.services.core.network.core.OkHttp3Client;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z8.r;

@SuppressSignatureCheck
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 52\u00020\u0001:\u000256B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0011\u0010\u0019\u001a\r\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u00180\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "Ly8/s;", "connectSocket", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "closer", "", "getStackTraceForCloseable", "(Ljava/lang/String;)Ljava/lang/Object;", PglCryptUtils.KEY_MESSAGE, "stackTrace", "logCloseableLeak", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "isCleartextTrafficPermitted", "(Ljava/lang/String;)Z", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;", "Lokhttp3/internal/platform/android/SocketAdapter;", "socketAdapters", "Ljava/util/List;", "Lokhttp3/internal/platform/android/CloseGuard;", "closeGuard", "Lokhttp3/internal/platform/android/CloseGuard;", "Companion", "CustomTrustRootIndex", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidPlatform extends Platform {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean isSupported;

    @NotNull
    private final CloseGuard closeGuard;

    @NotNull
    private final List<SocketAdapter> socketAdapters;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @Nullable
        public final Platform buildIfSupported() {
            if (isSupported()) {
                return new AndroidPlatform();
            }
            return null;
        }

        public final boolean isSupported() {
            return AndroidPlatform.isSupported;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "findByIssuerAndSignatureMethod", "Ljava/lang/reflect/Method;", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "component1", "component2", "copy", "equals", "", "other", "", "findByIssuerAndSignature", "Ljava/security/cert/X509Certificate;", "cert", "hashCode", "", "toString", "", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class CustomTrustRootIndex implements TrustRootIndex {

        @NotNull
        private final Method findByIssuerAndSignatureMethod;

        @NotNull
        private final X509TrustManager trustManager;

        public CustomTrustRootIndex(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            p.e(trustManager, "trustManager");
            p.e(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.trustManager = trustManager;
            this.findByIssuerAndSignatureMethod = findByIssuerAndSignatureMethod;
        }

        /* renamed from: component1, reason: from getter */
        private final X509TrustManager getTrustManager() {
            return this.trustManager;
        }

        /* renamed from: component2, reason: from getter */
        private final Method getFindByIssuerAndSignatureMethod() {
            return this.findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ CustomTrustRootIndex copy$default(CustomTrustRootIndex customTrustRootIndex, X509TrustManager x509TrustManager, Method method, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                x509TrustManager = customTrustRootIndex.trustManager;
            }
            if ((i10 & 2) != 0) {
                method = customTrustRootIndex.findByIssuerAndSignatureMethod;
            }
            return customTrustRootIndex.copy(x509TrustManager, method);
        }

        @NotNull
        public final CustomTrustRootIndex copy(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            p.e(trustManager, "trustManager");
            p.e(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            return new CustomTrustRootIndex(trustManager, findByIssuerAndSignatureMethod);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) other;
            return p.a(this.trustManager, customTrustRootIndex.trustManager) && p.a(this.findByIssuerAndSignatureMethod, customTrustRootIndex.findByIssuerAndSignatureMethod);
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        @Nullable
        public X509Certificate findByIssuerAndSignature(@NotNull X509Certificate cert) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            p.e(cert, "cert");
            try {
                Object objInvoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, cert);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return (this.trustManager.hashCode() * 31) + this.findByIssuerAndSignatureMethod.hashCode();
        }

        @NotNull
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ')';
        }
    }

    static {
        boolean z10 = false;
        if (Platform.INSTANCE.isAndroid() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        isSupported = z10;
    }

    public AndroidPlatform() {
        List listM = r.m(StandardAndroidSocketAdapter.Companion.buildIfSupported$default(StandardAndroidSocketAdapter.INSTANCE, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.INSTANCE.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.INSTANCE.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.INSTANCE.getFactory()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
        this.closeGuard = CloseGuard.INSTANCE.get();
    }

    @Override // okhttp3.internal.platform.Platform
    @NotNull
    public CertificateChainCleaner buildCertificateChainCleaner(@NotNull X509TrustManager trustManager) {
        p.e(trustManager, "trustManager");
        AndroidCertificateChainCleaner androidCertificateChainCleanerBuildIfSupported = AndroidCertificateChainCleaner.INSTANCE.buildIfSupported(trustManager);
        return androidCertificateChainCleanerBuildIfSupported == null ? super.buildCertificateChainCleaner(trustManager) : androidCertificateChainCleanerBuildIfSupported;
    }

    @Override // okhttp3.internal.platform.Platform
    @NotNull
    public TrustRootIndex buildTrustRootIndex(@NotNull X509TrustManager trustManager) throws NoSuchMethodException, SecurityException {
        p.e(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            p.d(method, "method");
            return new CustomTrustRootIndex(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@NotNull SSLSocket sslSocket, @Nullable String hostname, @NotNull List<Protocol> protocols) {
        Object next;
        p.e(sslSocket, "sslSocket");
        p.e(protocols, "protocols");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((SocketAdapter) next).matchesSocket(sslSocket)) {
                    break;
                }
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter == null) {
            return;
        }
        socketAdapter.configureTlsExtensions(sslSocket, hostname, protocols);
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(@NotNull Socket socket, @NotNull InetSocketAddress address, int connectTimeout) throws IOException {
        p.e(socket, "socket");
        p.e(address, "address");
        try {
            socket.connect(address, connectTimeout);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sslSocket) {
        Object next;
        p.e(sslSocket, "sslSocket");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SocketAdapter) next).matchesSocket(sslSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter == null) {
            return null;
        }
        return socketAdapter.getSelectedProtocol(sslSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public Object getStackTraceForCloseable(@NotNull String closer) {
        p.e(closer, "closer");
        return this.closeGuard.createAndOpen(closer);
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(@NotNull String hostname) {
        p.e(hostname, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(@NotNull String message, @Nullable Object stackTrace) {
        p.e(message, "message");
        if (this.closeGuard.warnIfOpen(stackTrace)) {
            return;
        }
        Platform.log$default(this, message, 5, null, 4, null);
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sslSocketFactory) {
        Object next;
        p.e(sslSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SocketAdapter) next).matchesSocketFactory(sslSocketFactory)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter == null) {
            return null;
        }
        return socketAdapter.trustManager(sslSocketFactory);
    }
}
