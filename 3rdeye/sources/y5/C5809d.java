package y5;

import kotlin.jvm.internal.l;

/* compiled from: SettingsCache.kt */
/* renamed from: y5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5809d {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f48155a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f48156b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f48157c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f48158d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f48159e;

    public C5809d(Boolean bool, Double d10, Integer num, Integer num2, Long l5) {
        this.f48155a = bool;
        this.f48156b = d10;
        this.f48157c = num;
        this.f48158d = num2;
        this.f48159e = l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5809d)) {
            return false;
        }
        C5809d c5809d = (C5809d) obj;
        return l.b(this.f48155a, c5809d.f48155a) && l.b(this.f48156b, c5809d.f48156b) && l.b(this.f48157c, c5809d.f48157c) && l.b(this.f48158d, c5809d.f48158d) && l.b(this.f48159e, c5809d.f48159e);
    }

    public final int hashCode() {
        Boolean bool = this.f48155a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f48156b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f48157c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f48158d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l5 = this.f48159e;
        return iHashCode4 + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f48155a + ", sessionSamplingRate=" + this.f48156b + ", sessionRestartTimeout=" + this.f48157c + ", cacheDuration=" + this.f48158d + ", cacheUpdatedTime=" + this.f48159e + ')';
    }
}
