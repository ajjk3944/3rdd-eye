package g0;

import br.l;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f9182a;

    /* renamed from: b, reason: collision with root package name */
    public String f9183b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9184c = false;

    /* renamed from: d, reason: collision with root package name */
    public e f9185d = null;

    public j(String str, String str2) {
        this.f9182a = str;
        this.f9183b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f9182a, jVar.f9182a) && l.a(this.f9183b, jVar.f9183b) && this.f9184c == jVar.f9184c && l.a(this.f9185d, jVar.f9185d);
    }

    public final int hashCode() {
        int iB = w.g.b(c7.a.g(this.f9183b, this.f9182a.hashCode() * 31, 31), this.f9184c, 31);
        e eVar = this.f9185d;
        return iB + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextSubstitution(layoutCache=");
        sb2.append(this.f9185d);
        sb2.append(", isShowingSubstitution=");
        return c7.a.r(sb2, this.f9184c, ')');
    }
}
