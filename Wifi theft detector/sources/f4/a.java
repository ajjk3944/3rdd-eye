package f4;

import f4.e;

/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    public final long f21052b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21053c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21054d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21055e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21056f;

    public static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f21057a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f21058b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f21059c;

        /* renamed from: d, reason: collision with root package name */
        public Long f21060d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f21061e;

        @Override // f4.e.a
        public e a() {
            String str = "";
            if (this.f21057a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f21058b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f21059c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f21060d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f21061e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f21057a.longValue(), this.f21058b.intValue(), this.f21059c.intValue(), this.f21060d.longValue(), this.f21061e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f4.e.a
        public e.a b(int i10) {
            this.f21059c = Integer.valueOf(i10);
            return this;
        }

        @Override // f4.e.a
        public e.a c(long j10) {
            this.f21060d = Long.valueOf(j10);
            return this;
        }

        @Override // f4.e.a
        public e.a d(int i10) {
            this.f21058b = Integer.valueOf(i10);
            return this;
        }

        @Override // f4.e.a
        public e.a e(int i10) {
            this.f21061e = Integer.valueOf(i10);
            return this;
        }

        @Override // f4.e.a
        public e.a f(long j10) {
            this.f21057a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // f4.e
    public int b() {
        return this.f21054d;
    }

    @Override // f4.e
    public long c() {
        return this.f21055e;
    }

    @Override // f4.e
    public int d() {
        return this.f21053c;
    }

    @Override // f4.e
    public int e() {
        return this.f21056f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f21052b == eVar.f() && this.f21053c == eVar.d() && this.f21054d == eVar.b() && this.f21055e == eVar.c() && this.f21056f == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // f4.e
    public long f() {
        return this.f21052b;
    }

    public int hashCode() {
        long j10 = this.f21052b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f21053c) * 1000003) ^ this.f21054d) * 1000003;
        long j11 = this.f21055e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f21056f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f21052b + ", loadBatchSize=" + this.f21053c + ", criticalSectionEnterTimeoutMs=" + this.f21054d + ", eventCleanUpAge=" + this.f21055e + ", maxBlobByteSizePerRow=" + this.f21056f + "}";
    }

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f21052b = j10;
        this.f21053c = i10;
        this.f21054d = i11;
        this.f21055e = j11;
        this.f21056f = i12;
    }
}
