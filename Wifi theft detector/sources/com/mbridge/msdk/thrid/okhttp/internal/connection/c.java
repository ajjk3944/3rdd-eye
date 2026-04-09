package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.h;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.http2.g;
import com.mbridge.msdk.thrid.okhttp.j;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.thrid.okio.l;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class c extends g.j implements h {

    /* renamed from: b, reason: collision with root package name */
    private final i f17666b;

    /* renamed from: c, reason: collision with root package name */
    private final c0 f17667c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f17668d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f17669e;

    /* renamed from: f, reason: collision with root package name */
    private q f17670f;

    /* renamed from: g, reason: collision with root package name */
    private w f17671g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http2.g f17672h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.e f17673i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.d f17674j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17675k;

    /* renamed from: l, reason: collision with root package name */
    public int f17676l;

    /* renamed from: m, reason: collision with root package name */
    public int f17677m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final List<Reference<g>> f17678n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public long f17679o = Long.MAX_VALUE;

    public c(i iVar, c0 c0Var) {
        this.f17666b = iVar;
        this.f17667c = c0Var;
    }

    private y e() throws IOException {
        y yVarA = new y.a().a(this.f17667c.a().k()).a("CONNECT", (z) null).b("Host", com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f17667c.a().k(), true)).b("Proxy-Connection", "Keep-Alive").b(Command.HTTP_HEADER_USER_AGENT, com.mbridge.msdk.thrid.okhttp.internal.d.a()).a();
        y yVarA2 = this.f17667c.a().g().a(this.f17667c, new a0.a().a(yVarA).a(w.HTTP_1_1).a(TTAdConstant.DOWNLOAD_APP_INFO_CODE).a("Preemptive Authenticate").a(com.mbridge.msdk.thrid.okhttp.internal.c.f17628c).b(-1L).a(-1L).b("Proxy-Authenticate", "OkHttp-Preemptive").a());
        return yVarA2 != null ? yVarA2 : yVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r13, int r14, int r15, int r16, boolean r17, com.mbridge.msdk.thrid.okhttp.d r18, com.mbridge.msdk.thrid.okhttp.o r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.connection.c.a(int, int, int, int, boolean, com.mbridge.msdk.thrid.okhttp.d, com.mbridge.msdk.thrid.okhttp.o):void");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public q b() {
        return this.f17670f;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public c0 c() {
        return this.f17667c;
    }

    public void d() throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f17668d);
    }

    public boolean f() {
        return this.f17672h != null;
    }

    public Socket g() {
        return this.f17669e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f17667c.a().k().g());
        sb.append(":");
        sb.append(this.f17667c.a().k().j());
        sb.append(", proxy=");
        sb.append(this.f17667c.b());
        sb.append(" hostAddress=");
        sb.append(this.f17667c.d());
        sb.append(" cipherSuite=");
        q qVar = this.f17670f;
        sb.append(qVar != null ? qVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.f17671g);
        sb.append('}');
        return sb.toString();
    }

    private void a(int i10, int i11, int i12, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        y yVarE = e();
        s sVarG = yVarE.g();
        for (int i13 = 0; i13 < 21; i13++) {
            a(i10, i11, dVar, oVar);
            yVarE = a(i11, i12, yVarE, sVarG);
            if (yVarE == null) {
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f17668d);
            this.f17668d = null;
            this.f17674j = null;
            this.f17673i = null;
            oVar.connectEnd(dVar, this.f17667c.d(), this.f17667c.b(), null);
        }
    }

    private void a(int i10, int i11, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        Proxy proxyB = this.f17667c.b();
        this.f17668d = (proxyB.type() == Proxy.Type.DIRECT || proxyB.type() == Proxy.Type.HTTP) ? this.f17667c.a().i().createSocket() : new Socket(proxyB);
        oVar.connectStart(dVar, this.f17667c.d(), proxyB);
        this.f17668d.setSoTimeout(i11);
        try {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f17668d, this.f17667c.d(), i10);
            try {
                this.f17673i = l.a(l.b(this.f17668d));
                this.f17674j = l.a(l.a(this.f17668d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f17667c.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private void a(b bVar, int i10, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws Throwable {
        if (this.f17667c.a().j() == null) {
            List<w> listE = this.f17667c.a().e();
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (listE.contains(wVar)) {
                this.f17669e = this.f17668d;
                this.f17671g = wVar;
                a(i10);
                return;
            } else {
                this.f17669e = this.f17668d;
                this.f17671g = w.HTTP_1_1;
                return;
            }
        }
        oVar.secureConnectStart(dVar);
        a(bVar);
        oVar.secureConnectEnd(dVar, this.f17670f);
        if (this.f17671g == w.HTTP_2) {
            a(i10);
        }
    }

    private void a(int i10) throws IOException {
        this.f17669e.setSoTimeout(0);
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVarA = new g.h(true).a(this.f17669e, this.f17667c.a().k().g(), this.f17673i, this.f17674j).a(this).a(i10).a();
        this.f17672h = gVarA;
        gVarA.m();
    }

    private void a(b bVar) throws Throwable {
        com.mbridge.msdk.thrid.okhttp.a aVarA = this.f17667c.a();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) aVarA.j().createSocket(this.f17668d, aVarA.k().g(), aVarA.k().j(), true);
                try {
                    j jVarA = bVar.a(sSLSocket2);
                    if (jVarA.c()) {
                        com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket2, aVarA.k().g(), aVarA.e());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    q qVarA = q.a(session);
                    if (!aVarA.d().verify(aVarA.k().g(), session)) {
                        List<Certificate> listB = qVarA.b();
                        if (!listB.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) listB.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified:\n    certificate: " + com.mbridge.msdk.thrid.okhttp.f.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.mbridge.msdk.thrid.okhttp.internal.tls.d.a(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified (no certificates)");
                    }
                    aVarA.a().a(aVarA.k().g(), qVarA.b());
                    String strB = jVarA.c() ? com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().b(sSLSocket2) : null;
                    this.f17669e = sSLSocket2;
                    this.f17673i = l.a(l.b(sSLSocket2));
                    this.f17674j = l.a(l.a(this.f17669e));
                    this.f17670f = qVarA;
                    this.f17671g = strB != null ? w.a(strB) : w.HTTP_1_1;
                    com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket2);
                } catch (AssertionError e10) {
                    e = e10;
                    if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket);
                    }
                    com.mbridge.msdk.thrid.okhttp.internal.c.a((Socket) sSLSocket);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (AssertionError e11) {
            e = e11;
        }
    }

    private y a(int i10, int i11, y yVar, s sVar) throws IOException {
        String str = "CONNECT " + com.mbridge.msdk.thrid.okhttp.internal.c.a(sVar, true) + " HTTP/1.1";
        while (true) {
            com.mbridge.msdk.thrid.okhttp.internal.http1.a aVar = new com.mbridge.msdk.thrid.okhttp.internal.http1.a(null, null, this.f17673i, this.f17674j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f17673i.b().a(i10, timeUnit);
            this.f17674j.b().a(i11, timeUnit);
            aVar.a(yVar.c(), str);
            aVar.a();
            a0 a0VarA = aVar.a(false).a(yVar).a();
            long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0VarA);
            if (jA == -1) {
                jA = 0;
            }
            com.mbridge.msdk.thrid.okio.s sVarB = aVar.b(jA);
            com.mbridge.msdk.thrid.okhttp.internal.c.b(sVarB, Integer.MAX_VALUE, timeUnit);
            sVarB.close();
            int iK = a0VarA.k();
            if (iK == 200) {
                if (this.f17673i.a().f() && this.f17674j.a().f()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iK == 407) {
                y yVarA = this.f17667c.a().g().a(this.f17667c, a0VarA);
                if (yVarA != null) {
                    if ("close".equalsIgnoreCase(a0VarA.b("Connection"))) {
                        return yVarA;
                    }
                    yVar = yVarA;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + a0VarA.k());
            }
        }
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, @Nullable c0 c0Var) {
        if (this.f17678n.size() >= this.f17677m || this.f17675k || !com.mbridge.msdk.thrid.okhttp.internal.a.f17624a.a(this.f17667c.a(), aVar)) {
            return false;
        }
        if (aVar.k().g().equals(c().a().k().g())) {
            return true;
        }
        if (this.f17672h == null || c0Var == null) {
            return false;
        }
        Proxy.Type type = c0Var.b().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || this.f17667c.b().type() != type2 || !this.f17667c.d().equals(c0Var.d()) || c0Var.a().d() != com.mbridge.msdk.thrid.okhttp.internal.tls.d.f17983a || !a(aVar.k())) {
            return false;
        }
        try {
            aVar.a().a(aVar.k().g(), b().b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(s sVar) {
        if (sVar.j() != this.f17667c.a().k().j()) {
            return false;
        }
        if (sVar.g().equals(this.f17667c.a().k().g())) {
            return true;
        }
        return this.f17670f != null && com.mbridge.msdk.thrid.okhttp.internal.tls.d.f17983a.a(sVar.g(), (X509Certificate) this.f17670f.b().get(0));
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, g gVar) throws SocketException {
        if (this.f17672h != null) {
            return new com.mbridge.msdk.thrid.okhttp.internal.http2.f(vVar, aVar, gVar, this.f17672h);
        }
        this.f17669e.setSoTimeout(aVar.b());
        com.mbridge.msdk.thrid.okio.t tVarB = this.f17673i.b();
        long jB = aVar.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarB.a(jB, timeUnit);
        this.f17674j.b().a(aVar.c(), timeUnit);
        return new com.mbridge.msdk.thrid.okhttp.internal.http1.a(vVar, gVar, this.f17673i, this.f17674j);
    }

    public boolean a(boolean z10) throws SocketException {
        if (this.f17669e.isClosed() || this.f17669e.isInputShutdown() || this.f17669e.isOutputShutdown()) {
            return false;
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar = this.f17672h;
        if (gVar != null) {
            return gVar.f(System.nanoTime());
        }
        if (z10) {
            try {
                int soTimeout = this.f17669e.getSoTimeout();
                try {
                    this.f17669e.setSoTimeout(1);
                    return !this.f17673i.f();
                } finally {
                    this.f17669e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
        iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar) {
        synchronized (this.f17666b) {
            this.f17677m = gVar.k();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public w a() {
        return this.f17671g;
    }
}
