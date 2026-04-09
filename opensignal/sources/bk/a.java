package bk;

import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2799a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2800b;

    public a(Integer num, Map map) {
        this.f2799a = num;
        this.f2800b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return br.l.a(this.f2799a, aVar.f2799a) && br.l.a(this.f2800b, aVar.f2800b);
    }

    public final int hashCode() {
        Integer num = this.f2799a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Map map = this.f2800b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectionDetail(responseCode=" + this.f2799a + ", headers=" + this.f2800b + ')';
    }
}
