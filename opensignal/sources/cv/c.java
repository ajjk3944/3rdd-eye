package cv;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6691a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6692d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6693g;

    public c(InputStream inputStream, h0 h0Var) {
        br.l.e(inputStream, "input");
        this.f6692d = inputStream;
        this.f6693g = h0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f6691a) {
            case 0:
                e0 e0Var = (e0) this.f6692d;
                c cVar = (c) this.f6693g;
                e0Var.h();
                try {
                    cVar.close();
                    if (e0Var.i()) {
                        throw e0Var.k(null);
                    }
                    return;
                } catch (IOException e4) {
                    if (!e0Var.i()) {
                        throw e4;
                    }
                    throw e0Var.k(e4);
                } finally {
                    e0Var.i();
                }
            default:
                ((InputStream) this.f6692d).close();
                return;
        }
    }

    @Override // cv.f0
    public final h0 g() {
        switch (this.f6691a) {
            case 0:
                return (e0) this.f6692d;
            default:
                return (h0) this.f6693g;
        }
    }

    public final String toString() {
        switch (this.f6691a) {
            case 0:
                return "AsyncTimeout.source(" + ((c) this.f6693g) + ')';
            default:
                return "source(" + ((InputStream) this.f6692d) + ')';
        }
    }

    @Override // cv.f0
    public final long u(g gVar, long j) throws IOException {
        switch (this.f6691a) {
            case 0:
                br.l.e(gVar, "sink");
                e0 e0Var = (e0) this.f6692d;
                c cVar = (c) this.f6693g;
                e0Var.h();
                try {
                    long jU = cVar.u(gVar, j);
                    if (e0Var.i()) {
                        throw e0Var.k(null);
                    }
                    return jU;
                } catch (IOException e4) {
                    if (e0Var.i()) {
                        throw e0Var.k(e4);
                    }
                    throw e4;
                } finally {
                    e0Var.i();
                }
            default:
                br.l.e(gVar, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(c7.a.m(j, "byteCount < 0: ").toString());
                }
                try {
                    ((h0) this.f6693g).f();
                    a0 a0VarF0 = gVar.f0(1);
                    int i10 = ((InputStream) this.f6692d).read(a0VarF0.f6678a, a0VarF0.f6680c, (int) Math.min(j, 8192 - a0VarF0.f6680c));
                    if (i10 == -1) {
                        if (a0VarF0.f6679b == a0VarF0.f6680c) {
                            gVar.f6705a = a0VarF0.a();
                            b0.a(a0VarF0);
                        }
                        return -1L;
                    }
                    a0VarF0.f6680c += i10;
                    long j7 = i10;
                    gVar.f6706d += j7;
                    return j7;
                } catch (AssertionError e10) {
                    if (a.a.u(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
        }
    }

    public c(e0 e0Var, c cVar) {
        this.f6692d = e0Var;
        this.f6693g = cVar;
    }
}
