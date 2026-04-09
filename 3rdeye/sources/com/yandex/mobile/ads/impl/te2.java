package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class te2 implements ui1 {

    /* renamed from: a, reason: collision with root package name */
    private final fu f33565a;

    /* renamed from: b, reason: collision with root package name */
    private final tf2 f33566b;

    /* renamed from: c, reason: collision with root package name */
    private final ye2 f33567c;

    public /* synthetic */ te2(fu fuVar) {
        this(fuVar, new tf2(), new ye2());
    }

    public final void a(pe2 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f33567c.a(listener);
    }

    public final long b() {
        return this.f33565a.getVideoDuration();
    }

    public final long c() {
        return this.f33565a.getVideoPosition();
    }

    public final void d() {
        this.f33565a.pauseVideo();
    }

    public final void e() {
        this.f33565a.prepareVideo();
    }

    public final void f() {
        this.f33565a.resumeVideo();
    }

    public final void g() {
        this.f33565a.a(this.f33567c);
    }

    @Override // com.yandex.mobile.ads.impl.ui1
    public final float getVolume() {
        return this.f33565a.getVolume();
    }

    public final void h() {
        this.f33565a.a(null);
        this.f33567c.b();
    }

    public final tf2 a() {
        return this.f33566b;
    }

    public te2(fu videoPlayer, tf2 statusController, ye2 videoPlayerEventsController) {
        kotlin.jvm.internal.l.f(videoPlayer, "videoPlayer");
        kotlin.jvm.internal.l.f(statusController, "statusController");
        kotlin.jvm.internal.l.f(videoPlayerEventsController, "videoPlayerEventsController");
        this.f33565a = videoPlayer;
        this.f33566b = statusController;
        this.f33567c = videoPlayerEventsController;
    }
}
