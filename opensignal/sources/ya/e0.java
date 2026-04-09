package ya;

/* loaded from: classes.dex */
public final class e0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f26052a;

    /* renamed from: d, reason: collision with root package name */
    public final long f26053d;

    public e0(s0 s0Var, long j) {
        this.f26052a = s0Var;
        this.f26053d = j;
    }

    @Override // ya.s0
    public final void a() {
        this.f26052a.a();
    }

    @Override // ya.s0
    public final boolean b() {
        return this.f26052a.b();
    }

    @Override // ya.s0
    public final int h(long j) {
        return this.f26052a.h(j - this.f26053d);
    }

    @Override // ya.s0
    public final int j(io.sentry.internal.debugmeta.c cVar, z9.d dVar, int i10) {
        int iJ = this.f26052a.j(cVar, dVar, i10);
        if (iJ == -4) {
            dVar.f26793y = Math.max(0L, dVar.f26793y + this.f26053d);
        }
        return iJ;
    }
}
