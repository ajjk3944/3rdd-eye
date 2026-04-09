package p1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f20238a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f20238a == ((a) obj).f20238a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20238a);
    }

    public final String toString() {
        int i10 = this.f20238a;
        return i10 == 1 ? "Touch" : i10 == 2 ? "Keyboard" : "Error";
    }
}
