package cv;

/* loaded from: classes.dex */
public abstract class m implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f6723a;

    public m(d0 d0Var) {
        br.l.e(d0Var, "delegate");
        this.f6723a = d0Var;
    }

    @Override // cv.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6723a.close();
    }

    @Override // cv.d0
    public void d0(g gVar, long j) {
        br.l.e(gVar, "source");
        this.f6723a.d0(gVar, j);
    }

    @Override // cv.d0, java.io.Flushable
    public void flush() {
        this.f6723a.flush();
    }

    @Override // cv.d0
    public final h0 g() {
        return this.f6723a.g();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f6723a + ')';
    }
}
