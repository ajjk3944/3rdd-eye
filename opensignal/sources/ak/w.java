package ak;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f751a;

    /* renamed from: b, reason: collision with root package name */
    public final int f752b;

    /* renamed from: c, reason: collision with root package name */
    public final String f753c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f754d;

    /* renamed from: e, reason: collision with root package name */
    public final int f755e;

    public w(int i10, int i11, String str, boolean z10, int i12) {
        this.f751a = i10;
        this.f752b = i11;
        this.f753c = str;
        this.f754d = z10;
        this.f755e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f751a == wVar.f751a && this.f752b == wVar.f752b && br.l.a(this.f753c, wVar.f753c) && this.f754d == wVar.f754d && this.f755e == wVar.f755e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f755e) + w.g.b(c7.a.g(this.f753c, c7.a.C(this.f752b, Integer.hashCode(this.f751a) * 31, 31), 31), this.f754d, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpHeadLatencyEndpoint(endpointType=");
        sb2.append(this.f751a);
        sb2.append(", connectionTimeoutMs=");
        sb2.append(this.f752b);
        sb2.append(", url=");
        sb2.append(this.f753c);
        sb2.append(", followRedirect=");
        sb2.append(this.f754d);
        sb2.append(", testTimeoutMs=");
        return c7.a.q(sb2, this.f755e, ')');
    }
}
