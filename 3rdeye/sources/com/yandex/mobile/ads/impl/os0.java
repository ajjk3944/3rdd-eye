package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class os0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f31494a;

    /* renamed from: b, reason: collision with root package name */
    private final do1 f31495b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f31496c;

    public /* synthetic */ os0(Context context, String str) {
        this(context, str, new do1());
    }

    public final be0 a() {
        Class<?> cls;
        do1 do1Var = this.f31495b;
        String className = this.f31494a;
        do1Var.getClass();
        kotlin.jvm.internal.l.f(className, "className");
        try {
            cls = Class.forName(className);
        } catch (Throwable unused) {
            fp0.c(className);
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        do1 do1Var2 = this.f31495b;
        Object[] objArr = {this.f31496c};
        do1Var2.getClass();
        Object objA = do1.a(cls, "getFusedLocationProviderClient", objArr);
        if (objA != null) {
            return new be0(objA);
        }
        return null;
    }

    public os0(Context context, String locationServicesClassName, do1 reflectHelper) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(locationServicesClassName, "locationServicesClassName");
        kotlin.jvm.internal.l.f(reflectHelper, "reflectHelper");
        this.f31494a = locationServicesClassName;
        this.f31495b = reflectHelper;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f31496c = applicationContext;
    }
}
