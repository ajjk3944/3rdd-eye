package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ow1 implements fu {

    /* renamed from: a, reason: collision with root package name */
    private final ul1 f31510a;

    /* renamed from: b, reason: collision with root package name */
    private final si1 f31511b;

    /* renamed from: c, reason: collision with root package name */
    private final xe2 f31512c;

    public ow1(ll1 progressProvider, si1 playerVolumeController, xe2 eventsController) {
        kotlin.jvm.internal.l.f(progressProvider, "progressProvider");
        kotlin.jvm.internal.l.f(playerVolumeController, "playerVolumeController");
        kotlin.jvm.internal.l.f(eventsController, "eventsController");
        this.f31510a = progressProvider;
        this.f31511b = playerVolumeController;
        this.f31512c = eventsController;
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void a(ye2 ye2Var) {
        this.f31512c.a(ye2Var);
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final long getVideoDuration() {
        return this.f31510a.a().b();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final long getVideoPosition() {
        return this.f31510a.a().c();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final float getVolume() {
        Float fA = this.f31511b.a();
        if (fA != null) {
            return fA.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void pauseVideo() {
        this.f31512c.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void prepareVideo() {
        this.f31512c.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void resumeVideo() {
        this.f31512c.onVideoResumed();
    }
}
