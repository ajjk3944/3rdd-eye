package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import androidx.media3.common.Timeline;

/* loaded from: classes3.dex */
public final class qf2 {

    /* renamed from: a, reason: collision with root package name */
    private final oi1 f32170a;

    /* renamed from: b, reason: collision with root package name */
    private final yd2 f32171b;

    public qf2(oi1 playerStateHolder, yd2 videoCompletedNotifier) {
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(videoCompletedNotifier, "videoCompletedNotifier");
        this.f32170a = playerStateHolder;
        this.f32171b = videoCompletedNotifier;
    }

    public final void a(Player player) {
        kotlin.jvm.internal.l.f(player, "player");
        if (this.f32170a.c() || player.isPlayingAd()) {
            return;
        }
        this.f32171b.c();
        boolean zB = this.f32171b.b();
        Timeline timelineB = this.f32170a.b();
        if (zB || timelineB.isEmpty()) {
            return;
        }
        timelineB.getPeriod(0, this.f32170a.a());
    }
}
