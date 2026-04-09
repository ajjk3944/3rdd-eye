package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    private final zv f24942a;

    public aw(Context context, C4072a3 adConfiguration, jp1 debugParams) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(debugParams, "debugParams");
        adConfiguration.q().f();
        this.f24942a = new zv(gd.a(context, wm2.f35021a, adConfiguration.q().b()), debugParams);
    }

    public final zv a() {
        return this.f24942a;
    }
}
