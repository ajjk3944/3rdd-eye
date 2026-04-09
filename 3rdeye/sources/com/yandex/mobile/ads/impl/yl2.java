package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class yl2 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<tn0, VideoAd> f35915a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<VideoAd, tn0> f35916b = new ConcurrentHashMap<>();

    public final tn0 a(VideoAd yandexVideoAd) {
        kotlin.jvm.internal.l.f(yandexVideoAd, "yandexVideoAd");
        tn0 tn0Var = this.f35916b.get(yandexVideoAd);
        if (tn0Var == null) {
            uo0.a("Incorrect state exception. The VideoAd provided to this specific InstreamAdPlayerListener is incorrect.\nPossible reasons: \n 1) Using the wrong instance of InstreamAdPlayerListener for callback notification\n 2) Notifying a callback for a VideoAd that has been released", new Object[0]);
        }
        return tn0Var;
    }

    public final void b(tn0 coreVideoAd) {
        kotlin.jvm.internal.l.f(coreVideoAd, "coreVideoAd");
        this.f35915a.remove(coreVideoAd);
    }

    public final void b(VideoAd videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f35916b.remove(videoAd);
    }

    public final VideoAd a(tn0 coreVideoAd) {
        kotlin.jvm.internal.l.f(coreVideoAd, "coreVideoAd");
        VideoAd videoAd = this.f35915a.get(coreVideoAd);
        if (videoAd != null) {
            return videoAd;
        }
        cn2 cn2Var = new cn2(coreVideoAd, new nb2());
        this.f35915a.put(coreVideoAd, cn2Var);
        this.f35916b.put(cn2Var, coreVideoAd);
        return cn2Var;
    }
}
