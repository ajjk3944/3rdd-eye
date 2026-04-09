package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* renamed from: com.yandex.mobile.ads.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4179p5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4184q3 f31590a;

    /* renamed from: b, reason: collision with root package name */
    private final on0 f31591b;

    /* renamed from: c, reason: collision with root package name */
    private final C4157m4 f31592c;

    /* renamed from: d, reason: collision with root package name */
    private final C4081b5 f31593d;

    public C4179p5(b9 adStateDataController, C4184q3 adGroupIndexProvider, on0 instreamSourceUrlProvider) {
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(adGroupIndexProvider, "adGroupIndexProvider");
        kotlin.jvm.internal.l.f(instreamSourceUrlProvider, "instreamSourceUrlProvider");
        this.f31590a = adGroupIndexProvider;
        this.f31591b = instreamSourceUrlProvider;
        this.f31592c = adStateDataController.a();
        this.f31593d = adStateDataController.c();
    }

    public final void a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kn0 kn0VarG = videoAd.g();
        C4122h4 c4122h4 = new C4122h4(this.f31590a.a(kn0VarG.a()), videoAd.b().a() - 1);
        this.f31592c.a(c4122h4, videoAd);
        AdPlaybackState adPlaybackStateA = this.f31593d.a();
        if (adPlaybackStateA.isAdInErrorState(c4122h4.a(), c4122h4.b())) {
            return;
        }
        AdPlaybackState adPlaybackStateWithAdCount = adPlaybackStateA.withAdCount(c4122h4.a(), videoAd.b().b());
        kotlin.jvm.internal.l.e(adPlaybackStateWithAdCount, "withAdCount(...)");
        this.f31591b.getClass();
        AdPlaybackState adPlaybackStateWithAdUri = adPlaybackStateWithAdCount.withAdUri(c4122h4.a(), c4122h4.b(), Uri.parse(kn0VarG.getUrl()));
        kotlin.jvm.internal.l.e(adPlaybackStateWithAdUri, "withAdUri(...)");
        this.f31593d.a(adPlaybackStateWithAdUri);
    }
}
