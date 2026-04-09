package ou;

/* loaded from: classes.dex */
public final class f extends cv.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f19902d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1.f f19903g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, g1.f fVar, cv.d0 d0Var) {
        super(d0Var);
        this.f19902d = gVar;
        this.f19903g = fVar;
    }

    @Override // cv.m, cv.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g gVar = this.f19902d;
        g1.f fVar = this.f19903g;
        synchronized (gVar) {
            if (fVar.f9208a) {
                return;
            }
            fVar.f9208a = true;
            super.close();
            ((d8.a) this.f19903g.f9209d).b();
        }
    }
}
