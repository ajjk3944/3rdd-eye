package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public final class w42 {

    /* renamed from: a, reason: collision with root package name */
    private final C4074a5 f34804a;

    /* renamed from: b, reason: collision with root package name */
    private final ya f34805b;

    /* renamed from: c, reason: collision with root package name */
    private final nh1 f34806c;

    /* renamed from: d, reason: collision with root package name */
    private final oi1 f34807d;

    /* renamed from: e, reason: collision with root package name */
    private final be2 f34808e;

    /* renamed from: f, reason: collision with root package name */
    private final z72 f34809f;

    public w42(C4074a5 adPlaybackStateController, mi1 playerStateController, ya adsPlaybackInitializer, nh1 playbackChangesHandler, oi1 playerStateHolder, be2 videoDurationHolder, z72 updatedDurationAdPlaybackProvider) {
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(adsPlaybackInitializer, "adsPlaybackInitializer");
        kotlin.jvm.internal.l.f(playbackChangesHandler, "playbackChangesHandler");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(updatedDurationAdPlaybackProvider, "updatedDurationAdPlaybackProvider");
        this.f34804a = adPlaybackStateController;
        this.f34805b = adsPlaybackInitializer;
        this.f34806c = playbackChangesHandler;
        this.f34807d = playerStateHolder;
        this.f34808e = videoDurationHolder;
        this.f34809f = updatedDurationAdPlaybackProvider;
    }

    public final void a(Timeline timeline) {
        kotlin.jvm.internal.l.f(timeline, "timeline");
        if (timeline.isEmpty()) {
            return;
        }
        if (timeline.getPeriodCount() != 1) {
            fp0.b(new Object[0]);
        }
        this.f34807d.a(timeline);
        Timeline.Period period = timeline.getPeriod(0, this.f34807d.a());
        kotlin.jvm.internal.l.e(period, "getPeriod(...)");
        long j4 = period.durationUs;
        this.f34808e.a(Util.usToMs(j4));
        if (j4 != -9223372036854775807L) {
            AdPlaybackState adPlaybackState = this.f34804a.a();
            this.f34809f.getClass();
            kotlin.jvm.internal.l.f(adPlaybackState, "adPlaybackState");
            AdPlaybackState adPlaybackStateWithContentDurationUs = adPlaybackState.withContentDurationUs(j4);
            kotlin.jvm.internal.l.e(adPlaybackStateWithContentDurationUs, "withContentDurationUs(...)");
            int i = adPlaybackStateWithContentDurationUs.adGroupCount;
            for (int i10 = 0; i10 < i; i10++) {
                if (adPlaybackStateWithContentDurationUs.getAdGroup(i10).timeUs > j4) {
                    adPlaybackStateWithContentDurationUs = adPlaybackStateWithContentDurationUs.withSkippedAdGroup(i10);
                    kotlin.jvm.internal.l.e(adPlaybackStateWithContentDurationUs, "withSkippedAdGroup(...)");
                }
            }
            this.f34804a.a(adPlaybackStateWithContentDurationUs);
        }
        if (!this.f34805b.a()) {
            this.f34805b.b();
        }
        this.f34806c.a();
    }
}
