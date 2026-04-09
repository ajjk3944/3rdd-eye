package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 extends n2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f29062b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29063c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29064d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29065e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29066f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29067h;

    /* renamed from: i, reason: collision with root package name */
    public final String f29068i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final m2 f29069k;

    /* renamed from: l, reason: collision with root package name */
    public final s1 f29070l;

    /* renamed from: m, reason: collision with root package name */
    public final p1 f29071m;

    public b0(String str, String str2, int i4, String str3, String str4, String str5, String str6, String str7, String str8, m2 m2Var, s1 s1Var, p1 p1Var) {
        this.f29062b = str;
        this.f29063c = str2;
        this.f29064d = i4;
        this.f29065e = str3;
        this.f29066f = str4;
        this.g = str5;
        this.f29067h = str6;
        this.f29068i = str7;
        this.j = str8;
        this.f29069k = m2Var;
        this.f29070l = s1Var;
        this.f29071m = p1Var;
    }

    public final a0 a() {
        a0 a0Var = new a0();
        a0Var.f29037a = this.f29062b;
        a0Var.f29038b = this.f29063c;
        a0Var.f29039c = this.f29064d;
        a0Var.f29040d = this.f29065e;
        a0Var.f29041e = this.f29066f;
        a0Var.f29042f = this.g;
        a0Var.g = this.f29067h;
        a0Var.f29043h = this.f29068i;
        a0Var.f29044i = this.j;
        a0Var.j = this.f29069k;
        a0Var.f29045k = this.f29070l;
        a0Var.f29046l = this.f29071m;
        a0Var.f29047m = (byte) 1;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        m2 m2Var;
        s1 s1Var;
        p1 p1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            b0 b0Var = (b0) ((n2) obj);
            p1 p1Var2 = b0Var.f29071m;
            s1 s1Var2 = b0Var.f29070l;
            m2 m2Var2 = b0Var.f29069k;
            String str4 = b0Var.f29067h;
            String str5 = b0Var.g;
            String str6 = b0Var.f29066f;
            if (this.f29062b.equals(b0Var.f29062b) && this.f29063c.equals(b0Var.f29063c) && this.f29064d == b0Var.f29064d && this.f29065e.equals(b0Var.f29065e) && ((str = this.f29066f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.f29067h) != null ? str3.equals(str4) : str4 == null) && this.f29068i.equals(b0Var.f29068i) && this.j.equals(b0Var.j) && ((m2Var = this.f29069k) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((s1Var = this.f29070l) != null ? s1Var.equals(s1Var2) : s1Var2 == null) && ((p1Var = this.f29071m) != null ? p1Var.equals(p1Var2) : p1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f29062b.hashCode() ^ 1000003) * 1000003) ^ this.f29063c.hashCode()) * 1000003) ^ this.f29064d) * 1000003) ^ this.f29065e.hashCode()) * 1000003;
        String str = this.f29066f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f29067h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f29068i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        m2 m2Var = this.f29069k;
        int iHashCode5 = (iHashCode4 ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        s1 s1Var = this.f29070l;
        int iHashCode6 = (iHashCode5 ^ (s1Var == null ? 0 : s1Var.hashCode())) * 1000003;
        p1 p1Var = this.f29071m;
        return iHashCode6 ^ (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f29062b + ", gmpAppId=" + this.f29063c + ", platform=" + this.f29064d + ", installationUuid=" + this.f29065e + ", firebaseInstallationId=" + this.f29066f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.f29067h + ", buildVersion=" + this.f29068i + ", displayVersion=" + this.j + ", session=" + this.f29069k + ", ndkPayload=" + this.f29070l + ", appExitInfo=" + this.f29071m + "}";
    }
}
