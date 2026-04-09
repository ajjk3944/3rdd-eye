package com.bytedance.adsdk.emc.ypw.bw.emc;

import A.f;

/* loaded from: classes.dex */
public class ypw {
    private static boolean emc(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i) == number.doubleValue();
        }
        throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
    }

    private static boolean emc(long j6, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j6 == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j6 == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j6) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j6) == number.doubleValue();
        }
        throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
    }

    private static boolean emc(float f2, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f2 == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f2 == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f2 == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f2) == number.doubleValue();
        }
        throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
    }

    private static boolean emc(double d6, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d6 == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d6 == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d6 == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d6 == number.doubleValue();
        }
        throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
    }

    public static boolean emc(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return emc(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return emc(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return emc(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
        }
        return emc(number.intValue(), number2);
    }
}
