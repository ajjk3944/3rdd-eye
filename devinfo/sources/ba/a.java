package ba;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2087a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2088b;

    public a(Object obj, c cVar) {
        this.f2087a = obj;
        this.f2088b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2087a.equals(aVar.f2087a) && this.f2088b.equals(aVar.f2088b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2088b.hashCode() ^ (((1000003 * 1000003) ^ this.f2087a.hashCode()) * 1000003)) * (-721379959);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f2087a + ", priority=" + this.f2088b + ", productData=null, eventContext=null}";
    }
}
