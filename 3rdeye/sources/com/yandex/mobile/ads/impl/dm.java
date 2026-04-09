package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class dm {

    /* renamed from: a, reason: collision with root package name */
    private static Method f26251a;

    public static IBinder a(Bundle bundle, String str) throws NoSuchMethodException, SecurityException {
        if (s82.f32899a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f26251a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f26251a = method2;
                method2.setAccessible(true);
                method = f26251a;
            } catch (NoSuchMethodException e4) {
                rs0.a("Failed to retrieve getIBinder method", (Exception) e4);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
            rs0.a("Failed to invoke getIBinder via reflection", e10);
            return null;
        }
    }
}
