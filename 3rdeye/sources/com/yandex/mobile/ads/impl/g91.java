package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class g91 implements ze1 {

    /* renamed from: a, reason: collision with root package name */
    private final h9 f27592a;

    /* renamed from: b, reason: collision with root package name */
    private final t32 f27593b;

    /* renamed from: c, reason: collision with root package name */
    private final np1 f27594c;

    public g91(h9 adTracker, t32 targetUrlHandler, np1 reporter) {
        kotlin.jvm.internal.l.f(adTracker, "adTracker");
        kotlin.jvm.internal.l.f(targetUrlHandler, "targetUrlHandler");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        this.f27592a = adTracker;
        this.f27593b = targetUrlHandler;
        this.f27594c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        this.f27592a.a(url, this.f27593b, this.f27594c);
    }
}
