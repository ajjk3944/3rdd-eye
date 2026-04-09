package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.vi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5029vi implements InterfaceC4765lb {
    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb, io.appmetrica.analytics.impl.InterfaceC4791mb
    public final InterfaceC4765lb a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb
    public final InterfaceC4507bb b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z10) {
        return new Qc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb
    public final void a(ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb
    public final InterfaceC4739kb b(ReporterConfig reporterConfig) {
        return new C4953si();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb
    public final InterfaceC4507bb a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z10) {
        return new Qc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4765lb
    public final InterfaceC4817nb a(AppMetricaConfig appMetricaConfig) {
        return new C4953si();
    }
}
