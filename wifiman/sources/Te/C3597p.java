package Te;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Te.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3597p {

    /* renamed from: a, reason: collision with root package name */
    private final long f21908a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f21909b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f21910c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f21911d;

    /* renamed from: e, reason: collision with root package name */
    private final s9.d f21912e;

    public C3597p(long j10, s9.d title, s9.d dVar, s9.d timestampDate, s9.d timestampTime) {
        AbstractC6492s.i(title, "title");
        AbstractC6492s.i(timestampDate, "timestampDate");
        AbstractC6492s.i(timestampTime, "timestampTime");
        this.f21908a = j10;
        this.f21909b = title;
        this.f21910c = dVar;
        this.f21911d = timestampDate;
        this.f21912e = timestampTime;
    }

    public final long a() {
        return this.f21908a;
    }

    public final s9.d b() {
        return this.f21910c;
    }

    public final s9.d c() {
        return this.f21911d;
    }

    public final s9.d d() {
        return this.f21912e;
    }

    public final s9.d e() {
        return this.f21909b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3597p)) {
            return false;
        }
        C3597p c3597p = (C3597p) obj;
        return this.f21908a == c3597p.f21908a && AbstractC6492s.d(this.f21909b, c3597p.f21909b) && AbstractC6492s.d(this.f21910c, c3597p.f21910c) && AbstractC6492s.d(this.f21911d, c3597p.f21911d) && AbstractC6492s.d(this.f21912e, c3597p.f21912e);
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f21908a) * 31) + this.f21909b.hashCode()) * 31;
        s9.d dVar = this.f21910c;
        return ((((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f21911d.hashCode()) * 31) + this.f21912e.hashCode();
    }

    public String toString() {
        return "Model(id=" + this.f21908a + ", title=" + this.f21909b + ", subtitle=" + this.f21910c + ", timestampDate=" + this.f21911d + ", timestampTime=" + this.f21912e + ")";
    }
}
