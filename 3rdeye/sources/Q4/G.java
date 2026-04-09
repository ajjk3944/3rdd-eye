package Q4;

import N7.G8;
import Q4.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* loaded from: classes2.dex */
public final class G extends f0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f10998a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10999b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11000c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11001d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f11002e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11003f;

    /* renamed from: g, reason: collision with root package name */
    public final f0.e.a f11004g;

    /* renamed from: h, reason: collision with root package name */
    public final f0.e.f f11005h;
    public final f0.e.AbstractC0146e i;

    /* renamed from: j, reason: collision with root package name */
    public final f0.e.c f11006j;

    /* renamed from: k, reason: collision with root package name */
    public final List<f0.e.d> f11007k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11008l;

    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    public static final class a extends f0.e.b {

        /* renamed from: a, reason: collision with root package name */
        public String f11009a;

        /* renamed from: b, reason: collision with root package name */
        public String f11010b;

        /* renamed from: c, reason: collision with root package name */
        public String f11011c;

        /* renamed from: d, reason: collision with root package name */
        public long f11012d;

        /* renamed from: e, reason: collision with root package name */
        public Long f11013e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f11014f;

        /* renamed from: g, reason: collision with root package name */
        public f0.e.a f11015g;

        /* renamed from: h, reason: collision with root package name */
        public f0.e.f f11016h;
        public f0.e.AbstractC0146e i;

        /* renamed from: j, reason: collision with root package name */
        public f0.e.c f11017j;

        /* renamed from: k, reason: collision with root package name */
        public List<f0.e.d> f11018k;

        /* renamed from: l, reason: collision with root package name */
        public int f11019l;

        /* renamed from: m, reason: collision with root package name */
        public byte f11020m;

        public final G a() {
            String str;
            String str2;
            f0.e.a aVar;
            if (this.f11020m == 7 && (str = this.f11009a) != null && (str2 = this.f11010b) != null && (aVar = this.f11015g) != null) {
                return new G(str, str2, this.f11011c, this.f11012d, this.f11013e, this.f11014f, aVar, this.f11016h, this.i, this.f11017j, this.f11018k, this.f11019l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f11009a == null) {
                sb.append(" generator");
            }
            if (this.f11010b == null) {
                sb.append(" identifier");
            }
            if ((this.f11020m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f11020m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f11015g == null) {
                sb.append(" app");
            }
            if ((this.f11020m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
    }

    public G() {
        throw null;
    }

    public G(String str, String str2, String str3, long j4, Long l5, boolean z10, f0.e.a aVar, f0.e.f fVar, f0.e.AbstractC0146e abstractC0146e, f0.e.c cVar, List list, int i) {
        this.f10998a = str;
        this.f10999b = str2;
        this.f11000c = str3;
        this.f11001d = j4;
        this.f11002e = l5;
        this.f11003f = z10;
        this.f11004g = aVar;
        this.f11005h = fVar;
        this.i = abstractC0146e;
        this.f11006j = cVar;
        this.f11007k = list;
        this.f11008l = i;
    }

    @Override // Q4.f0.e
    public final f0.e.a a() {
        return this.f11004g;
    }

    @Override // Q4.f0.e
    public final String b() {
        return this.f11000c;
    }

    @Override // Q4.f0.e
    public final f0.e.c c() {
        return this.f11006j;
    }

    @Override // Q4.f0.e
    public final Long d() {
        return this.f11002e;
    }

    @Override // Q4.f0.e
    public final List<f0.e.d> e() {
        return this.f11007k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e)) {
            return false;
        }
        f0.e eVar = (f0.e) obj;
        if (!this.f10998a.equals(eVar.f()) || !this.f10999b.equals(eVar.h())) {
            return false;
        }
        String str = this.f11000c;
        if (str == null) {
            if (eVar.b() != null) {
                return false;
            }
        } else if (!str.equals(eVar.b())) {
            return false;
        }
        if (this.f11001d != eVar.j()) {
            return false;
        }
        Long l5 = this.f11002e;
        if (l5 == null) {
            if (eVar.d() != null) {
                return false;
            }
        } else if (!l5.equals(eVar.d())) {
            return false;
        }
        if (this.f11003f != eVar.l() || !this.f11004g.equals(eVar.a())) {
            return false;
        }
        f0.e.f fVar = this.f11005h;
        if (fVar == null) {
            if (eVar.k() != null) {
                return false;
            }
        } else if (!fVar.equals(eVar.k())) {
            return false;
        }
        f0.e.AbstractC0146e abstractC0146e = this.i;
        if (abstractC0146e == null) {
            if (eVar.i() != null) {
                return false;
            }
        } else if (!abstractC0146e.equals(eVar.i())) {
            return false;
        }
        f0.e.c cVar = this.f11006j;
        if (cVar == null) {
            if (eVar.c() != null) {
                return false;
            }
        } else if (!cVar.equals(eVar.c())) {
            return false;
        }
        List<f0.e.d> list = this.f11007k;
        if (list == null) {
            if (eVar.e() != null) {
                return false;
            }
        } else if (!list.equals(eVar.e())) {
            return false;
        }
        return this.f11008l == eVar.g();
    }

    @Override // Q4.f0.e
    public final String f() {
        return this.f10998a;
    }

    @Override // Q4.f0.e
    public final int g() {
        return this.f11008l;
    }

    @Override // Q4.f0.e
    public final String h() {
        return this.f10999b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f10998a.hashCode() ^ 1000003) * 1000003) ^ this.f10999b.hashCode()) * 1000003;
        String str = this.f11000c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j4 = this.f11001d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        Long l5 = this.f11002e;
        int iHashCode3 = (((((i ^ (l5 == null ? 0 : l5.hashCode())) * 1000003) ^ (this.f11003f ? 1231 : 1237)) * 1000003) ^ this.f11004g.hashCode()) * 1000003;
        f0.e.f fVar = this.f11005h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        f0.e.AbstractC0146e abstractC0146e = this.i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0146e == null ? 0 : abstractC0146e.hashCode())) * 1000003;
        f0.e.c cVar = this.f11006j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d> list = this.f11007k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f11008l;
    }

    @Override // Q4.f0.e
    public final f0.e.AbstractC0146e i() {
        return this.i;
    }

    @Override // Q4.f0.e
    public final long j() {
        return this.f11001d;
    }

    @Override // Q4.f0.e
    public final f0.e.f k() {
        return this.f11005h;
    }

    @Override // Q4.f0.e
    public final boolean l() {
        return this.f11003f;
    }

    @Override // Q4.f0.e
    public final a m() {
        a aVar = new a();
        aVar.f11009a = this.f10998a;
        aVar.f11010b = this.f10999b;
        aVar.f11011c = this.f11000c;
        aVar.f11012d = this.f11001d;
        aVar.f11013e = this.f11002e;
        aVar.f11014f = this.f11003f;
        aVar.f11015g = this.f11004g;
        aVar.f11016h = this.f11005h;
        aVar.i = this.i;
        aVar.f11017j = this.f11006j;
        aVar.f11018k = this.f11007k;
        aVar.f11019l = this.f11008l;
        aVar.f11020m = (byte) 7;
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f10998a);
        sb.append(", identifier=");
        sb.append(this.f10999b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f11000c);
        sb.append(", startedAt=");
        sb.append(this.f11001d);
        sb.append(", endedAt=");
        sb.append(this.f11002e);
        sb.append(", crashed=");
        sb.append(this.f11003f);
        sb.append(", app=");
        sb.append(this.f11004g);
        sb.append(", user=");
        sb.append(this.f11005h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.f11006j);
        sb.append(", events=");
        sb.append(this.f11007k);
        sb.append(", generatorType=");
        return B4.i.j(sb, this.f11008l, "}");
    }
}
