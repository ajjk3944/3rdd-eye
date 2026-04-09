package N4;

import N4.F;

/* loaded from: classes3.dex */
final class q extends F.e.d.a.b.AbstractC0572d {

    /* renamed from: a, reason: collision with root package name */
    private final String f15244a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15245b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15246c;

    static final class b extends F.e.d.a.b.AbstractC0572d.AbstractC0573a {

        /* renamed from: a, reason: collision with root package name */
        private String f15247a;

        /* renamed from: b, reason: collision with root package name */
        private String f15248b;

        /* renamed from: c, reason: collision with root package name */
        private long f15249c;

        /* renamed from: d, reason: collision with root package name */
        private byte f15250d;

        b() {
        }

        @Override // N4.F.e.d.a.b.AbstractC0572d.AbstractC0573a
        public F.e.d.a.b.AbstractC0572d a() {
            String str;
            String str2;
            if (this.f15250d == 1 && (str = this.f15247a) != null && (str2 = this.f15248b) != null) {
                return new q(str, str2, this.f15249c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15247a == null) {
                sb2.append(" name");
            }
            if (this.f15248b == null) {
                sb2.append(" code");
            }
            if ((1 & this.f15250d) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.a.b.AbstractC0572d.AbstractC0573a
        public F.e.d.a.b.AbstractC0572d.AbstractC0573a b(long j10) {
            this.f15249c = j10;
            this.f15250d = (byte) (this.f15250d | 1);
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0572d.AbstractC0573a
        public F.e.d.a.b.AbstractC0572d.AbstractC0573a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f15248b = str;
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0572d.AbstractC0573a
        public F.e.d.a.b.AbstractC0572d.AbstractC0573a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f15247a = str;
            return this;
        }
    }

    @Override // N4.F.e.d.a.b.AbstractC0572d
    public long b() {
        return this.f15246c;
    }

    @Override // N4.F.e.d.a.b.AbstractC0572d
    public String c() {
        return this.f15245b;
    }

    @Override // N4.F.e.d.a.b.AbstractC0572d
    public String d() {
        return this.f15244a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0572d)) {
            return false;
        }
        F.e.d.a.b.AbstractC0572d abstractC0572d = (F.e.d.a.b.AbstractC0572d) obj;
        return this.f15244a.equals(abstractC0572d.d()) && this.f15245b.equals(abstractC0572d.c()) && this.f15246c == abstractC0572d.b();
    }

    public int hashCode() {
        int iHashCode = (((this.f15244a.hashCode() ^ 1000003) * 1000003) ^ this.f15245b.hashCode()) * 1000003;
        long j10 = this.f15246c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f15244a + ", code=" + this.f15245b + ", address=" + this.f15246c + "}";
    }

    private q(String str, String str2, long j10) {
        this.f15244a = str;
        this.f15245b = str2;
        this.f15246c = j10;
    }
}
