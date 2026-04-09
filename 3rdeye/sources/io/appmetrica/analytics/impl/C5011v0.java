package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5011v0 implements Pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5061x0 f41825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f41826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f41827c;

    public C5011v0(C5061x0 c5061x0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f41825a = c5061x0;
        this.f41826b = appMetricaConfig;
        this.f41827c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final Ac a() {
        C5061x0 c5061x0 = this.f41825a;
        return c5061x0.f42004g.b(this.f41826b, this.f41827c, c5061x0.i.f40327g);
    }
}
