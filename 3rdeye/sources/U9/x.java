package U9;

import U9.InterfaceC1608e;
import U9.o;
import com.vungle.ads.internal.network.g;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: OkHttpClient.kt */
/* loaded from: classes3.dex */
public final class x implements Cloneable, InterfaceC1608e.a {

    /* renamed from: B, reason: collision with root package name */
    public static final List<y> f12747B = V9.b.k(y.HTTP_2, y.HTTP_1_1);

    /* renamed from: C, reason: collision with root package name */
    public static final List<j> f12748C = V9.b.k(j.f12668e, j.f12669f);

    /* renamed from: A, reason: collision with root package name */
    public final H6.I f12749A;

    /* renamed from: b, reason: collision with root package name */
    public final m f12750b;

    /* renamed from: c, reason: collision with root package name */
    public final B7.e f12751c;

    /* renamed from: d, reason: collision with root package name */
    public final List<u> f12752d;

    /* renamed from: e, reason: collision with root package name */
    public final List<u> f12753e;

    /* renamed from: f, reason: collision with root package name */
    public final B8.b f12754f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12755g;

    /* renamed from: h, reason: collision with root package name */
    public final C1605b f12756h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f12757j;

    /* renamed from: k, reason: collision with root package name */
    public final l f12758k;

    /* renamed from: l, reason: collision with root package name */
    public final C1606c f12759l;

    /* renamed from: m, reason: collision with root package name */
    public final n f12760m;

    /* renamed from: n, reason: collision with root package name */
    public final ProxySelector f12761n;

    /* renamed from: o, reason: collision with root package name */
    public final C1605b f12762o;

    /* renamed from: p, reason: collision with root package name */
    public final SocketFactory f12763p;

    /* renamed from: q, reason: collision with root package name */
    public final SSLSocketFactory f12764q;

    /* renamed from: r, reason: collision with root package name */
    public final X509TrustManager f12765r;

    /* renamed from: s, reason: collision with root package name */
    public final List<j> f12766s;

    /* renamed from: t, reason: collision with root package name */
    public final List<y> f12767t;

    /* renamed from: u, reason: collision with root package name */
    public final ga.d f12768u;

    /* renamed from: v, reason: collision with root package name */
    public final C1610g f12769v;

    /* renamed from: w, reason: collision with root package name */
    public final ga.c f12770w;

    /* renamed from: x, reason: collision with root package name */
    public final int f12771x;

    /* renamed from: y, reason: collision with root package name */
    public final int f12772y;

    /* renamed from: z, reason: collision with root package name */
    public final int f12773z;

    /* compiled from: OkHttpClient.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final m f12774a = new m();

        /* renamed from: b, reason: collision with root package name */
        public final B7.e f12775b = new B7.e(2);

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f12776c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f12777d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final B8.b f12778e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f12779f;

        /* renamed from: g, reason: collision with root package name */
        public final C1605b f12780g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f12781h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public final l f12782j;

        /* renamed from: k, reason: collision with root package name */
        public C1606c f12783k;

        /* renamed from: l, reason: collision with root package name */
        public final n f12784l;

        /* renamed from: m, reason: collision with root package name */
        public g.d f12785m;

        /* renamed from: n, reason: collision with root package name */
        public final C1605b f12786n;

        /* renamed from: o, reason: collision with root package name */
        public final SocketFactory f12787o;

        /* renamed from: p, reason: collision with root package name */
        public final List<j> f12788p;

        /* renamed from: q, reason: collision with root package name */
        public final List<? extends y> f12789q;

        /* renamed from: r, reason: collision with root package name */
        public final ga.d f12790r;

        /* renamed from: s, reason: collision with root package name */
        public final C1610g f12791s;

        /* renamed from: t, reason: collision with root package name */
        public int f12792t;

        /* renamed from: u, reason: collision with root package name */
        public int f12793u;

        /* renamed from: v, reason: collision with root package name */
        public int f12794v;

        public a() {
            o.a aVar = o.f12696a;
            kotlin.jvm.internal.l.f(aVar, "<this>");
            this.f12778e = new B8.b(aVar, 6);
            this.f12779f = true;
            C1605b c1605b = C1605b.f12606a;
            this.f12780g = c1605b;
            this.f12781h = true;
            this.i = true;
            this.f12782j = l.f12690a;
            this.f12784l = n.f12695a;
            this.f12786n = c1605b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.l.e(socketFactory, "getDefault()");
            this.f12787o = socketFactory;
            this.f12788p = x.f12748C;
            this.f12789q = x.f12747B;
            this.f12790r = ga.d.f37965a;
            this.f12791s = C1610g.f12644c;
            this.f12792t = 10000;
            this.f12793u = 10000;
            this.f12794v = 10000;
        }
    }

    public x(a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.f12750b = aVar.f12774a;
        this.f12751c = aVar.f12775b;
        this.f12752d = V9.b.w(aVar.f12776c);
        this.f12753e = V9.b.w(aVar.f12777d);
        this.f12754f = aVar.f12778e;
        this.f12755g = aVar.f12779f;
        this.f12756h = aVar.f12780g;
        this.i = aVar.f12781h;
        this.f12757j = aVar.i;
        this.f12758k = aVar.f12782j;
        this.f12759l = aVar.f12783k;
        this.f12760m = aVar.f12784l;
        ProxySelector proxySelector = aVar.f12785m;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.f12761n = proxySelector == null ? fa.a.f37874a : proxySelector;
        this.f12762o = aVar.f12786n;
        this.f12763p = aVar.f12787o;
        List<j> list = aVar.f12788p;
        this.f12766s = list;
        this.f12767t = aVar.f12789q;
        this.f12768u = aVar.f12790r;
        this.f12771x = aVar.f12792t;
        this.f12772y = aVar.f12793u;
        this.f12773z = aVar.f12794v;
        this.f12749A = new H6.I(8);
        List<j> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.f12764q = null;
            this.f12770w = null;
            this.f12765r = null;
            this.f12769v = C1610g.f12644c;
        } else {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).f12670a) {
                    da.h hVar = da.h.f37600a;
                    X509TrustManager x509TrustManagerN = da.h.f37600a.n();
                    this.f12765r = x509TrustManagerN;
                    this.f12764q = da.h.f37600a.m(x509TrustManagerN);
                    ga.c cVarB = da.h.f37600a.b(x509TrustManagerN);
                    this.f12770w = cVarB;
                    C1610g c1610g = aVar.f12791s;
                    c1610g.getClass();
                    this.f12769v = kotlin.jvm.internal.l.b(c1610g.f12646b, cVarB) ? c1610g : new C1610g(c1610g.f12645a, cVarB);
                }
            }
            this.f12764q = null;
            this.f12770w = null;
            this.f12765r = null;
            this.f12769v = C1610g.f12644c;
        }
        List<u> list3 = this.f12752d;
        kotlin.jvm.internal.l.d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        List<u> list4 = this.f12753e;
        kotlin.jvm.internal.l.d(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list4).toString());
        }
        List<j> list5 = this.f12766s;
        boolean z10 = list5 instanceof Collection;
        X509TrustManager x509TrustManager = this.f12765r;
        ga.c cVar = this.f12770w;
        SSLSocketFactory sSLSocketFactory = this.f12764q;
        if (!z10 || !list5.isEmpty()) {
            Iterator<T> it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((j) it2.next()).f12670a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (cVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (cVar != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.l.b(this.f12769v, C1610g.f12644c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // U9.InterfaceC1608e.a
    public final Y9.e a(z zVar) {
        return new Y9.e(this, zVar);
    }

    public final Object clone() {
        return super.clone();
    }

    public x() {
        this(new a());
    }
}
