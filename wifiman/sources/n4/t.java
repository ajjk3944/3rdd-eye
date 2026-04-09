package N4;

import N4.F;

/* loaded from: classes3.dex */
final class t extends F.e.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15269a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15270b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15271c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15272d;

    static final class b extends F.e.d.a.c.AbstractC0578a {

        /* renamed from: a, reason: collision with root package name */
        private String f15273a;

        /* renamed from: b, reason: collision with root package name */
        private int f15274b;

        /* renamed from: c, reason: collision with root package name */
        private int f15275c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15276d;

        /* renamed from: e, reason: collision with root package name */
        private byte f15277e;

        b() {
        }

        @Override // N4.F.e.d.a.c.AbstractC0578a
        public F.e.d.a.c a() {
            String str;
            if (this.f15277e == 7 && (str = this.f15273a) != null) {
                return new t(str, this.f15274b, this.f15275c, this.f15276d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15273a == null) {
                sb2.append(" processName");
            }
            if ((this.f15277e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f15277e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f15277e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.d.a.c.AbstractC0578a
        public F.e.d.a.c.AbstractC0578a b(boolean z10) {
            this.f15276d = z10;
            this.f15277e = (byte) (this.f15277e | 4);
            return this;
        }

        @Override // N4.F.e.d.a.c.AbstractC0578a
        public F.e.d.a.c.AbstractC0578a c(int i10) {
            this.f15275c = i10;
            this.f15277e = (byte) (this.f15277e | 2);
            return this;
        }

        @Override // N4.F.e.d.a.c.AbstractC0578a
        public F.e.d.a.c.AbstractC0578a d(int i10) {
            this.f15274b = i10;
            this.f15277e = (byte) (this.f15277e | 1);
            return this;
        }

        @Override // N4.F.e.d.a.c.AbstractC0578a
        public F.e.d.a.c.AbstractC0578a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f15273a = str;
            return this;
        }
    }

    @Override // N4.F.e.d.a.c
    public int b() {
        return this.f15271c;
    }

    @Override // N4.F.e.d.a.c
    public int c() {
        return this.f15270b;
    }

    @Override // N4.F.e.d.a.c
    public String d() {
        return this.f15269a;
    }

    @Override // N4.F.e.d.a.c
    public boolean e() {
        return this.f15272d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.c)) {
            return false;
        }
        F.e.d.a.c cVar = (F.e.d.a.c) obj;
        return this.f15269a.equals(cVar.d()) && this.f15270b == cVar.c() && this.f15271c == cVar.b() && this.f15272d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.f15269a.hashCode() ^ 1000003) * 1000003) ^ this.f15270b) * 1000003) ^ this.f15271c) * 1000003) ^ (this.f15272d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f15269a + ", pid=" + this.f15270b + ", importance=" + this.f15271c + ", defaultProcess=" + this.f15272d + "}";
    }

    private t(String str, int i10, int i11, boolean z10) {
        this.f15269a = str;
        this.f15270b = i10;
        this.f15271c = i11;
        this.f15272d = z10;
    }
}
