package fb;

import com.ui.unifi.core.base.net.client.UntrustedCertificateException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class u implements X509TrustManager {

    /* renamed from: c, reason: collision with root package name */
    public static final a f47294c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Yg.m f47295d = Yg.n.b(new InterfaceC6824a() { // from class: fb.t
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return u.e();
        }
    });

    /* renamed from: a, reason: collision with root package name */
    private final String f47296a;

    /* renamed from: b, reason: collision with root package name */
    private final Gb.f f47297b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final X509TrustManager b() {
            return (X509TrustManager) u.f47295d.getValue();
        }

        private a() {
        }
    }

    public u(String macAddress, Gb.f storage) {
        AbstractC6492s.i(macAddress, "macAddress");
        AbstractC6492s.i(storage, "storage");
        this.f47296a = macAddress;
        this.f47297b = storage;
    }

    private final void c(X509Certificate[] x509CertificateArr) throws UntrustedCertificateException {
        if (!d(this, x509CertificateArr, this.f47296a)) {
            throw new UntrustedCertificateException(x509CertificateArr, null, 2, null);
        }
    }

    private static final boolean d(u uVar, X509Certificate[] x509CertificateArr, String str) {
        if (str != null) {
            return uVar.f47297b.D(str, x509CertificateArr);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X509TrustManager e() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManager trustManager;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC6492s.h(trustManagers, "getTrustManagers(...)");
        int length = trustManagers.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                trustManager = null;
                break;
            }
            trustManager = trustManagers[i10];
            if (trustManager instanceof X509TrustManager) {
                break;
            }
            i10++;
        }
        if (trustManager instanceof X509TrustManager) {
            return (X509TrustManager) trustManager;
        }
        return null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] chain, String authType) {
        AbstractC6492s.i(chain, "chain");
        AbstractC6492s.i(authType, "authType");
        throw new UnsupportedOperationException("This implementation does not verify client certificates");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        AbstractC6492s.i(chain, "chain");
        AbstractC6492s.i(authType, "authType");
        X509TrustManager x509TrustManagerB = f47294c.b();
        if (x509TrustManagerB == null) {
            c(chain);
            return;
        }
        try {
            x509TrustManagerB.checkServerTrusted(chain, authType);
        } catch (CertificateException unused) {
            c(chain);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
