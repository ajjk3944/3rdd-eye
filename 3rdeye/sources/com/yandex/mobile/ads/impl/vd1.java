package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hn;
import com.yandex.mobile.ads.impl.lh1;
import com.yandex.mobile.ads.impl.r50;
import com.yandex.mobile.ads.impl.yn;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class vd1 implements Cloneable, hn.a {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f34469B = 0;

    /* renamed from: a, reason: collision with root package name */
    private final n10 f34471a;

    /* renamed from: b, reason: collision with root package name */
    private final jr f34472b;

    /* renamed from: c, reason: collision with root package name */
    private final List<zo0> f34473c;

    /* renamed from: d, reason: collision with root package name */
    private final List<zo0> f34474d;

    /* renamed from: e, reason: collision with root package name */
    private final r50.b f34475e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f34476f;

    /* renamed from: g, reason: collision with root package name */
    private final vh f34477g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f34478h;
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final ks f34479j;

    /* renamed from: k, reason: collision with root package name */
    private final l30 f34480k;

    /* renamed from: l, reason: collision with root package name */
    private final ProxySelector f34481l;

    /* renamed from: m, reason: collision with root package name */
    private final vh f34482m;

    /* renamed from: n, reason: collision with root package name */
    private final SocketFactory f34483n;

    /* renamed from: o, reason: collision with root package name */
    private final SSLSocketFactory f34484o;

    /* renamed from: p, reason: collision with root package name */
    private final X509TrustManager f34485p;

    /* renamed from: q, reason: collision with root package name */
    private final List<lr> f34486q;

    /* renamed from: r, reason: collision with root package name */
    private final List<gm1> f34487r;

    /* renamed from: s, reason: collision with root package name */
    private final ud1 f34488s;

    /* renamed from: t, reason: collision with root package name */
    private final zn f34489t;

    /* renamed from: u, reason: collision with root package name */
    private final yn f34490u;

    /* renamed from: v, reason: collision with root package name */
    private final int f34491v;

    /* renamed from: w, reason: collision with root package name */
    private final int f34492w;

    /* renamed from: x, reason: collision with root package name */
    private final int f34493x;

    /* renamed from: y, reason: collision with root package name */
    private final qs1 f34494y;

    /* renamed from: z, reason: collision with root package name */
    private static final List<gm1> f34470z = t82.a(gm1.f27820g, gm1.f27818e);

    /* renamed from: A, reason: collision with root package name */
    private static final List<lr> f34468A = t82.a(lr.f30077e, lr.f30078f);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private n10 f34495a = new n10();

        /* renamed from: b, reason: collision with root package name */
        private jr f34496b = new jr();

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f34497c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f34498d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private r50.b f34499e = t82.a(r50.f32480a);

        /* renamed from: f, reason: collision with root package name */
        private boolean f34500f = true;

        /* renamed from: g, reason: collision with root package name */
        private vh f34501g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f34502h;
        private boolean i;

        /* renamed from: j, reason: collision with root package name */
        private ks f34503j;

        /* renamed from: k, reason: collision with root package name */
        private l30 f34504k;

        /* renamed from: l, reason: collision with root package name */
        private vh f34505l;

        /* renamed from: m, reason: collision with root package name */
        private SocketFactory f34506m;

        /* renamed from: n, reason: collision with root package name */
        private SSLSocketFactory f34507n;

        /* renamed from: o, reason: collision with root package name */
        private X509TrustManager f34508o;

        /* renamed from: p, reason: collision with root package name */
        private List<lr> f34509p;

        /* renamed from: q, reason: collision with root package name */
        private List<? extends gm1> f34510q;

        /* renamed from: r, reason: collision with root package name */
        private ud1 f34511r;

        /* renamed from: s, reason: collision with root package name */
        private zn f34512s;

        /* renamed from: t, reason: collision with root package name */
        private yn f34513t;

        /* renamed from: u, reason: collision with root package name */
        private int f34514u;

        /* renamed from: v, reason: collision with root package name */
        private int f34515v;

        /* renamed from: w, reason: collision with root package name */
        private int f34516w;

        public a() {
            vh vhVar = vh.f34540a;
            this.f34501g = vhVar;
            this.f34502h = true;
            this.i = true;
            this.f34503j = ks.f29762a;
            this.f34504k = l30.f29868a;
            this.f34505l = vhVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.l.e(socketFactory, "getDefault(...)");
            this.f34506m = socketFactory;
            int i = vd1.f34469B;
            this.f34509p = b.a();
            this.f34510q = b.b();
            this.f34511r = ud1.f34038a;
            this.f34512s = zn.f36553c;
            this.f34514u = 10000;
            this.f34515v = 10000;
            this.f34516w = 10000;
        }

        public final a a(long j4, TimeUnit unit) {
            kotlin.jvm.internal.l.f(unit, "unit");
            this.f34514u = t82.a(j4, unit);
            return this;
        }

        public final vh b() {
            return this.f34501g;
        }

        public final yn c() {
            return this.f34513t;
        }

        public final zn d() {
            return this.f34512s;
        }

        public final int e() {
            return this.f34514u;
        }

        public final jr f() {
            return this.f34496b;
        }

        public final List<lr> g() {
            return this.f34509p;
        }

        public final ks h() {
            return this.f34503j;
        }

        public final n10 i() {
            return this.f34495a;
        }

        public final l30 j() {
            return this.f34504k;
        }

        public final r50.b k() {
            return this.f34499e;
        }

        public final boolean l() {
            return this.f34502h;
        }

        public final boolean m() {
            return this.i;
        }

        public final ud1 n() {
            return this.f34511r;
        }

        public final ArrayList o() {
            return this.f34497c;
        }

        public final ArrayList p() {
            return this.f34498d;
        }

        public final List<gm1> q() {
            return this.f34510q;
        }

        public final vh r() {
            return this.f34505l;
        }

        public final int s() {
            return this.f34515v;
        }

        public final boolean t() {
            return this.f34500f;
        }

        public final SocketFactory u() {
            return this.f34506m;
        }

        public final SSLSocketFactory v() {
            return this.f34507n;
        }

        public final int w() {
            return this.f34516w;
        }

        public final X509TrustManager x() {
            return this.f34508o;
        }

        public final a b(long j4, TimeUnit unit) {
            kotlin.jvm.internal.l.f(unit, "unit");
            this.f34515v = t82.a(j4, unit);
            return this;
        }

        public final a a() {
            this.f34502h = true;
            return this;
        }

        public final a a(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            kotlin.jvm.internal.l.f(sslSocketFactory, "sslSocketFactory");
            kotlin.jvm.internal.l.f(trustManager, "trustManager");
            if (sslSocketFactory.equals(this.f34507n)) {
                trustManager.equals(this.f34508o);
            }
            this.f34507n = sslSocketFactory;
            this.f34513t = lh1.f29999a.a(trustManager);
            this.f34508o = trustManager;
            return this;
        }
    }

    public static final class b {
        public static List a() {
            return vd1.f34468A;
        }

        public static List b() {
            return vd1.f34470z;
        }
    }

    public vd1() {
        this(new a());
    }

    private final void y() {
        List<zo0> list = this.f34473c;
        kotlin.jvm.internal.l.d(list, "null cannot be cast to non-null type kotlin.collections.List<com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f34473c).toString());
        }
        List<zo0> list2 = this.f34474d;
        kotlin.jvm.internal.l.d(list2, "null cannot be cast to non-null type kotlin.collections.List<com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f34474d).toString());
        }
        List<lr> list3 = this.f34486q;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((lr) it.next()).a()) {
                    if (this.f34484o == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f34490u == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f34485p == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f34484o != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f34490u != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f34485p != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.l.b(this.f34489t, zn.f36553c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // com.yandex.mobile.ads.impl.hn.a
    public final tn1 a(pp1 request) {
        kotlin.jvm.internal.l.f(request, "request");
        return new tn1(this, request, false);
    }

    public final vh c() {
        return this.f34477g;
    }

    public final Object clone() {
        return super.clone();
    }

    public final zn d() {
        return this.f34489t;
    }

    public final int e() {
        return this.f34491v;
    }

    public final jr f() {
        return this.f34472b;
    }

    public final List<lr> g() {
        return this.f34486q;
    }

    public final ks h() {
        return this.f34479j;
    }

    public final n10 i() {
        return this.f34471a;
    }

    public final l30 j() {
        return this.f34480k;
    }

    public final r50.b k() {
        return this.f34475e;
    }

    public final boolean l() {
        return this.f34478h;
    }

    public final boolean m() {
        return this.i;
    }

    public final qs1 n() {
        return this.f34494y;
    }

    public final ud1 o() {
        return this.f34488s;
    }

    public final List<zo0> p() {
        return this.f34473c;
    }

    public final List<zo0> q() {
        return this.f34474d;
    }

    public final List<gm1> r() {
        return this.f34487r;
    }

    public final vh s() {
        return this.f34482m;
    }

    public final ProxySelector t() {
        return this.f34481l;
    }

    public final int u() {
        return this.f34492w;
    }

    public final boolean v() {
        return this.f34476f;
    }

    public final SocketFactory w() {
        return this.f34483n;
    }

    public final SSLSocketFactory x() {
        SSLSocketFactory sSLSocketFactory = this.f34484o;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int z() {
        return this.f34493x;
    }

    public vd1(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        kotlin.jvm.internal.l.f(builder, "builder");
        this.f34471a = builder.i();
        this.f34472b = builder.f();
        this.f34473c = t82.b(builder.o());
        this.f34474d = t82.b(builder.p());
        this.f34475e = builder.k();
        this.f34476f = builder.t();
        this.f34477g = builder.b();
        this.f34478h = builder.l();
        this.i = builder.m();
        this.f34479j = builder.h();
        this.f34480k = builder.j();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f34481l = proxySelector == null ? ld1.f29974a : proxySelector;
        this.f34482m = builder.r();
        this.f34483n = builder.u();
        List<lr> listG = builder.g();
        this.f34486q = listG;
        this.f34487r = builder.q();
        this.f34488s = builder.n();
        this.f34491v = builder.e();
        this.f34492w = builder.s();
        this.f34493x = builder.w();
        this.f34494y = new qs1();
        if ((listG instanceof Collection) && listG.isEmpty()) {
            this.f34484o = null;
            this.f34490u = null;
            this.f34485p = null;
            this.f34489t = zn.f36553c;
        } else {
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                if (((lr) it.next()).a()) {
                    if (builder.v() != null) {
                        this.f34484o = builder.v();
                        yn ynVarC = builder.c();
                        kotlin.jvm.internal.l.c(ynVarC);
                        this.f34490u = ynVarC;
                        X509TrustManager x509TrustManagerX = builder.x();
                        kotlin.jvm.internal.l.c(x509TrustManagerX);
                        this.f34485p = x509TrustManagerX;
                        this.f34489t = builder.d().a(ynVarC);
                    } else {
                        int i = lh1.f30001c;
                        lh1.a.a().getClass();
                        X509TrustManager x509TrustManagerC = lh1.c();
                        this.f34485p = x509TrustManagerC;
                        lh1 lh1VarA = lh1.a.a();
                        kotlin.jvm.internal.l.c(x509TrustManagerC);
                        lh1VarA.getClass();
                        this.f34484o = lh1.c(x509TrustManagerC);
                        yn ynVarA = yn.a.a(x509TrustManagerC);
                        this.f34490u = ynVarA;
                        zn znVarD = builder.d();
                        kotlin.jvm.internal.l.c(ynVarA);
                        this.f34489t = znVarD.a(ynVarA);
                    }
                }
            }
            this.f34484o = null;
            this.f34490u = null;
            this.f34485p = null;
            this.f34489t = zn.f36553c;
        }
        y();
    }
}
