package t9;

import kotlin.jvm.internal.p;
import kotlin.time.DurationUnit;

/* loaded from: classes4.dex */
public abstract class e {
    public static final double a(double d10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        p.e(sourceUnit, "sourceUnit");
        p.e(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit().convert(1L, sourceUnit.getTimeUnit());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.getTimeUnit().convert(1L, targetUnit.getTimeUnit());
    }

    public static final long b(long j10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        p.e(sourceUnit, "sourceUnit");
        p.e(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j10, sourceUnit.getTimeUnit());
    }

    public static final long c(long j10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        p.e(sourceUnit, "sourceUnit");
        p.e(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j10, sourceUnit.getTimeUnit());
    }
}
