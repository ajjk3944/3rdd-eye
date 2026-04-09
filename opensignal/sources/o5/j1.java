package o5;

/* loaded from: classes.dex */
public abstract class j1 extends j {

    /* renamed from: d, reason: collision with root package name */
    public final b0 f18975d;

    public j1(b0 b0Var) {
        this.f18975d = b0Var;
    }

    @Override // o5.j
    public final z a(Object obj, z zVar) {
        return f(zVar);
    }

    @Override // o5.j
    public final long b(Object obj, long j) {
        return j;
    }

    @Override // o5.j
    public final int c(int i10, Object obj) {
        return i10;
    }

    @Override // o5.j
    public final void d(Object obj, a aVar, androidx.media3.common.a1 a1Var) {
        g(a1Var);
    }

    public abstract void g(androidx.media3.common.a1 a1Var);

    @Override // o5.b0
    public final androidx.media3.common.a1 getInitialTimeline() {
        return this.f18975d.getInitialTimeline();
    }

    @Override // o5.b0
    public final androidx.media3.common.e0 getMediaItem() {
        return this.f18975d.getMediaItem();
    }

    public void h() {
        e(null, this.f18975d);
    }

    @Override // o5.b0
    public final boolean isSingleWindow() {
        return this.f18975d.isSingleWindow();
    }

    @Override // o5.a
    public final void prepareSourceInternal(b5.b0 b0Var) {
        this.f18968c = b0Var;
        this.f18967b = a5.d0.k(null);
        h();
    }

    public z f(z zVar) {
        return zVar;
    }
}
