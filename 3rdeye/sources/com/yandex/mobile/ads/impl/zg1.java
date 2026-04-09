package com.yandex.mobile.ads.impl;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes3.dex */
public final class zg1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36493a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zg1(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, applicationContext);
    }

    public final xg1 a() {
        Object systemService = this.f36493a.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Boolean boolValueOf = powerManager != null ? Boolean.valueOf(powerManager.isInteractive()) : null;
        if (boolValueOf != null && !boolValueOf.booleanValue()) {
            return xg1.f35302c;
        }
        Object systemService2 = this.f36493a.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        return (keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? xg1.f35303d : xg1.f35301b;
    }

    public zg1(Context context, Context appContext) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(appContext, "appContext");
        this.f36493a = appContext;
    }
}
