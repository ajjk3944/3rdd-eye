package com.bytedance.adsdk.emc.ypw.bw.emc;

import A.f;

/* loaded from: classes.dex */
public class xq {
    private static Object emc(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i > number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i) > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i) > number.doubleValue());
        }
        throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
    }

    private static Object emc(long j6, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j6 > ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j6 > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j6) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j6) > number.doubleValue());
        }
        throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
    }

    private static Object emc(float f2, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f2 > ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f2 > ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f2 > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f2) > number.doubleValue());
        }
        throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
    }

    private static Object emc(double d6, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d6 > ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d6 > ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d6 > ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d6 > number.doubleValue());
        }
        throw new UnsupportedOperationException(f.k(number, "This type of addition operation is not supported"));
    }

    public static Object emc(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return emc(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return emc(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return emc(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return emc(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
        }
        return emc(((Number) obj).intValue(), number);
    }
}
