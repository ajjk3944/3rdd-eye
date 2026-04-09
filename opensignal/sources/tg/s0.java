package tg;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f22843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22844b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22845c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22846d;

    /* renamed from: e, reason: collision with root package name */
    public final k f22847e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22848f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22849g;

    public s0(String str, String str2, int i10, long j, k kVar, String str3, String str4) {
        br.l.e(str, "sessionId");
        br.l.e(str2, "firstSessionId");
        br.l.e(str4, "firebaseAuthenticationToken");
        this.f22843a = str;
        this.f22844b = str2;
        this.f22845c = i10;
        this.f22846d = j;
        this.f22847e = kVar;
        this.f22848f = str3;
        this.f22849g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return br.l.a(this.f22843a, s0Var.f22843a) && br.l.a(this.f22844b, s0Var.f22844b) && this.f22845c == s0Var.f22845c && this.f22846d == s0Var.f22846d && br.l.a(this.f22847e, s0Var.f22847e) && br.l.a(this.f22848f, s0Var.f22848f) && br.l.a(this.f22849g, s0Var.f22849g);
    }

    public final int hashCode() {
        return this.f22849g.hashCode() + c7.a.g(this.f22848f, (this.f22847e.hashCode() + h0.b.b(c7.a.C(this.f22845c, c7.a.g(this.f22844b, this.f22843a.hashCode() * 31, 31), 31), 31, this.f22846d)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f22843a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f22844b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f22845c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f22846d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f22847e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f22848f);
        sb2.append(", firebaseAuthenticationToken=");
        return h0.b.r(sb2, this.f22849g, ')');
    }
}
