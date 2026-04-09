package vu;

import cv.f0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements tu.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List f24034g = pu.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f24035h = pu.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final su.k f24036a;

    /* renamed from: b, reason: collision with root package name */
    public final tu.f f24037b;

    /* renamed from: c, reason: collision with root package name */
    public final q f24038c;

    /* renamed from: d, reason: collision with root package name */
    public volatile y f24039d;

    /* renamed from: e, reason: collision with root package name */
    public final ou.z f24040e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f24041f;

    public r(ou.x xVar, su.k kVar, tu.f fVar, q qVar) {
        br.l.e(qVar, "http2Connection");
        this.f24036a = kVar;
        this.f24037b = fVar;
        this.f24038c = qVar;
        List list = xVar.O;
        ou.z zVar = ou.z.H2_PRIOR_KNOWLEDGE;
        this.f24040e = list.contains(zVar) ? zVar : ou.z.HTTP_2;
    }

    @Override // tu.d
    public final void a(ou.a0 a0Var) throws IOException {
        int i10;
        y yVar;
        boolean z10;
        br.l.e(a0Var, "request");
        if (this.f24039d != null) {
            return;
        }
        boolean z11 = a0Var.f19863d != null;
        ou.s sVar = a0Var.f19862c;
        ArrayList arrayList = new ArrayList(sVar.size() + 4);
        arrayList.add(new d(d.f23979f, a0Var.f19861b));
        cv.j jVar = d.f23980g;
        ou.t tVar = a0Var.f19860a;
        br.l.e(tVar, "url");
        String strB = tVar.b();
        String strD = tVar.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new d(jVar, strB));
        String strA = a0Var.f19862c.a("Host");
        if (strA != null) {
            arrayList.add(new d(d.f23982i, strA));
        }
        arrayList.add(new d(d.f23981h, tVar.f19967a));
        int size = sVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strB2 = sVar.b(i11);
            Locale locale = Locale.US;
            br.l.d(locale, "US");
            String lowerCase = strB2.toLowerCase(locale);
            br.l.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f24034g.contains(lowerCase) || (lowerCase.equals("te") && br.l.a(sVar.d(i11), "trailers"))) {
                arrayList.add(new d(lowerCase, sVar.d(i11)));
            }
        }
        q qVar = this.f24038c;
        qVar.getClass();
        boolean z12 = !z11;
        synchronized (qVar.S) {
            synchronized (qVar) {
                try {
                    if (qVar.f24032x > 1073741823) {
                        qVar.q(c.REFUSED_STREAM);
                    }
                    if (qVar.f24033y) {
                        throw new a();
                    }
                    i10 = qVar.f24032x;
                    qVar.f24032x = i10 + 2;
                    yVar = new y(i10, qVar, z12, false, null);
                    z10 = !z11 || qVar.P >= qVar.Q || yVar.f24067e >= yVar.f24068f;
                    if (yVar.h()) {
                        qVar.f24029d.put(Integer.valueOf(i10), yVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qVar.S.q(z12, i10, arrayList);
        }
        if (z10) {
            qVar.S.flush();
        }
        this.f24039d = yVar;
        if (this.f24041f) {
            y yVar2 = this.f24039d;
            br.l.b(yVar2);
            yVar2.e(c.CANCEL);
            throw new IOException("Canceled");
        }
        y yVar3 = this.f24039d;
        br.l.b(yVar3);
        x xVar = yVar3.k;
        long j = this.f24037b.f23020g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.g(j);
        y yVar4 = this.f24039d;
        br.l.b(yVar4);
        yVar4.f24072l.g(this.f24037b.f23021h);
    }

    @Override // tu.d
    public final void b() {
        y yVar = this.f24039d;
        br.l.b(yVar);
        yVar.f().close();
    }

    @Override // tu.d
    public final f0 c(ou.c0 c0Var) {
        y yVar = this.f24039d;
        br.l.b(yVar);
        return yVar.f24071i;
    }

    @Override // tu.d
    public final void cancel() {
        this.f24041f = true;
        y yVar = this.f24039d;
        if (yVar != null) {
            yVar.e(c.CANCEL);
        }
    }

    @Override // tu.d
    public final long d(ou.c0 c0Var) {
        if (tu.e.a(c0Var)) {
            return pu.b.j(c0Var);
        }
        return 0L;
    }

    @Override // tu.d
    public final ou.b0 e(boolean z10) throws NumberFormatException, IOException {
        ou.s sVar;
        y yVar = this.f24039d;
        if (yVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (yVar) {
            yVar.k.h();
            while (yVar.f24069g.isEmpty() && yVar.f24073m == null) {
                try {
                    try {
                        yVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th2) {
                    yVar.k.k();
                    throw th2;
                }
            }
            yVar.k.k();
            if (yVar.f24069g.isEmpty()) {
                IOException iOException = yVar.f24074n;
                if (iOException != null) {
                    throw iOException;
                }
                c cVar = yVar.f24073m;
                br.l.b(cVar);
                throw new d0(cVar);
            }
            Object objRemoveFirst = yVar.f24069g.removeFirst();
            br.l.d(objRemoveFirst, "headersQueue.removeFirst()");
            sVar = (ou.s) objRemoveFirst;
        }
        ou.z zVar = this.f24040e;
        br.l.e(zVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = sVar.size();
        bc.f0 f0VarD = null;
        for (int i10 = 0; i10 < size; i10++) {
            String strB = sVar.b(i10);
            String strD = sVar.d(i10);
            if (br.l.a(strB, ":status")) {
                f0VarD = ic.a.D("HTTP/1.1 " + strD);
            } else if (!f24035h.contains(strB)) {
                br.l.e(strB, "name");
                br.l.e(strD, "value");
                arrayList.add(strB);
                arrayList.add(tt.l.a1(strD).toString());
            }
        }
        if (f0VarD == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        ou.b0 b0Var = new ou.b0();
        b0Var.f19870b = zVar;
        b0Var.f19871c = f0VarD.f2602d;
        b0Var.f19872d = (String) f0VarD.f2604r;
        b0Var.c(new ou.s((String[]) arrayList.toArray(new String[0])));
        if (z10 && b0Var.f19871c == 100) {
            return null;
        }
        return b0Var;
    }

    @Override // tu.d
    public final su.k f() {
        return this.f24036a;
    }

    @Override // tu.d
    public final void g() {
        this.f24038c.flush();
    }

    @Override // tu.d
    public final cv.d0 h(ou.a0 a0Var, long j) {
        br.l.e(a0Var, "request");
        y yVar = this.f24039d;
        br.l.b(yVar);
        return yVar.f();
    }
}
