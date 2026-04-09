package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;

/* loaded from: classes3.dex */
public final class jn0 implements Inroll, Pauseroll {

    /* renamed from: a, reason: collision with root package name */
    private final et0 f29221a;

    /* renamed from: b, reason: collision with root package name */
    private final yl2 f29222b;

    public /* synthetic */ jn0(et0 et0Var) {
        this(et0Var, new yl2());
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final InstreamAdBreak getInstreamAdBreak() {
        return new ol2(this.f29221a.a());
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void invalidate() {
        this.f29221a.b();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void pause() {
        this.f29221a.c();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void play(InstreamAdView instreamAdView) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        this.f29221a.a(instreamAdView);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void prepare(InstreamAdPlayer instreamAdPlayer) {
        kotlin.jvm.internal.l.f(instreamAdPlayer, "instreamAdPlayer");
        this.f29221a.a(new ul2(instreamAdPlayer, this.f29222b));
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void resume() {
        this.f29221a.d();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setListener(InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f29221a.a(instreamAdBreakEventListener != null ? new pl2(instreamAdBreakEventListener) : null);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setVideoAdPlaybackListener(VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f29221a.a(videoAdPlaybackListener != null ? new en2(videoAdPlaybackListener, this.f29222b) : null);
    }

    public jn0(et0 manualAdBreakPlaybackController, yl2 videoAdAdapterCache) {
        kotlin.jvm.internal.l.f(manualAdBreakPlaybackController, "manualAdBreakPlaybackController");
        kotlin.jvm.internal.l.f(videoAdAdapterCache, "videoAdAdapterCache");
        this.f29221a = manualAdBreakPlaybackController;
        this.f29222b = videoAdAdapterCache;
    }
}
