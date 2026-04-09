package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4240y4 {

    /* renamed from: a, reason: collision with root package name */
    private final e80 f35618a;

    /* renamed from: b, reason: collision with root package name */
    private final zd2 f35619b;

    /* renamed from: c, reason: collision with root package name */
    private final d9 f35620c;

    /* renamed from: d, reason: collision with root package name */
    private final C4081b5 f35621d;

    public C4240y4(b9 adStateDataController, e80 fakePositionConfigurator, zd2 videoCompletedNotifier, d9 adStateHolder, C4081b5 adPlaybackStateController) {
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(fakePositionConfigurator, "fakePositionConfigurator");
        kotlin.jvm.internal.l.f(videoCompletedNotifier, "videoCompletedNotifier");
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        this.f35618a = fakePositionConfigurator;
        this.f35619b = videoCompletedNotifier;
        this.f35620c = adStateHolder;
        this.f35621d = adPlaybackStateController;
    }

    public final void a(Player player, boolean z10) {
        kotlin.jvm.internal.l.f(player, "player");
        boolean zB = this.f35619b.b();
        int currentAdGroupIndex = player.getCurrentAdGroupIndex();
        if (currentAdGroupIndex == -1) {
            AdPlaybackState adPlaybackStateA = this.f35621d.a();
            long contentPosition = player.getContentPosition();
            long contentDuration = player.getContentDuration();
            if (contentDuration == -9223372036854775807L || contentPosition == -9223372036854775807L) {
                currentAdGroupIndex = -1;
            } else {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                currentAdGroupIndex = adPlaybackStateA.getAdGroupIndexForPositionUs(timeUnit.toMicros(contentPosition), timeUnit.toMicros(contentDuration));
            }
        }
        boolean zB2 = this.f35620c.b();
        if (zB || z10 || currentAdGroupIndex == -1 || zB2) {
            return;
        }
        AdPlaybackState adPlaybackStateA2 = this.f35621d.a();
        if (adPlaybackStateA2.getAdGroup(currentAdGroupIndex).timeUs == Long.MIN_VALUE) {
            this.f35619b.a();
        } else {
            this.f35618a.a(adPlaybackStateA2, currentAdGroupIndex);
        }
    }
}
