package j$.time.temporal;

/* loaded from: classes2.dex */
public enum k implements q {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a, reason: collision with root package name */
    public final transient String f26216a;

    /* renamed from: b, reason: collision with root package name */
    public final transient u f26217b;

    /* renamed from: c, reason: collision with root package name */
    public final transient long f26218c;

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.f26216a = str;
        this.f26217b = u.e((-365243219162L) + j, 365241780471L + j);
        this.f26218c = j;
    }

    @Override // j$.time.temporal.q
    public final u k() {
        return this.f26217b;
    }

    @Override // j$.time.temporal.q
    public final m o(m mVar, long j) {
        if (!this.f26217b.d(j)) {
            throw new j$.time.a("Invalid value: " + this.f26216a + " " + j);
        }
        return mVar.c(j$.com.android.tools.r8.a.C(j, this.f26218c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final boolean i(n nVar) {
        return nVar.e(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final u j(n nVar) {
        if (nVar.e(a.EPOCH_DAY)) {
            return this.f26217b;
        }
        throw new j$.time.a("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.q
    public final long l(n nVar) {
        return nVar.w(a.EPOCH_DAY) + this.f26218c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f26216a;
    }
}
