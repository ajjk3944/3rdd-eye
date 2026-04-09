package w;

/* loaded from: classes.dex */
public final class x implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24152a;

    public x(Object obj) {
        this.f24152a = obj;
    }

    @Override // w.f
    public final g0 a(om.f fVar) {
        Object obj = this.f24152a;
        return new o2.g(obj == null ? null : (l) ((ar.k) fVar.f19554d).a(obj), 23);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && br.l.a(((x) obj).f24152a, this.f24152a);
    }

    public final int hashCode() {
        Object obj = this.f24152a;
        return Float.hashCode(1500.0f) + g.a((obj != null ? obj.hashCode() : 0) * 31, 1.0f, 31);
    }
}
