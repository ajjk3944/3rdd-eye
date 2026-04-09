package n9;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f17396a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17397b;

    public a(c cVar, long j) {
        if (cVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f17396a = cVar;
        this.f17397b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f17396a.equals(aVar.f17396a) && this.f17397b == aVar.f17397b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f17396a.hashCode() ^ 1000003) * 1000003;
        long j = this.f17397b;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(this.f17396a);
        sb2.append(", nextRequestWaitMillis=");
        return c7.a.n(this.f17397b, "}", sb2);
    }
}
