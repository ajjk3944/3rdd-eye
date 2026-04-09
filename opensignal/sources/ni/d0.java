package ni;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f17740a;

    public d0(Boolean bool) {
        this.f17740a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && br.l.a(this.f17740a, ((d0) obj).f17740a);
    }

    public final int hashCode() {
        Boolean bool = this.f17740a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "LocationSettingsResult(locationEnabled=" + this.f17740a + ')';
    }
}
