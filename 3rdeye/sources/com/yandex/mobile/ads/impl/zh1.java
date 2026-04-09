package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Player;

/* loaded from: classes3.dex */
public final class zh1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4074a5 f36505a;

    /* renamed from: b, reason: collision with root package name */
    private final ki1 f36506b;

    /* renamed from: c, reason: collision with root package name */
    private final vr0 f36507c;

    public zh1(C4074a5 adPlaybackStateController, nj1 positionProviderHolder, be2 videoDurationHolder, ki1 playerStateChangedListener, vr0 loadingAdGroupIndexProvider) {
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(playerStateChangedListener, "playerStateChangedListener");
        kotlin.jvm.internal.l.f(loadingAdGroupIndexProvider, "loadingAdGroupIndexProvider");
        this.f36505a = adPlaybackStateController;
        this.f36506b = playerStateChangedListener;
        this.f36507c = loadingAdGroupIndexProvider;
    }

    public final void a(int i, Player player) {
        kotlin.jvm.internal.l.f(player, "player");
        if (i == 2 && !player.isPlayingAd()) {
            AdPlaybackState adPlaybackStateA = this.f36505a.a();
            int iA = this.f36507c.a(adPlaybackStateA);
            if (iA == -1) {
                return;
            }
            AdPlaybackState.AdGroup adGroup = adPlaybackStateA.getAdGroup(iA);
            kotlin.jvm.internal.l.e(adGroup, "getAdGroup(...)");
            int i10 = adGroup.count;
            if (i10 != -1 && i10 != 0 && adGroup.states[0] != 0) {
                return;
            }
        }
        this.f36506b.a(player.getPlayWhenReady(), i);
    }
}
