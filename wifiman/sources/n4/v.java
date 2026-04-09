package N4;

import N4.F;

/* loaded from: classes3.dex */
final class v extends F.e.d.AbstractC0579d {

    /* renamed from: a, reason: collision with root package name */
    private final String f15291a;

    static final class b extends F.e.d.AbstractC0579d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f15292a;

        b() {
        }

        @Override // N4.F.e.d.AbstractC0579d.a
        public F.e.d.AbstractC0579d a() {
            String str = this.f15292a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // N4.F.e.d.AbstractC0579d.a
        public F.e.d.AbstractC0579d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f15292a = str;
            return this;
        }
    }

    @Override // N4.F.e.d.AbstractC0579d
    public String b() {
        return this.f15291a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0579d) {
            return this.f15291a.equals(((F.e.d.AbstractC0579d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f15291a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f15291a + "}";
    }

    private v(String str) {
        this.f15291a = str;
    }
}
