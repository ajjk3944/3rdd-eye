package n0;

/* loaded from: classes.dex */
public final class e0 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final ar.k f17159a;

    /* renamed from: d, reason: collision with root package name */
    public f0 f17160d;

    public e0(ar.k kVar) {
        this.f17159a = kVar;
    }

    @Override // n0.p1
    public final void c() {
        f0 f0Var = this.f17160d;
        if (f0Var != null) {
            f0Var.a();
        }
        this.f17160d = null;
    }

    @Override // n0.p1
    public final void d() {
        this.f17160d = (f0) this.f17159a.a(w.f17356b);
    }

    @Override // n0.p1
    public final void a() {
    }
}
