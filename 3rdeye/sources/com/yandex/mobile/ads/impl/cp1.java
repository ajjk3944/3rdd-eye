package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class cp1 {

    /* renamed from: a, reason: collision with root package name */
    private final ep1 f25746a;

    public cp1(eg2 videoViewAdapter, gp1 replayController) {
        kotlin.jvm.internal.l.f(videoViewAdapter, "videoViewAdapter");
        kotlin.jvm.internal.l.f(replayController, "replayController");
        this.f25746a = new ep1(videoViewAdapter, replayController, this);
    }

    public static void b(bp1 replayActionView) {
        kotlin.jvm.internal.l.f(replayActionView, "replayActionView");
        replayActionView.setBackground(null);
        replayActionView.setVisibility(8);
        replayActionView.a().setOnClickListener(null);
    }

    public final void a(bp1 replayActionView) {
        kotlin.jvm.internal.l.f(replayActionView, "replayActionView");
        replayActionView.setVisibility(4);
        replayActionView.a().setOnClickListener(this.f25746a);
    }
}
