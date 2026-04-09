package l9;

/* loaded from: classes.dex */
public final class r extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f15046a;

    public r(q qVar) {
        this.f15046a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return this.f15046a.equals(((r) ((d0) obj)).f15046a);
    }

    public final int hashCode() {
        return this.f15046a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f15046a + "}";
    }
}
