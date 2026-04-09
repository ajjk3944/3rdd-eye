package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public final class ww0 {

    /* renamed from: a, reason: collision with root package name */
    private final ng f35095a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f35096b;

    /* renamed from: c, reason: collision with root package name */
    private final ck0 f35097c;

    /* renamed from: d, reason: collision with root package name */
    private final xw0 f35098d;

    /* renamed from: e, reason: collision with root package name */
    private final v41 f35099e;

    /* renamed from: f, reason: collision with root package name */
    private final cx0 f35100f;

    /* renamed from: g, reason: collision with root package name */
    private final ov0 f35101g;

    /* renamed from: h, reason: collision with root package name */
    private final nx1 f35102h;

    public ww0(ng assetValueProvider, C4072a3 adConfiguration, ck0 impressionEventsObservable, xw0 xw0Var, v41 nativeAdControllers, cx0 mediaViewRenderController, cj2 controlsProvider, nx1 nx1Var) {
        kotlin.jvm.internal.l.f(assetValueProvider, "assetValueProvider");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(impressionEventsObservable, "impressionEventsObservable");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        kotlin.jvm.internal.l.f(controlsProvider, "controlsProvider");
        this.f35095a = assetValueProvider;
        this.f35096b = adConfiguration;
        this.f35097c = impressionEventsObservable;
        this.f35098d = xw0Var;
        this.f35099e = nativeAdControllers;
        this.f35100f = mediaViewRenderController;
        this.f35101g = controlsProvider;
        this.f35102h = nx1Var;
    }

    public final vw0 a(CustomizableMediaView mediaView, ej0 imageProvider, c91 nativeMediaContent, j81 nativeForcePauseObserver) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(nativeForcePauseObserver, "nativeForcePauseObserver");
        sw0 sw0VarA = this.f35095a.a();
        xw0 xw0Var = this.f35098d;
        if (xw0Var != null) {
            return xw0Var.a(mediaView, this.f35096b, imageProvider, this.f35101g, this.f35097c, nativeMediaContent, nativeForcePauseObserver, this.f35099e, this.f35100f, this.f35102h, sw0VarA);
        }
        return null;
    }
}
