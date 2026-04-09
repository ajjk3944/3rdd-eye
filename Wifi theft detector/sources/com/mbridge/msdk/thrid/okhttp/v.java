package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.r;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public class v implements Cloneable {
    static final List<w> A = com.mbridge.msdk.thrid.okhttp.internal.c.a(w.HTTP_2, w.HTTP_1_1);
    static final List<j> B = com.mbridge.msdk.thrid.okhttp.internal.c.a(j.f17987h, j.f17989j);

    /* renamed from: a, reason: collision with root package name */
    final m f18058a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    final Proxy f18059b;

    /* renamed from: c, reason: collision with root package name */
    final List<w> f18060c;

    /* renamed from: d, reason: collision with root package name */
    final List<j> f18061d;

    /* renamed from: e, reason: collision with root package name */
    final List<t> f18062e;

    /* renamed from: f, reason: collision with root package name */
    final List<t> f18063f;

    /* renamed from: g, reason: collision with root package name */
    final o.c f18064g;

    /* renamed from: h, reason: collision with root package name */
    final ProxySelector f18065h;

    /* renamed from: i, reason: collision with root package name */
    final l f18066i;

    /* renamed from: j, reason: collision with root package name */
    final SocketFactory f18067j;

    /* renamed from: k, reason: collision with root package name */
    final SSLSocketFactory f18068k;

    /* renamed from: l, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.tls.c f18069l;

    /* renamed from: m, reason: collision with root package name */
    final HostnameVerifier f18070m;

    /* renamed from: n, reason: collision with root package name */
    final f f18071n;

    /* renamed from: o, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.b f18072o;

    /* renamed from: p, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.b f18073p;

    /* renamed from: q, reason: collision with root package name */
    final i f18074q;

    /* renamed from: r, reason: collision with root package name */
    final n f18075r;

    /* renamed from: s, reason: collision with root package name */
    final boolean f18076s;

    /* renamed from: t, reason: collision with root package name */
    final boolean f18077t;

    /* renamed from: u, reason: collision with root package name */
    final boolean f18078u;

    /* renamed from: v, reason: collision with root package name */
    final int f18079v;

    /* renamed from: w, reason: collision with root package name */
    final int f18080w;

    /* renamed from: x, reason: collision with root package name */
    final int f18081x;

    /* renamed from: y, reason: collision with root package name */
    final int f18082y;

    /* renamed from: z, reason: collision with root package name */
    final int f18083z;

    public static class a extends com.mbridge.msdk.thrid.okhttp.internal.a {
        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str) {
            aVar.a(str);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void b(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            iVar.b(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str, String str2) {
            aVar.b(str, str2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            return iVar.a(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
            return iVar.a(aVar, gVar, c0Var);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.a aVar2) {
            return aVar.a(aVar2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public Socket a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
            return iVar.a(aVar, gVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.d a(i iVar) {
            return iVar.f17621e;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public int a(a0.a aVar) {
            return aVar.f17490c;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(j jVar, SSLSocket sSLSocket, boolean z10) {
            jVar.a(sSLSocket, z10);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        @Nullable
        public IOException a(d dVar, @Nullable IOException iOException) {
            return ((x) dVar).a(iOException);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        m f18084a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        Proxy f18085b;

        /* renamed from: c, reason: collision with root package name */
        List<w> f18086c;

        /* renamed from: d, reason: collision with root package name */
        List<j> f18087d;

        /* renamed from: e, reason: collision with root package name */
        final List<t> f18088e;

        /* renamed from: f, reason: collision with root package name */
        final List<t> f18089f;

        /* renamed from: g, reason: collision with root package name */
        o.c f18090g;

        /* renamed from: h, reason: collision with root package name */
        ProxySelector f18091h;

        /* renamed from: i, reason: collision with root package name */
        l f18092i;

        /* renamed from: j, reason: collision with root package name */
        SocketFactory f18093j;

        /* renamed from: k, reason: collision with root package name */
        @Nullable
        SSLSocketFactory f18094k;

        /* renamed from: l, reason: collision with root package name */
        @Nullable
        com.mbridge.msdk.thrid.okhttp.internal.tls.c f18095l;

        /* renamed from: m, reason: collision with root package name */
        HostnameVerifier f18096m;

        /* renamed from: n, reason: collision with root package name */
        f f18097n;

        /* renamed from: o, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.b f18098o;

        /* renamed from: p, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.b f18099p;

        /* renamed from: q, reason: collision with root package name */
        i f18100q;

        /* renamed from: r, reason: collision with root package name */
        n f18101r;

        /* renamed from: s, reason: collision with root package name */
        boolean f18102s;

        /* renamed from: t, reason: collision with root package name */
        boolean f18103t;

        /* renamed from: u, reason: collision with root package name */
        boolean f18104u;

        /* renamed from: v, reason: collision with root package name */
        int f18105v;

        /* renamed from: w, reason: collision with root package name */
        int f18106w;

        /* renamed from: x, reason: collision with root package name */
        int f18107x;

        /* renamed from: y, reason: collision with root package name */
        int f18108y;

        /* renamed from: z, reason: collision with root package name */
        int f18109z;

        public b() {
            this.f18088e = new ArrayList();
            this.f18089f = new ArrayList();
            this.f18084a = new m();
            this.f18086c = v.A;
            this.f18087d = v.B;
            this.f18090g = o.factory(o.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f18091h = proxySelector;
            if (proxySelector == null) {
                this.f18091h = new com.mbridge.msdk.thrid.okhttp.internal.proxy.a();
            }
            this.f18092i = l.f18011a;
            this.f18093j = SocketFactory.getDefault();
            this.f18096m = com.mbridge.msdk.thrid.okhttp.internal.tls.d.f17983a;
            this.f18097n = f.f17537c;
            com.mbridge.msdk.thrid.okhttp.b bVar = com.mbridge.msdk.thrid.okhttp.b.f17500a;
            this.f18098o = bVar;
            this.f18099p = bVar;
            this.f18100q = new i();
            this.f18101r = n.f18020a;
            this.f18102s = true;
            this.f18103t = true;
            this.f18104u = true;
            this.f18105v = 0;
            this.f18106w = 10000;
            this.f18107x = 10000;
            this.f18108y = 10000;
            this.f18109z = 0;
        }

        public b a(long j10, TimeUnit timeUnit) {
            this.f18105v = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b b(long j10, TimeUnit timeUnit) {
            this.f18106w = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b c(long j10, TimeUnit timeUnit) {
            this.f18109z = com.mbridge.msdk.thrid.okhttp.internal.c.a("interval", j10, timeUnit);
            return this;
        }

        public b d(long j10, TimeUnit timeUnit) {
            this.f18107x = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b e(long j10, TimeUnit timeUnit) {
            this.f18108y = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b a(n nVar) {
            if (nVar == null) {
                throw new NullPointerException("dns == null");
            }
            this.f18101r = nVar;
            return this;
        }

        public b b(boolean z10) {
            this.f18104u = z10;
            return this;
        }

        public b a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f18096m = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public b a(i iVar) {
            if (iVar != null) {
                this.f18100q = iVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        public b a(boolean z10) {
            this.f18103t = z10;
            return this;
        }

        public b a(m mVar) {
            if (mVar != null) {
                this.f18084a = mVar;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public b a(List<w> list) {
            ArrayList arrayList = new ArrayList(list);
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(wVar) && !arrayList.contains(w.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(wVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (!arrayList.contains(w.HTTP_1_0)) {
                if (!arrayList.contains(null)) {
                    arrayList.remove(w.SPDY_3);
                    this.f18086c = Collections.unmodifiableList(arrayList);
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
        }

        public b a(o oVar) {
            if (oVar != null) {
                this.f18090g = o.factory(oVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        public v a() {
            return new v(this);
        }

        public b(v vVar) {
            ArrayList arrayList = new ArrayList();
            this.f18088e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f18089f = arrayList2;
            this.f18084a = vVar.f18058a;
            this.f18085b = vVar.f18059b;
            this.f18086c = vVar.f18060c;
            this.f18087d = vVar.f18061d;
            arrayList.addAll(vVar.f18062e);
            arrayList2.addAll(vVar.f18063f);
            this.f18090g = vVar.f18064g;
            this.f18091h = vVar.f18065h;
            this.f18092i = vVar.f18066i;
            this.f18093j = vVar.f18067j;
            this.f18094k = vVar.f18068k;
            this.f18095l = vVar.f18069l;
            this.f18096m = vVar.f18070m;
            this.f18097n = vVar.f18071n;
            this.f18098o = vVar.f18072o;
            this.f18099p = vVar.f18073p;
            this.f18100q = vVar.f18074q;
            this.f18101r = vVar.f18075r;
            this.f18102s = vVar.f18076s;
            this.f18103t = vVar.f18077t;
            this.f18104u = vVar.f18078u;
            this.f18105v = vVar.f18079v;
            this.f18106w = vVar.f18080w;
            this.f18107x = vVar.f18081x;
            this.f18108y = vVar.f18082y;
            this.f18109z = vVar.f18083z;
        }
    }

    static {
        com.mbridge.msdk.thrid.okhttp.internal.a.f17624a = new a();
    }

    public v() {
        this(new b());
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) throws KeyManagementException {
        try {
            SSLContext sSLContextE = com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().e();
            sSLContextE.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextE.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("No System TLS", (Exception) e10);
        }
    }

    public SocketFactory A() {
        return this.f18067j;
    }

    public SSLSocketFactory B() {
        return this.f18068k;
    }

    public int C() {
        return this.f18082y;
    }

    public int b() {
        return this.f18079v;
    }

    public f c() {
        return this.f18071n;
    }

    public int e() {
        return this.f18080w;
    }

    public i f() {
        return this.f18074q;
    }

    public List<j> g() {
        return this.f18061d;
    }

    public l i() {
        return this.f18066i;
    }

    public m j() {
        return this.f18058a;
    }

    public n k() {
        return this.f18075r;
    }

    public o.c l() {
        return this.f18064g;
    }

    public boolean m() {
        return this.f18077t;
    }

    public boolean n() {
        return this.f18076s;
    }

    public HostnameVerifier o() {
        return this.f18070m;
    }

    public List<t> p() {
        return this.f18062e;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.cache.c q() {
        return null;
    }

    public List<t> r() {
        return this.f18063f;
    }

    public b s() {
        return new b(this);
    }

    public int t() {
        return this.f18083z;
    }

    public List<w> u() {
        return this.f18060c;
    }

    @Nullable
    public Proxy v() {
        return this.f18059b;
    }

    public com.mbridge.msdk.thrid.okhttp.b w() {
        return this.f18072o;
    }

    public ProxySelector x() {
        return this.f18065h;
    }

    public int y() {
        return this.f18081x;
    }

    public boolean z() {
        return this.f18078u;
    }

    public v(b bVar) throws NoSuchAlgorithmException, KeyStoreException {
        boolean z10;
        this.f18058a = bVar.f18084a;
        this.f18059b = bVar.f18085b;
        this.f18060c = bVar.f18086c;
        List<j> list = bVar.f18087d;
        this.f18061d = list;
        this.f18062e = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f18088e);
        this.f18063f = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f18089f);
        this.f18064g = bVar.f18090g;
        this.f18065h = bVar.f18091h;
        this.f18066i = bVar.f18092i;
        this.f18067j = bVar.f18093j;
        Iterator<j> it = list.iterator();
        loop0: while (true) {
            z10 = false;
            while (it.hasNext()) {
                z10 = (z10 || it.next().b()) ? true : z10;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f18094k;
        if (sSLSocketFactory == null && z10) {
            X509TrustManager x509TrustManagerA = com.mbridge.msdk.thrid.okhttp.internal.c.a();
            this.f18068k = a(x509TrustManagerA);
            this.f18069l = com.mbridge.msdk.thrid.okhttp.internal.tls.c.a(x509TrustManagerA);
        } else {
            this.f18068k = sSLSocketFactory;
            this.f18069l = bVar.f18095l;
        }
        if (this.f18068k != null) {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f18068k);
        }
        this.f18070m = bVar.f18096m;
        this.f18071n = bVar.f18097n.a(this.f18069l);
        this.f18072o = bVar.f18098o;
        this.f18073p = bVar.f18099p;
        this.f18074q = bVar.f18100q;
        this.f18075r = bVar.f18101r;
        this.f18076s = bVar.f18102s;
        this.f18077t = bVar.f18103t;
        this.f18078u = bVar.f18104u;
        this.f18079v = bVar.f18105v;
        this.f18080w = bVar.f18106w;
        this.f18081x = bVar.f18107x;
        this.f18082y = bVar.f18108y;
        this.f18083z = bVar.f18109z;
        if (this.f18062e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f18062e);
        }
        if (this.f18063f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f18063f);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.b a() {
        return this.f18073p;
    }

    public d a(y yVar) {
        return x.a(this, yVar, false);
    }
}
