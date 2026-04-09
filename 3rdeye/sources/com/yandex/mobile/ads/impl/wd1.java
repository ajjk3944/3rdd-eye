package com.yandex.mobile.ads.impl;

import c9.C2097r;
import com.yandex.mobile.ads.impl.vd1;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class wd1 {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<xd1, vd1> f34910a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final w62 f34911b = new w62();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f34912c = 0;

    public static vd1 a(int i, int i10, SSLSocketFactory sSLSocketFactory) throws NoSuchAlgorithmException, KeyStoreException {
        f34911b.getClass();
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        SSLSocketFactory sSLSocketFactory2 = null;
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.l.c(trustManagers);
        ArrayList arrayList = new ArrayList();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                arrayList.add(trustManager);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) C2097r.q0(arrayList);
        if (sSLSocketFactory != null && x509TrustManager != null) {
            sSLSocketFactory2 = sSLSocketFactory;
        }
        xd1 xd1Var = new xd1(i, i10, sSLSocketFactory2);
        ConcurrentHashMap<xd1, vd1> concurrentHashMap = f34910a;
        if (!concurrentHashMap.containsKey(xd1Var)) {
            vd1.a aVar = new vd1.a();
            long j4 = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            vd1.a aVarA = aVar.a(j4, timeUnit).b(i10, timeUnit).a();
            if (sSLSocketFactory != null && x509TrustManager != null) {
                aVarA = aVarA.a(sSLSocketFactory, x509TrustManager);
            }
            concurrentHashMap.put(xd1Var, new vd1(aVarA));
        }
        vd1 vd1Var = concurrentHashMap.get(xd1Var);
        if (vd1Var != null) {
            return vd1Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
