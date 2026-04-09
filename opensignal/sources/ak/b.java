package ak;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f427a;

    /* renamed from: b, reason: collision with root package name */
    public final String f428b;

    /* renamed from: c, reason: collision with root package name */
    public final String f429c;

    /* renamed from: d, reason: collision with root package name */
    public final String f430d;

    /* renamed from: e, reason: collision with root package name */
    public final String f431e;

    /* renamed from: f, reason: collision with root package name */
    public final String f432f;

    /* renamed from: g, reason: collision with root package name */
    public final String f433g;

    /* renamed from: h, reason: collision with root package name */
    public final String f434h;

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f427a = str;
        this.f428b = str2;
        this.f429c = str3;
        this.f430d = str4;
        this.f431e = str5;
        this.f432f = str6;
        this.f433g = str7;
        this.f434h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return br.l.a(this.f427a, bVar.f427a) && br.l.a(this.f428b, bVar.f428b) && br.l.a(this.f429c, bVar.f429c) && br.l.a(this.f430d, bVar.f430d) && br.l.a(this.f431e, bVar.f431e) && br.l.a(this.f432f, bVar.f432f) && br.l.a(this.f433g, bVar.f433g) && br.l.a(this.f434h, bVar.f434h);
    }

    public final int hashCode() {
        return this.f434h.hashCode() + c7.a.g(this.f433g, c7.a.g(this.f432f, c7.a.g(this.f431e, c7.a.g(this.f430d, c7.a.g(this.f429c, c7.a.g(this.f428b, this.f427a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiSecret(hmac=");
        sb2.append(this.f427a);
        sb2.append(", id=");
        sb2.append(this.f428b);
        sb2.append(", secret=");
        sb2.append(this.f429c);
        sb2.append(", code=");
        sb2.append(this.f430d);
        sb2.append(", sentryUrl=");
        sb2.append(this.f431e);
        sb2.append(", tutelaApiKey=");
        sb2.append(this.f432f);
        sb2.append(", apiEndpoint=");
        sb2.append(this.f433g);
        sb2.append(", dataEndpoint=");
        return h0.b.r(sb2, this.f434h, ')');
    }
}
