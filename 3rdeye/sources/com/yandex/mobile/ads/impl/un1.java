package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import c9.C2092m;
import com.yandex.mobile.ads.impl.cf0;
import com.yandex.mobile.ads.impl.gm1;
import com.yandex.mobile.ads.impl.lh1;
import com.yandex.mobile.ads.impl.pp1;
import com.yandex.mobile.ads.impl.pq1;
import com.yandex.mobile.ads.impl.sg0;
import com.yandex.mobile.ads.impl.zn;
import g0.C4356c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p9.InterfaceC5480a;
import y9.C5828j;

/* loaded from: classes3.dex */
public final class un1 extends sg0.b {

    /* renamed from: b, reason: collision with root package name */
    private final ps1 f34145b;

    /* renamed from: c, reason: collision with root package name */
    private Socket f34146c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f34147d;

    /* renamed from: e, reason: collision with root package name */
    private cf0 f34148e;

    /* renamed from: f, reason: collision with root package name */
    private gm1 f34149f;

    /* renamed from: g, reason: collision with root package name */
    private sg0 f34150g;

    /* renamed from: h, reason: collision with root package name */
    private ia.g f34151h;
    private ia.f i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f34152j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f34153k;

    /* renamed from: l, reason: collision with root package name */
    private int f34154l;

    /* renamed from: m, reason: collision with root package name */
    private int f34155m;

    /* renamed from: n, reason: collision with root package name */
    private int f34156n;

    /* renamed from: o, reason: collision with root package name */
    private int f34157o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList f34158p;

    /* renamed from: q, reason: collision with root package name */
    private long f34159q;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34160a;

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
            f34160a = iArr;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<List<? extends Certificate>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ zn f34161b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cf0 f34162c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ta f34163d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zn znVar, cf0 cf0Var, ta taVar) {
            super(0);
            this.f34161b = znVar;
            this.f34162c = cf0Var;
            this.f34163d = taVar;
        }

        @Override // p9.InterfaceC5480a
        public final List<? extends Certificate> invoke() {
            yn ynVarA = this.f34161b.a();
            kotlin.jvm.internal.l.c(ynVarA);
            return ynVarA.a(this.f34163d.k().g(), this.f34162c.c());
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<List<? extends X509Certificate>> {
        public c() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final List<? extends X509Certificate> invoke() {
            cf0 cf0Var = un1.this.f34148e;
            kotlin.jvm.internal.l.c(cf0Var);
            List<Certificate> listC = cf0Var.c();
            ArrayList arrayList = new ArrayList(C2092m.T(listC, 10));
            for (Certificate certificate : listC) {
                kotlin.jvm.internal.l.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public un1(wn1 connectionPool, ps1 route) {
        kotlin.jvm.internal.l.f(connectionPool, "connectionPool");
        kotlin.jvm.internal.l.f(route, "route");
        this.f34145b = route;
        this.f34157o = 1;
        this.f34158p = new ArrayList();
        this.f34159q = Long.MAX_VALUE;
    }

    private final void n() throws IOException {
        Socket socket = this.f34147d;
        kotlin.jvm.internal.l.c(socket);
        ia.g gVar = this.f34151h;
        kotlin.jvm.internal.l.c(gVar);
        ia.f fVar = this.i;
        kotlin.jvm.internal.l.c(fVar);
        socket.setSoTimeout(0);
        sg0 sg0Var = new sg0(new sg0.a(z32.f36157h).a(socket, this.f34145b.a().k().g(), gVar, fVar).a(this).j());
        this.f34150g = sg0Var;
        this.f34157o = sg0.f32976C.c();
        sg0.l(sg0Var);
    }

    public final ArrayList b() {
        return this.f34158p;
    }

    public final long c() {
        return this.f34159q;
    }

    public final boolean d() {
        return this.f34152j;
    }

    public final int e() {
        return this.f34154l;
    }

    public final cf0 f() {
        return this.f34148e;
    }

    public final synchronized void g() {
        this.f34155m++;
    }

    public final boolean h() {
        return this.f34150g != null;
    }

    public final synchronized void i() {
        this.f34153k = true;
    }

    public final synchronized void j() {
        this.f34152j = true;
    }

    public final ps1 k() {
        return this.f34145b;
    }

    public final void l() {
        this.f34152j = true;
    }

    public final Socket m() {
        Socket socket = this.f34147d;
        kotlin.jvm.internal.l.c(socket);
        return socket;
    }

    public final String toString() {
        Object objA;
        String strG = this.f34145b.a().k().g();
        int i = this.f34145b.a().k().i();
        Proxy proxyB = this.f34145b.b();
        InetSocketAddress inetSocketAddressD = this.f34145b.d();
        cf0 cf0Var = this.f34148e;
        if (cf0Var == null || (objA = cf0Var.a()) == null) {
            objA = "none";
        }
        return "Connection{" + strG + StringUtils.PROCESS_POSTFIX_DELIMITER + i + ", proxy=" + proxyB + " hostAddress=" + inetSocketAddressD + " cipherSuite=" + objA + " protocol=" + this.f34149f + "}";
    }

    public final void a() {
        Socket socket = this.f34146c;
        if (socket != null) {
            t82.a(socket);
        }
    }

    public final void a(int i, int i10, int i11, boolean z10, tn1 call, r50 eventListener) throws Throwable {
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(eventListener, "eventListener");
        if (this.f34149f == null) {
            List<lr> listB = this.f34145b.a().b();
            mr mrVar = new mr(listB);
            if (this.f34145b.a().j() == null) {
                if (listB.contains(lr.f30078f)) {
                    String strG = this.f34145b.a().k().g();
                    int i12 = lh1.f30001c;
                    if (!lh1.a.a().a(strG)) {
                        throw new rs1(new UnknownServiceException(C1154e9.i("CLEARTEXT communication to ", strG, " not permitted by network security policy")));
                    }
                } else {
                    throw new rs1(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.f34145b.a().e().contains(gm1.f27821h)) {
                throw new rs1(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            rs1 rs1Var = null;
            do {
                try {
                    if (this.f34145b.c()) {
                        a(i, i10, i11, call, eventListener);
                        if (this.f34146c == null) {
                        }
                        if (!this.f34145b.c() && this.f34146c == null) {
                            throw new rs1(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f34159q = System.nanoTime();
                        return;
                    }
                    a(i, i10, call, eventListener);
                    a(mrVar, call, eventListener);
                    r50.a(call, this.f34145b.d(), this.f34145b.b());
                    if (!this.f34145b.c()) {
                    }
                    this.f34159q = System.nanoTime();
                    return;
                } catch (IOException e4) {
                    Socket socket = this.f34147d;
                    if (socket != null) {
                        t82.a(socket);
                    }
                    Socket socket2 = this.f34146c;
                    if (socket2 != null) {
                        t82.a(socket2);
                    }
                    this.f34147d = null;
                    this.f34146c = null;
                    this.f34151h = null;
                    this.i = null;
                    this.f34148e = null;
                    this.f34149f = null;
                    this.f34150g = null;
                    this.f34157o = 1;
                    r50.a(call, this.f34145b.d(), this.f34145b.b(), e4);
                    if (rs1Var == null) {
                        rs1Var = new rs1(e4);
                    } else {
                        rs1Var.a(e4);
                    }
                    if (!z10) {
                        throw rs1Var;
                    }
                }
            } while (mrVar.a(e4));
            throw rs1Var;
        }
        throw new IllegalStateException("already connected");
    }

    private final void a(int i, int i10, tn1 tn1Var, r50 r50Var) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyB = this.f34145b.b();
        ta taVarA = this.f34145b.a();
        Proxy.Type type = proxyB.type();
        int i11 = type == null ? -1 : a.f34160a[type.ordinal()];
        if (i11 != 1 && i11 != 2) {
            socketCreateSocket = new Socket(proxyB);
        } else {
            socketCreateSocket = taVarA.i().createSocket();
            kotlin.jvm.internal.l.c(socketCreateSocket);
        }
        this.f34146c = socketCreateSocket;
        InetSocketAddress inetSocketAddressD = this.f34145b.d();
        r50Var.getClass();
        r50.b(tn1Var, inetSocketAddressD, proxyB);
        socketCreateSocket.setSoTimeout(i10);
        try {
            int i12 = lh1.f30001c;
            lh1.a.a().a(socketCreateSocket, this.f34145b.d(), i);
            try {
                this.f34151h = ia.q.c(ia.q.h(socketCreateSocket));
                this.i = ia.q.b(ia.q.e(socketCreateSocket));
            } catch (NullPointerException e4) {
                if (kotlin.jvm.internal.l.b(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f34145b.d());
            connectException.initCause(e10);
            throw connectException;
        }
    }

    private final void a(mr mrVar) throws Throwable {
        SSLSocket sSLSocket;
        gm1 gm1VarA;
        ta taVarA = this.f34145b.a();
        SSLSocketFactory sSLSocketFactoryJ = taVarA.j();
        SSLSocket sSLSocket2 = null;
        String strB = null;
        try {
            kotlin.jvm.internal.l.c(sSLSocketFactoryJ);
            Socket socketCreateSocket = sSLSocketFactoryJ.createSocket(this.f34146c, taVarA.k().g(), taVarA.k().i(), true);
            kotlin.jvm.internal.l.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            sSLSocket = (SSLSocket) socketCreateSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            lr lrVarA = mrVar.a(sSLSocket);
            if (lrVarA.b()) {
                int i = lh1.f30001c;
                lh1.a.a().a(sSLSocket, taVarA.k().g(), taVarA.e());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            kotlin.jvm.internal.l.c(session);
            cf0 cf0VarA = cf0.a.a(session);
            HostnameVerifier hostnameVerifierD = taVarA.d();
            kotlin.jvm.internal.l.c(hostnameVerifierD);
            if (!hostnameVerifierD.verify(taVarA.k().g(), session)) {
                List<Certificate> listC = cf0VarA.c();
                if (!listC.isEmpty()) {
                    Certificate certificate = listC.get(0);
                    kotlin.jvm.internal.l.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    String strG = taVarA.k().g();
                    zn znVar = zn.f36553c;
                    throw new SSLPeerUnverifiedException(C5828j.M("\n              |Hostname " + strG + " not verified:\n              |    certificate: " + zn.b.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + ud1.a(x509Certificate) + "\n              "));
                }
                throw new SSLPeerUnverifiedException("Hostname " + taVarA.k().g() + " not verified (no certificates)");
            }
            zn znVarA = taVarA.a();
            kotlin.jvm.internal.l.c(znVarA);
            this.f34148e = new cf0(cf0VarA.d(), cf0VarA.a(), cf0VarA.b(), new b(znVarA, cf0VarA, taVarA));
            znVarA.a(taVarA.k().g(), new c());
            if (lrVarA.b()) {
                int i10 = lh1.f30001c;
                strB = lh1.a.a().b(sSLSocket);
            }
            this.f34147d = sSLSocket;
            this.f34151h = ia.q.c(ia.q.h(sSLSocket));
            this.i = ia.q.b(ia.q.e(sSLSocket));
            if (strB != null) {
                gm1.f27816c.getClass();
                gm1VarA = gm1.a.a(strB);
            } else {
                gm1VarA = gm1.f27818e;
            }
            this.f34149f = gm1VarA;
            int i11 = lh1.f30001c;
            lh1.a.a().a(sSLSocket);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                int i12 = lh1.f30001c;
                lh1.a.a().a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                t82.a((Socket) sSLSocket2);
            }
            throw th;
        }
    }

    private final void a(int i, int i10, int i11, tn1 call, r50 r50Var) throws IOException {
        pp1 pp1VarA = new pp1.a().a(this.f34145b.a().k()).a("CONNECT", (sp1) null).b("Host", t82.a(this.f34145b.a().k(), true)).b("Proxy-Connection", "Keep-Alive").b("User-Agent", "okhttp/4.9.3").a();
        pp1 pp1VarA2 = this.f34145b.a().g().a(this.f34145b, new pq1.a().a(pp1VarA).a(gm1.f27818e).a(407).a("Preemptive Authenticate").a(t82.f33482c).b(-1L).a(-1L).c().a());
        if (pp1VarA2 != null) {
            pp1VarA = pp1VarA2;
        }
        rh0 rh0VarG = pp1VarA.g();
        for (int i12 = 0; i12 < 21; i12++) {
            a(i, i10, call, r50Var);
            pp1VarA = a(i10, i11, pp1VarA, rh0VarG);
            if (pp1VarA == null) {
                return;
            }
            Socket socket = this.f34146c;
            if (socket != null) {
                t82.a(socket);
            }
            this.f34146c = null;
            this.i = null;
            this.f34151h = null;
            InetSocketAddress inetSocketAddress = this.f34145b.d();
            Proxy proxy = this.f34145b.b();
            kotlin.jvm.internal.l.f(call, "call");
            kotlin.jvm.internal.l.f(inetSocketAddress, "inetSocketAddress");
            kotlin.jvm.internal.l.f(proxy, "proxy");
        }
    }

    private final pp1 a(int i, int i10, pp1 pp1Var, rh0 rh0Var) throws IOException {
        String strI = C1154e9.i("CONNECT ", t82.a(rh0Var, true), " HTTP/1.1");
        while (true) {
            ia.g gVar = this.f34151h;
            kotlin.jvm.internal.l.c(gVar);
            ia.f fVar = this.i;
            kotlin.jvm.internal.l.c(fVar);
            qg0 qg0Var = new qg0(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.timeout().timeout(i, timeUnit);
            fVar.timeout().timeout(i10, timeUnit);
            qg0Var.a(pp1Var.d(), strI);
            qg0Var.a();
            pq1.a aVarA = qg0Var.a(false);
            kotlin.jvm.internal.l.c(aVarA);
            pq1 pq1VarA = aVarA.a(pp1Var).a();
            qg0Var.c(pq1VarA);
            int iD = pq1VarA.d();
            if (iD == 200) {
                if (gVar.q().K() && fVar.q().K()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iD == 407) {
                pp1 pp1VarA = this.f34145b.a().g().a(this.f34145b, pq1VarA);
                if (pp1VarA != null) {
                    if (com.vungle.ads.internal.presenter.g.CLOSE.equalsIgnoreCase(pq1.a(pq1VarA, "Connection"))) {
                        return pp1VarA;
                    }
                    pp1Var = pp1VarA;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException(C4356c.h(pq1VarA.d(), "Unexpected response code for CONNECT: "));
            }
        }
    }

    private final void a(mr mrVar, tn1 call, r50 r50Var) throws Throwable {
        if (this.f34145b.a().j() == null) {
            List<gm1> listE = this.f34145b.a().e();
            gm1 gm1Var = gm1.f27821h;
            if (listE.contains(gm1Var)) {
                this.f34147d = this.f34146c;
                this.f34149f = gm1Var;
                n();
                return;
            } else {
                this.f34147d = this.f34146c;
                this.f34149f = gm1.f27818e;
                return;
            }
        }
        r50Var.getClass();
        kotlin.jvm.internal.l.f(call, "call");
        a(mrVar);
        if (this.f34149f == gm1.f27820g) {
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        if (r6.d() == com.yandex.mobile.ads.impl.ud1.f34038a) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        if (a(r6.k()) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        r7 = r6.a();
        kotlin.jvm.internal.l.c(r7);
        r6 = r6.k().g();
        r0 = r5.f34148e;
        kotlin.jvm.internal.l.c(r0);
        r7.a(r6, r0.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.yandex.mobile.ads.impl.ta r6, java.util.List<com.yandex.mobile.ads.impl.ps1> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.l.f(r6, r0)
            boolean r0 = com.yandex.mobile.ads.impl.t82.f33485f
            if (r0 == 0) goto L34
            boolean r0 = java.lang.Thread.holdsLock(r5)
            if (r0 == 0) goto L10
            goto L34
        L10:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Thread "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = " MUST hold lock on "
            r0.append(r7)
            r0.append(r5)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L34:
            java.util.ArrayList r0 = r5.f34158p
            int r0 = r0.size()
            int r1 = r5.f34157o
            r2 = 0
            if (r0 >= r1) goto Le6
            boolean r0 = r5.f34152j
            if (r0 == 0) goto L45
            goto Le6
        L45:
            com.yandex.mobile.ads.impl.ps1 r0 = r5.f34145b
            com.yandex.mobile.ads.impl.ta r0 = r0.a()
            boolean r0 = r0.a(r6)
            if (r0 != 0) goto L52
            return r2
        L52:
            com.yandex.mobile.ads.impl.rh0 r0 = r6.k()
            java.lang.String r0 = r0.g()
            com.yandex.mobile.ads.impl.ps1 r1 = r5.f34145b
            com.yandex.mobile.ads.impl.ta r1 = r1.a()
            com.yandex.mobile.ads.impl.rh0 r1 = r1.k()
            java.lang.String r1 = r1.g()
            boolean r0 = kotlin.jvm.internal.l.b(r0, r1)
            r1 = 1
            if (r0 == 0) goto L70
            return r1
        L70:
            com.yandex.mobile.ads.impl.sg0 r0 = r5.f34150g
            if (r0 != 0) goto L75
            return r2
        L75:
            if (r7 == 0) goto Le6
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L7e
            goto Le6
        L7e:
            java.util.Iterator r7 = r7.iterator()
        L82:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Le6
            java.lang.Object r0 = r7.next()
            com.yandex.mobile.ads.impl.ps1 r0 = (com.yandex.mobile.ads.impl.ps1) r0
            java.net.Proxy r3 = r0.b()
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L82
            com.yandex.mobile.ads.impl.ps1 r3 = r5.f34145b
            java.net.Proxy r3 = r3.b()
            java.net.Proxy$Type r3 = r3.type()
            if (r3 != r4) goto L82
            com.yandex.mobile.ads.impl.ps1 r3 = r5.f34145b
            java.net.InetSocketAddress r3 = r3.d()
            java.net.InetSocketAddress r0 = r0.d()
            boolean r0 = kotlin.jvm.internal.l.b(r3, r0)
            if (r0 == 0) goto L82
            javax.net.ssl.HostnameVerifier r7 = r6.d()
            com.yandex.mobile.ads.impl.ud1 r0 = com.yandex.mobile.ads.impl.ud1.f34038a
            if (r7 == r0) goto Lbf
            return r2
        Lbf:
            com.yandex.mobile.ads.impl.rh0 r7 = r6.k()
            boolean r7 = r5.a(r7)
            if (r7 != 0) goto Lca
            return r2
        Lca:
            com.yandex.mobile.ads.impl.zn r7 = r6.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le6
            kotlin.jvm.internal.l.c(r7)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le6
            com.yandex.mobile.ads.impl.rh0 r6 = r6.k()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le6
            java.lang.String r6 = r6.g()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le6
            com.yandex.mobile.ads.impl.cf0 r0 = r5.f34148e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le6
            kotlin.jvm.internal.l.c(r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le6
            java.util.List r0 = r0.c()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le6
            r7.a(r6, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le6
            return r1
        Le6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.un1.a(com.yandex.mobile.ads.impl.ta, java.util.List):boolean");
    }

    public final x50 a(vd1 client, xn1 chain) throws SocketException {
        kotlin.jvm.internal.l.f(client, "client");
        kotlin.jvm.internal.l.f(chain, "chain");
        Socket socket = this.f34147d;
        kotlin.jvm.internal.l.c(socket);
        ia.g gVar = this.f34151h;
        kotlin.jvm.internal.l.c(gVar);
        ia.f fVar = this.i;
        kotlin.jvm.internal.l.c(fVar);
        sg0 sg0Var = this.f34150g;
        if (sg0Var != null) {
            return new xg0(client, this, chain, sg0Var);
        }
        socket.setSoTimeout(chain.h());
        ia.D dTimeout = gVar.timeout();
        long jE = chain.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dTimeout.timeout(jE, timeUnit);
        fVar.timeout().timeout(chain.g(), timeUnit);
        return new qg0(client, this, gVar, fVar);
    }

    @Override // com.yandex.mobile.ads.impl.sg0.b
    public final synchronized void a(sg0 connection, ox1 settings) {
        kotlin.jvm.internal.l.f(connection, "connection");
        kotlin.jvm.internal.l.f(settings, "settings");
        this.f34157o = settings.c();
    }

    @Override // com.yandex.mobile.ads.impl.sg0.b
    public final void a(zg0 stream) throws IOException {
        kotlin.jvm.internal.l.f(stream, "stream");
        stream.a(o50.f31190h, (IOException) null);
    }

    public final void a(long j4) {
        this.f34159q = j4;
    }

    public final synchronized void a(tn1 call, IOException iOException) {
        try {
            kotlin.jvm.internal.l.f(call, "call");
            if (iOException instanceof n22) {
                o50 o50Var = ((n22) iOException).f30745b;
                if (o50Var == o50.f31190h) {
                    int i = this.f34156n + 1;
                    this.f34156n = i;
                    if (i > 1) {
                        this.f34152j = true;
                        this.f34154l++;
                    }
                } else if (o50Var != o50.i || !call.j()) {
                    this.f34152j = true;
                    this.f34154l++;
                }
            } else if (!h() || (iOException instanceof kr)) {
                this.f34152j = true;
                if (this.f34155m == 0) {
                    if (iOException != null) {
                        vd1 client = call.c();
                        ps1 failedRoute = this.f34145b;
                        kotlin.jvm.internal.l.f(client, "client");
                        kotlin.jvm.internal.l.f(failedRoute, "failedRoute");
                        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
                            ta taVarA = failedRoute.a();
                            taVarA.h().connectFailed(taVarA.k().l(), failedRoute.b().address(), iOException);
                        }
                        client.n().b(failedRoute);
                    }
                    this.f34154l++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean a(rh0 rh0Var) {
        cf0 cf0Var;
        if (t82.f33485f && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        rh0 rh0VarK = this.f34145b.a().k();
        if (rh0Var.i() != rh0VarK.i()) {
            return false;
        }
        if (kotlin.jvm.internal.l.b(rh0Var.g(), rh0VarK.g())) {
            return true;
        }
        if (!this.f34153k && (cf0Var = this.f34148e) != null) {
            List<Certificate> listC = cf0Var.c();
            if (!listC.isEmpty()) {
                String strG = rh0Var.g();
                Certificate certificate = listC.get(0);
                kotlin.jvm.internal.l.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                if (ud1.a(strG, (X509Certificate) certificate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(boolean z10) {
        long j4;
        if (t82.f33485f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f34146c;
        kotlin.jvm.internal.l.c(socket);
        Socket socket2 = this.f34147d;
        kotlin.jvm.internal.l.c(socket2);
        ia.g gVar = this.f34151h;
        kotlin.jvm.internal.l.c(gVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        sg0 sg0Var = this.f34150g;
        if (sg0Var != null) {
            return sg0Var.a(jNanoTime);
        }
        synchronized (this) {
            j4 = jNanoTime - this.f34159q;
        }
        if (j4 < 10000000000L || !z10) {
            return true;
        }
        return t82.a(socket2, gVar);
    }
}
