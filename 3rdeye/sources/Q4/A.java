package Q4;

import N7.G8;
import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport.java */
/* loaded from: classes2.dex */
public final class A extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f10949b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10950c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10951d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10952e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10953f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10954g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10955h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10956j;

    /* renamed from: k, reason: collision with root package name */
    public final f0.e f10957k;

    /* renamed from: l, reason: collision with root package name */
    public final f0.d f10958l;

    /* renamed from: m, reason: collision with root package name */
    public final f0.a f10959m;

    /* compiled from: AutoValue_CrashlyticsReport.java */
    public static final class a extends f0.b {

        /* renamed from: a, reason: collision with root package name */
        public String f10960a;

        /* renamed from: b, reason: collision with root package name */
        public String f10961b;

        /* renamed from: c, reason: collision with root package name */
        public int f10962c;

        /* renamed from: d, reason: collision with root package name */
        public String f10963d;

        /* renamed from: e, reason: collision with root package name */
        public String f10964e;

        /* renamed from: f, reason: collision with root package name */
        public String f10965f;

        /* renamed from: g, reason: collision with root package name */
        public String f10966g;

        /* renamed from: h, reason: collision with root package name */
        public String f10967h;
        public String i;

        /* renamed from: j, reason: collision with root package name */
        public f0.e f10968j;

        /* renamed from: k, reason: collision with root package name */
        public f0.d f10969k;

        /* renamed from: l, reason: collision with root package name */
        public f0.a f10970l;

        /* renamed from: m, reason: collision with root package name */
        public byte f10971m;

        public final A a() {
            if (this.f10971m == 1 && this.f10960a != null && this.f10961b != null && this.f10963d != null && this.f10967h != null && this.i != null) {
                return new A(this.f10960a, this.f10961b, this.f10962c, this.f10963d, this.f10964e, this.f10965f, this.f10966g, this.f10967h, this.i, this.f10968j, this.f10969k, this.f10970l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f10960a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f10961b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f10971m) == 0) {
                sb.append(" platform");
            }
            if (this.f10963d == null) {
                sb.append(" installationUuid");
            }
            if (this.f10967h == null) {
                sb.append(" buildVersion");
            }
            if (this.i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
    }

    public A(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, f0.e eVar, f0.d dVar, f0.a aVar) {
        this.f10949b = str;
        this.f10950c = str2;
        this.f10951d = i;
        this.f10952e = str3;
        this.f10953f = str4;
        this.f10954g = str5;
        this.f10955h = str6;
        this.i = str7;
        this.f10956j = str8;
        this.f10957k = eVar;
        this.f10958l = dVar;
        this.f10959m = aVar;
    }

    @Override // Q4.f0
    public final f0.a a() {
        return this.f10959m;
    }

    @Override // Q4.f0
    public final String b() {
        return this.f10955h;
    }

    @Override // Q4.f0
    public final String c() {
        return this.i;
    }

    @Override // Q4.f0
    public final String d() {
        return this.f10956j;
    }

    @Override // Q4.f0
    public final String e() {
        return this.f10954g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (!this.f10949b.equals(f0Var.k()) || !this.f10950c.equals(f0Var.g()) || this.f10951d != f0Var.j() || !this.f10952e.equals(f0Var.h())) {
            return false;
        }
        String str = this.f10953f;
        if (str == null) {
            if (f0Var.f() != null) {
                return false;
            }
        } else if (!str.equals(f0Var.f())) {
            return false;
        }
        String str2 = this.f10954g;
        if (str2 == null) {
            if (f0Var.e() != null) {
                return false;
            }
        } else if (!str2.equals(f0Var.e())) {
            return false;
        }
        String str3 = this.f10955h;
        if (str3 == null) {
            if (f0Var.b() != null) {
                return false;
            }
        } else if (!str3.equals(f0Var.b())) {
            return false;
        }
        if (!this.i.equals(f0Var.c()) || !this.f10956j.equals(f0Var.d())) {
            return false;
        }
        f0.e eVar = this.f10957k;
        if (eVar == null) {
            if (f0Var.l() != null) {
                return false;
            }
        } else if (!eVar.equals(f0Var.l())) {
            return false;
        }
        f0.d dVar = this.f10958l;
        if (dVar == null) {
            if (f0Var.i() != null) {
                return false;
            }
        } else if (!dVar.equals(f0Var.i())) {
            return false;
        }
        f0.a aVar = this.f10959m;
        return aVar == null ? f0Var.a() == null : aVar.equals(f0Var.a());
    }

    @Override // Q4.f0
    public final String f() {
        return this.f10953f;
    }

    @Override // Q4.f0
    public final String g() {
        return this.f10950c;
    }

    @Override // Q4.f0
    public final String h() {
        return this.f10952e;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f10949b.hashCode() ^ 1000003) * 1000003) ^ this.f10950c.hashCode()) * 1000003) ^ this.f10951d) * 1000003) ^ this.f10952e.hashCode()) * 1000003;
        String str = this.f10953f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10954g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10955h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.f10956j.hashCode()) * 1000003;
        f0.e eVar = this.f10957k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f0.d dVar = this.f10958l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        f0.a aVar = this.f10959m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // Q4.f0
    public final f0.d i() {
        return this.f10958l;
    }

    @Override // Q4.f0
    public final int j() {
        return this.f10951d;
    }

    @Override // Q4.f0
    public final String k() {
        return this.f10949b;
    }

    @Override // Q4.f0
    public final f0.e l() {
        return this.f10957k;
    }

    @Override // Q4.f0
    public final a m() {
        a aVar = new a();
        aVar.f10960a = this.f10949b;
        aVar.f10961b = this.f10950c;
        aVar.f10962c = this.f10951d;
        aVar.f10963d = this.f10952e;
        aVar.f10964e = this.f10953f;
        aVar.f10965f = this.f10954g;
        aVar.f10966g = this.f10955h;
        aVar.f10967h = this.i;
        aVar.i = this.f10956j;
        aVar.f10968j = this.f10957k;
        aVar.f10969k = this.f10958l;
        aVar.f10970l = this.f10959m;
        aVar.f10971m = (byte) 1;
        return aVar;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f10949b + ", gmpAppId=" + this.f10950c + ", platform=" + this.f10951d + ", installationUuid=" + this.f10952e + ", firebaseInstallationId=" + this.f10953f + ", firebaseAuthenticationToken=" + this.f10954g + ", appQualitySessionId=" + this.f10955h + ", buildVersion=" + this.i + ", displayVersion=" + this.f10956j + ", session=" + this.f10957k + ", ndkPayload=" + this.f10958l + ", appExitInfo=" + this.f10959m + "}";
    }
}
