package sk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends b {

    /* renamed from: d, reason: collision with root package name */
    public static final d f33824d = new d(1, 0, 1);

    @Override // sk.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f33817a == dVar.f33817a && this.f33818b == dVar.f33818b;
    }

    @Override // sk.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f33817a * 31) + this.f33818b;
    }

    @Override // sk.b
    public final boolean isEmpty() {
        return this.f33817a > this.f33818b;
    }

    @Override // sk.b
    public final String toString() {
        return this.f33817a + ".." + this.f33818b;
    }
}
