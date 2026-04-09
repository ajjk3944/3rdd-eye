package fh;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f8865a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8866b;

    public d(Object obj, String str) {
        this.f8865a = str;
        this.f8866b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Object obj2 = dVar.f8866b;
        if (!this.f8865a.equals(dVar.f8865a)) {
            return false;
        }
        Object obj3 = this.f8866b;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f8865a.hashCode() * 31;
        Object obj = this.f8866b;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return this.f8865a + this.f8866b;
    }
}
