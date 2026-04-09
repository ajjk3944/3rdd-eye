package N4;

import N4.F;

/* loaded from: classes3.dex */
final class A extends F.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f14897a;

    static final class b extends F.e.f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f14898a;

        b() {
        }

        @Override // N4.F.e.f.a
        public F.e.f a() {
            String str = this.f14898a;
            if (str != null) {
                return new A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // N4.F.e.f.a
        public F.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f14898a = str;
            return this;
        }
    }

    @Override // N4.F.e.f
    public String b() {
        return this.f14897a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.f) {
            return this.f14897a.equals(((F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f14897a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f14897a + "}";
    }

    private A(String str) {
        this.f14897a = str;
    }
}
