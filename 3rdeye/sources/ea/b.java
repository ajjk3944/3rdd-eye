package ea;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.l;

/* compiled from: AndroidCertificateChainCleaner.kt */
/* loaded from: classes3.dex */
public final class b extends ga.c {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f37777a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f37778b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f37777a = x509TrustManager;
        this.f37778b = x509TrustManagerExtensions;
    }

    @Override // ga.c
    public final List a(String hostname, List chain) throws CertificateException, SSLPeerUnverifiedException {
        l.f(chain, "chain");
        l.f(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f37778b.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            l.e(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f37777a == this.f37777a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f37777a);
    }
}
