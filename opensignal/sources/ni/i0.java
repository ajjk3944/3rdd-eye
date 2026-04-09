package ni;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f17921a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f17922b;

    public i0(Boolean bool, Boolean bool2) {
        this.f17921a = bool;
        this.f17922b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return br.l.a(this.f17921a, i0Var.f17921a) && br.l.a(this.f17922b, i0Var.f17922b);
    }

    public final int hashCode() {
        Boolean bool = this.f17921a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f17922b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "ScreenStatusCoreResult(isScreenOn=" + this.f17921a + ", isScreenLocked=" + this.f17922b + ')';
    }
}
