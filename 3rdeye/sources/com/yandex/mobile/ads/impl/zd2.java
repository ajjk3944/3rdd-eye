package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* loaded from: classes3.dex */
public final class zd2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4081b5 f36427a;

    /* renamed from: b, reason: collision with root package name */
    private final we2 f36428b;

    /* renamed from: c, reason: collision with root package name */
    private final xd2 f36429c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36430d;

    public zd2(C4081b5 adPlaybackStateController, ce2 videoDurationHolder, oj1 positionProviderHolder, we2 videoPlayerEventsController, xd2 videoCompleteNotifyPolicy) {
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        kotlin.jvm.internal.l.f(videoPlayerEventsController, "videoPlayerEventsController");
        kotlin.jvm.internal.l.f(videoCompleteNotifyPolicy, "videoCompleteNotifyPolicy");
        this.f36427a = adPlaybackStateController;
        this.f36428b = videoPlayerEventsController;
        this.f36429c = videoCompleteNotifyPolicy;
    }

    public final void a() {
        if (this.f36430d) {
            return;
        }
        this.f36430d = true;
        AdPlaybackState adPlaybackStateA = this.f36427a.a();
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
                this.f36427a.a(adPlaybackStateA);
            }
        }
        this.f36428b.onVideoCompleted();
    }

    public final boolean b() {
        return this.f36430d;
    }

    public final void c() {
        if (this.f36429c.a()) {
            a();
        }
    }
}
