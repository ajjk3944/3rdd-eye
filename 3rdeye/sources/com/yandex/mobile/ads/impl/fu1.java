package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;

/* loaded from: classes3.dex */
public final class fu1 implements tu1 {

    /* renamed from: a, reason: collision with root package name */
    private final af f27464a;

    public fu1(af appMetricaPolicyConfigurator) {
        kotlin.jvm.internal.l.f(appMetricaPolicyConfigurator, "appMetricaPolicyConfigurator");
        this.f27464a = appMetricaPolicyConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.tu1
    public final void a(Context context, du1 sdkConfiguration) {
        Object objA;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkConfiguration, "sdkConfiguration");
        dd configuration = this.f27464a.a(context);
        yc.f35705a.getClass();
        kotlin.jvm.internal.l.f(configuration, "configuration");
        try {
            AppMetricaLibraryAdapter.setAdvIdentifiersTracking(configuration.a());
            objA = C1992A.f18074a;
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            fp0.b(new Object[0]);
        }
    }
}
