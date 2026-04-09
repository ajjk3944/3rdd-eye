package z0;

/* loaded from: classes.dex */
public final class g implements m {

    /* renamed from: a, reason: collision with root package name */
    public final m f26491a;

    /* renamed from: b, reason: collision with root package name */
    public final m f26492b;

    public g(m mVar, m mVar2) {
        this.f26491a = mVar;
        this.f26492b = mVar2;
    }

    @Override // z0.m
    public final Object a(ar.n nVar, Object obj) {
        return this.f26492b.a(nVar, this.f26491a.a(nVar, obj));
    }

    @Override // z0.m
    public final boolean b(ar.k kVar) {
        return this.f26491a.b(kVar) && this.f26492b.b(kVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return br.l.a(this.f26491a, gVar.f26491a) && br.l.a(this.f26492b, gVar.f26492b);
    }

    public final int hashCode() {
        return (this.f26492b.hashCode() * 31) + this.f26491a.hashCode();
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("["), (String) a(f.f26490d, ""), ']');
    }
}
