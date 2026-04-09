package N4;

import N4.F;

/* renamed from: N4.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3363e extends F.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15118a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15119b;

    /* renamed from: N4.e$b */
    static final class b extends F.c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f15120a;

        /* renamed from: b, reason: collision with root package name */
        private String f15121b;

        b() {
        }

        @Override // N4.F.c.a
        public F.c a() {
            String str;
            String str2 = this.f15120a;
            if (str2 != null && (str = this.f15121b) != null) {
                return new C3363e(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15120a == null) {
                sb2.append(" key");
            }
            if (this.f15121b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.c.a
        public F.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f15120a = str;
            return this;
        }

        @Override // N4.F.c.a
        public F.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f15121b = str;
            return this;
        }
    }

    @Override // N4.F.c
    public String b() {
        return this.f15118a;
    }

    @Override // N4.F.c
    public String c() {
        return this.f15119b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.c)) {
            return false;
        }
        F.c cVar = (F.c) obj;
        return this.f15118a.equals(cVar.b()) && this.f15119b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f15118a.hashCode() ^ 1000003) * 1000003) ^ this.f15119b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f15118a + ", value=" + this.f15119b + "}";
    }

    private C3363e(String str, String str2) {
        this.f15118a = str;
        this.f15119b = str2;
    }
}
