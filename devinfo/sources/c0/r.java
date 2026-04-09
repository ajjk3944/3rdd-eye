package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public p1.g f2489a = null;

    /* renamed from: b, reason: collision with root package name */
    public p1.c f2490b = null;

    /* renamed from: c, reason: collision with root package name */
    public r1.b f2491c = null;

    /* renamed from: d, reason: collision with root package name */
    public p1.j f2492d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return nk.k.a(this.f2489a, rVar.f2489a) && nk.k.a(this.f2490b, rVar.f2490b) && nk.k.a(this.f2491c, rVar.f2491c) && nk.k.a(this.f2492d, rVar.f2492d);
    }

    public final int hashCode() {
        p1.g gVar = this.f2489a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        p1.c cVar = this.f2490b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        r1.b bVar = this.f2491c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        p1.j jVar = this.f2492d;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f2489a + ", canvas=" + this.f2490b + ", canvasDrawScope=" + this.f2491c + ", borderPath=" + this.f2492d + ')';
    }
}
