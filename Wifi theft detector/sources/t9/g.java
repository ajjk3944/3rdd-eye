package t9;

import kotlin.jvm.internal.p;
import kotlin.time.DurationUnit;
import t9.b;

/* loaded from: classes4.dex */
public abstract class g {
    public static final long a(long j10) {
        return j10 < 0 ? b.f24466b.b() : b.f24466b.a();
    }

    public static final long b(long j10, long j11, DurationUnit unit) {
        p.e(unit, "unit");
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? b.K(a(j11)) : c(j10, j11, unit);
    }

    public static final long c(long j10, long j11, DurationUnit durationUnit) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return d.t(j12, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.f22190c;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return b.K(a(j12));
        }
        long jB = e.b(1L, durationUnit2, durationUnit);
        long j13 = (j10 / jB) - (j11 / jB);
        long j14 = (j10 % jB) - (j11 % jB);
        b.a aVar = b.f24466b;
        return b.F(d.t(j13, durationUnit2), d.t(j14, durationUnit));
    }

    public static final long d(long j10, long j11, DurationUnit unit) {
        p.e(unit, "unit");
        return ((j11 - 1) | 1) == Long.MAX_VALUE ? j10 == j11 ? b.f24466b.c() : b.K(a(j11)) : (1 | (j10 - 1)) == Long.MAX_VALUE ? a(j10) : c(j10, j11, unit);
    }
}
