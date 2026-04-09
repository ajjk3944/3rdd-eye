package com.yandex.mobile.ads.impl;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class jd extends yn {

    /* renamed from: a, reason: collision with root package name */
    private final X509TrustManager f29108a;

    /* renamed from: b, reason: collision with root package name */
    private final X509TrustManagerExtensions f29109b;

    public static final class a {
        public static jd a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            kotlin.jvm.internal.l.f(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new jd(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public jd(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        kotlin.jvm.internal.l.f(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f29108a = trustManager;
        this.f29109b = x509TrustManagerExtensions;
    }

    @Override // com.yandex.mobile.ads.impl.yn
    public final List a(String hostname, List chain) throws CertificateException, SSLPeerUnverifiedException {
        kotlin.jvm.internal.l.f(chain, "chain");
        kotlin.jvm.internal.l.f(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f29109b.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            kotlin.jvm.internal.l.e(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jd) && ((jd) obj).f29108a == this.f29108a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f29108a);
    }
}
