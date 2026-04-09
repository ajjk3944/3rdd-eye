package com.bytedance.adsdk.emc.ypw.bw.emc;

/* loaded from: classes.dex */
public class msw {
    private static Object emc(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(i10 + number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(i10 + number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(i10 + number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(i10 + number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object emc(long j10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j10 + number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(j10 + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j10 + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Long.valueOf(j10 + number.intValue());
    }

    private static Object emc(float f10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f10 + number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(f10 + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(f10 + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Float.valueOf(f10 + number.intValue());
    }

    private static Object emc(double d10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d10 + number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d10 + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(d10 + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Double.valueOf(d10 + number.intValue());
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
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return emc(number.intValue(), number2);
    }
}
