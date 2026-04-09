package lq;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class l implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15571a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15572d;

    public l(Object obj, Object obj2) {
        this.f15571a = obj;
        this.f15572d = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return br.l.a(this.f15571a, lVar.f15571a) && br.l.a(this.f15572d, lVar.f15572d);
    }

    public final int hashCode() {
        Object obj = this.f15571a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f15572d;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f15571a + ", " + this.f15572d + ')';
    }
}
