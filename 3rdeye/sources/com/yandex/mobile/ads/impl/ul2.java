package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;

/* loaded from: classes3.dex */
public final class ul2 implements ct {

    /* renamed from: a, reason: collision with root package name */
    private final InstreamAdPlayer f34083a;

    /* renamed from: b, reason: collision with root package name */
    private final yl2 f34084b;

    public ul2(InstreamAdPlayer instreamAdPlayer, yl2 videoAdAdapterCache) {
        kotlin.jvm.internal.l.f(instreamAdPlayer, "instreamAdPlayer");
        kotlin.jvm.internal.l.f(videoAdAdapterCache, "videoAdAdapterCache");
        this.f34083a = instreamAdPlayer;
        this.f34084b = videoAdAdapterCache;
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final long a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return this.f34084b.a(videoAd).getDuration();
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final long b(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return this.f34083a.getAdPosition(this.f34084b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void c(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f34083a.playAd(this.f34084b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void d(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f34083a.prepareAd(this.f34084b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void e(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f34083a.releaseAd(this.f34084b.a(videoAd));
        this.f34084b.b(videoAd);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ul2) && kotlin.jvm.internal.l.b(((ul2) obj).f34083a, this.f34083a);
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void f(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f34083a.pauseAd(this.f34084b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void g(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f34083a.resumeAd(this.f34084b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void h(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f34083a.skipAd(this.f34084b.a(videoAd));
    }

    public final int hashCode() {
        return this.f34083a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void i(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f34083a.stopAd(this.f34084b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final boolean j(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return this.f34083a.isPlayingAd(this.f34084b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final float k(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return this.f34083a.getVolume(this.f34084b.a(videoAd));
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void a(xl0 xl0Var) {
        this.f34083a.setInstreamAdPlayerListener(xl0Var != null ? new wl2(xl0Var, this.f34084b, new vl2()) : null);
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void a(tn0 videoAd, float f10) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f34083a.setVolume(this.f34084b.a(videoAd), f10);
    }
}
