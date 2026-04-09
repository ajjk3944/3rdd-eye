package com.bytedance.adsdk.ouw.vt.fkw.ouw;

import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    private static boolean ouw(int i4, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i4 == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i4) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i4) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i4) == number.doubleValue();
        }
        throw new UnsupportedOperationException(h.r(number, "This type of addition operation is not supported"));
    }

    private static boolean ouw(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j) == number.doubleValue();
        }
        throw new UnsupportedOperationException(h.r(number, "This type of addition operation is not supported"));
    }

    private static boolean ouw(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f10 == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f10 == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f10 == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(h.r(number, "This type of addition operation is not supported"));
    }

    private static boolean ouw(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d10 == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d10 == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d10 == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d10 == number.doubleValue();
        }
        throw new UnsupportedOperationException(h.r(number, "This type of addition operation is not supported"));
    }

    public static boolean ouw(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return ouw(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return ouw(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return ouw(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(h.r(number, "This type of addition operation is not supported"));
        }
        return ouw(number.intValue(), number2);
    }
}
