package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public final class d80 {

    /* renamed from: a, reason: collision with root package name */
    private final nj1 f26018a;

    /* renamed from: b, reason: collision with root package name */
    private final be2 f26019b;

    public d80(nj1 positionProviderHolder, be2 videoDurationHolder) {
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        this.f26018a = positionProviderHolder;
        this.f26019b = videoDurationHolder;
    }

    public final void a(AdPlaybackState adPlaybackState, int i) {
        kotlin.jvm.internal.l.f(adPlaybackState, "adPlaybackState");
        long jUsToMs = Util.usToMs(adPlaybackState.getAdGroup(i).timeUs);
        if (jUsToMs == Long.MIN_VALUE) {
            jUsToMs = this.f26019b.a();
        }
        this.f26018a.a(new f80(jUsToMs));
    }

    public final void a() {
        this.f26018a.a((f80) null);
    }
}
