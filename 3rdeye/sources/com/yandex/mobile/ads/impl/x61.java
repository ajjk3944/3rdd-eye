package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Map;

/* loaded from: classes3.dex */
public final class x61 {

    /* renamed from: a, reason: collision with root package name */
    private final ej0 f35207a;

    /* renamed from: b, reason: collision with root package name */
    private final xo f35208b;

    /* renamed from: c, reason: collision with root package name */
    private final h71 f35209c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, bg<?>> f35210d;

    public x61(i71 nativeAdWeakViewHolder, C4072a3 adConfiguration, ej0 imageProvider, ck0 impressionEventsObservable, xo onClickListenerFactory, j51 nativeAdFactoriesProvider, ng assetValueProvider, c91 nativeMediaContent, j81 nativeForcePauseObserver, a8 adResponse, vb1 nativeVisualBlock, v41 nativeAdControllers, cx0 mediaViewRenderController, fv customAssetTracker, h71 weakViewProvider, cj2 mediaControlsProvider, ww0 mediaViewAdapterCreator, Map assetAdapters) {
        kotlin.jvm.internal.l.f(nativeAdWeakViewHolder, "nativeAdWeakViewHolder");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(impressionEventsObservable, "impressionEventsObservable");
        kotlin.jvm.internal.l.f(onClickListenerFactory, "onClickListenerFactory");
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        kotlin.jvm.internal.l.f(assetValueProvider, "assetValueProvider");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(nativeForcePauseObserver, "nativeForcePauseObserver");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeVisualBlock, "nativeVisualBlock");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        kotlin.jvm.internal.l.f(customAssetTracker, "customAssetTracker");
        kotlin.jvm.internal.l.f(weakViewProvider, "weakViewProvider");
        kotlin.jvm.internal.l.f(mediaControlsProvider, "mediaControlsProvider");
        kotlin.jvm.internal.l.f(mediaViewAdapterCreator, "mediaViewAdapterCreator");
        kotlin.jvm.internal.l.f(assetAdapters, "assetAdapters");
        this.f35207a = imageProvider;
        this.f35208b = onClickListenerFactory;
        this.f35209c = weakViewProvider;
        this.f35210d = assetAdapters;
    }

    public final void a() {
        for (bg<?> bgVar : this.f35210d.values()) {
            if (bgVar != null) {
                bgVar.a();
            }
        }
    }

    public final void b() {
        for (bg<?> bgVar : this.f35210d.values()) {
            if (bgVar != null) {
                bgVar.destroy();
            }
        }
    }

    public final Map<String, bg<?>> c() {
        return this.f35210d;
    }

    public final ej0 d() {
        return this.f35207a;
    }

    public final View e() {
        return this.f35209c.e();
    }

    public final xo f() {
        return this.f35208b;
    }

    public final h71 g() {
        return this.f35209c;
    }

    public final bg<?> a(ag<?> agVar) {
        if (agVar != null) {
            return this.f35210d.get(agVar.b());
        }
        return null;
    }

    public final bg<?> a(String assetName) {
        kotlin.jvm.internal.l.f(assetName, "assetName");
        return this.f35210d.get(assetName);
    }

    public /* synthetic */ x61(i71 i71Var, C4072a3 c4072a3, ej0 ej0Var, ck0 ck0Var, xo xoVar, j51 j51Var, ng ngVar, c91 c91Var, j81 j81Var, a8 a8Var, vb1 vb1Var, v41 v41Var, cx0 cx0Var, nx1 nx1Var, fv fvVar) {
        h71 h71VarA = i71Var.a();
        cj2 cj2Var = new cj2(h71VarA);
        ww0 ww0Var = new ww0(ngVar, c4072a3, ck0Var, j51Var.c(), v41Var, cx0Var, cj2Var, nx1Var);
        this(i71Var, c4072a3, ej0Var, ck0Var, xoVar, j51Var, ngVar, c91Var, j81Var, a8Var, vb1Var, v41Var, cx0Var, fvVar, h71VarA, cj2Var, ww0Var, new dg(h71VarA, ej0Var, ww0Var, c91Var, j81Var, a8Var, vb1Var, c4072a3.q().c(), fvVar).a());
    }
}
