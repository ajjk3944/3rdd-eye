package io.appmetrica.analytics.coreutils.internal.system;

import android.annotation.SuppressLint;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class SystemPropertiesHelper {
    public static final SystemPropertiesHelper INSTANCE = new SystemPropertiesHelper();

    private SystemPropertiesHelper() {
    }

    @SuppressLint({"PrivateApi"})
    public static final String readSystemProperty(String str) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties", true, Context.class.getClassLoader());
            Object objInvoke = cls.getMethod("get", String.class).invoke(cls, str);
            String str2 = objInvoke instanceof String ? (String) objInvoke : null;
            return str2 == null ? "" : str2;
        } catch (Exception unused) {
            return "";
        }
    }
}
