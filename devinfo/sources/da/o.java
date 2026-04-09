package da;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f22150a;

    public o(r rVar) {
        z zVar = z.f22174a;
        this.f22150a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        if (!this.f22150a.equals(((o) ((a0) obj)).f22150a)) {
            return false;
        }
        Object obj2 = z.f22174a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f22150a.hashCode() ^ 1000003) * 1000003) ^ z.f22174a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f22150a + ", productIdOrigin=" + z.f22174a + "}";
    }
}
