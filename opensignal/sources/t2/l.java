package t2;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f22396a;

    public static final boolean a(long j, long j7) {
        return j == j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f22396a == ((l) obj).f22396a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22396a);
    }

    public final String toString() {
        long j = this.f22396a;
        return a(j, 0L) ? "Unspecified" : a(j, 4294967296L) ? "Sp" : a(j, 8589934592L) ? "Em" : "Invalid";
    }
}
