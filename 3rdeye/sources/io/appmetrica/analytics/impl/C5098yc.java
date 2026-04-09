package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5098yc extends Qn {

    /* renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f42134b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5098yc(InterfaceC4791mb interfaceC4791mb, AppMetricaConfig appMetricaConfig) {
        super(interfaceC4791mb);
        String str = appMetricaConfig.apiKey;
        this.f42134b = appMetricaConfig;
    }

    public final InterfaceC4817nb a() {
        return this.f40032a.a().a(this.f42134b);
    }
}
