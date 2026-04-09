package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* loaded from: classes3.dex */
public final class Rc extends V2 {
    public Rc(Context context, Nf nf, ReporterConfig reporterConfig, Gi gi, C4609fa c4609fa) {
        this(context, gi, new Qh(nf, new CounterConfiguration(reporterConfig), new T8(new C4853ol(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), c4609fa, C5065x4.l().n(), new Ln(), new Pg(), new N6(), new C4496b0(), new Ve(c4609fa));
    }

    @Override // io.appmetrica.analytics.impl.V2
    public final String j() {
        return "[ManualReporter]";
    }

    public Rc(Context context, Gi gi, Qh qh, C4609fa c4609fa, J6 j62, Ln ln, Pg pg, N6 n62, C4496b0 c4496b0, Ve ve) {
        super(context, gi, qh, c4609fa, j62, ln, pg, n62, c4496b0, ve);
        C5065x4.l().getClass();
    }
}
