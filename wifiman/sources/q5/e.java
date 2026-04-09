package q5;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f58423a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f58424b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f58425c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f58426d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f58427e;

    public e(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f58423a = bool;
        this.f58424b = d10;
        this.f58425c = num;
        this.f58426d = num2;
        this.f58427e = l10;
    }

    public final Integer a() {
        return this.f58426d;
    }

    public final Long b() {
        return this.f58427e;
    }

    public final Boolean c() {
        return this.f58423a;
    }

    public final Integer d() {
        return this.f58425c;
    }

    public final Double e() {
        return this.f58424b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC6492s.d(this.f58423a, eVar.f58423a) && AbstractC6492s.d(this.f58424b, eVar.f58424b) && AbstractC6492s.d(this.f58425c, eVar.f58425c) && AbstractC6492s.d(this.f58426d, eVar.f58426d) && AbstractC6492s.d(this.f58427e, eVar.f58427e);
    }

    public int hashCode() {
        Boolean bool = this.f58423a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f58424b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f58425c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f58426d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f58427e;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f58423a + ", sessionSamplingRate=" + this.f58424b + ", sessionRestartTimeout=" + this.f58425c + ", cacheDuration=" + this.f58426d + ", cacheUpdatedTime=" + this.f58427e + ')';
    }
}
