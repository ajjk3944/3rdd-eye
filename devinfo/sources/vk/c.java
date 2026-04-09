package vk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f36277a;

    /* renamed from: b, reason: collision with root package name */
    public final sk.d f36278b;

    public c(String str, sk.d dVar) {
        this.f36277a = str;
        this.f36278b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return nk.k.a(this.f36277a, cVar.f36277a) && nk.k.a(this.f36278b, cVar.f36278b);
    }

    public final int hashCode() {
        return this.f36278b.hashCode() + (this.f36277a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f36277a + ", range=" + this.f36278b + ')';
    }
}
