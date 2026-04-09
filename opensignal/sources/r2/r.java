package r2;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f21219a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f21219a == ((r) obj).f21219a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21219a);
    }

    public final String toString() {
        int i10 = this.f21219a;
        return i10 == 1 ? "Linearity.Linear" : i10 == 2 ? "Linearity.FontHinting" : i10 == 3 ? "Linearity.None" : "Invalid";
    }
}
