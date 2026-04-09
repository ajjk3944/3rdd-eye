package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d10, double d11) {
        return (Double.isInfinite(d10) || Double.isNaN(d10)) ? d11 : d10;
    }

    public static long getMillisOrDefault(Long l5, TimeUnit timeUnit, long j4) {
        return l5 == null ? j4 : timeUnit.toMillis(l5.longValue());
    }

    public static <T> T getOrDefault(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static String getOrDefaultIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> T getOrDefaultNullable(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static String getOrDefaultNullableIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> String wrapToTag(T t10) {
        return t10 == null ? "<null>" : t10.toString().isEmpty() ? "<empty>" : t10.toString();
    }
}
