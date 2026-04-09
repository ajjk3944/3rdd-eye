package da;

import U9.y;
import c9.C2092m;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.l;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* compiled from: ConscryptPlatform.kt */
/* loaded from: classes3.dex */
public final class d extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f37586d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f37587c;

    /* compiled from: ConscryptPlatform.kt */
    public static final class a {
        public static boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != 2) {
                if (version.major() <= 2) {
                    return false;
                }
            } else if (version.minor() != 1) {
                if (version.minor() <= 1) {
                    return false;
                }
            } else if (version.patch() < 0) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37588a = new b();
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, a.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (a.a()) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f37586d = z10;
    }

    public d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        l.e(providerNewProvider, "newProvider()");
        this.f37587c = providerNewProvider;
    }

    @Override // da.h
    public final void d(SSLSocket sSLSocket, String str, List<y> protocols) {
        l.f(protocols, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((y) obj) != y.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((y) it.next()).toString());
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // da.h
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // da.h
    public final SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f37587c);
        l.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // da.h
    public final SSLSocketFactory m(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContextL = l();
        sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
        l.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // da.h
    public final X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l.c(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                l.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f37588a);
                return x509TrustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        l.e(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
