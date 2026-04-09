package io.appmetrica.analytics.coreutils.internal.system;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* loaded from: classes3.dex */
public final class SystemServiceUtils {
    public static final SystemServiceUtils INSTANCE = new SystemServiceUtils();

    private SystemServiceUtils() {
    }

    public static final <T, S> S accessSystemServiceByNameSafely(Context context, String str, String str2, String str3, FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafely(context.getSystemService(str), str2, str3, functionWithThrowable);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceByNameSafelyOrDefault(Context context, String str, String str2, String str3, S s10, FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafelyOrDefault(context.getSystemService(str), str2, str3, s10, functionWithThrowable);
        } catch (Throwable unused) {
            return s10;
        }
    }

    public static final <T, S> S accessSystemServiceSafely(T t10, String str, String str2, FunctionWithThrowable<T, S> functionWithThrowable) {
        if (t10 == null) {
            return null;
        }
        try {
            return functionWithThrowable.apply(t10);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceSafelyOrDefault(T t10, String str, String str2, S s10, FunctionWithThrowable<T, S> functionWithThrowable) {
        S s11 = (S) accessSystemServiceSafely(t10, str, str2, functionWithThrowable);
        return s11 == null ? s10 : s11;
    }
}
