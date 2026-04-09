package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

/* loaded from: classes3.dex */
public final class ji1 implements mj1 {

    /* renamed from: a, reason: collision with root package name */
    private final Player f29153a;

    /* renamed from: b, reason: collision with root package name */
    private final pi1 f29154b;

    public ji1(Player player, pi1 playerStateHolder) {
        kotlin.jvm.internal.l.f(player, "player");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        this.f29153a = player;
        this.f29154b = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.mj1
    public final long a() {
        Timeline timelineB = this.f29154b.b();
        return this.f29153a.getContentPosition() - (!timelineB.isEmpty() ? timelineB.getPeriod(0, this.f29154b.a()).getPositionInWindowMs() : 0L);
    }
}
