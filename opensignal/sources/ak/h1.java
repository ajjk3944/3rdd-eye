package ak;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f543a;

    /* renamed from: b, reason: collision with root package name */
    public final int f544b;

    /* renamed from: c, reason: collision with root package name */
    public final int f545c;

    public h1(int i10, int i11, int i12) {
        this.f543a = i10;
        this.f544b = i11;
        this.f545c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f543a == h1Var.f543a && this.f544b == h1Var.f544b && this.f545c == h1Var.f545c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f545c) + c7.a.C(this.f544b, Integer.hashCode(this.f543a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UdpVerificationConfig(schemaVersion=");
        sb2.append(this.f543a);
        sb2.append(", numberOfProbes=");
        sb2.append(this.f544b);
        sb2.append(", targetSendRateKbps=");
        return c7.a.q(sb2, this.f545c, ')');
    }
}
