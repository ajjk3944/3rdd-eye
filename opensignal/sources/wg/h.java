package wg;

import ku.p0;

/* loaded from: classes.dex */
public final class h {
    public static final g Companion = new g();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f24504a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f24505b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f24506c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f24507d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f24508e;

    public /* synthetic */ h(int i10, Boolean bool, Double d6, Integer num, Integer num2, Long l10) {
        if (31 != (i10 & 31)) {
            p0.f(i10, 31, f.f24503a.getDescriptor());
            throw null;
        }
        this.f24504a = bool;
        this.f24505b = d6;
        this.f24506c = num;
        this.f24507d = num2;
        this.f24508e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return br.l.a(this.f24504a, hVar.f24504a) && br.l.a(this.f24505b, hVar.f24505b) && br.l.a(this.f24506c, hVar.f24506c) && br.l.a(this.f24507d, hVar.f24507d) && br.l.a(this.f24508e, hVar.f24508e);
    }

    public final int hashCode() {
        Boolean bool = this.f24504a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d6 = this.f24505b;
        int iHashCode2 = (iHashCode + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num = this.f24506c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f24507d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f24508e;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f24504a + ", sessionSamplingRate=" + this.f24505b + ", sessionTimeoutSeconds=" + this.f24506c + ", cacheDurationSeconds=" + this.f24507d + ", cacheUpdatedTimeSeconds=" + this.f24508e + ')';
    }

    public h(Boolean bool, Double d6, Integer num, Integer num2, Long l10) {
        this.f24504a = bool;
        this.f24505b = d6;
        this.f24506c = num;
        this.f24507d = num2;
        this.f24508e = l10;
    }
}
