package j9;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13425a;

    /* renamed from: b, reason: collision with root package name */
    public final d f13426b;

    /* renamed from: c, reason: collision with root package name */
    public final b f13427c;

    public a(Object obj, d dVar, b bVar) {
        this.f13425a = obj;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f13426b = dVar;
        this.f13427c = bVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.f13427c;
            if (this.f13425a.equals(aVar.f13425a) && this.f13426b.equals(aVar.f13426b) && ((bVar = this.f13427c) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f13425a.hashCode()) * 1000003) ^ this.f13426b.hashCode()) * 1000003;
        b bVar = this.f13427c;
        return (iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f13425a + ", priority=" + this.f13426b + ", productData=" + this.f13427c + ", eventContext=null}";
    }
}
