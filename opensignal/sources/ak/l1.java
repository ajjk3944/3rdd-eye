package ak;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f611a;

    /* renamed from: b, reason: collision with root package name */
    public final long f612b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f613c;

    /* renamed from: d, reason: collision with root package name */
    public final int f614d;

    /* renamed from: e, reason: collision with root package name */
    public final int f615e;

    public l1(int i10, long j, boolean z10, int i11, int i12) {
        this.f611a = i10;
        this.f612b = j;
        this.f613c = z10;
        this.f614d = i11;
        this.f615e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f611a == l1Var.f611a && this.f612b == l1Var.f612b && this.f613c == l1Var.f613c && this.f614d == l1Var.f614d && this.f615e == l1Var.f615e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f615e) + c7.a.C(this.f614d, w.g.b(h0.b.b(Integer.hashCode(this.f611a) * 31, 31, this.f612b), this.f613c, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WifiScanConfig(wifiScanCount=");
        sb2.append(this.f611a);
        sb2.append(", wifiScanSameLocationIntervalInMs=");
        sb2.append(this.f612b);
        sb2.append(", isCollectingInformationElementsEnabled=");
        sb2.append(this.f613c);
        sb2.append(", informationElementsCount=");
        sb2.append(this.f614d);
        sb2.append(", informationElementsByteLimit=");
        return c7.a.q(sb2, this.f615e, ')');
    }
}
