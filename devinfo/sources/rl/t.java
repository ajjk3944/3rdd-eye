package rl;

import a0.x0;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t implements d {
    public static final List B = sl.h.k(new u[]{u.HTTP_2, u.HTTP_1_1});
    public static final List C = sl.h.k(new h[]{h.f33084e, h.f33085f});
    public final nm.d0 A;

    /* renamed from: a, reason: collision with root package name */
    public final x0 f33154a;

    /* renamed from: b, reason: collision with root package name */
    public final List f33155b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33156c;

    /* renamed from: d, reason: collision with root package name */
    public final pf.u f33157d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33158e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33159f;
    public final b g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f33160h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f33161i;
    public final b j;

    /* renamed from: k, reason: collision with root package name */
    public final b f33162k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f33163l;

    /* renamed from: m, reason: collision with root package name */
    public final b f33164m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f33165n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f33166o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f33167p;

    /* renamed from: q, reason: collision with root package name */
    public final List f33168q;

    /* renamed from: r, reason: collision with root package name */
    public final List f33169r;

    /* renamed from: s, reason: collision with root package name */
    public final fm.c f33170s;

    /* renamed from: t, reason: collision with root package name */
    public final e f33171t;

    /* renamed from: u, reason: collision with root package name */
    public final a.a f33172u;

    /* renamed from: v, reason: collision with root package name */
    public final int f33173v;

    /* renamed from: w, reason: collision with root package name */
    public final int f33174w;

    /* renamed from: x, reason: collision with root package name */
    public final int f33175x;

    /* renamed from: y, reason: collision with root package name */
    public final km.i f33176y;

    /* renamed from: z, reason: collision with root package name */
    public final ul.d f33177z;

    public t(s sVar) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        this.f33154a = sVar.f33135a;
        this.f33155b = sl.h.j(sVar.f33137c);
        this.f33156c = sl.h.j(sVar.f33138d);
        this.f33157d = sVar.f33139e;
        this.f33158e = sVar.f33140f;
        this.f33159f = sVar.g;
        this.g = sVar.f33141h;
        this.f33160h = sVar.f33142i;
        this.f33161i = sVar.j;
        this.j = sVar.f33143k;
        this.f33162k = sVar.f33144l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f33163l = proxySelector == null ? dm.a.f22285a : proxySelector;
        this.f33164m = sVar.f33145m;
        this.f33165n = sVar.f33146n;
        List list = sVar.f33147o;
        this.f33168q = list;
        this.f33169r = sVar.f33148p;
        this.f33170s = sVar.f33149q;
        this.f33173v = sVar.f33151s;
        this.f33174w = sVar.f33152t;
        this.f33175x = sVar.f33153u;
        this.f33176y = new km.i(26);
        this.f33177z = ul.d.f35543l;
        nm.d0 d0Var = sVar.f33136b;
        if (d0Var == null) {
            d0Var = new nm.d0();
            sVar.f33136b = d0Var;
        }
        this.A = d0Var;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f33086a) {
                    bm.e eVar = bm.e.f2349a;
                    bm.e.f2349a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    nk.k.b(trustManagers);
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.f33167p = x509TrustManager;
                            bm.e eVar2 = bm.e.f2349a;
                            eVar2.getClass();
                            try {
                                SSLContext sSLContextL = eVar2.l();
                                sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
                                SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                                nk.k.d(socketFactory, "getSocketFactory(...)");
                                this.f33166o = socketFactory;
                                a.a aVarC = bm.e.f2349a.c(x509TrustManager);
                                this.f33172u = aVarC;
                                e eVar3 = sVar.f33150r;
                                eVar3.getClass();
                                this.f33171t = nk.k.a(eVar3.f33057b, aVarC) ? eVar3 : new e(eVar3.f33056a, aVarC);
                            } catch (GeneralSecurityException e2) {
                                throw new AssertionError("No System TLS: " + e2, e2);
                            }
                        }
                    }
                    String string = Arrays.toString(trustManagers);
                    nk.k.d(string, "toString(...)");
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
                }
            }
            this.f33166o = null;
            this.f33172u = null;
            this.f33167p = null;
            this.f33171t = e.f33055c;
        } else {
            this.f33166o = null;
            this.f33172u = null;
            this.f33167p = null;
            this.f33171t = e.f33055c;
        }
        X509TrustManager x509TrustManager2 = this.f33167p;
        a.a aVar = this.f33172u;
        SSLSocketFactory sSLSocketFactory = this.f33166o;
        List list2 = this.f33156c;
        List list3 = this.f33155b;
        nk.k.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        nk.k.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.f33168q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((h) it2.next()).f33086a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (aVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (aVar != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!nk.k.a(this.f33171t, e.f33055c)) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
