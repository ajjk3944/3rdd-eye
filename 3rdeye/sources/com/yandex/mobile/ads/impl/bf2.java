package com.yandex.mobile.ads.impl;

import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class bf2 {

    /* renamed from: a, reason: collision with root package name */
    private final qb1 f25259a;

    /* renamed from: b, reason: collision with root package name */
    private final hl1 f25260b;

    public bf2(qb1 controlsConfigurator, hl1 progressBarConfigurator) {
        kotlin.jvm.internal.l.f(controlsConfigurator, "controlsConfigurator");
        kotlin.jvm.internal.l.f(progressBarConfigurator, "progressBarConfigurator");
        this.f25259a = controlsConfigurator;
        this.f25260b = progressBarConfigurator;
    }

    public final void a(ob1 videoView) {
        kotlin.jvm.internal.l.f(videoView, "videoView");
        videoView.c().setVisibility(0);
        ne2 placeholderView = videoView.b();
        this.f25260b.getClass();
        kotlin.jvm.internal.l.f(placeholderView, "placeholderView");
        placeholderView.b().setVisibility(8);
        ImageView imageViewA = placeholderView.a();
        if (imageViewA != null) {
            imageViewA.setVisibility(8);
        }
        this.f25259a.a(videoView.a().a());
    }
}
