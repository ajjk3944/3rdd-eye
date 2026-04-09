package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

/* loaded from: classes3.dex */
public final class rf2 {

    /* renamed from: a, reason: collision with root package name */
    private final pi1 f32612a;

    /* renamed from: b, reason: collision with root package name */
    private final zd2 f32613b;

    public rf2(pi1 playerStateHolder, zd2 videoCompletedNotifier) {
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(videoCompletedNotifier, "videoCompletedNotifier");
        this.f32612a = playerStateHolder;
        this.f32613b = videoCompletedNotifier;
    }

    public final void a(Player player) {
        kotlin.jvm.internal.l.f(player, "player");
        if (this.f32612a.c() || player.isPlayingAd()) {
            return;
        }
        this.f32613b.c();
        boolean zB = this.f32613b.b();
        Timeline timelineB = this.f32612a.b();
        if (zB || timelineB.isEmpty()) {
            return;
        }
        timelineB.getPeriod(0, this.f32612a.a());
    }
}
