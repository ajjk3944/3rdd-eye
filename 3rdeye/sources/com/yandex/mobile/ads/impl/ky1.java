package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ky1 implements InterfaceC4216v1 {

    /* renamed from: b, reason: collision with root package name */
    private static final long f29822b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f29823a;

    public ky1(a8<?> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f29823a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4216v1
    public final long a() {
        Long lK = this.f29823a.K();
        return lK != null ? lK.longValue() : f29822b;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4216v1
    public final long a(long j4) {
        Long lK = this.f29823a.K();
        return lK != null ? Math.min(j4, lK.longValue()) : j4;
    }
}
