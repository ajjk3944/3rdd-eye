package lq;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class r implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15580a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15581d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f15582g;

    public r(Object obj, Object obj2, Object obj3) {
        this.f15580a = obj;
        this.f15581d = obj2;
        this.f15582g = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return br.l.a(this.f15580a, rVar.f15580a) && br.l.a(this.f15581d, rVar.f15581d) && br.l.a(this.f15582g, rVar.f15582g);
    }

    public final int hashCode() {
        Object obj = this.f15580a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f15581d;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f15582g;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f15580a + ", " + this.f15581d + ", " + this.f15582g + ')';
    }
}
