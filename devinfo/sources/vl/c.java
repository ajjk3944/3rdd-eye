package vl;

import a0.x0;
import ec.t0;
import hm.y;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import rl.d0;
import rl.u;
import rl.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements r, wl.e {

    /* renamed from: a, reason: collision with root package name */
    public final ul.d f36291a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f36292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36293c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36294d;

    /* renamed from: e, reason: collision with root package name */
    public final int f36295e;

    /* renamed from: f, reason: collision with root package name */
    public final int f36296f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final m f36297h;

    /* renamed from: i, reason: collision with root package name */
    public final o f36298i;
    public final d0 j;

    /* renamed from: k, reason: collision with root package name */
    public final List f36299k;

    /* renamed from: l, reason: collision with root package name */
    public final va.o f36300l;

    /* renamed from: m, reason: collision with root package name */
    public final int f36301m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f36302n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f36303o;

    /* renamed from: p, reason: collision with root package name */
    public Socket f36304p;

    /* renamed from: q, reason: collision with root package name */
    public Socket f36305q;

    /* renamed from: r, reason: collision with root package name */
    public rl.l f36306r;

    /* renamed from: s, reason: collision with root package name */
    public u f36307s;

    /* renamed from: t, reason: collision with root package name */
    public i0.f f36308t;

    /* renamed from: u, reason: collision with root package name */
    public n f36309u;

    public c(ul.d dVar, t0 t0Var, int i4, int i10, int i11, int i12, boolean z3, m mVar, o oVar, d0 d0Var, List list, va.o oVar2, int i13, boolean z10) {
        nk.k.e(dVar, "taskRunner");
        nk.k.e(t0Var, "connectionPool");
        nk.k.e(d0Var, "route");
        this.f36291a = dVar;
        this.f36292b = t0Var;
        this.f36293c = i4;
        this.f36294d = i10;
        this.f36295e = i11;
        this.f36296f = i12;
        this.g = z3;
        this.f36297h = mVar;
        this.f36298i = oVar;
        this.j = d0Var;
        this.f36299k = list;
        this.f36300l = oVar2;
        this.f36301m = i13;
        this.f36302n = z10;
    }

    @Override // vl.r
    public final r a() {
        return new c(this.f36291a, this.f36292b, this.f36293c, this.f36294d, this.f36295e, this.f36296f, this.g, this.f36297h, this.f36298i, this.j, this.f36299k, this.f36300l, this.f36301m, this.f36302n);
    }

    @Override // vl.r
    public final n b() {
        this.f36297h.f36332a.f33176y.i(this.j);
        n nVar = this.f36309u;
        nk.k.b(nVar);
        nk.k.e(this.j, "route");
        p pVarE = this.f36298i.e(this, this.f36299k);
        if (pVarE != null) {
            return pVarE.f36376a;
        }
        synchronized (nVar) {
            t0 t0Var = this.f36292b;
            t0Var.getClass();
            TimeZone timeZone = sl.h.f33837a;
            ((ConcurrentLinkedQueue) t0Var.f23072e).add(nVar);
            ((ul.c) t0Var.f23070c).d((ul.b) t0Var.f23071d, 0L);
            this.f36297h.b(nVar);
        }
        return nVar;
    }

    @Override // vl.r
    public final boolean c() {
        return this.f36307s != null;
    }

    @Override // vl.r, wl.e
    public final void cancel() {
        this.f36303o = true;
        Socket socket = this.f36304p;
        if (socket != null) {
            sl.h.c(socket);
        }
    }

    @Override // vl.r
    public final q d() {
        Socket socket;
        Socket socket2;
        t0 t0Var = this.f36292b;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f36297h.f36347r;
        d0 d0Var = this.j;
        if (this.f36304p != null) {
            throw new IllegalStateException("TCP already connected");
        }
        copyOnWriteArrayList.add(this);
        boolean z3 = false;
        try {
            try {
                nk.k.e(d0Var.f33054c, "inetSocketAddress");
                t0Var.getClass();
                i();
                z3 = true;
                q qVar = new q(this, (Throwable) null, 6);
                copyOnWriteArrayList.remove(this);
                return qVar;
            } catch (IOException e2) {
                rl.a aVar = d0Var.f33052a;
                if (d0Var.f33053b.type() != Proxy.Type.DIRECT) {
                    rl.a aVar2 = d0Var.f33052a;
                    aVar2.g.connectFailed(aVar2.f33026h.h(), d0Var.f33053b.address(), e2);
                }
                nk.k.e(d0Var.f33054c, "inetSocketAddress");
                t0Var.getClass();
                q qVar2 = new q(this, e2, 2);
                copyOnWriteArrayList.remove(this);
                if (!z3 && (socket = this.f36304p) != null) {
                    sl.h.c(socket);
                }
                return qVar2;
            }
        } catch (Throwable th2) {
            copyOnWriteArrayList.remove(this);
            if (!z3 && (socket2 = this.f36304p) != null) {
                sl.h.c(socket2);
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0130 A[Catch: all -> 0x016a, TryCatch #4 {all -> 0x016a, blocks: (B:84:0x0126, B:86:0x0130, B:89:0x0135, B:92:0x013a, B:94:0x013e, B:97:0x0147, B:100:0x014c, B:105:0x0155), top: B:130:0x0126 }] */
    @Override // vl.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final vl.q f() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.c.f():vl.q");
    }

    @Override // wl.e
    public final d0 h() {
        return this.j;
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.j.f33053b.type();
        int i4 = type == null ? -1 : b.f36290a[type.ordinal()];
        if (i4 == 1 || i4 == 2) {
            socketCreateSocket = this.j.f33052a.f33021b.createSocket();
            nk.k.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(this.j.f33053b);
        }
        this.f36304p = socketCreateSocket;
        if (this.f36303o) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f36296f);
        try {
            bm.e eVar = bm.e.f2349a;
            bm.e.f2349a.f(socketCreateSocket, this.j.f33054c, this.f36295e);
            try {
                this.f36308t = new i0.f(new x0(socketCreateSocket));
            } catch (NullPointerException e2) {
                if (nk.k.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.f33054c);
            connectException.initCause(e10);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, rl.h hVar) {
        String strG;
        u uVarD;
        rl.a aVar = this.j.f33052a;
        try {
            if (hVar.f33087b) {
                bm.e eVar = bm.e.f2349a;
                bm.e.f2349a.e(sSLSocket, aVar.f33026h.f33116d, aVar.f33027i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            nk.k.b(session);
            rl.l lVarG = pk.a.g(session);
            HostnameVerifier hostnameVerifier = aVar.f33023d;
            nk.k.b(hostnameVerifier);
            boolean zVerify = hostnameVerifier.verify(aVar.f33026h.f33116d, session);
            int i4 = 7;
            if (!zVerify) {
                List listA = lVarG.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar.f33026h.f33116d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                nk.k.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb2 = new StringBuilder("\n            |Hostname ");
                sb2.append(aVar.f33026h.f33116d);
                sb2.append(" not verified:\n            |    certificate: ");
                rl.e eVar2 = rl.e.f33055c;
                sb2.append(nh.a.q(x509Certificate));
                sb2.append("\n            |    DN: ");
                sb2.append(x509Certificate.getSubjectDN().getName());
                sb2.append("\n            |    subjectAltNames: ");
                sb2.append(zj.n.j0(fm.c.a(x509Certificate, 7), fm.c.a(x509Certificate, 2)));
                sb2.append("\n            ");
                throw new SSLPeerUnverifiedException(vk.j.m0(sb2.toString()));
            }
            rl.e eVar3 = aVar.f33024e;
            nk.k.b(eVar3);
            this.f36306r = new rl.l(lVarG.f33107a, lVarG.f33108b, lVarG.f33109c, new c1.b(eVar3, lVarG, aVar, i4));
            nk.k.e(aVar.f33026h.f33116d, "hostname");
            Iterator it = eVar3.f33056a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (hVar.f33087b) {
                bm.e eVar4 = bm.e.f2349a;
                strG = bm.e.f2349a.g(sSLSocket);
            } else {
                strG = null;
            }
            this.f36305q = sSLSocket;
            this.f36308t = new i0.f(new x0(sSLSocket));
            if (strG != null) {
                u.f33178b.getClass();
                uVarD = rl.b.d(strG);
            } else {
                uVarD = u.HTTP_1_1;
            }
            this.f36307s = uVarD;
            bm.e eVar5 = bm.e.f2349a;
            bm.e.f2349a.getClass();
        } catch (Throwable th2) {
            bm.e eVar6 = bm.e.f2349a;
            bm.e.f2349a.getClass();
            sl.h.c(sSLSocket);
            throw th2;
        }
    }

    public final q k() throws IOException {
        va.o oVar = this.f36300l;
        nk.k.b(oVar);
        d0 d0Var = this.j;
        String str = "CONNECT " + sl.h.i(d0Var.f33052a.f33026h, true) + " HTTP/1.1";
        i0.f fVar = this.f36308t;
        if (fVar == null) {
            nk.k.k("socket");
            throw null;
        }
        xl.g gVar = new xl.g(null, this, fVar);
        i0.f fVar2 = this.f36308t;
        if (fVar2 == null) {
            nk.k.k("socket");
            throw null;
        }
        y yVarTimeout = ((hm.q) fVar2.f25417c).f25203a.timeout();
        long j = this.f36293c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVarTimeout.g(j);
        i0.f fVar3 = this.f36308t;
        if (fVar3 == null) {
            nk.k.k("socket");
            throw null;
        }
        ((hm.p) fVar3.f25418d).f25200a.timeout().g(this.f36294d);
        gVar.i((rl.m) oVar.f36148d, str);
        gVar.finishRequest();
        rl.y responseHeaders = gVar.readResponseHeaders(false);
        nk.k.b(responseHeaders);
        responseHeaders.f33191a = oVar;
        z zVarA = responseHeaders.a();
        int i4 = zVarA.f33207d;
        long jE = sl.h.e(zVarA);
        if (jE != -1) {
            xl.d dVarH = gVar.h((rl.n) zVarA.f33204a.f36146b, jE);
            sl.h.g(dVarH, Integer.MAX_VALUE);
            dVarH.close();
        }
        if (i4 == 200) {
            return new q(this, (Throwable) null, 6);
        }
        if (i4 != 407) {
            throw new IOException(je.u.r(i4, "Unexpected response code for CONNECT: "));
        }
        d0Var.f33052a.f33025f.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    public final c l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        nk.k.e(list, "connectionSpecs");
        int i4 = this.f36301m;
        int size = list.size();
        for (int i10 = i4 + 1; i10 < size; i10++) {
            rl.h hVar = (rl.h) list.get(i10);
            hVar.getClass();
            if (hVar.f33086a && (((strArr = hVar.f33089d) == null || sl.f.e(strArr, sSLSocket.getEnabledProtocols(), bk.b.f2273b)) && ((strArr2 = hVar.f33088c) == null || sl.f.e(strArr2, sSLSocket.getEnabledCipherSuites(), rl.g.f33067c)))) {
                return new c(this.f36291a, this.f36292b, this.f36293c, this.f36294d, this.f36295e, this.f36296f, this.g, this.f36297h, this.f36298i, this.j, this.f36299k, this.f36300l, i10, i4 != -1);
            }
        }
        return null;
    }

    public final c m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        nk.k.e(list, "connectionSpecs");
        if (this.f36301m != -1) {
            return this;
        }
        c cVarL = l(list, sSLSocket);
        if (cVarL != null) {
            return cVarL;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f36302n);
        sb2.append(", modes=");
        sb2.append(list);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        nk.k.b(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        nk.k.d(string, "toString(...)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // wl.e
    public final void e() {
    }

    @Override // wl.e
    public final void g(m mVar, IOException iOException) {
    }
}
