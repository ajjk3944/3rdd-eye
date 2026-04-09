package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5036w0 implements Pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5061x0 f41884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f41885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f41886c;

    public C5036w0(C5061x0 c5061x0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f41884a = c5061x0;
        this.f41885b = appMetricaConfig;
        this.f41886c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final Ac a() {
        C5061x0 c5061x0 = this.f41884a;
        return c5061x0.f42004g.a(this.f41885b, this.f41886c, c5061x0.i.f40327g);
    }
}
