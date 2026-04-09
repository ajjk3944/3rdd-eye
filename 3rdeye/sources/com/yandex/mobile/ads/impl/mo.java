package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class mo implements n72 {

    /* renamed from: a, reason: collision with root package name */
    private final mm0 f30466a;

    /* renamed from: b, reason: collision with root package name */
    private final C4192r5 f30467b;

    public mo(Context context, vu1 sdkEnvironmentModule, zs coreInstreamAdBreak, pn0 instreamVastAdPlayer, mb2 videoAdInfo, zf2 videoTracker, ab2 playbackListener, ou creativeAssetsProvider, ao0 instreamVideoClicksProvider, ud2 videoClicks, mm0 clickListener, C4192r5 adPlayerVolumeConfigurator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
        kotlin.jvm.internal.l.f(instreamVastAdPlayer, "instreamVastAdPlayer");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(playbackListener, "playbackListener");
        kotlin.jvm.internal.l.f(creativeAssetsProvider, "creativeAssetsProvider");
        kotlin.jvm.internal.l.f(instreamVideoClicksProvider, "instreamVideoClicksProvider");
        kotlin.jvm.internal.l.f(videoClicks, "videoClicks");
        kotlin.jvm.internal.l.f(clickListener, "clickListener");
        kotlin.jvm.internal.l.f(adPlayerVolumeConfigurator, "adPlayerVolumeConfigurator");
        this.f30466a = clickListener;
        this.f30467b = adPlayerVolumeConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.n72
    public final void a(o70 instreamAdView, ym0 controlsState) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        kotlin.jvm.internal.l.f(controlsState, "controlsState");
        instreamAdView.setOnClickListener(this.f30466a);
        this.f30467b.a(controlsState.a(), controlsState.d());
    }

    @Override // com.yandex.mobile.ads.impl.n72
    public final void a(o70 instreamAdView) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        instreamAdView.setOnClickListener(null);
        instreamAdView.setClickable(false);
    }
}
