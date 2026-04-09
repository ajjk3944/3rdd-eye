package ku;

/* loaded from: classes.dex */
public final class n0 implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public final gu.a f14585a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f14586b;

    public n0(gu.a aVar) {
        br.l.e(aVar, "serializer");
        this.f14585a = aVar;
        this.f14586b = new x0(aVar.getDescriptor());
    }

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        if (cVar.u()) {
            return cVar.f(this.f14585a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && n0.class == obj.getClass() && br.l.a(this.f14585a, ((n0) obj).f14585a);
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return this.f14586b;
    }

    public final int hashCode() {
        return this.f14585a.hashCode();
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        if (obj != null) {
            dVar.l(this.f14585a, obj);
        } else {
            dVar.d();
        }
    }
}
