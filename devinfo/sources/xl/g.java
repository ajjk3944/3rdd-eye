package xl;

import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.internal.measurement.z3;
import hm.p;
import hm.q;
import hm.u;
import hm.v;
import hm.w;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import nk.k;
import rl.m;
import rl.n;
import rl.t;
import rl.y;
import rl.z;
import sl.h;
import t6.i0;
import va.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements wl.f {

    /* renamed from: f, reason: collision with root package name */
    public static final m f37278f;

    /* renamed from: a, reason: collision with root package name */
    public final t f37279a;

    /* renamed from: b, reason: collision with root package name */
    public final wl.e f37280b;

    /* renamed from: c, reason: collision with root package name */
    public final i0.f f37281c;

    /* renamed from: d, reason: collision with root package name */
    public int f37282d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.d f37283e;

    static {
        m mVar = m.f33111b;
        f37278f = i0.r("OkHttp-Response-Body", "Truncated");
    }

    public g(t tVar, wl.e eVar, i0.f fVar) {
        k.e(fVar, "socket");
        this.f37279a = tVar;
        this.f37280b = eVar;
        this.f37281c = fVar;
        this.f37283e = new androidx.recyclerview.widget.d((q) fVar.f25417c);
    }

    @Override // wl.f
    public final boolean a() {
        return this.f37282d == 6;
    }

    @Override // wl.f
    public final long b(z zVar) {
        if (!wl.g.a(zVar)) {
            return 0L;
        }
        String strA = zVar.f33209f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            return -1L;
        }
        return h.e(zVar);
    }

    @Override // wl.f
    public final w c(z zVar) {
        o oVar = zVar.f33204a;
        if (!wl.g.a(zVar)) {
            return h((n) oVar.f36146b, 0L);
        }
        String strA = zVar.f33209f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            n nVar = (n) oVar.f36146b;
            if (this.f37282d == 4) {
                this.f37282d = 5;
                return new c(this, nVar);
            }
            throw new IllegalStateException(("state: " + this.f37282d).toString());
        }
        long jE = h.e(zVar);
        if (jE != -1) {
            return h((n) oVar.f36146b, jE);
        }
        n nVar2 = (n) oVar.f36146b;
        if (this.f37282d != 4) {
            throw new IllegalStateException(("state: " + this.f37282d).toString());
        }
        this.f37282d = 5;
        this.f37280b.e();
        k.e(nVar2, "url");
        return new f(this, nVar2);
    }

    @Override // wl.f
    public final void cancel() {
        this.f37280b.cancel();
    }

    @Override // wl.f
    public final void d(o oVar) {
        Proxy.Type type = this.f37280b.h().f33053b.type();
        k.d(type, "type(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) oVar.f36147c);
        sb2.append(' ');
        n nVar = (n) oVar.f36146b;
        if (k.a(nVar.f33113a, "https") || type != Proxy.Type.HTTP) {
            String strB = nVar.b();
            String strD = nVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb2.append(strB);
        } else {
            sb2.append(nVar);
        }
        sb2.append(" HTTP/1.1");
        i((m) oVar.f36148d, sb2.toString());
    }

    @Override // wl.f
    public final u e(o oVar, long j) {
        if ("chunked".equalsIgnoreCase(((m) oVar.f36148d).a("Transfer-Encoding"))) {
            if (this.f37282d == 1) {
                this.f37282d = 2;
                return new b(this);
            }
            throw new IllegalStateException(("state: " + this.f37282d).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f37282d == 1) {
            this.f37282d = 2;
            return new e(this);
        }
        throw new IllegalStateException(("state: " + this.f37282d).toString());
    }

    @Override // wl.f
    public final v f() {
        return this.f37281c;
    }

    @Override // wl.f
    public final void finishRequest() {
        ((p) this.f37281c.f25418d).flush();
    }

    @Override // wl.f
    public final void flushRequest() {
        ((p) this.f37281c.f25418d).flush();
    }

    @Override // wl.f
    public final wl.e g() {
        return this.f37280b;
    }

    public final d h(n nVar, long j) {
        if (this.f37282d == 4) {
            this.f37282d = 5;
            return new d(this, nVar, j);
        }
        throw new IllegalStateException(("state: " + this.f37282d).toString());
    }

    public final void i(m mVar, String str) {
        k.e(mVar, "headers");
        k.e(str, "requestLine");
        if (this.f37282d != 0) {
            throw new IllegalStateException(("state: " + this.f37282d).toString());
        }
        i0.f fVar = this.f37281c;
        p pVar = (p) fVar.f25418d;
        p pVar2 = (p) fVar.f25418d;
        pVar.writeUtf8(str);
        pVar.writeUtf8("\r\n");
        int size = mVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar2.writeUtf8(mVar.c(i4));
            pVar2.writeUtf8(": ");
            pVar2.writeUtf8(mVar.f(i4));
            pVar2.writeUtf8("\r\n");
        }
        pVar2.writeUtf8("\r\n");
        this.f37282d = 1;
    }

    @Override // wl.f
    public final y readResponseHeaders(boolean z3) {
        androidx.recyclerview.widget.d dVar = this.f37283e;
        int i4 = this.f37282d;
        if (i4 != 0 && i4 != 1 && i4 != 2 && i4 != 3) {
            throw new IllegalStateException(("state: " + this.f37282d).toString());
        }
        try {
            String utf8LineStrict = ((hm.g) dVar.f1324c).readUtf8LineStrict(dVar.f1323b);
            dVar.f1323b -= utf8LineStrict.length();
            a0 a0VarR = z3.r(utf8LineStrict);
            int i10 = a0VarR.f9069b;
            y yVar = new y();
            yVar.f33192b = (rl.u) a0VarR.f9070c;
            yVar.f33193c = i10;
            yVar.f33194d = (String) a0VarR.f9071d;
            yVar.f33196f = dVar.p().d();
            if (z3 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f37282d = 3;
                return yVar;
            }
            if (102 > i10 || i10 >= 200) {
                this.f37282d = 4;
                return yVar;
            }
            this.f37282d = 3;
            return yVar;
        } catch (EOFException e2) {
            throw new IOException(je.u.t("unexpected end of stream on ", this.f37280b.h().f33052a.f33026h.g()), e2);
        }
    }
}
