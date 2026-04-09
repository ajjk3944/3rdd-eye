package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public final class x42 {

    /* renamed from: a, reason: collision with root package name */
    private final C4081b5 f35178a;

    /* renamed from: b, reason: collision with root package name */
    private final za f35179b;

    /* renamed from: c, reason: collision with root package name */
    private final oh1 f35180c;

    /* renamed from: d, reason: collision with root package name */
    private final pi1 f35181d;

    /* renamed from: e, reason: collision with root package name */
    private final ce2 f35182e;

    /* renamed from: f, reason: collision with root package name */
    private final a82 f35183f;

    public x42(C4081b5 adPlaybackStateController, ni1 playerStateController, za adsPlaybackInitializer, oh1 playbackChangesHandler, pi1 playerStateHolder, ce2 videoDurationHolder, a82 updatedDurationAdPlaybackProvider) {
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(adsPlaybackInitializer, "adsPlaybackInitializer");
        kotlin.jvm.internal.l.f(playbackChangesHandler, "playbackChangesHandler");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(updatedDurationAdPlaybackProvider, "updatedDurationAdPlaybackProvider");
        this.f35178a = adPlaybackStateController;
        this.f35179b = adsPlaybackInitializer;
        this.f35180c = playbackChangesHandler;
        this.f35181d = playerStateHolder;
        this.f35182e = videoDurationHolder;
        this.f35183f = updatedDurationAdPlaybackProvider;
    }

    public final void a(Timeline timeline) {
        kotlin.jvm.internal.l.f(timeline, "timeline");
        if (timeline.isEmpty()) {
            return;
        }
        if (timeline.getPeriodCount() != 1) {
            fp0.b(new Object[0]);
        }
        this.f35181d.a(timeline);
        Timeline.Period period = timeline.getPeriod(0, this.f35181d.a());
        kotlin.jvm.internal.l.e(period, "getPeriod(...)");
        long j4 = period.durationUs;
        this.f35182e.a(Util.usToMs(j4));
        if (j4 != -9223372036854775807L) {
            AdPlaybackState adPlaybackState = this.f35178a.a();
            this.f35183f.getClass();
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
            this.f35178a.a(adPlaybackStateWithContentDurationUs);
        }
        if (!this.f35179b.a()) {
            this.f35179b.b();
        }
        this.f35180c.a();
    }
}
