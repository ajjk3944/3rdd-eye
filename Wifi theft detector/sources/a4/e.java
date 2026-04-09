package a4;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f147c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f148a;

    /* renamed from: b, reason: collision with root package name */
    public final long f149b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f150a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f151b = 0;

        public e a() {
            return new e(this.f150a, this.f151b);
        }

        public a b(long j10) {
            this.f151b = j10;
            return this;
        }

        public a c(long j10) {
            this.f150a = j10;
            return this;
        }
    }

    public e(long j10, long j11) {
        this.f148a = j10;
        this.f149b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f149b;
    }

    public long b() {
        return this.f148a;
    }
}
