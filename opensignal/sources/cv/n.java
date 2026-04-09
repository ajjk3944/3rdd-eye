package cv;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class n implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f6724a;

    public n(f0 f0Var) {
        br.l.e(f0Var, "delegate");
        this.f6724a = f0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6724a.close();
    }

    @Override // cv.f0
    public final h0 g() {
        return this.f6724a.g();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f6724a + ')';
    }

    @Override // cv.f0
    public long u(g gVar, long j) {
        br.l.e(gVar, "sink");
        return this.f6724a.u(gVar, j);
    }
}
