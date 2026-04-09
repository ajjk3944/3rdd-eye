package l9;

/* loaded from: classes.dex */
public final class v extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f15064a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f15065b;

    public v(h0 h0Var, g0 g0Var) {
        this.f15064a = h0Var;
        this.f15065b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f15064a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f15064a) : ((v) i0Var).f15064a == null) {
                g0 g0Var = this.f15065b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f15065b) : ((v) i0Var).f15065b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        h0 h0Var = this.f15064a;
        int iHashCode = ((h0Var == null ? 0 : h0Var.hashCode()) ^ 1000003) * 1000003;
        g0 g0Var = this.f15065b;
        return (g0Var != null ? g0Var.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f15064a + ", mobileSubtype=" + this.f15065b + "}";
    }
}
