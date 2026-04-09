package cm;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends a.a {

    /* renamed from: d, reason: collision with root package name */
    public final X509TrustManager f2954d;

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManagerExtensions f2955e;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f2954d = x509TrustManager;
        this.f2955e = x509TrustManagerExtensions;
    }

    @Override // a.a
    public final List b(List list, String str) throws CertificateException, SSLPeerUnverifiedException {
        nk.k.e(list, "chain");
        nk.k.e(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f2955e.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            nk.k.d(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f2954d == this.f2954d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2954d);
    }
}
