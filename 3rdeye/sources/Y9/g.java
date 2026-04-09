package Y9;

import H6.I;
import N7.C1154e9;
import U9.C1604a;
import U9.C1610g;
import U9.E;
import U9.H;
import U9.InterfaceC1608e;
import U9.o;
import U9.r;
import U9.s;
import U9.x;
import U9.y;
import U9.z;
import aa.b;
import ba.f;
import ba.n;
import ba.p;
import ba.t;
import c9.C2097r;
import g0.C4356c;
import ia.D;
import ia.h;
import ia.q;
import ia.v;
import ia.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import y9.C5828j;

/* compiled from: RealConnection.kt */
/* loaded from: classes3.dex */
public final class g extends f.b {

    /* renamed from: b, reason: collision with root package name */
    public final H f13857b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f13858c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f13859d;

    /* renamed from: e, reason: collision with root package name */
    public r f13860e;

    /* renamed from: f, reason: collision with root package name */
    public y f13861f;

    /* renamed from: g, reason: collision with root package name */
    public ba.f f13862g;

    /* renamed from: h, reason: collision with root package name */
    public w f13863h;
    public v i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13864j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13865k;

    /* renamed from: l, reason: collision with root package name */
    public int f13866l;

    /* renamed from: m, reason: collision with root package name */
    public int f13867m;

    /* renamed from: n, reason: collision with root package name */
    public int f13868n;

    /* renamed from: o, reason: collision with root package name */
    public int f13869o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f13870p;

    /* renamed from: q, reason: collision with root package name */
    public long f13871q;

    /* compiled from: RealConnection.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13872a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13872a = iArr;
        }
    }

    public g(j connectionPool, H route) {
        kotlin.jvm.internal.l.f(connectionPool, "connectionPool");
        kotlin.jvm.internal.l.f(route, "route");
        this.f13857b = route;
        this.f13869o = 1;
        this.f13870p = new ArrayList();
        this.f13871q = Long.MAX_VALUE;
    }

    public static void d(x client, H failedRoute, IOException failure) {
        kotlin.jvm.internal.l.f(client, "client");
        kotlin.jvm.internal.l.f(failedRoute, "failedRoute");
        kotlin.jvm.internal.l.f(failure, "failure");
        if (failedRoute.f12595b.type() != Proxy.Type.DIRECT) {
            C1604a c1604a = failedRoute.f12594a;
            c1604a.f12603g.connectFailed(c1604a.f12604h.i(), failedRoute.f12595b.address(), failure);
        }
        I i = client.f12749A;
        synchronized (i) {
            ((LinkedHashSet) i.f2053c).add(failedRoute);
        }
    }

    @Override // ba.f.b
    public final synchronized void a(ba.f connection, t settings) {
        kotlin.jvm.internal.l.f(connection, "connection");
        kotlin.jvm.internal.l.f(settings, "settings");
        this.f13869o = (settings.f18260a & 16) != 0 ? settings.f18261b[4] : Integer.MAX_VALUE;
    }

    @Override // ba.f.b
    public final void b(p pVar) throws IOException {
        pVar.c(ba.b.REFUSED_STREAM, null);
    }

    public final void c(int i, int i10, int i11, boolean z10, InterfaceC1608e call, o.a eventListener) throws Throwable {
        H h10;
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(eventListener, "eventListener");
        if (this.f13861f != null) {
            throw new IllegalStateException("already connected");
        }
        List<U9.j> list = this.f13857b.f12594a.f12605j;
        b bVar = new b(list);
        C1604a c1604a = this.f13857b.f12594a;
        if (c1604a.f12599c == null) {
            if (!list.contains(U9.j.f12669f)) {
                throw new k(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f13857b.f12594a.f12604h.f12715d;
            da.h hVar = da.h.f37600a;
            if (!da.h.f37600a.h(str)) {
                throw new k(new UnknownServiceException(C1154e9.i("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c1604a.i.contains(y.H2_PRIOR_KNOWLEDGE)) {
            throw new k(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        k kVar = null;
        do {
            try {
                H h11 = this.f13857b;
                if (h11.f12594a.f12599c != null && h11.f12595b.type() == Proxy.Type.HTTP) {
                    f(i, i10, i11, call, eventListener);
                    if (this.f13858c == null) {
                    }
                    h10 = this.f13857b;
                    if (h10.f12594a.f12599c == null && h10.f12595b.type() == Proxy.Type.HTTP && this.f13858c == null) {
                        throw new k(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f13871q = System.nanoTime();
                    return;
                }
                e(i, i10, call, eventListener);
                g(bVar, call, eventListener);
                InetSocketAddress inetSocketAddress = this.f13857b.f12596c;
                o.a aVar = o.f12696a;
                kotlin.jvm.internal.l.f(inetSocketAddress, "inetSocketAddress");
                h10 = this.f13857b;
                if (h10.f12594a.f12599c == null) {
                }
                this.f13871q = System.nanoTime();
                return;
            } catch (IOException e4) {
                Socket socket = this.f13859d;
                if (socket != null) {
                    V9.b.d(socket);
                }
                Socket socket2 = this.f13858c;
                if (socket2 != null) {
                    V9.b.d(socket2);
                }
                this.f13859d = null;
                this.f13858c = null;
                this.f13863h = null;
                this.i = null;
                this.f13860e = null;
                this.f13861f = null;
                this.f13862g = null;
                this.f13869o = 1;
                InetSocketAddress inetSocketAddress2 = this.f13857b.f12596c;
                kotlin.jvm.internal.l.f(inetSocketAddress2, "inetSocketAddress");
                if (kVar == null) {
                    kVar = new k(e4);
                } else {
                    b9.x.a(kVar.f13881b, e4);
                    kVar.f13882c = e4;
                }
                if (!z10) {
                    throw kVar;
                }
                bVar.f13810d = true;
                if (!bVar.f13809c) {
                    throw kVar;
                }
                if (e4 instanceof ProtocolException) {
                    throw kVar;
                }
                if (e4 instanceof InterruptedIOException) {
                    throw kVar;
                }
                if ((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) {
                    throw kVar;
                }
                if (e4 instanceof SSLPeerUnverifiedException) {
                    throw kVar;
                }
            }
        } while (e4 instanceof SSLException);
        throw kVar;
    }

    public final void e(int i, int i10, InterfaceC1608e call, o.a aVar) throws IOException {
        Socket socketCreateSocket;
        H h10 = this.f13857b;
        Proxy proxy = h10.f12595b;
        C1604a c1604a = h10.f12594a;
        Proxy.Type type = proxy.type();
        int i11 = type == null ? -1 : a.f13872a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socketCreateSocket = c1604a.f12598b.createSocket();
            kotlin.jvm.internal.l.c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f13858c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f13857b.f12596c;
        aVar.getClass();
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i10);
        try {
            da.h hVar = da.h.f37600a;
            da.h.f37600a.e(socketCreateSocket, this.f13857b.f12596c, i);
            try {
                this.f13863h = q.c(q.h(socketCreateSocket));
                this.i = q.b(q.e(socketCreateSocket));
            } catch (NullPointerException e4) {
                if (kotlin.jvm.internal.l.b(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f13857b.f12596c);
            connectException.initCause(e10);
            throw connectException;
        }
    }

    public final void f(int i, int i10, int i11, InterfaceC1608e interfaceC1608e, o.a aVar) throws IOException {
        z.a aVar2 = new z.a();
        H h10 = this.f13857b;
        U9.t url = h10.f12594a.f12604h;
        kotlin.jvm.internal.l.f(url, "url");
        aVar2.f12801a = url;
        aVar2.d("CONNECT", null);
        C1604a c1604a = h10.f12594a;
        aVar2.c("Host", V9.b.v(c1604a.f12604h, true));
        aVar2.c("Proxy-Connection", "Keep-Alive");
        aVar2.c("User-Agent", "okhttp/4.12.0");
        z zVarB = aVar2.b();
        E.a aVar3 = new E.a();
        aVar3.f12575a = zVarB;
        y protocol = y.HTTP_1_1;
        kotlin.jvm.internal.l.f(protocol, "protocol");
        aVar3.f12576b = protocol;
        aVar3.f12577c = 407;
        aVar3.f12578d = "Preemptive Authenticate";
        aVar3.f12581g = V9.b.f13055c;
        aVar3.f12584k = -1L;
        aVar3.f12585l = -1L;
        s.a aVar4 = aVar3.f12580f;
        aVar4.getClass();
        s.b.a("Proxy-Authenticate");
        s.b.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar4.f("Proxy-Authenticate");
        aVar4.c("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar3.a();
        c1604a.f12602f.getClass();
        e(i, i10, interfaceC1608e, aVar);
        String str = "CONNECT " + V9.b.v(zVarB.f12795a, true) + " HTTP/1.1";
        w wVar = this.f13863h;
        kotlin.jvm.internal.l.c(wVar);
        v vVar = this.i;
        kotlin.jvm.internal.l.c(vVar);
        aa.b bVar = new aa.b(null, this, wVar, vVar);
        D dTimeout = wVar.f38684b.timeout();
        long j4 = i10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dTimeout.timeout(j4, timeUnit);
        vVar.f38681b.timeout().timeout(i11, timeUnit);
        bVar.k(zVarB.f12797c, str);
        bVar.a();
        E.a aVarC = bVar.c(false);
        kotlin.jvm.internal.l.c(aVarC);
        aVarC.f12575a = zVarB;
        E eA = aVarC.a();
        long j10 = V9.b.j(eA);
        if (j10 != -1) {
            b.d dVarJ = bVar.j(j10);
            V9.b.t(dVarJ, Integer.MAX_VALUE);
            dVarJ.close();
        }
        int i12 = eA.f12565e;
        if (i12 != 200) {
            if (i12 != 407) {
                throw new IOException(C4356c.h(i12, "Unexpected response code for CONNECT: "));
            }
            c1604a.f12602f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!wVar.f38685c.K() || !vVar.f38682c.K()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, InterfaceC1608e call, o.a aVar) throws Throwable {
        y yVarA;
        C1604a c1604a = this.f13857b.f12594a;
        if (c1604a.f12599c == null) {
            List<y> list = c1604a.i;
            y yVar = y.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(yVar)) {
                this.f13859d = this.f13858c;
                this.f13861f = y.HTTP_1_1;
                return;
            } else {
                this.f13859d = this.f13858c;
                this.f13861f = yVar;
                m();
                return;
            }
        }
        aVar.getClass();
        kotlin.jvm.internal.l.f(call, "call");
        C1604a c1604a2 = this.f13857b.f12594a;
        SSLSocketFactory sSLSocketFactory = c1604a2.f12599c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            kotlin.jvm.internal.l.c(sSLSocketFactory);
            Socket socket = this.f13858c;
            U9.t tVar = c1604a2.f12604h;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, tVar.f12715d, tVar.f12716e, true);
            kotlin.jvm.internal.l.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                U9.j jVarA = bVar.a(sSLSocket2);
                if (jVarA.f12671b) {
                    da.h hVar = da.h.f37600a;
                    da.h.f37600a.d(sSLSocket2, c1604a2.f12604h.f12715d, c1604a2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                kotlin.jvm.internal.l.e(sslSocketSession, "sslSocketSession");
                r rVarA = r.a.a(sslSocketSession);
                ga.d dVar = c1604a2.f12600d;
                kotlin.jvm.internal.l.c(dVar);
                if (dVar.verify(c1604a2.f12604h.f12715d, sslSocketSession)) {
                    C1610g c1610g = c1604a2.f12601e;
                    kotlin.jvm.internal.l.c(c1610g);
                    this.f13860e = new r(rVarA.f12703a, rVarA.f12704b, rVarA.f12705c, new h(c1610g, rVarA, c1604a2));
                    c1610g.a(c1604a2.f12604h.f12715d, new F6.c(this, 3));
                    if (jVarA.f12671b) {
                        da.h hVar2 = da.h.f37600a;
                        strF = da.h.f37600a.f(sSLSocket2);
                    }
                    this.f13859d = sSLSocket2;
                    this.f13863h = q.c(q.h(sSLSocket2));
                    this.i = q.b(q.e(sSLSocket2));
                    if (strF != null) {
                        y.Companion.getClass();
                        yVarA = y.a.a(strF);
                    } else {
                        yVarA = y.HTTP_1_1;
                    }
                    this.f13861f = yVarA;
                    da.h hVar3 = da.h.f37600a;
                    da.h.f37600a.a(sSLSocket2);
                    if (this.f13861f == y.HTTP_2) {
                        m();
                        return;
                    }
                    return;
                }
                List<Certificate> listA = rVarA.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c1604a2.f12604h.f12715d + " not verified (no certificates)");
                }
                Certificate certificate = listA.get(0);
                kotlin.jvm.internal.l.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c1604a2.f12604h.f12715d);
                sb.append(" not verified:\n              |    certificate: ");
                C1610g c1610g2 = C1610g.f12644c;
                StringBuilder sb2 = new StringBuilder("sha256/");
                ia.h hVar4 = ia.h.f38646e;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                kotlin.jvm.internal.l.e(encoded, "publicKey.encoded");
                sb2.append(h.a.d(encoded).b("SHA-256").a());
                sb.append(sb2.toString());
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(C2097r.y0(ga.d.a(x509Certificate, 2), ga.d.a(x509Certificate, 7)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(C5828j.M(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    da.h hVar5 = da.h.f37600a;
                    da.h.f37600a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    V9.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void h() {
        this.f13867m++;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(U9.C1604a r9, java.util.List<U9.H> r10) {
        /*
            r8 = this;
            byte[] r0 = V9.b.f13053a
            java.util.ArrayList r0 = r8.f13870p
            int r0 = r0.size()
            int r1 = r8.f13869o
            r2 = 0
            if (r0 >= r1) goto Lda
            boolean r0 = r8.f13864j
            if (r0 == 0) goto L13
            goto Lda
        L13:
            U9.H r0 = r8.f13857b
            U9.a r1 = r0.f12594a
            boolean r1 = r1.a(r9)
            if (r1 != 0) goto L1f
            goto Lda
        L1f:
            U9.t r1 = r9.f12604h
            java.lang.String r3 = r1.f12715d
            U9.a r4 = r0.f12594a
            U9.t r5 = r4.f12604h
            java.lang.String r5 = r5.f12715d
            boolean r3 = kotlin.jvm.internal.l.b(r3, r5)
            r5 = 1
            if (r3 == 0) goto L31
            return r5
        L31:
            ba.f r3 = r8.f13862g
            if (r3 != 0) goto L37
            goto Lda
        L37:
            if (r10 == 0) goto Lda
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r3 = r10 instanceof java.util.Collection
            if (r3 == 0) goto L4a
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L4a
            goto Lda
        L4a:
            java.util.Iterator r10 = r10.iterator()
        L4e:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Lda
            java.lang.Object r3 = r10.next()
            U9.H r3 = (U9.H) r3
            java.net.Proxy r6 = r3.f12595b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L4e
            java.net.Proxy r6 = r0.f12595b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L4e
            java.net.InetSocketAddress r3 = r3.f12596c
            java.net.InetSocketAddress r6 = r0.f12596c
            boolean r3 = kotlin.jvm.internal.l.b(r6, r3)
            if (r3 == 0) goto L4e
            ga.d r10 = ga.d.f37965a
            ga.d r0 = r9.f12600d
            if (r0 == r10) goto L7d
            goto Lda
        L7d:
            byte[] r10 = V9.b.f13053a
            U9.t r10 = r4.f12604h
            int r0 = r10.f12716e
            int r3 = r1.f12716e
            if (r3 == r0) goto L88
            goto Lda
        L88:
            java.lang.String r10 = r10.f12715d
            java.lang.String r0 = r1.f12715d
            boolean r10 = kotlin.jvm.internal.l.b(r0, r10)
            if (r10 == 0) goto L93
            goto Lb9
        L93:
            boolean r10 = r8.f13865k
            if (r10 != 0) goto Lda
            U9.r r10 = r8.f13860e
            if (r10 == 0) goto Lda
            java.util.List r10 = r10.a()
            r1 = r10
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lda
            java.lang.Object r10 = r10.get(r2)
            java.lang.String r1 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.l.d(r10, r1)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = ga.d.b(r0, r10)
            if (r10 == 0) goto Lda
        Lb9:
            U9.g r9 = r9.f12601e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lda
            kotlin.jvm.internal.l.c(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lda
            U9.r r10 = r8.f13860e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lda
            kotlin.jvm.internal.l.c(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lda
            java.util.List r10 = r10.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lda
            java.lang.String r1 = "hostname"
            kotlin.jvm.internal.l.f(r0, r1)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lda
            java.lang.String r1 = "peerCertificates"
            kotlin.jvm.internal.l.f(r10, r1)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lda
            U9.h r1 = new U9.h     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lda
            r1.<init>(r9, r10, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lda
            r9.a(r0, r1)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lda
            return r5
        Lda:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y9.g.i(U9.a, java.util.List):boolean");
    }

    public final boolean j(boolean z10) throws SocketException {
        long j4;
        byte[] bArr = V9.b.f13053a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f13858c;
        kotlin.jvm.internal.l.c(socket);
        Socket socket2 = this.f13859d;
        kotlin.jvm.internal.l.c(socket2);
        kotlin.jvm.internal.l.c(this.f13863h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        ba.f fVar = this.f13862g;
        if (fVar != null) {
            return fVar.e(jNanoTime);
        }
        synchronized (this) {
            j4 = jNanoTime - this.f13871q;
        }
        if (j4 < 10000000000L || !z10) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.K();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final Z9.d k(x client, Z9.f fVar) throws SocketException {
        kotlin.jvm.internal.l.f(client, "client");
        Socket socket = this.f13859d;
        kotlin.jvm.internal.l.c(socket);
        w wVar = this.f13863h;
        kotlin.jvm.internal.l.c(wVar);
        v vVar = this.i;
        kotlin.jvm.internal.l.c(vVar);
        ba.f fVar2 = this.f13862g;
        if (fVar2 != null) {
            return new n(client, this, fVar, fVar2);
        }
        int i = fVar.f14074g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar.f38684b.timeout().timeout(i, timeUnit);
        vVar.f38681b.timeout().timeout(fVar.f14075h, timeUnit);
        return new aa.b(client, this, wVar, vVar);
    }

    public final synchronized void l() {
        this.f13864j = true;
    }

    public final void m() throws IOException {
        Socket socket = this.f13859d;
        kotlin.jvm.internal.l.c(socket);
        w wVar = this.f13863h;
        kotlin.jvm.internal.l.c(wVar);
        v vVar = this.i;
        kotlin.jvm.internal.l.c(vVar);
        socket.setSoTimeout(0);
        X9.d dVar = X9.d.f13679h;
        f.a aVar = new f.a(dVar);
        String peerName = this.f13857b.f12594a.f12604h.f12715d;
        kotlin.jvm.internal.l.f(peerName, "peerName");
        aVar.f18169b = socket;
        String str = V9.b.f13059g + ' ' + peerName;
        kotlin.jvm.internal.l.f(str, "<set-?>");
        aVar.f18170c = str;
        aVar.f18171d = wVar;
        aVar.f18172e = vVar;
        aVar.f18173f = this;
        ba.f fVar = new ba.f(aVar);
        this.f13862g = fVar;
        t tVar = ba.f.f18143A;
        this.f13869o = (tVar.f18260a & 16) != 0 ? tVar.f18261b[4] : Integer.MAX_VALUE;
        ba.q qVar = fVar.f18165x;
        synchronized (qVar) {
            try {
                if (qVar.f18251e) {
                    throw new IOException("closed");
                }
                Logger logger = ba.q.f18247g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(V9.b.h(">> CONNECTION " + ba.e.f18139b.d(), new Object[0]));
                }
                qVar.f18248b.P(ba.e.f18139b);
                qVar.f18248b.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        fVar.f18165x.A(fVar.f18158q);
        if (fVar.f18158q.a() != 65535) {
            fVar.f18165x.B(0, r1 - 65535);
        }
        dVar.e().c(new X9.b(fVar.f18146d, fVar.f18166y), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        H h10 = this.f13857b;
        sb.append(h10.f12594a.f12604h.f12715d);
        sb.append(':');
        sb.append(h10.f12594a.f12604h.f12716e);
        sb.append(", proxy=");
        sb.append(h10.f12595b);
        sb.append(" hostAddress=");
        sb.append(h10.f12596c);
        sb.append(" cipherSuite=");
        r rVar = this.f13860e;
        if (rVar == null || (obj = rVar.f12704b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f13861f);
        sb.append('}');
        return sb.toString();
    }
}
