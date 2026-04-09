package com.yandex.mobile.ads.instream;

import android.content.Context;
import c9.C2099t;
import com.yandex.mobile.ads.impl.bl1;
import com.yandex.mobile.ads.impl.en2;
import com.yandex.mobile.ads.impl.et;
import com.yandex.mobile.ads.impl.gn2;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.sl2;
import com.yandex.mobile.ads.impl.u72;
import com.yandex.mobile.ads.impl.ul2;
import com.yandex.mobile.ads.impl.yl2;
import com.yandex.mobile.ads.impl.ys;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class InstreamAdBinder extends bl1 implements u72 {

    /* renamed from: a, reason: collision with root package name */
    private final yl2 f36801a;

    /* renamed from: b, reason: collision with root package name */
    private final ys f36802b;

    public InstreamAdBinder(Context context, InstreamAd instreamAd, InstreamAdPlayer instreamAdPlayer, VideoPlayer videoPlayer) {
        l.f(context, "context");
        l.f(instreamAd, "instreamAd");
        l.f(instreamAdPlayer, "instreamAdPlayer");
        l.f(videoPlayer, "videoPlayer");
        rm2 rm2Var = new rm2(context);
        yl2 yl2Var = new yl2();
        this.f36801a = yl2Var;
        this.f36802b = new ys(context, rm2Var, et.a(instreamAd), new ul2(instreamAdPlayer, yl2Var), new gn2(videoPlayer));
    }

    public final void bind(InstreamAdView instreamAdView) {
        l.f(instreamAdView, "instreamAdView");
        this.f36802b.a(instreamAdView, C2099t.f18581b);
    }

    @Override // com.yandex.mobile.ads.impl.u72
    public void invalidateAdPlayer() {
        this.f36802b.invalidateAdPlayer();
    }

    public final void invalidateVideoPlayer() {
        this.f36802b.a();
    }

    public final void prepareAd() {
        this.f36802b.b();
    }

    public final void setInstreamAdListener(InstreamAdListener instreamAdListener) {
        this.f36802b.a(instreamAdListener != null ? new sl2(instreamAdListener) : null);
    }

    public final void setVideoAdPlaybackListener(VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f36802b.a(videoAdPlaybackListener != null ? new en2(videoAdPlaybackListener, this.f36801a) : null);
    }

    public final void unbind() {
        this.f36802b.e();
    }
}
