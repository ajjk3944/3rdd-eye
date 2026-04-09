package ak;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f553a;

    /* renamed from: b, reason: collision with root package name */
    public final long f554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f555c;

    /* renamed from: d, reason: collision with root package name */
    public final int f556d;

    /* renamed from: e, reason: collision with root package name */
    public final String f557e;

    /* renamed from: f, reason: collision with root package name */
    public final String f558f;

    public j(String str, long j, int i10, int i11, String str2, String str3) {
        this.f553a = str;
        this.f554b = j;
        this.f555c = i10;
        this.f556d = i11;
        this.f557e = str2;
        this.f558f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return br.l.a(this.f553a, jVar.f553a) && this.f554b == jVar.f554b && this.f555c == jVar.f555c && this.f556d == jVar.f556d && br.l.a(this.f557e, jVar.f557e) && br.l.a(this.f558f, jVar.f558f);
    }

    public final int hashCode() {
        return this.f558f.hashCode() + c7.a.g(this.f557e, c7.a.C(this.f556d, c7.a.C(this.f555c, h0.b.b(this.f553a.hashCode() * 31, 31, this.f554b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConnectionInfoItem(id=");
        sb2.append(this.f553a);
        sb2.append(", startDate=");
        sb2.append(this.f554b);
        sb2.append(", connectionType=");
        sb2.append(this.f555c);
        sb2.append(", technology=");
        sb2.append(this.f556d);
        sb2.append(", ssid=");
        sb2.append(this.f557e);
        sb2.append(", accessPoint=");
        return h0.b.r(sb2, this.f558f, ')');
    }
}
