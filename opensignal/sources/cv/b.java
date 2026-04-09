package cv;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6685a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6686d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6687g;

    public b(OutputStream outputStream, h0 h0Var) {
        br.l.e(outputStream, "out");
        this.f6686d = outputStream;
        this.f6687g = h0Var;
    }

    @Override // cv.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f6685a) {
            case 0:
                e0 e0Var = (e0) this.f6686d;
                b bVar = (b) this.f6687g;
                e0Var.h();
                try {
                    bVar.close();
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
                ((OutputStream) this.f6686d).close();
                return;
        }
    }

    @Override // cv.d0
    public final void d0(g gVar, long j) throws IOException {
        switch (this.f6685a) {
            case 0:
                br.l.e(gVar, "source");
                xu.l.e(gVar.f6706d, 0L, j);
                long j7 = j;
                while (true) {
                    long j10 = 0;
                    if (j7 <= 0) {
                        return;
                    }
                    a0 a0Var = gVar.f6705a;
                    br.l.b(a0Var);
                    while (true) {
                        if (j10 < 65536) {
                            j10 += a0Var.f6680c - a0Var.f6679b;
                            if (j10 >= j7) {
                                j10 = j7;
                            } else {
                                a0Var = a0Var.f6683f;
                                br.l.b(a0Var);
                            }
                        }
                    }
                    e0 e0Var = (e0) this.f6686d;
                    b bVar = (b) this.f6687g;
                    e0Var.h();
                    try {
                        try {
                            bVar.d0(gVar, j10);
                            if (e0Var.i()) {
                                throw e0Var.k(null);
                            }
                            j7 -= j10;
                        } catch (IOException e4) {
                            if (!e0Var.i()) {
                                throw e4;
                            }
                            throw e0Var.k(e4);
                        }
                    } catch (Throwable th2) {
                        e0Var.i();
                        throw th2;
                    }
                }
            default:
                br.l.e(gVar, "source");
                xu.l.e(gVar.f6706d, 0L, j);
                while (j > 0) {
                    ((h0) this.f6687g).f();
                    a0 a0Var2 = gVar.f6705a;
                    br.l.b(a0Var2);
                    int iMin = (int) Math.min(j, a0Var2.f6680c - a0Var2.f6679b);
                    ((OutputStream) this.f6686d).write(a0Var2.f6678a, a0Var2.f6679b, iMin);
                    int i10 = a0Var2.f6679b + iMin;
                    a0Var2.f6679b = i10;
                    long j11 = iMin;
                    j -= j11;
                    gVar.f6706d -= j11;
                    if (i10 == a0Var2.f6680c) {
                        gVar.f6705a = a0Var2.a();
                        b0.a(a0Var2);
                    }
                }
                return;
        }
    }

    @Override // cv.d0, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f6685a) {
            case 0:
                e0 e0Var = (e0) this.f6686d;
                b bVar = (b) this.f6687g;
                e0Var.h();
                try {
                    bVar.flush();
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
                ((OutputStream) this.f6686d).flush();
                return;
        }
    }

    @Override // cv.d0
    public final h0 g() {
        switch (this.f6685a) {
            case 0:
                return (e0) this.f6686d;
            default:
                return (h0) this.f6687g;
        }
    }

    public final String toString() {
        switch (this.f6685a) {
            case 0:
                return "AsyncTimeout.sink(" + ((b) this.f6687g) + ')';
            default:
                return "sink(" + ((OutputStream) this.f6686d) + ')';
        }
    }

    public b(e0 e0Var, b bVar) {
        this.f6686d = e0Var;
        this.f6687g = bVar;
    }
}
