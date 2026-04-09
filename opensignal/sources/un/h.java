package un;

/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f23608a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f23609b;

    public h(long j, Long l10) {
        this.f23608a = j;
        this.f23609b = l10;
    }

    @Override // un.j
    public final long a() {
        return this.f23608a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f23608a == hVar.f23608a && br.l.a(this.f23609b, hVar.f23609b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f23608a) * 31;
        Long l10 = this.f23609b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "Single(pointId=" + this.f23608a + ", answerId=" + this.f23609b + ')';
    }
}
