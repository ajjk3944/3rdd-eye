package N4;

import N4.F;

/* loaded from: classes3.dex */
final class s extends F.e.d.a.b.AbstractC0574e.AbstractC0576b {

    /* renamed from: a, reason: collision with root package name */
    private final long f15258a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15259b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15260c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15261d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15262e;

    static final class b extends F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a {

        /* renamed from: a, reason: collision with root package name */
        private long f15263a;

        /* renamed from: b, reason: collision with root package name */
        private String f15264b;

        /* renamed from: c, reason: collision with root package name */
        private String f15265c;

        /* renamed from: d, reason: collision with root package name */
        private long f15266d;

        /* renamed from: e, reason: collision with root package name */
        private int f15267e;

        /* renamed from: f, reason: collision with root package name */
        private byte f15268f;

        b() {
        }

        @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a
        public F.e.d.a.b.AbstractC0574e.AbstractC0576b a() {
            String str;
            if (this.f15268f == 7 && (str = this.f15264b) != null) {
                return new s(this.f15263a, str, this.f15265c, this.f15266d, this.f15267e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f15268f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f15264b == null) {
                sb2.append(" symbol");
            }
            if ((this.f15268f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f15268f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a
        public F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a b(String str) {
            this.f15265c = str;
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a
        public F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a c(int i10) {
            this.f15267e = i10;
            this.f15268f = (byte) (this.f15268f | 4);
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a
        public F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a d(long j10) {
            this.f15266d = j10;
            this.f15268f = (byte) (this.f15268f | 2);
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a
        public F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a e(long j10) {
            this.f15263a = j10;
            this.f15268f = (byte) (this.f15268f | 1);
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a
        public F.e.d.a.b.AbstractC0574e.AbstractC0576b.AbstractC0577a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f15264b = str;
            return this;
        }
    }

    @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0576b
    public String b() {
        return this.f15260c;
    }

    @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0576b
    public int c() {
        return this.f15262e;
    }

    @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0576b
    public long d() {
        return this.f15261d;
    }

    @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0576b
    public long e() {
        return this.f15258a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0574e.AbstractC0576b)) {
            return false;
        }
        F.e.d.a.b.AbstractC0574e.AbstractC0576b abstractC0576b = (F.e.d.a.b.AbstractC0574e.AbstractC0576b) obj;
        return this.f15258a == abstractC0576b.e() && this.f15259b.equals(abstractC0576b.f()) && ((str = this.f15260c) != null ? str.equals(abstractC0576b.b()) : abstractC0576b.b() == null) && this.f15261d == abstractC0576b.d() && this.f15262e == abstractC0576b.c();
    }

    @Override // N4.F.e.d.a.b.AbstractC0574e.AbstractC0576b
    public String f() {
        return this.f15259b;
    }

    public int hashCode() {
        long j10 = this.f15258a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f15259b.hashCode()) * 1000003;
        String str = this.f15260c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f15261d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f15262e;
    }

    public String toString() {
        return "Frame{pc=" + this.f15258a + ", symbol=" + this.f15259b + ", file=" + this.f15260c + ", offset=" + this.f15261d + ", importance=" + this.f15262e + "}";
    }

    private s(long j10, String str, String str2, long j11, int i10) {
        this.f15258a = j10;
        this.f15259b = str;
        this.f15260c = str2;
        this.f15261d = j11;
        this.f15262e = i10;
    }
}
