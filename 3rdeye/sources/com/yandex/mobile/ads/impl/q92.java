package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class q92<T> implements pc2 {

    /* renamed from: a, reason: collision with root package name */
    private final mb2<T> f32118a;

    /* renamed from: b, reason: collision with root package name */
    private final zf2 f32119b;

    /* renamed from: c, reason: collision with root package name */
    private final cc2<T> f32120c;

    /* renamed from: d, reason: collision with root package name */
    private final gg2 f32121d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32122e;

    public /* synthetic */ q92(mb2 mb2Var, fg2 fg2Var, ag2 ag2Var, cc2 cc2Var) {
        this(mb2Var, fg2Var, ag2Var, cc2Var, new gg2(fg2Var));
    }

    @Override // com.yandex.mobile.ads.impl.pc2
    public final void a(long j4, long j10) {
        if (this.f32122e || j10 <= 0 || !this.f32121d.a()) {
            return;
        }
        this.f32122e = true;
        this.f32119b.h();
        this.f32120c.i(this.f32118a);
    }

    public q92(mb2 videoAdInfo, fg2 videoViewProvider, ag2 videoTracker, cc2 playbackEventsListener, gg2 videoVisibleAreaValidator) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(playbackEventsListener, "playbackEventsListener");
        kotlin.jvm.internal.l.f(videoVisibleAreaValidator, "videoVisibleAreaValidator");
        this.f32118a = videoAdInfo;
        this.f32119b = videoTracker;
        this.f32120c = playbackEventsListener;
        this.f32121d = videoVisibleAreaValidator;
    }
}
