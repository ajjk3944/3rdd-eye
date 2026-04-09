package k2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f13997a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f13997a == ((o) obj).f13997a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13997a);
    }

    public final String toString() {
        int i10 = this.f13997a;
        return i10 == 0 ? "None" : i10 == 1 ? "Weight" : i10 == 2 ? "Style" : i10 == 65535 ? "All" : "Invalid";
    }
}
