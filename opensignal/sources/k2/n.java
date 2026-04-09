package k2;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f13996a;

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f13996a == ((n) obj).f13996a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13996a);
    }

    public final String toString() {
        int i10 = this.f13996a;
        return i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid";
    }
}
