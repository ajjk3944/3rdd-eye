package ks;

import br.l;
import cv.d0;
import cv.f0;
import cv.h;
import cv.y;
import dj.i;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import ou.a0;
import ou.b0;
import ou.c0;
import ou.s;
import ou.t;
import ou.x;
import ou.z;
import su.k;

/* loaded from: classes.dex */
public final class c implements tu.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14487a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f14488b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14489c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14490d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14491e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14492f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f14493g;

    /* renamed from: h, reason: collision with root package name */
    public Object f14494h;

    public c(b bVar, ps.f fVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10) {
        l.e(bVar, "kind");
        this.f14489c = bVar;
        this.f14490d = fVar;
        this.f14491e = strArr;
        this.f14492f = strArr2;
        this.f14493g = strArr3;
        this.f14494h = str;
        this.f14488b = i10;
    }

    @Override // tu.d
    public void a(a0 a0Var) {
        l.e(a0Var, "request");
        Proxy.Type type = ((k) this.f14490d).f22342b.f19905b.type();
        l.d(type, "connection.route().proxy.type()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a0Var.f19861b);
        sb2.append(' ');
        t tVar = a0Var.f19860a;
        if (tVar.f19975i || type != Proxy.Type.HTTP) {
            String strB = tVar.b();
            String strD = tVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb2.append(strB);
        } else {
            sb2.append(tVar);
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        l.d(string, "StringBuilder().apply(builderAction).toString()");
        j(a0Var.f19862c, string);
    }

    @Override // tu.d
    public void b() {
        ((h) this.f14492f).flush();
    }

    @Override // tu.d
    public f0 c(c0 c0Var) {
        if (!tu.e.a(c0Var)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(c0.f("Transfer-Encoding", c0Var))) {
            t tVar = c0Var.f19884a.f19860a;
            if (this.f14488b == 4) {
                this.f14488b = 5;
                return new uu.c(this, tVar);
            }
            throw new IllegalStateException(("state: " + this.f14488b).toString());
        }
        long j = pu.b.j(c0Var);
        if (j != -1) {
            return i(j);
        }
        if (this.f14488b == 4) {
            this.f14488b = 5;
            ((k) this.f14490d).k();
            return new uu.f(this);
        }
        throw new IllegalStateException(("state: " + this.f14488b).toString());
    }

    @Override // tu.d
    public void cancel() throws IOException {
        Socket socket = ((k) this.f14490d).f22343c;
        if (socket != null) {
            pu.b.e(socket);
        }
    }

    @Override // tu.d
    public long d(c0 c0Var) {
        if (!tu.e.a(c0Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(c0.f("Transfer-Encoding", c0Var))) {
            return -1L;
        }
        return pu.b.j(c0Var);
    }

    @Override // tu.d
    public b0 e(boolean z10) {
        i iVar = (i) this.f14493g;
        int i10 = this.f14488b;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f14488b).toString());
        }
        try {
            String strZ = ((cv.i) iVar.f7405g).z(iVar.f7404d);
            iVar.f7404d -= strZ.length();
            bc.f0 f0VarD = ic.a.D(strZ);
            int i11 = f0VarD.f2602d;
            b0 b0Var = new b0();
            z zVar = (z) f0VarD.f2603g;
            l.e(zVar, "protocol");
            b0Var.f19870b = zVar;
            b0Var.f19871c = i11;
            b0Var.f19872d = (String) f0VarD.f2604r;
            fh.f fVar = new fh.f(2);
            while (true) {
                String strZ2 = ((cv.i) iVar.f7405g).z(iVar.f7404d);
                iVar.f7404d -= strZ2.length();
                if (strZ2.length() == 0) {
                    break;
                }
                fVar.b(strZ2);
            }
            b0Var.c(fVar.f());
            if (z10 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f14488b = 3;
                return b0Var;
            }
            if (102 > i11 || i11 >= 200) {
                this.f14488b = 4;
                return b0Var;
            }
            this.f14488b = 3;
            return b0Var;
        } catch (EOFException e4) {
            throw new IOException("unexpected end of stream on ".concat(((k) this.f14490d).f22342b.f19904a.f19858h.f()), e4);
        }
    }

    @Override // tu.d
    public k f() {
        return (k) this.f14490d;
    }

    @Override // tu.d
    public void g() {
        ((h) this.f14492f).flush();
    }

    @Override // tu.d
    public d0 h(a0 a0Var, long j) {
        l.e(a0Var, "request");
        if ("chunked".equalsIgnoreCase(a0Var.f19862c.a("Transfer-Encoding"))) {
            if (this.f14488b == 1) {
                this.f14488b = 2;
                return new uu.b(this);
            }
            throw new IllegalStateException(("state: " + this.f14488b).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f14488b == 1) {
            this.f14488b = 2;
            return new uu.e(this);
        }
        throw new IllegalStateException(("state: " + this.f14488b).toString());
    }

    public uu.d i(long j) {
        if (this.f14488b == 4) {
            this.f14488b = 5;
            return new uu.d(this, j);
        }
        throw new IllegalStateException(("state: " + this.f14488b).toString());
    }

    public void j(s sVar, String str) {
        h hVar = (h) this.f14492f;
        l.e(str, "requestLine");
        if (this.f14488b != 0) {
            throw new IllegalStateException(("state: " + this.f14488b).toString());
        }
        hVar.H(str).H("\r\n");
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            hVar.H(sVar.b(i10)).H(": ").H(sVar.d(i10)).H("\r\n");
        }
        hVar.H("\r\n");
        this.f14488b = 1;
    }

    public String toString() {
        switch (this.f14487a) {
            case 0:
                return ((b) this.f14489c) + " version=" + ((ps.f) this.f14490d);
            default:
                return super.toString();
        }
    }

    public c(x xVar, k kVar, cv.z zVar, y yVar) {
        l.e(zVar, "source");
        l.e(yVar, "sink");
        this.f14489c = xVar;
        this.f14490d = kVar;
        this.f14491e = zVar;
        this.f14492f = yVar;
        this.f14493g = new i(zVar);
    }
}
