package b9;

/* compiled from: ULong.kt */
/* loaded from: classes3.dex */
public final class v implements Comparable<v> {

    /* renamed from: b, reason: collision with root package name */
    public final long f18104b;

    public /* synthetic */ v(long j4) {
        this.f18104b = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(v vVar) {
        long j4 = vVar.f18104b;
        long j10 = this.f18104b ^ Long.MIN_VALUE;
        long j11 = j4 ^ Long.MIN_VALUE;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f18104b == ((v) obj).f18104b;
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f18104b;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public final String toString() {
        long j4 = this.f18104b;
        if (j4 >= 0) {
            com.google.gson.internal.c.e(10);
            String string = Long.toString(j4, 10);
            kotlin.jvm.internal.l.e(string, "toString(...)");
            return string;
        }
        long j10 = 10;
        long j11 = ((j4 >>> 1) / j10) << 1;
        long j12 = j4 - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        com.google.gson.internal.c.e(10);
        String string2 = Long.toString(j11, 10);
        kotlin.jvm.internal.l.e(string2, "toString(...)");
        com.google.gson.internal.c.e(10);
        String string3 = Long.toString(j12, 10);
        kotlin.jvm.internal.l.e(string3, "toString(...)");
        return string2.concat(string3);
    }
}
