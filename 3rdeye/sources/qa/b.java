package qa;

/* compiled from: ChronoUnit.java */
/* loaded from: classes3.dex */
public enum b implements k {
    NANOS("Nanos", ma.c.b(1)),
    MICROS("Micros", ma.c.b(1000)),
    MILLIS("Millis", ma.c.b(1000000)),
    SECONDS("Seconds", ma.c.a(0, 1)),
    MINUTES("Minutes", ma.c.a(0, 60)),
    HOURS("Hours", ma.c.a(0, 3600)),
    HALF_DAYS("HalfDays", ma.c.a(0, 43200)),
    DAYS("Days", ma.c.a(0, 86400)),
    WEEKS("Weeks", ma.c.a(0, 604800)),
    MONTHS("Months", ma.c.a(0, 2629746)),
    YEARS("Years", ma.c.a(0, 31556952)),
    DECADES("Decades", ma.c.a(0, 315569520)),
    CENTURIES("Centuries", ma.c.a(0, 3155695200L)),
    MILLENNIA("Millennia", ma.c.a(0, 31556952000L)),
    ERAS("Eras", ma.c.a(0, 31556952000000000L)),
    FOREVER("Forever", ma.c.a(com.google.gson.internal.c.p(1000000000, 999999999), com.google.gson.internal.c.B(Long.MAX_VALUE, com.google.gson.internal.c.o(999999999, 1000000000))));

    private final ma.c duration;
    private final String name;

    b(String str, ma.c cVar) {
        this.name = str;
        this.duration = cVar;
    }

    @Override // qa.k
    public <R extends d> R addTo(R r9, long j4) {
        return (R) r9.q(j4, this);
    }

    @Override // qa.k
    public long between(d dVar, d dVar2) {
        return dVar.t(dVar2, this);
    }

    public ma.c getDuration() {
        return this.duration;
    }

    @Override // qa.k
    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public boolean isDurationEstimated() {
        return isDateBased() || this == FOREVER;
    }

    public boolean isSupportedBy(d dVar) {
        if (this == FOREVER) {
            return false;
        }
        if (dVar instanceof na.b) {
            return isDateBased();
        }
        if ((dVar instanceof na.c) || (dVar instanceof na.e)) {
            return true;
        }
        try {
            dVar.q(1L, this);
            return true;
        } catch (RuntimeException unused) {
            try {
                dVar.q(-1L, this);
                return true;
            } catch (RuntimeException unused2) {
                return false;
            }
        }
    }

    public boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
