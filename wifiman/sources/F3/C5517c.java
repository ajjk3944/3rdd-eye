package f3;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5517c {

    /* renamed from: c, reason: collision with root package name */
    private static final C5517c f46969c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f46970a;

    /* renamed from: b, reason: collision with root package name */
    private final b f46971b;

    /* renamed from: f3.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f46972a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f46973b = b.REASON_UNKNOWN;

        a() {
        }

        public C5517c a() {
            return new C5517c(this.f46972a, this.f46973b);
        }

        public a b(long j10) {
            this.f46972a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f46973b = bVar;
            return this;
        }
    }

    /* renamed from: f3.c$b */
    public enum b implements c5.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // c5.c
        public int getNumber() {
            return this.number_;
        }
    }

    C5517c(long j10, b bVar) {
        this.f46970a = j10;
        this.f46971b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f46970a;
    }

    public b b() {
        return this.f46971b;
    }
}
