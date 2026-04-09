package ak;

/* loaded from: classes.dex */
public final class z0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f801a;

    /* renamed from: b, reason: collision with root package name */
    public final long f802b;

    /* renamed from: c, reason: collision with root package name */
    public final long f803c;

    /* renamed from: d, reason: collision with root package name */
    public final yh.l f804d;

    /* renamed from: e, reason: collision with root package name */
    public final int f805e;

    public z0(String str, long j, long j7, yh.l lVar, int i10) {
        br.l.e(lVar, "testSize");
        this.f801a = str;
        this.f802b = j;
        this.f803c = j7;
        this.f804d = lVar;
        this.f805e = i10;
    }

    @Override // ak.h0
    public final int a() {
        return this.f805e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return br.l.a(this.f801a, z0Var.f801a) && this.f802b == z0Var.f802b && this.f803c == z0Var.f803c && this.f804d == z0Var.f804d && this.f805e == z0Var.f805e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f805e) + ((this.f804d.hashCode() + h0.b.b(h0.b.b(this.f801a.hashCode() * 31, 31, this.f802b), 31, this.f803c)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThroughputDownloadTestConfig(downloadUrl=");
        sb2.append(this.f801a);
        sb2.append(", downloadTimeoutMs=");
        sb2.append(this.f802b);
        sb2.append(", downloadMonitorCollectionRateMs=");
        sb2.append(this.f803c);
        sb2.append(", testSize=");
        sb2.append(this.f804d);
        sb2.append(", probability=");
        return c7.a.q(sb2, this.f805e, ')');
    }
}
