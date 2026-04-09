package w;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f24105a;

    /* renamed from: b, reason: collision with root package name */
    public final om.f f24106b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparable f24107c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24108d;

    /* renamed from: e, reason: collision with root package name */
    public final l f24109e;

    /* renamed from: f, reason: collision with root package name */
    public final l f24110f;

    /* renamed from: g, reason: collision with root package name */
    public final l f24111g;

    /* renamed from: h, reason: collision with root package name */
    public long f24112h;

    /* renamed from: i, reason: collision with root package name */
    public l f24113i;

    public d0(f fVar, om.f fVar2, Object obj, Comparable comparable, l lVar) {
        this.f24105a = fVar.a(fVar2);
        this.f24106b = fVar2;
        this.f24107c = comparable;
        this.f24108d = obj;
        ar.k kVar = (ar.k) fVar2.f19554d;
        this.f24109e = (l) kVar.a(obj);
        this.f24110f = (l) kVar.a(comparable);
        this.f24111g = lVar != null ? c.d(lVar) : ((l) kVar.a(obj)).c();
        this.f24112h = -1L;
    }

    public final long a() {
        if (this.f24112h < 0) {
            this.f24112h = this.f24105a.L(this.f24109e, this.f24110f, this.f24111g);
        }
        return this.f24112h;
    }

    public final Object b(long j) {
        if (j >= a()) {
            return this.f24107c;
        }
        l lVarV = this.f24105a.v(j, this.f24109e, this.f24110f, this.f24111g);
        int iB = lVarV.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(lVarV.a(i10))) {
                v.b("AnimationVector cannot contain a NaN. " + lVarV + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((ar.k) this.f24106b.f19555g).a(lVarV);
    }

    public final l c(long j) {
        if (j < a()) {
            return this.f24105a.E(j, this.f24109e, this.f24110f, this.f24111g);
        }
        l lVar = this.f24113i;
        if (lVar != null) {
            return lVar;
        }
        l lVarN = this.f24105a.n(this.f24109e, this.f24110f, this.f24111g);
        this.f24113i = lVarN;
        return lVarN;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f24108d + " -> " + this.f24107c + ",initial velocity: " + this.f24111g + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.f24105a;
    }
}
