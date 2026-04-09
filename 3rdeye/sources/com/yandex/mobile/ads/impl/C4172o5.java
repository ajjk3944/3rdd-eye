package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;

/* renamed from: com.yandex.mobile.ads.impl.o5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4172o5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4177p3 f31181a;

    /* renamed from: b, reason: collision with root package name */
    private final on0 f31182b;

    /* renamed from: c, reason: collision with root package name */
    private final C4150l4 f31183c;

    /* renamed from: d, reason: collision with root package name */
    private final C4074a5 f31184d;

    public C4172o5(a9 adStateDataController, C4177p3 adGroupIndexProvider, on0 instreamSourceUrlProvider) {
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(adGroupIndexProvider, "adGroupIndexProvider");
        kotlin.jvm.internal.l.f(instreamSourceUrlProvider, "instreamSourceUrlProvider");
        this.f31181a = adGroupIndexProvider;
        this.f31182b = instreamSourceUrlProvider;
        this.f31183c = adStateDataController.a();
        this.f31184d = adStateDataController.c();
    }

    public final void a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kn0 kn0VarG = videoAd.g();
        C4115g4 c4115g4 = new C4115g4(this.f31181a.a(kn0VarG.a()), videoAd.b().a() - 1);
        this.f31183c.a(c4115g4, videoAd);
        AdPlaybackState adPlaybackStateA = this.f31184d.a();
        if (adPlaybackStateA.isAdInErrorState(c4115g4.a(), c4115g4.b())) {
            return;
        }
        AdPlaybackState adPlaybackStateWithAdCount = adPlaybackStateA.withAdCount(c4115g4.a(), videoAd.b().b());
        kotlin.jvm.internal.l.e(adPlaybackStateWithAdCount, "withAdCount(...)");
        this.f31182b.getClass();
        AdPlaybackState adPlaybackStateWithAvailableAdMediaItem = adPlaybackStateWithAdCount.withAvailableAdMediaItem(c4115g4.a(), c4115g4.b(), MediaItem.fromUri(Uri.parse(kn0VarG.getUrl())));
        kotlin.jvm.internal.l.e(adPlaybackStateWithAvailableAdMediaItem, "withAvailableAdMediaItem(...)");
        this.f31184d.a(adPlaybackStateWithAvailableAdMediaItem);
    }
}
