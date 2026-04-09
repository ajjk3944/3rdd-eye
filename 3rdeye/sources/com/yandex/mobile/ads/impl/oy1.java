package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class oy1 implements hz {

    /* renamed from: b, reason: collision with root package name */
    private static final long f31528b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f31529a;

    public oy1(a8<?> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f31529a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.hz
    public final long a() {
        Long lK = this.f31529a.K();
        return lK != null ? lK.longValue() : f31528b;
    }
}
