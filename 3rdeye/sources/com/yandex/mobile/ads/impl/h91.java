package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class h91 {

    /* renamed from: a, reason: collision with root package name */
    private final h9 f28146a;

    /* renamed from: b, reason: collision with root package name */
    private final t32 f28147b;

    public h91(h9 adTracker, t32 targetUrlHandler) {
        kotlin.jvm.internal.l.f(adTracker, "adTracker");
        kotlin.jvm.internal.l.f(targetUrlHandler, "targetUrlHandler");
        this.f28146a = adTracker;
        this.f28147b = targetUrlHandler;
    }

    public final g91 a(np1 clickReporter) {
        kotlin.jvm.internal.l.f(clickReporter, "clickReporter");
        return new g91(this.f28146a, this.f28147b, clickReporter);
    }
}
