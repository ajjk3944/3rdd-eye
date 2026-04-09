package N4;

import N4.F;
import java.util.List;

/* loaded from: classes3.dex */
final class h extends F.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f15130a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15131b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15132c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15133d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f15134e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15135f;

    /* renamed from: g, reason: collision with root package name */
    private final F.e.a f15136g;

    /* renamed from: h, reason: collision with root package name */
    private final F.e.f f15137h;

    /* renamed from: i, reason: collision with root package name */
    private final F.e.AbstractC0581e f15138i;

    /* renamed from: j, reason: collision with root package name */
    private final F.e.c f15139j;

    /* renamed from: k, reason: collision with root package name */
    private final List f15140k;

    /* renamed from: l, reason: collision with root package name */
    private final int f15141l;

    static final class b extends F.e.b {

        /* renamed from: a, reason: collision with root package name */
        private String f15142a;

        /* renamed from: b, reason: collision with root package name */
        private String f15143b;

        /* renamed from: c, reason: collision with root package name */
        private String f15144c;

        /* renamed from: d, reason: collision with root package name */
        private long f15145d;

        /* renamed from: e, reason: collision with root package name */
        private Long f15146e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f15147f;

        /* renamed from: g, reason: collision with root package name */
        private F.e.a f15148g;

        /* renamed from: h, reason: collision with root package name */
        private F.e.f f15149h;

        /* renamed from: i, reason: collision with root package name */
        private F.e.AbstractC0581e f15150i;

        /* renamed from: j, reason: collision with root package name */
        private F.e.c f15151j;

        /* renamed from: k, reason: collision with root package name */
        private List f15152k;

        /* renamed from: l, reason: collision with root package name */
        private int f15153l;

        /* renamed from: m, reason: collision with root package name */
        private byte f15154m;

        @Override // N4.F.e.b
        public F.e a() {
            String str;
            String str2;
            F.e.a aVar;
            if (this.f15154m == 7 && (str = this.f15142a) != null && (str2 = this.f15143b) != null && (aVar = this.f15148g) != null) {
                return new h(str, str2, this.f15144c, this.f15145d, this.f15146e, this.f15147f, aVar, this.f15149h, this.f15150i, this.f15151j, this.f15152k, this.f15153l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f15142a == null) {
                sb2.append(" generator");
            }
            if (this.f15143b == null) {
                sb2.append(" identifier");
            }
            if ((this.f15154m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f15154m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f15148g == null) {
                sb2.append(" app");
            }
            if ((this.f15154m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // N4.F.e.b
        public F.e.b b(F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f15148g = aVar;
            return this;
        }

        @Override // N4.F.e.b
        public F.e.b c(String str) {
            this.f15144c = str;
            return this;
        }

        @Override // N4.F.e.b
        public F.e.b d(boolean z10) {
            this.f15147f = z10;
            this.f15154m = (byte) (this.f15154m | 2);
            return this;
        }

        @Override // N4.F.e.b
        public F.e.b e(F.e.c cVar) {
            this.f15151j = cVar;
            return this;
        }

        @Override // N4.F.e.b
        public F.e.b f(Long l10) {
            this.f15146e = l10;
            return this;
        }

        @Override // N4.F.e.b
        public F.e.b g(List list) {
            this.f15152k = list;
            return this;
        }

        @Override // N4.F.e.b
        public F.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f15142a = str;
            return this;
        }

        @Override // N4.F.e.b
        public F.e.b i(int i10) {
            this.f15153l = i10;
            this.f15154m = (byte) (this.f15154m | 4);
            return this;
        }

        @Override // N4.F.e.b
        public F.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f15143b = str;
            return this;
        }

        @Override // N4.F.e.b
        public F.e.b l(F.e.AbstractC0581e abstractC0581e) {
            this.f15150i = abstractC0581e;
            return this;
        }

        @Override // N4.F.e.b
        public F.e.b m(long j10) {
            this.f15145d = j10;
            this.f15154m = (byte) (this.f15154m | 1);
            return this;
        }

        @Override // N4.F.e.b
        public F.e.b n(F.e.f fVar) {
            this.f15149h = fVar;
            return this;
        }

        b() {
        }

        private b(F.e eVar) {
            this.f15142a = eVar.g();
            this.f15143b = eVar.i();
            this.f15144c = eVar.c();
            this.f15145d = eVar.l();
            this.f15146e = eVar.e();
            this.f15147f = eVar.n();
            this.f15148g = eVar.b();
            this.f15149h = eVar.m();
            this.f15150i = eVar.k();
            this.f15151j = eVar.d();
            this.f15152k = eVar.f();
            this.f15153l = eVar.h();
            this.f15154m = (byte) 7;
        }
    }

    @Override // N4.F.e
    public F.e.a b() {
        return this.f15136g;
    }

    @Override // N4.F.e
    public String c() {
        return this.f15132c;
    }

    @Override // N4.F.e
    public F.e.c d() {
        return this.f15139j;
    }

    @Override // N4.F.e
    public Long e() {
        return this.f15134e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        F.e.f fVar;
        F.e.AbstractC0581e abstractC0581e;
        F.e.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e)) {
            return false;
        }
        F.e eVar = (F.e) obj;
        return this.f15130a.equals(eVar.g()) && this.f15131b.equals(eVar.i()) && ((str = this.f15132c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f15133d == eVar.l() && ((l10 = this.f15134e) != null ? l10.equals(eVar.e()) : eVar.e() == null) && this.f15135f == eVar.n() && this.f15136g.equals(eVar.b()) && ((fVar = this.f15137h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0581e = this.f15138i) != null ? abstractC0581e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f15139j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f15140k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f15141l == eVar.h();
    }

    @Override // N4.F.e
    public List f() {
        return this.f15140k;
    }

    @Override // N4.F.e
    public String g() {
        return this.f15130a;
    }

    @Override // N4.F.e
    public int h() {
        return this.f15141l;
    }

    public int hashCode() {
        int iHashCode = (((this.f15130a.hashCode() ^ 1000003) * 1000003) ^ this.f15131b.hashCode()) * 1000003;
        String str = this.f15132c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f15133d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f15134e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f15135f ? 1231 : 1237)) * 1000003) ^ this.f15136g.hashCode()) * 1000003;
        F.e.f fVar = this.f15137h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        F.e.AbstractC0581e abstractC0581e = this.f15138i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0581e == null ? 0 : abstractC0581e.hashCode())) * 1000003;
        F.e.c cVar = this.f15139j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list = this.f15140k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f15141l;
    }

    @Override // N4.F.e
    public String i() {
        return this.f15131b;
    }

    @Override // N4.F.e
    public F.e.AbstractC0581e k() {
        return this.f15138i;
    }

    @Override // N4.F.e
    public long l() {
        return this.f15133d;
    }

    @Override // N4.F.e
    public F.e.f m() {
        return this.f15137h;
    }

    @Override // N4.F.e
    public boolean n() {
        return this.f15135f;
    }

    @Override // N4.F.e
    public F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f15130a + ", identifier=" + this.f15131b + ", appQualitySessionId=" + this.f15132c + ", startedAt=" + this.f15133d + ", endedAt=" + this.f15134e + ", crashed=" + this.f15135f + ", app=" + this.f15136g + ", user=" + this.f15137h + ", os=" + this.f15138i + ", device=" + this.f15139j + ", events=" + this.f15140k + ", generatorType=" + this.f15141l + "}";
    }

    private h(String str, String str2, String str3, long j10, Long l10, boolean z10, F.e.a aVar, F.e.f fVar, F.e.AbstractC0581e abstractC0581e, F.e.c cVar, List list, int i10) {
        this.f15130a = str;
        this.f15131b = str2;
        this.f15132c = str3;
        this.f15133d = j10;
        this.f15134e = l10;
        this.f15135f = z10;
        this.f15136g = aVar;
        this.f15137h = fVar;
        this.f15138i = abstractC0581e;
        this.f15139j = cVar;
        this.f15140k = list;
        this.f15141l = i10;
    }
}
