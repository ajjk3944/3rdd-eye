package ak;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f790a;

    /* renamed from: b, reason: collision with root package name */
    public final String f791b;

    /* renamed from: c, reason: collision with root package name */
    public final String f792c;

    /* renamed from: d, reason: collision with root package name */
    public final String f793d;

    /* renamed from: e, reason: collision with root package name */
    public final String f794e;

    public y(String str, String str2, String str3, String str4, String str5) {
        br.l.e(str, "url");
        br.l.e(str2, "key");
        br.l.e(str3, "clientName");
        br.l.e(str4, "clientVersion");
        br.l.e(str5, "userAgent");
        this.f790a = str;
        this.f791b = str2;
        this.f792c = str3;
        this.f793d = str4;
        this.f794e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return br.l.a(this.f790a, yVar.f790a) && br.l.a(this.f791b, yVar.f791b) && br.l.a(this.f792c, yVar.f792c) && br.l.a(this.f793d, yVar.f793d) && br.l.a(this.f794e, yVar.f794e);
    }

    public final int hashCode() {
        return this.f794e.hashCode() + c7.a.g(this.f793d, c7.a.g(this.f792c, c7.a.g(this.f791b, this.f790a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InnerTubeConfig(url=");
        sb2.append(this.f790a);
        sb2.append(", key=");
        sb2.append(this.f791b);
        sb2.append(", clientName=");
        sb2.append(this.f792c);
        sb2.append(", clientVersion=");
        sb2.append(this.f793d);
        sb2.append(", userAgent=");
        return h0.b.r(sb2, this.f794e, ')');
    }
}
