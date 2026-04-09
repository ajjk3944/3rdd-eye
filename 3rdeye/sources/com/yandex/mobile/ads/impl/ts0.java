package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c11;
import com.yandex.mobile.ads.impl.l11;

/* loaded from: classes3.dex */
public final class ts0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f33768c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final l11 f33769a;

    /* renamed from: b, reason: collision with root package name */
    private final c11 f33770b;

    public ts0() {
        this(0);
    }

    public final jx a() {
        jx jxVar;
        synchronized (f33768c) {
            jxVar = !a11.f24364a.a() ? null : new jx(this.f33769a.d(), this.f33770b.d());
        }
        return jxVar;
    }

    public /* synthetic */ ts0(int i) {
        this(l11.a.a(), c11.a.a());
    }

    public ts0(l11 sdkLogsCollector, c11 networkLogsCollector) {
        kotlin.jvm.internal.l.f(sdkLogsCollector, "sdkLogsCollector");
        kotlin.jvm.internal.l.f(networkLogsCollector, "networkLogsCollector");
        this.f33769a = sdkLogsCollector;
        this.f33770b = networkLogsCollector;
    }
}
