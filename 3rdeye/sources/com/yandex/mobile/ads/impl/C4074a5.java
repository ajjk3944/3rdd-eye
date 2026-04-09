package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.exoplayer.source.ads.AdsLoader;

/* renamed from: com.yandex.mobile.ads.impl.a5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4074a5 {

    /* renamed from: a, reason: collision with root package name */
    private AdsLoader.EventListener f24439a;

    /* renamed from: b, reason: collision with root package name */
    private AdPlaybackState f24440b;

    public C4074a5(AdsLoader.EventListener eventListener) {
        this.f24439a = eventListener;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        kotlin.jvm.internal.l.e(NONE, "NONE");
        this.f24440b = NONE;
    }

    public final AdPlaybackState a() {
        return this.f24440b;
    }

    public final void b() {
        this.f24439a = null;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        kotlin.jvm.internal.l.e(NONE, "NONE");
        this.f24440b = NONE;
    }

    public final void a(AdsLoader.EventListener eventListener) {
        this.f24439a = eventListener;
    }

    public final void a(AdPlaybackState adPlaybackState) {
        kotlin.jvm.internal.l.f(adPlaybackState, "adPlaybackState");
        this.f24440b = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f24439a;
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        }
    }
}
