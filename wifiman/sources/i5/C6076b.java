package i5;

import i5.f;

/* renamed from: i5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6076b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f48835a;

    /* renamed from: b, reason: collision with root package name */
    private final long f48836b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f48837c;

    /* renamed from: i5.b$b, reason: collision with other inner class name */
    static final class C1810b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f48838a;

        /* renamed from: b, reason: collision with root package name */
        private Long f48839b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f48840c;

        C1810b() {
        }

        @Override // i5.f.a
        public f a() {
            String str = "";
            if (this.f48839b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C6076b(this.f48838a, this.f48839b.longValue(), this.f48840c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i5.f.a
        public f.a b(f.b bVar) {
            this.f48840c = bVar;
            return this;
        }

        @Override // i5.f.a
        public f.a c(String str) {
            this.f48838a = str;
            return this;
        }

        @Override // i5.f.a
        public f.a d(long j10) {
            this.f48839b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // i5.f
    public f.b b() {
        return this.f48837c;
    }

    @Override // i5.f
    public String c() {
        return this.f48835a;
    }

    @Override // i5.f
    public long d() {
        return this.f48836b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f48835a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f48836b == fVar.d()) {
                f.b bVar = this.f48837c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f48835a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f48836b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f48837c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f48835a + ", tokenExpirationTimestamp=" + this.f48836b + ", responseCode=" + this.f48837c + "}";
    }

    private C6076b(String str, long j10, f.b bVar) {
        this.f48835a = str;
        this.f48836b = j10;
        this.f48837c = bVar;
    }
}
