package r2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f21196a;

    public static String a(int i10) {
        return i10 == 1 ? "Hyphens.None" : i10 == 2 ? "Hyphens.Auto" : i10 == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f21196a == ((d) obj).f21196a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21196a);
    }

    public final String toString() {
        return a(this.f21196a);
    }
}
