package f3;

/* renamed from: f3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5520f {

    /* renamed from: c, reason: collision with root package name */
    private static final C5520f f46984c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f46985a;

    /* renamed from: b, reason: collision with root package name */
    private final long f46986b;

    /* renamed from: f3.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f46987a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f46988b = 0;

        a() {
        }

        public C5520f a() {
            return new C5520f(this.f46987a, this.f46988b);
        }

        public a b(long j10) {
            this.f46988b = j10;
            return this;
        }

        public a c(long j10) {
            this.f46987a = j10;
            return this;
        }
    }

    C5520f(long j10, long j11) {
        this.f46985a = j10;
        this.f46986b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f46986b;
    }

    public long b() {
        return this.f46985a;
    }
}
