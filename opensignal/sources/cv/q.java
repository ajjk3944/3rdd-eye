package cv;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class q implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final z f6731a;

    /* renamed from: d, reason: collision with root package name */
    public final Inflater f6732d;

    /* renamed from: g, reason: collision with root package name */
    public int f6733g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6734r;

    public q(z zVar, Inflater inflater) {
        this.f6731a = zVar;
        this.f6732d = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6734r) {
            return;
        }
        this.f6732d.end();
        this.f6734r = true;
        this.f6731a.close();
    }

    @Override // cv.f0
    public final h0 g() {
        return this.f6731a.f6753a.g();
    }

    @Override // cv.f0
    public final long u(g gVar, long j) throws DataFormatException, IOException {
        long j7;
        br.l.e(gVar, "sink");
        while (j >= 0) {
            if (this.f6734r) {
                throw new IllegalStateException("closed");
            }
            z zVar = this.f6731a;
            Inflater inflater = this.f6732d;
            if (j == 0) {
                j7 = 0;
            } else {
                try {
                    a0 a0VarF0 = gVar.f0(1);
                    int iMin = (int) Math.min(j, 8192 - a0VarF0.f6680c);
                    if (inflater.needsInput() && !zVar.b()) {
                        a0 a0Var = zVar.f6754d.f6705a;
                        br.l.b(a0Var);
                        int i10 = a0Var.f6680c;
                        int i11 = a0Var.f6679b;
                        int i12 = i10 - i11;
                        this.f6733g = i12;
                        inflater.setInput(a0Var.f6678a, i11, i12);
                    }
                    int iInflate = inflater.inflate(a0VarF0.f6678a, a0VarF0.f6680c, iMin);
                    int i13 = this.f6733g;
                    if (i13 != 0) {
                        int remaining = i13 - inflater.getRemaining();
                        this.f6733g -= remaining;
                        zVar.skip(remaining);
                    }
                    if (iInflate > 0) {
                        a0VarF0.f6680c += iInflate;
                        j7 = iInflate;
                        gVar.f6706d += j7;
                    } else {
                        if (a0VarF0.f6679b == a0VarF0.f6680c) {
                            gVar.f6705a = a0VarF0.a();
                            b0.a(a0VarF0);
                        }
                        j7 = 0;
                    }
                } catch (DataFormatException e4) {
                    throw new IOException(e4);
                }
            }
            if (j7 > 0) {
                return j7;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (zVar.b()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(c7.a.m(j, "byteCount < 0: ").toString());
    }
}
