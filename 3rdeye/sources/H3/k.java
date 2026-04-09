package h3;

/* compiled from: MultiClassKey.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Class<?> f38214a;

    /* renamed from: b, reason: collision with root package name */
    public Class<?> f38215b;

    /* renamed from: c, reason: collision with root package name */
    public Class<?> f38216c;

    public k() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f38214a.equals(kVar.f38214a) && this.f38215b.equals(kVar.f38215b) && l.b(this.f38216c, kVar.f38216c);
    }

    public final int hashCode() {
        int iHashCode = (this.f38215b.hashCode() + (this.f38214a.hashCode() * 31)) * 31;
        Class<?> cls = this.f38216c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f38214a + ", second=" + this.f38215b + '}';
    }

    public k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f38214a = cls;
        this.f38215b = cls2;
        this.f38216c = cls3;
    }
}
