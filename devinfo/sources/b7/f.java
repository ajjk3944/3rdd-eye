package b7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f1980a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f1981b;

    public f(String str, Long l10) {
        this.f1980a = str;
        this.f1981b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return nk.k.a(this.f1980a, fVar.f1980a) && nk.k.a(this.f1981b, fVar.f1981b);
    }

    public final int hashCode() {
        int iHashCode = this.f1980a.hashCode() * 31;
        Long l10 = this.f1981b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f1980a + ", value=" + this.f1981b + ')';
    }
}
