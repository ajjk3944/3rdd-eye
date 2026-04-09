package yu;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import lf.t1;

/* loaded from: classes.dex */
public final class b extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f26457a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f26458b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f26457a = x509TrustManager;
        this.f26458b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f26457a == this.f26457a;
    }

    @Override // lf.t1
    public final List g(String str, List list) throws CertificateException, SSLPeerUnverifiedException {
        br.l.e(list, "chain");
        br.l.e(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f26458b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            br.l.d(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f26457a);
    }
}
