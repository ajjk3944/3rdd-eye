package ni;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Long f17988a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f17989b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f17990c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f17991d;

    public k(Long l10, Long l11, Long l12, Long l13) {
        this.f17988a = l10;
        this.f17989b = l11;
        this.f17990c = l12;
        this.f17991d = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return br.l.a(this.f17988a, kVar.f17988a) && br.l.a(this.f17989b, kVar.f17989b) && br.l.a(this.f17990c, kVar.f17990c) && br.l.a(this.f17991d, kVar.f17991d);
    }

    public final int hashCode() {
        Long l10 = this.f17988a;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.f17989b;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f17990c;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f17991d;
        return iHashCode3 + (l13 != null ? l13.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceInfoCoreResult(storageFreeBytes=" + this.f17988a + ", storageUsedBytes=" + this.f17989b + ", ramFreeBytes=" + this.f17990c + ", ramUsedBytes=" + this.f17991d + ')';
    }
}
