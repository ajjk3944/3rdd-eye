package N4;

import N4.F;

/* renamed from: N4.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3360b extends F {

    /* renamed from: b, reason: collision with root package name */
    private final String f15068b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15069c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15070d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15071e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15072f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15073g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15074h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15075i;

    /* renamed from: j, reason: collision with root package name */
    private final String f15076j;

    /* renamed from: k, reason: collision with root package name */
    private final F.e f15077k;

    /* renamed from: l, reason: collision with root package name */
    private final F.d f15078l;

    /* renamed from: m, reason: collision with root package name */
    private final F.a f15079m;

    /* renamed from: N4.b$b, reason: collision with other inner class name */
    static final class C0583b extends F.b {

        /* renamed from: a, reason: collision with root package name */
        private String f15080a;

        /* renamed from: b, reason: collision with root package name */
        private String f15081b;

        /* renamed from: c, reason: collision with root package name */
        private int f15082c;

        /* renamed from: d, reason: collision with root package name */
        private String f15083d;

        /* renamed from: e, reason: collision with root package name */
        private String f15084e;

        /* renamed from: f, reason: collision with root package name */
        private String f15085f;

        /* renamed from: g, reason: collision with root package name */
        private String f15086g;

        /* renamed from: h, reason: collision with root package name */
        private String f15087h;

        /* renamed from: i, reason: collision with root package name */
        private String f15088i;

        /* renamed from: j, reason: collision with root package name */
        private F.e f15089j;

        /* renamed from: k, reason: collision with root package name */
        private F.d f15090k;

        /* renamed from: l, reason: collision with root package name */
        private F.a f15091l;

        /* renamed from: m, reason: collision with root package name */
        private byte f15092m;

        @Override // N4.F.b
        public F a() {
            if (this.f15092m == 1 && this.f15080a != null && this.f15081b != null && this.f15083d != null && this.f15087h != null && this.f15088i != null) {
                return new C3360b(this.f15080a, this.f15081b, this.f15082c, this.f15083d, this.f15084e, this.f15085f, this.f15086g, this.f15087h, this.f15088i, this.f15089j, this.f15090k, this.f15091l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15080a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f15081b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f15092m) == 0) {
                sb2.append(" platform");
            }
            if (this.f15083d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f15087h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f15088i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.b
        public F.b b(F.a aVar) {
            this.f15091l = aVar;
            return this;
        }

        @Override // N4.F.b
        public F.b c(String str) {
            this.f15086g = str;
            return this;
        }

        @Override // N4.F.b
        public F.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f15087h = str;
            return this;
        }

        @Override // N4.F.b
        public F.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f15088i = str;
            return this;
        }

        @Override // N4.F.b
        public F.b f(String str) {
            this.f15085f = str;
            return this;
        }

        @Override // N4.F.b
        public F.b g(String str) {
            this.f15084e = str;
            return this;
        }

        @Override // N4.F.b
        public F.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f15081b = str;
            return this;
        }

        @Override // N4.F.b
        public F.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f15083d = str;
            return this;
        }

        @Override // N4.F.b
        public F.b j(F.d dVar) {
            this.f15090k = dVar;
            return this;
        }

        @Override // N4.F.b
        public F.b k(int i10) {
            this.f15082c = i10;
            this.f15092m = (byte) (this.f15092m | 1);
            return this;
        }

        @Override // N4.F.b
        public F.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f15080a = str;
            return this;
        }

        @Override // N4.F.b
        public F.b m(F.e eVar) {
            this.f15089j = eVar;
            return this;
        }

        C0583b() {
        }

        private C0583b(F f10) {
            this.f15080a = f10.m();
            this.f15081b = f10.i();
            this.f15082c = f10.l();
            this.f15083d = f10.j();
            this.f15084e = f10.h();
            this.f15085f = f10.g();
            this.f15086g = f10.d();
            this.f15087h = f10.e();
            this.f15088i = f10.f();
            this.f15089j = f10.n();
            this.f15090k = f10.k();
            this.f15091l = f10.c();
            this.f15092m = (byte) 1;
        }
    }

    @Override // N4.F
    public F.a c() {
        return this.f15079m;
    }

    @Override // N4.F
    public String d() {
        return this.f15074h;
    }

    @Override // N4.F
    public String e() {
        return this.f15075i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        F.e eVar;
        F.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        if (this.f15068b.equals(f10.m()) && this.f15069c.equals(f10.i()) && this.f15070d == f10.l() && this.f15071e.equals(f10.j()) && ((str = this.f15072f) != null ? str.equals(f10.h()) : f10.h() == null) && ((str2 = this.f15073g) != null ? str2.equals(f10.g()) : f10.g() == null) && ((str3 = this.f15074h) != null ? str3.equals(f10.d()) : f10.d() == null) && this.f15075i.equals(f10.e()) && this.f15076j.equals(f10.f()) && ((eVar = this.f15077k) != null ? eVar.equals(f10.n()) : f10.n() == null) && ((dVar = this.f15078l) != null ? dVar.equals(f10.k()) : f10.k() == null)) {
            F.a aVar = this.f15079m;
            if (aVar == null) {
                if (f10.c() == null) {
                    return true;
                }
            } else if (aVar.equals(f10.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // N4.F
    public String f() {
        return this.f15076j;
    }

    @Override // N4.F
    public String g() {
        return this.f15073g;
    }

    @Override // N4.F
    public String h() {
        return this.f15072f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f15068b.hashCode() ^ 1000003) * 1000003) ^ this.f15069c.hashCode()) * 1000003) ^ this.f15070d) * 1000003) ^ this.f15071e.hashCode()) * 1000003;
        String str = this.f15072f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f15073g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f15074h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f15075i.hashCode()) * 1000003) ^ this.f15076j.hashCode()) * 1000003;
        F.e eVar = this.f15077k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        F.d dVar = this.f15078l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        F.a aVar = this.f15079m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // N4.F
    public String i() {
        return this.f15069c;
    }

    @Override // N4.F
    public String j() {
        return this.f15071e;
    }

    @Override // N4.F
    public F.d k() {
        return this.f15078l;
    }

    @Override // N4.F
    public int l() {
        return this.f15070d;
    }

    @Override // N4.F
    public String m() {
        return this.f15068b;
    }

    @Override // N4.F
    public F.e n() {
        return this.f15077k;
    }

    @Override // N4.F
    protected F.b o() {
        return new C0583b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f15068b + ", gmpAppId=" + this.f15069c + ", platform=" + this.f15070d + ", installationUuid=" + this.f15071e + ", firebaseInstallationId=" + this.f15072f + ", firebaseAuthenticationToken=" + this.f15073g + ", appQualitySessionId=" + this.f15074h + ", buildVersion=" + this.f15075i + ", displayVersion=" + this.f15076j + ", session=" + this.f15077k + ", ndkPayload=" + this.f15078l + ", appExitInfo=" + this.f15079m + "}";
    }

    private C3360b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, F.e eVar, F.d dVar, F.a aVar) {
        this.f15068b = str;
        this.f15069c = str2;
        this.f15070d = i10;
        this.f15071e = str3;
        this.f15072f = str4;
        this.f15073g = str5;
        this.f15074h = str6;
        this.f15075i = str7;
        this.f15076j = str8;
        this.f15077k = eVar;
        this.f15078l = dVar;
        this.f15079m = aVar;
    }
}
