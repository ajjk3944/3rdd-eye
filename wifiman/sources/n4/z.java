package N4;

import N4.F;

/* loaded from: classes3.dex */
final class z extends F.e.AbstractC0581e {

    /* renamed from: a, reason: collision with root package name */
    private final int f15308a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15309b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15310c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15311d;

    static final class b extends F.e.AbstractC0581e.a {

        /* renamed from: a, reason: collision with root package name */
        private int f15312a;

        /* renamed from: b, reason: collision with root package name */
        private String f15313b;

        /* renamed from: c, reason: collision with root package name */
        private String f15314c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15315d;

        /* renamed from: e, reason: collision with root package name */
        private byte f15316e;

        b() {
        }

        @Override // N4.F.e.AbstractC0581e.a
        public F.e.AbstractC0581e a() {
            String str;
            String str2;
            if (this.f15316e == 3 && (str = this.f15313b) != null && (str2 = this.f15314c) != null) {
                return new z(this.f15312a, str, str2, this.f15315d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f15316e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f15313b == null) {
                sb2.append(" version");
            }
            if (this.f15314c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f15316e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.AbstractC0581e.a
        public F.e.AbstractC0581e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f15314c = str;
            return this;
        }

        @Override // N4.F.e.AbstractC0581e.a
        public F.e.AbstractC0581e.a c(boolean z10) {
            this.f15315d = z10;
            this.f15316e = (byte) (this.f15316e | 2);
            return this;
        }

        @Override // N4.F.e.AbstractC0581e.a
        public F.e.AbstractC0581e.a d(int i10) {
            this.f15312a = i10;
            this.f15316e = (byte) (this.f15316e | 1);
            return this;
        }

        @Override // N4.F.e.AbstractC0581e.a
        public F.e.AbstractC0581e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f15313b = str;
            return this;
        }
    }

    @Override // N4.F.e.AbstractC0581e
    public String b() {
        return this.f15310c;
    }

    @Override // N4.F.e.AbstractC0581e
    public int c() {
        return this.f15308a;
    }

    @Override // N4.F.e.AbstractC0581e
    public String d() {
        return this.f15309b;
    }

    @Override // N4.F.e.AbstractC0581e
    public boolean e() {
        return this.f15311d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.AbstractC0581e)) {
            return false;
        }
        F.e.AbstractC0581e abstractC0581e = (F.e.AbstractC0581e) obj;
        return this.f15308a == abstractC0581e.c() && this.f15309b.equals(abstractC0581e.d()) && this.f15310c.equals(abstractC0581e.b()) && this.f15311d == abstractC0581e.e();
    }

    public int hashCode() {
        return ((((((this.f15308a ^ 1000003) * 1000003) ^ this.f15309b.hashCode()) * 1000003) ^ this.f15310c.hashCode()) * 1000003) ^ (this.f15311d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f15308a + ", version=" + this.f15309b + ", buildVersion=" + this.f15310c + ", jailbroken=" + this.f15311d + "}";
    }

    private z(int i10, String str, String str2, boolean z10) {
        this.f15308a = i10;
        this.f15309b = str;
        this.f15310c = str2;
        this.f15311d = z10;
    }
}
