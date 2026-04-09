package h5;

import h5.AbstractC5952d;
import h5.C5951c;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5949a extends AbstractC5952d {

    /* renamed from: b, reason: collision with root package name */
    private final String f48408b;

    /* renamed from: c, reason: collision with root package name */
    private final C5951c.a f48409c;

    /* renamed from: d, reason: collision with root package name */
    private final String f48410d;

    /* renamed from: e, reason: collision with root package name */
    private final String f48411e;

    /* renamed from: f, reason: collision with root package name */
    private final long f48412f;

    /* renamed from: g, reason: collision with root package name */
    private final long f48413g;

    /* renamed from: h, reason: collision with root package name */
    private final String f48414h;

    /* renamed from: h5.a$b */
    static final class b extends AbstractC5952d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f48415a;

        /* renamed from: b, reason: collision with root package name */
        private C5951c.a f48416b;

        /* renamed from: c, reason: collision with root package name */
        private String f48417c;

        /* renamed from: d, reason: collision with root package name */
        private String f48418d;

        /* renamed from: e, reason: collision with root package name */
        private Long f48419e;

        /* renamed from: f, reason: collision with root package name */
        private Long f48420f;

        /* renamed from: g, reason: collision with root package name */
        private String f48421g;

        @Override // h5.AbstractC5952d.a
        public AbstractC5952d a() {
            String str = "";
            if (this.f48416b == null) {
                str = " registrationStatus";
            }
            if (this.f48419e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f48420f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C5949a(this.f48415a, this.f48416b, this.f48417c, this.f48418d, this.f48419e.longValue(), this.f48420f.longValue(), this.f48421g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // h5.AbstractC5952d.a
        public AbstractC5952d.a b(String str) {
            this.f48417c = str;
            return this;
        }

        @Override // h5.AbstractC5952d.a
        public AbstractC5952d.a c(long j10) {
            this.f48419e = Long.valueOf(j10);
            return this;
        }

        @Override // h5.AbstractC5952d.a
        public AbstractC5952d.a d(String str) {
            this.f48415a = str;
            return this;
        }

        @Override // h5.AbstractC5952d.a
        public AbstractC5952d.a e(String str) {
            this.f48421g = str;
            return this;
        }

        @Override // h5.AbstractC5952d.a
        public AbstractC5952d.a f(String str) {
            this.f48418d = str;
            return this;
        }

        @Override // h5.AbstractC5952d.a
        public AbstractC5952d.a g(C5951c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f48416b = aVar;
            return this;
        }

        @Override // h5.AbstractC5952d.a
        public AbstractC5952d.a h(long j10) {
            this.f48420f = Long.valueOf(j10);
            return this;
        }

        b() {
        }

        private b(AbstractC5952d abstractC5952d) {
            this.f48415a = abstractC5952d.d();
            this.f48416b = abstractC5952d.g();
            this.f48417c = abstractC5952d.b();
            this.f48418d = abstractC5952d.f();
            this.f48419e = Long.valueOf(abstractC5952d.c());
            this.f48420f = Long.valueOf(abstractC5952d.h());
            this.f48421g = abstractC5952d.e();
        }
    }

    @Override // h5.AbstractC5952d
    public String b() {
        return this.f48410d;
    }

    @Override // h5.AbstractC5952d
    public long c() {
        return this.f48412f;
    }

    @Override // h5.AbstractC5952d
    public String d() {
        return this.f48408b;
    }

    @Override // h5.AbstractC5952d
    public String e() {
        return this.f48414h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5952d)) {
            return false;
        }
        AbstractC5952d abstractC5952d = (AbstractC5952d) obj;
        String str3 = this.f48408b;
        if (str3 != null ? str3.equals(abstractC5952d.d()) : abstractC5952d.d() == null) {
            if (this.f48409c.equals(abstractC5952d.g()) && ((str = this.f48410d) != null ? str.equals(abstractC5952d.b()) : abstractC5952d.b() == null) && ((str2 = this.f48411e) != null ? str2.equals(abstractC5952d.f()) : abstractC5952d.f() == null) && this.f48412f == abstractC5952d.c() && this.f48413g == abstractC5952d.h()) {
                String str4 = this.f48414h;
                if (str4 == null) {
                    if (abstractC5952d.e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC5952d.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // h5.AbstractC5952d
    public String f() {
        return this.f48411e;
    }

    @Override // h5.AbstractC5952d
    public C5951c.a g() {
        return this.f48409c;
    }

    @Override // h5.AbstractC5952d
    public long h() {
        return this.f48413g;
    }

    public int hashCode() {
        String str = this.f48408b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f48409c.hashCode()) * 1000003;
        String str2 = this.f48410d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f48411e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f48412f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f48413g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f48414h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // h5.AbstractC5952d
    public AbstractC5952d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f48408b + ", registrationStatus=" + this.f48409c + ", authToken=" + this.f48410d + ", refreshToken=" + this.f48411e + ", expiresInSecs=" + this.f48412f + ", tokenCreationEpochInSecs=" + this.f48413g + ", fisError=" + this.f48414h + "}";
    }

    private C5949a(String str, C5951c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f48408b = str;
        this.f48409c = aVar;
        this.f48410d = str2;
        this.f48411e = str3;
        this.f48412f = j10;
        this.f48413g = j11;
        this.f48414h = str4;
    }
}
