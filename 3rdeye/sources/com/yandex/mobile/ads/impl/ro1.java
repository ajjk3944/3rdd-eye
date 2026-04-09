package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class ro1 implements qo1 {

    /* renamed from: a, reason: collision with root package name */
    private Long f32731a;

    @Override // com.yandex.mobile.ads.impl.qo1
    public final void a() {
        this.f32731a = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // com.yandex.mobile.ads.impl.qo1
    public final long b() {
        Long l5 = this.f32731a;
        if (l5 == null) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - l5.longValue();
    }
}
