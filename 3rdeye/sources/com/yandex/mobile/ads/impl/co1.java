package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class co1 {

    /* renamed from: a, reason: collision with root package name */
    private final g10 f25731a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f25732b;

    public /* synthetic */ co1(Context context) {
        this(context, new g10());
    }

    public final tv0 a() {
        return f10.f27168d == this.f25731a.a(this.f25732b) ? new tv0(1920, 1080, 6800) : new tv0(854, 480, 1000);
    }

    public co1(Context context, g10 deviceTypeProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(deviceTypeProvider, "deviceTypeProvider");
        this.f25731a = deviceTypeProvider;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f25732b = applicationContext;
    }
}
