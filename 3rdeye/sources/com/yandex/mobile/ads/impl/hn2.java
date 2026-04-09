package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* loaded from: classes3.dex */
public final class hn2 implements VideoPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    private final gu f28297a;

    public hn2(ye2 videoPlayerListener) {
        kotlin.jvm.internal.l.f(videoPlayerListener, "videoPlayerListener");
        this.f28297a = videoPlayerListener;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        this.f28297a.onVideoCompleted();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        this.f28297a.onVideoError();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        this.f28297a.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        this.f28297a.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        this.f28297a.onVideoResumed();
    }
}
