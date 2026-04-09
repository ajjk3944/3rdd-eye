package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.UserManager;
import b9.m;

/* loaded from: classes3.dex */
public final class qx1 {
    public static SharedPreferences a(qx1 qx1Var, Context context, String prefName) {
        Object objA;
        qx1Var.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(prefName, "prefName");
        try {
            Object systemService = context.getSystemService("user");
            kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.os.UserManager");
            objA = Boolean.valueOf(((UserManager) systemService).isUserUnlocked());
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        Object obj = Boolean.TRUE;
        if (objA instanceof m.a) {
            objA = obj;
        }
        if (((Boolean) objA).booleanValue() || Build.VERSION.SDK_INT < 24) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(prefName, 0);
            kotlin.jvm.internal.l.c(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.createDeviceProtectedStorageContext().getSharedPreferences(prefName, 0);
        kotlin.jvm.internal.l.c(sharedPreferences2);
        return sharedPreferences2;
    }
}
