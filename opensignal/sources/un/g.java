package un;

/* loaded from: classes.dex */
public final class g extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f23606a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f23607b;

    public g(long j, Long l10) {
        this.f23606a = j;
        this.f23607b = l10;
    }

    @Override // un.j
    public final long a() {
        return this.f23606a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f23606a == gVar.f23606a && br.l.a(this.f23607b, gVar.f23607b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f23606a) * 31;
        Long l10 = this.f23607b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "Range(pointId=" + this.f23606a + ", answerId=" + this.f23607b + ')';
    }
}
