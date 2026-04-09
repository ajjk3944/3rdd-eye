package com.yandex.mobile.ads.impl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class ws1 {

    /* renamed from: a, reason: collision with root package name */
    private final X509TrustManager f35049a;

    public ws1(iw1 trustManager) {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        this.f35049a = trustManager;
    }

    public final SSLContext a() throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{this.f35049a}, null);
            return sSLContext;
        } catch (KeyManagementException e4) {
            throw new IllegalStateException("Failed to initialize SSLContext", e4);
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No system TLS", e10);
        }
    }
}
