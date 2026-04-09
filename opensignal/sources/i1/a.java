package i1;

import br.l;
import g1.p;
import t2.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public t2.c f11136a;

    /* renamed from: b, reason: collision with root package name */
    public i f11137b;

    /* renamed from: c, reason: collision with root package name */
    public p f11138c;

    /* renamed from: d, reason: collision with root package name */
    public long f11139d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f11136a, aVar.f11136a) && this.f11137b == aVar.f11137b && l.a(this.f11138c, aVar.f11138c) && f1.e.a(this.f11139d, aVar.f11139d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f11139d) + ((this.f11138c.hashCode() + ((this.f11137b.hashCode() + (this.f11136a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f11136a + ", layoutDirection=" + this.f11137b + ", canvas=" + this.f11138c + ", size=" + ((Object) f1.e.d(this.f11139d)) + ')';
    }
}
