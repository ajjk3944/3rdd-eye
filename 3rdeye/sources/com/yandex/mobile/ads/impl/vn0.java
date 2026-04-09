package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ym0;

/* loaded from: classes3.dex */
public final class vn0 {

    /* renamed from: a, reason: collision with root package name */
    private final xn0 f34632a;

    /* renamed from: b, reason: collision with root package name */
    private final nm0 f34633b;

    /* renamed from: c, reason: collision with root package name */
    private final ml0 f34634c;

    public /* synthetic */ vn0(xn0 xn0Var, pn0 pn0Var) {
        this(xn0Var, pn0Var, new nm0(), new ml0(pn0Var));
    }

    public final void a(mb2<tn0> videoAdInfo, o70 instreamAdView, ym0 initialControlsState) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        kotlin.jvm.internal.l.f(initialControlsState, "initialControlsState");
        this.f34633b.getClass();
        bb2 adUiElements = instreamAdView.getAdUiElements();
        if (adUiElements != null) {
            this.f34632a.a(videoAdInfo, new ym0(new ym0.a().b(this.f34634c.a(adUiElements, initialControlsState).d()).a(initialControlsState.a())));
        }
    }

    public final void b(mb2<tn0> videoAdInfo, o70 instreamAdView, ym0 initialControlsState) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        kotlin.jvm.internal.l.f(initialControlsState, "initialControlsState");
        this.f34633b.getClass();
        bb2 adUiElements = instreamAdView.getAdUiElements();
        if (adUiElements != null) {
            this.f34632a.a(videoAdInfo, this.f34634c.a(adUiElements, initialControlsState));
        }
    }

    public vn0(xn0 videoAdControlsStateStorage, pn0 instreamVastAdPlayer, nm0 instreamAdViewUiElementsManager, ml0 videoAdControlsStateProvider) {
        kotlin.jvm.internal.l.f(videoAdControlsStateStorage, "videoAdControlsStateStorage");
        kotlin.jvm.internal.l.f(instreamVastAdPlayer, "instreamVastAdPlayer");
        kotlin.jvm.internal.l.f(instreamAdViewUiElementsManager, "instreamAdViewUiElementsManager");
        kotlin.jvm.internal.l.f(videoAdControlsStateProvider, "videoAdControlsStateProvider");
        this.f34632a = videoAdControlsStateStorage;
        this.f34633b = instreamAdViewUiElementsManager;
        this.f34634c = videoAdControlsStateProvider;
    }
}
