package com.yandex.mobile.ads.impl;

import android.util.Log;
import b9.C1992A;
import b9.C2001h;
import b9.InterfaceC2000g;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class jw1 {

    /* renamed from: a, reason: collision with root package name */
    private final hv f29370a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2000g f29371b;

    /* renamed from: c, reason: collision with root package name */
    private KeyStore f29372c;

    /* renamed from: d, reason: collision with root package name */
    private X509TrustManager f29373d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f29374e;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<X509TrustManager> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f29375b = new a();

        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final X509TrustManager invoke() {
            X509TrustManager x509TrustManagerA = y62.a((KeyStore) null);
            if (x509TrustManagerA != null) {
                return x509TrustManagerA;
            }
            throw new IllegalArgumentException("Failed to create default TrustManager");
        }
    }

    public jw1(hv customCertificatesProvider) {
        kotlin.jvm.internal.l.f(customCertificatesProvider, "customCertificatesProvider");
        this.f29370a = customCertificatesProvider;
        this.f29371b = C2001h.b(a.f29375b);
        this.f29374e = new Object();
    }

    public final void a(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        ((X509TrustManager) this.f29371b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    public final void b(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        C1992A c1992a;
        try {
            ((X509TrustManager) this.f29371b.getValue()).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e4) {
            synchronized (this.f29374e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager = this.f29373d;
                    if (x509TrustManager != null) {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        c1992a = C1992A.f18074a;
                    } else {
                        c1992a = null;
                    }
                    if (c1992a != null) {
                        C1992A c1992a2 = C1992A.f18074a;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final X509Certificate[] c() {
        X509Certificate[] acceptedIssuers = ((X509TrustManager) this.f29371b.getValue()).getAcceptedIssuers();
        kotlin.jvm.internal.l.e(acceptedIssuers, "getAcceptedIssuers(...)");
        return acceptedIssuers;
    }

    private final void a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore;
        b();
        b();
        if (this.f29372c == null) {
            int i = y62.f35654b;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("SdkTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                byte[][] bArrA = this.f29370a.a();
                ArrayList arrayList = new ArrayList();
                for (byte[] bArr : bArrA) {
                    X509Certificate x509CertificateA = y62.a(bArr);
                    if (x509CertificateA != null) {
                        arrayList.add(x509CertificateA);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a(keyStore, (X509Certificate) it.next());
                }
                keyStore2 = keyStore;
            }
            this.f29372c = keyStore2;
        }
        b();
        if (this.f29373d == null) {
            b();
            if (this.f29372c != null) {
                b();
                this.f29373d = y62.a(this.f29372c);
            }
        }
    }

    public final void b(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        C1992A c1992a;
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) this.f29371b.getValue();
            if (y62.a()) {
                xd.b(x509TrustManager, x509CertificateArr, str, socket);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e4) {
            synchronized (this.f29374e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager2 = this.f29373d;
                    if (x509TrustManager2 != null) {
                        if (y62.a()) {
                            xd.b(x509TrustManager2, x509CertificateArr, str, socket);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
                        c1992a = C1992A.f18074a;
                    } else {
                        c1992a = null;
                    }
                    if (c1992a != null) {
                        C1992A c1992a2 = C1992A.f18074a;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static void a(KeyStore keyStore, X509Certificate x509Certificate) throws KeyStoreException {
        try {
            keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), x509Certificate);
        } catch (KeyStoreException e4) {
            Log.w("SdkTrustManager", "Failed to store certificate", e4);
        }
    }

    public final void a(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        if (y62.a()) {
            xd.a((X509TrustManager) this.f29371b.getValue(), x509CertificateArr, str, socket);
        } else {
            ((X509TrustManager) this.f29371b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    public final void b(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        C1992A c1992a;
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) this.f29371b.getValue();
            if (y62.a()) {
                xd.b(x509TrustManager, x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e4) {
            synchronized (this.f29374e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager2 = this.f29373d;
                    if (x509TrustManager2 != null) {
                        if (y62.a()) {
                            xd.b(x509TrustManager2, x509CertificateArr, str, sSLEngine);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
                        c1992a = C1992A.f18074a;
                    } else {
                        c1992a = null;
                    }
                    if (c1992a != null) {
                        C1992A c1992a2 = C1992A.f18074a;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        if (y62.a()) {
            xd.a((X509TrustManager) this.f29371b.getValue(), x509CertificateArr, str, sSLEngine);
        } else {
            ((X509TrustManager) this.f29371b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    private final void b() {
        if (!Thread.holdsLock(this.f29374e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }
}
