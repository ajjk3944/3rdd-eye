package f3;

/* renamed from: f3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5519e {

    /* renamed from: c, reason: collision with root package name */
    private static final C5519e f46979c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f46980a;

    /* renamed from: b, reason: collision with root package name */
    private final long f46981b;

    /* renamed from: f3.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f46982a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f46983b = 0;

        a() {
        }

        public C5519e a() {
            return new C5519e(this.f46982a, this.f46983b);
        }

        public a b(long j10) {
            this.f46982a = j10;
            return this;
        }

        public a c(long j10) {
            this.f46983b = j10;
            return this;
        }
    }

    C5519e(long j10, long j11) {
        this.f46980a = j10;
        this.f46981b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f46980a;
    }

    public long b() {
        return this.f46981b;
    }
}
