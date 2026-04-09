package H1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public Class f1775a;

    /* renamed from: b, reason: collision with root package name */
    public Class f1776b;

    /* renamed from: c, reason: collision with root package name */
    public Class f1777c;

    public n(Class cls, Class cls2, Class cls3) {
        this.f1775a = cls;
        this.f1776b = cls2;
        this.f1777c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f1775a.equals(nVar.f1775a) && this.f1776b.equals(nVar.f1776b) && p.b(this.f1777c, nVar.f1777c);
    }

    public final int hashCode() {
        int iHashCode = (this.f1776b.hashCode() + (this.f1775a.hashCode() * 31)) * 31;
        Class cls = this.f1777c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f1775a + ", second=" + this.f1776b + '}';
    }
}
