package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f124a;

    /* renamed from: b, reason: collision with root package name */
    public final y4.a f125b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f126c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f127d;

    /* renamed from: e, reason: collision with root package name */
    public final r f128e;

    /* renamed from: f, reason: collision with root package name */
    public final r f129f;
    public final r g;

    /* renamed from: h, reason: collision with root package name */
    public long f130h;

    /* renamed from: i, reason: collision with root package name */
    public r f131i;

    public t0(l lVar, y4.a aVar, Object obj, Object obj2, r rVar) {
        this.f124a = lVar.c(aVar);
        this.f125b = aVar;
        this.f126c = obj2;
        this.f127d = obj;
        this.f128e = (r) ((mk.c) aVar.f37323a).invoke(obj);
        mk.c cVar = (mk.c) aVar.f37323a;
        this.f129f = (r) cVar.invoke(obj2);
        this.g = rVar != null ? f.g(rVar) : ((r) cVar.invoke(obj)).c();
        this.f130h = -1L;
    }

    @Override // a0.h
    public final boolean d() {
        this.f124a.d();
        return false;
    }

    @Override // a0.h
    public final long e() {
        if (this.f130h < 0) {
            this.f130h = this.f124a.g(this.f128e, this.f129f, this.g);
        }
        return this.f130h;
    }

    @Override // a0.h
    public final y4.a f() {
        return this.f125b;
    }

    @Override // a0.h
    public final r g(long j) {
        if (!g.b(this, j)) {
            return this.f124a.j(j, this.f128e, this.f129f, this.g);
        }
        r rVar = this.f131i;
        if (rVar != null) {
            return rVar;
        }
        r rVarQ = this.f124a.q(this.f128e, this.f129f, this.g);
        this.f131i = rVarQ;
        return rVarQ;
    }

    @Override // a0.h
    public final /* synthetic */ boolean h(long j) {
        return g.b(this, j);
    }

    @Override // a0.h
    public final Object i(long j) {
        if (g.b(this, j)) {
            return this.f126c;
        }
        r rVarR = this.f124a.r(j, this.f128e, this.f129f, this.g);
        int iB = rVarR.b();
        for (int i4 = 0; i4 < iB; i4++) {
            if (Float.isNaN(rVarR.a(i4))) {
                i0.b("AnimationVector cannot contain a NaN. " + rVarR + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((mk.c) this.f125b.f37324b).invoke(rVarR);
    }

    @Override // a0.h
    public final Object j() {
        return this.f126c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f127d + " -> " + this.f126c + ",initial velocity: " + this.g + ", duration: " + (e() / 1000000) + " ms,animationSpec: " + this.f124a;
    }
}
