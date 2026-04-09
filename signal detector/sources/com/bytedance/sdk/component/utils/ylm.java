package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ylm {
    private static String emc;

    public static boolean emc(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), ypw(context));
    }

    public static String ypw(Context context) {
        if (!TextUtils.isEmpty(emc)) {
            return emc;
        }
        String strEmc = emc();
        emc = strEmc;
        if (!TextUtils.isEmpty(strEmc)) {
            return emc;
        }
        String strYpw = ypw();
        emc = strYpw;
        return !TextUtils.isEmpty(strYpw) ? emc : emc;
    }

    private static String emc() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String ypw() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
