package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;

/* loaded from: classes3.dex */
public final class yd2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4074a5 f35724a;

    /* renamed from: b, reason: collision with root package name */
    private final xe2 f35725b;

    /* renamed from: c, reason: collision with root package name */
    private final wd2 f35726c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35727d;

    public yd2(C4074a5 adPlaybackStateController, be2 videoDurationHolder, nj1 positionProviderHolder, xe2 videoPlayerEventsController, wd2 videoCompleteNotifyPolicy) {
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        kotlin.jvm.internal.l.f(videoPlayerEventsController, "videoPlayerEventsController");
        kotlin.jvm.internal.l.f(videoCompleteNotifyPolicy, "videoCompleteNotifyPolicy");
        this.f35724a = adPlaybackStateController;
        this.f35725b = videoPlayerEventsController;
        this.f35726c = videoCompleteNotifyPolicy;
    }

    public final void a() {
        if (this.f35727d) {
            return;
        }
        this.f35727d = true;
        AdPlaybackState adPlaybackStateA = this.f35724a.a();
        int i = adPlaybackStateA.adGroupCount;
        for (int i10 = 0; i10 < i; i10++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackStateA.getAdGroup(i10);
            kotlin.jvm.internal.l.e(adGroup, "getAdGroup(...)");
            if (adGroup.timeUs != Long.MIN_VALUE) {
                if (adGroup.count < 0) {
                    adPlaybackStateA = adPlaybackStateA.withAdCount(i10, 1);
                    kotlin.jvm.internal.l.e(adPlaybackStateA, "withAdCount(...)");
                }
                adPlaybackStateA = adPlaybackStateA.withSkippedAdGroup(i10);
                kotlin.jvm.internal.l.e(adPlaybackStateA, "withSkippedAdGroup(...)");
                this.f35724a.a(adPlaybackStateA);
            }
        }
        this.f35725b.onVideoCompleted();
    }

    public final boolean b() {
        return this.f35727d;
    }

    public final void c() {
        if (this.f35726c.a()) {
            a();
        }
    }
}
