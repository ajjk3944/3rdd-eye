package ak;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f508a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f509b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f510c;

    public e0(long j, boolean z10, boolean z11) {
        this.f508a = j;
        this.f509b = z10;
        this.f510c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f508a == e0Var.f508a && this.f509b == e0Var.f509b && this.f510c == e0Var.f510c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f510c) + w.g.b(Long.hashCode(this.f508a) * 31, this.f509b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkRestrictionsConfig(checkAfterMs=");
        sb2.append(this.f508a);
        sb2.append(", checkDetailedStateConnected=");
        sb2.append(this.f509b);
        sb2.append(", checkResponseCode=");
        return c7.a.r(sb2, this.f510c, ')');
    }
}
