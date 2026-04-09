package N4;

import N4.F;

/* loaded from: classes3.dex */
final class l extends F.e.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f15186a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15187b;

    /* renamed from: c, reason: collision with root package name */
    private final F.e.d.a f15188c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.c f15189d;

    /* renamed from: e, reason: collision with root package name */
    private final F.e.d.AbstractC0579d f15190e;

    /* renamed from: f, reason: collision with root package name */
    private final F.e.d.f f15191f;

    static final class b extends F.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        private long f15192a;

        /* renamed from: b, reason: collision with root package name */
        private String f15193b;

        /* renamed from: c, reason: collision with root package name */
        private F.e.d.a f15194c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.c f15195d;

        /* renamed from: e, reason: collision with root package name */
        private F.e.d.AbstractC0579d f15196e;

        /* renamed from: f, reason: collision with root package name */
        private F.e.d.f f15197f;

        /* renamed from: g, reason: collision with root package name */
        private byte f15198g;

        @Override // N4.F.e.d.b
        public F.e.d a() {
            String str;
            F.e.d.a aVar;
            F.e.d.c cVar;
            if (this.f15198g == 1 && (str = this.f15193b) != null && (aVar = this.f15194c) != null && (cVar = this.f15195d) != null) {
                return new l(this.f15192a, str, aVar, cVar, this.f15196e, this.f15197f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f15198g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f15193b == null) {
                sb2.append(" type");
            }
            if (this.f15194c == null) {
                sb2.append(" app");
            }
            if (this.f15195d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.b
        public F.e.d.b b(F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f15194c = aVar;
            return this;
        }

        @Override // N4.F.e.d.b
        public F.e.d.b c(F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f15195d = cVar;
            return this;
        }

        @Override // N4.F.e.d.b
        public F.e.d.b d(F.e.d.AbstractC0579d abstractC0579d) {
            this.f15196e = abstractC0579d;
            return this;
        }

        @Override // N4.F.e.d.b
        public F.e.d.b e(F.e.d.f fVar) {
            this.f15197f = fVar;
            return this;
        }

        @Override // N4.F.e.d.b
        public F.e.d.b f(long j10) {
            this.f15192a = j10;
            this.f15198g = (byte) (this.f15198g | 1);
            return this;
        }

        @Override // N4.F.e.d.b
        public F.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f15193b = str;
            return this;
        }

        b() {
        }

        private b(F.e.d dVar) {
            this.f15192a = dVar.f();
            this.f15193b = dVar.g();
            this.f15194c = dVar.b();
            this.f15195d = dVar.c();
            this.f15196e = dVar.d();
            this.f15197f = dVar.e();
            this.f15198g = (byte) 1;
        }
    }

    @Override // N4.F.e.d
    public F.e.d.a b() {
        return this.f15188c;
    }

    @Override // N4.F.e.d
    public F.e.d.c c() {
        return this.f15189d;
    }

    @Override // N4.F.e.d
    public F.e.d.AbstractC0579d d() {
        return this.f15190e;
    }

    @Override // N4.F.e.d
    public F.e.d.f e() {
        return this.f15191f;
    }

    public boolean equals(Object obj) {
        F.e.d.AbstractC0579d abstractC0579d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d)) {
            return false;
        }
        F.e.d dVar = (F.e.d) obj;
        if (this.f15186a == dVar.f() && this.f15187b.equals(dVar.g()) && this.f15188c.equals(dVar.b()) && this.f15189d.equals(dVar.c()) && ((abstractC0579d = this.f15190e) != null ? abstractC0579d.equals(dVar.d()) : dVar.d() == null)) {
            F.e.d.f fVar = this.f15191f;
            if (fVar == null) {
                if (dVar.e() == null) {
                    return true;
                }
            } else if (fVar.equals(dVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // N4.F.e.d
    public long f() {
        return this.f15186a;
    }

    @Override // N4.F.e.d
    public String g() {
        return this.f15187b;
    }

    @Override // N4.F.e.d
    public F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f15186a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f15187b.hashCode()) * 1000003) ^ this.f15188c.hashCode()) * 1000003) ^ this.f15189d.hashCode()) * 1000003;
        F.e.d.AbstractC0579d abstractC0579d = this.f15190e;
        int iHashCode2 = (iHashCode ^ (abstractC0579d == null ? 0 : abstractC0579d.hashCode())) * 1000003;
        F.e.d.f fVar = this.f15191f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f15186a + ", type=" + this.f15187b + ", app=" + this.f15188c + ", device=" + this.f15189d + ", log=" + this.f15190e + ", rollouts=" + this.f15191f + "}";
    }

    private l(long j10, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.AbstractC0579d abstractC0579d, F.e.d.f fVar) {
        this.f15186a = j10;
        this.f15187b = str;
        this.f15188c = aVar;
        this.f15189d = cVar;
        this.f15190e = abstractC0579d;
        this.f15191f = fVar;
    }
}
