package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;

/* renamed from: com.yandex.mobile.ads.impl.b5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4081b5 {

    /* renamed from: a, reason: collision with root package name */
    private AdsLoader.EventListener f25083a;

    /* renamed from: b, reason: collision with root package name */
    private AdPlaybackState f25084b;

    public C4081b5(AdsLoader.EventListener eventListener) {
        this.f25083a = eventListener;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        kotlin.jvm.internal.l.e(NONE, "NONE");
        this.f25084b = NONE;
    }

    public final AdPlaybackState a() {
        return this.f25084b;
    }

    public final void b() {
        this.f25083a = null;
        AdPlaybackState NONE = AdPlaybackState.NONE;
        kotlin.jvm.internal.l.e(NONE, "NONE");
        this.f25084b = NONE;
    }

    public final void a(AdsLoader.EventListener eventListener) {
        this.f25083a = eventListener;
    }

    public final void a(AdPlaybackState adPlaybackState) {
        kotlin.jvm.internal.l.f(adPlaybackState, "adPlaybackState");
        this.f25084b = adPlaybackState;
        AdsLoader.EventListener eventListener = this.f25083a;
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        }
    }
}
