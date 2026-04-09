package N4;

import N4.F;

/* loaded from: classes3.dex */
final class x extends F.e.d.AbstractC0580e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f15302a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15303b;

    static final class b extends F.e.d.AbstractC0580e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f15304a;

        /* renamed from: b, reason: collision with root package name */
        private String f15305b;

        b() {
        }

        @Override // N4.F.e.d.AbstractC0580e.b.a
        public F.e.d.AbstractC0580e.b a() {
            String str;
            String str2 = this.f15304a;
            if (str2 != null && (str = this.f15305b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15304a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f15305b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.AbstractC0580e.b.a
        public F.e.d.AbstractC0580e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f15304a = str;
            return this;
        }

        @Override // N4.F.e.d.AbstractC0580e.b.a
        public F.e.d.AbstractC0580e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f15305b = str;
            return this;
        }
    }

    @Override // N4.F.e.d.AbstractC0580e.b
    public String b() {
        return this.f15302a;
    }

    @Override // N4.F.e.d.AbstractC0580e.b
    public String c() {
        return this.f15303b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.AbstractC0580e.b)) {
            return false;
        }
        F.e.d.AbstractC0580e.b bVar = (F.e.d.AbstractC0580e.b) obj;
        return this.f15302a.equals(bVar.b()) && this.f15303b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.f15302a.hashCode() ^ 1000003) * 1000003) ^ this.f15303b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f15302a + ", variantId=" + this.f15303b + "}";
    }

    private x(String str, String str2) {
        this.f15302a = str;
        this.f15303b = str2;
    }
}
