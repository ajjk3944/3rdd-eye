package com.yandex.mobile.ads.impl;

import android.net.http.SslCertificate;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes3.dex */
public final class vs1 {
    public static final X509Certificate a(SslCertificate sslCertificate, CertificateFactory x509CertificateFactory) throws CertificateException {
        byte[] byteArray;
        kotlin.jvm.internal.l.f(sslCertificate, "<this>");
        kotlin.jvm.internal.l.f(x509CertificateFactory, "x509CertificateFactory");
        if (!kotlin.jvm.internal.l.b(x509CertificateFactory.getType(), "X.509")) {
            x509CertificateFactory.getType();
            fp0.b(new Object[0]);
            return null;
        }
        Bundle bundleSaveState = SslCertificate.saveState(sslCertificate);
        if (bundleSaveState != null && (byteArray = bundleSaveState.getByteArray("x509-certificate")) != null) {
            try {
                Certificate certificateGenerateCertificate = x509CertificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
                if (certificateGenerateCertificate instanceof X509Certificate) {
                    return (X509Certificate) certificateGenerateCertificate;
                }
                return null;
            } catch (CertificateException unused) {
                fp0.c(new Object[0]);
            }
        }
        return null;
    }
}
