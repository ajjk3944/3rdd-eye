package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class sc2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final an1 f32934a;

    /* renamed from: b, reason: collision with root package name */
    private final ql1 f32935b;

    /* renamed from: c, reason: collision with root package name */
    private final q92<T> f32936c;

    /* renamed from: d, reason: collision with root package name */
    private final z92<T> f32937d;

    /* renamed from: e, reason: collision with root package name */
    private final oh2<T> f32938e;

    public sc2(Context context, mb2 videoAdInfo, fg2 videoViewProvider, dd2 adStatusController, ag2 videoTracker, jc2 videoAdPlayer, cc2 playbackEventsListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        kotlin.jvm.internal.l.f(adStatusController, "adStatusController");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(playbackEventsListener, "playbackEventsListener");
        this.f32934a = new an1(videoTracker);
        this.f32935b = new ql1(context, videoAdInfo);
        this.f32936c = new q92<>(videoAdInfo, videoViewProvider, videoTracker, playbackEventsListener);
        this.f32937d = new z92<>(videoViewProvider, videoTracker, videoAdPlayer);
        this.f32938e = new oh2<>(videoAdInfo, videoViewProvider, adStatusController, videoTracker, playbackEventsListener);
    }

    public final void a(qc2 progressEventsObservable) {
        kotlin.jvm.internal.l.f(progressEventsObservable, "progressEventsObservable");
        progressEventsObservable.a(this.f32934a, this.f32935b, this.f32937d, this.f32936c, this.f32938e);
        progressEventsObservable.a(this.f32938e);
    }
}
