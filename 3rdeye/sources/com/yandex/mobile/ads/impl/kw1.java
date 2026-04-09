package com.yandex.mobile.ads.impl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* loaded from: classes3.dex */
public final class kw1 implements iw1 {

    /* renamed from: a, reason: collision with root package name */
    private final jw1 f29803a;

    public kw1(cu1 customCertificatesProvider) {
        kotlin.jvm.internal.l.f(customCertificatesProvider, "customCertificatesProvider");
        this.f29803a = new jw1(customCertificatesProvider);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f29803a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f29803a.b(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f29803a.c();
    }
}
