package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.yandex.mobile.ads.impl.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4184q3 {

    /* renamed from: a, reason: collision with root package name */
    private final C4081b5 f32007a;

    /* renamed from: b, reason: collision with root package name */
    private final C4169o2 f32008b;

    public C4184q3(ce2 videoDurationHolder, C4081b5 adPlaybackStateController, C4169o2 adBreakTimingProvider) {
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(adBreakTimingProvider, "adBreakTimingProvider");
        this.f32007a = adPlaybackStateController;
        this.f32008b = adBreakTimingProvider;
    }

    public final int a(at adBreakPosition) {
        kotlin.jvm.internal.l.f(adBreakPosition, "adBreakPosition");
        long jA = this.f32008b.a(adBreakPosition);
        AdPlaybackState adPlaybackStateA = this.f32007a.a();
        if (jA == Long.MIN_VALUE) {
            int i = adPlaybackStateA.adGroupCount;
            if (i <= 0 || adPlaybackStateA.getAdGroup(i - 1).timeUs != Long.MIN_VALUE) {
                return -1;
            }
            return adPlaybackStateA.adGroupCount - 1;
        }
        long jMsToUs = Util.msToUs(jA);
        int i10 = adPlaybackStateA.adGroupCount;
        for (int i11 = 0; i11 < i10; i11++) {
            long j4 = adPlaybackStateA.getAdGroup(i11).timeUs;
            if (j4 != Long.MIN_VALUE && Math.abs(j4 - jMsToUs) <= 1000) {
                return i11;
            }
        }
        return -1;
    }
}
