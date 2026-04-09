package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes3.dex */
public final class gs implements n72 {

    /* renamed from: a, reason: collision with root package name */
    private final hs f27970a;

    /* renamed from: b, reason: collision with root package name */
    private final zg f27971b;

    /* renamed from: c, reason: collision with root package name */
    private final nm0 f27972c;

    /* renamed from: d, reason: collision with root package name */
    private final km0 f27973d;

    public gs(Context context, vu1 sdkEnvironmentModule, nl0 customUiElementsHolder, pn0 instreamVastAdPlayer, zs coreInstreamAdBreak, mb2 videoAdInfo, zf2 videoTracker, sk1 imageProvider, ab2 playbackListener, hs controlsViewConfigurator, vm0 assetsWrapperProvider, um0 assetsWrapper, rg assetViewConfiguratorsCreator, List assetViewConfigurators, zg assetsViewConfigurator, nm0 instreamAdViewUiElementsManager, dn0 instreamDesignProvider, cn0 instreamDesign, km0 instreamAdUiElementsController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        kotlin.jvm.internal.l.f(instreamVastAdPlayer, "instreamVastAdPlayer");
        kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(playbackListener, "playbackListener");
        kotlin.jvm.internal.l.f(controlsViewConfigurator, "controlsViewConfigurator");
        kotlin.jvm.internal.l.f(assetsWrapperProvider, "assetsWrapperProvider");
        kotlin.jvm.internal.l.f(assetsWrapper, "assetsWrapper");
        kotlin.jvm.internal.l.f(assetViewConfiguratorsCreator, "assetViewConfiguratorsCreator");
        kotlin.jvm.internal.l.f(assetViewConfigurators, "assetViewConfigurators");
        kotlin.jvm.internal.l.f(assetsViewConfigurator, "assetsViewConfigurator");
        kotlin.jvm.internal.l.f(instreamAdViewUiElementsManager, "instreamAdViewUiElementsManager");
        kotlin.jvm.internal.l.f(instreamDesignProvider, "instreamDesignProvider");
        kotlin.jvm.internal.l.f(instreamDesign, "instreamDesign");
        kotlin.jvm.internal.l.f(instreamAdUiElementsController, "instreamAdUiElementsController");
        this.f27970a = controlsViewConfigurator;
        this.f27971b = assetsViewConfigurator;
        this.f27972c = instreamAdViewUiElementsManager;
        this.f27973d = instreamAdUiElementsController;
    }

    @Override // com.yandex.mobile.ads.impl.n72
    public final void a(o70 instreamAdView, ym0 controlsState) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        kotlin.jvm.internal.l.f(controlsState, "controlsState");
        bb2 bb2VarA = this.f27973d.a(instreamAdView);
        if (bb2VarA != null) {
            this.f27970a.a(bb2VarA, controlsState);
            this.f27971b.a(bb2VarA);
            instreamAdView.addView(bb2VarA.a(), new ViewGroup.LayoutParams(-1, -1));
        }
        this.f27972c.getClass();
        instreamAdView.setAdUiElements(bb2VarA);
    }

    @Override // com.yandex.mobile.ads.impl.n72
    public final void a(o70 instreamAdView) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        this.f27972c.getClass();
        bb2 adUiElements = instreamAdView.getAdUiElements();
        if (adUiElements != null) {
            instreamAdView.removeView(adUiElements.a());
        }
        this.f27972c.getClass();
        instreamAdView.setAdUiElements(null);
    }
}
