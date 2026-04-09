package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import androidx.media3.common.Timeline;

/* loaded from: classes3.dex */
public final class ii1 implements lj1 {

    /* renamed from: a, reason: collision with root package name */
    private final Player f28701a;

    /* renamed from: b, reason: collision with root package name */
    private final oi1 f28702b;

    public ii1(Player player, oi1 playerStateHolder) {
        kotlin.jvm.internal.l.f(player, "player");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        this.f28701a = player;
        this.f28702b = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.lj1
    public final long a() {
        Timeline timelineB = this.f28702b.b();
        return this.f28701a.getContentPosition() - (!timelineB.isEmpty() ? timelineB.getPeriod(0, this.f28702b.a()).getPositionInWindowMs() : 0L);
    }
}
