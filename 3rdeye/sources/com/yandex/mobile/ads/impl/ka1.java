package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ka1 implements jc2<ab1> {

    /* renamed from: a, reason: collision with root package name */
    private final ia1 f29572a;

    public ka1(ia1 videoPlayer) {
        kotlin.jvm.internal.l.f(videoPlayer, "videoPlayer");
        this.f29572a = videoPlayer;
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void a(mb2<ab1> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f29572a.a(videoAdInfo.d());
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final long b() {
        return this.f29572a.b();
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void c() {
        this.f29572a.c();
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final long getAdPosition() {
        return this.f29572a.getAdPosition();
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final float getVolume() {
        return this.f29572a.getVolume();
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final boolean isPlayingAd() {
        return this.f29572a.isPlayingAd();
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void pauseAd() {
        this.f29572a.pauseAd();
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void resumeAd() {
        this.f29572a.resumeAd();
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void a(bc2 bc2Var) {
        this.f29572a.a(bc2Var);
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void a() {
        this.f29572a.a();
    }
}
