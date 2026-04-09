package com.bytedance.adsdk.emc.ypw.bw.emc;

/* loaded from: classes.dex */
public class dg {
    private static Object emc(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i10 < number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i10) < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i10) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i10) < number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object emc(long j10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j10 < ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j10 < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j10) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j10) < number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object emc(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f10 < ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f10 < ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f10 < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f10) < number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object emc(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d10 < ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d10 < ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d10 < ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d10 < number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
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
                    throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
        }
        return emc(((Number) obj).intValue(), number);
    }
}
