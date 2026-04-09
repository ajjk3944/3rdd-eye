package nt;

import br.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18554a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18555b;

    public a(Object obj, Object obj2) {
        this.f18554a = obj;
        this.f18555b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f18554a, aVar.f18554a) && l.a(this.f18555b, aVar.f18555b);
    }

    public final int hashCode() {
        Object obj = this.f18554a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f18555b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f18554a + ", upper=" + this.f18555b + ')';
    }
}
