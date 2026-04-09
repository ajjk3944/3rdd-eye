package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class je1 {

    /* renamed from: a, reason: collision with root package name */
    private final n8 f29121a;

    /* renamed from: b, reason: collision with root package name */
    private final rv0 f29122b;

    /* renamed from: c, reason: collision with root package name */
    private final C4079b3 f29123c;

    public je1(in2 adSession, rv0 mediaEvents, C4079b3 adEvents) {
        kotlin.jvm.internal.l.f(adSession, "adSession");
        kotlin.jvm.internal.l.f(mediaEvents, "mediaEvents");
        kotlin.jvm.internal.l.f(adEvents, "adEvents");
        this.f29121a = adSession;
        this.f29122b = mediaEvents;
        this.f29123c = adEvents;
    }

    public final C4079b3 a() {
        return this.f29123c;
    }

    public final n8 b() {
        return this.f29121a;
    }

    public final rv0 c() {
        return this.f29122b;
    }
}
