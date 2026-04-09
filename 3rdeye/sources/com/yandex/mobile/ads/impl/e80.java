package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public final class e80 {

    /* renamed from: a, reason: collision with root package name */
    private final oj1 f26725a;

    /* renamed from: b, reason: collision with root package name */
    private final ce2 f26726b;

    public e80(oj1 positionProviderHolder, ce2 videoDurationHolder) {
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        this.f26725a = positionProviderHolder;
        this.f26726b = videoDurationHolder;
    }

    public final void a(AdPlaybackState adPlaybackState, int i) {
        kotlin.jvm.internal.l.f(adPlaybackState, "adPlaybackState");
        long jUsToMs = Util.usToMs(adPlaybackState.getAdGroup(i).timeUs);
        if (jUsToMs == Long.MIN_VALUE) {
            jUsToMs = this.f26726b.a();
        }
        this.f26725a.a(new g80(jUsToMs));
    }

    public final void a() {
        this.f26725a.a((g80) null);
    }
}
