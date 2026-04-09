package N4;

import N4.F;

/* loaded from: classes3.dex */
final class w extends F.e.d.AbstractC0580e {

    /* renamed from: a, reason: collision with root package name */
    private final F.e.d.AbstractC0580e.b f15293a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15294b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15295c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15296d;

    static final class b extends F.e.d.AbstractC0580e.a {

        /* renamed from: a, reason: collision with root package name */
        private F.e.d.AbstractC0580e.b f15297a;

        /* renamed from: b, reason: collision with root package name */
        private String f15298b;

        /* renamed from: c, reason: collision with root package name */
        private String f15299c;

        /* renamed from: d, reason: collision with root package name */
        private long f15300d;

        /* renamed from: e, reason: collision with root package name */
        private byte f15301e;

        b() {
        }

        @Override // N4.F.e.d.AbstractC0580e.a
        public F.e.d.AbstractC0580e a() {
            F.e.d.AbstractC0580e.b bVar;
            String str;
            String str2;
            if (this.f15301e == 1 && (bVar = this.f15297a) != null && (str = this.f15298b) != null && (str2 = this.f15299c) != null) {
                return new w(bVar, str, str2, this.f15300d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15297a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f15298b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f15299c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f15301e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.AbstractC0580e.a
        public F.e.d.AbstractC0580e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f15298b = str;
            return this;
        }

        @Override // N4.F.e.d.AbstractC0580e.a
        public F.e.d.AbstractC0580e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f15299c = str;
            return this;
        }

        @Override // N4.F.e.d.AbstractC0580e.a
        public F.e.d.AbstractC0580e.a d(F.e.d.AbstractC0580e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f15297a = bVar;
            return this;
        }

        @Override // N4.F.e.d.AbstractC0580e.a
        public F.e.d.AbstractC0580e.a e(long j10) {
            this.f15300d = j10;
            this.f15301e = (byte) (this.f15301e | 1);
            return this;
        }
    }

    @Override // N4.F.e.d.AbstractC0580e
    public String b() {
        return this.f15294b;
    }

    @Override // N4.F.e.d.AbstractC0580e
    public String c() {
        return this.f15295c;
    }

    @Override // N4.F.e.d.AbstractC0580e
    public F.e.d.AbstractC0580e.b d() {
        return this.f15293a;
    }

    @Override // N4.F.e.d.AbstractC0580e
    public long e() {
        return this.f15296d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.AbstractC0580e)) {
            return false;
        }
        F.e.d.AbstractC0580e abstractC0580e = (F.e.d.AbstractC0580e) obj;
        return this.f15293a.equals(abstractC0580e.d()) && this.f15294b.equals(abstractC0580e.b()) && this.f15295c.equals(abstractC0580e.c()) && this.f15296d == abstractC0580e.e();
    }

    public int hashCode() {
        int iHashCode = (((((this.f15293a.hashCode() ^ 1000003) * 1000003) ^ this.f15294b.hashCode()) * 1000003) ^ this.f15295c.hashCode()) * 1000003;
        long j10 = this.f15296d;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f15293a + ", parameterKey=" + this.f15294b + ", parameterValue=" + this.f15295c + ", templateVersion=" + this.f15296d + "}";
    }

    private w(F.e.d.AbstractC0580e.b bVar, String str, String str2, long j10) {
        this.f15293a = bVar;
        this.f15294b = str;
        this.f15295c = str2;
        this.f15296d = j10;
    }
}
