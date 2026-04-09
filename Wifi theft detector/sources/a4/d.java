package a4;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f142c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f143a;

    /* renamed from: b, reason: collision with root package name */
    public final long f144b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f145a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f146b = 0;

        public d a() {
            return new d(this.f145a, this.f146b);
        }

        public a b(long j10) {
            this.f145a = j10;
            return this;
        }

        public a c(long j10) {
            this.f146b = j10;
            return this;
        }
    }

    public d(long j10, long j11) {
        this.f143a = j10;
        this.f144b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f143a;
    }

    public long b() {
        return this.f144b;
    }
}
