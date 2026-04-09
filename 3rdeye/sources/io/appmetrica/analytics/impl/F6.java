package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes3.dex */
public final class F6 {

    /* renamed from: a, reason: collision with root package name */
    public final Gi f39411a;

    /* renamed from: b, reason: collision with root package name */
    public final Qh f39412b;

    public F6(Nf nf, T8 t82, Gi gi, AppMetricaConfig appMetricaConfig) {
        this.f39411a = gi;
        this.f39412b = new Qh(nf, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), t82, appMetricaConfig.userProfileID);
    }

    public final Qh a() {
        return this.f39412b;
    }
}
