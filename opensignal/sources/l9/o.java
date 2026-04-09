package l9;

/* loaded from: classes.dex */
public final class o extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f15041a;

    /* renamed from: b, reason: collision with root package name */
    public final z f15042b;

    public o(r rVar, z zVar) {
        this.f15041a = rVar;
        this.f15042b = zVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!this.f15041a.equals(((o) a0Var).f15041a)) {
            return false;
        }
        z zVar = this.f15042b;
        return zVar == null ? ((o) a0Var).f15042b == null : zVar.equals(((o) a0Var).f15042b);
    }

    public final int hashCode() {
        int iHashCode = (this.f15041a.hashCode() ^ 1000003) * 1000003;
        z zVar = this.f15042b;
        return iHashCode ^ (zVar == null ? 0 : zVar.hashCode());
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f15041a + ", productIdOrigin=" + this.f15042b + "}";
    }
}
