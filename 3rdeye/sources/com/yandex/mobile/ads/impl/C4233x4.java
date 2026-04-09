package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Player;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.x4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4233x4 {

    /* renamed from: a, reason: collision with root package name */
    private final d80 f35174a;

    /* renamed from: b, reason: collision with root package name */
    private final yd2 f35175b;

    /* renamed from: c, reason: collision with root package name */
    private final c9 f35176c;

    /* renamed from: d, reason: collision with root package name */
    private final C4074a5 f35177d;

    public C4233x4(a9 adStateDataController, d80 fakePositionConfigurator, yd2 videoCompletedNotifier, c9 adStateHolder, C4074a5 adPlaybackStateController) {
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(fakePositionConfigurator, "fakePositionConfigurator");
        kotlin.jvm.internal.l.f(videoCompletedNotifier, "videoCompletedNotifier");
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        this.f35174a = fakePositionConfigurator;
        this.f35175b = videoCompletedNotifier;
        this.f35176c = adStateHolder;
        this.f35177d = adPlaybackStateController;
    }

    public final void a(Player player, boolean z10) {
        kotlin.jvm.internal.l.f(player, "player");
        boolean zB = this.f35175b.b();
        int currentAdGroupIndex = player.getCurrentAdGroupIndex();
        if (currentAdGroupIndex == -1) {
            AdPlaybackState adPlaybackStateA = this.f35177d.a();
            long contentPosition = player.getContentPosition();
            long contentDuration = player.getContentDuration();
            if (contentDuration == -9223372036854775807L || contentPosition == -9223372036854775807L) {
                currentAdGroupIndex = -1;
            } else {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                currentAdGroupIndex = adPlaybackStateA.getAdGroupIndexForPositionUs(timeUnit.toMicros(contentPosition), timeUnit.toMicros(contentDuration));
            }
        }
        boolean zB2 = this.f35176c.b();
        if (zB || z10 || currentAdGroupIndex == -1 || zB2) {
            return;
        }
        AdPlaybackState adPlaybackStateA2 = this.f35177d.a();
        if (adPlaybackStateA2.getAdGroup(currentAdGroupIndex).timeUs == Long.MIN_VALUE) {
            this.f35175b.a();
        } else {
            this.f35174a.a(adPlaybackStateA2, currentAdGroupIndex);
        }
    }
}
