package lq;

import com.google.android.gms.internal.measurement.b4;

/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f15587a;

    public /* synthetic */ w(long j) {
        this.f15587a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return br.l.h(this.f15587a ^ Long.MIN_VALUE, ((w) obj).f15587a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f15587a == ((w) obj).f15587a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15587a);
    }

    public final String toString() {
        long j = this.f15587a;
        if (j >= 0) {
            b4.g(10);
            String string = Long.toString(j, 10);
            br.l.d(string, "toString(...)");
            return string;
        }
        long j7 = 10;
        long j10 = ((j >>> 1) / j7) << 1;
        long j11 = j - (j10 * j7);
        if (j11 >= j7) {
            j11 -= j7;
            j10++;
        }
        b4.g(10);
        String string2 = Long.toString(j10, 10);
        br.l.d(string2, "toString(...)");
        b4.g(10);
        String string3 = Long.toString(j11, 10);
        br.l.d(string3, "toString(...)");
        return string2.concat(string3);
    }
}
