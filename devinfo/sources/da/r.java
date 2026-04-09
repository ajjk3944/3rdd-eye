package da;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f22154a;

    public r(q qVar) {
        this.f22154a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return this.f22154a.equals(((r) ((d0) obj)).f22154a);
    }

    public final int hashCode() {
        return this.f22154a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f22154a + "}";
    }
}
