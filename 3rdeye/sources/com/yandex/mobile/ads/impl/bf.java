package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    private final zd f25254a;

    /* renamed from: b, reason: collision with root package name */
    private final le f25255b;

    public bf(zd appAdAnalyticsActivator, le appMetricaAdapter) {
        kotlin.jvm.internal.l.f(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        kotlin.jvm.internal.l.f(appMetricaAdapter, "appMetricaAdapter");
        this.f25254a = appAdAnalyticsActivator;
        this.f25255b = appMetricaAdapter;
    }

    public final mp1 a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return this.f25255b.a(context, ba.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93", this.f25254a);
    }
}
