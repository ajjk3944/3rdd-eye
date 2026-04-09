package bi;

import br.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2762a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2763b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2764c;

    public b(String str, String str2, Object obj) {
        l.e(str, "name");
        this.f2762a = str;
        this.f2763b = str2;
        this.f2764c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f2762a, bVar.f2762a) && l.a(this.f2763b, bVar.f2763b) && l.a(this.f2764c, bVar.f2764c);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f2763b, this.f2762a.hashCode() * 31, 31);
        Object obj = this.f2764c;
        return iG + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Field(name=" + this.f2762a + ", op=" + this.f2763b + ", expectedValue=" + this.f2764c + ')';
    }
}
