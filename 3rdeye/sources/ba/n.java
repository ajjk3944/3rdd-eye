package ba;

import U9.E;
import U9.s;
import U9.x;
import U9.y;
import U9.z;
import Z9.i;
import b9.C1992A;
import ba.p;
import ia.A;
import ia.C;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: Http2ExchangeCodec.kt */
/* loaded from: classes3.dex */
public final class n implements Z9.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List<String> f18205g = V9.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List<String> f18206h = V9.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final Y9.g f18207a;

    /* renamed from: b, reason: collision with root package name */
    public final Z9.f f18208b;

    /* renamed from: c, reason: collision with root package name */
    public final f f18209c;

    /* renamed from: d, reason: collision with root package name */
    public volatile p f18210d;

    /* renamed from: e, reason: collision with root package name */
    public final y f18211e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f18212f;

    public n(x client, Y9.g connection, Z9.f fVar, f http2Connection) {
        kotlin.jvm.internal.l.f(client, "client");
        kotlin.jvm.internal.l.f(connection, "connection");
        kotlin.jvm.internal.l.f(http2Connection, "http2Connection");
        this.f18207a = connection;
        this.f18208b = fVar;
        this.f18209c = http2Connection;
        y yVar = y.H2_PRIOR_KNOWLEDGE;
        this.f18211e = client.f12767t.contains(yVar) ? yVar : y.HTTP_2;
    }

    @Override // Z9.d
    public final void a() throws IOException {
        p pVar = this.f18210d;
        kotlin.jvm.internal.l.c(pVar);
        pVar.g().close();
    }

    @Override // Z9.d
    public final void b(z zVar) throws IOException {
        int i;
        p pVar;
        boolean z10 = true;
        if (this.f18210d != null) {
            return;
        }
        boolean z11 = zVar.f12798d != null;
        U9.s sVar = zVar.f12797c;
        ArrayList arrayList = new ArrayList(sVar.size() + 4);
        arrayList.add(new c(c.f18115f, zVar.f12796b));
        ia.h hVar = c.f18116g;
        U9.t url = zVar.f12795a;
        kotlin.jvm.internal.l.f(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new c(hVar, strB));
        String strC = zVar.f12797c.c("Host");
        if (strC != null) {
            arrayList.add(new c(c.i, strC));
        }
        arrayList.add(new c(c.f18117h, url.f12712a));
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strD2 = sVar.d(i10);
            Locale US = Locale.US;
            kotlin.jvm.internal.l.e(US, "US");
            String lowerCase = strD2.toLowerCase(US);
            kotlin.jvm.internal.l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f18205g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.l.b(sVar.f(i10), "trailers"))) {
                arrayList.add(new c(lowerCase, sVar.f(i10)));
            }
        }
        f fVar = this.f18209c;
        fVar.getClass();
        boolean z12 = !z11;
        synchronized (fVar.f18165x) {
            synchronized (fVar) {
                try {
                    if (fVar.f18148f > 1073741823) {
                        fVar.l(b.REFUSED_STREAM);
                    }
                    if (fVar.f18149g) {
                        throw new a();
                    }
                    i = fVar.f18148f;
                    fVar.f18148f = i + 2;
                    pVar = new p(i, fVar, z12, false, null);
                    if (z11 && fVar.f18162u < fVar.f18163v && pVar.f18227e < pVar.f18228f) {
                        z10 = false;
                    }
                    if (pVar.i()) {
                        fVar.f18145c.put(Integer.valueOf(i), pVar);
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            fVar.f18165x.k(i, arrayList, z12);
        }
        if (z10) {
            fVar.f18165x.flush();
        }
        this.f18210d = pVar;
        if (this.f18212f) {
            p pVar2 = this.f18210d;
            kotlin.jvm.internal.l.c(pVar2);
            pVar2.e(b.CANCEL);
            throw new IOException("Canceled");
        }
        p pVar3 = this.f18210d;
        kotlin.jvm.internal.l.c(pVar3);
        p.c cVar = pVar3.f18232k;
        long j4 = this.f18208b.f14074g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.timeout(j4, timeUnit);
        p pVar4 = this.f18210d;
        kotlin.jvm.internal.l.c(pVar4);
        pVar4.f18233l.timeout(this.f18208b.f14075h, timeUnit);
    }

    @Override // Z9.d
    public final E.a c(boolean z10) throws NumberFormatException, IOException {
        U9.s sVar;
        p pVar = this.f18210d;
        if (pVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (pVar) {
            pVar.f18232k.enter();
            while (pVar.f18229g.isEmpty() && pVar.f18234m == null) {
                try {
                    pVar.l();
                } catch (Throwable th) {
                    pVar.f18232k.b();
                    throw th;
                }
            }
            pVar.f18232k.b();
            if (pVar.f18229g.isEmpty()) {
                IOException iOException = pVar.f18235n;
                if (iOException != null) {
                    throw iOException;
                }
                b bVar = pVar.f18234m;
                kotlin.jvm.internal.l.c(bVar);
                throw new u(bVar);
            }
            U9.s sVarRemoveFirst = pVar.f18229g.removeFirst();
            kotlin.jvm.internal.l.e(sVarRemoveFirst, "headersQueue.removeFirst()");
            sVar = sVarRemoveFirst;
        }
        y protocol = this.f18211e;
        kotlin.jvm.internal.l.f(protocol, "protocol");
        s.a aVar = new s.a();
        int size = sVar.size();
        Z9.i iVarA = null;
        for (int i = 0; i < size; i++) {
            String strD = sVar.d(i);
            String strF = sVar.f(i);
            if (kotlin.jvm.internal.l.b(strD, ":status")) {
                iVarA = i.a.a("HTTP/1.1 " + strF);
            } else if (!f18206h.contains(strD)) {
                aVar.c(strD, strF);
            }
        }
        if (iVarA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        E.a aVar2 = new E.a();
        aVar2.f12576b = protocol;
        aVar2.f12577c = iVarA.f14081b;
        aVar2.f12578d = iVarA.f14082c;
        aVar2.c(aVar.d());
        if (z10 && aVar2.f12577c == 100) {
            return null;
        }
        return aVar2;
    }

    @Override // Z9.d
    public final void cancel() {
        this.f18212f = true;
        p pVar = this.f18210d;
        if (pVar != null) {
            pVar.e(b.CANCEL);
        }
    }

    @Override // Z9.d
    public final A d(z zVar, long j4) {
        p pVar = this.f18210d;
        kotlin.jvm.internal.l.c(pVar);
        return pVar.g();
    }

    @Override // Z9.d
    public final Y9.g e() {
        return this.f18207a;
    }

    @Override // Z9.d
    public final C f(E e4) {
        p pVar = this.f18210d;
        kotlin.jvm.internal.l.c(pVar);
        return pVar.i;
    }

    @Override // Z9.d
    public final void g() throws IOException {
        this.f18209c.flush();
    }

    @Override // Z9.d
    public final long h(E e4) {
        if (Z9.e.a(e4)) {
            return V9.b.j(e4);
        }
        return 0L;
    }
}
