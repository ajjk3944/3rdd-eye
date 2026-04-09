package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayer;

/* loaded from: classes3.dex */
public final class gn2 implements fu {

    /* renamed from: a, reason: collision with root package name */
    private final VideoPlayer f27845a;

    public gn2(VideoPlayer videoPlayer) {
        kotlin.jvm.internal.l.f(videoPlayer, "videoPlayer");
        this.f27845a = videoPlayer;
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void a(ye2 ye2Var) {
        this.f27845a.setVideoPlayerListener(ye2Var != null ? new hn2(ye2Var) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn2) && kotlin.jvm.internal.l.b(this.f27845a, ((gn2) obj).f27845a);
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final long getVideoDuration() {
        return this.f27845a.getVideoDuration();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final long getVideoPosition() {
        return this.f27845a.getVideoPosition();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final float getVolume() {
        return this.f27845a.getVolume();
    }

    public final int hashCode() {
        return this.f27845a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void pauseVideo() {
        this.f27845a.pauseVideo();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void prepareVideo() {
        this.f27845a.prepareVideo();
    }

    @Override // com.yandex.mobile.ads.impl.fu
    public final void resumeVideo() {
        this.f27845a.resumeVideo();
    }

    public final String toString() {
        return "YandexVideoPlayerAdapter(videoPlayer=" + this.f27845a + ")";
    }
}
