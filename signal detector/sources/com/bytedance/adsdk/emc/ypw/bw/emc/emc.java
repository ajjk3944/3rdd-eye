package com.bytedance.adsdk.emc.ypw.bw.emc;

import A.f;

/* loaded from: classes.dex */
public class emc {
    private static Object emc(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(i / number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(i / number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(i / number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(i / number.doubleValue());
        }
        throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
    }

    private static Object emc(long j6, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j6 / number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(j6 / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j6 / number.doubleValue());
            }
            throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
        }
        return Long.valueOf(j6 / number.intValue());
    }

    private static Object emc(float f2, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f2 / number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(f2 / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(f2 / number.doubleValue());
            }
            throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
        }
        return Float.valueOf(f2 / number.intValue());
    }

    private static Object emc(double d6, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d6 / number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d6 / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(d6 / number.doubleValue());
            }
            throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
        }
        return Double.valueOf(d6 / number.intValue());
    }

    public static Object emc(Number number, Number number2) {
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
