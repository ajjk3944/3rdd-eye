package su;

import cv.h0;
import cv.y;
import h9.r2;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import mq.o;
import ou.a0;
import ou.b0;
import ou.f0;
import ou.p;
import ou.r;
import ou.t;
import ou.x;
import ou.z;
import p.l2;
import vu.c0;
import vu.q;
import xu.n;

/* loaded from: classes.dex */
public final class k extends vu.j {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f22342b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f22343c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f22344d;

    /* renamed from: e, reason: collision with root package name */
    public r f22345e;

    /* renamed from: f, reason: collision with root package name */
    public z f22346f;

    /* renamed from: g, reason: collision with root package name */
    public q f22347g;

    /* renamed from: h, reason: collision with root package name */
    public cv.z f22348h;

    /* renamed from: i, reason: collision with root package name */
    public y f22349i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f22350l;

    /* renamed from: m, reason: collision with root package name */
    public int f22351m;

    /* renamed from: n, reason: collision with root package name */
    public int f22352n;

    /* renamed from: o, reason: collision with root package name */
    public int f22353o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f22354p;

    /* renamed from: q, reason: collision with root package name */
    public long f22355q;

    public k(l lVar, f0 f0Var) {
        br.l.e(lVar, "connectionPool");
        br.l.e(f0Var, "route");
        this.f22342b = f0Var;
        this.f22353o = 1;
        this.f22354p = new ArrayList();
        this.f22355q = Long.MAX_VALUE;
    }

    public static void d(x xVar, f0 f0Var, IOException iOException) {
        br.l.e(f0Var, "failedRoute");
        br.l.e(iOException, "failure");
        if (f0Var.f19905b.type() != Proxy.Type.DIRECT) {
            ou.a aVar = f0Var.f19904a;
            aVar.f19857g.connectFailed(aVar.f19858h.g(), f0Var.f19905b.address(), iOException);
        }
        l2 l2Var = xVar.W;
        synchronized (l2Var) {
            ((LinkedHashSet) l2Var.f20100d).add(f0Var);
        }
    }

    @Override // vu.j
    public final synchronized void a(q qVar, c0 c0Var) {
        br.l.e(c0Var, "settings");
        this.f22353o = (c0Var.f23975a & 16) != 0 ? c0Var.f23976b[4] : Integer.MAX_VALUE;
    }

    @Override // vu.j
    public final void b(vu.y yVar) {
        yVar.c(vu.c.REFUSED_STREAM, null);
    }

    public final void c(int i10, int i11, int i12, boolean z10, i iVar, p pVar) throws Throwable {
        i iVar2;
        f0 f0Var;
        f0 f0Var2;
        br.l.e(pVar, "eventListener");
        if (this.f22346f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f22342b.f19904a.j;
        b bVar = new b(list);
        ou.a aVar = this.f22342b.f19904a;
        if (aVar.f19853c == null) {
            if (!list.contains(ou.m.f19943f)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f22342b.f19904a.f19858h.f19970d;
            n nVar = n.f25563a;
            if (!n.f25563a.h(str)) {
                throw new m(new UnknownServiceException(h0.b.o("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.f19859i.contains(z.H2_PRIOR_KNOWLEDGE)) {
            throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        m mVar = null;
        do {
            try {
                f0Var = this.f22342b;
            } catch (IOException e4) {
                e = e4;
                iVar2 = iVar;
            }
            try {
                if (f0Var.f19904a.f19853c != null && f0Var.f19905b.type() == Proxy.Type.HTTP) {
                    iVar2 = iVar;
                    f(i10, i11, i12, iVar2, pVar);
                    if (this.f22343c == null) {
                    }
                    f0Var2 = this.f22342b;
                    if (f0Var2.f19904a.f19853c == null && f0Var2.f19905b.type() == Proxy.Type.HTTP && this.f22343c == null) {
                        throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f22355q = System.nanoTime();
                    return;
                }
                iVar2 = iVar;
                e(i10, i11, iVar2, pVar);
                g(bVar, iVar2, pVar);
                f0 f0Var3 = this.f22342b;
                pVar.h(iVar2, f0Var3.f19906c, f0Var3.f19905b, this.f22346f);
                f0Var2 = this.f22342b;
                if (f0Var2.f19904a.f19853c == null) {
                }
                this.f22355q = System.nanoTime();
                return;
            } catch (IOException e10) {
                e = e10;
                Socket socket = this.f22344d;
                if (socket != null) {
                    pu.b.e(socket);
                }
                Socket socket2 = this.f22343c;
                if (socket2 != null) {
                    pu.b.e(socket2);
                }
                this.f22344d = null;
                this.f22343c = null;
                this.f22348h = null;
                this.f22349i = null;
                this.f22345e = null;
                this.f22346f = null;
                this.f22347g = null;
                this.f22353o = 1;
                f0 f0Var4 = this.f22342b;
                pVar.i(iVar2, f0Var4.f19906c, f0Var4.f19905b, e);
                if (mVar == null) {
                    mVar = new m(e);
                } else {
                    ir.f0.c(mVar.f22361a, e);
                    mVar.f22362d = e;
                }
                if (!z10) {
                    throw mVar;
                }
                bVar.f22309c = true;
                if (!bVar.f22308b) {
                    throw mVar;
                }
                if (e instanceof ProtocolException) {
                    throw mVar;
                }
                if (e instanceof InterruptedIOException) {
                    throw mVar;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw mVar;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw mVar;
                }
            }
        } while (e instanceof SSLException);
        throw mVar;
    }

    public final void e(int i10, int i11, i iVar, p pVar) throws IOException {
        Socket socketCreateSocket;
        f0 f0Var = this.f22342b;
        Proxy proxy = f0Var.f19905b;
        ou.a aVar = f0Var.f19904a;
        Proxy.Type type = proxy.type();
        int i12 = type == null ? -1 : j.f22341a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = aVar.f19852b.createSocket();
            br.l.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f22343c = socketCreateSocket;
        pVar.j(iVar, this.f22342b.f19906c, proxy);
        socketCreateSocket.setSoTimeout(i11);
        try {
            n nVar = n.f25563a;
            n.f25563a.e(socketCreateSocket, this.f22342b.f19906c, i10);
            try {
                this.f22348h = a.a.e(a.a.F(socketCreateSocket));
                this.f22349i = a.a.d(a.a.D(socketCreateSocket));
            } catch (NullPointerException e4) {
                if (br.l.a(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f22342b.f19906c);
            connectException.initCause(e10);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, i iVar, p pVar) throws IOException {
        cj.a aVar = new cj.a();
        f0 f0Var = this.f22342b;
        t tVar = f0Var.f19904a.f19858h;
        br.l.e(tVar, "url");
        aVar.f3974d = tVar;
        aVar.B("CONNECT", null);
        ou.a aVar2 = f0Var.f19904a;
        aVar.y("Host", pu.b.v(aVar2.f19858h, true));
        aVar.y("Proxy-Connection", "Keep-Alive");
        aVar.y("User-Agent", "okhttp/4.12.0");
        a0 a0VarR = aVar.r();
        fh.f fVar = new fh.f(2);
        br.l.e(z.HTTP_1_1, "protocol");
        ou.d.a("Proxy-Authenticate");
        ou.d.b("OkHttp-Preemptive", "Proxy-Authenticate");
        fVar.j("Proxy-Authenticate");
        fVar.c("Proxy-Authenticate", "OkHttp-Preemptive");
        fVar.f();
        aVar2.f19856f.getClass();
        t tVar2 = a0VarR.f19860a;
        e(i10, i11, iVar, pVar);
        String str = "CONNECT " + pu.b.v(tVar2, true) + " HTTP/1.1";
        cv.z zVar = this.f22348h;
        br.l.b(zVar);
        y yVar = this.f22349i;
        br.l.b(yVar);
        ks.c cVar = new ks.c(null, this, zVar, yVar);
        h0 h0VarG = zVar.f6753a.g();
        long j = i11;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        h0VarG.g(j);
        yVar.f6750a.g().g(i12);
        cVar.j(a0VarR.f19862c, str);
        cVar.b();
        b0 b0VarE = cVar.e(false);
        br.l.b(b0VarE);
        b0VarE.f19869a = a0VarR;
        ou.c0 c0VarA = b0VarE.a();
        int i13 = c0VarA.f19887r;
        long j7 = pu.b.j(c0VarA);
        if (j7 != -1) {
            uu.d dVarI = cVar.i(j7);
            pu.b.t(dVarI, Integer.MAX_VALUE);
            dVarI.close();
        }
        if (i13 != 200) {
            if (i13 != 407) {
                throw new IOException(h0.b.h(i13, "Unexpected response code for CONNECT: "));
            }
            aVar2.f19856f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!zVar.f6754d.i() || !yVar.f6751d.i()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, i iVar, p pVar) throws Throwable {
        SSLSocket sSLSocket;
        z zVarA;
        ou.a aVar = this.f22342b.f19904a;
        if (aVar.f19853c == null) {
            List list = aVar.f19859i;
            z zVar = z.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(zVar)) {
                this.f22344d = this.f22343c;
                this.f22346f = z.HTTP_1_1;
                return;
            } else {
                this.f22344d = this.f22343c;
                this.f22346f = zVar;
                l();
                return;
            }
        }
        pVar.C(iVar);
        ou.a aVar2 = this.f22342b.f19904a;
        SSLSocketFactory sSLSocketFactory = aVar2.f19853c;
        SSLSocket sSLSocket2 = null;
        String strF = null;
        try {
            br.l.b(sSLSocketFactory);
            Socket socket = this.f22343c;
            t tVar = aVar2.f19858h;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, tVar.f19970d, tVar.f19971e, true);
            br.l.c(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ou.m mVarA = bVar.a(sSLSocket);
            if (mVarA.f19945b) {
                n nVar = n.f25563a;
                n.f25563a.d(sSLSocket, aVar2.f19858h.f19970d, aVar2.f19859i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            br.l.d(session, "sslSocketSession");
            r rVarD = ou.d.d(session);
            HostnameVerifier hostnameVerifier = aVar2.f19854d;
            br.l.b(hostnameVerifier);
            if (!hostnameVerifier.verify(aVar2.f19858h.f19970d, session)) {
                List listA = rVarD.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.f19858h.f19970d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                br.l.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                sb2.append(aVar2.f19858h.f19970d);
                sb2.append(" not verified:\n              |    certificate: ");
                ou.j jVar = ou.j.f19921c;
                StringBuilder sb3 = new StringBuilder("sha256/");
                cv.j jVar2 = cv.j.f6715r;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                br.l.d(encoded, "publicKey.encoded");
                sb3.append(sm.m.u(encoded).c("SHA-256").a());
                sb2.append(sb3.toString());
                sb2.append("\n              |    DN: ");
                sb2.append(x509Certificate.getSubjectDN().getName());
                sb2.append("\n              |    subjectAltNames: ");
                sb2.append(o.E0(bv.c.a(x509Certificate, 7), bv.c.a(x509Certificate, 2)));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(tt.m.b0(sb2.toString()));
            }
            ou.j jVar3 = aVar2.f19855e;
            br.l.b(jVar3);
            this.f22345e = new r(rVarD.f19962a, rVarD.f19963b, rVarD.f19964c, new es.b0(jVar3, rVarD, aVar2, 5));
            br.l.e(aVar2.f19858h.f19970d, "hostname");
            Iterator it = jVar3.f19922a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (mVarA.f19945b) {
                n nVar2 = n.f25563a;
                strF = n.f25563a.f(sSLSocket);
            }
            this.f22344d = sSLSocket;
            this.f22348h = a.a.e(a.a.F(sSLSocket));
            this.f22349i = a.a.d(a.a.D(sSLSocket));
            if (strF != null) {
                z.Companion.getClass();
                zVarA = ou.y.a(strF);
            } else {
                zVarA = z.HTTP_1_1;
            }
            this.f22346f = zVarA;
            n nVar3 = n.f25563a;
            n.f25563a.a(sSLSocket);
            pVar.B(iVar, this.f22345e);
            if (this.f22346f == z.HTTP_2) {
                l();
            }
        } catch (Throwable th3) {
            th = th3;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                n nVar4 = n.f25563a;
                n.f25563a.a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                pu.b.e(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(ou.a r11, java.util.List r12) {
        /*
            r10 = this;
            java.lang.String r0 = "hostname"
            ou.t r1 = r11.f19858h
            byte[] r2 = pu.b.f20645a
            java.util.ArrayList r2 = r10.f22354p
            int r2 = r2.size()
            int r3 = r10.f22353o
            r4 = 0
            if (r2 >= r3) goto Le1
            boolean r2 = r10.j
            if (r2 == 0) goto L17
            goto Le1
        L17:
            ou.f0 r2 = r10.f22342b
            ou.a r3 = r2.f19904a
            ou.a r5 = r2.f19904a
            boolean r3 = r3.a(r11)
            if (r3 != 0) goto L25
            goto Le1
        L25:
            java.lang.String r3 = r1.f19970d
            java.lang.String r6 = r1.f19970d
            ou.t r7 = r5.f19858h
            java.lang.String r7 = r7.f19970d
            boolean r3 = br.l.a(r3, r7)
            r7 = 1
            if (r3 == 0) goto L35
            return r7
        L35:
            vu.q r3 = r10.f22347g
            if (r3 != 0) goto L3b
            goto Le1
        L3b:
            if (r12 == 0) goto Le1
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L45
            goto Le1
        L45:
            java.util.Iterator r12 = r12.iterator()
        L49:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto Le1
            java.lang.Object r3 = r12.next()
            ou.f0 r3 = (ou.f0) r3
            java.net.Proxy r8 = r3.f19905b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 != r9) goto L49
            java.net.Proxy r8 = r2.f19905b
            java.net.Proxy$Type r8 = r8.type()
            if (r8 != r9) goto L49
            java.net.InetSocketAddress r8 = r2.f19906c
            java.net.InetSocketAddress r3 = r3.f19906c
            boolean r3 = br.l.a(r8, r3)
            if (r3 == 0) goto L49
            javax.net.ssl.HostnameVerifier r12 = r11.f19854d
            bv.c r2 = bv.c.f2998a
            if (r12 == r2) goto L78
            goto Le1
        L78:
            byte[] r12 = pu.b.f20645a
            ou.t r12 = r5.f19858h
            int r1 = r1.f19971e
            int r2 = r12.f19971e
            if (r1 == r2) goto L83
            goto Le1
        L83:
            java.lang.String r12 = r12.f19970d
            boolean r12 = br.l.a(r6, r12)
            if (r12 == 0) goto L8c
            goto Laf
        L8c:
            boolean r12 = r10.k
            if (r12 != 0) goto Le1
            ou.r r12 = r10.f22345e
            if (r12 == 0) goto Le1
            java.util.List r12 = r12.a()
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto Le1
            java.lang.Object r12 = r12.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            br.l.c(r12, r1)
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12
            boolean r12 = bv.c.c(r6, r12)
            if (r12 == 0) goto Le1
        Laf:
            ou.j r11 = r11.f19855e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            br.l.b(r11)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            ou.r r12 = r10.f22345e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            br.l.b(r12)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.util.List r12 = r12.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            br.l.e(r6, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.lang.String r0 = "peerCertificates"
            br.l.e(r12, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.util.Set r11 = r11.f19922a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.util.Iterator r11 = r11.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            boolean r12 = r11.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            if (r12 != 0) goto Ld4
            return r7
        Ld4:
            java.lang.Object r11 = r11.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            r11.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            java.lang.ClassCastException r11 = new java.lang.ClassCastException     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            r11.<init>()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
            throw r11     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le1
        Le1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: su.k.h(ou.a, java.util.List):boolean");
    }

    public final boolean i(boolean z10) throws SocketException {
        long j;
        byte[] bArr = pu.b.f20645a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f22343c;
        br.l.b(socket);
        Socket socket2 = this.f22344d;
        br.l.b(socket2);
        br.l.b(this.f22348h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        q qVar = this.f22347g;
        if (qVar != null) {
            synchronized (qVar) {
                if (qVar.f24033y) {
                    return false;
                }
                if (qVar.J < qVar.I) {
                    if (jNanoTime >= qVar.K) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f22355q;
        }
        if (j < 10000000000L || !z10) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.b();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final tu.d j(x xVar, tu.f fVar) throws SocketException {
        int i10 = fVar.f23020g;
        Socket socket = this.f22344d;
        br.l.b(socket);
        cv.z zVar = this.f22348h;
        br.l.b(zVar);
        y yVar = this.f22349i;
        br.l.b(yVar);
        q qVar = this.f22347g;
        if (qVar != null) {
            return new vu.r(xVar, this, fVar, qVar);
        }
        socket.setSoTimeout(i10);
        h0 h0VarG = zVar.f6753a.g();
        long j = i10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        h0VarG.g(j);
        yVar.f6750a.g().g(fVar.f23021h);
        return new ks.c(xVar, this, zVar, yVar);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() throws SocketException {
        Socket socket = this.f22344d;
        br.l.b(socket);
        cv.z zVar = this.f22348h;
        br.l.b(zVar);
        y yVar = this.f22349i;
        br.l.b(yVar);
        socket.setSoTimeout(0);
        ru.c cVar = ru.c.f21810h;
        br.l.e(cVar, "taskRunner");
        r2 r2Var = new r2();
        r2Var.f10470a = cVar;
        r2Var.f10475y = vu.j.f24008a;
        String str = this.f22342b.f19904a.f19858h.f19970d;
        br.l.e(str, "peerName");
        r2Var.f10471d = socket;
        String str2 = pu.b.f20651g + ' ' + str;
        br.l.e(str2, "<set-?>");
        r2Var.f10472g = str2;
        r2Var.f10473r = zVar;
        r2Var.f10474x = yVar;
        r2Var.f10475y = this;
        q qVar = new q(r2Var);
        this.f22347g = qVar;
        c0 c0Var = q.V;
        this.f22353o = (c0Var.f23975a & 16) != 0 ? c0Var.f23976b[4] : Integer.MAX_VALUE;
        vu.z zVar2 = qVar.S;
        synchronized (zVar2) {
            try {
                if (zVar2.f24079r) {
                    throw new IOException("closed");
                }
                Logger logger = vu.z.f24075y;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(pu.b.h(">> CONNECTION " + vu.h.f24004a.e(), new Object[0]));
                }
                zVar2.f24076a.B(vu.h.f24004a);
                zVar2.f24076a.flush();
            } finally {
            }
        }
        vu.z zVar3 = qVar.S;
        c0 c0Var2 = qVar.L;
        synchronized (zVar3) {
            try {
                br.l.e(c0Var2, "settings");
                if (zVar3.f24079r) {
                    throw new IOException("closed");
                }
                zVar3.h(0, Integer.bitCount(c0Var2.f23975a) * 6, 4, 0);
                int i10 = 0;
                while (i10 < 10) {
                    boolean z10 = true;
                    if (((1 << i10) & c0Var2.f23975a) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        zVar3.f24076a.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                        zVar3.f24076a.writeInt(c0Var2.f23976b[i10]);
                    }
                    i10++;
                }
                zVar3.f24076a.flush();
            } finally {
            }
        }
        if (qVar.L.a() != 65535) {
            qVar.S.G(0, r1 - 65535);
        }
        cVar.e().c(new qu.f(qVar.f24030g, qVar.T, 1), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        f0 f0Var = this.f22342b;
        sb2.append(f0Var.f19904a.f19858h.f19970d);
        sb2.append(':');
        sb2.append(f0Var.f19904a.f19858h.f19971e);
        sb2.append(", proxy=");
        sb2.append(f0Var.f19905b);
        sb2.append(" hostAddress=");
        sb2.append(f0Var.f19906c);
        sb2.append(" cipherSuite=");
        r rVar = this.f22345e;
        if (rVar == null || (obj = rVar.f19963b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f22346f);
        sb2.append('}');
        return sb2.toString();
    }
}
