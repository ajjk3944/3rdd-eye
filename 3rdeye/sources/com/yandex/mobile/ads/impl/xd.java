package com.yandex.mobile.ads.impl;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class xd {
    public static final void a(X509TrustManager trustManager, X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        if (Y3.b(trustManager)) {
            Z3.a(trustManager).checkClientTrusted(x509CertificateArr, str, socket);
        } else {
            trustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    public static final void b(X509TrustManager trustManager, X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        if (Y3.b(trustManager)) {
            Z3.a(trustManager).checkServerTrusted(x509CertificateArr, str, socket);
        } else {
            trustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    public static final void a(X509TrustManager trustManager, X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        if (Y3.b(trustManager)) {
            Z3.a(trustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            trustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    public static final void b(X509TrustManager trustManager, X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        if (Y3.b(trustManager)) {
            Z3.a(trustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            trustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    public static final iw1 a(hv customCertificatesProvider) throws CertificateException {
        kotlin.jvm.internal.l.f(customCertificatesProvider, "customCertificatesProvider");
        return new yu1(customCertificatesProvider);
    }
}
