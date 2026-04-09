package k3;

import k3.AbstractC6371e;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6367a extends AbstractC6371e {

    /* renamed from: b, reason: collision with root package name */
    private final long f51158b;

    /* renamed from: c, reason: collision with root package name */
    private final int f51159c;

    /* renamed from: d, reason: collision with root package name */
    private final int f51160d;

    /* renamed from: e, reason: collision with root package name */
    private final long f51161e;

    /* renamed from: f, reason: collision with root package name */
    private final int f51162f;

    /* renamed from: k3.a$b */
    static final class b extends AbstractC6371e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f51163a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f51164b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f51165c;

        /* renamed from: d, reason: collision with root package name */
        private Long f51166d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f51167e;

        b() {
        }

        @Override // k3.AbstractC6371e.a
        AbstractC6371e a() {
            String str = "";
            if (this.f51163a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f51164b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f51165c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f51166d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f51167e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C6367a(this.f51163a.longValue(), this.f51164b.intValue(), this.f51165c.intValue(), this.f51166d.longValue(), this.f51167e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // k3.AbstractC6371e.a
        AbstractC6371e.a b(int i10) {
            this.f51165c = Integer.valueOf(i10);
            return this;
        }

        @Override // k3.AbstractC6371e.a
        AbstractC6371e.a c(long j10) {
            this.f51166d = Long.valueOf(j10);
            return this;
        }

        @Override // k3.AbstractC6371e.a
        AbstractC6371e.a d(int i10) {
            this.f51164b = Integer.valueOf(i10);
            return this;
        }

        @Override // k3.AbstractC6371e.a
        AbstractC6371e.a e(int i10) {
            this.f51167e = Integer.valueOf(i10);
            return this;
        }

        @Override // k3.AbstractC6371e.a
        AbstractC6371e.a f(long j10) {
            this.f51163a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // k3.AbstractC6371e
    int b() {
        return this.f51160d;
    }

    @Override // k3.AbstractC6371e
    long c() {
        return this.f51161e;
    }

    @Override // k3.AbstractC6371e
    int d() {
        return this.f51159c;
    }

    @Override // k3.AbstractC6371e
    int e() {
        return this.f51162f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6371e)) {
            return false;
        }
        AbstractC6371e abstractC6371e = (AbstractC6371e) obj;
        return this.f51158b == abstractC6371e.f() && this.f51159c == abstractC6371e.d() && this.f51160d == abstractC6371e.b() && this.f51161e == abstractC6371e.c() && this.f51162f == abstractC6371e.e();
    }

    @Override // k3.AbstractC6371e
    long f() {
        return this.f51158b;
    }

    public int hashCode() {
        long j10 = this.f51158b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f51159c) * 1000003) ^ this.f51160d) * 1000003;
        long j11 = this.f51161e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f51162f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f51158b + ", loadBatchSize=" + this.f51159c + ", criticalSectionEnterTimeoutMs=" + this.f51160d + ", eventCleanUpAge=" + this.f51161e + ", maxBlobByteSizePerRow=" + this.f51162f + "}";
    }

    private C6367a(long j10, int i10, int i11, long j11, int i12) {
        this.f51158b = j10;
        this.f51159c = i10;
        this.f51160d = i11;
        this.f51161e = j11;
        this.f51162f = i12;
    }
}
