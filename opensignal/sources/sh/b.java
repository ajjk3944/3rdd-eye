package sh;

import br.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22052a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22053b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22054c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22055d;

    public b(String str, String str2, String str3, String str4) {
        this.f22052a = str;
        this.f22053b = str2;
        this.f22054c = str3;
        this.f22055d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f22052a, bVar.f22052a) && l.a(this.f22053b, bVar.f22053b) && l.a(this.f22054c, bVar.f22054c) && l.a(this.f22055d, bVar.f22055d);
    }

    public final int hashCode() {
        String str = this.f22052a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f22053b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f22054c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f22055d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteUrlItem(id=");
        sb2.append(this.f22052a);
        sb2.append(", url=");
        sb2.append(this.f22053b);
        sb2.append(", resolvedAt=");
        sb2.append(this.f22054c);
        sb2.append(", error=");
        return h0.b.r(sb2, this.f22055d, ')');
    }
}
