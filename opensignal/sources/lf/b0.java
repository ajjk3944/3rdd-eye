package lf;

/* loaded from: classes.dex */
public final class b0 extends n2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f15172b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15173c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15174d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15175e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15176f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15177g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15178h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15179i;
    public final String j;
    public final m2 k;

    /* renamed from: l, reason: collision with root package name */
    public final s1 f15180l;

    /* renamed from: m, reason: collision with root package name */
    public final p1 f15181m;

    public b0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, m2 m2Var, s1 s1Var, p1 p1Var) {
        this.f15172b = str;
        this.f15173c = str2;
        this.f15174d = i10;
        this.f15175e = str3;
        this.f15176f = str4;
        this.f15177g = str5;
        this.f15178h = str6;
        this.f15179i = str7;
        this.j = str8;
        this.k = m2Var;
        this.f15180l = s1Var;
        this.f15181m = p1Var;
    }

    public final a0 a() {
        a0 a0Var = new a0();
        a0Var.f15145a = this.f15172b;
        a0Var.f15146b = this.f15173c;
        a0Var.f15147c = this.f15174d;
        a0Var.f15148d = this.f15175e;
        a0Var.f15149e = this.f15176f;
        a0Var.f15150f = this.f15177g;
        a0Var.f15151g = this.f15178h;
        a0Var.f15152h = this.f15179i;
        a0Var.f15153i = this.j;
        a0Var.j = this.k;
        a0Var.k = this.f15180l;
        a0Var.f15154l = this.f15181m;
        a0Var.f15155m = (byte) 1;
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
            p1 p1Var2 = b0Var.f15181m;
            s1 s1Var2 = b0Var.f15180l;
            m2 m2Var2 = b0Var.k;
            String str4 = b0Var.f15178h;
            String str5 = b0Var.f15177g;
            String str6 = b0Var.f15176f;
            if (this.f15172b.equals(b0Var.f15172b) && this.f15173c.equals(b0Var.f15173c) && this.f15174d == b0Var.f15174d && this.f15175e.equals(b0Var.f15175e) && ((str = this.f15176f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f15177g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.f15178h) != null ? str3.equals(str4) : str4 == null) && this.f15179i.equals(b0Var.f15179i) && this.j.equals(b0Var.j) && ((m2Var = this.k) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((s1Var = this.f15180l) != null ? s1Var.equals(s1Var2) : s1Var2 == null) && ((p1Var = this.f15181m) != null ? p1Var.equals(p1Var2) : p1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f15172b.hashCode() ^ 1000003) * 1000003) ^ this.f15173c.hashCode()) * 1000003) ^ this.f15174d) * 1000003) ^ this.f15175e.hashCode()) * 1000003;
        String str = this.f15176f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f15177g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f15178h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f15179i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        m2 m2Var = this.k;
        int iHashCode5 = (iHashCode4 ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        s1 s1Var = this.f15180l;
        int iHashCode6 = (iHashCode5 ^ (s1Var == null ? 0 : s1Var.hashCode())) * 1000003;
        p1 p1Var = this.f15181m;
        return iHashCode6 ^ (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f15172b + ", gmpAppId=" + this.f15173c + ", platform=" + this.f15174d + ", installationUuid=" + this.f15175e + ", firebaseInstallationId=" + this.f15176f + ", firebaseAuthenticationToken=" + this.f15177g + ", appQualitySessionId=" + this.f15178h + ", buildVersion=" + this.f15179i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.f15180l + ", appExitInfo=" + this.f15181m + "}";
    }
}
