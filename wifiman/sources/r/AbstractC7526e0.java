package r;

/* renamed from: r.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7526e0 {
    public static final long a(double d10, double d11, double d12, double d13, double d14) {
        double dSqrt = 2.0d * d11 * Math.sqrt(d10);
        double d15 = (dSqrt * dSqrt) - (4.0d * d10);
        double d16 = -dSqrt;
        C7546v c7546vA = AbstractC7547w.a(d15);
        c7546vA.f59918a += d16;
        c7546vA.f59918a *= 0.5d;
        c7546vA.f59919b *= 0.5d;
        C7546v c7546vA2 = AbstractC7547w.a(d15);
        double d17 = -1;
        c7546vA2.f59918a *= d17;
        c7546vA2.f59919b *= d17;
        c7546vA2.f59918a += d16;
        c7546vA2.f59918a *= 0.5d;
        c7546vA2.f59919b *= 0.5d;
        return d(c7546vA, c7546vA2, d11, d12, d13, d14);
    }

    public static final long b(float f10, float f11, float f12, float f13, float f14) {
        if (f11 == 0.0f) {
            return 9223372036854L;
        }
        return a(f10, f11, f12, f13, f14);
    }

    private static final double c(C7546v c7546v, double d10, double d11, double d12) {
        double d13 = d12;
        double dF = c7546v.f();
        double d14 = dF * d10;
        double d15 = d11 - d14;
        double dLog = Math.log(Math.abs(d13 / d10)) / dF;
        double dLog2 = Math.log(Math.abs(d13 / d15));
        double dLog3 = dLog2;
        for (int i10 = 0; i10 < 6; i10++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / dF));
        }
        double d16 = dLog3 / dF;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            dLog = d16;
        } else if ((Double.isInfinite(d16) || Double.isNaN(d16)) ? false : true) {
            dLog = Math.max(dLog, d16);
        }
        double d17 = (-(d14 + d15)) / (dF * d15);
        double d18 = dF * d17;
        double dExp = (Math.exp(d18) * d10) + (d15 * d17 * Math.exp(d18));
        if (Double.isNaN(d17) || d17 <= 0.0d) {
            d13 = -d13;
        } else if (d17 <= 0.0d || (-dExp) >= d13) {
            dLog = (-(2.0d / dF)) - (d10 / d15);
        } else {
            if (d15 < 0.0d && d10 > 0.0d) {
                dLog = 0.0d;
            }
            d13 = -d13;
        }
        double dAbs = Double.MAX_VALUE;
        int i11 = 0;
        while (dAbs > 0.001d && i11 < 100) {
            i11++;
            double d19 = dF * dLog;
            double d20 = d13;
            double dExp2 = dLog - ((((d10 + (d15 * dLog)) * Math.exp(d19)) + d13) / ((((1 + d19) * d15) + d14) * Math.exp(d19)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d13 = d20;
        }
        return dLog;
    }

    private static final long d(C7546v c7546v, C7546v c7546v2, double d10, double d11, double d12, double d13) {
        double d14 = d11;
        if (d12 == 0.0d && d14 == 0.0d) {
            return 0L;
        }
        if (d12 < 0.0d) {
            d14 = -d14;
        }
        double dAbs = Math.abs(d12);
        return (long) ((d10 > 1.0d ? e(c7546v, c7546v2, dAbs, d14, d13) : d10 < 1.0d ? g(c7546v, dAbs, d14, d13) : c(c7546v, dAbs, d14, d13)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final double e(r.C7546v r29, r.C7546v r30, double r31, double r33, double r35) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.AbstractC7526e0.e(r.v, r.v, double, double, double):double");
    }

    private static final double f(double d10, double d11, double d12, double d13, double d14) {
        return (d10 * Math.exp(d11 * d12)) + (d13 * Math.exp(d14 * d12));
    }

    private static final double g(C7546v c7546v, double d10, double d11, double d12) {
        double dF = c7546v.f();
        double dE = (d11 - (dF * d10)) / c7546v.e();
        return Math.log(d12 / Math.sqrt((d10 * d10) + (dE * dE))) / dF;
    }
}
