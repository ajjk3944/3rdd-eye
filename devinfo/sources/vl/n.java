package vl;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import ec.t0;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import rl.d0;
import rl.t;
import rl.u;
import yl.c0;
import yl.y;
import yl.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends yl.n implements wl.e {

    /* renamed from: b, reason: collision with root package name */
    public final ul.d f36348b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f36349c;

    /* renamed from: d, reason: collision with root package name */
    public final Socket f36350d;

    /* renamed from: e, reason: collision with root package name */
    public final Socket f36351e;

    /* renamed from: f, reason: collision with root package name */
    public final rl.l f36352f;
    public final u g;

    /* renamed from: h, reason: collision with root package name */
    public final i0.f f36353h;

    /* renamed from: i, reason: collision with root package name */
    public yl.q f36354i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f36355k;

    /* renamed from: l, reason: collision with root package name */
    public int f36356l;

    /* renamed from: m, reason: collision with root package name */
    public int f36357m;

    /* renamed from: n, reason: collision with root package name */
    public int f36358n;

    /* renamed from: o, reason: collision with root package name */
    public int f36359o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f36360p;

    /* renamed from: q, reason: collision with root package name */
    public long f36361q;

    public n(ul.d dVar, t0 t0Var, d0 d0Var, Socket socket, Socket socket2, rl.l lVar, u uVar, i0.f fVar) {
        nk.k.e(dVar, "taskRunner");
        nk.k.e(t0Var, "connectionPool");
        nk.k.e(d0Var, "route");
        nk.k.e(socket, "rawSocket");
        nk.k.e(socket2, "javaNetSocket");
        nk.k.e(uVar, "protocol");
        nk.k.e(fVar, "socket");
        this.f36348b = dVar;
        this.f36349c = d0Var;
        this.f36350d = socket;
        this.f36351e = socket2;
        this.f36352f = lVar;
        this.g = uVar;
        this.f36353h = fVar;
        this.f36359o = 1;
        this.f36360p = new ArrayList();
        this.f36361q = Long.MAX_VALUE;
    }

    public static void c(t tVar, d0 d0Var, IOException iOException) {
        nk.k.e(d0Var, "failedRoute");
        nk.k.e(iOException, "failure");
        if (d0Var.f33053b.type() != Proxy.Type.DIRECT) {
            rl.a aVar = d0Var.f33052a;
            aVar.g.connectFailed(aVar.f33026h.h(), d0Var.f33053b.address(), iOException);
        }
        km.i iVar = tVar.f33176y;
        synchronized (iVar) {
            ((LinkedHashSet) iVar.f28426b).add(d0Var);
        }
    }

    @Override // yl.n
    public final void a(yl.q qVar, c0 c0Var) {
        nk.k.e(c0Var, "settings");
        synchronized (this) {
            this.f36359o = (c0Var.f37673a & 8) != 0 ? c0Var.f37674b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // yl.n
    public final void b(y yVar) {
        yVar.c(yl.b.REFUSED_STREAM, null);
    }

    @Override // wl.e
    public final void cancel() {
        sl.h.c(this.f36350d);
    }

    public final void d() {
        synchronized (this) {
            this.f36357m++;
        }
    }

    @Override // wl.e
    public final void e() {
        synchronized (this) {
            this.j = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(rl.a r11, java.util.List r12) {
        /*
            r10 = this;
            java.lang.String r0 = "hostname"
            rl.n r1 = r11.f33026h
            java.util.TimeZone r2 = sl.h.f33837a
            java.util.ArrayList r2 = r10.f36360p
            int r2 = r2.size()
            int r3 = r10.f36359o
            r4 = 0
            if (r2 >= r3) goto Ldf
            boolean r2 = r10.j
            if (r2 == 0) goto L17
            goto Ldf
        L17:
            rl.d0 r2 = r10.f36349c
            rl.a r3 = r2.f33052a
            rl.a r5 = r2.f33052a
            boolean r3 = r3.a(r11)
            if (r3 != 0) goto L25
            goto Ldf
        L25:
            java.lang.String r3 = r1.f33116d
            java.lang.String r6 = r1.f33116d
            rl.n r7 = r5.f33026h
            java.lang.String r7 = r7.f33116d
            boolean r3 = nk.k.a(r3, r7)
            r7 = 1
            if (r3 == 0) goto L35
            return r7
        L35:
            yl.q r3 = r10.f36354i
            if (r3 != 0) goto L3b
            goto Ldf
        L3b:
            if (r12 == 0) goto Ldf
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L45
            goto Ldf
        L45:
            java.util.Iterator r12 = r12.iterator()
        L49:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto Ldf
            java.lang.Object r3 = r12.next()
            rl.d0 r3 = (rl.d0) r3
            java.net.Proxy r8 = r3.f33053b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 != r9) goto L49
            java.net.Proxy r8 = r2.f33053b
            java.net.Proxy$Type r8 = r8.type()
            if (r8 != r9) goto L49
            java.net.InetSocketAddress r8 = r2.f33054c
            java.net.InetSocketAddress r3 = r3.f33054c
            boolean r3 = nk.k.a(r8, r3)
            if (r3 == 0) goto L49
            javax.net.ssl.HostnameVerifier r12 = r11.f33023d
            fm.c r2 = fm.c.f24093a
            if (r12 == r2) goto L78
            goto Ldf
        L78:
            java.util.TimeZone r12 = sl.h.f33837a
            rl.n r12 = r5.f33026h
            int r1 = r1.f33117e
            int r2 = r12.f33117e
            if (r1 == r2) goto L83
            goto Ldf
        L83:
            java.lang.String r12 = r12.f33116d
            boolean r12 = nk.k.a(r6, r12)
            rl.l r1 = r10.f36352f
            if (r12 == 0) goto L8e
            goto Laf
        L8e:
            boolean r12 = r10.f36355k
            if (r12 != 0) goto Ldf
            if (r1 == 0) goto Ldf
            java.util.List r12 = r1.a()
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto Ldf
            java.lang.Object r12 = r12.get(r4)
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            nk.k.c(r12, r2)
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12
            boolean r12 = fm.c.c(r6, r12)
            if (r12 == 0) goto Ldf
        Laf:
            rl.e r11 = r11.f33024e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            nk.k.b(r11)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            nk.k.b(r1)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            java.util.List r12 = r1.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            nk.k.e(r6, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            java.lang.String r0 = "peerCertificates"
            nk.k.e(r12, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            java.util.Set r11 = r11.f33056a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            java.util.Iterator r11 = r11.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            boolean r12 = r11.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            if (r12 != 0) goto Ld2
            return r7
        Ld2:
            java.lang.Object r11 = r11.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            r11.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            java.lang.ClassCastException r11 = new java.lang.ClassCastException     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            r11.<init>()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
            throw r11     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ldf
        Ldf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.n.f(rl.a, java.util.List):boolean");
    }

    @Override // wl.e
    public final void g(m mVar, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof yl.d0)) {
                    if (!(this.f36354i != null) || (iOException instanceof yl.a)) {
                        this.j = true;
                        if (this.f36357m == 0) {
                            if (iOException != null) {
                                c(mVar.f36332a, this.f36349c, iOException);
                            }
                            this.f36356l++;
                        }
                    }
                } else if (((yl.d0) iOException).f37683a == yl.b.REFUSED_STREAM) {
                    int i4 = this.f36358n + 1;
                    this.f36358n = i4;
                    if (i4 > 1) {
                        this.j = true;
                        this.f36356l++;
                    }
                } else if (((yl.d0) iOException).f37683a != yl.b.CANCEL || !mVar.f36345p) {
                    this.j = true;
                    this.f36356l++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wl.e
    public final d0 h() {
        return this.f36349c;
    }

    public final boolean i(boolean z3) throws SocketException {
        long j;
        TimeZone timeZone = sl.h.f33837a;
        long jNanoTime = System.nanoTime();
        if (this.f36350d.isClosed() || this.f36351e.isClosed() || this.f36351e.isInputShutdown() || this.f36351e.isOutputShutdown()) {
            return false;
        }
        yl.q qVar = this.f36354i;
        if (qVar != null) {
            return qVar.g(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.f36361q;
        }
        if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS || !z3) {
            return true;
        }
        Socket socket = this.f36351e;
        hm.q qVar2 = (hm.q) this.f36353h.f25417c;
        nk.k.e(socket, "<this>");
        nk.k.e(qVar2, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !qVar2.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void j() throws SocketException {
        this.f36361q = System.nanoTime();
        u uVar = this.g;
        if (uVar == u.HTTP_2 || uVar == u.H2_PRIOR_KNOWLEDGE) {
            this.f36351e.setSoTimeout(0);
            yl.c cVar = yl.c.f37672a;
            z6.l lVar = new z6.l(this.f36348b);
            i0.f fVar = this.f36353h;
            String str = this.f36349c.f33052a.f33026h.f33116d;
            nk.k.e(fVar, "socket");
            nk.k.e(str, "peerName");
            lVar.f37970b = fVar;
            String str2 = sl.h.f33838b + ' ' + str;
            nk.k.e(str2, "<set-?>");
            lVar.f37971c = str2;
            lVar.f37972d = this;
            lVar.f37973e = cVar;
            yl.q qVar = new yl.q(lVar);
            this.f36354i = qVar;
            c0 c0Var = yl.q.f37722z;
            this.f36359o = (c0Var.f37673a & 8) != 0 ? c0Var.f37674b[3] : Integer.MAX_VALUE;
            z zVar = qVar.f37743w;
            synchronized (zVar) {
                try {
                    if (zVar.f37789d) {
                        throw new IOException("closed");
                    }
                    Logger logger = z.f37785f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(sl.h.d(">> CONNECTION " + yl.h.f37699a.b(), new Object[0]));
                    }
                    zVar.f37786a.J(yl.h.f37699a);
                    zVar.f37786a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qVar.f37743w.y(qVar.f37737q);
            if (qVar.f37737q.a() != 65535) {
                qVar.f37743w.A(0, r2 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
            ul.c.c(qVar.g.d(), qVar.f37725c, qVar.f37744x);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        d0 d0Var = this.f36349c;
        sb2.append(d0Var.f33052a.f33026h.f33116d);
        sb2.append(':');
        sb2.append(d0Var.f33052a.f33026h.f33117e);
        sb2.append(", proxy=");
        sb2.append(d0Var.f33053b);
        sb2.append(" hostAddress=");
        sb2.append(d0Var.f33054c);
        sb2.append(" cipherSuite=");
        rl.l lVar = this.f36352f;
        if (lVar == null || (obj = lVar.f33108b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.g);
        sb2.append('}');
        return sb2.toString();
    }
}
