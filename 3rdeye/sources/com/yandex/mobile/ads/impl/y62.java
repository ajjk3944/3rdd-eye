package com.yandex.mobile.ads.impl;

import android.os.Build;
import b9.C2001h;
import b9.InterfaceC2000g;
import c9.C2097r;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class y62 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2000g f35653a = C2001h.b(a.f35655b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35654b = 0;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<CertificateFactory> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f35655b = new a();

        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final CertificateFactory invoke() {
            try {
                return CertificateFactory.getInstance("X.509");
            } catch (CertificateException unused) {
                return null;
            }
        }
    }

    public static final X509Certificate a(byte[] certBytes) {
        kotlin.jvm.internal.l.f(certBytes, "certBytes");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(certBytes);
        try {
            CertificateFactory certificateFactory = (CertificateFactory) f35653a.getValue();
            return (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static final X509TrustManager a(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            kotlin.jvm.internal.l.c(trustManagers);
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) C2097r.q0(arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static final boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
