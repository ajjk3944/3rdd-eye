package N4;

import N4.F;

/* renamed from: N4.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3362d extends F.a.AbstractC0564a {

    /* renamed from: a, reason: collision with root package name */
    private final String f15112a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15113b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15114c;

    /* renamed from: N4.d$b */
    static final class b extends F.a.AbstractC0564a.AbstractC0565a {

        /* renamed from: a, reason: collision with root package name */
        private String f15115a;

        /* renamed from: b, reason: collision with root package name */
        private String f15116b;

        /* renamed from: c, reason: collision with root package name */
        private String f15117c;

        b() {
        }

        @Override // N4.F.a.AbstractC0564a.AbstractC0565a
        public F.a.AbstractC0564a a() {
            String str;
            String str2;
            String str3 = this.f15115a;
            if (str3 != null && (str = this.f15116b) != null && (str2 = this.f15117c) != null) {
                return new C3362d(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15115a == null) {
                sb2.append(" arch");
            }
            if (this.f15116b == null) {
                sb2.append(" libraryName");
            }
            if (this.f15117c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.a.AbstractC0564a.AbstractC0565a
        public F.a.AbstractC0564a.AbstractC0565a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f15115a = str;
            return this;
        }

        @Override // N4.F.a.AbstractC0564a.AbstractC0565a
        public F.a.AbstractC0564a.AbstractC0565a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f15117c = str;
            return this;
        }

        @Override // N4.F.a.AbstractC0564a.AbstractC0565a
        public F.a.AbstractC0564a.AbstractC0565a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f15116b = str;
            return this;
        }
    }

    @Override // N4.F.a.AbstractC0564a
    public String b() {
        return this.f15112a;
    }

    @Override // N4.F.a.AbstractC0564a
    public String c() {
        return this.f15114c;
    }

    @Override // N4.F.a.AbstractC0564a
    public String d() {
        return this.f15113b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a.AbstractC0564a)) {
            return false;
        }
        F.a.AbstractC0564a abstractC0564a = (F.a.AbstractC0564a) obj;
        return this.f15112a.equals(abstractC0564a.b()) && this.f15113b.equals(abstractC0564a.d()) && this.f15114c.equals(abstractC0564a.c());
    }

    public int hashCode() {
        return ((((this.f15112a.hashCode() ^ 1000003) * 1000003) ^ this.f15113b.hashCode()) * 1000003) ^ this.f15114c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f15112a + ", libraryName=" + this.f15113b + ", buildId=" + this.f15114c + "}";
    }

    private C3362d(String str, String str2, String str3) {
        this.f15112a = str;
        this.f15113b = str2;
        this.f15114c = str3;
    }
}
