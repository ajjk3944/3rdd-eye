package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Util;

/* renamed from: com.yandex.mobile.ads.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4177p3 {

    /* renamed from: a, reason: collision with root package name */
    private final C4074a5 f31577a;

    /* renamed from: b, reason: collision with root package name */
    private final C4162n2 f31578b;

    public C4177p3(be2 videoDurationHolder, C4074a5 adPlaybackStateController, C4162n2 adBreakTimingProvider) {
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(adBreakTimingProvider, "adBreakTimingProvider");
        this.f31577a = adPlaybackStateController;
        this.f31578b = adBreakTimingProvider;
    }

    public final int a(at adBreakPosition) {
        kotlin.jvm.internal.l.f(adBreakPosition, "adBreakPosition");
        long jA = this.f31578b.a(adBreakPosition);
        AdPlaybackState adPlaybackStateA = this.f31577a.a();
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
