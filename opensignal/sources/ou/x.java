package ou;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import lf.t1;
import p.l2;

/* loaded from: classes.dex */
public final class x implements Cloneable, i {
    public static final List X = pu.b.k(z.HTTP_2, z.HTTP_1_1);
    public static final List Y = pu.b.k(m.f19942e, m.f19943f);
    public final b B;
    public final boolean D;
    public final boolean E;
    public final b F;
    public final g G;
    public final b H;
    public final ProxySelector I;
    public final b J;
    public final SocketFactory K;
    public final SSLSocketFactory L;
    public final X509TrustManager M;
    public final List N;
    public final List O;
    public final HostnameVerifier P;
    public final j Q;
    public final t1 R;
    public final int S;
    public final int T;
    public final int U;
    public final long V;
    public final l2 W;

    /* renamed from: a, reason: collision with root package name */
    public final js.e f20004a;

    /* renamed from: d, reason: collision with root package name */
    public final i.g0 f20005d;

    /* renamed from: g, reason: collision with root package name */
    public final List f20006g;

    /* renamed from: r, reason: collision with root package name */
    public final List f20007r;

    /* renamed from: x, reason: collision with root package name */
    public final io.sentry.android.replay.capture.e f20008x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f20009y;

    public x(w wVar) throws NoSuchAlgorithmException, KeyStoreException {
        wVar.f19984e = new io.sentry.android.replay.capture.e(23, new io.sentry.okhttp.e(wVar.f19984e));
        this.f20004a = wVar.f19980a;
        this.f20005d = wVar.f19981b;
        this.f20006g = pu.b.w(wVar.f19982c);
        this.f20007r = pu.b.w(wVar.f19983d);
        this.f20008x = wVar.f19984e;
        this.f20009y = wVar.f19985f;
        this.B = wVar.f19986g;
        this.D = wVar.f19987h;
        this.E = wVar.f19988i;
        this.F = wVar.j;
        this.G = wVar.k;
        this.H = wVar.f19989l;
        ProxySelector proxySelector = wVar.f19990m;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.I = proxySelector == null ? zu.a.f27609a : proxySelector;
        this.J = wVar.f19991n;
        this.K = wVar.f19992o;
        List list = wVar.f19995r;
        this.N = list;
        this.O = wVar.f19996s;
        this.P = wVar.f19997t;
        this.S = wVar.f20000w;
        this.T = wVar.f20001x;
        this.U = wVar.f20002y;
        this.V = wVar.f20003z;
        l2 l2Var = wVar.A;
        this.W = l2Var == null ? new l2(12) : l2Var;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).f19944a) {
                    SSLSocketFactory sSLSocketFactory = wVar.f19993p;
                    if (sSLSocketFactory != null) {
                        this.L = sSLSocketFactory;
                        t1 t1Var = wVar.f19999v;
                        br.l.b(t1Var);
                        this.R = t1Var;
                        X509TrustManager x509TrustManager = wVar.f19994q;
                        br.l.b(x509TrustManager);
                        this.M = x509TrustManager;
                        j jVar = wVar.f19998u;
                        jVar.getClass();
                        this.Q = br.l.a(jVar.f19923b, t1Var) ? jVar : new j(jVar.f19922a, t1Var);
                    } else {
                        xu.n nVar = xu.n.f25563a;
                        X509TrustManager x509TrustManagerM = xu.n.f25563a.m();
                        this.M = x509TrustManagerM;
                        this.L = xu.n.f25563a.l(x509TrustManagerM);
                        t1 t1VarB = xu.n.f25563a.b(x509TrustManagerM);
                        this.R = t1VarB;
                        j jVar2 = wVar.f19998u;
                        jVar2.getClass();
                        this.Q = br.l.a(jVar2.f19923b, t1VarB) ? jVar2 : new j(jVar2.f19922a, t1VarB);
                    }
                }
            }
            this.L = null;
            this.R = null;
            this.M = null;
            this.Q = j.f19921c;
        } else {
            this.L = null;
            this.R = null;
            this.M = null;
            this.Q = j.f19921c;
        }
        X509TrustManager x509TrustManager2 = this.M;
        t1 t1Var2 = this.R;
        SSLSocketFactory sSLSocketFactory2 = this.L;
        List list2 = this.f20007r;
        List list3 = this.f20006g;
        br.l.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        br.l.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.N;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((m) it2.next()).f19944a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (t1Var2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (t1Var2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!br.l.a(this.Q, j.f19921c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final su.i a(a0 a0Var) {
        br.l.e(a0Var, "request");
        return new su.i(this, a0Var);
    }

    public final Object clone() {
        return super.clone();
    }

    public x() {
        this(new w());
    }
}
