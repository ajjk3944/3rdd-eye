package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* loaded from: classes3.dex */
public final class ai1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4081b5 f24682a;

    /* renamed from: b, reason: collision with root package name */
    private final li1 f24683b;

    /* renamed from: c, reason: collision with root package name */
    private final wr0 f24684c;

    public ai1(C4081b5 adPlaybackStateController, oj1 positionProviderHolder, ce2 videoDurationHolder, li1 playerStateChangedListener, wr0 loadingAdGroupIndexProvider) {
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(playerStateChangedListener, "playerStateChangedListener");
        kotlin.jvm.internal.l.f(loadingAdGroupIndexProvider, "loadingAdGroupIndexProvider");
        this.f24682a = adPlaybackStateController;
        this.f24683b = playerStateChangedListener;
        this.f24684c = loadingAdGroupIndexProvider;
    }

    public final void a(int i, Player player) {
        kotlin.jvm.internal.l.f(player, "player");
        if (i == 2 && !player.isPlayingAd()) {
            AdPlaybackState adPlaybackStateA = this.f24682a.a();
            int iA = this.f24684c.a(adPlaybackStateA);
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
        this.f24683b.a(player.getPlayWhenReady(), i);
    }
}
