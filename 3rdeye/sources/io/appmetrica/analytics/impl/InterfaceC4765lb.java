package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.lb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4765lb extends InterfaceC4791mb {
    InterfaceC4507bb a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z10);

    @Override // io.appmetrica.analytics.impl.InterfaceC4791mb
    /* synthetic */ InterfaceC4765lb a();

    InterfaceC4817nb a(AppMetricaConfig appMetricaConfig);

    void a(ReporterConfig reporterConfig);

    InterfaceC4507bb b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z10);

    InterfaceC4739kb b(ReporterConfig reporterConfig);
}
