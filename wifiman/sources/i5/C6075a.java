package i5;

import i5.d;

/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6075a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f48825a;

    /* renamed from: b, reason: collision with root package name */
    private final String f48826b;

    /* renamed from: c, reason: collision with root package name */
    private final String f48827c;

    /* renamed from: d, reason: collision with root package name */
    private final f f48828d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f48829e;

    /* renamed from: i5.a$b */
    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f48830a;

        /* renamed from: b, reason: collision with root package name */
        private String f48831b;

        /* renamed from: c, reason: collision with root package name */
        private String f48832c;

        /* renamed from: d, reason: collision with root package name */
        private f f48833d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f48834e;

        b() {
        }

        @Override // i5.d.a
        public d a() {
            return new C6075a(this.f48830a, this.f48831b, this.f48832c, this.f48833d, this.f48834e);
        }

        @Override // i5.d.a
        public d.a b(f fVar) {
            this.f48833d = fVar;
            return this;
        }

        @Override // i5.d.a
        public d.a c(String str) {
            this.f48831b = str;
            return this;
        }

        @Override // i5.d.a
        public d.a d(String str) {
            this.f48832c = str;
            return this;
        }

        @Override // i5.d.a
        public d.a e(d.b bVar) {
            this.f48834e = bVar;
            return this;
        }

        @Override // i5.d.a
        public d.a f(String str) {
            this.f48830a = str;
            return this;
        }
    }

    @Override // i5.d
    public f b() {
        return this.f48828d;
    }

    @Override // i5.d
    public String c() {
        return this.f48826b;
    }

    @Override // i5.d
    public String d() {
        return this.f48827c;
    }

    @Override // i5.d
    public d.b e() {
        return this.f48829e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f48825a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f48826b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f48827c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f48828d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f48829e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // i5.d
    public String f() {
        return this.f48825a;
    }

    public int hashCode() {
        String str = this.f48825a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f48826b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f48827c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f48828d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f48829e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f48825a + ", fid=" + this.f48826b + ", refreshToken=" + this.f48827c + ", authToken=" + this.f48828d + ", responseCode=" + this.f48829e + "}";
    }

    private C6075a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f48825a = str;
        this.f48826b = str2;
        this.f48827c = str3;
        this.f48828d = fVar;
        this.f48829e = bVar;
    }
}
