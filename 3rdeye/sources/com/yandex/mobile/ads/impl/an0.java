package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class an0 implements ze1 {

    /* renamed from: a, reason: collision with root package name */
    private final in0 f24750a;

    /* renamed from: b, reason: collision with root package name */
    private final tn0 f24751b;

    public an0(in0 instreamInteractionTracker, tn0 videoAd, vz customAdClickHandler) {
        kotlin.jvm.internal.l.f(instreamInteractionTracker, "instreamInteractionTracker");
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(customAdClickHandler, "customAdClickHandler");
        this.f24750a = instreamInteractionTracker;
        this.f24751b = videoAd;
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        new zm0(this.f24750a);
        throw null;
    }
}
