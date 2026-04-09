package la;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f28633a;

    /* renamed from: b, reason: collision with root package name */
    public final ea.i f28634b;

    /* renamed from: c, reason: collision with root package name */
    public final ea.h f28635c;

    public b(long j, ea.i iVar, ea.h hVar) {
        this.f28633a = j;
        this.f28634b = iVar;
        this.f28635c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f28633a == bVar.f28633a && this.f28634b.equals(bVar.f28634b) && this.f28635c.equals(bVar.f28635c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f28633a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f28634b.hashCode()) * 1000003) ^ this.f28635c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f28633a + ", transportContext=" + this.f28634b + ", event=" + this.f28635c + "}";
    }
}
