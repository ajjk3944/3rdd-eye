package com.bytedance.adsdk.ouw.vt.vt.ouw;

import d.h;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class mwh extends zih {
    public mwh() {
        super(com.bytedance.adsdk.ouw.vt.yu.lh.MULTI);
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        Object objOuw;
        Object objOuw2 = this.ouw.ouw(map);
        if (objOuw2 == null || (objOuw = this.vt.ouw(map)) == null) {
            return null;
        }
        Number number = (Number) objOuw2;
        Number number2 = (Number) objOuw;
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            int iIntValue = number.intValue();
            if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
                return Integer.valueOf(number2.intValue() * iIntValue);
            }
            if (number2 instanceof Long) {
                return Long.valueOf(number2.longValue() * iIntValue);
            }
            if (number2 instanceof Float) {
                return Float.valueOf(number2.floatValue() * iIntValue);
            }
            if (number2 instanceof Double) {
                return Double.valueOf(number2.doubleValue() * iIntValue);
            }
            throw new UnsupportedOperationException(h.r(number2, "This type of addition operation is not supported"));
        }
        if (number instanceof Long) {
            long jLongValue = number.longValue();
            if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
                return Long.valueOf(jLongValue * number2.intValue());
            }
            if (number2 instanceof Long) {
                return Long.valueOf(number2.longValue() * jLongValue);
            }
            if (number2 instanceof Float) {
                return Float.valueOf(number2.floatValue() * jLongValue);
            }
            if (number2 instanceof Double) {
                return Double.valueOf(number2.doubleValue() * jLongValue);
            }
            throw new UnsupportedOperationException(h.r(number2, "This type of addition operation is not supported"));
        }
        if (number instanceof Float) {
            float fFloatValue = number.floatValue();
            if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
                return Float.valueOf(fFloatValue * number2.intValue());
            }
            if (number2 instanceof Long) {
                return Float.valueOf(fFloatValue * number2.longValue());
            }
            if (number2 instanceof Float) {
                return Float.valueOf(number2.floatValue() * fFloatValue);
            }
            if (number2 instanceof Double) {
                return Double.valueOf(number2.doubleValue() * fFloatValue);
            }
            throw new UnsupportedOperationException(h.r(number2, "This type of addition operation is not supported"));
        }
        if (!(number instanceof Double)) {
            throw new UnsupportedOperationException(h.r(number, "This type of addition operation is not supported"));
        }
        double dDoubleValue = number.doubleValue();
        if ((number2 instanceof Integer) || (number2 instanceof Short) || (number2 instanceof Byte)) {
            return Double.valueOf(dDoubleValue * number2.intValue());
        }
        if (number2 instanceof Long) {
            return Double.valueOf(dDoubleValue * number2.longValue());
        }
        if (number2 instanceof Float) {
            return Double.valueOf(dDoubleValue * number2.floatValue());
        }
        if (number2 instanceof Double) {
            return Double.valueOf(number2.doubleValue() * dDoubleValue);
        }
        throw new UnsupportedOperationException(h.r(number2, "This type of addition operation is not supported"));
    }
}
