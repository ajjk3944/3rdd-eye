package ut;

import br.l;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.y3;

/* loaded from: classes.dex */
public final class f implements e, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f23700a;

    public /* synthetic */ f(long j) {
        this.f23700a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jQ;
        f fVar = (f) obj;
        l.e(fVar, "other");
        long j = fVar.f23700a;
        int i10 = d.f23699b;
        c cVar = c.NANOSECONDS;
        l.e(cVar, "unit");
        long j7 = (j - 1) | 1;
        long j10 = this.f23700a;
        if (j7 == Long.MAX_VALUE) {
            if (j10 == j) {
                int i11 = a.f23695r;
                jQ = 0;
            } else {
                jQ = a.i(j < 0 ? a.f23694g : a.f23693d);
            }
        } else if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            jQ = j10 < 0 ? a.f23694g : a.f23693d;
        } else {
            long j11 = j10 - j;
            if (((j11 ^ j10) & (~(j11 ^ j))) < 0) {
                c cVar2 = c.MILLISECONDS;
                if (cVar.compareTo(cVar2) < 0) {
                    long jM = b4.m(1L, cVar2, cVar);
                    long j12 = (j10 / jM) - (j / jM);
                    long j13 = (j10 % jM) - (j % jM);
                    int i12 = a.f23695r;
                    jQ = a.g(y3.Q(j12, cVar2), y3.Q(j13, cVar));
                } else {
                    jQ = a.i(j11 < 0 ? a.f23694g : a.f23693d);
                }
            } else {
                jQ = y3.Q(j11, cVar);
            }
        }
        return a.c(jQ, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f23700a == ((f) obj).f23700a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23700a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f23700a + ')';
    }
}
