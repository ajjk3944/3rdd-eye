package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ng1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30864a;

    public ng1(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f30864a = applicationContext;
    }

    public final boolean a() {
        try {
            return this.f30864a.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean b() {
        try {
            return this.f30864a.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
