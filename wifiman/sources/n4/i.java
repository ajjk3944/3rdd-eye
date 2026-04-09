package N4;

import N4.F;

/* loaded from: classes3.dex */
final class i extends F.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f15155a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15156b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15157c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15158d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15159e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15160f;

    static final class b extends F.e.a.AbstractC0566a {

        /* renamed from: a, reason: collision with root package name */
        private String f15161a;

        /* renamed from: b, reason: collision with root package name */
        private String f15162b;

        /* renamed from: c, reason: collision with root package name */
        private String f15163c;

        /* renamed from: d, reason: collision with root package name */
        private String f15164d;

        /* renamed from: e, reason: collision with root package name */
        private String f15165e;

        /* renamed from: f, reason: collision with root package name */
        private String f15166f;

        b() {
        }

        @Override // N4.F.e.a.AbstractC0566a
        public F.e.a a() {
            String str;
            String str2 = this.f15161a;
            if (str2 != null && (str = this.f15162b) != null) {
                return new i(str2, str, this.f15163c, null, this.f15164d, this.f15165e, this.f15166f);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15161a == null) {
                sb2.append(" identifier");
            }
            if (this.f15162b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.a.AbstractC0566a
        public F.e.a.AbstractC0566a b(String str) {
            this.f15165e = str;
            return this;
        }

        @Override // N4.F.e.a.AbstractC0566a
        public F.e.a.AbstractC0566a c(String str) {
            this.f15166f = str;
            return this;
        }

        @Override // N4.F.e.a.AbstractC0566a
        public F.e.a.AbstractC0566a d(String str) {
            this.f15163c = str;
            return this;
        }

        @Override // N4.F.e.a.AbstractC0566a
        public F.e.a.AbstractC0566a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f15161a = str;
            return this;
        }

        @Override // N4.F.e.a.AbstractC0566a
        public F.e.a.AbstractC0566a f(String str) {
            this.f15164d = str;
            return this;
        }

        @Override // N4.F.e.a.AbstractC0566a
        public F.e.a.AbstractC0566a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f15162b = str;
            return this;
        }
    }

    @Override // N4.F.e.a
    public String b() {
        return this.f15159e;
    }

    @Override // N4.F.e.a
    public String c() {
        return this.f15160f;
    }

    @Override // N4.F.e.a
    public String d() {
        return this.f15157c;
    }

    @Override // N4.F.e.a
    public String e() {
        return this.f15155a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.a)) {
            return false;
        }
        F.e.a aVar = (F.e.a) obj;
        if (this.f15155a.equals(aVar.e()) && this.f15156b.equals(aVar.h()) && ((str = this.f15157c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
            aVar.g();
            String str2 = this.f15158d;
            if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                String str3 = this.f15159e;
                if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                    String str4 = this.f15160f;
                    if (str4 == null) {
                        if (aVar.c() == null) {
                            return true;
                        }
                    } else if (str4.equals(aVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // N4.F.e.a
    public String f() {
        return this.f15158d;
    }

    @Override // N4.F.e.a
    public F.e.a.b g() {
        return null;
    }

    @Override // N4.F.e.a
    public String h() {
        return this.f15156b;
    }

    public int hashCode() {
        int iHashCode = (((this.f15155a.hashCode() ^ 1000003) * 1000003) ^ this.f15156b.hashCode()) * 1000003;
        String str = this.f15157c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f15158d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f15159e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f15160f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f15155a + ", version=" + this.f15156b + ", displayVersion=" + this.f15157c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f15158d + ", developmentPlatform=" + this.f15159e + ", developmentPlatformVersion=" + this.f15160f + "}";
    }

    private i(String str, String str2, String str3, F.e.a.b bVar, String str4, String str5, String str6) {
        this.f15155a = str;
        this.f15156b = str2;
        this.f15157c = str3;
        this.f15158d = str4;
        this.f15159e = str5;
        this.f15160f = str6;
    }
}
