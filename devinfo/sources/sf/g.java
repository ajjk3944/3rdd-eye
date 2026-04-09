package sf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g {
    public static final f Companion = new f();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f33576a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f33577b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f33578c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f33579d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f33580e;

    public /* synthetic */ g(int i4, Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        if (31 != (i4 & 31)) {
            ml.k.a(i4, 31, e.f33575a.d());
            throw null;
        }
        this.f33576a = bool;
        this.f33577b = d10;
        this.f33578c = num;
        this.f33579d = num2;
        this.f33580e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return nk.k.a(this.f33576a, gVar.f33576a) && nk.k.a(this.f33577b, gVar.f33577b) && nk.k.a(this.f33578c, gVar.f33578c) && nk.k.a(this.f33579d, gVar.f33579d) && nk.k.a(this.f33580e, gVar.f33580e);
    }

    public final int hashCode() {
        Boolean bool = this.f33576a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f33577b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f33578c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f33579d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f33580e;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f33576a + ", sessionSamplingRate=" + this.f33577b + ", sessionTimeoutSeconds=" + this.f33578c + ", cacheDurationSeconds=" + this.f33579d + ", cacheUpdatedTimeSeconds=" + this.f33580e + ')';
    }

    public g(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f33576a = bool;
        this.f33577b = d10;
        this.f33578c = num;
        this.f33579d = num2;
        this.f33580e = l10;
    }
}
