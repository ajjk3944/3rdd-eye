package N4;

import N4.F;

/* loaded from: classes3.dex */
final class o extends F.e.d.a.b.AbstractC0568a {

    /* renamed from: a, reason: collision with root package name */
    private final long f15224a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15225b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15226c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15227d;

    static final class b extends F.e.d.a.b.AbstractC0568a.AbstractC0569a {

        /* renamed from: a, reason: collision with root package name */
        private long f15228a;

        /* renamed from: b, reason: collision with root package name */
        private long f15229b;

        /* renamed from: c, reason: collision with root package name */
        private String f15230c;

        /* renamed from: d, reason: collision with root package name */
        private String f15231d;

        /* renamed from: e, reason: collision with root package name */
        private byte f15232e;

        b() {
        }

        @Override // N4.F.e.d.a.b.AbstractC0568a.AbstractC0569a
        public F.e.d.a.b.AbstractC0568a a() {
            String str;
            if (this.f15232e == 3 && (str = this.f15230c) != null) {
                return new o(this.f15228a, this.f15229b, str, this.f15231d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f15232e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f15232e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f15230c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.a.b.AbstractC0568a.AbstractC0569a
        public F.e.d.a.b.AbstractC0568a.AbstractC0569a b(long j10) {
            this.f15228a = j10;
            this.f15232e = (byte) (this.f15232e | 1);
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0568a.AbstractC0569a
        public F.e.d.a.b.AbstractC0568a.AbstractC0569a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f15230c = str;
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0568a.AbstractC0569a
        public F.e.d.a.b.AbstractC0568a.AbstractC0569a d(long j10) {
            this.f15229b = j10;
            this.f15232e = (byte) (this.f15232e | 2);
            return this;
        }

        @Override // N4.F.e.d.a.b.AbstractC0568a.AbstractC0569a
        public F.e.d.a.b.AbstractC0568a.AbstractC0569a e(String str) {
            this.f15231d = str;
            return this;
        }
    }

    @Override // N4.F.e.d.a.b.AbstractC0568a
    public long b() {
        return this.f15224a;
    }

    @Override // N4.F.e.d.a.b.AbstractC0568a
    public String c() {
        return this.f15226c;
    }

    @Override // N4.F.e.d.a.b.AbstractC0568a
    public long d() {
        return this.f15225b;
    }

    @Override // N4.F.e.d.a.b.AbstractC0568a
    public String e() {
        return this.f15227d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0568a)) {
            return false;
        }
        F.e.d.a.b.AbstractC0568a abstractC0568a = (F.e.d.a.b.AbstractC0568a) obj;
        if (this.f15224a == abstractC0568a.b() && this.f15225b == abstractC0568a.d() && this.f15226c.equals(abstractC0568a.c())) {
            String str = this.f15227d;
            if (str == null) {
                if (abstractC0568a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0568a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f15224a;
        long j11 = this.f15225b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f15226c.hashCode()) * 1000003;
        String str = this.f15227d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f15224a + ", size=" + this.f15225b + ", name=" + this.f15226c + ", uuid=" + this.f15227d + "}";
    }

    private o(long j10, long j11, String str, String str2) {
        this.f15224a = j10;
        this.f15225b = j11;
        this.f15226c = str;
        this.f15227d = str2;
    }
}
