package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class pw1 implements fu {

    /* renamed from: a, reason: collision with root package name */
    private final vl1 f31930a;

    /* renamed from: b, reason: collision with root package name */
    private final ti1 f31931b;

    /* renamed from: c, reason: collision with root package name */
    private final we2 f31932c;

    public pw1(ml1 progressProvider, ti1 playerVolumeController, we2 eventsController) {
        kotlin.jvm.internal.l.f(progressProvider, "progressProvider");
        kotlin.jvm.internal.l.f(playerVolumeController, "playerVolumeController");
        kotlin.jvm.internal.l.f(eventsController, "eventsController");
        this.f31930a = progressProvider;
        this.f31931b = playerVolumeController;
        this.f31932c = eventsController;
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void a(ye2 ye2Var) {
        this.f31932c.a(ye2Var);
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final long getVideoDuration() {
        return this.f31930a.a().b();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final long getVideoPosition() {
        return this.f31930a.a().c();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final float getVolume() {
        Float fA = this.f31931b.a();
        if (fA != null) {
            return fA.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void pauseVideo() {
        this.f31932c.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void prepareVideo() {
        this.f31932c.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void resumeVideo() {
        this.f31932c.onVideoResumed();
    }
}
