package o5;

/* loaded from: classes.dex */
public final class i0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f18964a;

    /* renamed from: d, reason: collision with root package name */
    public final long f18965d;

    public i0(x0 x0Var, long j) {
        this.f18964a = x0Var;
        this.f18965d = j;
    }

    @Override // o5.x0
    public final void a() {
        this.f18964a.a();
    }

    @Override // o5.x0
    public final boolean b() {
        return this.f18964a.b();
    }

    @Override // o5.x0
    public final int h(long j) {
        return this.f18964a.h(j - this.f18965d);
    }

    @Override // o5.x0
    public final int j(io.sentry.internal.debugmeta.c cVar, c5.g gVar, int i10) {
        int iJ = this.f18964a.j(cVar, gVar, i10);
        if (iJ == -4) {
            gVar.f3308y = Math.max(0L, gVar.f3308y + this.f18965d);
        }
        return iJ;
    }
}
