package qs;

import tt.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f21019a;

    /* renamed from: b, reason: collision with root package name */
    public final g f21020b;

    static {
        c.j(i.f21043f);
    }

    public a(c cVar, g gVar) {
        br.l.e(cVar, "packageName");
        this.f21019a = cVar;
        this.f21020b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return br.l.a(this.f21019a, aVar.f21019a) && this.f21020b.equals(aVar.f21020b);
    }

    public final int hashCode() {
        return (this.f21020b.hashCode() + (this.f21019a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = s.k0(this.f21019a.b(), '.', '/') + "/" + this.f21020b;
        br.l.d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
