package da;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f22170a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f22171b;

    public v(h0 h0Var, g0 g0Var) {
        this.f22170a = h0Var;
        this.f22171b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f22170a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f22170a) : ((v) i0Var).f22170a == null) {
                g0 g0Var = this.f22171b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f22171b) : ((v) i0Var).f22171b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        h0 h0Var = this.f22170a;
        int iHashCode = ((h0Var == null ? 0 : h0Var.hashCode()) ^ 1000003) * 1000003;
        g0 g0Var = this.f22171b;
        return (g0Var != null ? g0Var.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f22170a + ", mobileSubtype=" + this.f22171b + "}";
    }
}
