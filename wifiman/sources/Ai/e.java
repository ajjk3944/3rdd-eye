package Ai;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
abstract class e {
    public static final double a(double d10, d sourceUnit, d targetUnit) {
        AbstractC6492s.i(sourceUnit, "sourceUnit");
        AbstractC6492s.i(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit$kotlin_stdlib().convert(1L, sourceUnit.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.getTimeUnit$kotlin_stdlib().convert(1L, targetUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long b(long j10, d sourceUnit, d targetUnit) {
        AbstractC6492s.i(sourceUnit, "sourceUnit");
        AbstractC6492s.i(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j10, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long c(long j10, d sourceUnit, d targetUnit) {
        AbstractC6492s.i(sourceUnit, "sourceUnit");
        AbstractC6492s.i(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j10, sourceUnit.getTimeUnit$kotlin_stdlib());
    }
}
