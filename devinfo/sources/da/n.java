package da;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n extends y {

    /* renamed from: a, reason: collision with root package name */
    public final l f22149a;

    public n(l lVar) {
        this.f22149a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        Object obj2 = x.f22172a;
        if (obj2.equals(obj2)) {
            return this.f22149a.equals(((n) yVar).f22149a);
        }
        return false;
    }

    public final int hashCode() {
        return ((x.f22172a.hashCode() ^ 1000003) * 1000003) ^ this.f22149a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f22172a + ", androidClientInfo=" + this.f22149a + "}";
    }
}
