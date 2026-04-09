package com.yandex.mobile.ads.common;

import com.yandex.mobile.ads.impl.de2;
import com.yandex.mobile.ads.impl.fn2;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class VideoController {

    /* renamed from: a, reason: collision with root package name */
    private final de2 f24002a;

    public VideoController(de2 videoEventController) {
        l.f(videoEventController, "videoEventController");
        this.f24002a = videoEventController;
    }

    public final void setVideoEventListener(VideoEventListener videoEventListener) {
        if (videoEventListener == null) {
            this.f24002a.a((fn2) null);
        } else {
            this.f24002a.a(new fn2(videoEventListener));
        }
    }
}
