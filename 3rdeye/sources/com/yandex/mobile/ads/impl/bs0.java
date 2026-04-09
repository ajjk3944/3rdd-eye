package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class bs0 implements as0 {

    /* renamed from: a, reason: collision with root package name */
    private final he f25373a;

    /* renamed from: b, reason: collision with root package name */
    private final mv1 f25374b;

    /* renamed from: c, reason: collision with root package name */
    private final pz0 f25375c;

    /* renamed from: d, reason: collision with root package name */
    private final or f25376d;

    /* renamed from: e, reason: collision with root package name */
    private final wv f25377e;

    /* renamed from: f, reason: collision with root package name */
    private final ts0 f25378f;

    public bs0(he appDataSource, mv1 sdkIntegrationDataSource, pz0 mediationNetworksDataSource, or consentsDataSource, wv debugErrorIndicatorDataSource, ts0 logsDataSource) {
        kotlin.jvm.internal.l.f(appDataSource, "appDataSource");
        kotlin.jvm.internal.l.f(sdkIntegrationDataSource, "sdkIntegrationDataSource");
        kotlin.jvm.internal.l.f(mediationNetworksDataSource, "mediationNetworksDataSource");
        kotlin.jvm.internal.l.f(consentsDataSource, "consentsDataSource");
        kotlin.jvm.internal.l.f(debugErrorIndicatorDataSource, "debugErrorIndicatorDataSource");
        kotlin.jvm.internal.l.f(logsDataSource, "logsDataSource");
        this.f25373a = appDataSource;
        this.f25374b = sdkIntegrationDataSource;
        this.f25375c = mediationNetworksDataSource;
        this.f25376d = consentsDataSource;
        this.f25377e = debugErrorIndicatorDataSource;
        this.f25378f = logsDataSource;
    }

    @Override // com.yandex.mobile.ads.impl.as0
    public final ix a() {
        return new ix(this.f25373a.a(), this.f25374b.a(), this.f25375c.a(), this.f25376d.a(), this.f25377e.a(), this.f25378f.a());
    }

    @Override // com.yandex.mobile.ads.impl.as0
    public final void a(boolean z10) {
        this.f25377e.a(z10);
    }
}
