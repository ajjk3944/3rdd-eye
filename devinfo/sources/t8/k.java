package t8;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Class f34516a;

    /* renamed from: b, reason: collision with root package name */
    public Class f34517b;

    /* renamed from: c, reason: collision with root package name */
    public Class f34518c;

    public k(Class cls, Class cls2, Class cls3) {
        this.f34516a = cls;
        this.f34517b = cls2;
        this.f34518c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f34516a.equals(kVar.f34516a) && this.f34517b.equals(kVar.f34517b) && m.b(this.f34518c, kVar.f34518c);
    }

    public final int hashCode() {
        int iHashCode = (this.f34517b.hashCode() + (this.f34516a.hashCode() * 31)) * 31;
        Class cls = this.f34518c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f34516a + ", second=" + this.f34517b + '}';
    }
}
