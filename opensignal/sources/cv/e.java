package cv;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class e implements d0 {
    @Override // cv.d0
    public final void d0(g gVar, long j) throws EOFException {
        br.l.e(gVar, "source");
        gVar.skip(j);
    }

    @Override // cv.d0
    public final h0 g() {
        return h0.f6707d;
    }

    @Override // cv.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // cv.d0, java.io.Flushable
    public final void flush() {
    }
}
